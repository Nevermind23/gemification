package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsWrapperEntity */
public final class DepositsAndBondsWrapperEntity {
    private final List<DepositBondEntity> deposits;
    private final DepositsAndBondsSummaryEntity summary;

    public DepositsAndBondsWrapperEntity(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositBondEntity> list) {
        C41536l.m120489i(depositsAndBondsSummaryEntity, "summary");
        this.summary = depositsAndBondsSummaryEntity;
        this.deposits = list;
    }

    public static /* synthetic */ DepositsAndBondsWrapperEntity copy$default(DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity, DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositBondEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            depositsAndBondsSummaryEntity = depositsAndBondsWrapperEntity.summary;
        }
        if ((i & 2) != 0) {
            list = depositsAndBondsWrapperEntity.deposits;
        }
        return depositsAndBondsWrapperEntity.copy(depositsAndBondsSummaryEntity, list);
    }

    public final DepositsAndBondsSummaryEntity component1() {
        return this.summary;
    }

    public final List<DepositBondEntity> component2() {
        return this.deposits;
    }

    public final DepositsAndBondsWrapperEntity copy(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositBondEntity> list) {
        C41536l.m120489i(depositsAndBondsSummaryEntity, "summary");
        return new DepositsAndBondsWrapperEntity(depositsAndBondsSummaryEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositsAndBondsWrapperEntity)) {
            return false;
        }
        DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity = (DepositsAndBondsWrapperEntity) obj;
        return C41536l.m120484d(this.summary, depositsAndBondsWrapperEntity.summary) && C41536l.m120484d(this.deposits, depositsAndBondsWrapperEntity.deposits);
    }

    public final List<DepositBondEntity> getDeposits() {
        return this.deposits;
    }

    public final DepositsAndBondsSummaryEntity getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.summary.hashCode() * 31;
        List<DepositBondEntity> list = this.deposits;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity = this.summary;
        List<DepositBondEntity> list = this.deposits;
        return "DepositsAndBondsWrapperEntity(summary=" + depositsAndBondsSummaryEntity + ", deposits=" + list + ")";
    }
}
