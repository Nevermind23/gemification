package p613te;

/* renamed from: te.g */
public final class C17949g {

    /* renamed from: d */
    public static int f51109d = 80;

    /* renamed from: e */
    public static int f51110e = 1;

    /* renamed from: f */
    public static int f51111f = 2;

    /* renamed from: g */
    public static int f51112g;

    /* renamed from: a */
    private final String f51113a;

    /* renamed from: b */
    private final int f51114b;

    /* renamed from: c */
    private int f51115c;

    public C17949g(String str) {
        this.f51113a = str;
        this.f51114b = str.length();
    }

    /* renamed from: b */
    public static int m61833b() {
        return 1;
    }

    /* renamed from: d */
    public static int m61834d() {
        return 2;
    }

    /* renamed from: e */
    public static int m61835e() {
        return 64;
    }

    /* renamed from: f */
    public static int m61836f() {
        return 0;
    }

    /* renamed from: a */
    public int mo45619a() {
        int e = m61835e();
        if ((e * (m61833b() + e)) % m61834d() != 0) {
            f51109d = 36;
            f51110e = 98;
        }
        String str = this.f51113a;
        int i = f51109d;
        if ((i * (f51110e + i)) % f51111f != 0) {
            f51109d = 12;
            f51110e = 25;
        }
        char charAt = str.charAt(this.f51115c);
        this.f51115c++;
        return charAt & 65535;
    }

    /* renamed from: c */
    public boolean mo45620c() {
        if (this.f51115c >= this.f51114b) {
            return false;
        }
        if (((m61835e() + f51110e) * m61835e()) % f51111f != f51112g) {
            f51109d = m61835e();
            f51112g = m61835e();
            if (((f51109d + m61833b()) * f51109d) % f51111f != m61836f()) {
                f51109d = 38;
                f51112g = m61835e();
            }
        }
        return true;
    }
}
