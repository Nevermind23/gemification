package p155l5;

import p155l5.C6924o;

/* renamed from: l5.i */
final class C6912i extends C6924o {

    /* renamed from: a */
    private final C6924o.C6927c f20740a;

    /* renamed from: b */
    private final C6924o.C6926b f20741b;

    /* renamed from: l5.i$b */
    static final class C6914b extends C6924o.C6925a {

        /* renamed from: a */
        private C6924o.C6927c f20742a;

        /* renamed from: b */
        private C6924o.C6926b f20743b;

        C6914b() {
        }

        /* renamed from: a */
        public C6924o mo21069a() {
            return new C6912i(this.f20742a, this.f20743b);
        }

        /* renamed from: b */
        public C6924o.C6925a mo21070b(C6924o.C6926b bVar) {
            this.f20743b = bVar;
            return this;
        }

        /* renamed from: c */
        public C6924o.C6925a mo21071c(C6924o.C6927c cVar) {
            this.f20742a = cVar;
            return this;
        }
    }

    /* renamed from: b */
    public C6924o.C6926b mo21064b() {
        return this.f20741b;
    }

    /* renamed from: c */
    public C6924o.C6927c mo21065c() {
        return this.f20740a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6924o)) {
            return false;
        }
        C6924o oVar = (C6924o) obj;
        C6924o.C6927c cVar = this.f20740a;
        if (cVar != null ? cVar.equals(oVar.mo21065c()) : oVar.mo21065c() == null) {
            C6924o.C6926b bVar = this.f20741b;
            if (bVar == null) {
                if (oVar.mo21064b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo21064b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        C6924o.C6927c cVar = this.f20740a;
        int i2 = 0;
        if (cVar == null) {
            i = 0;
        } else {
            i = cVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C6924o.C6926b bVar = this.f20741b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f20740a + ", mobileSubtype=" + this.f20741b + "}";
    }

    private C6912i(C6924o.C6927c cVar, C6924o.C6926b bVar) {
        this.f20740a = cVar;
        this.f20741b = bVar;
    }
}
