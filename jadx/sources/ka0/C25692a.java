package ka0;

import hd0.C24978b;

/* renamed from: ka0.a */
public final class C25692a {

    /* renamed from: a */
    private final C24978b f65414a;

    public C25692a(C24978b bVar) {
        this.f65414a = bVar;
    }

    /* renamed from: a */
    public final C24978b mo64194a() {
        return this.f65414a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25692a) && this.f65414a == ((C25692a) obj).f65414a;
    }

    public int hashCode() {
        C24978b bVar = this.f65414a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        C24978b bVar = this.f65414a;
        return "CasResult(openedCAS=" + bVar + ")";
    }
}
