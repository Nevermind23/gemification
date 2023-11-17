package pl0;

import ci1.C40458f;
import ci1.C40472t;
import ci1.C40473u;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.LimitTypeApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.PolicyUrlApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.PreviouslyInsuredPersonApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.RegisterPolicyResultApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.TravelInsuranceProvidersApiModel;

/* renamed from: pl0.a */
public interface C27599a {
    @C40458f(".")
    /* renamed from: a */
    C40762x<RegisterPolicyResultApiModel> mo66967a(@C40473u HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=INSURANCE_GET_LIMIT_TYPES")
    /* renamed from: b */
    C40762x<List<LimitTypeApiModel>> mo66968b(@C40472t("prodType") String str);

    @C40458f(".?serviceId=INSURANCE_GET_POLICY_PDF")
    /* renamed from: c */
    C40762x<PolicyUrlApiModel> mo66969c(@C40472t("docKey") int i);

    @C40458f(".?serviceId=INSURANCE_GET_TRAVEL_PRICES")
    /* renamed from: d */
    C40762x<List<TravelInsuranceProvidersApiModel>> mo66970d(@C40472t("startDate") String str, @C40472t("endDate") String str2, @C40472t("ccy") String str3, @C40472t("addCoverage") String str4, @C40473u Map<String, String> map);

    @C40458f(".?serviceId=INSURANCE_GET_INSURED_INDIVIDUALS")
    /* renamed from: e */
    C40762x<List<PreviouslyInsuredPersonApiModel>> mo66971e(@C40472t("customerId") String str);
}
