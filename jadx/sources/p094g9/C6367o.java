package p094g9;

import p094g9.C6285b0;

/* renamed from: g9.o */
final class C6367o extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a {

    /* renamed from: a */
    private final long f19552a;

    /* renamed from: b */
    private final long f19553b;

    /* renamed from: c */
    private final String f19554c;

    /* renamed from: d */
    private final String f19555d;

    /* renamed from: g9.o$b */
    static final class C6369b extends C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a {

        /* renamed from: a */
        private Long f19556a;

        /* renamed from: b */
        private Long f19557b;

        /* renamed from: c */
        private String f19558c;

        /* renamed from: d */
        private String f19559d;

        C6369b() {
        }

        /* renamed from: a */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a mo20089a() {
            String str = "";
            if (this.f19556a == null) {
                str = str + " baseAddress";
            }
            if (this.f19557b == null) {
                str = str + " size";
            }
            if (this.f19558c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C6367o(this.f19556a.longValue(), this.f19557b.longValue(), this.f19558c, this.f19559d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a mo20090b(long j) {
            this.f19556a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a mo20091c(String str) {
            if (str != null) {
                this.f19558c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a mo20092d(long j) {
            this.f19557b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a.C6309a mo20093e(String str) {
            this.f19559d = str;
            return this;
        }
    }

    /* renamed from: b */
    public long mo20084b() {
        return this.f19552a;
    }

    /* renamed from: c */
    public String mo20085c() {
        return this.f19554c;
    }

    /* renamed from: d */
    public long mo20086d() {
        return this.f19553b;
    }

    /* renamed from: e */
    public String mo20087e() {
        return this.f19555d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a)) {
            return false;
        }
        C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a aVar = (C6285b0.C6297e.C6304d.C6305a.C6307b.C6308a) obj;
        if (this.f19552a == aVar.mo20084b() && this.f19553b == aVar.mo20086d() && this.f19554c.equals(aVar.mo20085c())) {
            String str = this.f19555d;
            if (str == null) {
                if (aVar.mo20087e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo20087e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f19552a;
        long j2 = this.f19553b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19554c.hashCode()) * 1000003;
        String str = this.f19555d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f19552a + ", size=" + this.f19553b + ", name=" + this.f19554c + ", uuid=" + this.f19555d + "}";
    }

    private C6367o(long j, long j2, String str, String str2) {
        this.f19552a = j;
        this.f19553b = j2;
        this.f19554c = str;
        this.f19555d = str2;
    }
}
