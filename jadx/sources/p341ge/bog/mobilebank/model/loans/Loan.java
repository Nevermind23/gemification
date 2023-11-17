package p341ge.bog.mobilebank.model.loans;

import java.math.BigDecimal;
import java.util.ArrayList;
import l50.C25838r;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.loans.Loan */
public class Loan {
    private static final String PROD_TYPE_MORTGAGE = "Mortgage loan";
    @C8664c("acctRef")
    public AcctRefEntity acctRef;
    @C8664c("amount")
    private BigDecimal amount;
    private String attachmentUrl;
    @C8664c("bcAmount")
    public BigDecimal bcAmount;
    @C8664c("ccy")
    private String ccy;
    private LoanDetailsWrapper details;
    @C8664c("installmentFlag")
    public String installmentFlag;
    private ArrayList<C25838r> loanCards;
    @C8664c("loanKey")
    private long loanKey;
    @C8664c("loanName")
    private String loanName;
    @C8664c("loanType")
    private String loanType;
    @C8664c("prodType")
    private String prodType;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    private ArrayList<String> productFunctions;
    private long productId;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public String getCcy() {
        return this.ccy;
    }

    public LoanDetailsWrapper getDetails() {
        return this.details;
    }

    public ArrayList<C25838r> getLoanCards() {
        return this.loanCards;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public String getLoanName() {
        return this.loanName;
    }

    public String getLoanType() {
        return this.loanType;
    }

    public String getProdType() {
        return this.prodType;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public ArrayList<String> getProductFunctions() {
        return this.productFunctions;
    }

    public long getProductId() {
        return this.productId;
    }

    public boolean hasInstallmentFlag() {
        return this.installmentFlag.equals("Y");
    }

    public boolean isLnd() {
        return this.loanType.equals("LND");
    }

    public boolean isMortgage() {
        return getProdType() != null && getProdType().equals(PROD_TYPE_MORTGAGE);
    }

    public boolean isPln() {
        return this.loanType.equals("PLN");
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDetails(LoanDetailsWrapper loanDetailsWrapper) {
        this.details = loanDetailsWrapper;
    }

    public void setLoanCards(ArrayList<C25838r> arrayList) {
        this.loanCards = arrayList;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }

    public void setLoanName(String str) {
        this.loanName = str;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
