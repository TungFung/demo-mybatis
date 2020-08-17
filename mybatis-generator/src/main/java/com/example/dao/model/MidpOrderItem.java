package com.example.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "DS.MIDP_ORDER_ITEM")
public class MidpOrderItem {
    @Column(name = "ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "ORDER_NO")
    private Long orderNo;

    @Column(name = "ORDER_ITEM_NO")
    private Integer orderItemNo;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "SKU_ID")
    private Long skuId;

    @Column(name = "SKU_NAME")
    private String skuName;

    @Column(name = "SKU_PROPERTY")
    private String skuProperty;

    @Column(name = "SKU_IMAGE")
    private String skuImage;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "BARCODE")
    private String barcode;

    @Column(name = "MARKET_PRICE")
    private BigDecimal marketPrice;

    @Column(name = "SALE_QTY")
    private BigDecimal saleQty;

    @Column(name = "SALE_PRICE")
    private BigDecimal salePrice;

    @Column(name = "PROMO_PRICE")
    private BigDecimal promoPrice;

    @Column(name = "PROMO_DISCOUNT")
    private BigDecimal promoDiscount;

    @Column(name = "COUPON_DISCOUNT")
    private BigDecimal couponDiscount;

    @Column(name = "PAY_AMOUNT")
    private BigDecimal payAmount;

    @Column(name = "COUPON_AMOUNT")
    private BigDecimal couponAmount;

    @Column(name = "POINT_AMOUNT")
    private BigDecimal pointAmount;

    @Column(name = "PAY_DISCOUNT")
    private BigDecimal payDiscount;

    @Column(name = "MERCHANT_DISCOUNT")
    private BigDecimal merchantDiscount;

    @Column(name = "GIVE_POINT")
    private BigDecimal givePoint;

    @Column(name = "WEIGHT")
    private BigDecimal weight;

    @Column(name = "SALE_UNIT")
    private String saleUnit;

    @Column(name = "ITEM_TYPE")
    private Byte itemType;

    @Column(name = "SALE_TYPE")
    private Byte saleType;

    @Column(name = "ERP_CATEGORY")
    private String erpCategory;

    @Column(name = "SELLER_NO")
    private String sellerNo;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @Column(name = "UPDATED_AT")
    private Date updatedAt;

    @Column(name = "TIPS")
    private String tips;

    @Column(name = "INSERT_TIME")
    private Date insertTime;

    @Column(name = "SOURCE_DB")
    private String sourceDb;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return MEMBER_ID
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return ORDER_NO
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return ORDER_ITEM_NO
     */
    public Integer getOrderItemNo() {
        return orderItemNo;
    }

    /**
     * @param orderItemNo
     */
    public void setOrderItemNo(Integer orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    /**
     * @return PRODUCT_ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return SKU_ID
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * @param skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * @return SKU_NAME
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * @param skuName
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    /**
     * @return SKU_PROPERTY
     */
    public String getSkuProperty() {
        return skuProperty;
    }

    /**
     * @param skuProperty
     */
    public void setSkuProperty(String skuProperty) {
        this.skuProperty = skuProperty;
    }

    /**
     * @return SKU_IMAGE
     */
    public String getSkuImage() {
        return skuImage;
    }

    /**
     * @param skuImage
     */
    public void setSkuImage(String skuImage) {
        this.skuImage = skuImage;
    }

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return BARCODE
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * @return MARKET_PRICE
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return SALE_QTY
     */
    public BigDecimal getSaleQty() {
        return saleQty;
    }

    /**
     * @param saleQty
     */
    public void setSaleQty(BigDecimal saleQty) {
        this.saleQty = saleQty;
    }

    /**
     * @return SALE_PRICE
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return PROMO_PRICE
     */
    public BigDecimal getPromoPrice() {
        return promoPrice;
    }

    /**
     * @param promoPrice
     */
    public void setPromoPrice(BigDecimal promoPrice) {
        this.promoPrice = promoPrice;
    }

    /**
     * @return PROMO_DISCOUNT
     */
    public BigDecimal getPromoDiscount() {
        return promoDiscount;
    }

    /**
     * @param promoDiscount
     */
    public void setPromoDiscount(BigDecimal promoDiscount) {
        this.promoDiscount = promoDiscount;
    }

    /**
     * @return COUPON_DISCOUNT
     */
    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * @param couponDiscount
     */
    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * @return PAY_AMOUNT
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * @param payAmount
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * @return COUPON_AMOUNT
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * @param couponAmount
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * @return POINT_AMOUNT
     */
    public BigDecimal getPointAmount() {
        return pointAmount;
    }

    /**
     * @param pointAmount
     */
    public void setPointAmount(BigDecimal pointAmount) {
        this.pointAmount = pointAmount;
    }

    /**
     * @return PAY_DISCOUNT
     */
    public BigDecimal getPayDiscount() {
        return payDiscount;
    }

    /**
     * @param payDiscount
     */
    public void setPayDiscount(BigDecimal payDiscount) {
        this.payDiscount = payDiscount;
    }

    /**
     * @return MERCHANT_DISCOUNT
     */
    public BigDecimal getMerchantDiscount() {
        return merchantDiscount;
    }

    /**
     * @param merchantDiscount
     */
    public void setMerchantDiscount(BigDecimal merchantDiscount) {
        this.merchantDiscount = merchantDiscount;
    }

    /**
     * @return GIVE_POINT
     */
    public BigDecimal getGivePoint() {
        return givePoint;
    }

    /**
     * @param givePoint
     */
    public void setGivePoint(BigDecimal givePoint) {
        this.givePoint = givePoint;
    }

    /**
     * @return WEIGHT
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * @return SALE_UNIT
     */
    public String getSaleUnit() {
        return saleUnit;
    }

    /**
     * @param saleUnit
     */
    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    /**
     * @return ITEM_TYPE
     */
    public Byte getItemType() {
        return itemType;
    }

    /**
     * @param itemType
     */
    public void setItemType(Byte itemType) {
        this.itemType = itemType;
    }

    /**
     * @return SALE_TYPE
     */
    public Byte getSaleType() {
        return saleType;
    }

    /**
     * @param saleType
     */
    public void setSaleType(Byte saleType) {
        this.saleType = saleType;
    }

    /**
     * @return ERP_CATEGORY
     */
    public String getErpCategory() {
        return erpCategory;
    }

    /**
     * @param erpCategory
     */
    public void setErpCategory(String erpCategory) {
        this.erpCategory = erpCategory;
    }

    /**
     * @return SELLER_NO
     */
    public String getSellerNo() {
        return sellerNo;
    }

    /**
     * @param sellerNo
     */
    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    /**
     * @return CREATED_AT
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return UPDATED_AT
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return TIPS
     */
    public String getTips() {
        return tips;
    }

    /**
     * @param tips
     */
    public void setTips(String tips) {
        this.tips = tips;
    }

    /**
     * @return INSERT_TIME
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * @param insertTime
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * @return SOURCE_DB
     */
    public String getSourceDb() {
        return sourceDb;
    }

    /**
     * @param sourceDb
     */
    public void setSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
    }
}