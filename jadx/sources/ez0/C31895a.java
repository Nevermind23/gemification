package ez0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;

/* renamed from: ez0.a */
public final class C31895a {

    /* renamed from: a */
    private final Long f78619a;

    /* renamed from: b */
    private final List f78620b;

    /* renamed from: c */
    private final DebitCardInsuranceTypeUiModel f78621c;

    public C31895a(Long l, List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
        C41536l.m120489i(list, "insuranceList");
        this.f78619a = l;
        this.f78620b = list;
        this.f78621c = debitCardInsuranceTypeUiModel;
    }

    /* renamed from: a */
    public final Long mo72313a() {
        return this.f78619a;
    }

    /* renamed from: b */
    public final List mo72314b() {
        return this.f78620b;
    }

    /* renamed from: c */
    public final DebitCardInsuranceTypeUiModel mo72315c() {
        return this.f78621c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31895a)) {
            return false;
        }
        C31895a aVar = (C31895a) obj;
        return C41536l.m120484d(this.f78619a, aVar.f78619a) && C41536l.m120484d(this.f78620b, aVar.f78620b) && C41536l.m120484d(this.f78621c, aVar.f78621c);
    }

    public int hashCode() {
        Long l = this.f78619a;
        int i = 0;
        int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.f78620b.hashCode()) * 31;
        DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f78621c;
        if (debitCardInsuranceTypeUiModel != null) {
            i = debitCardInsuranceTypeUiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f78619a;
        List list = this.f78620b;
        DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f78621c;
        return "CardInsuranceSelectorOptions(cardId=" + l + ", insuranceList=" + list + ", selectedInsuranceType=" + debitCardInsuranceTypeUiModel + ")";
    }
}
