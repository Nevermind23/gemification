package p384co;

import hd0.C24978b;
import j31.C36725a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.data.entity.ApplicationFieldsEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.BenefitTypeApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.DebitCardEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.ExternalFileApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivateResponseEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageBenefitEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageDelReasonsEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.PackageLimitApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.ServiceCenterEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.TransactionEntity;
import p341ge.bog.mobilebank.categorypackages.data.entity.packages.PackageApiModel;
import p341ge.bog.mobilebank.categorypackages.data.entity.packages.PackageDetailsApiModel;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;
import p455ho.C15548b;
import p455ho.C15550d;
import p455ho.C15551e;
import p455ho.C15552f;
import p455ho.C15554g;
import p455ho.C15555h;
import p455ho.C15556i;
import p455ho.C15557j;
import p455ho.C15558k;
import p455ho.C15559l;
import p469io.C15708a;
import p469io.C15709b;
import p469io.C15710c;
import p717bs.C19401a;

/* renamed from: co.a */
public final class C10520a {
    /* renamed from: b */
    private final C15708a m38111b(PackageDetailsApiModel packageDetailsApiModel) {
        C15710c cVar;
        C24978b bVar;
        C24978b bVar2;
        C24978b bVar3;
        C24978b bVar4;
        long j;
        long packageId = packageDetailsApiModel.getPackageId();
        String packageName = packageDetailsApiModel.getPackageName();
        String packageDesc = packageDetailsApiModel.getPackageDesc();
        C15552f a = C15552f.f44150e.mo42740a(packageDetailsApiModel.getFeePeriodType());
        String feeCcy = packageDetailsApiModel.getFeeCcy();
        Double feeAmount = packageDetailsApiModel.getFeeAmount();
        String limitType = packageDetailsApiModel.getLimitType();
        Double initialLimitAmount = packageDetailsApiModel.getInitialLimitAmount();
        Long startDate = packageDetailsApiModel.getStartDate();
        Long endDate = packageDetailsApiModel.getEndDate();
        Long nextFeeGenDate = packageDetailsApiModel.getNextFeeGenDate();
        Double feeOverdueAmount = packageDetailsApiModel.getFeeOverdueAmount();
        Long graceEndDate = packageDetailsApiModel.getGraceEndDate();
        if (packageDetailsApiModel.getStatus() != null) {
            cVar = C15710c.valueOf(packageDetailsApiModel.getStatus().name());
        } else {
            cVar = null;
        }
        C15710c cVar2 = cVar;
        Integer priority = packageDetailsApiModel.getPriority();
        YesNoApiEntity displayActivePackageChange = packageDetailsApiModel.getDisplayActivePackageChange();
        if (displayActivePackageChange == null || (bVar = C19401a.m64892a(displayActivePackageChange)) == null) {
            bVar = C24978b.NO;
        }
        C24978b bVar5 = bVar;
        YesNoApiEntity displayStandardFee = packageDetailsApiModel.getDisplayStandardFee();
        if (displayStandardFee == null || (bVar2 = C19401a.m64892a(displayStandardFee)) == null) {
            bVar2 = C24978b.NO;
        }
        C24978b bVar6 = bVar2;
        YesNoApiEntity displayTransactionStatistics = packageDetailsApiModel.getDisplayTransactionStatistics();
        if (displayTransactionStatistics == null || (bVar3 = C19401a.m64892a(displayTransactionStatistics)) == null) {
            bVar3 = C24978b.NO;
        }
        C24978b bVar7 = bVar3;
        YesNoApiEntity closable = packageDetailsApiModel.getClosable();
        if (closable == null || (bVar4 = C19401a.m64892a(closable)) == null) {
            bVar4 = C24978b.NO;
        }
        C24978b bVar8 = bVar4;
        Long closePackageId = packageDetailsApiModel.getClosePackageId();
        if (closePackageId != null) {
            j = closePackageId.longValue();
        } else {
            j = -1;
        }
        return new C15708a(packageId, packageName, packageDesc, a, feeCcy, feeAmount, limitType, initialLimitAmount, startDate, endDate, nextFeeGenDate, feeOverdueAmount, graceEndDate, cVar2, priority, bVar5, bVar6, bVar7, bVar8, j);
    }

    /* renamed from: e */
    private final C15551e m38112e(DebitCardEntity debitCardEntity) {
        C36725a aVar;
        String cardNameKey = debitCardEntity.getCardNameKey();
        String typeName = debitCardEntity.getTypeName();
        ExternalFileEntity cardSmallImage = debitCardEntity.getCardSmallImage();
        if (cardSmallImage != null) {
            aVar = cardSmallImage.asDomainModel();
        } else {
            aVar = null;
        }
        return new C15551e(cardNameKey, typeName, aVar, debitCardEntity.getSubProductCode(), debitCardEntity.getCardPriceValue());
    }

    /* renamed from: a */
    public final List mo27249a(List list) {
        String str;
        C41536l.m120489i(list, "apiModel");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BenefitTypeApiModel benefitTypeApiModel = (BenefitTypeApiModel) it.next();
            String headerTextDKey = benefitTypeApiModel.getHeaderTextDKey();
            String str2 = "";
            if (headerTextDKey == null) {
                headerTextDKey = str2;
            }
            String detailsTextDKey = benefitTypeApiModel.getDetailsTextDKey();
            if (detailsTextDKey == null) {
                detailsTextDKey = str2;
            }
            ExternalFileApiModel externalFile = benefitTypeApiModel.getExternalFile();
            if (externalFile != null) {
                str = externalFile.getFileUrl();
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            arrayList.add(new C15550d(headerTextDKey, detailsTextDKey, str2));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo27250c(List list) {
        int i;
        C15710c cVar;
        C15708a aVar;
        C15708a aVar2;
        Iterator it;
        ArrayList arrayList;
        List list2 = list;
        C41536l.m120489i(list2, "apiModel");
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PackageApiModel packageApiModel = (PackageApiModel) it2.next();
            long clientKey = packageApiModel.getClientKey();
            String packageName = packageApiModel.getPackageName();
            C41536l.m120486f(packageName);
            String description = packageApiModel.getDescription();
            Integer priority = packageApiModel.getPriority();
            if (priority != null) {
                i = priority.intValue();
            } else {
                i = -1;
            }
            int i2 = i;
            String feePeriodType = packageApiModel.getFeePeriodType();
            Double feeAmount = packageApiModel.getFeeAmount();
            String feeCcy = packageApiModel.getFeeCcy();
            Double monthlyFeeAmount = packageApiModel.getMonthlyFeeAmount();
            String monthlyFeeCcy = packageApiModel.getMonthlyFeeCcy();
            Double annualFeeAmount = packageApiModel.getAnnualFeeAmount();
            String annualFeeCcy = packageApiModel.getAnnualFeeCcy();
            if (packageApiModel.getPackageStatus() != null) {
                cVar = C15710c.valueOf(packageApiModel.getPackageStatus().name());
            } else {
                cVar = null;
            }
            String recommendedPackage = packageApiModel.getRecommendedPackage();
            String limitType = packageApiModel.getLimitType();
            Double initialLimitAmount = packageApiModel.getInitialLimitAmount();
            String packageGroup = packageApiModel.getPackageGroup();
            String advertisementText = packageApiModel.getAdvertisementText();
            Boolean showDefault = packageApiModel.getShowDefault();
            PackageDetailsApiModel activePackageDetails = packageApiModel.getActivePackageDetails();
            if (activePackageDetails != null) {
                aVar = m38111b(activePackageDetails);
            } else {
                aVar = null;
            }
            PackageDetailsApiModel pendingPackageDetails = packageApiModel.getPendingPackageDetails();
            if (pendingPackageDetails != null) {
                aVar2 = m38111b(pendingPackageDetails);
            } else {
                aVar2 = null;
            }
            List<PackageBenefitEntity> packageBenefits = packageApiModel.getPackageBenefits();
            if (packageBenefits != null) {
                it = it2;
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(packageBenefits, 10));
                for (PackageBenefitEntity g : packageBenefits) {
                    arrayList3.add(mo27253g(g));
                }
                arrayList = arrayList3;
            } else {
                it = it2;
                arrayList = null;
            }
            arrayList2.add(new C15709b(clientKey, packageName, description, i2, feePeriodType, feeAmount, feeCcy, monthlyFeeAmount, monthlyFeeCcy, annualFeeAmount, annualFeeCcy, cVar, recommendedPackage, limitType, initialLimitAmount, packageGroup, advertisementText, showDefault, aVar, aVar2, arrayList));
            it2 = it;
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final C15548b mo27251d(ApplicationFieldsEntity applicationFieldsEntity) {
        C41536l.m120489i(applicationFieldsEntity, "entity");
        return new C15548b(applicationFieldsEntity.getApplicationFields());
    }

    /* renamed from: f */
    public final C15554g mo27252f(PackageActivateResponseEntity packageActivateResponseEntity) {
        C41536l.m120489i(packageActivateResponseEntity, "entity");
        return new C15554g(packageActivateResponseEntity.getGenesysActivityRegistered(), packageActivateResponseEntity.getDigitalSoloPackageActivated(), packageActivateResponseEntity.getRbPackageActivated(), packageActivateResponseEntity.getNewPackageName(), packageActivateResponseEntity.getSoloPackageActivated(), packageActivateResponseEntity.getStatus(), packageActivateResponseEntity.getPackageActivationDate());
    }

    /* renamed from: g */
    public final C15555h mo27253g(PackageBenefitEntity packageBenefitEntity) {
        C24978b bVar;
        C36725a aVar;
        C41536l.m120489i(packageBenefitEntity, "entity");
        String activeBadgeSourceKey = packageBenefitEntity.getActiveBadgeSourceKey();
        String activeDeepLinkParams = packageBenefitEntity.getActiveDeepLinkParams();
        Integer benefTypeId = packageBenefitEntity.getBenefTypeId();
        YesNoApiEntity benefitBadge = packageBenefitEntity.getBenefitBadge();
        if (benefitBadge != null) {
            bVar = C19401a.m64892a(benefitBadge);
        } else {
            bVar = null;
        }
        String benefitDictionaryKey = packageBenefitEntity.getBenefitDictionaryKey();
        String benefitIconSubProduct = packageBenefitEntity.getBenefitIconSubProduct();
        String benefitTypeName = packageBenefitEntity.getBenefitTypeName();
        String channelCode = packageBenefitEntity.getChannelCode();
        String deepLinkParams = packageBenefitEntity.getDeepLinkParams();
        ExternalFileEntity externalFile = packageBenefitEntity.getExternalFile();
        if (externalFile != null) {
            aVar = externalFile.asDomainModel();
        } else {
            aVar = null;
        }
        return new C15555h(activeBadgeSourceKey, activeDeepLinkParams, benefTypeId, bVar, benefitDictionaryKey, benefitIconSubProduct, benefitTypeName, channelCode, deepLinkParams, aVar, packageBenefitEntity.getId(), packageBenefitEntity.getOrderNo(), packageBenefitEntity.getPackageId(), packageBenefitEntity.getPackageName(), packageBenefitEntity.getPageName(), packageBenefitEntity.getProductStatus(), packageBenefitEntity.getValueDictionaryKey(), packageBenefitEntity.getStandardConditionDictionaryKey(), packageBenefitEntity.getConditionsUrl());
    }

    /* renamed from: h */
    public final C15558k mo27254h(ServiceCenterEntity serviceCenterEntity) {
        ArrayList arrayList;
        C41536l.m120489i(serviceCenterEntity, "entity");
        long id = serviceCenterEntity.getId();
        long parentId = serviceCenterEntity.getParentId();
        String langCode = serviceCenterEntity.getLangCode();
        String pointType = serviceCenterEntity.getPointType();
        String pointValue = serviceCenterEntity.getPointValue();
        String pointDesc = serviceCenterEntity.getPointDesc();
        String hasSoloSc = serviceCenterEntity.getHasSoloSc();
        String customerType = serviceCenterEntity.getCustomerType();
        List<ServiceCenterEntity> points = serviceCenterEntity.getPoints();
        if (points != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(points, 10));
            for (ServiceCenterEntity h : points) {
                arrayList2.add(mo27254h(h));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C15558k(id, parentId, langCode, pointType, pointValue, pointDesc, hasSoloSc, customerType, arrayList);
    }

    /* renamed from: i */
    public final C15559l mo27255i(TransactionEntity transactionEntity) {
        C41536l.m120489i(transactionEntity, "entity");
        return new C15559l(transactionEntity.getAcctNo(), transactionEntity.getAmount(), transactionEntity.getCcy(), transactionEntity.getDocKey(), transactionEntity.getInpSysdate(), transactionEntity.getLastFour(), transactionEntity.getNomination(), transactionEntity.getPackageId(), transactionEntity.getPostDate(), transactionEntity.getProdGroup(), transactionEntity.getProdGroupDesc(), transactionEntity.getTranStatus());
    }

    /* renamed from: j */
    public final List mo27256j(List list) {
        C41536l.m120489i(list, "debitCardEntities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m38112e((DebitCardEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List mo27257k(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo27253g((PackageBenefitEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List mo27258l(List list) {
        C41536l.m120489i(list, "entity");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageDelReasonsEntity packageDelReasonsEntity = (PackageDelReasonsEntity) it.next();
            arrayList.add(new C15556i(packageDelReasonsEntity.getPackageName(), packageDelReasonsEntity.getDelReason(), packageDelReasonsEntity.getDelReasonDictionaryKey()));
        }
        return arrayList;
    }

    /* renamed from: m */
    public final C15557j mo27259m(PackageLimitApiModel packageLimitApiModel) {
        C41536l.m120489i(packageLimitApiModel, "packageLimit");
        return new C15557j(packageLimitApiModel.getInitialLimitAmount(), packageLimitApiModel.getInitialLimitCount(), packageLimitApiModel.getLimitAmount(), packageLimitApiModel.getLimitCount());
    }

    /* renamed from: n */
    public final List mo27260n(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo27255i((TransactionEntity) it.next()));
        }
        return arrayList;
    }
}
