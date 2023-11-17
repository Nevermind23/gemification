package zl0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import ul0.C28878e;

/* renamed from: zl0.c */
public final class C30337c {

    /* renamed from: a */
    private final InsurancePersonType f76257a;

    /* renamed from: b */
    private final String f76258b;

    /* renamed from: c */
    private final C28878e f76259c;

    public C30337c(InsurancePersonType insurancePersonType, String str, C28878e eVar) {
        C41536l.m120489i(insurancePersonType, "type");
        C41536l.m120489i(str, "personTitle");
        this.f76257a = insurancePersonType;
        this.f76258b = str;
        this.f76259c = eVar;
    }

    /* renamed from: a */
    public final String mo70661a() {
        return this.f76258b;
    }

    /* renamed from: b */
    public final C28878e mo70662b() {
        return this.f76259c;
    }

    /* renamed from: c */
    public final InsurancePersonType mo70663c() {
        return this.f76257a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30337c)) {
            return false;
        }
        C30337c cVar = (C30337c) obj;
        return this.f76257a == cVar.f76257a && C41536l.m120484d(this.f76258b, cVar.f76258b) && C41536l.m120484d(this.f76259c, cVar.f76259c);
    }

    public int hashCode() {
        int hashCode = ((this.f76257a.hashCode() * 31) + this.f76258b.hashCode()) * 31;
        C28878e eVar = this.f76259c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        InsurancePersonType insurancePersonType = this.f76257a;
        String str = this.f76258b;
        C28878e eVar = this.f76259c;
        return "SelectInsurancePersonUIModel(type=" + insurancePersonType + ", personTitle=" + str + ", previouslyInsuredPerson=" + eVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30337c(InsurancePersonType insurancePersonType, String str, C28878e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(insurancePersonType, str, (i & 4) != 0 ? null : eVar);
    }
}
