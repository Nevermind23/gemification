package p168m5;

import java.util.Map;
import p168m5.C7118i;

/* renamed from: m5.b */
final class C7103b extends C7118i {

    /* renamed from: a */
    private final String f21080a;

    /* renamed from: b */
    private final Integer f21081b;

    /* renamed from: c */
    private final C7117h f21082c;

    /* renamed from: d */
    private final long f21083d;

    /* renamed from: e */
    private final long f21084e;

    /* renamed from: f */
    private final Map f21085f;

    /* renamed from: m5.b$b */
    static final class C7105b extends C7118i.C7119a {

        /* renamed from: a */
        private String f21086a;

        /* renamed from: b */
        private Integer f21087b;

        /* renamed from: c */
        private C7117h f21088c;

        /* renamed from: d */
        private Long f21089d;

        /* renamed from: e */
        private Long f21090e;

        /* renamed from: f */
        private Map f21091f;

        C7105b() {
        }

        /* renamed from: d */
        public C7118i mo21333d() {
            String str = "";
            if (this.f21086a == null) {
                str = str + " transportName";
            }
            if (this.f21088c == null) {
                str = str + " encodedPayload";
            }
            if (this.f21089d == null) {
                str = str + " eventMillis";
            }
            if (this.f21090e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f21091f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C7103b(this.f21086a, this.f21087b, this.f21088c, this.f21089d.longValue(), this.f21090e.longValue(), this.f21091f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map mo21334e() {
            Map map = this.f21091f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C7118i.C7119a mo21335f(Map map) {
            if (map != null) {
                this.f21091f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C7118i.C7119a mo21336g(Integer num) {
            this.f21087b = num;
            return this;
        }

        /* renamed from: h */
        public C7118i.C7119a mo21337h(C7117h hVar) {
            if (hVar != null) {
                this.f21088c = hVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C7118i.C7119a mo21338i(long j) {
            this.f21089d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C7118i.C7119a mo21339j(String str) {
            if (str != null) {
                this.f21086a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C7118i.C7119a mo21340k(long j) {
            this.f21090e = Long.valueOf(j);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map mo21324c() {
        return this.f21085f;
    }

    /* renamed from: d */
    public Integer mo21325d() {
        return this.f21081b;
    }

    /* renamed from: e */
    public C7117h mo21326e() {
        return this.f21082c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7118i)) {
            return false;
        }
        C7118i iVar = (C7118i) obj;
        if (!this.f21080a.equals(iVar.mo21330j()) || ((num = this.f21081b) != null ? !num.equals(iVar.mo21325d()) : iVar.mo21325d() != null) || !this.f21082c.equals(iVar.mo21326e()) || this.f21083d != iVar.mo21328f() || this.f21084e != iVar.mo21331k() || !this.f21085f.equals(iVar.mo21324c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo21328f() {
        return this.f21083d;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f21080a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21081b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f21083d;
        long j2 = this.f21084e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f21082c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f21085f.hashCode();
    }

    /* renamed from: j */
    public String mo21330j() {
        return this.f21080a;
    }

    /* renamed from: k */
    public long mo21331k() {
        return this.f21084e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f21080a + ", code=" + this.f21081b + ", encodedPayload=" + this.f21082c + ", eventMillis=" + this.f21083d + ", uptimeMillis=" + this.f21084e + ", autoMetadata=" + this.f21085f + "}";
    }

    private C7103b(String str, Integer num, C7117h hVar, long j, long j2, Map map) {
        this.f21080a = str;
        this.f21081b = num;
        this.f21082c = hVar;
        this.f21083d = j;
        this.f21084e = j2;
        this.f21085f = map;
    }
}
