package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_groupbuying")
public class GoodsGroupbuying {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_price")
    private String goodsPrice;

    @Column(name = "group_purchase_price")
    private String groupPurchasePrice;

    @Column(name = "group_purchase_number")
    private String groupPurchaseNumber;

    @Column(name = "goods_url")
    private String goodsUrl;

    @Column(name = "goods_begin_date")
    private String goodsBeginDate;

    @Column(name = "goods_end_date")
    private String goodsEndDate;

    @Column(name = "inventory_number")
    private String inventoryNumber;

    @Column(name = "sold_number")
    private String soldNumber;

    @Column(name = "remain_number")
    private String remainNumber;

    @Column(name = "generalize_long_url")
    private String generalizeLongUrl;

    @Column(name = "generalize_short_url")
    private String generalizeShortUrl;

    @Column(name = "commission_rate")
    private String commissionRate;

    @Column(name = "commission_price")
    private String commissionPrice;

    @Column(name = "primary_categories_id")
    private String primaryCategoriesId;

    @Column(name = "primary_categories_name")
    private String primaryCategoriesName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return goods_id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * @return goods_name
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * @param goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * @return goods_price
     */
    public String getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * @param goodsPrice
     */
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * @return group_purchase_price
     */
    public String getGroupPurchasePrice() {
        return groupPurchasePrice;
    }

    /**
     * @param groupPurchasePrice
     */
    public void setGroupPurchasePrice(String groupPurchasePrice) {
        this.groupPurchasePrice = groupPurchasePrice;
    }

    /**
     * @return group_purchase_number
     */
    public String getGroupPurchaseNumber() {
        return groupPurchaseNumber;
    }

    /**
     * @param groupPurchaseNumber
     */
    public void setGroupPurchaseNumber(String groupPurchaseNumber) {
        this.groupPurchaseNumber = groupPurchaseNumber;
    }

    /**
     * @return goods_url
     */
    public String getGoodsUrl() {
        return goodsUrl;
    }

    /**
     * @param goodsUrl
     */
    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    /**
     * @return goods_begin_date
     */
    public String getGoodsBeginDate() {
        return goodsBeginDate;
    }

    /**
     * @param goodsBeginDate
     */
    public void setGoodsBeginDate(String goodsBeginDate) {
        this.goodsBeginDate = goodsBeginDate;
    }

    /**
     * @return goods_end_date
     */
    public String getGoodsEndDate() {
        return goodsEndDate;
    }

    /**
     * @param goodsEndDate
     */
    public void setGoodsEndDate(String goodsEndDate) {
        this.goodsEndDate = goodsEndDate;
    }

    /**
     * @return inventory_number
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /**
     * @param inventoryNumber
     */
    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    /**
     * @return sold_number
     */
    public String getSoldNumber() {
        return soldNumber;
    }

    /**
     * @param soldNumber
     */
    public void setSoldNumber(String soldNumber) {
        this.soldNumber = soldNumber;
    }

    /**
     * @return remain_number
     */
    public String getRemainNumber() {
        return remainNumber;
    }

    /**
     * @param remainNumber
     */
    public void setRemainNumber(String remainNumber) {
        this.remainNumber = remainNumber;
    }

    /**
     * @return generalize_long_url
     */
    public String getGeneralizeLongUrl() {
        return generalizeLongUrl;
    }

    /**
     * @param generalizeLongUrl
     */
    public void setGeneralizeLongUrl(String generalizeLongUrl) {
        this.generalizeLongUrl = generalizeLongUrl;
    }

    /**
     * @return generalize_short_url
     */
    public String getGeneralizeShortUrl() {
        return generalizeShortUrl;
    }

    /**
     * @param generalizeShortUrl
     */
    public void setGeneralizeShortUrl(String generalizeShortUrl) {
        this.generalizeShortUrl = generalizeShortUrl;
    }

    /**
     * @return commission_rate
     */
    public String getCommissionRate() {
        return commissionRate;
    }

    /**
     * @param commissionRate
     */
    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * @return commission_price
     */
    public String getCommissionPrice() {
        return commissionPrice;
    }

    /**
     * @param commissionPrice
     */
    public void setCommissionPrice(String commissionPrice) {
        this.commissionPrice = commissionPrice;
    }

    /**
     * @return primary_categories_id
     */
    public String getPrimaryCategoriesId() {
        return primaryCategoriesId;
    }

    /**
     * @param primaryCategoriesId
     */
    public void setPrimaryCategoriesId(String primaryCategoriesId) {
        this.primaryCategoriesId = primaryCategoriesId;
    }

    /**
     * @return primary_categories_name
     */
    public String getPrimaryCategoriesName() {
        return primaryCategoriesName;
    }

    /**
     * @param primaryCategoriesName
     */
    public void setPrimaryCategoriesName(String primaryCategoriesName) {
        this.primaryCategoriesName = primaryCategoriesName;
    }
}