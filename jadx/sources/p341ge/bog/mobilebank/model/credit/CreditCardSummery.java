package p341ge.bog.mobilebank.model.credit;

import java.math.BigDecimal;
import java.util.ArrayList;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.credit.CreditCardSummery */
public class CreditCardSummery {
    @C8664c("acctKey")
    private Long acctKey;
    @C8664c("acctName")
    public String acctName;
    @C8664c("amount")
    public BigDecimal amount;
    @C8664c("availableAmount")
    public BigDecimal availableAmount;
    @C8664c("cardSubProduct")
    public String cardSubProduct;
    @C8664c("cardSubProductGroupList")
    public ArrayList<String> cardSubProductGroupList;
    @C8664c("cardSubProductGroups")
    public ArrayList<String> cardSubProductGroups;
    @C8664c("cardTypeList")
    public ArrayList<String> cardTypeList;
    @C8664c("cardTypes")
    public String cardTypes;
    @C8664c("ccy")
    public String ccy;
    private boolean hasCashback;
    private boolean hasInstallment;
    private boolean hasMR;
    @C8664c("nameDictionaryKey")
    public String nameDictionaryKey;
    @C8664c("orderNo")
    public int orderNo;
    @C8664c("printAcctNo")
    public String printAcctNo;
    @C8664c("productCode")
    public String productCode;
    @C8664c("productDictionaryKey")
    public String productDictionaryKey;

    public Long getAcctKey() {
        return this.acctKey;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public void setAcctKey(Long l) {
        this.acctKey = l;
    }

    public void setAcctName(String str) {
        this.acctName = str;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setAvailableAmount(BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
