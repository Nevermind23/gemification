package p341ge.bog.mobilebank.cleanarch.data.creditapplicationdetails.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplicationdetails.entity.CreditApplicationEntity */
public final class CreditApplicationEntity {
    private final BigDecimal amount;
    private final long appId;
    private final BigDecimal commissionAmt;
    private final String condition;
    private final String currency;
    private final BigDecimal loanAmount;
    private final String loanCurrency;
    private final String rsDataApprovePhone;
    private final String subProduct;
    private final Long term;

    public CreditApplicationEntity(long j, BigDecimal bigDecimal, String str, Long l, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, String str3, String str4, String str5) {
        this.appId = j;
        this.amount = bigDecimal;
        this.currency = str;
        this.term = l;
        this.loanAmount = bigDecimal2;
        this.loanCurrency = str2;
        this.commissionAmt = bigDecimal3;
        this.subProduct = str3;
        this.condition = str4;
        this.rsDataApprovePhone = str5;
    }

    public static /* synthetic */ CreditApplicationEntity copy$default(CreditApplicationEntity creditApplicationEntity, long j, BigDecimal bigDecimal, String str, Long l, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, String str3, String str4, String str5, int i, Object obj) {
        CreditApplicationEntity creditApplicationEntity2 = creditApplicationEntity;
        int i2 = i;
        return creditApplicationEntity.copy((i2 & 1) != 0 ? creditApplicationEntity2.appId : j, (i2 & 2) != 0 ? creditApplicationEntity2.amount : bigDecimal, (i2 & 4) != 0 ? creditApplicationEntity2.currency : str, (i2 & 8) != 0 ? creditApplicationEntity2.term : l, (i2 & 16) != 0 ? creditApplicationEntity2.loanAmount : bigDecimal2, (i2 & 32) != 0 ? creditApplicationEntity2.loanCurrency : str2, (i2 & 64) != 0 ? creditApplicationEntity2.commissionAmt : bigDecimal3, (i2 & 128) != 0 ? creditApplicationEntity2.subProduct : str3, (i2 & C11398b.f33139r) != 0 ? creditApplicationEntity2.condition : str4, (i2 & C11398b.f33140s) != 0 ? creditApplicationEntity2.rsDataApprovePhone : str5);
    }

    public final long component1() {
        return this.appId;
    }

    public final String component10() {
        return this.rsDataApprovePhone;
    }

    public final BigDecimal component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final Long component4() {
        return this.term;
    }

    public final BigDecimal component5() {
        return this.loanAmount;
    }

    public final String component6() {
        return this.loanCurrency;
    }

    public final BigDecimal component7() {
        return this.commissionAmt;
    }

    public final String component8() {
        return this.subProduct;
    }

    public final String component9() {
        return this.condition;
    }

    public final CreditApplicationEntity copy(long j, BigDecimal bigDecimal, String str, Long l, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, String str3, String str4, String str5) {
        return new CreditApplicationEntity(j, bigDecimal, str, l, bigDecimal2, str2, bigDecimal3, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditApplicationEntity)) {
            return false;
        }
        CreditApplicationEntity creditApplicationEntity = (CreditApplicationEntity) obj;
        return this.appId == creditApplicationEntity.appId && C41536l.m120484d(this.amount, creditApplicationEntity.amount) && C41536l.m120484d(this.currency, creditApplicationEntity.currency) && C41536l.m120484d(this.term, creditApplicationEntity.term) && C41536l.m120484d(this.loanAmount, creditApplicationEntity.loanAmount) && C41536l.m120484d(this.loanCurrency, creditApplicationEntity.loanCurrency) && C41536l.m120484d(this.commissionAmt, creditApplicationEntity.commissionAmt) && C41536l.m120484d(this.subProduct, creditApplicationEntity.subProduct) && C41536l.m120484d(this.condition, creditApplicationEntity.condition) && C41536l.m120484d(this.rsDataApprovePhone, creditApplicationEntity.rsDataApprovePhone);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final BigDecimal getCommissionAmt() {
        return this.commissionAmt;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BigDecimal getLoanAmount() {
        return this.loanAmount;
    }

    public final String getLoanCurrency() {
        return this.loanCurrency;
    }

    public final String getRsDataApprovePhone() {
        return this.rsDataApprovePhone;
    }

    public final String getSubProduct() {
        return this.subProduct;
    }

    public final Long getTerm() {
        return this.term;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.appId) * 31;
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.term;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.loanAmount;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.loanCurrency;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.commissionAmt;
        int hashCode6 = (hashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str3 = this.subProduct;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.condition;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rsDataApprovePhone;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.appId;
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        Long l = this.term;
        BigDecimal bigDecimal2 = this.loanAmount;
        String str2 = this.loanCurrency;
        BigDecimal bigDecimal3 = this.commissionAmt;
        String str3 = this.subProduct;
        String str4 = this.condition;
        String str5 = this.rsDataApprovePhone;
        return "CreditApplicationEntity(appId=" + j + ", amount=" + bigDecimal + ", currency=" + str + ", term=" + l + ", loanAmount=" + bigDecimal2 + ", loanCurrency=" + str2 + ", commissionAmt=" + bigDecimal3 + ", subProduct=" + str3 + ", condition=" + str4 + ", rsDataApprovePhone=" + str5 + ")";
    }
}
