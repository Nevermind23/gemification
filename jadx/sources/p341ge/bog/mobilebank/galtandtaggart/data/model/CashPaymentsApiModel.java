package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashPaymentsApiModel */
public final class CashPaymentsApiModel {
    private final CashBuyingPowerApiModel buyingPower;
    private final CashRedemptionApiModel redemptions;
    private final Object seasoningDeposits;

    public CashPaymentsApiModel(CashBuyingPowerApiModel cashBuyingPowerApiModel, CashRedemptionApiModel cashRedemptionApiModel, Object obj) {
        C41536l.m120489i(cashBuyingPowerApiModel, "buyingPower");
        C41536l.m120489i(cashRedemptionApiModel, "redemptions");
        this.buyingPower = cashBuyingPowerApiModel;
        this.redemptions = cashRedemptionApiModel;
        this.seasoningDeposits = obj;
    }

    public static /* synthetic */ CashPaymentsApiModel copy$default(CashPaymentsApiModel cashPaymentsApiModel, CashBuyingPowerApiModel cashBuyingPowerApiModel, CashRedemptionApiModel cashRedemptionApiModel, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            cashBuyingPowerApiModel = cashPaymentsApiModel.buyingPower;
        }
        if ((i & 2) != 0) {
            cashRedemptionApiModel = cashPaymentsApiModel.redemptions;
        }
        if ((i & 4) != 0) {
            obj = cashPaymentsApiModel.seasoningDeposits;
        }
        return cashPaymentsApiModel.copy(cashBuyingPowerApiModel, cashRedemptionApiModel, obj);
    }

    public final CashBuyingPowerApiModel component1() {
        return this.buyingPower;
    }

    public final CashRedemptionApiModel component2() {
        return this.redemptions;
    }

    public final Object component3() {
        return this.seasoningDeposits;
    }

    public final CashPaymentsApiModel copy(CashBuyingPowerApiModel cashBuyingPowerApiModel, CashRedemptionApiModel cashRedemptionApiModel, Object obj) {
        C41536l.m120489i(cashBuyingPowerApiModel, "buyingPower");
        C41536l.m120489i(cashRedemptionApiModel, "redemptions");
        return new CashPaymentsApiModel(cashBuyingPowerApiModel, cashRedemptionApiModel, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashPaymentsApiModel)) {
            return false;
        }
        CashPaymentsApiModel cashPaymentsApiModel = (CashPaymentsApiModel) obj;
        return C41536l.m120484d(this.buyingPower, cashPaymentsApiModel.buyingPower) && C41536l.m120484d(this.redemptions, cashPaymentsApiModel.redemptions) && C41536l.m120484d(this.seasoningDeposits, cashPaymentsApiModel.seasoningDeposits);
    }

    public final CashBuyingPowerApiModel getBuyingPower() {
        return this.buyingPower;
    }

    public final CashRedemptionApiModel getRedemptions() {
        return this.redemptions;
    }

    public final Object getSeasoningDeposits() {
        return this.seasoningDeposits;
    }

    public int hashCode() {
        int hashCode = ((this.buyingPower.hashCode() * 31) + this.redemptions.hashCode()) * 31;
        Object obj = this.seasoningDeposits;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        CashBuyingPowerApiModel cashBuyingPowerApiModel = this.buyingPower;
        CashRedemptionApiModel cashRedemptionApiModel = this.redemptions;
        Object obj = this.seasoningDeposits;
        return "CashPaymentsApiModel(buyingPower=" + cashBuyingPowerApiModel + ", redemptions=" + cashRedemptionApiModel + ", seasoningDeposits=" + obj + ")";
    }
}
