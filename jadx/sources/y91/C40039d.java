package y91;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: y91.d */
public final class C40039d {

    /* renamed from: a */
    private final C40041f f95136a;

    /* renamed from: b */
    private final C40038c f95137b;

    /* renamed from: c */
    private final C40040e f95138c;

    /* renamed from: d */
    private final List f95139d;

    public C40039d(C40041f fVar, C40038c cVar, C40040e eVar, List list) {
        C41536l.m120489i(fVar, "header");
        C41536l.m120489i(list, "backgrounds");
        this.f95136a = fVar;
        this.f95137b = cVar;
        this.f95138c = eVar;
        this.f95139d = list;
    }

    /* renamed from: a */
    public final List mo93899a() {
        return this.f95139d;
    }

    /* renamed from: b */
    public final C40038c mo93900b() {
        return this.f95137b;
    }

    /* renamed from: c */
    public final C40040e mo93901c() {
        return this.f95138c;
    }

    /* renamed from: d */
    public final C40041f mo93902d() {
        return this.f95136a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40039d)) {
            return false;
        }
        C40039d dVar = (C40039d) obj;
        return C41536l.m120484d(this.f95136a, dVar.f95136a) && C41536l.m120484d(this.f95137b, dVar.f95137b) && C41536l.m120484d(this.f95138c, dVar.f95138c) && C41536l.m120484d(this.f95139d, dVar.f95139d);
    }

    public int hashCode() {
        int hashCode = this.f95136a.hashCode() * 31;
        C40038c cVar = this.f95137b;
        int i = 0;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C40040e eVar = this.f95138c;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f95139d.hashCode();
    }

    public String toString() {
        C40041f fVar = this.f95136a;
        C40038c cVar = this.f95137b;
        C40040e eVar = this.f95138c;
        List list = this.f95139d;
        return "WishCampaignDataUiModel(header=" + fVar + ", card=" + cVar + ", deposit=" + eVar + ", backgrounds=" + list + ")";
    }
}
