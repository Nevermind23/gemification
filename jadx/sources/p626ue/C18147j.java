package p626ue;

/* renamed from: ue.j */
public final class C18147j extends C18129d {

    /* renamed from: h */
    public static int f51449h = 41;

    /* renamed from: i */
    public static int f51450i = 0;

    /* renamed from: j */
    public static int f51451j = 1;

    /* renamed from: k */
    public static int f51452k = 2;

    /* renamed from: f */
    public static int m62232f() {
        return 72;
    }

    /* renamed from: d */
    public int mo45810d(int i) {
        int i2 = f51449h;
        if ((i2 * (f51451j + i2)) % f51452k != 0) {
            f51449h = m62232f();
            f51450i = 95;
        }
        int i3 = i % C11051p3.f31760d;
        if (i3 < 0) {
            i3 += C11051p3.f31760d;
            int i4 = f51449h;
            if ((i4 * (f51451j + i4)) % f51452k != 0) {
                f51449h = m62232f();
                f51450i = m62232f();
            }
        }
        return i3 + 1;
    }

    /* renamed from: e */
    public int mo45811e(int i) {
        int i2 = f51449h;
        if (((f51451j + i2) * i2) % f51452k != f51450i) {
            f51449h = 39;
            int f = m62232f();
            f51450i = f;
            int i3 = f51449h;
            if (((f51451j + i3) * i3) % f51452k != f) {
                f51449h = 68;
                f51450i = 75;
            }
        }
        return i - 1;
    }
}
