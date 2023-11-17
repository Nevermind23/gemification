package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.PackageLimitApiModel */
public final class PackageLimitApiModel {
    private final BigDecimal initialLimitAmount;
    private final Long initialLimitCount;
    private final BigDecimal limitAmount;
    private final Long limitCount;

    public PackageLimitApiModel(BigDecimal bigDecimal, Long l, BigDecimal bigDecimal2, Long l2) {
        this.initialLimitAmount = bigDecimal;
        this.initialLimitCount = l;
        this.limitAmount = bigDecimal2;
        this.limitCount = l2;
    }

    public static /* synthetic */ PackageLimitApiModel copy$default(PackageLimitApiModel packageLimitApiModel, BigDecimal bigDecimal, Long l, BigDecimal bigDecimal2, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = packageLimitApiModel.initialLimitAmount;
        }
        if ((i & 2) != 0) {
            l = packageLimitApiModel.initialLimitCount;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = packageLimitApiModel.limitAmount;
        }
        if ((i & 8) != 0) {
            l2 = packageLimitApiModel.limitCount;
        }
        return packageLimitApiModel.copy(bigDecimal, l, bigDecimal2, l2);
    }

    public final BigDecimal component1() {
        return this.initialLimitAmount;
    }

    public final Long component2() {
        return this.initialLimitCount;
    }

    public final BigDecimal component3() {
        return this.limitAmount;
    }

    public final Long component4() {
        return this.limitCount;
    }

    public final PackageLimitApiModel copy(BigDecimal bigDecimal, Long l, BigDecimal bigDecimal2, Long l2) {
        return new PackageLimitApiModel(bigDecimal, l, bigDecimal2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageLimitApiModel)) {
            return false;
        }
        PackageLimitApiModel packageLimitApiModel = (PackageLimitApiModel) obj;
        return C41536l.m120484d(this.initialLimitAmount, packageLimitApiModel.initialLimitAmount) && C41536l.m120484d(this.initialLimitCount, packageLimitApiModel.initialLimitCount) && C41536l.m120484d(this.limitAmount, packageLimitApiModel.limitAmount) && C41536l.m120484d(this.limitCount, packageLimitApiModel.limitCount);
    }

    public final BigDecimal getInitialLimitAmount() {
        return this.initialLimitAmount;
    }

    public final Long getInitialLimitCount() {
        return this.initialLimitCount;
    }

    public final BigDecimal getLimitAmount() {
        return this.limitAmount;
    }

    public final Long getLimitCount() {
        return this.limitCount;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.initialLimitAmount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l = this.initialLimitCount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.limitAmount;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l2 = this.limitCount;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.initialLimitAmount;
        Long l = this.initialLimitCount;
        BigDecimal bigDecimal2 = this.limitAmount;
        Long l2 = this.limitCount;
        return "PackageLimitApiModel(initialLimitAmount=" + bigDecimal + ", initialLimitCount=" + l + ", limitAmount=" + bigDecimal2 + ", limitCount=" + l2 + ")";
    }
}
