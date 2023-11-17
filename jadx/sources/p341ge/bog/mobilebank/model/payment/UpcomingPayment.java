package p341ge.bog.mobilebank.model.payment;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.payment.UpcomingPayment */
public class UpcomingPayment {
    public static final String PROD_CODE_TYPE_COMMISSION = "COMMISSION_FEE";
    public static final String PROD_CODE_TYPE_PAWN = "PAWN_SHOP";
    public static final String PROD_GROUP_TYPE_ACCOUNT_OVERDRAFT = "ACCOUNT";
    public static final String PROD_GROUP_TYPE_AUTO_PAYMENT_OR_TRANSFER = "AUS";
    public static final String PROD_GROUP_TYPE_CREDIT_CARD_BILL = "CARD";
    public static final String PROD_GROUP_TYPE_CUSTOM_EVENT = "CALENDAR";
    public static final String PROD_GROUP_TYPE_INTREST = "FEE";
    public static final String PROD_GROUP_TYPE_LOAN = "LOAN";
    private BigDecimal amount;
    private String ccy;
    private Boolean isCustom;
    private String name;
    private Boolean overdueFlag;
    private Long payDate;
    private String payDateToDisplay;
    private String productDictionaryKey;
    private String productGroup;
    private Long productKey;
    private String productType;
    private String subProductCode;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public Boolean getCustom() {
        return this.isCustom;
    }

    public String getName() {
        return this.name;
    }

    public Long getPayDate() {
        return this.payDate;
    }

    public String getPayDateToDisplay() {
        return this.payDateToDisplay;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public String getProductGroup() {
        return this.productGroup;
    }

    public Long getProductKey() {
        return this.productKey;
    }

    public String getProductType() {
        return this.productType;
    }

    public String getSubProductCode() {
        return this.subProductCode;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setCustom(Boolean bool) {
        this.isCustom = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayDateToDisplay(String str) {
        this.payDateToDisplay = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public void setProductGroup(String str) {
        this.productGroup = str;
    }

    public void setProductKey(Long l) {
        this.productKey = l;
    }

    public void setProductType(String str) {
        this.productType = str;
    }

    public void setSubProductCode(String str) {
        this.subProductCode = str;
    }
}
