package com.dhy.lab.sort;

import java.util.Date;

public class CarDealerInfo {

    /**
     * 车商名称
     */
    private String dealerName;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 车商类型1:加盟店; 2:直营店; 3:认证店'
     */
    private Integer joinType;

    /**
     * 创建时间
     */
    private Date creatTime;


    public CarDealerInfo(String dealerName, String provinceName, String cityName, Integer joinType, Date creatTime) {
        this.dealerName = dealerName;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.joinType = joinType;
        this.creatTime = creatTime;
    }

    public CarDealerInfo(String dealerName, String provinceName, String cityName, Integer joinType) {
        this.dealerName = dealerName;
        this.provinceName = provinceName;
        this.cityName = cityName;
        this.joinType = joinType;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getJoinType() {
        return joinType;
    }

    public void setJoinType(Integer joinType) {
        this.joinType = joinType;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
