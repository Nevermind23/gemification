package ub0;

import com.github.mikephil.charting.utils.Utils;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositChangeProlParametersEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationDetailsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationPeriodEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationWithdrawalTypeEntity;
import p717bs.C19401a;
import py0.C38047a;
import py0.C38048b;
import py0.C38049c;
import py0.C38050d;

/* renamed from: ub0.a */
public final class C28697a {
    /* renamed from: a */
    public final double mo68417a(String str) {
        Double h;
        if (str == null || (h = C40437u.m117096h(str)) == null) {
            return Double.MIN_VALUE;
        }
        return h.doubleValue();
    }

    /* renamed from: b */
    public final List mo68418b(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DepositProlongationWithdrawalTypeEntity depositProlongationWithdrawalTypeEntity = (DepositProlongationWithdrawalTypeEntity) it.next();
            String value = depositProlongationWithdrawalTypeEntity.getValue();
            String str = "";
            if (value == null) {
                value = str;
            }
            String dictionaryKey = depositProlongationWithdrawalTypeEntity.getDictionaryKey();
            if (dictionaryKey != null) {
                str = dictionaryKey;
            }
            arrayList.add(new C38050d(value, str));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C25950a mo68419c(PreContractEntity preContractEntity) {
        C41536l.m120489i(preContractEntity, "entity");
        return new C25950a(preContractEntity.getTemplateId(), preContractEntity.getContractType(), preContractEntity.getDictionaryKeyId(), preContractEntity.getChannelCode(), preContractEntity.getLanguageCode(), preContractEntity.getContractTemplate(), preContractEntity.getTemplateDesc());
    }

    /* renamed from: d */
    public final C38047a mo68420d(DepositChangeProlParametersEntity depositChangeProlParametersEntity) {
        double d;
        double d2;
        Double h;
        Double h2;
        Double h3;
        C41536l.m120489i(depositChangeProlParametersEntity, "entity");
        String interestRate = depositChangeProlParametersEntity.getInterestRate();
        double d3 = Double.MIN_VALUE;
        if (interestRate == null || (h3 = C40437u.m117096h(interestRate)) == null) {
            d = Double.MIN_VALUE;
        } else {
            d = h3.doubleValue();
        }
        String interestAmount = depositChangeProlParametersEntity.getInterestAmount();
        if (interestAmount == null || (h2 = C40437u.m117096h(interestAmount)) == null) {
            d2 = Double.MIN_VALUE;
        } else {
            d2 = h2.doubleValue();
        }
        String irr = depositChangeProlParametersEntity.getIrr();
        if (!(irr == null || (h = C40437u.m117096h(irr)) == null)) {
            d3 = h.doubleValue();
        }
        double d4 = d3;
        String agreeType = depositChangeProlParametersEntity.getAgreeType();
        if (agreeType == null) {
            agreeType = "";
        }
        return new C38047a(d, d2, agreeType, d4);
    }

    /* renamed from: e */
    public final C38048b mo68421e(DepositProlongationDetailsEntity depositProlongationDetailsEntity) {
        long j;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String str;
        long j2;
        String str2;
        String str3;
        String str4;
        C24978b bVar;
        C24978b bVar2;
        String str5;
        Double h;
        Double h2;
        Double h3;
        Double h4;
        Double h5;
        C41536l.m120489i(depositProlongationDetailsEntity, "entity");
        String ccy = depositProlongationDetailsEntity.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        String str6 = ccy;
        Long result = depositProlongationDetailsEntity.getResult();
        long j3 = -1;
        if (result != null) {
            j = result.longValue();
        } else {
            j = -1;
        }
        Long acctKey = depositProlongationDetailsEntity.getAcctKey();
        if (acctKey != null) {
            j3 = acctKey.longValue();
        }
        long j4 = j3;
        String oldAgreeAmount = depositProlongationDetailsEntity.getOldAgreeAmount();
        double d6 = Double.MIN_VALUE;
        if (oldAgreeAmount == null || (h5 = C40437u.m117096h(oldAgreeAmount)) == null) {
            d = Double.MIN_VALUE;
        } else {
            d = h5.doubleValue();
        }
        String minAmount = depositProlongationDetailsEntity.getMinAmount();
        if (minAmount == null || (h4 = C40437u.m117096h(minAmount)) == null) {
            d2 = Double.MIN_VALUE;
        } else {
            d2 = h4.doubleValue();
        }
        String interestAmt = depositProlongationDetailsEntity.getInterestAmt();
        if (interestAmt == null || (h3 = C40437u.m117096h(interestAmt)) == null) {
            d3 = Double.MIN_VALUE;
        } else {
            d3 = h3.doubleValue();
        }
        String intRate = depositProlongationDetailsEntity.getIntRate();
        if (intRate == null || (h2 = C40437u.m117096h(intRate)) == null) {
            d4 = Double.MIN_VALUE;
        } else {
            d4 = h2.doubleValue();
        }
        String irr = depositProlongationDetailsEntity.getIrr();
        if (irr == null || (h = C40437u.m117096h(irr)) == null) {
            d5 = Double.MIN_VALUE;
        } else {
            d5 = h.doubleValue();
        }
        String prodType = depositProlongationDetailsEntity.getProdType();
        if (prodType == null) {
            prodType = "";
        }
        String term = depositProlongationDetailsEntity.getTerm();
        if (term == null) {
            str = "";
        } else {
            str = term;
        }
        Long maturityDate = depositProlongationDetailsEntity.getMaturityDate();
        long j5 = Long.MIN_VALUE;
        if (maturityDate != null) {
            j2 = maturityDate.longValue();
        } else {
            j2 = Long.MIN_VALUE;
        }
        Long startDate = depositProlongationDetailsEntity.getStartDate();
        if (startDate != null) {
            j5 = startDate.longValue();
        }
        long j6 = j5;
        Double periodLength = depositProlongationDetailsEntity.getPeriodLength();
        if (periodLength != null) {
            d6 = periodLength.doubleValue();
        }
        double d7 = d6;
        String name = depositProlongationDetailsEntity.getName();
        if (name == null) {
            str2 = "";
        } else {
            str2 = name;
        }
        String purpose = depositProlongationDetailsEntity.getPurpose();
        if (purpose == null) {
            str3 = "";
        } else {
            str3 = purpose;
        }
        String agreeType = depositProlongationDetailsEntity.getAgreeType();
        if (agreeType == null) {
            str4 = "";
        } else {
            str4 = agreeType;
        }
        YesNoApiEntity copySto = depositProlongationDetailsEntity.getCopySto();
        if (copySto == null || (bVar = C19401a.m64892a(copySto)) == null) {
            bVar = C24978b.NO;
        }
        boolean c = bVar.mo63390c();
        YesNoApiEntity copyCas = depositProlongationDetailsEntity.getCopyCas();
        if (copyCas == null || (bVar2 = C19401a.m64892a(copyCas)) == null) {
            bVar2 = C24978b.NO;
        }
        boolean c2 = bVar2.mo63390c();
        String intWithPeriod = depositProlongationDetailsEntity.getIntWithPeriod();
        if (intWithPeriod == null) {
            str5 = "";
        } else {
            str5 = intWithPeriod;
        }
        return new C38048b(str6, j, j4, d, d2, Utils.DOUBLE_EPSILON, d3, d4, d5, prodType, str5, str, j2, j6, d7, str2, str3, str4, c2, c, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public final C38049c mo68422f(DepositProlongationPeriodEntity depositProlongationPeriodEntity) {
        long j;
        long j2;
        int i;
        int i2;
        C41536l.m120489i(depositProlongationPeriodEntity, "entity");
        Long minMaturityDate = depositProlongationPeriodEntity.getMinMaturityDate();
        if (minMaturityDate != null) {
            j = minMaturityDate.longValue();
        } else {
            j = Long.MIN_VALUE;
        }
        Long maxMaturityDate = depositProlongationPeriodEntity.getMaxMaturityDate();
        if (maxMaturityDate != null) {
            j2 = maxMaturityDate.longValue();
        } else {
            j2 = Long.MIN_VALUE;
        }
        Integer minMonths = depositProlongationPeriodEntity.getMinMonths();
        if (minMonths != null) {
            i = minMonths.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        Integer maxMonths = depositProlongationPeriodEntity.getMaxMonths();
        if (maxMonths != null) {
            i2 = maxMonths.intValue();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new C38049c(j, j2, i, i2);
    }
}
