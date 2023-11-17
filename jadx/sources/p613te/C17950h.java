package p613te;

/* renamed from: te.h */
public final class C17950h extends C17954k {

    /* renamed from: h */
    public static int f51116h = 75;

    /* renamed from: i */
    public static int f51117i = 0;

    /* renamed from: j */
    public static int f51118j = 1;

    /* renamed from: k */
    public static int f51119k = 2;

    /* renamed from: g */
    public static int m61839g() {
        return 98;
    }

    /* renamed from: h */
    public static int m61840h() {
        return 2;
    }

    /* renamed from: c */
    public int mo45607c(int i) {
        int i2 = i % 1921;
        int i3 = f51116h;
        if ((i3 * (f51118j + i3)) % f51119k != 0) {
            f51116h = m61839g();
            f51117i = 93;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            i2 += 1921;
            int i4 = f51116h;
            if ((i4 * (f51118j + i4)) % f51119k != 0) {
                f51116h = m61839g();
                f51117i = m61839g();
            }
        }
        return i2 + C11051p3.f31760d;
    }

    /* renamed from: d */
    public int mo45608d(int i) {
        if (i == 0) {
            int i2 = f51116h;
            if (((f51118j + i2) * i2) % f51119k == f51117i) {
                return 0;
            }
            f51116h = m61839g();
            f51117i = 46;
            return 0;
        }
        int i3 = f51116h;
        if (((f51118j + i3) * i3) % m61840h() != f51117i) {
            f51116h = m61839g();
            f51117i = m61839g();
        }
        return i - 127;
    }
}
