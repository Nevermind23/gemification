package p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDetailsItemEntity */
public final class ClaDetailsItemEntity {

    /* renamed from: Id */
    private final long f59635Id;
    private final ApplicationStructures applicationStructures;
    private final BigDecimal maxAmount;
    private final int maxPeriod;
    private final BigDecimal minAmount;
    private final int minPeriod;
    private final String periodType;
    private final String prodTermsDictionaryKey;
    private final String productCurrency;
    private final String status;

    public ClaDetailsItemEntity(long j, String str, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, ApplicationStructures applicationStructures2) {
        C41536l.m120489i(str, "periodType");
        C41536l.m120489i(bigDecimal, "maxAmount");
        C41536l.m120489i(bigDecimal2, "minAmount");
        C41536l.m120489i(str2, "status");
        C41536l.m120489i(str3, "productCurrency");
        C41536l.m120489i(str4, "prodTermsDictionaryKey");
        C41536l.m120489i(applicationStructures2, "applicationStructures");
        this.f59635Id = j;
        this.periodType = str;
        this.maxPeriod = i;
        this.minPeriod = i2;
        this.maxAmount = bigDecimal;
        this.minAmount = bigDecimal2;
        this.status = str2;
        this.productCurrency = str3;
        this.prodTermsDictionaryKey = str4;
        this.applicationStructures = applicationStructures2;
    }

    public static /* synthetic */ ClaDetailsItemEntity copy$default(ClaDetailsItemEntity claDetailsItemEntity, long j, String str, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, ApplicationStructures applicationStructures2, int i3, Object obj) {
        ClaDetailsItemEntity claDetailsItemEntity2 = claDetailsItemEntity;
        int i4 = i3;
        return claDetailsItemEntity.copy((i4 & 1) != 0 ? claDetailsItemEntity2.f59635Id : j, (i4 & 2) != 0 ? claDetailsItemEntity2.periodType : str, (i4 & 4) != 0 ? claDetailsItemEntity2.maxPeriod : i, (i4 & 8) != 0 ? claDetailsItemEntity2.minPeriod : i2, (i4 & 16) != 0 ? claDetailsItemEntity2.maxAmount : bigDecimal, (i4 & 32) != 0 ? claDetailsItemEntity2.minAmount : bigDecimal2, (i4 & 64) != 0 ? claDetailsItemEntity2.status : str2, (i4 & 128) != 0 ? claDetailsItemEntity2.productCurrency : str3, (i4 & C11398b.f33139r) != 0 ? claDetailsItemEntity2.prodTermsDictionaryKey : str4, (i4 & C11398b.f33140s) != 0 ? claDetailsItemEntity2.applicationStructures : applicationStructures2);
    }

    public final long component1() {
        return this.f59635Id;
    }

    public final ApplicationStructures component10() {
        return this.applicationStructures;
    }

    public final String component2() {
        return this.periodType;
    }

    public final int component3() {
        return this.maxPeriod;
    }

    public final int component4() {
        return this.minPeriod;
    }

    public final BigDecimal component5() {
        return this.maxAmount;
    }

    public final BigDecimal component6() {
        return this.minAmount;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.productCurrency;
    }

    public final String component9() {
        return this.prodTermsDictionaryKey;
    }

    public final ClaDetailsItemEntity copy(long j, String str, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, ApplicationStructures applicationStructures2) {
        String str5 = str;
        C41536l.m120489i(str5, "periodType");
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120489i(bigDecimal3, "maxAmount");
        BigDecimal bigDecimal4 = bigDecimal2;
        C41536l.m120489i(bigDecimal4, "minAmount");
        String str6 = str2;
        C41536l.m120489i(str6, "status");
        String str7 = str3;
        C41536l.m120489i(str7, "productCurrency");
        String str8 = str4;
        C41536l.m120489i(str8, "prodTermsDictionaryKey");
        ApplicationStructures applicationStructures3 = applicationStructures2;
        C41536l.m120489i(applicationStructures3, "applicationStructures");
        return new ClaDetailsItemEntity(j, str5, i, i2, bigDecimal3, bigDecimal4, str6, str7, str8, applicationStructures3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaDetailsItemEntity)) {
            return false;
        }
        ClaDetailsItemEntity claDetailsItemEntity = (ClaDetailsItemEntity) obj;
        return this.f59635Id == claDetailsItemEntity.f59635Id && C41536l.m120484d(this.periodType, claDetailsItemEntity.periodType) && this.maxPeriod == claDetailsItemEntity.maxPeriod && this.minPeriod == claDetailsItemEntity.minPeriod && C41536l.m120484d(this.maxAmount, claDetailsItemEntity.maxAmount) && C41536l.m120484d(this.minAmount, claDetailsItemEntity.minAmount) && C41536l.m120484d(this.status, claDetailsItemEntity.status) && C41536l.m120484d(this.productCurrency, claDetailsItemEntity.productCurrency) && C41536l.m120484d(this.prodTermsDictionaryKey, claDetailsItemEntity.prodTermsDictionaryKey) && C41536l.m120484d(this.applicationStructures, claDetailsItemEntity.applicationStructures);
    }

    public final ApplicationStructures getApplicationStructures() {
        return this.applicationStructures;
    }

    public final long getId() {
        return this.f59635Id;
    }

    public final BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public final int getMaxPeriod() {
        return this.maxPeriod;
    }

    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final int getMinPeriod() {
        return this.minPeriod;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final String getProdTermsDictionaryKey() {
        return this.prodTermsDictionaryKey;
    }

    public final String getProductCurrency() {
        return this.productCurrency;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((((((C7397t.m28148a(this.f59635Id) * 31) + this.periodType.hashCode()) * 31) + this.maxPeriod) * 31) + this.minPeriod) * 31) + this.maxAmount.hashCode()) * 31) + this.minAmount.hashCode()) * 31) + this.status.hashCode()) * 31) + this.productCurrency.hashCode()) * 31) + this.prodTermsDictionaryKey.hashCode()) * 31) + this.applicationStructures.hashCode();
    }

    public String toString() {
        long j = this.f59635Id;
        String str = this.periodType;
        int i = this.maxPeriod;
        int i2 = this.minPeriod;
        BigDecimal bigDecimal = this.maxAmount;
        BigDecimal bigDecimal2 = this.minAmount;
        String str2 = this.status;
        String str3 = this.productCurrency;
        String str4 = this.prodTermsDictionaryKey;
        ApplicationStructures applicationStructures2 = this.applicationStructures;
        return "ClaDetailsItemEntity(Id=" + j + ", periodType=" + str + ", maxPeriod=" + i + ", minPeriod=" + i2 + ", maxAmount=" + bigDecimal + ", minAmount=" + bigDecimal2 + ", status=" + str2 + ", productCurrency=" + str3 + ", prodTermsDictionaryKey=" + str4 + ", applicationStructures=" + applicationStructures2 + ")";
    }
}
