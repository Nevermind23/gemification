package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.DepositBond */
public class DepositBond {
    private Long AcctKey;
    public String bondPdfUrl;
    private String ccy;
    private BigDecimal cdAmount;
    public Long cdGroupId;
    public String cdType;
    public String cdTypeDictionaryKey;
    private ArrayList<DepositBondDetails> cdsDetails;
    private long clientKey;
    private String currencyCode;
    public String dataSource;
    private String dictionaryKey;
    private BigDecimal discount;
    public String fileId;
    public String intWithPeriodType;
    public String intWithPeriodTypeKey;
    public String intWithPeriodTypeValue;
    private BigDecimal interestAccrued;
    private BigDecimal interestRate;
    private long issueDate;
    public String issuer;
    private BigDecimal marketValue;
    public BigDecimal marketValueBase;
    private long maturityDate;
    private BigDecimal nominalValue;
    private BigDecimal principalValueTotal;
    private String prodType;

    public Long getAcctKey() {
        return this.AcctKey;
    }

    public String getCcy() {
        return this.ccy;
    }

    public BigDecimal getCdAmount() {
        return this.cdAmount;
    }

    public ArrayList<DepositBondDetails> getCdsDetails() {
        return this.cdsDetails;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public BigDecimal getInterestAccrued() {
        return this.interestAccrued;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public long getIssueDate() {
        return this.issueDate;
    }

    public BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public long getMaturityDate() {
        return this.maturityDate;
    }

    public BigDecimal getNominalValue() {
        return this.nominalValue;
    }

    public BigDecimal getPrincipalValueTotal() {
        return this.principalValueTotal;
    }

    public String getProdType() {
        return this.prodType;
    }

    public void setAcctKey(Long l) {
        this.AcctKey = l;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setInterestRate(BigDecimal bigDecimal) {
        this.interestRate = bigDecimal;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }
}
