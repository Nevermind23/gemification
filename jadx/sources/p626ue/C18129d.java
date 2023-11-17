package p626ue;

/* renamed from: ue.d */
public abstract class C18129d {

    /* renamed from: a */
    public static final C18129d f51431a = new C18147j();

    /* renamed from: b */
    public static final C18129d f51432b = new C18127b();

    /* renamed from: c */
    public static final C18129d f51433c = new C18146i();

    /* renamed from: d */
    public static int f51434d = 0;

    /* renamed from: e */
    public static int f51435e = 2;

    /* renamed from: f */
    public static int f51436f = 8;

    /* renamed from: g */
    public static int f51437g = 1;

    static {
        int i = f51436f;
        int i2 = f51437g;
        int i3 = f51435e;
        if (((i + i2) * i) % i3 != f51434d) {
            if ((i * (i2 + i)) % i3 != 0) {
                f51436f = m62207c();
                f51434d = m62207c();
            }
            f51436f = m62207c();
            f51434d = m62207c();
        }
    }

    /* renamed from: a */
    public static C18129d m62205a(int i) {
        if (i == 0) {
            return f51432b;
        }
        if ((63488 & i) != 0) {
            return f51433c;
        }
        if ((i & 1920) != 0) {
            C18129d dVar = f51432b;
            if (((m62207c() + m62206b()) * m62207c()) % f51435e != f51434d) {
                f51434d = m62207c();
            }
            return dVar;
        }
        C18129d dVar2 = f51431a;
        int i2 = f51436f;
        if ((i2 * (f51437g + i2)) % f51435e != 0) {
            f51436f = 48;
            f51434d = m62207c();
        }
        return dVar2;
    }

    /* renamed from: b */
    public static int m62206b() {
        return 1;
    }

    /* renamed from: c */
    public static int m62207c() {
        return 92;
    }

    /* renamed from: d */
    public abstract int mo45810d(int i);

    /* renamed from: e */
    public abstract int mo45811e(int i);
}
