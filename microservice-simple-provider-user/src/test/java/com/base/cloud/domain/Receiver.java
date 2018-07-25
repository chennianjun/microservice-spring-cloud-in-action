package com.base.cloud.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by Subtimental on 2017-02-14.
 */
public class Receiver implements Serializable {
    private static final long serialVersionUID = 1098408376049150703L;
    /**
     * 收件人在合作商平台中的ID号
     */
    private String id;
    /**
     * 收件人姓名
     */
    @NotBlank(message = "收件人姓名不能为空")
    @Length(max = 32, message = "收件人姓名长度不合法")
    private String name;
    /**
     * 收件公司名
     */
    private String company;
    /**
     * 收件人手机号码
     */
    private String mobile;
    /**
     * 收件人电话号码
     */
    private String phone;
    /**
     * 收件人区域ID
     */
    private String area;
    /**
     * 收件人所在城市，逐级指定，用英文半角逗号分隔
     */
    @NotBlank(message = "收件人city不能为空")
    private String city;
    /**
     * 收件人路名门牌等地址信息
     */
    @NotBlank(message = "收件人address不能为空")
    @Length(max = 128, message = "收件人address长度不合法")
    private String address;
    /**
     * 收件人邮政编码
     */
    private String zipcode;
    /**
     * 收件人电子邮件
     */
    private String email;
    /**
     * 收件人即时通讯工具
     */
    private String im;

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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
                ", zipcode='" + zipcode + '\'' +
                ", email='" + email + '\'' +
                ", im='" + im + '\'' +
                '}';
    }
}
