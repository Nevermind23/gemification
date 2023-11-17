package p326y8;

/* renamed from: y8.r */
public final class C9131r {

    /* renamed from: a */
    private final C9102b0 f25319a;

    /* renamed from: b */
    private final int f25320b;

    /* renamed from: c */
    private final int f25321c;

    private C9131r(Class cls, int i, int i2) {
        this(C9102b0.m33558b(cls), i, i2);
    }

    /* renamed from: a */
    public static C9131r m33667a(Class cls) {
        return new C9131r(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m33668b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    /* renamed from: h */
    public static C9131r m33669h(Class cls) {
        return new C9131r(cls, 0, 0);
    }

    /* renamed from: i */
    public static C9131r m33670i(Class cls) {
        return new C9131r(cls, 0, 1);
    }

    /* renamed from: j */
    public static C9131r m33671j(Class cls) {
        return new C9131r(cls, 1, 0);
    }

    /* renamed from: k */
    public static C9131r m33672k(C9102b0 b0Var) {
        return new C9131r(b0Var, 1, 0);
    }

    /* renamed from: l */
    public static C9131r m33673l(Class cls) {
        return new C9131r(cls, 1, 1);
    }

    /* renamed from: m */
    public static C9131r m33674m(Class cls) {
        return new C9131r(cls, 2, 0);
    }

    /* renamed from: c */
    public C9102b0 mo24697c() {
        return this.f25319a;
    }

    /* renamed from: d */
    public boolean mo24698d() {
        return this.f25321c == 2;
    }

    /* renamed from: e */
    public boolean mo24699e() {
        return this.f25321c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9131r)) {
            return false;
        }
        C9131r rVar = (C9131r) obj;
        if (this.f25319a.equals(rVar.f25319a) && this.f25320b == rVar.f25320b && this.f25321c == rVar.f25321c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo24701f() {
        return this.f25320b == 1;
    }

    /* renamed from: g */
    public boolean mo24702g() {
        return this.f25320b == 2;
    }

    public int hashCode() {
        return ((((this.f25319a.hashCode() ^ 1000003) * 1000003) ^ this.f25320b) * 1000003) ^ this.f25321c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f25319a);
        sb.append(", type=");
        int i = this.f25320b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m33668b(this.f25321c));
        sb.append("}");
        return sb.toString();
    }

    private C9131r(C9102b0 b0Var, int i, int i2) {
        this.f25319a = (C9102b0) C9100a0.m33554c(b0Var, "Null dependency anInterface.");
        this.f25320b = i;
        this.f25321c = i2;
    }
}
