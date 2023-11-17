package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.PlnDetailsApiEntity */
public final class PlnDetailsApiEntity {
    private final String acctNo;
    private final BigDecimal amount;
    private final BigDecimal availableAmount;
    private final BigDecimal initialPrincipal;
    private final BigDecimal intAmount;
    private final BigDecimal interestRate;
    private final Long maturityDate;
    private final BigDecimal penalty;
    private final String productDictionaryKey;
    private final Long startDate;

    public PlnDetailsApiEntity(BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        this.amount = bigDecimal;
        this.startDate = l;
        this.maturityDate = l2;
        this.interestRate = bigDecimal2;
        this.intAmount = bigDecimal3;
        this.penalty = bigDecimal4;
        this.initialPrincipal = bigDecimal5;
        this.acctNo = str;
        this.productDictionaryKey = str2;
        this.availableAmount = bigDecimal6;
    }

    public static /* synthetic */ PlnDetailsApiEntity copy$default(PlnDetailsApiEntity plnDetailsApiEntity, BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6, int i, Object obj) {
        PlnDetailsApiEntity plnDetailsApiEntity2 = plnDetailsApiEntity;
        int i2 = i;
        return plnDetailsApiEntity.copy((i2 & 1) != 0 ? plnDetailsApiEntity2.amount : bigDecimal, (i2 & 2) != 0 ? plnDetailsApiEntity2.startDate : l, (i2 & 4) != 0 ? plnDetailsApiEntity2.maturityDate : l2, (i2 & 8) != 0 ? plnDetailsApiEntity2.interestRate : bigDecimal2, (i2 & 16) != 0 ? plnDetailsApiEntity2.intAmount : bigDecimal3, (i2 & 32) != 0 ? plnDetailsApiEntity2.penalty : bigDecimal4, (i2 & 64) != 0 ? plnDetailsApiEntity2.initialPrincipal : bigDecimal5, (i2 & 128) != 0 ? plnDetailsApiEntity2.acctNo : str, (i2 & C11398b.f33139r) != 0 ? plnDetailsApiEntity2.productDictionaryKey : str2, (i2 & C11398b.f33140s) != 0 ? plnDetailsApiEntity2.availableAmount : bigDecimal6);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final BigDecimal component10() {
        return this.availableAmount;
    }

    public final Long component2() {
        return this.startDate;
    }

    public final Long component3() {
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

    public final PlnDetailsApiEntity copy(BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        return new PlnDetailsApiEntity(bigDecimal, l, l2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str, str2, bigDecimal6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlnDetailsApiEntity)) {
            return false;
        }
        PlnDetailsApiEntity plnDetailsApiEntity = (PlnDetailsApiEntity) obj;
        return C41536l.m120484d(this.amount, plnDetailsApiEntity.amount) && C41536l.m120484d(this.startDate, plnDetailsApiEntity.startDate) && C41536l.m120484d(this.maturityDate, plnDetailsApiEntity.maturityDate) && C41536l.m120484d(this.interestRate, plnDetailsApiEntity.interestRate) && C41536l.m120484d(this.intAmount, plnDetailsApiEntity.intAmount) && C41536l.m120484d(this.penalty, plnDetailsApiEntity.penalty) && C41536l.m120484d(this.initialPrincipal, plnDetailsApiEntity.initialPrincipal) && C41536l.m120484d(this.acctNo, plnDetailsApiEntity.acctNo) && C41536l.m120484d(this.productDictionaryKey, plnDetailsApiEntity.productDictionaryKey) && C41536l.m120484d(this.availableAmount, plnDetailsApiEntity.availableAmount);
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

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public final BigDecimal getPenalty() {
        return this.penalty;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l = this.startDate;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maturityDate;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interestRate;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.intAmount;
        int hashCode5 = (hashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.penalty;
        int hashCode6 = (hashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.initialPrincipal;
        int hashCode7 = (hashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str = this.acctNo;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productDictionaryKey;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.availableAmount;
        if (bigDecimal6 != null) {
            i = bigDecimal6.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        Long l = this.startDate;
        Long l2 = this.maturityDate;
        BigDecimal bigDecimal2 = this.interestRate;
        BigDecimal bigDecimal3 = this.intAmount;
        BigDecimal bigDecimal4 = this.penalty;
        BigDecimal bigDecimal5 = this.initialPrincipal;
        String str = this.acctNo;
        String str2 = this.productDictionaryKey;
        BigDecimal bigDecimal6 = this.availableAmount;
        return "PlnDetailsApiEntity(amount=" + bigDecimal + ", startDate=" + l + ", maturityDate=" + l2 + ", interestRate=" + bigDecimal2 + ", intAmount=" + bigDecimal3 + ", penalty=" + bigDecimal4 + ", initialPrincipal=" + bigDecimal5 + ", acctNo=" + str + ", productDictionaryKey=" + str2 + ", availableAmount=" + bigDecimal6 + ")";
    }
}
