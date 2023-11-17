package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeWrapperEntity */
public final class DepositSavingGoalPurposeWrapperEntity {
    private final List<DepositSavingGoalPurposeEntity> purposes;

    public DepositSavingGoalPurposeWrapperEntity(List<DepositSavingGoalPurposeEntity> list) {
        this.purposes = list;
    }

    public static /* synthetic */ DepositSavingGoalPurposeWrapperEntity copy$default(DepositSavingGoalPurposeWrapperEntity depositSavingGoalPurposeWrapperEntity, List<DepositSavingGoalPurposeEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = depositSavingGoalPurposeWrapperEntity.purposes;
        }
        return depositSavingGoalPurposeWrapperEntity.copy(list);
    }

    public final List<DepositSavingGoalPurposeEntity> component1() {
        return this.purposes;
    }

    public final DepositSavingGoalPurposeWrapperEntity copy(List<DepositSavingGoalPurposeEntity> list) {
        return new DepositSavingGoalPurposeWrapperEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositSavingGoalPurposeWrapperEntity) && C41536l.m120484d(this.purposes, ((DepositSavingGoalPurposeWrapperEntity) obj).purposes);
    }

    public final List<DepositSavingGoalPurposeEntity> getPurposes() {
        return this.purposes;
    }

    public int hashCode() {
        List<DepositSavingGoalPurposeEntity> list = this.purposes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<DepositSavingGoalPurposeEntity> list = this.purposes;
        return "DepositSavingGoalPurposeWrapperEntity(purposes=" + list + ")";
    }
}
