package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LoanApiModel */
public final class LoanApiModel {
    private final AcctRefEntity acctRef;
    @C8664c("amount")
    private final BigDecimal amount;
    private final String attachmentUrl;
    @C8664c("bcAmount")
    private final BigDecimal bcAmount;
    @C8664c("ccy")
    private final String ccy;
    @C8664c("installmentFlag")
    private final String installmentFlag;
    @C8664c("loanKey")
    private final long loanKey;
    @C8664c("loanName")
    private final String loanName;
    @C8664c("loanType")
    private final String loanType;
    @C8664c("prodType")
    private final String prodType;
    @C8664c("productDictionaryKey")
    private final String productDictionaryKey;
    private final String productDictionaryValue;
    private final List<String> productFunctions;
    private final long productId;
    private final String subProductCode;

    public LoanApiModel(long j, String str, BigDecimal bigDecimal, String str2, String str3, BigDecimal bigDecimal2, String str4, String str5, String str6, List<String> list, String str7, long j2, String str8, String str9, AcctRefEntity acctRefEntity) {
        C41536l.m120489i(list, "productFunctions");
        this.loanKey = j;
        this.prodType = str;
        this.amount = bigDecimal;
        this.loanName = str2;
        this.ccy = str3;
        this.bcAmount = bigDecimal2;
        this.loanType = str4;
        this.productDictionaryKey = str5;
        this.installmentFlag = str6;
        this.productFunctions = list;
        this.attachmentUrl = str7;
        this.productId = j2;
        this.productDictionaryValue = str8;
        this.subProductCode = str9;
        this.acctRef = acctRefEntity;
    }

    public final AcctRefEntity getAcctRef() {
        return this.acctRef;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public final BigDecimal getBcAmount() {
        return this.bcAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getInstallmentFlag() {
        return this.installmentFlag;
    }

    public final long getLoanKey() {
        return this.loanKey;
    }

    public final String getLoanName() {
        return this.loanName;
    }

    public final String getLoanType() {
        return this.loanType;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final String getProductDictionaryValue() {
        return this.productDictionaryValue;
    }

    public final List<String> getProductFunctions() {
        return this.productFunctions;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }
}
