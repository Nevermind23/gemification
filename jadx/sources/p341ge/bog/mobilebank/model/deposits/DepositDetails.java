package p341ge.bog.mobilebank.model.deposits;

import java.math.BigDecimal;
import p380ck.C10463g;

/* renamed from: ge.bog.mobilebank.model.deposits.DepositDetails */
public class DepositDetails {
    public long accountKey;
    public String agrPurpose;
    public Long agrPurposeId;
    private long agreeKey;
    private String agreeNo;
    private BigDecimal casAmount;
    private String ccy;
    private long clientKey;
    public Long closeDate;
    public BigDecimal currentBalance;
    public String depositType;
    private String dictionaryKey;
    private BigDecimal intAccrued;
    private BigDecimal interestRate;
    private Long maturityDate;
    private String name;
    public String periodTypeNameDctKey;
    public BigDecimal pfmAcctBalance;
    private String prodType;
    private String purposeDictionaryKey;
    private String showCasAmount;
    private long startDate;
    private String status;
    private BigDecimal totalBalance;

    public long getAgreeKey() {
        return this.agreeKey;
    }

    public String getAgreeNo() {
        return this.agreeNo;
    }

    public BigDecimal getCasAmount() {
        return this.casAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public BigDecimal getIntAccrued() {
        BigDecimal bigDecimal = this.intAccrued;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        C10463g.m37989C("Deposit intAccrued was null");
        return new BigDecimal(0);
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public Long getMaturityDate() {
        return this.maturityDate;
    }

    public String getName() {
        return this.name;
    }

    public String getProdType() {
        return this.prodType;
    }

    public String getPurposeDictionaryKey() {
        return this.purposeDictionaryKey;
    }

    public String getShowCasAmount() {
        return this.showCasAmount;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public String getStatus() {
        return this.status;
    }

    public BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public void setAgreeKey(long j) {
        this.agreeKey = j;
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

    public void setMaturityDate(Long l) {
        this.maturityDate = l;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
