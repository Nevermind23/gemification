package d71;

import j71.C36754g;
import j71.C36756i;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transportcard.data.model.GetPurchasedPassApiResponseModel;
import p341ge.bog.mobilebank.transportcard.data.model.PurchasedPassApiModel;

/* renamed from: d71.d */
public final class C31547d {
    /* renamed from: a */
    public final C36754g mo71949a(GetPurchasedPassApiResponseModel getPurchasedPassApiResponseModel) {
        C41536l.m120489i(getPurchasedPassApiResponseModel, "getPurchasedPassApiResponseModel");
        return mo71950b(getPurchasedPassApiResponseModel.getPurchasedPass());
    }

    /* renamed from: b */
    public final C36754g mo71950b(PurchasedPassApiModel purchasedPassApiModel) {
        C41536l.m120489i(purchasedPassApiModel, "purchasedPassApiModel");
        return new C36754g(purchasedPassApiModel.getTypeId(), purchasedPassApiModel.getPassTitle(), purchasedPassApiModel.getPrice(), purchasedPassApiModel.getDeviceType(), purchasedPassApiModel.getDeviceName(), purchasedPassApiModel.getStartDate(), purchasedPassApiModel.getEndDate(), purchasedPassApiModel.isPhysicalDevice(), purchasedPassApiModel.getLastFour(), C36756i.f88709e.mo89639a(purchasedPassApiModel.getStatus()), purchasedPassApiModel.getSuccessDictionaryKey());
    }
}
