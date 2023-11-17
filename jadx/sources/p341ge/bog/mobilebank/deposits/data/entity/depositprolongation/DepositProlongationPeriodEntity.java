package p341ge.bog.mobilebank.deposits.data.entity.depositprolongation;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationPeriodEntity */
public final class DepositProlongationPeriodEntity {
    private final Long maxMaturityDate;
    private final Integer maxMonths;
    private final Long minMaturityDate;
    private final Integer minMonths;

    public DepositProlongationPeriodEntity(Long l, Long l2, Integer num, Integer num2) {
        this.minMaturityDate = l;
        this.maxMaturityDate = l2;
        this.minMonths = num;
        this.maxMonths = num2;
    }

    public static /* synthetic */ DepositProlongationPeriodEntity copy$default(DepositProlongationPeriodEntity depositProlongationPeriodEntity, Long l, Long l2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = depositProlongationPeriodEntity.minMaturityDate;
        }
        if ((i & 2) != 0) {
            l2 = depositProlongationPeriodEntity.maxMaturityDate;
        }
        if ((i & 4) != 0) {
            num = depositProlongationPeriodEntity.minMonths;
        }
        if ((i & 8) != 0) {
            num2 = depositProlongationPeriodEntity.maxMonths;
        }
        return depositProlongationPeriodEntity.copy(l, l2, num, num2);
    }

    public final Long component1() {
        return this.minMaturityDate;
    }

    public final Long component2() {
        return this.maxMaturityDate;
    }

    public final Integer component3() {
        return this.minMonths;
    }

    public final Integer component4() {
        return this.maxMonths;
    }

    public final DepositProlongationPeriodEntity copy(Long l, Long l2, Integer num, Integer num2) {
        return new DepositProlongationPeriodEntity(l, l2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationPeriodEntity)) {
            return false;
        }
        DepositProlongationPeriodEntity depositProlongationPeriodEntity = (DepositProlongationPeriodEntity) obj;
        return C41536l.m120484d(this.minMaturityDate, depositProlongationPeriodEntity.minMaturityDate) && C41536l.m120484d(this.maxMaturityDate, depositProlongationPeriodEntity.maxMaturityDate) && C41536l.m120484d(this.minMonths, depositProlongationPeriodEntity.minMonths) && C41536l.m120484d(this.maxMonths, depositProlongationPeriodEntity.maxMonths);
    }

    public final Long getMaxMaturityDate() {
        return this.maxMaturityDate;
    }

    public final Integer getMaxMonths() {
        return this.maxMonths;
    }

    public final Long getMinMaturityDate() {
        return this.minMaturityDate;
    }

    public final Integer getMinMonths() {
        return this.minMonths;
    }

    public int hashCode() {
        Long l = this.minMaturityDate;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.maxMaturityDate;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.minMonths;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxMonths;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Long l = this.minMaturityDate;
        Long l2 = this.maxMaturityDate;
        Integer num = this.minMonths;
        Integer num2 = this.maxMonths;
        return "DepositProlongationPeriodEntity(minMaturityDate=" + l + ", maxMaturityDate=" + l2 + ", minMonths=" + num + ", maxMonths=" + num2 + ")";
    }
}
