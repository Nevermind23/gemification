package p341ge.bog.mobilebank.cleanarch.data.home.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity */
public final class UpcomingPaymentApiEntity {
    private final BigDecimal amount;
    private final String ccy;
    private final boolean isCustom;
    private final String name;
    private final boolean overdueFlag;
    private final Long payDate;
    private final Long pfmId;
    private final String productDictionaryKey;
    private final String productGroup;
    private final long productKey;
    private final String productType;
    private final String subProductCode;

    public UpcomingPaymentApiEntity(String str, String str2, long j, String str3, String str4, Long l, BigDecimal bigDecimal, String str5, boolean z, boolean z2, String str6, Long l2) {
        C41536l.m120489i(str2, "productType");
        this.productGroup = str;
        this.productType = str2;
        this.productKey = j;
        this.subProductCode = str3;
        this.name = str4;
        this.payDate = l;
        this.amount = bigDecimal;
        this.ccy = str5;
        this.isCustom = z;
        this.overdueFlag = z2;
        this.productDictionaryKey = str6;
        this.pfmId = l2;
    }

    public static /* synthetic */ UpcomingPaymentApiEntity copy$default(UpcomingPaymentApiEntity upcomingPaymentApiEntity, String str, String str2, long j, String str3, String str4, Long l, BigDecimal bigDecimal, String str5, boolean z, boolean z2, String str6, Long l2, int i, Object obj) {
        UpcomingPaymentApiEntity upcomingPaymentApiEntity2 = upcomingPaymentApiEntity;
        int i2 = i;
        return upcomingPaymentApiEntity.copy((i2 & 1) != 0 ? upcomingPaymentApiEntity2.productGroup : str, (i2 & 2) != 0 ? upcomingPaymentApiEntity2.productType : str2, (i2 & 4) != 0 ? upcomingPaymentApiEntity2.productKey : j, (i2 & 8) != 0 ? upcomingPaymentApiEntity2.subProductCode : str3, (i2 & 16) != 0 ? upcomingPaymentApiEntity2.name : str4, (i2 & 32) != 0 ? upcomingPaymentApiEntity2.payDate : l, (i2 & 64) != 0 ? upcomingPaymentApiEntity2.amount : bigDecimal, (i2 & 128) != 0 ? upcomingPaymentApiEntity2.ccy : str5, (i2 & C11398b.f33139r) != 0 ? upcomingPaymentApiEntity2.isCustom : z, (i2 & C11398b.f33140s) != 0 ? upcomingPaymentApiEntity2.overdueFlag : z2, (i2 & C11398b.f33141t) != 0 ? upcomingPaymentApiEntity2.productDictionaryKey : str6, (i2 & C11398b.f33142u) != 0 ? upcomingPaymentApiEntity2.pfmId : l2);
    }

    public final String component1() {
        return this.productGroup;
    }

    public final boolean component10() {
        return this.overdueFlag;
    }

    public final String component11() {
        return this.productDictionaryKey;
    }

    public final Long component12() {
        return this.pfmId;
    }

    public final String component2() {
        return this.productType;
    }

    public final long component3() {
        return this.productKey;
    }

    public final String component4() {
        return this.subProductCode;
    }

    public final String component5() {
        return this.name;
    }

    public final Long component6() {
        return this.payDate;
    }

    public final BigDecimal component7() {
        return this.amount;
    }

    public final String component8() {
        return this.ccy;
    }

    public final boolean component9() {
        return this.isCustom;
    }

    public final UpcomingPaymentApiEntity copy(String str, String str2, long j, String str3, String str4, Long l, BigDecimal bigDecimal, String str5, boolean z, boolean z2, String str6, Long l2) {
        String str7 = str2;
        C41536l.m120489i(str7, "productType");
        return new UpcomingPaymentApiEntity(str, str7, j, str3, str4, l, bigDecimal, str5, z, z2, str6, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingPaymentApiEntity)) {
            return false;
        }
        UpcomingPaymentApiEntity upcomingPaymentApiEntity = (UpcomingPaymentApiEntity) obj;
        return C41536l.m120484d(this.productGroup, upcomingPaymentApiEntity.productGroup) && C41536l.m120484d(this.productType, upcomingPaymentApiEntity.productType) && this.productKey == upcomingPaymentApiEntity.productKey && C41536l.m120484d(this.subProductCode, upcomingPaymentApiEntity.subProductCode) && C41536l.m120484d(this.name, upcomingPaymentApiEntity.name) && C41536l.m120484d(this.payDate, upcomingPaymentApiEntity.payDate) && C41536l.m120484d(this.amount, upcomingPaymentApiEntity.amount) && C41536l.m120484d(this.ccy, upcomingPaymentApiEntity.ccy) && this.isCustom == upcomingPaymentApiEntity.isCustom && this.overdueFlag == upcomingPaymentApiEntity.overdueFlag && C41536l.m120484d(this.productDictionaryKey, upcomingPaymentApiEntity.productDictionaryKey) && C41536l.m120484d(this.pfmId, upcomingPaymentApiEntity.pfmId);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOverdueFlag() {
        return this.overdueFlag;
    }

    public final Long getPayDate() {
        return this.payDate;
    }

    public final Long getPfmId() {
        return this.pfmId;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final String getProductGroup() {
        return this.productGroup;
    }

    public final long getProductKey() {
        return this.productKey;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        String str = this.productGroup;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.productType.hashCode()) * 31) + C7397t.m28148a(this.productKey)) * 31;
        String str2 = this.subProductCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.payDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.ccy;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.isCustom;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.overdueFlag;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str5 = this.productDictionaryKey;
        int hashCode7 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.pfmId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode7 + i;
    }

    public final boolean isCustom() {
        return this.isCustom;
    }

    public String toString() {
        String str = this.productGroup;
        String str2 = this.productType;
        long j = this.productKey;
        String str3 = this.subProductCode;
        String str4 = this.name;
        Long l = this.payDate;
        BigDecimal bigDecimal = this.amount;
        String str5 = this.ccy;
        boolean z = this.isCustom;
        boolean z2 = this.overdueFlag;
        String str6 = this.productDictionaryKey;
        Long l2 = this.pfmId;
        return "UpcomingPaymentApiEntity(productGroup=" + str + ", productType=" + str2 + ", productKey=" + j + ", subProductCode=" + str3 + ", name=" + str4 + ", payDate=" + l + ", amount=" + bigDecimal + ", ccy=" + str5 + ", isCustom=" + z + ", overdueFlag=" + z2 + ", productDictionaryKey=" + str6 + ", pfmId=" + l2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpcomingPaymentApiEntity(java.lang.String r18, java.lang.String r19, long r20, java.lang.String r22, java.lang.String r23, java.lang.Long r24, java.math.BigDecimal r25, java.lang.String r26, boolean r27, boolean r28, java.lang.String r29, java.lang.Long r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r22
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r23
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r24
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r25
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r26
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r15 = r2
            goto L_0x003b
        L_0x0039:
            r15 = r29
        L_0x003b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0042
            r16 = r2
            goto L_0x0044
        L_0x0042:
            r16 = r30
        L_0x0044:
            r3 = r17
            r5 = r19
            r6 = r20
            r13 = r27
            r14 = r28
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Long, java.math.BigDecimal, java.lang.String, boolean, boolean, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
