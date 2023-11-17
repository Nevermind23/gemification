package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.PlnDetailsApiModel */
public final class PlnDetailsApiModel {
    private final String acctNo;
    private final BigDecimal amount;
    private final BigDecimal availableAmount;
    private final BigDecimal initialPrincipal;
    private final BigDecimal intAmount;
    private final BigDecimal interestRate;
    private final long maturityDate;
    private final BigDecimal penalty;
    private final String productDictionaryKey;
    private final long startDate;

    public PlnDetailsApiModel(BigDecimal bigDecimal, long j, long j2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        this.amount = bigDecimal;
        this.startDate = j;
        this.maturityDate = j2;
        this.interestRate = bigDecimal2;
        this.intAmount = bigDecimal3;
        this.penalty = bigDecimal4;
        this.initialPrincipal = bigDecimal5;
        this.acctNo = str;
        this.productDictionaryKey = str2;
        this.availableAmount = bigDecimal6;
    }

    public static /* synthetic */ PlnDetailsApiModel copy$default(PlnDetailsApiModel plnDetailsApiModel, BigDecimal bigDecimal, long j, long j2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6, int i, Object obj) {
        PlnDetailsApiModel plnDetailsApiModel2 = plnDetailsApiModel;
        int i2 = i;
        return plnDetailsApiModel.copy((i2 & 1) != 0 ? plnDetailsApiModel2.amount : bigDecimal, (i2 & 2) != 0 ? plnDetailsApiModel2.startDate : j, (i2 & 4) != 0 ? plnDetailsApiModel2.maturityDate : j2, (i2 & 8) != 0 ? plnDetailsApiModel2.interestRate : bigDecimal2, (i2 & 16) != 0 ? plnDetailsApiModel2.intAmount : bigDecimal3, (i2 & 32) != 0 ? plnDetailsApiModel2.penalty : bigDecimal4, (i2 & 64) != 0 ? plnDetailsApiModel2.initialPrincipal : bigDecimal5, (i2 & 128) != 0 ? plnDetailsApiModel2.acctNo : str, (i2 & C11398b.f33139r) != 0 ? plnDetailsApiModel2.productDictionaryKey : str2, (i2 & C11398b.f33140s) != 0 ? plnDetailsApiModel2.availableAmount : bigDecimal6);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final BigDecimal component10() {
        return this.availableAmount;
    }

    public final long component2() {
        return this.startDate;
    }

    public final long component3() {
        return this.maturityDate;
    }

    public final BigDecimal component4() {
        return this.interestRate;
    }

    public final BigDecimal component5() {
        return this.intAmount;
    }

    public final BigDecimal component6() {
        return this.penalty;
    }

    public final BigDecimal component7() {
        return this.initialPrincipal;
    }

    public final String component8() {
        return this.acctNo;
    }

    public final String component9() {
        return this.productDictionaryKey;
    }

    public final PlnDetailsApiModel copy(BigDecimal bigDecimal, long j, long j2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        return new PlnDetailsApiModel(bigDecimal, j, j2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str, str2, bigDecimal6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlnDetailsApiModel)) {
            return false;
        }
        PlnDetailsApiModel plnDetailsApiModel = (PlnDetailsApiModel) obj;
        return C41536l.m120484d(this.amount, plnDetailsApiModel.amount) && this.startDate == plnDetailsApiModel.startDate && this.maturityDate == plnDetailsApiModel.maturityDate && C41536l.m120484d(this.interestRate, plnDetailsApiModel.interestRate) && C41536l.m120484d(this.intAmount, plnDetailsApiModel.intAmount) && C41536l.m120484d(this.penalty, plnDetailsApiModel.penalty) && C41536l.m120484d(this.initialPrincipal, plnDetailsApiModel.initialPrincipal) && C41536l.m120484d(this.acctNo, plnDetailsApiModel.acctNo) && C41536l.m120484d(this.productDictionaryKey, plnDetailsApiModel.productDictionaryKey) && C41536l.m120484d(this.availableAmount, plnDetailsApiModel.availableAmount);
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final BigDecimal getInitialPrincipal() {
        return this.initialPrincipal;
    }

    public final BigDecimal getIntAmount() {
        return this.intAmount;
    }

    public final BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public final long getMaturityDate() {
        return this.maturityDate;
    }

    public final BigDecimal getPenalty() {
        return this.penalty;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + C7397t.m28148a(this.startDate)) * 31) + C7397t.m28148a(this.maturityDate)) * 31;
        BigDecimal bigDecimal2 = this.interestRate;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.intAmount;
        int hashCode3 = (hashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.penalty;
        int hashCode4 = (hashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.initialPrincipal;
        int hashCode5 = (hashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str = this.acctNo;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productDictionaryKey;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.availableAmount;
        if (bigDecimal6 != null) {
            i = bigDecimal6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        long j = this.startDate;
        long j2 = this.maturityDate;
        BigDecimal bigDecimal2 = this.interestRate;
        BigDecimal bigDecimal3 = this.intAmount;
        BigDecimal bigDecimal4 = this.penalty;
        BigDecimal bigDecimal5 = this.initialPrincipal;
        String str = this.acctNo;
        String str2 = this.productDictionaryKey;
        BigDecimal bigDecimal6 = this.availableAmount;
        return "PlnDetailsApiModel(amount=" + bigDecimal + ", startDate=" + j + ", maturityDate=" + j2 + ", interestRate=" + bigDecimal2 + ", intAmount=" + bigDecimal3 + ", penalty=" + bigDecimal4 + ", initialPrincipal=" + bigDecimal5 + ", acctNo=" + str + ", productDictionaryKey=" + str2 + ", availableAmount=" + bigDecimal6 + ")";
    }
}
