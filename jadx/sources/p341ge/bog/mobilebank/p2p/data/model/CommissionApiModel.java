package p341ge.bog.mobilebank.p2p.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.data.model.CommissionApiModel */
public final class CommissionApiModel {
    private final double comAmount;
    private final String comCcy;

    public CommissionApiModel(double d, String str) {
        C41536l.m120489i(str, "comCcy");
        this.comAmount = d;
        this.comCcy = str;
    }

    public static /* synthetic */ CommissionApiModel copy$default(CommissionApiModel commissionApiModel, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = commissionApiModel.comAmount;
        }
        if ((i & 2) != 0) {
            str = commissionApiModel.comCcy;
        }
        return commissionApiModel.copy(d, str);
    }

    public final double component1() {
        return this.comAmount;
    }

    public final String component2() {
        return this.comCcy;
    }

    public final CommissionApiModel copy(double d, String str) {
        C41536l.m120489i(str, "comCcy");
        return new CommissionApiModel(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionApiModel)) {
            return false;
        }
        CommissionApiModel commissionApiModel = (CommissionApiModel) obj;
        return Double.compare(this.comAmount, commissionApiModel.comAmount) == 0 && C41536l.m120484d(this.comCcy, commissionApiModel.comCcy);
    }

    public final double getComAmount() {
        return this.comAmount;
    }

    public final String getComCcy() {
        return this.comCcy;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.comAmount) * 31) + this.comCcy.hashCode();
    }

    public String toString() {
        double d = this.comAmount;
        String str = this.comCcy;
        return "CommissionApiModel(comAmount=" + d + ", comCcy=" + str + ")";
    }
}
