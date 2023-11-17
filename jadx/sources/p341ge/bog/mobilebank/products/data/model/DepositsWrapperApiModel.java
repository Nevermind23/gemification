package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositsWrapperApiModel */
public final class DepositsWrapperApiModel {
    private final List<DepositApiModel> deposits;
    private final List<DepositDetailsApiModel> details;
    private final AmountApiModel summary;

    public DepositsWrapperApiModel(AmountApiModel amountApiModel, List<DepositApiModel> list, List<DepositDetailsApiModel> list2) {
        C41536l.m120489i(amountApiModel, "summary");
        this.summary = amountApiModel;
        this.deposits = list;
        this.details = list2;
    }

    public static /* synthetic */ DepositsWrapperApiModel copy$default(DepositsWrapperApiModel depositsWrapperApiModel, AmountApiModel amountApiModel, List<DepositApiModel> list, List<DepositDetailsApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            amountApiModel = depositsWrapperApiModel.summary;
        }
        if ((i & 2) != 0) {
            list = depositsWrapperApiModel.deposits;
        }
        if ((i & 4) != 0) {
            list2 = depositsWrapperApiModel.details;
        }
        return depositsWrapperApiModel.copy(amountApiModel, list, list2);
    }

    public final AmountApiModel component1() {
        return this.summary;
    }

    public final List<DepositApiModel> component2() {
        return this.deposits;
    }

    public final List<DepositDetailsApiModel> component3() {
        return this.details;
    }

    public final DepositsWrapperApiModel copy(AmountApiModel amountApiModel, List<DepositApiModel> list, List<DepositDetailsApiModel> list2) {
        C41536l.m120489i(amountApiModel, "summary");
        return new DepositsWrapperApiModel(amountApiModel, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositsWrapperApiModel)) {
            return false;
        }
        DepositsWrapperApiModel depositsWrapperApiModel = (DepositsWrapperApiModel) obj;
        return C41536l.m120484d(this.summary, depositsWrapperApiModel.summary) && C41536l.m120484d(this.deposits, depositsWrapperApiModel.deposits) && C41536l.m120484d(this.details, depositsWrapperApiModel.details);
    }

    public final List<DepositApiModel> getDeposits() {
        return this.deposits;
    }

    public final List<DepositDetailsApiModel> getDetails() {
        return this.details;
    }

    public final AmountApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.summary.hashCode() * 31;
        List<DepositApiModel> list = this.deposits;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<DepositDetailsApiModel> list2 = this.details;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        AmountApiModel amountApiModel = this.summary;
        List<DepositApiModel> list = this.deposits;
        List<DepositDetailsApiModel> list2 = this.details;
        return "DepositsWrapperApiModel(summary=" + amountApiModel + ", deposits=" + list + ", details=" + list2 + ")";
    }
}
