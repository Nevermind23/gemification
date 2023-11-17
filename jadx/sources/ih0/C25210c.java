package ih0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ih0.c */
public final class C25210c {

    /* renamed from: a */
    private final C25211d f64768a;

    /* renamed from: b */
    private final String f64769b;

    public C25210c(C25211d dVar, String str) {
        C41536l.m120489i(dVar, "dialogType");
        this.f64768a = dVar;
        this.f64769b = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C25210c m80265b(C25210c cVar, C25211d dVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = cVar.f64768a;
        }
        if ((i & 2) != 0) {
            str = cVar.f64769b;
        }
        return cVar.mo63721a(dVar, str);
    }

    /* renamed from: a */
    public final C25210c mo63721a(C25211d dVar, String str) {
        C41536l.m120489i(dVar, "dialogType");
        return new C25210c(dVar, str);
    }

    /* renamed from: c */
    public final C25211d mo63722c() {
        return this.f64768a;
    }

    /* renamed from: d */
    public final String mo63723d() {
        return this.f64769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25210c)) {
            return false;
        }
        C25210c cVar = (C25210c) obj;
        return this.f64768a == cVar.f64768a && C41536l.m120484d(this.f64769b, cVar.f64769b);
    }

    public int hashCode() {
        int hashCode = this.f64768a.hashCode() * 31;
        String str = this.f64769b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C25211d dVar = this.f64768a;
        String str = this.f64769b;
        return "GamificationPreLoginData(dialogType=" + dVar + ", token=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25210c(C25211d dVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C25211d.NONE : dVar, (i & 2) != 0 ? null : str);
    }
}
