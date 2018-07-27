package com.base.cloud.domain;

import java.io.Serializable;

/**
 * Created by Subtimental on 2017-02-14.
 */
public class Item implements Serializable{
    private static final long serialVersionUID = -2810023710088897000L;
    /**
     * 货品ID
     */
    private String id;
    /**
     * 货品名称
     */
    private String name;
    /**
     * 商品分类
     */
    private String category;
    /**
     * 商品材质
     */
    private String material;
    /**
     * 大小（长,宽,高）(单位：厘米), 用半角的逗号来分隔长宽高
     */
    private String size;
    /**
     * 重量（单位：千克)
     */
    private String weight;
    /**
     * 单价
     */
    private String unitPrice;
    /**
     * 商品链接
     */
    private String url;
    /**
     * 货品数量
     */
    private String quantity;
    /**
     * 货品备注
     */
    private String remark;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", url='" + url + '\'' +
                ", quantity='" + quantity + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
