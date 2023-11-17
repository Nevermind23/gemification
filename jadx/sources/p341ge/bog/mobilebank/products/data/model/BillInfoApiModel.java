package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.BillInfoApiModel */
public final class BillInfoApiModel {
    private final long acctKey;
    private final Double baseAmount;
    private final String cardAcctNo;
    private final String ccy;
    private final Double closingBalance;
    private final Double commissions;
    private final BigDecimal creditLimit;
    private final Long dueDate;
    private final String firstName;
    private final Double fullPaymentAmt;
    private final Double fullPaymentDue;

    /* renamed from: id */
    private final long f82301id;
    private final Long inpSysdate;
    private final Double interests;
    private final String lastName;
    private final Double minimumPayment;
    private final Double minimumPaymentDue;
    private final Double overdraftLimit;
    private final Double overusedLimit;
    private final Long startDate;

    public BillInfoApiModel(long j, long j2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, Long l, Double d, Double d2, Double d3, Double d4, Double d5, Long l2, Long l3, Double d6, Double d7, Double d8, Double d9, Double d12) {
        this.f82301id = j;
        this.acctKey = j2;
        this.firstName = str;
        this.lastName = str2;
        this.cardAcctNo = str3;
        this.ccy = str4;
        this.creditLimit = bigDecimal;
        this.startDate = l;
        this.closingBalance = d;
        this.minimumPaymentDue = d2;
        this.baseAmount = d3;
        this.interests = d4;
        this.commissions = d5;
        this.dueDate = l2;
        this.inpSysdate = l3;
        this.overdraftLimit = d6;
        this.minimumPayment = d7;
        this.fullPaymentDue = d8;
        this.overusedLimit = d9;
        this.fullPaymentAmt = d12;
    }

    public static /* synthetic */ BillInfoApiModel copy$default(BillInfoApiModel billInfoApiModel, long j, long j2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, Long l, Double d, Double d2, Double d3, Double d4, Double d5, Long l2, Long l3, Double d6, Double d7, Double d8, Double d9, Double d12, int i, Object obj) {
        BillInfoApiModel billInfoApiModel2 = billInfoApiModel;
        int i2 = i;
        return billInfoApiModel.copy((i2 & 1) != 0 ? billInfoApiModel2.f82301id : j, (i2 & 2) != 0 ? billInfoApiModel2.acctKey : j2, (i2 & 4) != 0 ? billInfoApiModel2.firstName : str, (i2 & 8) != 0 ? billInfoApiModel2.lastName : str2, (i2 & 16) != 0 ? billInfoApiModel2.cardAcctNo : str3, (i2 & 32) != 0 ? billInfoApiModel2.ccy : str4, (i2 & 64) != 0 ? billInfoApiModel2.creditLimit : bigDecimal, (i2 & 128) != 0 ? billInfoApiModel2.startDate : l, (i2 & C11398b.f33139r) != 0 ? billInfoApiModel2.closingBalance : d, (i2 & C11398b.f33140s) != 0 ? billInfoApiModel2.minimumPaymentDue : d2, (i2 & C11398b.f33141t) != 0 ? billInfoApiModel2.baseAmount : d3, (i2 & C11398b.f33142u) != 0 ? billInfoApiModel2.interests : d4, (i2 & C11398b.f33143v) != 0 ? billInfoApiModel2.commissions : d5, (i2 & 8192) != 0 ? billInfoApiModel2.dueDate : l2, (i2 & 16384) != 0 ? billInfoApiModel2.inpSysdate : l3, (i2 & 32768) != 0 ? billInfoApiModel2.overdraftLimit : d6, (i2 & 65536) != 0 ? billInfoApiModel2.minimumPayment : d7, (i2 & 131072) != 0 ? billInfoApiModel2.fullPaymentDue : d8, (i2 & 262144) != 0 ? billInfoApiModel2.overusedLimit : d9, (i2 & 524288) != 0 ? billInfoApiModel2.fullPaymentAmt : d12);
    }

    public final long component1() {
        return this.f82301id;
    }

    public final Double component10() {
        return this.minimumPaymentDue;
    }

    public final Double component11() {
        return this.baseAmount;
    }

    public final Double component12() {
        return this.interests;
    }

    public final Double component13() {
        return this.commissions;
    }

    public final Long component14() {
        return this.dueDate;
    }

    public final Long component15() {
        return this.inpSysdate;
    }

    public final Double component16() {
        return this.overdraftLimit;
    }

    public final Double component17() {
        return this.minimumPayment;
    }

    public final Double component18() {
        return this.fullPaymentDue;
    }

    public final Double component19() {
        return this.overusedLimit;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final Double component20() {
        return this.fullPaymentAmt;
    }

    public final String component3() {
        return this.firstName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.cardAcctNo;
    }

    public final String component6() {
        return this.ccy;
    }

    public final BigDecimal component7() {
        return this.creditLimit;
    }

    public final Long component8() {
        return this.startDate;
    }

    public final Double component9() {
        return this.closingBalance;
    }

    public final BillInfoApiModel copy(long j, long j2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, Long l, Double d, Double d2, Double d3, Double d4, Double d5, Long l2, Long l3, Double d6, Double d7, Double d8, Double d9, Double d12) {
        return new BillInfoApiModel(j, j2, str, str2, str3, str4, bigDecimal, l, d, d2, d3, d4, d5, l2, l3, d6, d7, d8, d9, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoApiModel)) {
            return false;
        }
        BillInfoApiModel billInfoApiModel = (BillInfoApiModel) obj;
        return this.f82301id == billInfoApiModel.f82301id && this.acctKey == billInfoApiModel.acctKey && C41536l.m120484d(this.firstName, billInfoApiModel.firstName) && C41536l.m120484d(this.lastName, billInfoApiModel.lastName) && C41536l.m120484d(this.cardAcctNo, billInfoApiModel.cardAcctNo) && C41536l.m120484d(this.ccy, billInfoApiModel.ccy) && C41536l.m120484d(this.creditLimit, billInfoApiModel.creditLimit) && C41536l.m120484d(this.startDate, billInfoApiModel.startDate) && C41536l.m120484d(this.closingBalance, billInfoApiModel.closingBalance) && C41536l.m120484d(this.minimumPaymentDue, billInfoApiModel.minimumPaymentDue) && C41536l.m120484d(this.baseAmount, billInfoApiModel.baseAmount) && C41536l.m120484d(this.interests, billInfoApiModel.interests) && C41536l.m120484d(this.commissions, billInfoApiModel.commissions) && C41536l.m120484d(this.dueDate, billInfoApiModel.dueDate) && C41536l.m120484d(this.inpSysdate, billInfoApiModel.inpSysdate) && C41536l.m120484d(this.overdraftLimit, billInfoApiModel.overdraftLimit) && C41536l.m120484d(this.minimumPayment, billInfoApiModel.minimumPayment) && C41536l.m120484d(this.fullPaymentDue, billInfoApiModel.fullPaymentDue) && C41536l.m120484d(this.overusedLimit, billInfoApiModel.overusedLimit) && C41536l.m120484d(this.fullPaymentAmt, billInfoApiModel.fullPaymentAmt);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final Double getBaseAmount() {
        return this.baseAmount;
    }

    public final String getCardAcctNo() {
        return this.cardAcctNo;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getClosingBalance() {
        return this.closingBalance;
    }

    public final Double getCommissions() {
        return this.commissions;
    }

    public final BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public final Long getDueDate() {
        return this.dueDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Double getFullPaymentAmt() {
        return this.fullPaymentAmt;
    }

    public final Double getFullPaymentDue() {
        return this.fullPaymentDue;
    }

    public final long getId() {
        return this.f82301id;
    }

    public final Long getInpSysdate() {
        return this.inpSysdate;
    }

    public final Double getInterests() {
        return this.interests;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Double getMinimumPayment() {
        return this.minimumPayment;
    }

    public final Double getMinimumPaymentDue() {
        return this.minimumPaymentDue;
    }

    public final Double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public final Double getOverusedLimit() {
        return this.overusedLimit;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f82301id) * 31) + C7397t.m28148a(this.acctKey)) * 31;
        String str = this.firstName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardAcctNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ccy;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.creditLimit;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.startDate;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.closingBalance;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minimumPaymentDue;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.baseAmount;
        int hashCode9 = (hashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.interests;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.commissions;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Long l2 = this.dueDate;
        int hashCode12 = (hashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.inpSysdate;
        int hashCode13 = (hashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d6 = this.overdraftLimit;
        int hashCode14 = (hashCode13 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.minimumPayment;
        int hashCode15 = (hashCode14 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.fullPaymentDue;
        int hashCode16 = (hashCode15 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.overusedLimit;
        int hashCode17 = (hashCode16 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d12 = this.fullPaymentAmt;
        if (d12 != null) {
            i = d12.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        long j = this.f82301id;
        long j2 = this.acctKey;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.cardAcctNo;
        String str4 = this.ccy;
        BigDecimal bigDecimal = this.creditLimit;
        Long l = this.startDate;
        Double d = this.closingBalance;
        Double d2 = this.minimumPaymentDue;
        Double d3 = this.baseAmount;
        Double d4 = this.interests;
        Double d5 = this.commissions;
        Long l2 = this.dueDate;
        Long l3 = this.inpSysdate;
        Double d6 = this.overdraftLimit;
        Double d7 = this.minimumPayment;
        Double d8 = this.fullPaymentDue;
        Double d9 = this.overusedLimit;
        Double d12 = this.fullPaymentAmt;
        return "BillInfoApiModel(id=" + j + ", acctKey=" + j2 + ", firstName=" + str + ", lastName=" + str2 + ", cardAcctNo=" + str3 + ", ccy=" + str4 + ", creditLimit=" + bigDecimal + ", startDate=" + l + ", closingBalance=" + d + ", minimumPaymentDue=" + d2 + ", baseAmount=" + d3 + ", interests=" + d4 + ", commissions=" + d5 + ", dueDate=" + l2 + ", inpSysdate=" + l3 + ", overdraftLimit=" + d6 + ", minimumPayment=" + d7 + ", fullPaymentDue=" + d8 + ", overusedLimit=" + d9 + ", fullPaymentAmt=" + d12 + ")";
    }
}
