package p479jk;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.PolicyApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

/* renamed from: jk.d */
public final class C16209d {
    /* renamed from: a */
    public final PolicyDetailsModel mo43224a(PolicyApiModel policyApiModel) {
        boolean z;
        C41536l.m120489i(policyApiModel, "data");
        long docKey = policyApiModel.getDocKey();
        long clientKey = policyApiModel.getClientKey();
        String providerId = policyApiModel.getProviderId();
        String productType = policyApiModel.getProductType();
        String policyNo = policyApiModel.getPolicyNo();
        BigDecimal insLimit = policyApiModel.getInsLimit();
        String insLimitCcy = policyApiModel.getInsLimitCcy();
        BigDecimal insPremium = policyApiModel.getInsPremium();
        String insPremiumCcy = policyApiModel.getInsPremiumCcy();
        Date date = new Date(policyApiModel.getPolicyCreateDate());
        Date date2 = new Date(policyApiModel.getPolicyStartDate());
        Date date3 = new Date(policyApiModel.getPolicyEndDate());
        String payPeriod = policyApiModel.getPayPeriod();
        Long valueOf = Long.valueOf(policyApiModel.getPolicyFileId());
        String carOwnerFirstName = policyApiModel.getCarOwnerFirstName();
        String carOwnerLastName = policyApiModel.getCarOwnerLastName();
        String carOwnerPin = policyApiModel.getCarOwnerPin();
        Date date4 = date3;
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
        return new PolicyDetailsModel(docKey, clientKey, providerId, productType, policyNo, insLimit, insLimitCcy, insPremium, insPremiumCcy, date, date2, date4, payPeriod, valueOf, carOwnerFirstName, carOwnerLastName, carOwnerPin, date6, upperCase, z2, productName, providerName, providerLogoUrl, policyApiModel.getProviderPhone(), policyApiModel.getPolicyPdfUrl(), policyApiModel.getPaymentPeriodName(), policyApiModel.isOwnersCar());
    }
}
