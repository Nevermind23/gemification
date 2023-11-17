package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashRedemptionApiModel */
public final class CashRedemptionApiModel {
    private final BigDecimal amountWithheldFromRedemptions;

    public CashRedemptionApiModel(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "amountWithheldFromRedemptions");
        this.amountWithheldFromRedemptions = bigDecimal;
    }

    public static /* synthetic */ CashRedemptionApiModel copy$default(CashRedemptionApiModel cashRedemptionApiModel, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cashRedemptionApiModel.amountWithheldFromRedemptions;
        }
        return cashRedemptionApiModel.copy(bigDecimal);
    }

    public final BigDecimal component1() {
        return this.amountWithheldFromRedemptions;
    }

    public final CashRedemptionApiModel copy(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "amountWithheldFromRedemptions");
        return new CashRedemptionApiModel(bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashRedemptionApiModel) && C41536l.m120484d(this.amountWithheldFromRedemptions, ((CashRedemptionApiModel) obj).amountWithheldFromRedemptions);
    }

    public final BigDecimal getAmountWithheldFromRedemptions() {
        return this.amountWithheldFromRedemptions;
    }

    public int hashCode() {
        return this.amountWithheldFromRedemptions.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.amountWithheldFromRedemptions;
        return "CashRedemptionApiModel(amountWithheldFromRedemptions=" + bigDecimal + ")";
    }
}
