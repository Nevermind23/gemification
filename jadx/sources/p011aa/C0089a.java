package p011aa;

import p011aa.C0093c;
import p011aa.C0095d;

/* renamed from: aa.a */
final class C0089a extends C0095d {

    /* renamed from: b */
    private final String f902b;

    /* renamed from: c */
    private final C0093c.C0094a f903c;

    /* renamed from: d */
    private final String f904d;

    /* renamed from: e */
    private final String f905e;

    /* renamed from: f */
    private final long f906f;

    /* renamed from: g */
    private final long f907g;

    /* renamed from: h */
    private final String f908h;

    /* renamed from: aa.a$b */
    static final class C0091b extends C0095d.C0096a {

        /* renamed from: a */
        private String f909a;

        /* renamed from: b */
        private C0093c.C0094a f910b;

        /* renamed from: c */
        private String f911c;

        /* renamed from: d */
        private String f912d;

        /* renamed from: e */
        private Long f913e;

        /* renamed from: f */
        private Long f914f;

        /* renamed from: g */
        private String f915g;

        /* renamed from: a */
        public C0095d mo141a() {
            String str = "";
            if (this.f910b == null) {
                str = str + " registrationStatus";
            }
            if (this.f913e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f914f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C0089a(this.f909a, this.f910b, this.f911c, this.f912d, this.f913e.longValue(), this.f914f.longValue(), this.f915g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C0095d.C0096a mo142b(String str) {
            this.f911c = str;
            return this;
        }

        /* renamed from: c */
        public C0095d.C0096a mo143c(long j) {
            this.f913e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C0095d.C0096a mo144d(String str) {
            this.f909a = str;
            return this;
        }

        /* renamed from: e */
        public C0095d.C0096a mo145e(String str) {
            this.f915g = str;
            return this;
        }

        /* renamed from: f */
        public C0095d.C0096a mo146f(String str) {
            this.f912d = str;
            return this;
        }

        /* renamed from: g */
        public C0095d.C0096a mo147g(C0093c.C0094a aVar) {
            if (aVar != null) {
                this.f910b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C0095d.C0096a mo148h(long j) {
            this.f914f = Long.valueOf(j);
            return this;
        }

        C0091b() {
        }

        private C0091b(C0095d dVar) {
            this.f909a = dVar.mo132d();
            this.f910b = dVar.mo136g();
            this.f911c = dVar.mo130b();
            this.f912d = dVar.mo135f();
            this.f913e = Long.valueOf(dVar.mo131c());
            this.f914f = Long.valueOf(dVar.mo137h());
            this.f915g = dVar.mo133e();
        }
    }

    /* renamed from: b */
    public String mo130b() {
        return this.f904d;
    }

    /* renamed from: c */
    public long mo131c() {
        return this.f906f;
    }

    /* renamed from: d */
    public String mo132d() {
        return this.f902b;
    }

    /* renamed from: e */
    public String mo133e() {
        return this.f908h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0095d)) {
            return false;
        }
        C0095d dVar = (C0095d) obj;
        String str3 = this.f902b;
        if (str3 != null ? str3.equals(dVar.mo132d()) : dVar.mo132d() == null) {
            if (this.f903c.equals(dVar.mo136g()) && ((str = this.f904d) != null ? str.equals(dVar.mo130b()) : dVar.mo130b() == null) && ((str2 = this.f905e) != null ? str2.equals(dVar.mo135f()) : dVar.mo135f() == null) && this.f906f == dVar.mo131c() && this.f907g == dVar.mo137h()) {
                String str4 = this.f908h;
                if (str4 == null) {
                    if (dVar.mo133e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.mo133e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo135f() {
        return this.f905e;
    }

    /* renamed from: g */
    public C0093c.C0094a mo136g() {
        return this.f903c;
    }

    /* renamed from: h */
    public long mo137h() {
        return this.f907g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f902b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f903c.hashCode()) * 1000003;
        String str2 = this.f904d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f905e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f906f;
        long j2 = this.f907g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f908h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    /* renamed from: n */
    public C0095d.C0096a mo139n() {
        return new C0091b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f902b + ", registrationStatus=" + this.f903c + ", authToken=" + this.f904d + ", refreshToken=" + this.f905e + ", expiresInSecs=" + this.f906f + ", tokenCreationEpochInSecs=" + this.f907g + ", fisError=" + this.f908h + "}";
    }

    private C0089a(String str, C0093c.C0094a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f902b = str;
        this.f903c = aVar;
        this.f904d = str2;
        this.f905e = str3;
        this.f906f = j;
        this.f907g = j2;
        this.f908h = str4;
    }
}
