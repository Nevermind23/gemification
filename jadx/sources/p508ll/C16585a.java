package p508ll;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.List;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantDetailsApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantStoreApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplObjectApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplScheduleHistoryItemApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BplCategopriesWithMerchantsApiEntity;

/* renamed from: ll.a */
public interface C16585a {
    @C40458f(".?serviceId=LOANS_SET_LND_NAME")
    /* renamed from: d */
    C40734b mo43734d(@C40472t("loanKey") long j, @C40472t("loanName") String str);

    @C40458f(".?serviceId=OFFERS_BNPL_MERCHANT_DETAILS")
    /* renamed from: g */
    C40762x<List<BnplMerchantDetailsApiEntity>> mo43735g(@C40472t("merchantClientId") long j, @C40472t("brandName") String str);

    @C40458f(".?serviceId=OFFERS_BNPL_CATEGORIES_WITH_MERCHANTS")
    /* renamed from: h */
    C40762x<BplCategopriesWithMerchantsApiEntity> mo43736h(@C40472t("getAllMerchants") Boolean bool, @C40472t("searchString") String str, @C40472t("categoryId") Long l);

    @C40458f(".?serviceId=OFFERS_BNPL_MERCHANT_ADDRESSES")
    /* renamed from: t */
    C40762x<List<BnplMerchantStoreApiEntity>> mo43737t(@C40472t("merchantClientId") long j, @C40472t("brandName") String str);

    @C40458f(".?serviceId=LOANS_GET_BNPL_REPAYMENTS_AND_SCHEDULE")
    /* renamed from: u */
    C40762x<BnplScheduleHistoryItemApiEntity> mo43738u(@C40472t("loanKey") long j);

    @C40458f(".?serviceId=LOANS_GET_BNPL_WITH_DETAILS")
    /* renamed from: v */
    C40749p<BnplObjectApiEntity> mo43739v();
}
