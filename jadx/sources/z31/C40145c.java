package z31;

import kotlin.jvm.internal.C41536l;

/* renamed from: z31.c */
public final class C40145c {

    /* renamed from: a */
    private final C40144b f95396a;

    /* renamed from: b */
    private final boolean f95397b;

    public C40145c(C40144b bVar, boolean z) {
        C41536l.m120489i(bVar, "details");
        this.f95396a = bVar;
        this.f95397b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C40145c m116282b(C40145c cVar, C40144b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = cVar.f95396a;
        }
        if ((i & 2) != 0) {
            z = cVar.f95397b;
        }
        return cVar.mo94081a(bVar, z);
    }

    /* renamed from: a */
    public final C40145c mo94081a(C40144b bVar, boolean z) {
        C41536l.m120489i(bVar, "details");
        return new C40145c(bVar, z);
    }

    /* renamed from: c */
    public final C40144b mo94082c() {
        return this.f95396a;
    }

    /* renamed from: d */
    public final boolean mo94083d() {
        return this.f95397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40145c)) {
            return false;
        }
        C40145c cVar = (C40145c) obj;
        return C41536l.m120484d(this.f95396a, cVar.f95396a) && this.f95397b == cVar.f95397b;
    }

    public int hashCode() {
        int hashCode = this.f95396a.hashCode() * 31;
        boolean z = this.f95397b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C40144b bVar = this.f95396a;
        boolean z = this.f95397b;
        return "InsuranceSelectorAdapterListItem(details=" + bVar + ", isSelected=" + z + ")";
    }
}
