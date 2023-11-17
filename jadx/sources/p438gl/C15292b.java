package p438gl;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;

/* renamed from: gl.b */
public final class C15292b {

    /* renamed from: a */
    private final Amount f43683a;

    /* renamed from: b */
    private final Amount f43684b;

    /* renamed from: c */
    private final Amount f43685c;

    public C15292b(Amount amount, Amount amount2, Amount amount3) {
        C41536l.m120489i(amount, "limit");
        C41536l.m120489i(amount2, "payment");
        C41536l.m120489i(amount3, "total");
        this.f43683a = amount;
        this.f43684b = amount2;
        this.f43685c = amount3;
    }

    /* renamed from: a */
    public final Amount mo42374a() {
        return this.f43683a;
    }

    /* renamed from: b */
    public final Amount mo42375b() {
        return this.f43684b;
    }

    /* renamed from: c */
    public final Amount mo42376c() {
        return this.f43685c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15292b)) {
            return false;
        }
        C15292b bVar = (C15292b) obj;
        return C41536l.m120484d(this.f43683a, bVar.f43683a) && C41536l.m120484d(this.f43684b, bVar.f43684b) && C41536l.m120484d(this.f43685c, bVar.f43685c);
    }

    public int hashCode() {
        return (((this.f43683a.hashCode() * 31) + this.f43684b.hashCode()) * 31) + this.f43685c.hashCode();
    }

    public String toString() {
        Amount amount = this.f43683a;
        Amount amount2 = this.f43684b;
        Amount amount3 = this.f43685c;
        return "InsurancePackageUiItem(limit=" + amount + ", payment=" + amount2 + ", total=" + amount3 + ")";
    }
}
