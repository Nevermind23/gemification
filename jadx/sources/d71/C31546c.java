package d71;

import g91.C32289b0;
import j71.C36752e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transportcard.data.model.CardApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.CardExternalFileApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.GetCardsCardsApiResponseModel;
import p341ge.bog.mobilebank.transportcard.domain.model.Card;

/* renamed from: d71.c */
public final class C31546c {
    /* renamed from: b */
    private final C36752e m93625b(CardExternalFileApiModel cardExternalFileApiModel) {
        String str;
        boolean z;
        boolean d = C41536l.m120484d(cardExternalFileApiModel.isDark(), "Y");
        String fileUrl = cardExternalFileApiModel.getFileUrl();
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
            str = C32289b0.m95091c(cardExternalFileApiModel.getFileUrl());
        } else {
            str = "";
        }
        return new C36752e(d, str, cardExternalFileApiModel.getFileType());
    }

    /* renamed from: a */
    public final Card mo71947a(CardApiModel cardApiModel) {
        C41536l.m120489i(cardApiModel, "insuranceCardApiModel");
        Card card = r3;
        Card card2 = new Card(cardApiModel.getCardId(), cardApiModel.getCardClass(), cardApiModel.getCardType(), cardApiModel.getProductCode(), cardApiModel.getSubProductCode(), cardApiModel.getClientKey(), cardApiModel.getLastFour(), cardApiModel.getExpDate(), cardApiModel.getMainCur(), cardApiModel.getAcctKey(), cardApiModel.getCcy(), cardApiModel.getPan2(), cardApiModel.getCardName(), cardApiModel.getAvailableAmount(), cardApiModel.getAvailableAmountBaseCcy(), C41536l.m120484d(cardApiModel.isDefault(), "Y"), C41536l.m120484d(cardApiModel.isHidden(), "Y"), cardApiModel.getCardNameDictionaryKey(), cardApiModel.getExtMerchantId(), cardApiModel.isLocalCard(), cardApiModel.getCardData(), cardApiModel.getPaymentCardType(), m93625b(cardApiModel.getCardImage()), m93625b(cardApiModel.getCardSmallImage()));
        return card;
    }

    /* renamed from: c */
    public final List mo71948c(GetCardsCardsApiResponseModel getCardsCardsApiResponseModel) {
        C41536l.m120489i(getCardsCardsApiResponseModel, "cardsResponseModel");
        List<CardApiModel> cards = getCardsCardsApiResponseModel.getCards();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(cards, 10));
        for (CardApiModel a : cards) {
            arrayList.add(mo71947a(a));
        }
        return arrayList;
    }
}
