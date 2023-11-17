package p341ge.bog.mobilebank.model;

import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.DepLoanCalculation */
public final class DepLoanCalculation {
    private final long agreeAcctKey;
    private final String agreeAcctNo;
    private final long agreeKey;
    private final String agreeNo;
    private final BigDecimal amount;
    private final String ccy;
    private final BigDecimal comisAmount;
    private final long contractId;
    private final long depMaturityDate;
    private final Double irr;
    private final long maturityDate;
    private final BigDecimal maxAmount;
    private final BigDecimal minAmount;
    private final int payCount;
    private final long payDate;
    private final double prePenalty;
    private final double priOver;
    private final String productDictionaryKey;
    private final BigDecimal secAmount;
    private final String secCcy;
    private final double spreadRate;
    private final long startDate;
    private final BigDecimal withAmount;

    public DepLoanCalculation(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, double d, Double d2, long j2, long j3, long j4, int i, BigDecimal bigDecimal4, BigDecimal bigDecimal5, double d3, double d4, long j5, String str2, long j6, String str3, BigDecimal bigDecimal6, String str4, long j7, String str5) {
        BigDecimal bigDecimal7 = bigDecimal;
        BigDecimal bigDecimal8 = bigDecimal2;
        BigDecimal bigDecimal9 = bigDecimal3;
        String str6 = str2;
        String str7 = str3;
        BigDecimal bigDecimal10 = bigDecimal6;
        String str8 = str4;
        String str9 = str5;
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal7, "amount");
        C41536l.m120489i(bigDecimal8, "minAmount");
        C41536l.m120489i(bigDecimal9, "maxAmount");
        C41536l.m120489i(str6, "agreeNo");
        C41536l.m120489i(str7, "agreeAcctNo");
        C41536l.m120489i(bigDecimal10, "secAmount");
        C41536l.m120489i(str8, "secCcy");
        C41536l.m120489i(str9, "productDictionaryKey");
        this.contractId = j;
        this.ccy = str;
        this.amount = bigDecimal7;
        this.minAmount = bigDecimal8;
        this.maxAmount = bigDecimal9;
        this.spreadRate = d;
        this.irr = d2;
        this.startDate = j2;
        this.maturityDate = j3;
        this.payDate = j4;
        this.payCount = i;
        this.comisAmount = bigDecimal4;
        this.withAmount = bigDecimal5;
        this.priOver = d3;
        this.prePenalty = d4;
        this.agreeKey = j5;
        this.agreeNo = str6;
        this.agreeAcctKey = j6;
        this.agreeAcctNo = str7;
        this.secAmount = bigDecimal10;
        this.secCcy = str8;
        this.depMaturityDate = j7;
        this.productDictionaryKey = str9;
    }

    public static /* synthetic */ DepLoanCalculation copy$default(DepLoanCalculation depLoanCalculation, long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, double d, Double d2, long j2, long j3, long j4, int i, BigDecimal bigDecimal4, BigDecimal bigDecimal5, double d3, double d4, long j5, String str2, long j6, String str3, BigDecimal bigDecimal6, String str4, long j7, String str5, int i2, Object obj) {
        DepLoanCalculation depLoanCalculation2 = depLoanCalculation;
        int i3 = i2;
        long j8 = (i3 & 1) != 0 ? depLoanCalculation2.contractId : j;
        String str6 = (i3 & 2) != 0 ? depLoanCalculation2.ccy : str;
        BigDecimal bigDecimal7 = (i3 & 4) != 0 ? depLoanCalculation2.amount : bigDecimal;
        BigDecimal bigDecimal8 = (i3 & 8) != 0 ? depLoanCalculation2.minAmount : bigDecimal2;
        BigDecimal bigDecimal9 = (i3 & 16) != 0 ? depLoanCalculation2.maxAmount : bigDecimal3;
        double d5 = (i3 & 32) != 0 ? depLoanCalculation2.spreadRate : d;
        Double d6 = (i3 & 64) != 0 ? depLoanCalculation2.irr : d2;
        long j9 = (i3 & 128) != 0 ? depLoanCalculation2.startDate : j2;
        long j12 = (i3 & C11398b.f33139r) != 0 ? depLoanCalculation2.maturityDate : j3;
        long j13 = (i3 & C11398b.f33140s) != 0 ? depLoanCalculation2.payDate : j4;
        int i4 = (i3 & C11398b.f33141t) != 0 ? depLoanCalculation2.payCount : i;
        BigDecimal bigDecimal10 = (i3 & C11398b.f33142u) != 0 ? depLoanCalculation2.comisAmount : bigDecimal4;
        BigDecimal bigDecimal11 = (i3 & C11398b.f33143v) != 0 ? depLoanCalculation2.withAmount : bigDecimal5;
        long j14 = j13;
        double d7 = (i3 & 8192) != 0 ? depLoanCalculation2.priOver : d3;
        double d8 = (i3 & 16384) != 0 ? depLoanCalculation2.prePenalty : d4;
        long j15 = (32768 & i3) != 0 ? depLoanCalculation2.agreeKey : j5;
        return depLoanCalculation.copy(j8, str6, bigDecimal7, bigDecimal8, bigDecimal9, d5, d6, j9, j12, j14, i4, bigDecimal10, bigDecimal11, d7, d8, j15, (65536 & i3) != 0 ? depLoanCalculation2.agreeNo : str2, (i3 & 131072) != 0 ? depLoanCalculation2.agreeAcctKey : j6, (i3 & 262144) != 0 ? depLoanCalculation2.agreeAcctNo : str3, (524288 & i3) != 0 ? depLoanCalculation2.secAmount : bigDecimal6, (i3 & 1048576) != 0 ? depLoanCalculation2.secCcy : str4, (i3 & 2097152) != 0 ? depLoanCalculation2.depMaturityDate : j7, (i3 & 4194304) != 0 ? depLoanCalculation2.productDictionaryKey : str5);
    }

    public final long component1() {
        return this.contractId;
    }

    public final long component10() {
        return this.payDate;
    }

    public final int component11() {
        return this.payCount;
    }

    public final BigDecimal component12() {
        return this.comisAmount;
    }

    public final BigDecimal component13() {
        return this.withAmount;
    }

    public final double component14() {
        return this.priOver;
    }

    public final double component15() {
        return this.prePenalty;
    }

    public final long component16() {
        return this.agreeKey;
    }

    public final String component17() {
        return this.agreeNo;
    }

    public final long component18() {
        return this.agreeAcctKey;
    }

    public final String component19() {
        return this.agreeAcctNo;
    }

    public final String component2() {
        return this.ccy;
    }

    public final BigDecimal component20() {
        return this.secAmount;
    }

    public final String component21() {
        return this.secCcy;
    }

    public final long component22() {
        return this.depMaturityDate;
    }

    public final String component23() {
        return this.productDictionaryKey;
    }

    public final BigDecimal component3() {
        return this.amount;
    }

    public final BigDecimal component4() {
        return this.minAmount;
    }

    public final BigDecimal component5() {
        return this.maxAmount;
    }

    public final double component6() {
        return this.spreadRate;
    }

    public final Double component7() {
        return this.irr;
    }

    public final long component8() {
        return this.startDate;
    }

    public final long component9() {
        return this.maturityDate;
    }

    public final DepLoanCalculation copy(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, double d, Double d2, long j2, long j3, long j4, int i, BigDecimal bigDecimal4, BigDecimal bigDecimal5, double d3, double d4, long j5, String str2, long j6, String str3, BigDecimal bigDecimal6, String str4, long j7, String str5) {
        long j8 = j;
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(bigDecimal2, "minAmount");
        C41536l.m120489i(bigDecimal3, "maxAmount");
        C41536l.m120489i(str2, "agreeNo");
        C41536l.m120489i(str3, "agreeAcctNo");
        C41536l.m120489i(bigDecimal6, "secAmount");
        C41536l.m120489i(str4, "secCcy");
        C41536l.m120489i(str5, "productDictionaryKey");
        return new DepLoanCalculation(j, str, bigDecimal, bigDecimal2, bigDecimal3, d, d2, j2, j3, j4, i, bigDecimal4, bigDecimal5, d3, d4, j5, str2, j6, str3, bigDecimal6, str4, j7, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepLoanCalculation)) {
            return false;
        }
        DepLoanCalculation depLoanCalculation = (DepLoanCalculation) obj;
        return this.contractId == depLoanCalculation.contractId && C41536l.m120484d(this.ccy, depLoanCalculation.ccy) && C41536l.m120484d(this.amount, depLoanCalculation.amount) && C41536l.m120484d(this.minAmount, depLoanCalculation.minAmount) && C41536l.m120484d(this.maxAmount, depLoanCalculation.maxAmount) && Double.compare(this.spreadRate, depLoanCalculation.spreadRate) == 0 && C41536l.m120484d(this.irr, depLoanCalculation.irr) && this.startDate == depLoanCalculation.startDate && this.maturityDate == depLoanCalculation.maturityDate && this.payDate == depLoanCalculation.payDate && this.payCount == depLoanCalculation.payCount && C41536l.m120484d(this.comisAmount, depLoanCalculation.comisAmount) && C41536l.m120484d(this.withAmount, depLoanCalculation.withAmount) && Double.compare(this.priOver, depLoanCalculation.priOver) == 0 && Double.compare(this.prePenalty, depLoanCalculation.prePenalty) == 0 && this.agreeKey == depLoanCalculation.agreeKey && C41536l.m120484d(this.agreeNo, depLoanCalculation.agreeNo) && this.agreeAcctKey == depLoanCalculation.agreeAcctKey && C41536l.m120484d(this.agreeAcctNo, depLoanCalculation.agreeAcctNo) && C41536l.m120484d(this.secAmount, depLoanCalculation.secAmount) && C41536l.m120484d(this.secCcy, depLoanCalculation.secCcy) && this.depMaturityDate == depLoanCalculation.depMaturityDate && C41536l.m120484d(this.productDictionaryKey, depLoanCalculation.productDictionaryKey);
    }

    public final long getAgreeAcctKey() {
        return this.agreeAcctKey;
    }

    public final String getAgreeAcctNo() {
        return this.agreeAcctNo;
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getComisAmount() {
        return this.comisAmount;
    }

    public final long getContractId() {
        return this.contractId;
    }

    public final long getDepMaturityDate() {
        return this.depMaturityDate;
    }

    public final Double getIrr() {
        return this.irr;
    }

    public final long getMaturityDate() {
        return this.maturityDate;
    }

    public final BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final int getPayCount() {
        return this.payCount;
    }

    public final long getPayDate() {
        return this.payDate;
    }

    public final double getPrePenalty() {
        return this.prePenalty;
    }

    public final double getPriOver() {
        return this.priOver;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final BigDecimal getSecAmount() {
        return this.secAmount;
    }

    public final String getSecCcy() {
        return this.secCcy;
    }

    public final double getSpreadRate() {
        return this.spreadRate;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final BigDecimal getWithAmount() {
        return this.withAmount;
    }

    public int hashCode() {
        int a = ((((((((((C7397t.m28148a(this.contractId) * 31) + this.ccy.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.minAmount.hashCode()) * 31) + this.maxAmount.hashCode()) * 31) + Double.doubleToLongBits(this.spreadRate)) * 31;
        Double d = this.irr;
        int i = 0;
        int hashCode = (((((((((a + (d == null ? 0 : d.hashCode())) * 31) + C7397t.m28148a(this.startDate)) * 31) + C7397t.m28148a(this.maturityDate)) * 31) + C7397t.m28148a(this.payDate)) * 31) + this.payCount) * 31;
        BigDecimal bigDecimal = this.comisAmount;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.withAmount;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return ((((((((((((((((((((hashCode2 + i) * 31) + Double.doubleToLongBits(this.priOver)) * 31) + Double.doubleToLongBits(this.prePenalty)) * 31) + C7397t.m28148a(this.agreeKey)) * 31) + this.agreeNo.hashCode()) * 31) + C7397t.m28148a(this.agreeAcctKey)) * 31) + this.agreeAcctNo.hashCode()) * 31) + this.secAmount.hashCode()) * 31) + this.secCcy.hashCode()) * 31) + C7397t.m28148a(this.depMaturityDate)) * 31) + this.productDictionaryKey.hashCode();
    }

    public String toString() {
        long j = this.contractId;
        String str = this.ccy;
        BigDecimal bigDecimal = this.amount;
        BigDecimal bigDecimal2 = this.minAmount;
        BigDecimal bigDecimal3 = this.maxAmount;
        double d = this.spreadRate;
        Double d2 = this.irr;
        long j2 = this.startDate;
        long j3 = this.maturityDate;
        long j4 = this.payDate;
        int i = this.payCount;
        BigDecimal bigDecimal4 = this.comisAmount;
        int i2 = i;
        BigDecimal bigDecimal5 = this.withAmount;
        double d3 = this.priOver;
        double d4 = this.prePenalty;
        long j5 = this.agreeKey;
        String str2 = this.agreeNo;
        long j6 = this.agreeAcctKey;
        String str3 = this.agreeAcctNo;
        BigDecimal bigDecimal6 = this.secAmount;
        String str4 = str3;
        String str5 = this.secCcy;
        long j7 = this.depMaturityDate;
        String str6 = this.productDictionaryKey;
        return "DepLoanCalculation(contractId=" + j + ", ccy=" + str + ", amount=" + bigDecimal + ", minAmount=" + bigDecimal2 + ", maxAmount=" + bigDecimal3 + ", spreadRate=" + d + ", irr=" + d2 + ", startDate=" + j2 + ", maturityDate=" + j3 + ", payDate=" + j4 + ", payCount=" + i2 + ", comisAmount=" + bigDecimal4 + ", withAmount=" + bigDecimal5 + ", priOver=" + d3 + ", prePenalty=" + d4 + ", agreeKey=" + j5 + ", agreeNo=" + str2 + ", agreeAcctKey=" + j6 + ", agreeAcctNo=" + str4 + ", secAmount=" + bigDecimal6 + ", secCcy=" + str5 + ", depMaturityDate=" + j7 + ", productDictionaryKey=" + str6 + ")";
    }
}
