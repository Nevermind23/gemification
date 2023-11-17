package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAmexEntity */
public final class BonusAmexEntity {
    private final Double amountInGel;
    private final BigDecimal available;
    private final BigDecimal collected;
    private final int prizeCount;
    private final Long regDate;
    private final BigDecimal spent;

    public BonusAmexEntity() {
        this((Long) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 0, (Double) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusAmexEntity copy$default(BonusAmexEntity bonusAmexEntity, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = bonusAmexEntity.regDate;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = bonusAmexEntity.collected;
        }
        BigDecimal bigDecimal4 = bigDecimal;
        if ((i2 & 4) != 0) {
            bigDecimal2 = bonusAmexEntity.spent;
        }
        BigDecimal bigDecimal5 = bigDecimal2;
        if ((i2 & 8) != 0) {
            bigDecimal3 = bonusAmexEntity.available;
        }
        BigDecimal bigDecimal6 = bigDecimal3;
        if ((i2 & 16) != 0) {
            i = bonusAmexEntity.prizeCount;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            d = bonusAmexEntity.amountInGel;
        }
        return bonusAmexEntity.copy(l, bigDecimal4, bigDecimal5, bigDecimal6, i3, d);
    }

    public final Long component1() {
        return this.regDate;
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

    public final Double component6() {
        return this.amountInGel;
    }

    public final BonusAmexEntity copy(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Double d) {
        return new BonusAmexEntity(l, bigDecimal, bigDecimal2, bigDecimal3, i, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAmexEntity)) {
            return false;
        }
        BonusAmexEntity bonusAmexEntity = (BonusAmexEntity) obj;
        return C41536l.m120484d(this.regDate, bonusAmexEntity.regDate) && C41536l.m120484d(this.collected, bonusAmexEntity.collected) && C41536l.m120484d(this.spent, bonusAmexEntity.spent) && C41536l.m120484d(this.available, bonusAmexEntity.available) && this.prizeCount == bonusAmexEntity.prizeCount && C41536l.m120484d(this.amountInGel, bonusAmexEntity.amountInGel);
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
        Double d = this.amountInGel;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.regDate;
        BigDecimal bigDecimal = this.collected;
        BigDecimal bigDecimal2 = this.spent;
        BigDecimal bigDecimal3 = this.available;
        int i = this.prizeCount;
        Double d = this.amountInGel;
        return "BonusAmexEntity(regDate=" + l + ", collected=" + bigDecimal + ", spent=" + bigDecimal2 + ", available=" + bigDecimal3 + ", prizeCount=" + i + ", amountInGel=" + d + ")";
    }

    public BonusAmexEntity(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Double d) {
        this.regDate = l;
        this.collected = bigDecimal;
        this.spent = bigDecimal2;
        this.available = bigDecimal3;
        this.prizeCount = i;
        this.amountInGel = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusAmexEntity(java.lang.Long r6, java.math.BigDecimal r7, java.math.BigDecimal r8, java.math.BigDecimal r9, int r10, java.lang.Double r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0022
            r10 = 0
        L_0x0022:
            r4 = r10
            r6 = r12 & 32
            if (r6 == 0) goto L_0x0029
            r12 = r0
            goto L_0x002a
        L_0x0029:
            r12 = r11
        L_0x002a:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAmexEntity.<init>(java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
