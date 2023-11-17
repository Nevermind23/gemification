package tt0;

import ci1.C40458f;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StarsGuideProductsApiModel;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StatusBenefitsApiModel;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StatusDetailsApiModel;

/* renamed from: tt0.a */
public interface C38795a {
    @C40458f(".?serviceId=COMMON_GET_LOOKUP_DATA&lookupName=PLUS_WELCOME_PAGE ")
    /* renamed from: a */
    C40762x<List<LookupEntity>> mo92498a();

    @C40458f(".?serviceId=BONUSES_GET_CLIENT_PLUS_STATUS_DETAILS")
    /* renamed from: b */
    C40762x<StatusDetailsApiModel> mo92499b();

    @C40458f(".?serviceId=PLUS_GET_STATUS_AND_BENEFITS")
    /* renamed from: c */
    C40762x<List<StatusBenefitsApiModel>> mo92500c();

    @C40458f(".?serviceId=BONUSES_GET_BNS_STAR_PRODUCTS")
    /* renamed from: d */
    C40762x<List<StarsGuideProductsApiModel>> mo92501d();
}
