package com.base.cloud.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by Subtimental on 2017-02-14.
 */
public class Sender implements Serializable {
    private static final long serialVersionUID = -8708653469666920676L;
    /**
     * 发件人在合作商平台中的ID号
     */
    private String id;
    /**
     * 发件人姓名
     */
    @NotBlank(message = "发件人姓名不能为空")
    @Length(max = 32, message = "发件人姓名长度不合法")
    private String name;
    /**
     * 发件公司名
     */
    private String company;
    /**
     * 发件人手机号码
     */
    private String mobile;
    /**
     * 发件人电话号码
     */
    private String phone;
    /**
     * 发件人区域ID
     */
    private String area;
    /**
     * 发件人所在城市，必须逐级指定，用英文半角逗号分隔，目前至少需要指定到区县级，如能往下精确更好，如“上海市,上海市,青浦区,华新镇,华志路,123号”
     */
    @NotBlank(message = "发件人city不能为空")
    private String city;
    /**
     * 发件人路名门牌等地址信息
     */
    @NotBlank(message = "发件人address不能为空")
    @Length(max = 128, message = "发件人address长度不合法")
    private String address;
    /**
     * 发件人邮政编码
     */
    private String zipCode;
    /**
     * 发件人电子邮件
     */
    private String email;
    /**
     * 发件人即时通讯工具
     */
    private String im;
    /**
     * 取件起始时间
     */
    private String startTime;
    /**
     * 取件截至时间
     */
    private String endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", mobile='" + mobile + '\'' +
                ", phone='" + phone + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", email='" + email + '\'' +
                ", im='" + im + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
