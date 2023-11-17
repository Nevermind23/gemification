package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsEntity */
public final class DepositsAndBondsEntity {
    private final List<DepositsAndBondsSummaryEntity> amountSums;
    private final DepositsAndBondsWrapperEntity deposits;
    private final DepositsAndBondsSummaryEntity summary;

    public DepositsAndBondsEntity(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositsAndBondsSummaryEntity> list, DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity) {
        C41536l.m120489i(depositsAndBondsSummaryEntity, "summary");
        C41536l.m120489i(depositsAndBondsWrapperEntity, "deposits");
        this.summary = depositsAndBondsSummaryEntity;
        this.amountSums = list;
        this.deposits = depositsAndBondsWrapperEntity;
    }

    public static /* synthetic */ DepositsAndBondsEntity copy$default(DepositsAndBondsEntity depositsAndBondsEntity, DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositsAndBondsSummaryEntity> list, DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            depositsAndBondsSummaryEntity = depositsAndBondsEntity.summary;
        }
        if ((i & 2) != 0) {
            list = depositsAndBondsEntity.amountSums;
        }
        if ((i & 4) != 0) {
            depositsAndBondsWrapperEntity = depositsAndBondsEntity.deposits;
        }
        return depositsAndBondsEntity.copy(depositsAndBondsSummaryEntity, list, depositsAndBondsWrapperEntity);
    }

    public final DepositsAndBondsSummaryEntity component1() {
        return this.summary;
    }

    public final List<DepositsAndBondsSummaryEntity> component2() {
        return this.amountSums;
    }

    public final DepositsAndBondsWrapperEntity component3() {
        return this.deposits;
    }

    public final DepositsAndBondsEntity copy(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity, List<DepositsAndBondsSummaryEntity> list, DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity) {
        C41536l.m120489i(depositsAndBondsSummaryEntity, "summary");
        C41536l.m120489i(depositsAndBondsWrapperEntity, "deposits");
        return new DepositsAndBondsEntity(depositsAndBondsSummaryEntity, list, depositsAndBondsWrapperEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositsAndBondsEntity)) {
            return false;
        }
        DepositsAndBondsEntity depositsAndBondsEntity = (DepositsAndBondsEntity) obj;
        return C41536l.m120484d(this.summary, depositsAndBondsEntity.summary) && C41536l.m120484d(this.amountSums, depositsAndBondsEntity.amountSums) && C41536l.m120484d(this.deposits, depositsAndBondsEntity.deposits);
    }

    public final List<DepositsAndBondsSummaryEntity> getAmountSums() {
        return this.amountSums;
    }

    public final DepositsAndBondsWrapperEntity getDeposits() {
        return this.deposits;
    }

    public final DepositsAndBondsSummaryEntity getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.summary.hashCode() * 31;
        List<DepositsAndBondsSummaryEntity> list = this.amountSums;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.deposits.hashCode();
    }

    public String toString() {
        DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity = this.summary;
        List<DepositsAndBondsSummaryEntity> list = this.amountSums;
        DepositsAndBondsWrapperEntity depositsAndBondsWrapperEntity = this.deposits;
        return "DepositsAndBondsEntity(summary=" + depositsAndBondsSummaryEntity + ", amountSums=" + list + ", deposits=" + depositsAndBondsWrapperEntity + ")";
    }
}
