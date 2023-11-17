package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.s */
final class C6379s extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b {

    /* renamed from: a */
    private final long f19582a;

    /* renamed from: b */
    private final String f19583b;

    /* renamed from: c */
    private final String f19584c;

    /* renamed from: d */
    private final long f19585d;

    /* renamed from: e */
    private final int f19586e;

    /* renamed from: g9.s$b */
    static final class C6381b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a {

        /* renamed from: a */
        private Long f19587a;

        /* renamed from: b */
        private String f19588b;

        /* renamed from: c */
        private String f19589c;

        /* renamed from: d */
        private Long f19590d;

        /* renamed from: e */
        private Integer f19591e;

        C6381b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b mo20131a() {
            String str = "";
            if (this.f19587a == null) {
                str = str + " pc";
            }
            if (this.f19588b == null) {
                str = str + " symbol";
            }
            if (this.f19590d == null) {
                str = str + " offset";
            }
            if (this.f19591e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C6379s(this.f19587a.longValue(), this.f19588b, this.f19589c, this.f19590d.longValue(), this.f19591e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a mo20132b(String str) {
            this.f19589c = str;
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a mo20133c(int i) {
            this.f19591e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a mo20134d(long j) {
            this.f19590d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a mo20135e(long j) {
            this.f19587a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b.C6318a mo20136f(String str) {
            if (str != null) {
                this.f19588b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    /* renamed from: b */
    public String mo20126b() {
        return this.f19584c;
    }

    /* renamed from: c */
    public int mo20127c() {
        return this.f19586e;
    }

    /* renamed from: d */
    public long mo20128d() {
        return this.f19585d;
    }

    /* renamed from: e */
    public long mo20129e() {
        return this.f19582a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b bVar = (C6285b0.C6297e.C6304d.C6305a.C6307b.C6315e.C6317b) obj;
        if (this.f19582a == bVar.mo20129e() && this.f19583b.equals(bVar.mo20130f()) && ((str = this.f19584c) != null ? str.equals(bVar.mo20126b()) : bVar.mo20126b() == null) && this.f19585d == bVar.mo20128d() && this.f19586e == bVar.mo20127c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo20130f() {
        return this.f19583b;
    }

    public int hashCode() {
        int i;
        long j = this.f19582a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19583b.hashCode()) * 1000003;
        String str = this.f19584c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.f19585d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19586e;
    }

    public String toString() {
        return "Frame{pc=" + this.f19582a + ", symbol=" + this.f19583b + ", file=" + this.f19584c + ", offset=" + this.f19585d + ", importance=" + this.f19586e + "}";
    }

    private C6379s(long j, String str, String str2, long j2, int i) {
        this.f19582a = j;
        this.f19583b = str;
        this.f19584c = str2;
        this.f19585d = j2;
        this.f19586e = i;
    }
}
