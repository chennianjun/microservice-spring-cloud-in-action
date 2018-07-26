package com.base.cloud.controller;

import com.base.cloud.service.AggregationService;
import com.base.cloud.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import rx.Observable;
import rx.Observer;

import java.util.HashMap;

@RestController
public class AggregationController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AggregationService aggregationService;

    @GetMapping("/aggregation/{id}")
    public DeferredResult<HashMap<String, User>> aggregation(@PathVariable Long id) {
        Observable<HashMap<String, User>> aggregation = this.aggregationObserver(id);
        return toDeferredResult(aggregation);
    }

    public Observable<HashMap<String, User>> aggregationObserver(Long id) {
        return Observable.zip(this.aggregationService.getUserById(id), this.aggregationService.getMovieUserById(id), (user, movieUser) -> {
            HashMap<String, User> map = new HashMap<>();
            map.put("user", user);
            map.put("movieUser", movieUser);
            return map;
        });
    }

    public DeferredResult<HashMap<String, User>> toDeferredResult(Observable<HashMap<String, User>> hashMapObservable) {
        DeferredResult<HashMap<String, User>> result = new DeferredResult<>();
        hashMapObservable.subscribe(new Observer<HashMap<String, User>>() {
            @Override
            public void onCompleted() {
                logger.info("完成....");
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("发生错误....", throwable);
            }

            @Override
            public void onNext(HashMap<String, User> stringUserHashMap) {
                result.setResult(stringUserHashMap);
            }
        });
        return result;
    }

}
