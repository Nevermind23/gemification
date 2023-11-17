package ka0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ka0.h */
public final class C25699h {

    /* renamed from: a */
    private final C25692a f65462a;

    /* renamed from: b */
    private final C25700i f65463b;

    /* renamed from: c */
    private final C25697f f65464c;

    public C25699h(C25692a aVar, C25700i iVar, C25697f fVar) {
        this.f65462a = aVar;
        this.f65463b = iVar;
        this.f65464c = fVar;
    }

    /* renamed from: a */
    public final C25692a mo64248a() {
        return this.f65462a;
    }

    /* renamed from: b */
    public final C25700i mo64249b() {
        return this.f65463b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25699h)) {
            return false;
        }
        C25699h hVar = (C25699h) obj;
        return C41536l.m120484d(this.f65462a, hVar.f65462a) && C41536l.m120484d(this.f65463b, hVar.f65463b) && C41536l.m120484d(this.f65464c, hVar.f65464c);
    }

    public int hashCode() {
        C25692a aVar = this.f65462a;
        int i = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C25700i iVar = this.f65463b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C25697f fVar = this.f65464c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C25692a aVar = this.f65462a;
        C25700i iVar = this.f65463b;
        C25697f fVar = this.f65464c;
        return "OpenDeposit(cas=" + aVar + ", sto=" + iVar + ", deposits=" + fVar + ")";
    }
}
