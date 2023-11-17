package p613te;

/* renamed from: te.e */
public final class C17947e extends C17954k {

    /* renamed from: h */
    public static int f51100h = 4;

    /* renamed from: i */
    public static int f51101i = 0;

    /* renamed from: j */
    public static int f51102j = 1;

    /* renamed from: k */
    public static int f51103k = 2;

    /* renamed from: g */
    public static int m61828g() {
        return 65;
    }

    /* renamed from: h */
    public static int m61829h() {
        return 1;
    }

    /* renamed from: c */
    public int mo45607c(int i) {
        int i2 = f51100h;
        if (((f51102j + i2) * i2) % f51103k != f51101i) {
            f51100h = 32;
            f51101i = m61828g();
        }
        int i3 = i % C11051p3.f31760d;
        int i4 = f51100h;
        if (((f51102j + i4) * i4) % f51103k != f51101i) {
            f51100h = m61828g();
            f51101i = 22;
        }
        if (i3 < 0) {
            i3 += C11051p3.f31760d;
        }
        return i3 + 1;
    }

    /* renamed from: d */
    public int mo45608d(int i) {
        int g = m61828g() + f51102j;
        int g2 = m61828g();
        int i2 = f51100h;
        if ((i2 * (m61829h() + i2)) % f51103k != 0) {
            f51100h = m61828g();
            f51101i = 30;
        }
        if ((g * g2) % f51103k != f51101i) {
            f51100h = m61828g();
            f51101i = m61828g();
        }
        return i - 1;
    }
}
