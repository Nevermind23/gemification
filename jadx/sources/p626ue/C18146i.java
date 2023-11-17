package p626ue;

import com.salesforce.marketingcloud.C11398b;

/* renamed from: ue.i */
public final class C18146i extends C18129d {

    /* renamed from: h */
    public static int f51445h = 30;

    /* renamed from: i */
    public static int f51446i = 0;

    /* renamed from: j */
    public static int f51447j = 1;

    /* renamed from: k */
    public static int f51448k = 2;

    /* renamed from: f */
    private static int m62226f(int i, int i2) {
        int i3 = i % i2;
        int i4 = f51445h;
        int i5 = f51447j;
        int i6 = (i4 + i5) * i4;
        if (((i5 + i4) * i4) % f51448k != f51446i) {
            f51445h = m62229i();
            f51446i = 15;
        }
        if (i6 % m62228h() != f51446i) {
            f51445h = 15;
            f51446i = 64;
        }
        return i3 < 0 ? i3 + i2 : i3;
    }

    /* renamed from: g */
    public static int m62227g() {
        return 1;
    }

    /* renamed from: h */
    public static int m62228h() {
        return 2;
    }

    /* renamed from: i */
    public static int m62229i() {
        return 45;
    }

    /* renamed from: d */
    public int mo45810d(int i) {
        int f = m62226f(i, 63488);
        int i2 = m62229i();
        int i3 = f51447j;
        int i4 = i2 * (i2 + i3);
        int i5 = f51448k;
        if (i4 % i5 != 0) {
            int i6 = f51445h;
            if ((i6 * (i3 + i6)) % i5 != 0) {
                f51445h = 67;
                f51446i = m62229i();
            }
            f51445h = 71;
            f51446i = m62229i();
        }
        return f + C11398b.f33142u;
    }

    /* renamed from: e */
    public int mo45811e(int i) {
        int g = f51445h + m62227g();
        int i2 = f51445h;
        int i3 = g * i2;
        int i4 = f51448k;
        if ((i2 * (f51447j + i2)) % m62228h() != 0) {
            f51445h = 11;
            f51446i = 32;
        }
        if (i3 % i4 != f51446i) {
            f51445h = m62229i();
            f51446i = 51;
        }
        return i - 2048;
    }
}
