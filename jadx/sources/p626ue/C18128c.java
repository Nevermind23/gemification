package p626ue;

/* renamed from: ue.c */
public final class C18128c {

    /* renamed from: d */
    public static int f51424d = 62;

    /* renamed from: e */
    public static int f51425e = 0;

    /* renamed from: f */
    public static int f51426f = 1;

    /* renamed from: g */
    public static int f51427g = 2;

    /* renamed from: a */
    private final String f51428a;

    /* renamed from: b */
    private final int f51429b;

    /* renamed from: c */
    private int f51430c;

    public C18128c(String str) {
        this.f51428a = str;
        this.f51429b = str.length();
    }

    /* renamed from: b */
    public static int m62201b() {
        return 88;
    }

    /* renamed from: d */
    public static int m62202d() {
        return 2;
    }

    /* renamed from: a */
    public int mo45812a() {
        char charAt = this.f51428a.charAt(this.f51430c);
        int i = f51424d;
        int i2 = f51426f;
        if (((i + i2) * i) % f51427g != f51425e) {
            f51424d = 47;
            f51425e = 38;
        }
        this.f51430c++;
        char c = charAt & 65535;
        int i3 = f51424d;
        if (((i2 + i3) * i3) % m62202d() != f51425e) {
            f51424d = 21;
            f51425e = 6;
        }
        return c;
    }

    /* renamed from: c */
    public boolean mo45813c() {
        int i = f51424d;
        if ((i * (f51426f + i)) % f51427g != 0) {
            f51424d = m62201b();
            f51425e = m62201b();
        }
        if (this.f51430c >= this.f51429b) {
            return false;
        }
        int i2 = f51424d;
        if (((f51426f + i2) * i2) % f51427g != f51425e) {
            f51424d = 54;
            f51425e = m62201b();
        }
        return true;
    }
}
