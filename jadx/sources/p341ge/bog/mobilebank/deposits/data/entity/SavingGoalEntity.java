package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.SavingGoalEntity */
public final class SavingGoalEntity {
    private final Number amount;
    private final Number currentAmount;
    private final String endDate;

    /* renamed from: id */
    private final long f60515id;
    private final double monthlyAmount;
    private final long sgcId;
    private final String sgcKey;

    public SavingGoalEntity(Number number, Number number2, String str, long j, long j2, String str2, double d) {
        C41536l.m120489i(number, "amount");
        C41536l.m120489i(number2, "currentAmount");
        C41536l.m120489i(str, "endDate");
        C41536l.m120489i(str2, "sgcKey");
        this.amount = number;
        this.currentAmount = number2;
        this.endDate = str;
        this.f60515id = j;
        this.sgcId = j2;
        this.sgcKey = str2;
        this.monthlyAmount = d;
    }

    public static /* synthetic */ SavingGoalEntity copy$default(SavingGoalEntity savingGoalEntity, Number number, Number number2, String str, long j, long j2, String str2, double d, int i, Object obj) {
        SavingGoalEntity savingGoalEntity2 = savingGoalEntity;
        return savingGoalEntity.copy((i & 1) != 0 ? savingGoalEntity2.amount : number, (i & 2) != 0 ? savingGoalEntity2.currentAmount : number2, (i & 4) != 0 ? savingGoalEntity2.endDate : str, (i & 8) != 0 ? savingGoalEntity2.f60515id : j, (i & 16) != 0 ? savingGoalEntity2.sgcId : j2, (i & 32) != 0 ? savingGoalEntity2.sgcKey : str2, (i & 64) != 0 ? savingGoalEntity2.monthlyAmount : d);
    }

    public final Number component1() {
        return this.amount;
    }

    public final Number component2() {
        return this.currentAmount;
    }

    public final String component3() {
        return this.endDate;
    }

    public final long component4() {
        return this.f60515id;
    }

    public final long component5() {
        return this.sgcId;
    }

    public final String component6() {
        return this.sgcKey;
    }

    public final double component7() {
        return this.monthlyAmount;
    }

    public final SavingGoalEntity copy(Number number, Number number2, String str, long j, long j2, String str2, double d) {
        C41536l.m120489i(number, "amount");
        C41536l.m120489i(number2, "currentAmount");
        C41536l.m120489i(str, "endDate");
        String str3 = str2;
        C41536l.m120489i(str3, "sgcKey");
        return new SavingGoalEntity(number, number2, str, j, j2, str3, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingGoalEntity)) {
            return false;
        }
        SavingGoalEntity savingGoalEntity = (SavingGoalEntity) obj;
        return C41536l.m120484d(this.amount, savingGoalEntity.amount) && C41536l.m120484d(this.currentAmount, savingGoalEntity.currentAmount) && C41536l.m120484d(this.endDate, savingGoalEntity.endDate) && this.f60515id == savingGoalEntity.f60515id && this.sgcId == savingGoalEntity.sgcId && C41536l.m120484d(this.sgcKey, savingGoalEntity.sgcKey) && Double.compare(this.monthlyAmount, savingGoalEntity.monthlyAmount) == 0;
    }

    public final Number getAmount() {
        return this.amount;
    }

    public final Number getCurrentAmount() {
        return this.currentAmount;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final long getId() {
        return this.f60515id;
    }

    public final double getMonthlyAmount() {
        return this.monthlyAmount;
    }

    public final long getSgcId() {
        return this.sgcId;
    }

    public final String getSgcKey() {
        return this.sgcKey;
    }

    public int hashCode() {
        return (((((((((((this.amount.hashCode() * 31) + this.currentAmount.hashCode()) * 31) + this.endDate.hashCode()) * 31) + C7397t.m28148a(this.f60515id)) * 31) + C7397t.m28148a(this.sgcId)) * 31) + this.sgcKey.hashCode()) * 31) + Double.doubleToLongBits(this.monthlyAmount);
    }

    public String toString() {
        Number number = this.amount;
        Number number2 = this.currentAmount;
        String str = this.endDate;
        long j = this.f60515id;
        long j2 = this.sgcId;
        String str2 = this.sgcKey;
        double d = this.monthlyAmount;
        return "SavingGoalEntity(amount=" + number + ", currentAmount=" + number2 + ", endDate=" + str + ", id=" + j + ", sgcId=" + j2 + ", sgcKey=" + str2 + ", monthlyAmount=" + d + ")";
    }
}
