package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositBondsContainerApiModel */
public final class DepositBondsContainerApiModel {
    private final DepositBondsListWrapperApiModel bonds;
    private final DepositsWrapperApiModel deposits;
    private final AmountApiModel summary;

    public DepositBondsContainerApiModel(AmountApiModel amountApiModel, DepositsWrapperApiModel depositsWrapperApiModel, DepositBondsListWrapperApiModel depositBondsListWrapperApiModel) {
        C41536l.m120489i(depositsWrapperApiModel, "deposits");
        this.summary = amountApiModel;
        this.deposits = depositsWrapperApiModel;
        this.bonds = depositBondsListWrapperApiModel;
    }

    public static /* synthetic */ DepositBondsContainerApiModel copy$default(DepositBondsContainerApiModel depositBondsContainerApiModel, AmountApiModel amountApiModel, DepositsWrapperApiModel depositsWrapperApiModel, DepositBondsListWrapperApiModel depositBondsListWrapperApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            amountApiModel = depositBondsContainerApiModel.summary;
        }
        if ((i & 2) != 0) {
            depositsWrapperApiModel = depositBondsContainerApiModel.deposits;
        }
        if ((i & 4) != 0) {
            depositBondsListWrapperApiModel = depositBondsContainerApiModel.bonds;
        }
        return depositBondsContainerApiModel.copy(amountApiModel, depositsWrapperApiModel, depositBondsListWrapperApiModel);
    }

    public final AmountApiModel component1() {
        return this.summary;
    }

    public final DepositsWrapperApiModel component2() {
        return this.deposits;
    }

    public final DepositBondsListWrapperApiModel component3() {
        return this.bonds;
    }

    public final DepositBondsContainerApiModel copy(AmountApiModel amountApiModel, DepositsWrapperApiModel depositsWrapperApiModel, DepositBondsListWrapperApiModel depositBondsListWrapperApiModel) {
        C41536l.m120489i(depositsWrapperApiModel, "deposits");
        return new DepositBondsContainerApiModel(amountApiModel, depositsWrapperApiModel, depositBondsListWrapperApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBondsContainerApiModel)) {
            return false;
        }
        DepositBondsContainerApiModel depositBondsContainerApiModel = (DepositBondsContainerApiModel) obj;
        return C41536l.m120484d(this.summary, depositBondsContainerApiModel.summary) && C41536l.m120484d(this.deposits, depositBondsContainerApiModel.deposits) && C41536l.m120484d(this.bonds, depositBondsContainerApiModel.bonds);
    }

    public final DepositBondsListWrapperApiModel getBonds() {
        return this.bonds;
    }

    public final DepositsWrapperApiModel getDeposits() {
        return this.deposits;
    }

    public final AmountApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        AmountApiModel amountApiModel = this.summary;
        int i = 0;
        int hashCode = (((amountApiModel == null ? 0 : amountApiModel.hashCode()) * 31) + this.deposits.hashCode()) * 31;
        DepositBondsListWrapperApiModel depositBondsListWrapperApiModel = this.bonds;
        if (depositBondsListWrapperApiModel != null) {
            i = depositBondsListWrapperApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        AmountApiModel amountApiModel = this.summary;
        DepositsWrapperApiModel depositsWrapperApiModel = this.deposits;
        DepositBondsListWrapperApiModel depositBondsListWrapperApiModel = this.bonds;
        return "DepositBondsContainerApiModel(summary=" + amountApiModel + ", deposits=" + depositsWrapperApiModel + ", bonds=" + depositBondsListWrapperApiModel + ")";
    }
}
