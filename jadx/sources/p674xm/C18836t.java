package p674xm;

import kotlin.jvm.internal.C41536l;

/* renamed from: xm.t */
public final class C18836t {

    /* renamed from: a */
    private final C18812n f52648a;

    /* renamed from: b */
    private final boolean f52649b;

    public C18836t(C18812n nVar, boolean z) {
        C41536l.m120489i(nVar, "infoBoxData");
        this.f52648a = nVar;
        this.f52649b = z;
    }

    /* renamed from: a */
    public final C18812n mo46793a() {
        return this.f52648a;
    }

    /* renamed from: b */
    public final boolean mo46794b() {
        return this.f52649b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18836t)) {
            return false;
        }
        C18836t tVar = (C18836t) obj;
        return C41536l.m120484d(this.f52648a, tVar.f52648a) && this.f52649b == tVar.f52649b;
    }

    public int hashCode() {
        int hashCode = this.f52648a.hashCode() * 31;
        boolean z = this.f52649b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C18812n nVar = this.f52648a;
        boolean z = this.f52649b;
        return "RegionFeedbackUiState(infoBoxData=" + nVar + ", studentCardIsRegional=" + z + ")";
    }
}
