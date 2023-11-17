package ka0;

import hd0.C24978b;

/* renamed from: ka0.i */
public final class C25700i {

    /* renamed from: a */
    private final C24978b f65465a;

    public C25700i(C24978b bVar) {
        this.f65465a = bVar;
    }

    /* renamed from: a */
    public final C24978b mo64253a() {
        return this.f65465a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25700i) && this.f65465a == ((C25700i) obj).f65465a;
    }

    public int hashCode() {
        C24978b bVar = this.f65465a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        C24978b bVar = this.f65465a;
        return "StoResult(openedSTO=" + bVar + ")";
    }
}
