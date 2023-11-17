package p094g9;

import p094g9.C6335d0;

/* renamed from: g9.x */
final class C6394x extends C6335d0 {

    /* renamed from: a */
    private final C6335d0.C6336a f19616a;

    /* renamed from: b */
    private final C6335d0.C6338c f19617b;

    /* renamed from: c */
    private final C6335d0.C6337b f19618c;

    C6394x(C6335d0.C6336a aVar, C6335d0.C6338c cVar, C6335d0.C6337b bVar) {
        if (aVar != null) {
            this.f19616a = aVar;
            if (cVar != null) {
                this.f19617b = cVar;
                if (bVar != null) {
                    this.f19618c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public C6335d0.C6336a mo20202a() {
        return this.f19616a;
    }

    /* renamed from: c */
    public C6335d0.C6337b mo20203c() {
        return this.f19618c;
    }

    /* renamed from: d */
    public C6335d0.C6338c mo20204d() {
        return this.f19617b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6335d0)) {
            return false;
        }
        C6335d0 d0Var = (C6335d0) obj;
        if (!this.f19616a.equals(d0Var.mo20202a()) || !this.f19617b.equals(d0Var.mo20204d()) || !this.f19618c.equals(d0Var.mo20203c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f19616a.hashCode() ^ 1000003) * 1000003) ^ this.f19617b.hashCode()) * 1000003) ^ this.f19618c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f19616a + ", osData=" + this.f19617b + ", deviceData=" + this.f19618c + "}";
    }
}
