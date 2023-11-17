package rh0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardCategoryApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardNominationApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardOfferApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionApiModel;
import xh0.C29791h;
import xh0.C29792i;
import xh0.C29794k;

/* renamed from: rh0.f */
public final class C28039f {
    /* renamed from: a */
    private final C29794k m86434a(GiftCardTransactionApiModel giftCardTransactionApiModel) {
        return new C29794k(giftCardTransactionApiModel.getClientKey(), giftCardTransactionApiModel.getGiftCardId(), giftCardTransactionApiModel.getId(), giftCardTransactionApiModel.getMerchantAddress(), giftCardTransactionApiModel.getMerchantName(), giftCardTransactionApiModel.getOfferId(), giftCardTransactionApiModel.getPaymentCode(), C29794k.C29795a.valueOf(giftCardTransactionApiModel.getPaymentType().toString()), giftCardTransactionApiModel.getSettlementAmount(), giftCardTransactionApiModel.getSettlementCcy(), giftCardTransactionApiModel.getTerminalId(), giftCardTransactionApiModel.getTransactionDate(), giftCardTransactionApiModel.getTransactionId(), giftCardTransactionApiModel.getTransactionRrn());
    }

    /* renamed from: d */
    private final C29791h m86435d(GiftCardCategoryApiModel giftCardCategoryApiModel) {
        long categoryId = giftCardCategoryApiModel.getCategoryId();
        String categoryDescEn = giftCardCategoryApiModel.getCategoryDescEn();
        String categoryDescGe = giftCardCategoryApiModel.getCategoryDescGe();
        String categoryImageUrl = giftCardCategoryApiModel.getCategoryImageUrl();
        String dictionaryKey = giftCardCategoryApiModel.getDictionaryKey();
        List<GiftCardOfferApiModel> offers = giftCardCategoryApiModel.getOffers();
        if (offers == null) {
            offers = C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(offers, 10));
        for (GiftCardOfferApiModel e : offers) {
            arrayList.add(m86436e(e));
        }
        return new C29791h(categoryId, categoryDescEn, categoryDescGe, categoryImageUrl, dictionaryKey, arrayList);
    }

    /* renamed from: e */
    private final C29792i m86436e(GiftCardOfferApiModel giftCardOfferApiModel) {
        long offerId = giftCardOfferApiModel.getOfferId();
        String offerLogoStorageId = giftCardOfferApiModel.getOfferLogoStorageId();
        String offerLogoStorageUrl = giftCardOfferApiModel.getOfferLogoStorageUrl();
        String offerNameEn = giftCardOfferApiModel.getOfferNameEn();
        String offerNameGe = giftCardOfferApiModel.getOfferNameGe();
        List<String> purchaseMethods = giftCardOfferApiModel.getPurchaseMethods();
        if (purchaseMethods == null) {
            purchaseMethods = C41341q.m119907j();
        }
        List<String> list = purchaseMethods;
        List<String> offerBrandListGe = giftCardOfferApiModel.getOfferBrandListGe();
        if (offerBrandListGe == null) {
            offerBrandListGe = C41341q.m119907j();
        }
        List<String> list2 = offerBrandListGe;
        List<String> offerBrandListEn = giftCardOfferApiModel.getOfferBrandListEn();
        if (offerBrandListEn == null) {
            offerBrandListEn = C41341q.m119907j();
        }
        return new C29792i(offerId, offerLogoStorageId, offerLogoStorageUrl, offerNameEn, offerNameGe, list, list2, offerBrandListEn);
    }

    /* renamed from: b */
    public final List mo67579b(List list) {
        C41536l.m120489i(list, "categories");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m86435d((GiftCardCategoryApiModel) it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo67580c(GiftCardNominationApiModel giftCardNominationApiModel) {
        C41536l.m120489i(giftCardNominationApiModel, "nominationApiModel");
        if (giftCardNominationApiModel.isValidNomination() != YesNoApiEntity.NO) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List mo67581f(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m86434a((GiftCardTransactionApiModel) it.next()));
        }
        return arrayList;
    }
}
