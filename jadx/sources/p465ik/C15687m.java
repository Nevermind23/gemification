package p465ik;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.AutoLiabilityInsuranceProviderApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.GetInsuranceCardsApiResponseModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitTypeApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.PolicyUrlApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.RegisterPolicyResultApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: ik.m */
public interface C15687m {

    /* renamed from: ik.m$a */
    public static final class C15688a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m56522a(C15687m mVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "TPL";
                }
                return mVar.mo42992e(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInsuranceCards");
        }

        /* renamed from: b */
        public static /* synthetic */ C40762x m56523b(C15687m mVar, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "TPL";
                }
                return mVar.mo42989b(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLimits");
        }
    }

    @C40458f(".")
    /* renamed from: a */
    C40762x<BankApiResponse<RegisterPolicyResultApiModel>> mo42988a(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=INSURANCE_GET_LIMIT_TYPES")
    /* renamed from: b */
    C40762x<List<LimitTypeApiModel>> mo42989b(@C40472t("prodType") String str);

    @C40458f(".?serviceId=INSURANCE_GET_MTPL_PROVIDERS_AND_PACKAGES")
    /* renamed from: c */
    C40762x<List<AutoLiabilityInsuranceProviderApiModel>> mo42990c(@C40472t("ccy") String str);

    @C40458f(".?serviceId=INSURANCE_GET_POLICY_PDF")
    /* renamed from: d */
    C40762x<PolicyUrlApiModel> mo42991d(@C40472t("docKey") long j);

    @C40458f(".?serviceId=CARDS_GET_INSURANCE_CARDS")
    /* renamed from: e */
    C40762x<GetInsuranceCardsApiResponseModel> mo42992e(@C40472t("prodType") String str);
}
