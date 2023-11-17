package p370bo;

import ci1.C40455c;
import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40467o;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.categorypackages.data.entity.ApplicationFieldsEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.BenefitTypeApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.DebitCardEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivateResponseEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageBenefitEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageDelReasonsEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageLimitApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.ServiceCenterEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.TransactionEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.packages.PackageApiModel;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;

/* renamed from: bo.a */
public interface C10343a {
    @C40467o(".?serviceId=CLIENTS_CANCEL_PACKAGE")
    /* renamed from: C */
    C40734b mo26950C(@C40472t("packageId") long j, @C40472t("delReason") String str);

    @C40458f(".?serviceId=COMMON_GET_ALL_SC_ROUTES")
    /* renamed from: b */
    C40762x<ServiceCenterEntity> mo26951b(@C40472t("bankLine") String str);

    @C40458f(".?serviceId=CARDS_PACKAGE_APPLICATIONS_GET_ELIGIBLE_CARD_TYPES")
    /* renamed from: c0 */
    C40762x<List<DebitCardEntity>> mo26952c0();

    @C40458f(".?serviceId=CLIENTS_SET_PACKAGE_DEL_REASON")
    /* renamed from: d0 */
    C40734b mo26953d0(@C40472t("packageId") long j, @C40472t("delReason") String str);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_DEL_REASONS")
    /* renamed from: e0 */
    C40762x<List<PackageDelReasonsEntity>> mo26954e0(@C40472t("packageName") String str);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_SERVICE_LIST_FOR_CLIENT_V2")
    /* renamed from: f0 */
    C40762x<List<PackageApiModel>> mo26955f0(@C40472t("packageGroup") String str);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_APPLICATION_FIELDS")
    /* renamed from: g0 */
    C40762x<ApplicationFieldsEntity> mo26956g0(@C40472t("existingPackageName") String str, @C40472t("newPackageName") String str2);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_BENEFIT_TYPES")
    /* renamed from: h0 */
    C40762x<List<BenefitTypeApiModel>> mo26957h0(@C40472t("benefitType") String str);

    @C40458f(".?serviceId=CARDS_GET_CONCIERGE_PRE_CONTRACT")
    /* renamed from: m */
    C40762x<PreContractEntity> mo26958m(@C40472t("preContractType") String str);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_BENEFITS")
    /* renamed from: o */
    C40762x<List<PackageBenefitEntity>> mo26959o(@C40472t("packageName") String str, @C40472t("pageName") String str2);

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_LIMIT_CHARGE")
    /* renamed from: p */
    C40762x<List<TransactionEntity>> mo26960p(@C40472t("packageId") long j);

    @C40457e
    @C40467o(".?serviceId=CARDS_SET_CONCIERGE_SERVICE ")
    /* renamed from: s */
    C40734b mo26961s(@C40472t("cancelConciergeService") String str, @C40455c("preContractText") String str2);

    @C40458f(".?serviceId=CLIENTS_GET_SOLO_CRITERIA")
    /* renamed from: u */
    C40762x<YesNoApiEntity> mo26962u();

    @C40457e
    @C40467o(".?serviceId=CLIENTS_PACKAGE_ACTIVATION_V2")
    C40762x<PackageActivateResponseEntity> useOtpForActionSinglePost(@C40456d HashMap<String, Object> hashMap);

    @C40458f(".?serviceId=CLIENTS_GET_CLIENT_PACKAGE_LIMIT")
    /* renamed from: v */
    C40762x<PackageLimitApiModel> mo26964v();

    @C40458f(".?serviceId=CLIENTS_GET_PACKAGE_PRE_CONTRACT")
    /* renamed from: y */
    C40762x<PreContractEntity> mo26965y(@C40472t("activePackageName") String str, @C40472t("activePackageDesc") String str2, @C40472t("newPackageName") String str3, @C40472t("newPackageDesc") String str4, @C40472t("commissionPaymentPeriod") String str5, @C40472t("email") String str6);
}
