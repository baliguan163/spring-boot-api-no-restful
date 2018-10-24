package com.company.project.model;

import javax.persistence.*;

@Table(name = "choiceness_goods_list")
public class ChoicenessGoodsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_url")
    private String goodsUrl;

    @Column(name = "goods_detail_url")
    private String goodsDetailUrl;

    @Column(name = "goods_1_category")
    private String goods1Category;

    @Column(name = "tao_bao_ke_url")
    private String taoBaoKeUrl;

    @Column(name = "goods_price")
    private String goodsPrice;

    @Column(name = "monthl_sales_volume")
    private String monthlSalesVolume;

    @Column(name = "income_rate")
    private String incomeRate;

    private String commission;

    @Column(name = "seller_wang_wang")
    private String sellerWangWang;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "platform_type")
    private String platformType;

    @Column(name = "discount_coupon_id")
    private String discountCouponId;

    @Column(name = "discount_coupon_sum")
    private String discountCouponSum;

    @Column(name = "discount_coupon_residue")
    private String discountCouponResidue;

    private String denomination;

    @Column(name = "discount_coupon_begin_date")
    private String discountCouponBeginDate;

    @Column(name = "discount_coupon_end_date")
    private String discountCouponEndDate;

    @Column(name = "generalize_url")
    private String generalizeUrl;

    @Column(name = "discount_coupon_generalize_url")
    private String discountCouponGeneralizeUrl;

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
     * @return goods_detail_url
     */
    public String getGoodsDetailUrl() {
        return goodsDetailUrl;
    }

    /**
     * @param goodsDetailUrl
     */
    public void setGoodsDetailUrl(String goodsDetailUrl) {
        this.goodsDetailUrl = goodsDetailUrl;
    }

    /**
     * @return goods_1_category
     */
    public String getGoods1Category() {
        return goods1Category;
    }

    /**
     * @param goods1Category
     */
    public void setGoods1Category(String goods1Category) {
        this.goods1Category = goods1Category;
    }

    /**
     * @return tao_bao_ke_url
     */
    public String getTaoBaoKeUrl() {
        return taoBaoKeUrl;
    }

    /**
     * @param taoBaoKeUrl
     */
    public void setTaoBaoKeUrl(String taoBaoKeUrl) {
        this.taoBaoKeUrl = taoBaoKeUrl;
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
     * @return monthl_sales_volume
     */
    public String getMonthlSalesVolume() {
        return monthlSalesVolume;
    }

    /**
     * @param monthlSalesVolume
     */
    public void setMonthlSalesVolume(String monthlSalesVolume) {
        this.monthlSalesVolume = monthlSalesVolume;
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
     * @return commission
     */
    public String getCommission() {
        return commission;
    }

    /**
     * @param commission
     */
    public void setCommission(String commission) {
        this.commission = commission;
    }

    /**
     * @return seller_wang_wang
     */
    public String getSellerWangWang() {
        return sellerWangWang;
    }

    /**
     * @param sellerWangWang
     */
    public void setSellerWangWang(String sellerWangWang) {
        this.sellerWangWang = sellerWangWang;
    }

    /**
     * @return seller_id
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * @return shop_name
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * @param shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
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
     * @return discount_coupon_id
     */
    public String getDiscountCouponId() {
        return discountCouponId;
    }

    /**
     * @param discountCouponId
     */
    public void setDiscountCouponId(String discountCouponId) {
        this.discountCouponId = discountCouponId;
    }

    /**
     * @return discount_coupon_sum
     */
    public String getDiscountCouponSum() {
        return discountCouponSum;
    }

    /**
     * @param discountCouponSum
     */
    public void setDiscountCouponSum(String discountCouponSum) {
        this.discountCouponSum = discountCouponSum;
    }

    /**
     * @return discount_coupon_residue
     */
    public String getDiscountCouponResidue() {
        return discountCouponResidue;
    }

    /**
     * @param discountCouponResidue
     */
    public void setDiscountCouponResidue(String discountCouponResidue) {
        this.discountCouponResidue = discountCouponResidue;
    }

    /**
     * @return denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * @param denomination
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    /**
     * @return discount_coupon_begin_date
     */
    public String getDiscountCouponBeginDate() {
        return discountCouponBeginDate;
    }

    /**
     * @param discountCouponBeginDate
     */
    public void setDiscountCouponBeginDate(String discountCouponBeginDate) {
        this.discountCouponBeginDate = discountCouponBeginDate;
    }

    /**
     * @return discount_coupon_end_date
     */
    public String getDiscountCouponEndDate() {
        return discountCouponEndDate;
    }

    /**
     * @param discountCouponEndDate
     */
    public void setDiscountCouponEndDate(String discountCouponEndDate) {
        this.discountCouponEndDate = discountCouponEndDate;
    }

    /**
     * @return generalize_url
     */
    public String getGeneralizeUrl() {
        return generalizeUrl;
    }

    /**
     * @param generalizeUrl
     */
    public void setGeneralizeUrl(String generalizeUrl) {
        this.generalizeUrl = generalizeUrl;
    }

    /**
     * @return discount_coupon_generalize_url
     */
    public String getDiscountCouponGeneralizeUrl() {
        return discountCouponGeneralizeUrl;
    }

    /**
     * @param discountCouponGeneralizeUrl
     */
    public void setDiscountCouponGeneralizeUrl(String discountCouponGeneralizeUrl) {
        this.discountCouponGeneralizeUrl = discountCouponGeneralizeUrl;
    }
}