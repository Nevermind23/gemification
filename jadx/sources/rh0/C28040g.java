package rh0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardOfferDetailsApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.OfferBudgetApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.OfferExpirationApiModel;
import xh0.C29788e;
import xh0.C29790g;
import xh0.C29793j;
import xh0.C29798n;
import xh0.C29799o;

/* renamed from: rh0.g */
public final class C28040g {
    /* renamed from: b */
    private final C29798n m86440b(OfferBudgetApiModel offerBudgetApiModel) {
        List<Double> list;
        Integer num;
        String str = null;
        if (offerBudgetApiModel != null) {
            list = offerBudgetApiModel.getFixedAmounts();
        } else {
            list = null;
        }
        if (offerBudgetApiModel != null) {
            num = offerBudgetApiModel.getMaxCapAmount();
        } else {
            num = null;
        }
        if (offerBudgetApiModel != null) {
            str = offerBudgetApiModel.getMaxCapCcy();
        }
        return new C29798n(list, num, str);
    }

    /* renamed from: c */
    private final C29799o m86441c(OfferExpirationApiModel offerExpirationApiModel) {
        String str;
        Long l = null;
        if (offerExpirationApiModel != null) {
            str = offerExpirationApiModel.getAfterPurchaseDays();
        } else {
            str = null;
        }
        if (offerExpirationApiModel != null) {
            l = offerExpirationApiModel.getFixedDate();
        }
        return new C29799o(str, l);
    }

    /* renamed from: a */
    public final C29793j mo67582a(GiftCardOfferDetailsApiModel giftCardOfferDetailsApiModel) {
        C29788e eVar;
        C29790g gVar;
        C41536l.m120489i(giftCardOfferDetailsApiModel, "apiModel");
        BigDecimal amountMaxLimit = giftCardOfferDetailsApiModel.getAmountMaxLimit();
        BigDecimal amountMinLimit = giftCardOfferDetailsApiModel.getAmountMinLimit();
        if (giftCardOfferDetailsApiModel.getBudgetType() != null) {
            eVar = C29788e.valueOf(giftCardOfferDetailsApiModel.getBudgetType().toString());
        } else {
            eVar = null;
        }
        String clientInn = giftCardOfferDetailsApiModel.getClientInn();
        Long clientKey = giftCardOfferDetailsApiModel.getClientKey();
        String clientShortEN = giftCardOfferDetailsApiModel.getClientShortEN();
        String clientShortGE = giftCardOfferDetailsApiModel.getClientShortGE();
        if (giftCardOfferDetailsApiModel.getExpirationType() != null) {
            gVar = C29790g.valueOf(giftCardOfferDetailsApiModel.getExpirationType().toString());
        } else {
            gVar = null;
        }
        return new C29793j(amountMaxLimit, amountMinLimit, eVar, clientInn, clientKey, clientShortEN, clientShortGE, gVar, giftCardOfferDetailsApiModel.getOfferBrandListEn(), giftCardOfferDetailsApiModel.getOfferBrandListGe(), m86440b(giftCardOfferDetailsApiModel.getOffersBudget()), giftCardOfferDetailsApiModel.getOfferCategory(), m86441c(giftCardOfferDetailsApiModel.getOfferExpiration()), giftCardOfferDetailsApiModel.getOfferId(), giftCardOfferDetailsApiModel.getOfferLogoStorageId(), giftCardOfferDetailsApiModel.getOfferLogoStorageUrl(), giftCardOfferDetailsApiModel.getOfferNameEN(), giftCardOfferDetailsApiModel.getOfferNameGE(), giftCardOfferDetailsApiModel.getPurchaseMethods(), giftCardOfferDetailsApiModel.getResultCode(), giftCardOfferDetailsApiModel.getResultDesc());
    }
}
