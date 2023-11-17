package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitNewOperationCreateApiModel */
public final class BillSplitNewOperationCreateApiModel {
    private final double amount;
    private final String description;

    public BillSplitNewOperationCreateApiModel(double d, String str) {
        C41536l.m120489i(str, "description");
        this.amount = d;
        this.description = str;
    }

    public static /* synthetic */ BillSplitNewOperationCreateApiModel copy$default(BillSplitNewOperationCreateApiModel billSplitNewOperationCreateApiModel, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = billSplitNewOperationCreateApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = billSplitNewOperationCreateApiModel.description;
        }
        return billSplitNewOperationCreateApiModel.copy(d, str);
    }

    public final double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.description;
    }

    public final BillSplitNewOperationCreateApiModel copy(double d, String str) {
        C41536l.m120489i(str, "description");
        return new BillSplitNewOperationCreateApiModel(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillSplitNewOperationCreateApiModel)) {
            return false;
        }
        BillSplitNewOperationCreateApiModel billSplitNewOperationCreateApiModel = (BillSplitNewOperationCreateApiModel) obj;
        return Double.compare(this.amount, billSplitNewOperationCreateApiModel.amount) == 0 && C41536l.m120484d(this.description, billSplitNewOperationCreateApiModel.description);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.amount) * 31) + this.description.hashCode();
    }

    public String toString() {
        double d = this.amount;
        String str = this.description;
        return "BillSplitNewOperationCreateApiModel(amount=" + d + ", description=" + str + ")";
    }
}
