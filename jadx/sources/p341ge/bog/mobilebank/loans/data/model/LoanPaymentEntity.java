package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanPaymentEntity */
public final class LoanPaymentEntity {
    private final BigDecimal fullAmount;
    private final String loanCCY;
    private final List<LoanPaymentParamsEntity> loanParamsList;
    private final List<OfferedPlanTypesEntity> offeredPlanTypes;

    public LoanPaymentEntity(BigDecimal bigDecimal, String str, List<LoanPaymentParamsEntity> list, List<OfferedPlanTypesEntity> list2) {
        C41536l.m120489i(bigDecimal, "fullAmount");
        C41536l.m120489i(str, "loanCCY");
        C41536l.m120489i(list, "loanParamsList");
        this.fullAmount = bigDecimal;
        this.loanCCY = str;
        this.loanParamsList = list;
        this.offeredPlanTypes = list2;
    }

    public static /* synthetic */ LoanPaymentEntity copy$default(LoanPaymentEntity loanPaymentEntity, BigDecimal bigDecimal, String str, List<LoanPaymentParamsEntity> list, List<OfferedPlanTypesEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = loanPaymentEntity.fullAmount;
        }
        if ((i & 2) != 0) {
            str = loanPaymentEntity.loanCCY;
        }
        if ((i & 4) != 0) {
            list = loanPaymentEntity.loanParamsList;
        }
        if ((i & 8) != 0) {
            list2 = loanPaymentEntity.offeredPlanTypes;
        }
        return loanPaymentEntity.copy(bigDecimal, str, list, list2);
    }

    public final BigDecimal component1() {
        return this.fullAmount;
    }

    public final String component2() {
        return this.loanCCY;
    }

    public final List<LoanPaymentParamsEntity> component3() {
        return this.loanParamsList;
    }

    public final List<OfferedPlanTypesEntity> component4() {
        return this.offeredPlanTypes;
    }

    public final LoanPaymentEntity copy(BigDecimal bigDecimal, String str, List<LoanPaymentParamsEntity> list, List<OfferedPlanTypesEntity> list2) {
        C41536l.m120489i(bigDecimal, "fullAmount");
        C41536l.m120489i(str, "loanCCY");
        C41536l.m120489i(list, "loanParamsList");
        return new LoanPaymentEntity(bigDecimal, str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanPaymentEntity)) {
            return false;
        }
        LoanPaymentEntity loanPaymentEntity = (LoanPaymentEntity) obj;
        return C41536l.m120484d(this.fullAmount, loanPaymentEntity.fullAmount) && C41536l.m120484d(this.loanCCY, loanPaymentEntity.loanCCY) && C41536l.m120484d(this.loanParamsList, loanPaymentEntity.loanParamsList) && C41536l.m120484d(this.offeredPlanTypes, loanPaymentEntity.offeredPlanTypes);
    }

    public final BigDecimal getFullAmount() {
        return this.fullAmount;
    }

    public final String getLoanCCY() {
        return this.loanCCY;
    }

    public final List<LoanPaymentParamsEntity> getLoanParamsList() {
        return this.loanParamsList;
    }

    public final List<OfferedPlanTypesEntity> getOfferedPlanTypes() {
        return this.offeredPlanTypes;
    }

    public int hashCode() {
        int hashCode = ((((this.fullAmount.hashCode() * 31) + this.loanCCY.hashCode()) * 31) + this.loanParamsList.hashCode()) * 31;
        List<OfferedPlanTypesEntity> list = this.offeredPlanTypes;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.fullAmount;
        String str = this.loanCCY;
        List<LoanPaymentParamsEntity> list = this.loanParamsList;
        List<OfferedPlanTypesEntity> list2 = this.offeredPlanTypes;
        return "LoanPaymentEntity(fullAmount=" + bigDecimal + ", loanCCY=" + str + ", loanParamsList=" + list + ", offeredPlanTypes=" + list2 + ")";
    }
}
