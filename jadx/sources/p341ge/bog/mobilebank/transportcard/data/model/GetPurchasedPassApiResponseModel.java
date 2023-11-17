package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.GetPurchasedPassApiResponseModel */
public final class GetPurchasedPassApiResponseModel {
    private final PurchasedPassApiModel purchasedPass;

    public GetPurchasedPassApiResponseModel(PurchasedPassApiModel purchasedPassApiModel) {
        C41536l.m120489i(purchasedPassApiModel, "purchasedPass");
        this.purchasedPass = purchasedPassApiModel;
    }

    public static /* synthetic */ GetPurchasedPassApiResponseModel copy$default(GetPurchasedPassApiResponseModel getPurchasedPassApiResponseModel, PurchasedPassApiModel purchasedPassApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            purchasedPassApiModel = getPurchasedPassApiResponseModel.purchasedPass;
        }
        return getPurchasedPassApiResponseModel.copy(purchasedPassApiModel);
    }

    public final PurchasedPassApiModel component1() {
        return this.purchasedPass;
    }

    public final GetPurchasedPassApiResponseModel copy(PurchasedPassApiModel purchasedPassApiModel) {
        C41536l.m120489i(purchasedPassApiModel, "purchasedPass");
        return new GetPurchasedPassApiResponseModel(purchasedPassApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPurchasedPassApiResponseModel) && C41536l.m120484d(this.purchasedPass, ((GetPurchasedPassApiResponseModel) obj).purchasedPass);
    }

    public final PurchasedPassApiModel getPurchasedPass() {
        return this.purchasedPass;
    }

    public int hashCode() {
        return this.purchasedPass.hashCode();
    }

    public String toString() {
        PurchasedPassApiModel purchasedPassApiModel = this.purchasedPass;
        return "GetPurchasedPassApiResponseModel(purchasedPass=" + purchasedPassApiModel + ")";
    }
}
