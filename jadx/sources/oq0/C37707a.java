package oq0;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;

/* renamed from: oq0.a */
public final class C37707a {

    /* renamed from: a */
    private final String f90575a;

    /* renamed from: b */
    private final C37710d f90576b;

    /* renamed from: c */
    private final C37710d f90577c;

    /* renamed from: d */
    private final C37710d f90578d;

    /* renamed from: e */
    private final C37709c f90579e;

    /* renamed from: f */
    private final C37711e f90580f;

    /* renamed from: g */
    private final C37711e f90581g;

    /* renamed from: h */
    private final C37710d f90582h;

    /* renamed from: i */
    private final C37710d f90583i;

    /* renamed from: j */
    private final C37708b f90584j;

    /* renamed from: k */
    private final boolean f90585k;

    /* renamed from: l */
    private final boolean f90586l;

    /* renamed from: m */
    private final C37223a f90587m;

    public C37707a(String str, C37710d dVar, C37710d dVar2, C37710d dVar3, C37709c cVar, C37711e eVar, C37711e eVar2, C37710d dVar4, C37710d dVar5, C37708b bVar, boolean z, boolean z2, C37223a aVar) {
        C41536l.m120489i(str, "loanCcy");
        C41536l.m120489i(dVar, "amountInput");
        C41536l.m120489i(dVar2, "payDay");
        C41536l.m120489i(dVar3, "term");
        C41536l.m120489i(cVar, "refinance");
        C41536l.m120489i(eVar, "lifeInsurance");
        C41536l.m120489i(eVar2, "paymentInsurance");
        C41536l.m120489i(dVar4, "insuranceProvider");
        C41536l.m120489i(dVar5, "account");
        C41536l.m120489i(bVar, "chosenInsuranceInfo");
        this.f90575a = str;
        this.f90576b = dVar;
        this.f90577c = dVar2;
        this.f90578d = dVar3;
        this.f90579e = cVar;
        this.f90580f = eVar;
        this.f90581g = eVar2;
        this.f90582h = dVar4;
        this.f90583i = dVar5;
        this.f90584j = bVar;
        this.f90585k = z;
        this.f90586l = z2;
        this.f90587m = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C37707a m110824b(C37707a aVar, String str, C37710d dVar, C37710d dVar2, C37710d dVar3, C37709c cVar, C37711e eVar, C37711e eVar2, C37710d dVar4, C37710d dVar5, C37708b bVar, boolean z, boolean z2, C37223a aVar2, int i, Object obj) {
        C37707a aVar3 = aVar;
        int i2 = i;
        return aVar.mo90907a((i2 & 1) != 0 ? aVar3.f90575a : str, (i2 & 2) != 0 ? aVar3.f90576b : dVar, (i2 & 4) != 0 ? aVar3.f90577c : dVar2, (i2 & 8) != 0 ? aVar3.f90578d : dVar3, (i2 & 16) != 0 ? aVar3.f90579e : cVar, (i2 & 32) != 0 ? aVar3.f90580f : eVar, (i2 & 64) != 0 ? aVar3.f90581g : eVar2, (i2 & 128) != 0 ? aVar3.f90582h : dVar4, (i2 & C11398b.f33139r) != 0 ? aVar3.f90583i : dVar5, (i2 & C11398b.f33140s) != 0 ? aVar3.f90584j : bVar, (i2 & C11398b.f33141t) != 0 ? aVar3.f90585k : z, (i2 & C11398b.f33142u) != 0 ? aVar3.f90586l : z2, (i2 & C11398b.f33143v) != 0 ? aVar3.f90587m : aVar2);
    }

    /* renamed from: a */
    public final C37707a mo90907a(String str, C37710d dVar, C37710d dVar2, C37710d dVar3, C37709c cVar, C37711e eVar, C37711e eVar2, C37710d dVar4, C37710d dVar5, C37708b bVar, boolean z, boolean z2, C37223a aVar) {
        String str2 = str;
        C41536l.m120489i(str2, "loanCcy");
        C37710d dVar6 = dVar;
        C41536l.m120489i(dVar6, "amountInput");
        C37710d dVar7 = dVar2;
        C41536l.m120489i(dVar7, "payDay");
        C37710d dVar8 = dVar3;
        C41536l.m120489i(dVar8, "term");
        C37709c cVar2 = cVar;
        C41536l.m120489i(cVar2, "refinance");
        C37711e eVar3 = eVar;
        C41536l.m120489i(eVar3, "lifeInsurance");
        C37711e eVar4 = eVar2;
        C41536l.m120489i(eVar4, "paymentInsurance");
        C37710d dVar9 = dVar4;
        C41536l.m120489i(dVar9, "insuranceProvider");
        C37710d dVar10 = dVar5;
        C41536l.m120489i(dVar10, "account");
        C37708b bVar2 = bVar;
        C41536l.m120489i(bVar2, "chosenInsuranceInfo");
        return new C37707a(str2, dVar6, dVar7, dVar8, cVar2, eVar3, eVar4, dVar9, dVar10, bVar2, z, z2, aVar);
    }

    /* renamed from: c */
    public final C37710d mo90908c() {
        return this.f90583i;
    }

    /* renamed from: d */
    public final C37710d mo90909d() {
        return this.f90576b;
    }

    /* renamed from: e */
    public final C37708b mo90910e() {
        return this.f90584j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37707a)) {
            return false;
        }
        C37707a aVar = (C37707a) obj;
        return C41536l.m120484d(this.f90575a, aVar.f90575a) && C41536l.m120484d(this.f90576b, aVar.f90576b) && C41536l.m120484d(this.f90577c, aVar.f90577c) && C41536l.m120484d(this.f90578d, aVar.f90578d) && C41536l.m120484d(this.f90579e, aVar.f90579e) && C41536l.m120484d(this.f90580f, aVar.f90580f) && C41536l.m120484d(this.f90581g, aVar.f90581g) && C41536l.m120484d(this.f90582h, aVar.f90582h) && C41536l.m120484d(this.f90583i, aVar.f90583i) && C41536l.m120484d(this.f90584j, aVar.f90584j) && this.f90585k == aVar.f90585k && this.f90586l == aVar.f90586l && C41536l.m120484d(this.f90587m, aVar.f90587m);
    }

    /* renamed from: f */
    public final boolean mo90912f() {
        return this.f90586l;
    }

    /* renamed from: g */
    public final C37223a mo90913g() {
        return this.f90587m;
    }

    /* renamed from: h */
    public final C37710d mo90914h() {
        return this.f90582h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f90575a.hashCode() * 31) + this.f90576b.hashCode()) * 31) + this.f90577c.hashCode()) * 31) + this.f90578d.hashCode()) * 31) + this.f90579e.hashCode()) * 31) + this.f90580f.hashCode()) * 31) + this.f90581g.hashCode()) * 31) + this.f90582h.hashCode()) * 31) + this.f90583i.hashCode()) * 31) + this.f90584j.hashCode()) * 31;
        boolean z = this.f90585k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f90586l;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        C37223a aVar = this.f90587m;
        return i2 + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: i */
    public final C37711e mo90916i() {
        return this.f90580f;
    }

    /* renamed from: j */
    public final String mo90917j() {
        return this.f90575a;
    }

    /* renamed from: k */
    public final C37710d mo90918k() {
        return this.f90577c;
    }

    /* renamed from: l */
    public final C37711e mo90919l() {
        return this.f90581g;
    }

    /* renamed from: m */
    public final C37709c mo90920m() {
        return this.f90579e;
    }

    /* renamed from: n */
    public final boolean mo90921n() {
        return this.f90585k;
    }

    /* renamed from: o */
    public final C37710d mo90922o() {
        return this.f90578d;
    }

    public String toString() {
        String str = this.f90575a;
        C37710d dVar = this.f90576b;
        C37710d dVar2 = this.f90577c;
        C37710d dVar3 = this.f90578d;
        C37709c cVar = this.f90579e;
        C37711e eVar = this.f90580f;
        C37711e eVar2 = this.f90581g;
        C37710d dVar4 = this.f90582h;
        C37710d dVar5 = this.f90583i;
        C37708b bVar = this.f90584j;
        boolean z = this.f90585k;
        boolean z2 = this.f90586l;
        C37223a aVar = this.f90587m;
        return "ActivationFormUiState(loanCcy=" + str + ", amountInput=" + dVar + ", payDay=" + dVar2 + ", term=" + dVar3 + ", refinance=" + cVar + ", lifeInsurance=" + eVar + ", paymentInsurance=" + eVar2 + ", insuranceProvider=" + dVar4 + ", account=" + dVar5 + ", chosenInsuranceInfo=" + bVar + ", showInsurance=" + z + ", continueButtonVisible=" + z2 + ", error=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37707a(String str, C37710d dVar, C37710d dVar2, C37710d dVar3, C37709c cVar, C37711e eVar, C37711e eVar2, C37710d dVar4, C37710d dVar5, C37708b bVar, boolean z, boolean z2, C37223a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, dVar2, dVar3, cVar, eVar, eVar2, dVar4, dVar5, bVar, z, z2, (i & C11398b.f33143v) != 0 ? null : aVar);
    }
}
