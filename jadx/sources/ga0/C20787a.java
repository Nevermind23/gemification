package ga0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka0.C25692a;
import ka0.C25693b;
import ka0.C25694c;
import ka0.C25695d;
import ka0.C25696e;
import ka0.C25697f;
import ka0.C25698g;
import ka0.C25699h;
import ka0.C25700i;
import ka0.C25701j;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.CasResultEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.DepositFeatureEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.DepositPurposeEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.DepositTypeDetailsEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.DepositsEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.InterestRateEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.OpenDepositEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.PurposeEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.StoResultEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.WithdrawalTypeEntity;
import p717bs.C19401a;

/* renamed from: ga0.a */
public final class C20787a {
    /* renamed from: c */
    private final C25692a m67266c(CasResultEntity casResultEntity) {
        YesNoApiEntity openedCAS = casResultEntity.getOpenedCAS();
        return new C25692a(openedCAS != null ? C19401a.m64892a(openedCAS) : null);
    }

    /* renamed from: g */
    private final C25697f m67267g(DepositsEntity depositsEntity) {
        return new C25697f(depositsEntity.getAgreeKey(), depositsEntity.getAppId(), depositsEntity.getDepositPdfUrl());
    }

    /* renamed from: j */
    private final C25700i m67268j(StoResultEntity stoResultEntity) {
        YesNoApiEntity openedSTO = stoResultEntity.getOpenedSTO();
        return new C25700i(openedSTO != null ? C19401a.m64892a(openedSTO) : null);
    }

    /* renamed from: a */
    public final List mo49369a(PurposeEntity purposeEntity) {
        C41536l.m120489i(purposeEntity, "purposeEntity");
        List<DepositPurposeEntity> purposes = purposeEntity.getPurposes();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(purposes, 10));
        for (DepositPurposeEntity e : purposes) {
            arrayList.add(mo49372e(e));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo49370b(List list) {
        C41536l.m120489i(list, "depositDetails");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25696e f = mo49373f((DepositTypeDetailsEntity) it.next());
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C25693b mo49371d(DepositFeatureEntity depositFeatureEntity) {
        C41536l.m120489i(depositFeatureEntity, "feature");
        return new C25693b(depositFeatureEntity.getLookupName(), depositFeatureEntity.getLookupValue(), depositFeatureEntity.getDictionaryKey());
    }

    /* renamed from: e */
    public final C25694c mo49372e(DepositPurposeEntity depositPurposeEntity) {
        C41536l.m120489i(depositPurposeEntity, "purposeEntity");
        return new C25694c(depositPurposeEntity.getId(), depositPurposeEntity.getIconUrl(), depositPurposeEntity.getLookupName(), depositPurposeEntity.getLookupValue(), depositPurposeEntity.getDictionaryKeyId(), depositPurposeEntity.getOrderNumber(), depositPurposeEntity.getDictionaryKey());
    }

    /* renamed from: f */
    public final C25696e mo49373f(DepositTypeDetailsEntity depositTypeDetailsEntity) {
        C25695d valueOf;
        String str;
        String str2;
        String str3;
        C41536l.m120489i(depositTypeDetailsEntity, "depositDetailsEntity");
        String prodType = depositTypeDetailsEntity.getProdType();
        String value = depositTypeDetailsEntity.getValue();
        if (value == null || (valueOf = C25695d.valueOf(value)) == null) {
            return null;
        }
        String dictionaryKey = depositTypeDetailsEntity.getDictionaryKey();
        Boolean hasPrimaryAccount = depositTypeDetailsEntity.getHasPrimaryAccount();
        Boolean hasInterestAccount = depositTypeDetailsEntity.getHasInterestAccount();
        String advantagesKey = depositTypeDetailsEntity.getAdvantagesKey();
        String conditionsKey = depositTypeDetailsEntity.getConditionsKey();
        String minAmountKey = depositTypeDetailsEntity.getMinAmountKey();
        String minMaxTermsKey = depositTypeDetailsEntity.getMinMaxTermsKey();
        BigDecimal preContractIrrMinAmount = depositTypeDetailsEntity.getPreContractIrrMinAmount();
        BigDecimal preContractIrrMaxAmount = depositTypeDetailsEntity.getPreContractIrrMaxAmount();
        String commissionAmountKey = depositTypeDetailsEntity.getCommissionAmountKey();
        String hasCampaign = depositTypeDetailsEntity.getHasCampaign();
        long depositMinEndDate = depositTypeDetailsEntity.getDepositMinEndDate();
        long depositMaxEndDate = depositTypeDetailsEntity.getDepositMaxEndDate();
        String minIntRate = depositTypeDetailsEntity.getMinIntRate();
        if (minIntRate == null) {
            str = "";
        } else {
            str = minIntRate;
        }
        String maxIntRate = depositTypeDetailsEntity.getMaxIntRate();
        if (maxIntRate == null) {
            str2 = "";
        } else {
            str2 = maxIntRate;
        }
        String effectiveRate = depositTypeDetailsEntity.getEffectiveRate();
        if (effectiveRate == null) {
            str3 = "";
        } else {
            str3 = effectiveRate;
        }
        return new C25696e(prodType, valueOf, dictionaryKey, hasPrimaryAccount, hasInterestAccount, advantagesKey, conditionsKey, minAmountKey, minMaxTermsKey, preContractIrrMinAmount, preContractIrrMaxAmount, commissionAmountKey, hasCampaign, depositMinEndDate, depositMaxEndDate, str, str2, str3, mo49377l(depositTypeDetailsEntity.getAdvantages()), mo49377l(depositTypeDetailsEntity.getDisAdvantages()));
    }

    /* renamed from: h */
    public final C25698g mo49374h(InterestRateEntity interestRateEntity) {
        C41536l.m120489i(interestRateEntity, "intRate");
        return new C25698g(interestRateEntity.getInterestRate(), interestRateEntity.getEffectiveInterestRate(), interestRateEntity.getPossibleProfit(), interestRateEntity.getSpreadRate(), interestRateEntity.getHasSpreadRate());
    }

    /* renamed from: i */
    public final C25699h mo49375i(OpenDepositEntity openDepositEntity) {
        C25692a aVar;
        C25700i iVar;
        C41536l.m120489i(openDepositEntity, "openDepositEntity");
        CasResultEntity cas = openDepositEntity.getCas();
        C25697f fVar = null;
        if (cas != null) {
            aVar = m67266c(cas);
        } else {
            aVar = null;
        }
        StoResultEntity sto = openDepositEntity.getSto();
        if (sto != null) {
            iVar = m67268j(sto);
        } else {
            iVar = null;
        }
        DepositsEntity deposits = openDepositEntity.getDeposits();
        if (deposits != null) {
            fVar = m67267g(deposits);
        }
        return new C25699h(aVar, iVar, fVar);
    }

    /* renamed from: k */
    public final C25701j mo49376k(WithdrawalTypeEntity withdrawalTypeEntity) {
        C41536l.m120489i(withdrawalTypeEntity, "withdrawalTypeEntity");
        return new C25701j(withdrawalTypeEntity.getValue(), withdrawalTypeEntity.getDictionaryKey(), withdrawalTypeEntity.getHasPrimaryAccount(), withdrawalTypeEntity.getHasInterestAccount());
    }

    /* renamed from: l */
    public final List mo49377l(List list) {
        if (list == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo49371d((DepositFeatureEntity) it.next()));
        }
        return arrayList;
    }
}
