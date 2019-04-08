package com.mmall.pojo;

import java.util.Date;

public class Shipping {
    private Integer id;

    private Integer userId;

    private String receiverName;

    private String receicerPhone;

    private String receicerMobile;

    private String receicerProvince;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private Date createTime;

    private Date updateTime;

    public Shipping(Integer id, Integer userId, String receiverName, String receicerPhone, String receicerMobile, String receicerProvince, String receiverCity, String receiverDistrict, String receiverAddress, String receiverZip, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.receiverName = receiverName;
        this.receicerPhone = receicerPhone;
        this.receicerMobile = receicerMobile;
        this.receicerProvince = receicerProvince;
        this.receiverCity = receiverCity;
        this.receiverDistrict = receiverDistrict;
        this.receiverAddress = receiverAddress;
        this.receiverZip = receiverZip;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Shipping() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceicerPhone() {
        return receicerPhone;
    }

    public void setReceicerPhone(String receicerPhone) {
        this.receicerPhone = receicerPhone == null ? null : receicerPhone.trim();
    }

    public String getReceicerMobile() {
        return receicerMobile;
    }

    public void setReceicerMobile(String receicerMobile) {
        this.receicerMobile = receicerMobile == null ? null : receicerMobile.trim();
    }

    public String getReceicerProvince() {
        return receicerProvince;
    }

    public void setReceicerProvince(String receicerProvince) {
        this.receicerProvince = receicerProvince == null ? null : receicerProvince.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}