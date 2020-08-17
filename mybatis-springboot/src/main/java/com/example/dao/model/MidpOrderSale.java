package com.example.dao.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "DS.MIDP_ORDER_SALE")
public class MidpOrderSale {
    @Column(name = "ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "BATCH_NO")
    private Long batchNo;

    @Column(name = "ORDER_NO")
    private Long orderNo;

    @Column(name = "ORDER_TYPE")
    private Byte orderType;

    @Column(name = "SALE_CHANNEL")
    private Byte saleChannel;

    @Column(name = "ORDER_STATUS")
    private Short orderStatus;

    @Column(name = "SUB_STATUS")
    private Byte subStatus;

    @Column(name = "RETURN_STATUS")
    private Byte returnStatus;

    @Column(name = "PAY_STATUS")
    private Byte payStatus;

    @Column(name = "LOGISTICS_STATUS")
    private Short logisticsStatus;

    @Column(name = "TOTAL_PRODUCT_PRICE")
    private BigDecimal totalProductPrice;

    @Column(name = "TOTAL_PROMO_DISCOUNT")
    private BigDecimal totalPromoDiscount;

    @Column(name = "TOTAL_COUPON_DISCOUNT")
    private BigDecimal totalCouponDiscount;

    @Column(name = "FREIGHT")
    private BigDecimal freight;

    @Column(name = "FREIGHT_DISCOUNT")
    private BigDecimal freightDiscount;

    @Column(name = "TOTAL_PAY_AMOUNT")
    private BigDecimal totalPayAmount;

    @Column(name = "TOTAL_COUPON_AMOUNT")
    private BigDecimal totalCouponAmount;

    @Column(name = "TOTAL_POINT_AMOUNT")
    private BigDecimal totalPointAmount;

    @Column(name = "TOTAL_USE_POINT")
    private BigDecimal totalUsePoint;

    @Column(name = "REAL_PAY_AMOUNT")
    private BigDecimal realPayAmount;

    @Column(name = "TOTAL_GIVE_POINT")
    private BigDecimal totalGivePoint;

    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    @Column(name = "ORDER_TIME")
    private Date orderTime;

    @Column(name = "PAY_TIME")
    private Date payTime;

    @Column(name = "FINISH_TIME")
    private Date finishTime;

    @Column(name = "AUDIT_TIME")
    private Date auditTime;

    @Column(name = "AUDITOR")
    private String auditor;

    @Column(name = "REGION_CODE")
    private String regionCode;

    @Column(name = "CORPORATION_CODE")
    private String corporationCode;

    @Column(name = "CORPORATION_NAME")
    private String corporationName;

    @Column(name = "STORE_CODE")
    private String storeCode;

    @Column(name = "STORE_NAME")
    private String storeName;

    @Column(name = "INVOICE_TYPE")
    private Byte invoiceType;

    @Column(name = "INVOICE_STATUS")
    private Byte invoiceStatus;

    @Column(name = "VIRTUAL_MEMBER")
    private Byte virtualMember;

    @Column(name = "SENT_YELLOW_RECEIPT")
    private Byte sentYellowReceipt;

    @Column(name = "DELETED")
    private Byte deleted;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "CREATED_AT")
    private Date createdAt;

    @Column(name = "UPDATED_AT")
    private Date updatedAt;

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
     * @return BATCH_NO
     */
    public Long getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo
     */
    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
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
     * @return ORDER_TYPE
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * @param orderType
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * @return SALE_CHANNEL
     */
    public Byte getSaleChannel() {
        return saleChannel;
    }

    /**
     * @param saleChannel
     */
    public void setSaleChannel(Byte saleChannel) {
        this.saleChannel = saleChannel;
    }

    /**
     * @return ORDER_STATUS
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * @return SUB_STATUS
     */
    public Byte getSubStatus() {
        return subStatus;
    }

    /**
     * @param subStatus
     */
    public void setSubStatus(Byte subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * @return RETURN_STATUS
     */
    public Byte getReturnStatus() {
        return returnStatus;
    }

    /**
     * @param returnStatus
     */
    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    /**
     * @return PAY_STATUS
     */
    public Byte getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus
     */
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return LOGISTICS_STATUS
     */
    public Short getLogisticsStatus() {
        return logisticsStatus;
    }

    /**
     * @param logisticsStatus
     */
    public void setLogisticsStatus(Short logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    /**
     * @return TOTAL_PRODUCT_PRICE
     */
    public BigDecimal getTotalProductPrice() {
        return totalProductPrice;
    }

    /**
     * @param totalProductPrice
     */
    public void setTotalProductPrice(BigDecimal totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    /**
     * @return TOTAL_PROMO_DISCOUNT
     */
    public BigDecimal getTotalPromoDiscount() {
        return totalPromoDiscount;
    }

    /**
     * @param totalPromoDiscount
     */
    public void setTotalPromoDiscount(BigDecimal totalPromoDiscount) {
        this.totalPromoDiscount = totalPromoDiscount;
    }

    /**
     * @return TOTAL_COUPON_DISCOUNT
     */
    public BigDecimal getTotalCouponDiscount() {
        return totalCouponDiscount;
    }

    /**
     * @param totalCouponDiscount
     */
    public void setTotalCouponDiscount(BigDecimal totalCouponDiscount) {
        this.totalCouponDiscount = totalCouponDiscount;
    }

    /**
     * @return FREIGHT
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * @param freight
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * @return FREIGHT_DISCOUNT
     */
    public BigDecimal getFreightDiscount() {
        return freightDiscount;
    }

    /**
     * @param freightDiscount
     */
    public void setFreightDiscount(BigDecimal freightDiscount) {
        this.freightDiscount = freightDiscount;
    }

    /**
     * @return TOTAL_PAY_AMOUNT
     */
    public BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }

    /**
     * @param totalPayAmount
     */
    public void setTotalPayAmount(BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    /**
     * @return TOTAL_COUPON_AMOUNT
     */
    public BigDecimal getTotalCouponAmount() {
        return totalCouponAmount;
    }

    /**
     * @param totalCouponAmount
     */
    public void setTotalCouponAmount(BigDecimal totalCouponAmount) {
        this.totalCouponAmount = totalCouponAmount;
    }

    /**
     * @return TOTAL_POINT_AMOUNT
     */
    public BigDecimal getTotalPointAmount() {
        return totalPointAmount;
    }

    /**
     * @param totalPointAmount
     */
    public void setTotalPointAmount(BigDecimal totalPointAmount) {
        this.totalPointAmount = totalPointAmount;
    }

    /**
     * @return TOTAL_USE_POINT
     */
    public BigDecimal getTotalUsePoint() {
        return totalUsePoint;
    }

    /**
     * @param totalUsePoint
     */
    public void setTotalUsePoint(BigDecimal totalUsePoint) {
        this.totalUsePoint = totalUsePoint;
    }

    /**
     * @return REAL_PAY_AMOUNT
     */
    public BigDecimal getRealPayAmount() {
        return realPayAmount;
    }

    /**
     * @param realPayAmount
     */
    public void setRealPayAmount(BigDecimal realPayAmount) {
        this.realPayAmount = realPayAmount;
    }

    /**
     * @return TOTAL_GIVE_POINT
     */
    public BigDecimal getTotalGivePoint() {
        return totalGivePoint;
    }

    /**
     * @param totalGivePoint
     */
    public void setTotalGivePoint(BigDecimal totalGivePoint) {
        this.totalGivePoint = totalGivePoint;
    }

    /**
     * @return TOTAL_AMOUNT
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return ORDER_TIME
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return PAY_TIME
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * @return FINISH_TIME
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * @return AUDIT_TIME
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * @param auditTime
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * @return AUDITOR
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * @param auditor
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    /**
     * @return REGION_CODE
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * @return CORPORATION_CODE
     */
    public String getCorporationCode() {
        return corporationCode;
    }

    /**
     * @param corporationCode
     */
    public void setCorporationCode(String corporationCode) {
        this.corporationCode = corporationCode;
    }

    /**
     * @return CORPORATION_NAME
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * @param corporationName
     */
    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    /**
     * @return STORE_CODE
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * @param storeCode
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * @return STORE_NAME
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * @return INVOICE_TYPE
     */
    public Byte getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType
     */
    public void setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * @return INVOICE_STATUS
     */
    public Byte getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * @param invoiceStatus
     */
    public void setInvoiceStatus(Byte invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * @return VIRTUAL_MEMBER
     */
    public Byte getVirtualMember() {
        return virtualMember;
    }

    /**
     * @param virtualMember
     */
    public void setVirtualMember(Byte virtualMember) {
        this.virtualMember = virtualMember;
    }

    /**
     * @return SENT_YELLOW_RECEIPT
     */
    public Byte getSentYellowReceipt() {
        return sentYellowReceipt;
    }

    /**
     * @param sentYellowReceipt
     */
    public void setSentYellowReceipt(Byte sentYellowReceipt) {
        this.sentYellowReceipt = sentYellowReceipt;
    }

    /**
     * @return DELETED
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * @return VERSION
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
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