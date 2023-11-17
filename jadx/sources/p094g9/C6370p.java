package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.p */
final class C6370p extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c {

    /* renamed from: a */
    private final String f19560a;

    /* renamed from: b */
    private final String f19561b;

    /* renamed from: c */
    private final C6331c0 f19562c;

    /* renamed from: d */
    private final C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c f19563d;

    /* renamed from: e */
    private final int f19564e;

    /* renamed from: g9.p$b */
    static final class C6372b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a {

        /* renamed from: a */
        private String f19565a;

        /* renamed from: b */
        private String f19566b;

        /* renamed from: c */
        private C6331c0 f19567c;

        /* renamed from: d */
        private C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c f19568d;

        /* renamed from: e */
        private Integer f19569e;

        C6372b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c mo20106a() {
            String str = "";
            if (this.f19565a == null) {
                str = str + " type";
            }
            if (this.f19567c == null) {
                str = str + " frames";
            }
            if (this.f19569e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C6370p(this.f19565a, this.f19566b, this.f19567c, this.f19568d, this.f19569e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a mo20107b(C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar) {
            this.f19568d = cVar;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a mo20108c(C6331c0 c0Var) {
            if (c0Var != null) {
                this.f19567c = c0Var;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a mo20109d(int i) {
            this.f19569e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a mo20110e(String str) {
            this.f19566b = str;
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c.C6312a mo20111f(String str) {
            if (str != null) {
                this.f19565a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    /* renamed from: b */
    public C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c mo20101b() {
        return this.f19563d;
    }

    /* renamed from: c */
    public C6331c0 mo20102c() {
        return this.f19562c;
    }

    /* renamed from: d */
    public int mo20103d() {
        return this.f19564e;
    }

    /* renamed from: e */
    public String mo20104e() {
        return this.f19561b;
    }

    public boolean equals(Object obj) {
        String str;
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar2 = (C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c) obj;
        if (!this.f19560a.equals(cVar2.mo20105f()) || ((str = this.f19561b) != null ? !str.equals(cVar2.mo20104e()) : cVar2.mo20104e() != null) || !this.f19562c.equals(cVar2.mo20102c()) || ((cVar = this.f19563d) != null ? !cVar.equals(cVar2.mo20101b()) : cVar2.mo20101b() != null) || this.f19564e != cVar2.mo20103d()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo20105f() {
        return this.f19560a;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f19560a.hashCode() ^ 1000003) * 1000003;
        String str = this.f19561b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f19562c.hashCode()) * 1000003;
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar = this.f19563d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f19564e;
    }

    public String toString() {
        return "Exception{type=" + this.f19560a + ", reason=" + this.f19561b + ", frames=" + this.f19562c + ", causedBy=" + this.f19563d + ", overflowCount=" + this.f19564e + "}";
    }

    private C6370p(String str, String str2, C6331c0 c0Var, C6285b0.C6297e.C6304d.C6305a.C6307b.C6311c cVar, int i) {
        this.f19560a = str;
        this.f19561b = str2;
        this.f19562c = c0Var;
        this.f19563d = cVar;
        this.f19564e = i;
    }
}
