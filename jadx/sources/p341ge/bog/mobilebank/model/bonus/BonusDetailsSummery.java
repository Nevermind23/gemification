package p341ge.bog.mobilebank.model.bonus;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusDetailsSummery */
public class BonusDetailsSummery {
    @C8664c("acctNo")
    private String acctNo;
    @C8664c("activationDate")
    private String activationDate;
    @C8664c("availablePoints")
    private BigDecimal availablePoints;
    @C8664c("count")
    private int count;
    @C8664c("endDate")
    private String endDate;
    @C8664c("from")
    private int from;
    @C8664c("lastPayedDate")
    private String lastPayedDate;
    @C8664c("nextPayedDate")
    private String nextPayedDate;
    @C8664c("startDate")
    private String startDate;
    @C8664c("totalCount")
    private int totalCount;
    @C8664c("totalPoints")
    private BigDecimal totalPoints;
    @C8664c("totalUsedPoints")
    private BigDecimal totalUsedPoints;

    public String getAcctNo() {
        return this.acctNo;
    }

    public BigDecimal getAvailablePoints() {
        return this.availablePoints;
    }

    public int getCount() {
        return this.count;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public int getFrom() {
        return this.from;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setAvailablePoints(BigDecimal bigDecimal) {
        this.availablePoints = bigDecimal;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
