package l50;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l50.t */
public final class C25840t {

    /* renamed from: a */
    private final C25835o f65787a;

    /* renamed from: b */
    private final boolean f65788b;

    /* renamed from: c */
    private final boolean f65789c;

    public C25840t(C25835o oVar, boolean z, boolean z2) {
        C41536l.m120489i(oVar, "accounts");
        this.f65787a = oVar;
        this.f65788b = z;
        this.f65789c = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C25840t m81231b(C25840t tVar, C25835o oVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            oVar = tVar.f65787a;
        }
        if ((i & 2) != 0) {
            z = tVar.f65788b;
        }
        if ((i & 4) != 0) {
            z2 = tVar.f65789c;
        }
        return tVar.mo64607a(oVar, z, z2);
    }

    /* renamed from: a */
    public final C25840t mo64607a(C25835o oVar, boolean z, boolean z2) {
        C41536l.m120489i(oVar, "accounts");
        return new C25840t(oVar, z, z2);
    }

    /* renamed from: c */
    public final C25835o mo64608c() {
        return this.f65787a;
    }

    /* renamed from: d */
    public final boolean mo64609d() {
        return this.f65788b;
    }

    /* renamed from: e */
    public final boolean mo64610e() {
        return this.f65789c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25840t)) {
            return false;
        }
        C25840t tVar = (C25840t) obj;
        return C41536l.m120484d(this.f65787a, tVar.f65787a) && this.f65788b == tVar.f65788b && this.f65789c == tVar.f65789c;
    }

    public int hashCode() {
        int hashCode = this.f65787a.hashCode() * 31;
        boolean z = this.f65788b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f65789c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        C25835o oVar = this.f65787a;
        boolean z = this.f65788b;
        boolean z2 = this.f65789c;
        return "ExpandableAccountsWithCardsDetailsUIModel(accounts=" + oVar + ", isAmountCollapsed=" + z + ", isAmountHidden=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25840t(C25835o oVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
