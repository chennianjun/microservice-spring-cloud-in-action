package com.base.cloud.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

public class SubmitEntity implements Serializable {
    /**
     * 订单号，由合作商平台产生，具有平台唯一性
     */
    @NotBlank(message = "订单号id不能为空")
    @Length(max = 64, message = "订单号id长度不合法")
    private String id;
    /**
     * 订单类型ID：默认为1 如果不传或者传空自动为1
     */
    private String typeId;
    /**
     * 订单类型名称
     */
    private String type;
    /**
     * 交易号，由合作商平台产生。
     */
    private String tradeId;
    /**
     * 运单号，如下单时已有，请提供。
     */
    private String mailNo;
    /**
     * 网点编码
     */
    private String branchId;
    /**
     * 卖家，最好是卖家ID
     */
    private String seller;
    /**
     * 买家，最好是买家ID
     */
    private String buyer;
    /**
     * 发件人信息
     */
    @Valid
    @NotNull(message = "发件人信息不能为空")
    private Sender sender;
    /**
     * 收件人信息
     */
    @Valid
    @NotNull(message = "收件人信息不能为空")
    private Receiver receiver;
    /**
     * 货品信息
     */
    private List<Item> items;
    /**
     * 订单总重量 （千克）
     */
    private double weight;
    /**
     * 订单包裹大小（厘米）, 用半角的逗号来分隔长宽高
     */
    private String size;
    /**
     * 订单包裹内货物总数量
     */
    private String quantity;
    /**
     * 订单包裹中商品总价值
     */
    private double price;
    /**
     * 运输费
     */
    private double freight;
    /**
     * 保险费
     */
    private double premium;
    /**
     * 包装费
     */
    private double packCharges;
    /**
     * 其他费用
     */
    private double otherCharges;
    /**
     * 订单总金额
     */
    private double orderSum;
    /**
     * 到达收取币种
     */
    private String collectMoneytype;
    /**
     * 到达收取金额，一般代收货款或者到付件才需指定
     */
    private String collectSum;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * true(默认为需要获取大头笔信息)
     */
    private Boolean isRemark;

    private String orderType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId == null ? "1" : typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getMailNo() {
        return mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getPackCharges() {
        return packCharges;
    }

    public void setPackCharges(double packCharges) {
        this.packCharges = packCharges;
    }

    public double getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public double getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(double orderSum) {
        this.orderSum = orderSum;
    }

    public String getCollectMoneytype() {
        return collectMoneytype;
    }

    public void setCollectMoneytype(String collectMoneytype) {
        this.collectMoneytype = collectMoneytype;
    }

    public String getCollectSum() {
        return collectSum;
    }

    public void setCollectSum(String collectSum) {
        this.collectSum = collectSum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean isRemark() {
        return isRemark == null ? true : false;
    }

    public void setRemark(Boolean remark) {
        isRemark = remark;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", typeId='" + typeId + '\'' +
                ", type='" + type + '\'' +
                ", tradeId='" + tradeId + '\'' +
                ", mailNo='" + mailNo + '\'' +
                ", branchId='" + branchId + '\'' +
                ", seller='" + seller + '\'' +
                ", buyer='" + buyer + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", items=" + items +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price=" + price +
                ", freight=" + freight +
                ", premium=" + premium +
                ", packCharges=" + packCharges +
                ", otherCharges=" + otherCharges +
                ", orderSum=" + orderSum +
                ", collectMoneytype='" + collectMoneytype + '\'' +
                ", collectSum='" + collectSum + '\'' +
                ", remark='" + remark + '\'' +
                ", isRemark=" + isRemark +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}
