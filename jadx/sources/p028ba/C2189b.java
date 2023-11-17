package p028ba;

import p028ba.C2197f;

/* renamed from: ba.b */
final class C2189b extends C2197f {

    /* renamed from: a */
    private final String f6389a;

    /* renamed from: b */
    private final long f6390b;

    /* renamed from: c */
    private final C2197f.C2199b f6391c;

    /* renamed from: ba.b$b */
    static final class C2191b extends C2197f.C2198a {

        /* renamed from: a */
        private String f6392a;

        /* renamed from: b */
        private Long f6393b;

        /* renamed from: c */
        private C2197f.C2199b f6394c;

        C2191b() {
        }

        /* renamed from: a */
        public C2197f mo7119a() {
            String str = "";
            if (this.f6393b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2189b(this.f6392a, this.f6393b.longValue(), this.f6394c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2197f.C2198a mo7120b(C2197f.C2199b bVar) {
            this.f6394c = bVar;
            return this;
        }

        /* renamed from: c */
        public C2197f.C2198a mo7121c(String str) {
            this.f6392a = str;
            return this;
        }

        /* renamed from: d */
        public C2197f.C2198a mo7122d(long j) {
            this.f6393b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public C2197f.C2199b mo7113b() {
        return this.f6391c;
    }

    /* renamed from: c */
    public String mo7114c() {
        return this.f6389a;
    }

    /* renamed from: d */
    public long mo7115d() {
        return this.f6390b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2197f)) {
            return false;
        }
        C2197f fVar = (C2197f) obj;
        String str = this.f6389a;
        if (str != null ? str.equals(fVar.mo7114c()) : fVar.mo7114c() == null) {
            if (this.f6390b == fVar.mo7115d()) {
                C2197f.C2199b bVar = this.f6391c;
                if (bVar == null) {
                    if (fVar.mo7113b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.mo7113b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f6389a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j = this.f6390b;
        int i3 = (((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C2197f.C2199b bVar = this.f6391c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.f6389a + ", tokenExpirationTimestamp=" + this.f6390b + ", responseCode=" + this.f6391c + "}";
    }

    private C2189b(String str, long j, C2197f.C2199b bVar) {
        this.f6389a = str;
        this.f6390b = j;
        this.f6391c = bVar;
    }
}
