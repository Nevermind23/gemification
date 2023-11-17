package p626ue;

/* renamed from: ue.b */
public final class C18127b extends C18129d {

    /* renamed from: h */
    public static int f51420h = 94;

    /* renamed from: i */
    public static int f51421i = 0;

    /* renamed from: j */
    public static int f51422j = 1;

    /* renamed from: k */
    public static int f51423k = 2;

    /* renamed from: f */
    public static int m62198f() {
        return 88;
    }

    /* renamed from: d */
    public int mo45810d(int i) {
        int i2 = f51420h;
        int i3 = f51422j;
        int i4 = i2 * (i2 + i3);
        int i5 = f51423k;
        if (i4 % i5 != 0) {
            f51420h = 12;
            f51421i = 35;
            if ((12 * (i3 + 12)) % i5 != 0) {
                f51420h = m62198f();
                f51421i = m62198f();
            }
        }
        int i6 = i % 1921;
        if (i6 == 0) {
            return 0;
        }
        if (i6 < 0) {
            i6 += 1921;
        }
        return i6 + C11051p3.f31760d;
    }

    /* renamed from: e */
    public int mo45811e(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = i - 127;
        int i3 = f51420h;
        if (((f51422j + i3) * i3) % f51423k != f51421i) {
            f51420h = 46;
            f51421i = m62198f();
        }
        return i2;
    }
}
