package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositSavingGoalApiModel */
public final class DepositSavingGoalApiModel {
    private final double amount;
    private final double currentAmount;
    private final String sgcKey;

    public DepositSavingGoalApiModel(double d, double d2, String str) {
        C41536l.m120489i(str, "sgcKey");
        this.amount = d;
        this.currentAmount = d2;
        this.sgcKey = str;
    }

    public static /* synthetic */ DepositSavingGoalApiModel copy$default(DepositSavingGoalApiModel depositSavingGoalApiModel, double d, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = depositSavingGoalApiModel.amount;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = depositSavingGoalApiModel.currentAmount;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = depositSavingGoalApiModel.sgcKey;
        }
        return depositSavingGoalApiModel.copy(d3, d4, str);
    }

    public final double component1() {
        return this.amount;
    }

    public final double component2() {
        return this.currentAmount;
    }

    public final String component3() {
        return this.sgcKey;
    }

    public final DepositSavingGoalApiModel copy(double d, double d2, String str) {
        C41536l.m120489i(str, "sgcKey");
        return new DepositSavingGoalApiModel(d, d2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositSavingGoalApiModel)) {
            return false;
        }
        DepositSavingGoalApiModel depositSavingGoalApiModel = (DepositSavingGoalApiModel) obj;
        return Double.compare(this.amount, depositSavingGoalApiModel.amount) == 0 && Double.compare(this.currentAmount, depositSavingGoalApiModel.currentAmount) == 0 && C41536l.m120484d(this.sgcKey, depositSavingGoalApiModel.sgcKey);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getCurrentAmount() {
        return this.currentAmount;
    }

    public final String getSgcKey() {
        return this.sgcKey;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.amount) * 31) + Double.doubleToLongBits(this.currentAmount)) * 31) + this.sgcKey.hashCode();
    }

    public String toString() {
        double d = this.amount;
        double d2 = this.currentAmount;
        String str = this.sgcKey;
        return "DepositSavingGoalApiModel(amount=" + d + ", currentAmount=" + d2 + ", sgcKey=" + str + ")";
    }
}
