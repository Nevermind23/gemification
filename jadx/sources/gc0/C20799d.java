package gc0;

import gc0.C20794c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p603si.C17799b;

/* renamed from: gc0.d */
public final class C20799d {

    /* renamed from: a */
    private final C20794c.C20798d f56049a;

    /* renamed from: b */
    private final C20794c.C20798d f56050b;

    /* renamed from: c */
    private final C20794c.C20795a f56051c;

    /* renamed from: d */
    private final C20794c.C20797c f56052d;

    public C20799d(C20794c.C20798d dVar, C20794c.C20798d dVar2, C20794c.C20795a aVar, C20794c.C20797c cVar) {
        C41536l.m120489i(dVar, "amountField");
        C41536l.m120489i(dVar2, "monthlyAmountField");
        C41536l.m120489i(aVar, "targetDateField");
        C41536l.m120489i(cVar, "savingGoalField");
        this.f56049a = dVar;
        this.f56050b = dVar2;
        this.f56051c = aVar;
        this.f56052d = cVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C20799d m67300b(C20799d dVar, C20794c.C20798d dVar2, C20794c.C20798d dVar3, C20794c.C20795a aVar, C20794c.C20797c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar2 = dVar.f56049a;
        }
        if ((i & 2) != 0) {
            dVar3 = dVar.f56050b;
        }
        if ((i & 4) != 0) {
            aVar = dVar.f56051c;
        }
        if ((i & 8) != 0) {
            cVar = dVar.f56052d;
        }
        return dVar.mo49404a(dVar2, dVar3, aVar, cVar);
    }

    /* renamed from: a */
    public final C20799d mo49404a(C20794c.C20798d dVar, C20794c.C20798d dVar2, C20794c.C20795a aVar, C20794c.C20797c cVar) {
        C41536l.m120489i(dVar, "amountField");
        C41536l.m120489i(dVar2, "monthlyAmountField");
        C41536l.m120489i(aVar, "targetDateField");
        C41536l.m120489i(cVar, "savingGoalField");
        return new C20799d(dVar, dVar2, aVar, cVar);
    }

    /* renamed from: c */
    public final C20794c.C20798d mo49405c() {
        return this.f56049a;
    }

    /* renamed from: d */
    public final C20794c.C20798d mo49406d() {
        return this.f56050b;
    }

    /* renamed from: e */
    public final C20794c.C20797c mo49407e() {
        return this.f56052d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20799d)) {
            return false;
        }
        C20799d dVar = (C20799d) obj;
        return C41536l.m120484d(this.f56049a, dVar.f56049a) && C41536l.m120484d(this.f56050b, dVar.f56050b) && C41536l.m120484d(this.f56051c, dVar.f56051c) && C41536l.m120484d(this.f56052d, dVar.f56052d);
    }

    /* renamed from: f */
    public final C20794c.C20795a mo49409f() {
        return this.f56051c;
    }

    /* renamed from: g */
    public final boolean mo49410g() {
        return (!this.f56049a.mo49395c() || this.f56051c.mo49388a() == null || this.f56052d.mo49396a() == null) ? false : true;
    }

    public int hashCode() {
        return (((((this.f56049a.hashCode() * 31) + this.f56050b.hashCode()) * 31) + this.f56051c.hashCode()) * 31) + this.f56052d.hashCode();
    }

    public String toString() {
        C20794c.C20798d dVar = this.f56049a;
        C20794c.C20798d dVar2 = this.f56050b;
        C20794c.C20795a aVar = this.f56051c;
        C20794c.C20797c cVar = this.f56052d;
        return "SavingGoalInput(amountField=" + dVar + ", monthlyAmountField=" + dVar2 + ", targetDateField=" + aVar + ", savingGoalField=" + cVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20799d(C20794c.C20798d dVar, C20794c.C20798d dVar2, C20794c.C20795a aVar, C20794c.C20797c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C20794c.C20798d((String) null, false, false, C20793b.f56031d, 7, (DefaultConstructorMarker) null) : dVar, (i & 2) != 0 ? new C20794c.C20798d((String) null, false, false, (C17799b) null, 13, (DefaultConstructorMarker) null) : dVar2, (i & 4) != 0 ? new C20794c.C20795a((Long) null, false, false, 7, (DefaultConstructorMarker) null) : aVar, (i & 8) != 0 ? new C20794c.C20797c((SavingGoalUiModel) null, false, false, 7, (DefaultConstructorMarker) null) : cVar);
    }
}
