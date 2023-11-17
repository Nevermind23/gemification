package p783hv;

import kotlin.jvm.internal.C41536l;
import p891su.C28261a;

/* renamed from: hv.c */
public final class C25071c {

    /* renamed from: a */
    private final C28261a f64425a;

    /* renamed from: b */
    private final boolean f64426b;

    public C25071c(C28261a aVar, boolean z) {
        C41536l.m120489i(aVar, "contact");
        this.f64425a = aVar;
        this.f64426b = z;
    }

    /* renamed from: a */
    public final C28261a mo63525a() {
        return this.f64425a;
    }

    /* renamed from: b */
    public final boolean mo63526b() {
        return this.f64426b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25071c)) {
            return false;
        }
        C25071c cVar = (C25071c) obj;
        return C41536l.m120484d(this.f64425a, cVar.f64425a) && this.f64426b == cVar.f64426b;
    }

    public int hashCode() {
        int hashCode = this.f64425a.hashCode() * 31;
        boolean z = this.f64426b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C28261a aVar = this.f64425a;
        boolean z = this.f64426b;
        return "MoneyRequestContact(contact=" + aVar + ", isSelected=" + z + ")";
    }
}
