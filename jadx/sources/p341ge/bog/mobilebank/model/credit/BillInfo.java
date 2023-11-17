package p341ge.bog.mobilebank.model.credit;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.credit.BillInfo */
public class BillInfo {
    public long acctKey;
    public Double baseAmount;
    public String cardAcctNo;
    public String ccy;
    public Double closingBalance;
    public Double commissions;
    public BigDecimal creditLimit;
    public Long dueDate;
    public String firstName;
    public Double fullPaymentAmt;
    public Double fullPaymentDue;

    /* renamed from: id */
    public long f81308id;
    public Long inpSysdate;
    public Double interests;
    public String lastName;
    public Double minimumPayment;
    public Double minimumPaymentDue;
    public Double overdraftLimit;
    public Double overusedLimit;
    public Long startDate;

    public long getAcctKey() {
        return this.acctKey;
    }

    public Double getBaseAmount() {
        return this.baseAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public Double getClosingBalance() {
        return this.closingBalance;
    }

    public Double getCommissions() {
        return this.commissions;
    }

    public Long getDueDate() {
        return this.dueDate;
    }

    public Double getFullPaymentDue() {
        return this.fullPaymentDue;
    }

    public long getId() {
        return this.f81308id;
    }

    public Long getInpSysdate() {
        return this.inpSysdate;
    }

    public Double getInterests() {
        return this.interests;
    }

    public Double getMinimumPayment() {
        return this.minimumPayment;
    }

    public Double getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    public Double getOverusedLimit() {
        return this.overusedLimit;
    }

    public Long getStartDate() {
        return this.startDate;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setId(long j) {
        this.f81308id = j;
    }

    public void setStartDate(Long l) {
        this.startDate = l;
    }
}
