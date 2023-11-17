package un0;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserInterestTypeApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserIsAllowedApiEntity;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleClientInterestApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOffersApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.OfferProgressApiModel;

/* renamed from: un0.a */
public interface C18263a {
    @C40458f(".?serviceId=COMMON_GET_BNPL_MERCHANT_ICONS_LIST")
    /* renamed from: P */
    C40762x<LifestyleBnplApiModel> mo45908P();

    @C40458f(".?serviceId=OFFERS_GET_LIFESTYLE_OFFERS_PROGRESS")
    /* renamed from: Z */
    C40762x<List<OfferProgressApiModel>> mo45909Z();

    @C40458f(".?serviceId=OFFERS_LIFESTYLE_DELETE_CLIENT_INTERESTS")
    /* renamed from: a */
    C40734b mo45910a(@C40472t("interestIds") String str);

    @C40458f(".?serviceId=OFFERS_GET_LIFESTYLE_OFFERS")
    /* renamed from: b */
    C40762x<LifestyleOffersApiModel> mo45911b(@C40472t("offerType") String str);

    @C40458f(".?serviceId=OFFERS_GET_LIFESTYLE_CHOOSER_CLIENT_INTERESTS")
    /* renamed from: c */
    C40762x<List<LifestyleClientInterestApiModel>> mo45912c();

    @C40458f(".?serviceId=OFFERS_GET_LIFESTYLE_CHOOSER_INTEREST_TYPES")
    /* renamed from: d */
    C40762x<List<LifestyleChooserInterestTypeApiModel>> mo45913d();

    @C40458f(".?serviceId=OFFERS_LIFESTYLE_CHOOSER_CHECK_POPUP_ALLOWED ")
    /* renamed from: e */
    C40762x<LifestyleChooserIsAllowedApiEntity> mo45914e();

    @C40458f(".?serviceId=OFFERS_LIFESTYLE_ADD_CLIENT_INTERESTS")
    /* renamed from: f */
    C40734b mo45915f(@C40472t("interestType") String str, @C40472t("interestSubType") String str2);
}
