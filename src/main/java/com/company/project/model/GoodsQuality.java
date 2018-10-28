package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_quality")
public class GoodsQuality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "seller_nickname")
    private String sellerNickname;

    @Column(name = "platform_type")
    private String platformType;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_url")
    private String goodsUrl;

    @Column(name = "goods_pic_url")
    private String goodsPicUrl;

    @Column(name = "goods_price")
    private String goodsPrice;

    @Column(name = "income_rate")
    private String incomeRate;

    @Column(name = "discounts_denomination")
    private String discountsDenomination;

    @Column(name = "discounts_sell_price")
    private String discountsSellPrice;

    @Column(name = "discounts_number")
    private String discountsNumber;

    @Column(name = "discounts_remain_number")
    private String discountsRemainNumber;

    @Column(name = "discounts_begin_date")
    private String discountsBeginDate;

    @Column(name = "discounts_end_date")
    private String discountsEndDate;

    @Column(name = "discounts_generalize_url")
    private String discountsGeneralizeUrl;

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
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return seller_nickname
     */
    public String getSellerNickname() {
        return sellerNickname;
    }

    /**
     * @param sellerNickname
     */
    public void setSellerNickname(String sellerNickname) {
        this.sellerNickname = sellerNickname;
    }

    /**
     * @return platform_type
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * @param platformType
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType;
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
     * @return goods_pic_url
     */
    public String getGoodsPicUrl() {
        return goodsPicUrl;
    }

    /**
     * @param goodsPicUrl
     */
    public void setGoodsPicUrl(String goodsPicUrl) {
        this.goodsPicUrl = goodsPicUrl;
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
     * @return income_rate
     */
    public String getIncomeRate() {
        return incomeRate;
    }

    /**
     * @param incomeRate
     */
    public void setIncomeRate(String incomeRate) {
        this.incomeRate = incomeRate;
    }

    /**
     * @return discounts_denomination
     */
    public String getDiscountsDenomination() {
        return discountsDenomination;
    }

    /**
     * @param discountsDenomination
     */
    public void setDiscountsDenomination(String discountsDenomination) {
        this.discountsDenomination = discountsDenomination;
    }

    /**
     * @return discounts_sell_price
     */
    public String getDiscountsSellPrice() {
        return discountsSellPrice;
    }

    /**
     * @param discountsSellPrice
     */
    public void setDiscountsSellPrice(String discountsSellPrice) {
        this.discountsSellPrice = discountsSellPrice;
    }

    /**
     * @return discounts_number
     */
    public String getDiscountsNumber() {
        return discountsNumber;
    }

    /**
     * @param discountsNumber
     */
    public void setDiscountsNumber(String discountsNumber) {
        this.discountsNumber = discountsNumber;
    }

    /**
     * @return discounts_remain_number
     */
    public String getDiscountsRemainNumber() {
        return discountsRemainNumber;
    }

    /**
     * @param discountsRemainNumber
     */
    public void setDiscountsRemainNumber(String discountsRemainNumber) {
        this.discountsRemainNumber = discountsRemainNumber;
    }

    /**
     * @return discounts_begin_date
     */
    public String getDiscountsBeginDate() {
        return discountsBeginDate;
    }

    /**
     * @param discountsBeginDate
     */
    public void setDiscountsBeginDate(String discountsBeginDate) {
        this.discountsBeginDate = discountsBeginDate;
    }

    /**
     * @return discounts_end_date
     */
    public String getDiscountsEndDate() {
        return discountsEndDate;
    }

    /**
     * @param discountsEndDate
     */
    public void setDiscountsEndDate(String discountsEndDate) {
        this.discountsEndDate = discountsEndDate;
    }

    /**
     * @return discounts_generalize_url
     */
    public String getDiscountsGeneralizeUrl() {
        return discountsGeneralizeUrl;
    }

    /**
     * @param discountsGeneralizeUrl
     */
    public void setDiscountsGeneralizeUrl(String discountsGeneralizeUrl) {
        this.discountsGeneralizeUrl = discountsGeneralizeUrl;
    }
}