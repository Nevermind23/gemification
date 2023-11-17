package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.l */
final class C6358l extends C6285b0.C6297e.C6304d {

    /* renamed from: a */
    private final long f19522a;

    /* renamed from: b */
    private final String f19523b;

    /* renamed from: c */
    private final C6285b0.C6297e.C6304d.C6305a f19524c;

    /* renamed from: d */
    private final C6285b0.C6297e.C6304d.C6320c f19525d;

    /* renamed from: e */
    private final C6285b0.C6297e.C6304d.C6322d f19526e;

    /* renamed from: g9.l$b */
    static final class C6360b extends C6285b0.C6297e.C6304d.C6319b {

        /* renamed from: a */
        private Long f19527a;

        /* renamed from: b */
        private String f19528b;

        /* renamed from: c */
        private C6285b0.C6297e.C6304d.C6305a f19529c;

        /* renamed from: d */
        private C6285b0.C6297e.C6304d.C6320c f19530d;

        /* renamed from: e */
        private C6285b0.C6297e.C6304d.C6322d f19531e;

        /* renamed from: a */
        public C6285b0.C6297e.C6304d mo20137a() {
            String str = "";
            if (this.f19527a == null) {
                str = str + " timestamp";
            }
            if (this.f19528b == null) {
                str = str + " type";
            }
            if (this.f19529c == null) {
                str = str + " app";
            }
            if (this.f19530d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C6358l(this.f19527a.longValue(), this.f19528b, this.f19529c, this.f19530d, this.f19531e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6319b mo20138b(C6285b0.C6297e.C6304d.C6305a aVar) {
            if (aVar != null) {
                this.f19529c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6319b mo20139c(C6285b0.C6297e.C6304d.C6320c cVar) {
            if (cVar != null) {
                this.f19530d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6319b mo20140d(C6285b0.C6297e.C6304d.C6322d dVar) {
            this.f19531e = dVar;
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6319b mo20141e(long j) {
            this.f19527a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6319b mo20142f(String str) {
            if (str != null) {
                this.f19528b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        C6360b() {
        }

        private C6360b(C6285b0.C6297e.C6304d dVar) {
            this.f19527a = Long.valueOf(dVar.mo20064e());
            this.f19528b = dVar.mo20065f();
            this.f19529c = dVar.mo20061b();
            this.f19530d = dVar.mo20062c();
            this.f19531e = dVar.mo20063d();
        }
    }

    /* renamed from: b */
    public C6285b0.C6297e.C6304d.C6305a mo20061b() {
        return this.f19524c;
    }

    /* renamed from: c */
    public C6285b0.C6297e.C6304d.C6320c mo20062c() {
        return this.f19525d;
    }

    /* renamed from: d */
    public C6285b0.C6297e.C6304d.C6322d mo20063d() {
        return this.f19526e;
    }

    /* renamed from: e */
    public long mo20064e() {
        return this.f19522a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d)) {
            return false;
        }
        C6285b0.C6297e.C6304d dVar = (C6285b0.C6297e.C6304d) obj;
        if (this.f19522a == dVar.mo20064e() && this.f19523b.equals(dVar.mo20065f()) && this.f19524c.equals(dVar.mo20061b()) && this.f19525d.equals(dVar.mo20062c())) {
            C6285b0.C6297e.C6304d.C6322d dVar2 = this.f19526e;
            if (dVar2 == null) {
                if (dVar.mo20063d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo20063d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo20065f() {
        return this.f19523b;
    }

    /* renamed from: g */
    public C6285b0.C6297e.C6304d.C6319b mo20066g() {
        return new C6360b(this);
    }

    public int hashCode() {
        int i;
        long j = this.f19522a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19523b.hashCode()) * 1000003) ^ this.f19524c.hashCode()) * 1000003) ^ this.f19525d.hashCode()) * 1000003;
        C6285b0.C6297e.C6304d.C6322d dVar = this.f19526e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.f19522a + ", type=" + this.f19523b + ", app=" + this.f19524c + ", device=" + this.f19525d + ", log=" + this.f19526e + "}";
    }

    private C6358l(long j, String str, C6285b0.C6297e.C6304d.C6305a aVar, C6285b0.C6297e.C6304d.C6320c cVar, C6285b0.C6297e.C6304d.C6322d dVar) {
        this.f19522a = j;
        this.f19523b = str;
        this.f19524c = aVar;
        this.f19525d = cVar;
        this.f19526e = dVar;
    }
}
