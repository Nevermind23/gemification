package ql0;

import g91.C32289b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.AdditionalCoverageApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.PolicyUrlApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.TravelInsuranceProvidersApiModel;
import ul0.C28874a;
import ul0.C28877d;
import ul0.C28880g;

/* renamed from: ql0.d */
public final class C27850d {
    /* renamed from: c */
    private final List m86046c(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdditionalCoverageApiModel additionalCoverageApiModel = (AdditionalCoverageApiModel) it.next();
            arrayList.add(new C28874a(additionalCoverageApiModel.getCategory(), additionalCoverageApiModel.getName(), additionalCoverageApiModel.getLimit(), additionalCoverageApiModel.isCovered()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo67367a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "source");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TravelInsuranceProvidersApiModel travelInsuranceProvidersApiModel = (TravelInsuranceProvidersApiModel) it.next();
            List c = m86046c(travelInsuranceProvidersApiModel.getAdditionalCoverage());
            Integer errorCode = travelInsuranceProvidersApiModel.getErrorCode();
            C28880g gVar = null;
            if (errorCode != null && errorCode.intValue() == 0) {
                Integer valueOf = Integer.valueOf(travelInsuranceProvidersApiModel.getErrorCode().intValue());
                String hashKey = travelInsuranceProvidersApiModel.getHashKey();
                Double premium = travelInsuranceProvidersApiModel.getPremium();
                if (premium != null) {
                    gVar = new C28880g(c, valueOf, hashKey, premium.doubleValue(), travelInsuranceProvidersApiModel.getPremiumCcy(), travelInsuranceProvidersApiModel.getProductId(), C32289b0.m95091c(travelInsuranceProvidersApiModel.getProviderLogoURL()), travelInsuranceProvidersApiModel.getProviderName(), travelInsuranceProvidersApiModel.getSessionId(), travelInsuranceProvidersApiModel.getProviderId(), travelInsuranceProvidersApiModel.getInsurancePremium(), travelInsuranceProvidersApiModel.getLuggagePremium());
                }
            }
            arrayList.add(gVar);
        }
        return C41358y.m120004T(arrayList);
    }

    /* renamed from: b */
    public final C28877d mo67368b(PolicyUrlApiModel policyUrlApiModel) {
        C41536l.m120489i(policyUrlApiModel, "policyApiModel");
        return new C28877d(policyUrlApiModel.getPolicyUrl());
    }
}
