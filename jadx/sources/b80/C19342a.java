package b80;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDataEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDetailsItemEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanCalculationEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.LoanTypeEntity;
import r80.C27947a;
import r80.C27948b;
import r80.C27949c;

/* renamed from: b80.a */
public final class C19342a {
    /* renamed from: a */
    public final C27947a mo47542a(ClaDataEntity claDataEntity) {
        C41536l.m120489i(claDataEntity, "data");
        return mo47543b((ClaDetailsItemEntity) C41358y.m120007W(claDataEntity.getSubProducts()), claDataEntity.getProductType(), claDataEntity.getSubProductType());
    }

    /* renamed from: b */
    public final C27947a mo47543b(ClaDetailsItemEntity claDetailsItemEntity, String str, String str2) {
        C41536l.m120489i(claDetailsItemEntity, "loanDetailsEntity");
        String str3 = str;
        C41536l.m120489i(str3, "productType");
        String str4 = str2;
        C41536l.m120489i(str4, "subProductType");
        return new C27947a(claDetailsItemEntity.getId(), str3, str4, claDetailsItemEntity.getPeriodType(), claDetailsItemEntity.getMaxPeriod(), claDetailsItemEntity.getMinPeriod(), claDetailsItemEntity.getMaxAmount(), claDetailsItemEntity.getMinAmount(), claDetailsItemEntity.getApplicationStructures().getIncomeMinAmount(), claDetailsItemEntity.getStatus(), claDetailsItemEntity.getProductCurrency(), claDetailsItemEntity.getProdTermsDictionaryKey());
    }

    /* renamed from: c */
    public final C27948b mo47544c(LoanCalculationEntity loanCalculationEntity) {
        C41536l.m120489i(loanCalculationEntity, "calculationEntity");
        return new C27948b(loanCalculationEntity.getPmtAmount());
    }

    /* renamed from: d */
    public final C27949c mo47545d(LoanTypeEntity loanTypeEntity) {
        C41536l.m120489i(loanTypeEntity, "loanTypeEntity");
        return new C27949c(loanTypeEntity.getLoanType(), loanTypeEntity.getDictionaryKey(), loanTypeEntity.getDefaultSubProduct());
    }
}
