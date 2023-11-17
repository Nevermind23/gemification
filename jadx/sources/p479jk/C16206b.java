package p479jk;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.GetInsuranceCardsApiResponseModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.InsuranceCardApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.InsuranceCardExternalFileApiModel;
import p563pk.C17375e;
import p563pk.C17376f;

/* renamed from: jk.b */
public final class C16206b {
    /* renamed from: c */
    private final C17376f m57787c(InsuranceCardExternalFileApiModel insuranceCardExternalFileApiModel) {
        String str;
        boolean z;
        boolean d = C41536l.m120484d(insuranceCardExternalFileApiModel.isDark(), "Y");
        String fileUrl = insuranceCardExternalFileApiModel.getFileUrl();
        boolean z2 = false;
        if (fileUrl != null) {
            if (fileUrl.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            str = C32289b0.m95091c(insuranceCardExternalFileApiModel.getFileUrl());
        } else {
            str = "";
        }
        C41536l.m120488h(str, "if (externalFileApiModel…Url\n            ) else \"\"");
        return new C17376f(d, str, insuranceCardExternalFileApiModel.getFileType());
    }

    /* renamed from: a */
    public final List mo43221a(GetInsuranceCardsApiResponseModel getInsuranceCardsApiResponseModel) {
        C41536l.m120489i(getInsuranceCardsApiResponseModel, "cardsResponseModel");
        List<InsuranceCardApiModel> cards = getInsuranceCardsApiResponseModel.getCards();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(cards, 10));
        for (InsuranceCardApiModel b : cards) {
            arrayList.add(mo43222b(b));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C17375e mo43222b(InsuranceCardApiModel insuranceCardApiModel) {
        C41536l.m120489i(insuranceCardApiModel, "insuranceCardApiModel");
        C17375e eVar = r3;
        C17375e eVar2 = new C17375e(insuranceCardApiModel.getCardId(), insuranceCardApiModel.getCardClass(), insuranceCardApiModel.getCardType(), insuranceCardApiModel.getProductCode(), insuranceCardApiModel.getSubProductCode(), insuranceCardApiModel.getClientKey(), insuranceCardApiModel.getLastFour(), insuranceCardApiModel.getExpDate(), insuranceCardApiModel.getMainCur(), insuranceCardApiModel.getAcctKey(), insuranceCardApiModel.getCcy(), insuranceCardApiModel.getPan2(), insuranceCardApiModel.getCardName(), insuranceCardApiModel.getAvailableAmount(), insuranceCardApiModel.getAvailableAmountBaseCcy(), C41536l.m120484d(insuranceCardApiModel.isDefault(), "Y"), C41536l.m120484d(insuranceCardApiModel.isHidden(), "Y"), insuranceCardApiModel.getExtMerchantId(), insuranceCardApiModel.isLocalCard(), insuranceCardApiModel.getCardData(), insuranceCardApiModel.getPaymentCardType(), m57787c(insuranceCardApiModel.getCardImage()), m57787c(insuranceCardApiModel.getCardSmallImage()));
        return eVar;
    }
}
