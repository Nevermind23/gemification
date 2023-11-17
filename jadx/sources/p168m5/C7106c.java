package p168m5;

import p142k5.C6811b;
import p142k5.C6812c;
import p142k5.C6814e;
import p168m5.C7127o;

/* renamed from: m5.c */
final class C7106c extends C7127o {

    /* renamed from: a */
    private final C7129p f21092a;

    /* renamed from: b */
    private final String f21093b;

    /* renamed from: c */
    private final C6812c f21094c;

    /* renamed from: d */
    private final C6814e f21095d;

    /* renamed from: e */
    private final C6811b f21096e;

    /* renamed from: m5.c$b */
    static final class C7108b extends C7127o.C7128a {

        /* renamed from: a */
        private C7129p f21097a;

        /* renamed from: b */
        private String f21098b;

        /* renamed from: c */
        private C6812c f21099c;

        /* renamed from: d */
        private C6814e f21100d;

        /* renamed from: e */
        private C6811b f21101e;

        C7108b() {
        }

        /* renamed from: a */
        public C7127o mo21349a() {
            String str = "";
            if (this.f21097a == null) {
                str = str + " transportContext";
            }
            if (this.f21098b == null) {
                str = str + " transportName";
            }
            if (this.f21099c == null) {
                str = str + " event";
            }
            if (this.f21100d == null) {
                str = str + " transformer";
            }
            if (this.f21101e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C7106c(this.f21097a, this.f21098b, this.f21099c, this.f21100d, this.f21101e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C7127o.C7128a mo21350b(C6811b bVar) {
            if (bVar != null) {
                this.f21101e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C7127o.C7128a mo21351c(C6812c cVar) {
            if (cVar != null) {
                this.f21099c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C7127o.C7128a mo21352d(C6814e eVar) {
            if (eVar != null) {
                this.f21100d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public C7127o.C7128a mo21353e(C7129p pVar) {
            if (pVar != null) {
                this.f21097a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public C7127o.C7128a mo21354f(String str) {
            if (str != null) {
                this.f21098b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* renamed from: b */
    public C6811b mo21341b() {
        return this.f21096e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6812c mo21342c() {
        return this.f21094c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6814e mo21343e() {
        return this.f21095d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7127o)) {
            return false;
        }
        C7127o oVar = (C7127o) obj;
        if (!this.f21092a.equals(oVar.mo21345f()) || !this.f21093b.equals(oVar.mo21346g()) || !this.f21094c.equals(oVar.mo21342c()) || !this.f21095d.equals(oVar.mo21343e()) || !this.f21096e.equals(oVar.mo21341b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C7129p mo21345f() {
        return this.f21092a;
    }

    /* renamed from: g */
    public String mo21346g() {
        return this.f21093b;
    }

    public int hashCode() {
        return ((((((((this.f21092a.hashCode() ^ 1000003) * 1000003) ^ this.f21093b.hashCode()) * 1000003) ^ this.f21094c.hashCode()) * 1000003) ^ this.f21095d.hashCode()) * 1000003) ^ this.f21096e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f21092a + ", transportName=" + this.f21093b + ", event=" + this.f21094c + ", transformer=" + this.f21095d + ", encoding=" + this.f21096e + "}";
    }

    private C7106c(C7129p pVar, String str, C6812c cVar, C6814e eVar, C6811b bVar) {
        this.f21092a = pVar;
        this.f21093b = str;
        this.f21094c = cVar;
        this.f21095d = eVar;
        this.f21096e = bVar;
    }
}
