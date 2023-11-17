package p341ge.bog.mobilebank.model.deposits;

import java.math.BigDecimal;
import java.util.ArrayList;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.CurrencyWrapper;
import p380ck.C10463g;

/* renamed from: ge.bog.mobilebank.model.deposits.DepositMaximaWrapper */
public class DepositMaximaWrapper {
    private long agreeKey;
    @C8664c("agreeNo")
    private String agreeNo;
    @C8664c("availableAmounts")
    private ArrayList<CurrencyWrapper> availableAmounts;
    @C8664c("ccy")
    private String ccy;
    @C8664c("detailsInfo")
    private ArrayList<DepositMaximaDetailsInfo> detailsInfo;
    @C8664c("dictionaryKey")
    private String dictionaryKey;
    private BigDecimal intAccrued;
    @C8664c("name")
    private String name;
    @C8664c("startDate")
    private long startDate;

    public long getAgreeKey() {
        return this.agreeKey;
    }

    public String getAgreeNo() {
        return this.agreeNo;
    }

    public String getCcy() {
        return this.ccy;
    }

    public ArrayList<DepositMaximaDetailsInfo> getDetailsInfo() {
        return this.detailsInfo;
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

    public String getName() {
        return this.name;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public void setAgreeKey(long j) {
        this.agreeKey = j;
    }

    public void setAgreeNo(String str) {
        this.agreeNo = str;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }
}
