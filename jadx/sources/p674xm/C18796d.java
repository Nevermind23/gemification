package p674xm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;

/* renamed from: xm.d */
public final class C18796d {

    /* renamed from: a */
    private final List f52528a;

    /* renamed from: b */
    private final DebitCardInsuranceTypeUiModel f52529b;

    public C18796d(List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
        C41536l.m120489i(list, "insurances");
        this.f52528a = list;
        this.f52529b = debitCardInsuranceTypeUiModel;
    }

    /* renamed from: a */
    public final List mo46614a() {
        return this.f52528a;
    }

    /* renamed from: b */
    public final DebitCardInsuranceTypeUiModel mo46615b() {
        return this.f52529b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18796d)) {
            return false;
        }
        C18796d dVar = (C18796d) obj;
        return C41536l.m120484d(this.f52528a, dVar.f52528a) && C41536l.m120484d(this.f52529b, dVar.f52529b);
    }

    public int hashCode() {
        int hashCode = this.f52528a.hashCode() * 31;
        DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f52529b;
        return hashCode + (debitCardInsuranceTypeUiModel == null ? 0 : debitCardInsuranceTypeUiModel.hashCode());
    }

    public String toString() {
        List list = this.f52528a;
        DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f52529b;
        return "CardOrderInsuranceData(insurances=" + list + ", selectedInsuranceType=" + debitCardInsuranceTypeUiModel + ")";
    }
}
