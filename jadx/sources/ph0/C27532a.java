package ph0;

import ci1.C40453a;
import ci1.C40458f;
import ci1.C40462j;
import ci1.C40467o;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import java.util.Map;
import p341ge.bog.mobilebank.giftcards.data.model.BffExternalFileApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.ClientGiftCardsContainerApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardCategoryApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardNominationApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardOfferDetailsApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionsApiModelContainer;
import p341ge.bog.mobilebank.giftcards.data.model.GiveAwayGiftCardRequestModel;
import p341ge.bog.mobilebank.giftcards.data.model.LookupApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.PhoneNumberValidationResultApiModel;
import p341ge.bog.mobilebank.giftcards.data.model.PurchaseGiftCardRequestModel;

/* renamed from: ph0.a */
public interface C27532a {
    @C40458f("v1/transactional/common/lookup")
    /* renamed from: G */
    C40762x<List<LookupApiModel>> mo66848G(@C40472t("lookupName") String str);

    @C40458f("v1/transactional/mbank-ibank/gift-cards/giftcard-offer-details")
    /* renamed from: H */
    C40762x<GiftCardOfferDetailsApiModel> mo66849H(@C40472t("offerId") long j, @C40472t("viewType") String str, @C40472t("phoneNumber") String str2);

    @C40458f("v1/transactional/mbank-ibank/gift-cards/check-giftcard-nomination")
    /* renamed from: R */
    C40762x<GiftCardNominationApiModel> mo66850R(@C40472t("nomination") String str);

    @C40458f("v1/transactional/mbank-ibank/gift-cards/client-giftcards")
    /* renamed from: S */
    C40762x<ClientGiftCardsContainerApiModel> mo66851S(@C40472t("clientKey") String str);

    @C40458f("v1/transactional/mbank-ibank/gift-cards/statements")
    /* renamed from: T */
    C40762x<GiftCardTransactionsApiModelContainer> mo66852T(@C40472t("giftCardId") long j, @C40472t("clientKey") String str, @C40472t("size") int i, @C40472t("page") int i2);

    @C40458f("v1/transactional/mbank-ibank/gift-cards/merchant-giftcards")
    /* renamed from: U */
    C40762x<List<GiftCardCategoryApiModel>> mo66853U();

    @C40467o("v1/transactional/mbank-ibank/gift-cards/giveaway-giftcard")
    /* renamed from: V */
    C40734b mo66854V(@C40453a GiveAwayGiftCardRequestModel giveAwayGiftCardRequestModel);

    @C40467o("v1/transactional/mbank-ibank/gift-cards/purchase-giftcard")
    /* renamed from: W */
    C40734b mo66855W(@C40462j Map<String, String> map, @C40453a PurchaseGiftCardRequestModel purchaseGiftCardRequestModel);

    @C40458f("v1/transactional/common/external/file")
    /* renamed from: i */
    C40762x<List<BffExternalFileApiModel>> mo66856i(@C40472t("fileType") String str);

    @C40467o("v1/transactional/mbank-ibank/gift-cards/mark-as-seen")
    /* renamed from: j */
    C40734b mo66857j(@C40472t("giftCardId") long j);

    @C40467o("v1/transactional/common/validate-phone-number")
    /* renamed from: k */
    C40762x<PhoneNumberValidationResultApiModel> mo66858k(@C40472t("phoneNumber") String str);

    @C40467o("v1/transactional/mbank-ibank/gift-cards/resend-giftcard")
    /* renamed from: x */
    C40734b mo66859x(@C40472t("giftCardId") long j);
}
