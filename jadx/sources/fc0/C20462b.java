package fc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: fc0.b */
public final class C20462b {

    /* renamed from: a */
    private final C20461a f55461a;

    /* renamed from: b */
    private final boolean f55462b;

    public C20462b(C20461a aVar, boolean z) {
        C41536l.m120489i(aVar, "selectedAccount");
        this.f55461a = aVar;
        this.f55462b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C20462b m66661b(C20462b bVar, C20461a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.f55461a;
        }
        if ((i & 2) != 0) {
            z = bVar.f55462b;
        }
        return bVar.mo48995a(aVar, z);
    }

    /* renamed from: a */
    public final C20462b mo48995a(C20461a aVar, boolean z) {
        C41536l.m120489i(aVar, "selectedAccount");
        return new C20462b(aVar, z);
    }

    /* renamed from: c */
    public final C20461a mo48996c() {
        return this.f55461a;
    }

    /* renamed from: d */
    public final boolean mo48997d() {
        return this.f55461a.mo48991a() != null && this.f55462b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20462b)) {
            return false;
        }
        C20462b bVar = (C20462b) obj;
        return C41536l.m120484d(this.f55461a, bVar.f55461a) && this.f55462b == bVar.f55462b;
    }

    public int hashCode() {
        int hashCode = this.f55461a.hashCode() * 31;
        boolean z = this.f55462b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C20461a aVar = this.f55461a;
        boolean z = this.f55462b;
        return "DepositBreakInput(selectedAccount=" + aVar + ", isAgreed=" + z + ")";
    }
}
