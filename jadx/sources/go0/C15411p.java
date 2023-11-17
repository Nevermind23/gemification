package go0;

import ao0.C10125f;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import uo0.C18270b;

/* renamed from: go0.p */
public final class C15411p {

    /* renamed from: a */
    private final C10125f f43811a;

    /* renamed from: b */
    private final boolean f43812b;

    /* renamed from: c */
    private final C18270b f43813c;

    /* renamed from: d */
    private final List f43814d;

    public C15411p(C10125f fVar, boolean z, C18270b bVar, List list) {
        C41536l.m120489i(fVar, "offers");
        C41536l.m120489i(bVar, "bnplOffer");
        C41536l.m120489i(list, "offersProgressLookUps");
        this.f43811a = fVar;
        this.f43812b = z;
        this.f43813c = bVar;
        this.f43814d = list;
    }

    /* renamed from: a */
    public final C18270b mo42501a() {
        return this.f43813c;
    }

    /* renamed from: b */
    public final C10125f mo42502b() {
        return this.f43811a;
    }

    /* renamed from: c */
    public final List mo42503c() {
        return this.f43814d;
    }

    /* renamed from: d */
    public final boolean mo42504d() {
        return this.f43812b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15411p)) {
            return false;
        }
        C15411p pVar = (C15411p) obj;
        return C41536l.m120484d(this.f43811a, pVar.f43811a) && this.f43812b == pVar.f43812b && C41536l.m120484d(this.f43813c, pVar.f43813c) && C41536l.m120484d(this.f43814d, pVar.f43814d);
    }

    public int hashCode() {
        int hashCode = this.f43811a.hashCode() * 31;
        boolean z = this.f43812b;
        if (z) {
            z = true;
        }
        return ((((hashCode + (z ? 1 : 0)) * 31) + this.f43813c.hashCode()) * 31) + this.f43814d.hashCode();
    }

    public String toString() {
        C10125f fVar = this.f43811a;
        boolean z = this.f43812b;
        C18270b bVar = this.f43813c;
        List list = this.f43814d;
        return "MultiComponent(offers=" + fVar + ", isAllowed=" + z + ", bnplOffer=" + bVar + ", offersProgressLookUps=" + list + ")";
    }
}
