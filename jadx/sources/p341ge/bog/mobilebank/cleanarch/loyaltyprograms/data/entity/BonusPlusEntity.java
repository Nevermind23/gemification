package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusPlusEntity */
public final class BonusPlusEntity {
    private final Double amountInGel;
    private final BigDecimal available;
    private final BigDecimal collected;
    private final long expirationDate;
    private final BigDecimal expiredBonus;
    private final String plusCategory;
    private final String plusCategoryLabel;
    private final Long plusExpDateMillis;
    private final String plusStatus;
    private final int prizeCount;
    private final Long regDate;
    private final BigDecimal spent;

    public BonusPlusEntity() {
        this((Long) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 0, (String) null, (String) null, (String) null, (Long) null, (BigDecimal) null, 0, (Double) null, C11051p3.f31758b, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusPlusEntity copy$default(BonusPlusEntity bonusPlusEntity, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, String str, String str2, String str3, Long l2, BigDecimal bigDecimal4, long j, Double d, int i2, Object obj) {
        BonusPlusEntity bonusPlusEntity2 = bonusPlusEntity;
        int i3 = i2;
        return bonusPlusEntity.copy((i3 & 1) != 0 ? bonusPlusEntity2.regDate : l, (i3 & 2) != 0 ? bonusPlusEntity2.collected : bigDecimal, (i3 & 4) != 0 ? bonusPlusEntity2.spent : bigDecimal2, (i3 & 8) != 0 ? bonusPlusEntity2.available : bigDecimal3, (i3 & 16) != 0 ? bonusPlusEntity2.prizeCount : i, (i3 & 32) != 0 ? bonusPlusEntity2.plusCategory : str, (i3 & 64) != 0 ? bonusPlusEntity2.plusCategoryLabel : str2, (i3 & 128) != 0 ? bonusPlusEntity2.plusStatus : str3, (i3 & C11398b.f33139r) != 0 ? bonusPlusEntity2.plusExpDateMillis : l2, (i3 & C11398b.f33140s) != 0 ? bonusPlusEntity2.expiredBonus : bigDecimal4, (i3 & C11398b.f33141t) != 0 ? bonusPlusEntity2.expirationDate : j, (i3 & C11398b.f33142u) != 0 ? bonusPlusEntity2.amountInGel : d);
    }

    public final Long component1() {
        return this.regDate;
    }

    public final BigDecimal component10() {
        return this.expiredBonus;
    }

    public final long component11() {
        return this.expirationDate;
    }

    public final Double component12() {
        return this.amountInGel;
    }

    public final BigDecimal component2() {
        return this.collected;
    }

    public final BigDecimal component3() {
        return this.spent;
    }

    public final BigDecimal component4() {
        return this.available;
    }

    public final int component5() {
        return this.prizeCount;
    }

    public final String component6() {
        return this.plusCategory;
    }

    public final String component7() {
        return this.plusCategoryLabel;
    }

    public final String component8() {
        return this.plusStatus;
    }

    public final Long component9() {
        return this.plusExpDateMillis;
    }

    public final BonusPlusEntity copy(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, String str, String str2, String str3, Long l2, BigDecimal bigDecimal4, long j, Double d) {
        return new BonusPlusEntity(l, bigDecimal, bigDecimal2, bigDecimal3, i, str, str2, str3, l2, bigDecimal4, j, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPlusEntity)) {
            return false;
        }
        BonusPlusEntity bonusPlusEntity = (BonusPlusEntity) obj;
        return C41536l.m120484d(this.regDate, bonusPlusEntity.regDate) && C41536l.m120484d(this.collected, bonusPlusEntity.collected) && C41536l.m120484d(this.spent, bonusPlusEntity.spent) && C41536l.m120484d(this.available, bonusPlusEntity.available) && this.prizeCount == bonusPlusEntity.prizeCount && C41536l.m120484d(this.plusCategory, bonusPlusEntity.plusCategory) && C41536l.m120484d(this.plusCategoryLabel, bonusPlusEntity.plusCategoryLabel) && C41536l.m120484d(this.plusStatus, bonusPlusEntity.plusStatus) && C41536l.m120484d(this.plusExpDateMillis, bonusPlusEntity.plusExpDateMillis) && C41536l.m120484d(this.expiredBonus, bonusPlusEntity.expiredBonus) && this.expirationDate == bonusPlusEntity.expirationDate && C41536l.m120484d(this.amountInGel, bonusPlusEntity.amountInGel);
    }

    public final Double getAmountInGel() {
        return this.amountInGel;
    }

    public final BigDecimal getAvailable() {
        return this.available;
    }

    public final BigDecimal getCollected() {
        return this.collected;
    }

    public final long getExpirationDate() {
        return this.expirationDate;
    }

    public final BigDecimal getExpiredBonus() {
        return this.expiredBonus;
    }

    public final String getPlusCategory() {
        return this.plusCategory;
    }

    public final String getPlusCategoryLabel() {
        return this.plusCategoryLabel;
    }

    public final Long getPlusExpDateMillis() {
        return this.plusExpDateMillis;
    }

    public final String getPlusStatus() {
        return this.plusStatus;
    }

    public final int getPrizeCount() {
        return this.prizeCount;
    }

    public final Long getRegDate() {
        return this.regDate;
    }

    public final BigDecimal getSpent() {
        return this.spent;
    }

    public int hashCode() {
        Long l = this.regDate;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        BigDecimal bigDecimal = this.collected;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.spent;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.available;
        int hashCode4 = (((hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + this.prizeCount) * 31;
        String str = this.plusCategory;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.plusCategoryLabel;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.plusStatus;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.plusExpDateMillis;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.expiredBonus;
        int hashCode9 = (((hashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + C7397t.m28148a(this.expirationDate)) * 31;
        Double d = this.amountInGel;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        Long l = this.regDate;
        BigDecimal bigDecimal = this.collected;
        BigDecimal bigDecimal2 = this.spent;
        BigDecimal bigDecimal3 = this.available;
        int i = this.prizeCount;
        String str = this.plusCategory;
        String str2 = this.plusCategoryLabel;
        String str3 = this.plusStatus;
        Long l2 = this.plusExpDateMillis;
        BigDecimal bigDecimal4 = this.expiredBonus;
        long j = this.expirationDate;
        Double d = this.amountInGel;
        return "BonusPlusEntity(regDate=" + l + ", collected=" + bigDecimal + ", spent=" + bigDecimal2 + ", available=" + bigDecimal3 + ", prizeCount=" + i + ", plusCategory=" + str + ", plusCategoryLabel=" + str2 + ", plusStatus=" + str3 + ", plusExpDateMillis=" + l2 + ", expiredBonus=" + bigDecimal4 + ", expirationDate=" + j + ", amountInGel=" + d + ")";
    }

    public BonusPlusEntity(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, String str, String str2, String str3, Long l2, BigDecimal bigDecimal4, long j, Double d) {
        this.regDate = l;
        this.collected = bigDecimal;
        this.spent = bigDecimal2;
        this.available = bigDecimal3;
        this.prizeCount = i;
        this.plusCategory = str;
        this.plusCategoryLabel = str2;
        this.plusStatus = str3;
        this.plusExpDateMillis = l2;
        this.expiredBonus = bigDecimal4;
        this.expirationDate = j;
        this.amountInGel = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusPlusEntity(java.lang.Long r15, java.math.BigDecimal r16, java.math.BigDecimal r17, java.math.BigDecimal r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Long r23, java.math.BigDecimal r24, long r25, java.lang.Double r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = 0
            goto L_0x005b
        L_0x0059:
            r12 = r25
        L_0x005b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = r27
        L_0x0062:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusPlusEntity.<init>(java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.math.BigDecimal, long, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
