package ze1;

import kotlin.jvm.internal.C41536l;
import ze1.C43414a;

/* renamed from: ze1.b */
class C43416b implements C43414a {

    /* renamed from: d */
    private final Comparable f101272d;

    /* renamed from: e */
    private final Comparable f101273e;

    public C43416b(Comparable comparable, Comparable comparable2) {
        C41536l.m120489i(comparable, "start");
        C41536l.m120489i(comparable2, "endInclusive");
        this.f101272d = comparable;
        this.f101273e = comparable2;
    }

    /* renamed from: a */
    public boolean mo102101a() {
        return C43414a.C43415a.m124539b(this);
    }

    /* renamed from: b */
    public Comparable mo102098b() {
        return this.f101272d;
    }

    /* renamed from: c */
    public boolean mo102099c(Comparable comparable) {
        return C43414a.C43415a.m124538a(this, comparable);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C43416b) {
            if (!mo102101a() || !((C43416b) obj).mo102101a()) {
                C43416b bVar = (C43416b) obj;
                if (!C41536l.m120484d(mo102098b(), bVar.mo102098b()) || !C41536l.m120484d(mo102100i(), bVar.mo102100i())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (mo102101a()) {
            return -1;
        }
        return (mo102098b().hashCode() * 31) + mo102100i().hashCode();
    }

    /* renamed from: i */
    public Comparable mo102100i() {
        return this.f101273e;
    }

    public String toString() {
        return mo102098b() + ".." + mo102100i();
    }
}
