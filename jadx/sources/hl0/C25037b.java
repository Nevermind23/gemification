package hl0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import ml0.C26247a;
import ml0.C26248b;
import ml0.C26252e;
import ml0.C26254g;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.insurance.data.model.ContactInformationApiModel;
import p341ge.bog.mobilebank.insurance.data.model.PoliciesApiModel;
import p341ge.bog.mobilebank.insurance.data.model.PolicyApiModel;
import p341ge.bog.mobilebank.insurance.data.model.TravelPolicyApiModel;

/* renamed from: hl0.b */
public final class C25037b {
    /* renamed from: a */
    private final C26247a m79977a(ContactInformationApiModel contactInformationApiModel) {
        return new C26247a(contactInformationApiModel.getContactId(), contactInformationApiModel.getContactIdDescription_EN(), contactInformationApiModel.getContactIdDescription_GE(), contactInformationApiModel.getContactUsage(), contactInformationApiModel.getRoute());
    }

    /* renamed from: c */
    private final C26252e m79978c(PolicyApiModel policyApiModel) {
        boolean z;
        long docKey = policyApiModel.getDocKey();
        long clientKey = policyApiModel.getClientKey();
        String providerId = policyApiModel.getProviderId();
        String productType = policyApiModel.getProductType();
        String policyNo = policyApiModel.getPolicyNo();
        BigDecimal insLimit = policyApiModel.getInsLimit();
        String insLimitCcy = policyApiModel.getInsLimitCcy();
        BigDecimal insPremium = policyApiModel.getInsPremium();
        String insPremiumCcy = policyApiModel.getInsPremiumCcy();
        Date date = new Date(policyApiModel.getPolicyStartDate());
        Date date2 = new Date(policyApiModel.getPolicyEndDate());
        String payPeriod = policyApiModel.getPayPeriod();
        Long policyFileId = policyApiModel.getPolicyFileId();
        String carOwnerFirstName = policyApiModel.getCarOwnerFirstName();
        String carOwnerLastName = policyApiModel.getCarOwnerLastName();
        String carOwnerPin = policyApiModel.getCarOwnerPin();
        Date date3 = date2;
        Date date4 = new Date(policyApiModel.getPolicyCreateDate());
        Date date5 = new Date(policyApiModel.getCarOwnerBirthDate());
        String upperCase = policyApiModel.getCarNumber().toUpperCase(Locale.ROOT);
        C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (policyApiModel.getDirectDebitStatus() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String productName = policyApiModel.getProductName();
        String providerName = policyApiModel.getProviderName();
        String providerLogoUrl = policyApiModel.getProviderLogoUrl();
        if (providerLogoUrl == null) {
            providerLogoUrl = "";
        }
        Date date6 = date5;
        Date date7 = date3;
        String str = upperCase;
        return new C26252e(docKey, clientKey, providerId, productType, policyNo, insLimit, insLimitCcy, insPremium, insPremiumCcy, date4, date, date7, payPeriod, policyFileId, carOwnerFirstName, carOwnerLastName, carOwnerPin, date6, str, z2, productName, providerName, providerLogoUrl, policyApiModel.getProviderPhone(), policyApiModel.getPolicyPdfUrl(), policyApiModel.getPaymentPeriodName(), policyApiModel.isOwnersCar());
    }

    /* renamed from: d */
    private final C26254g m79979d(TravelPolicyApiModel travelPolicyApiModel) {
        String str;
        boolean z;
        String str2;
        long docKey = travelPolicyApiModel.getDocKey();
        long clientKey = travelPolicyApiModel.getClientKey();
        String providerId = travelPolicyApiModel.getProviderId();
        String prodType = travelPolicyApiModel.getProdType();
        if (prodType == null) {
            str = "";
        } else {
            str = prodType;
        }
        String policyNo = travelPolicyApiModel.getPolicyNo();
        BigDecimal insLimit = travelPolicyApiModel.getInsLimit();
        String insLimitCcy = travelPolicyApiModel.getInsLimitCcy();
        BigDecimal insPremium = travelPolicyApiModel.getInsPremium();
        String insPremiumCcy = travelPolicyApiModel.getInsPremiumCcy();
        Date date = new Date(travelPolicyApiModel.getPolicyStartDate());
        Date date2 = new Date(travelPolicyApiModel.getPolicyEndDate());
        Long policyFileId = travelPolicyApiModel.getPolicyFileId();
        String insuredFirstName = travelPolicyApiModel.getInsuredFirstName();
        String insuredLastName = travelPolicyApiModel.getInsuredLastName();
        String insuredFirstNameEn = travelPolicyApiModel.getInsuredFirstNameEn();
        String insuredLastNameEn = travelPolicyApiModel.getInsuredLastNameEn();
        String insuredPin = travelPolicyApiModel.getInsuredPin();
        if (travelPolicyApiModel.getAddCoverage() == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        String productName = travelPolicyApiModel.getProductName();
        String providerName = travelPolicyApiModel.getProviderName();
        String providerLogoUrl = travelPolicyApiModel.getProviderLogoUrl();
        if (providerLogoUrl == null) {
            str2 = "";
        } else {
            str2 = providerLogoUrl;
        }
        String policyPdfUrl = travelPolicyApiModel.getPolicyPdfUrl();
        List<ContactInformationApiModel> contactInformation = travelPolicyApiModel.getContactInformation();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(contactInformation, 10));
        for (ContactInformationApiModel a : contactInformation) {
            arrayList.add(m79977a(a));
        }
        return new C26254g(docKey, clientKey, providerId, str, policyNo, insLimit, insLimitCcy, insPremium, insPremiumCcy, date, date2, policyFileId, insuredFirstName, insuredLastName, insuredFirstNameEn, insuredLastNameEn, insuredPin, valueOf, productName, providerName, str2, policyPdfUrl, arrayList);
    }

    /* renamed from: b */
    public final C26248b mo63469b(PoliciesApiModel policiesApiModel) {
        C41536l.m120489i(policiesApiModel, "data");
        List<PolicyApiModel> policiesTpl = policiesApiModel.getPoliciesTpl();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(policiesTpl, 10));
        for (PolicyApiModel c : policiesTpl) {
            arrayList.add(m79978c(c));
        }
        List<TravelPolicyApiModel> policiesTri = policiesApiModel.getPoliciesTri();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(policiesTri, 10));
        for (TravelPolicyApiModel d : policiesTri) {
            arrayList2.add(m79979d(d));
        }
        return new C26248b(arrayList, arrayList2);
    }
}
