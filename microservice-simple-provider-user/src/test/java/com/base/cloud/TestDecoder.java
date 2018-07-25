package com.base.cloud;

import com.base.cloud.domain.Receiver;
import com.base.cloud.domain.Sender;

import java.lang.reflect.Field;

public class TestDecoder {
    public static String decode(String str) {
        String[] tmp = str.split(";&#|&#|;");
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].matches("\\d{5}")) {
                sb.append((char) Integer.parseInt(tmp[i]));
            } else {
                sb.append(tmp[i]);
            }
        }
        return sb.toString();
    }

    public static <T> T decoderUser(T t) {
        try {
            if (t == null || "".equals(t)) {
                return t;
            }
            Field[] declaredFields = t.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object value = field.get(t);
                if (value != null || !"".equals(value)) {
                    if (value instanceof String) {
                        String stringValue = (String) value;
                        String decodeValue = decode(stringValue);
                        field.set(t, decodeValue);
                    } else if (value instanceof Sender || value instanceof Receiver) {
                        Field[] subFields = value.getClass().getDeclaredFields();
                        for (Field subField : subFields) {
                            subField.setAccessible(true);
                            Object subValue = subField.get(value);
                            if (subValue != null || !"".equals(subValue)) {
                                if (subValue instanceof String) {
                                    String stringValue = (String) value;
                                    String decodeValue = decode(stringValue);
                                    field.set(value, decodeValue);
                                }
                            }
                        }
                    }
                }
            }
            return t;
        } catch (Exception e) {
            return t;
        }
    }


}
