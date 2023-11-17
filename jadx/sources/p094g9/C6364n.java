package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.n */
final class C6364n extends C6285b0.C6297e.C6304d.C6305a.C6307b {

    /* renamed from: a */
    private final C6331c0 f19542a;

    /* renamed from: b */
    private final C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c f19543b;

    /* renamed from: c */
    private final C6285b0.C6286a f19544c;

    /* renamed from: d */
    private final C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d f19545d;

    /* renamed from: e */
    private final C6331c0 f19546e;

    /* renamed from: g9.n$b */
    static final class C6366b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b {

        /* renamed from: a */
        private C6331c0 f19547a;

        /* renamed from: b */
        private C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c f19548b;

        /* renamed from: c */
        private C6285b0.C6286a f19549c;

        /* renamed from: d */
        private C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d f19550d;

        /* renamed from: e */
        private C6331c0 f19551e;

        C6366b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b mo20095a() {
            String str = "";
            if (this.f19550d == null) {
                str = str + " signal";
            }
            if (this.f19551e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C6364n(this.f19547a, this.f19548b, this.f19549c, this.f19550d, this.f19551e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b mo20096b(C6285b0.C6286a aVar) {
            this.f19549c = aVar;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b mo20097c(C6331c0 c0Var) {
            if (c0Var != null) {
                this.f19551e = c0Var;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b mo20098d(C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar) {
            this.f19548b = cVar;
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b mo20099e(C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d dVar) {
            if (dVar != null) {
                this.f19550d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6310b mo20100f(C6331c0 c0Var) {
            this.f19547a = c0Var;
            return this;
        }
    }

    /* renamed from: b */
    public C6285b0.C6286a mo20079b() {
        return this.f19544c;
    }

    /* renamed from: c */
    public C6331c0 mo20080c() {
        return this.f19546e;
    }

    /* renamed from: d */
    public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c mo20081d() {
        return this.f19543b;
    }

    /* renamed from: e */
    public C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d mo20082e() {
        return this.f19545d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b bVar = (C6285b0.C6297e.C6304d.C6305a.C6307b) obj;
        C6331c0 c0Var = this.f19542a;
        if (c0Var != null ? c0Var.equals(bVar.mo20083f()) : bVar.mo20083f() == null) {
            C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar = this.f19543b;
            if (cVar != null ? cVar.equals(bVar.mo20081d()) : bVar.mo20081d() == null) {
                C6285b0.C6286a aVar = this.f19544c;
                if (aVar != null ? aVar.equals(bVar.mo20079b()) : bVar.mo20079b() == null) {
                    if (this.f19545d.equals(bVar.mo20082e()) && this.f19546e.equals(bVar.mo20080c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public C6331c0 mo20083f() {
        return this.f19542a;
    }

    public int hashCode() {
        int i;
        int i2;
        C6331c0 c0Var = this.f19542a;
        int i3 = 0;
        if (c0Var == null) {
            i = 0;
        } else {
            i = c0Var.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar = this.f19543b;
        if (cVar == null) {
            i2 = 0;
        } else {
            i2 = cVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        C6285b0.C6286a aVar = this.f19544c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f19545d.hashCode()) * 1000003) ^ this.f19546e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f19542a + ", exception=" + this.f19543b + ", appExitInfo=" + this.f19544c + ", signal=" + this.f19545d + ", binaries=" + this.f19546e + "}";
    }

    private C6364n(C6331c0 c0Var, C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar, C6285b0.C6286a aVar, C6285b0.C6297e.C6304d.C6305a.C6307b.C6313d dVar, C6331c0 c0Var2) {
        this.f19542a = c0Var;
        this.f19543b = cVar;
        this.f19544c = aVar;
        this.f19545d = dVar;
        this.f19546e = c0Var2;
    }
}
