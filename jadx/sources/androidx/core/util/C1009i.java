package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.i */
public abstract class C1009i {

    /* renamed from: a */
    private static final Object f3647a = new Object();

    /* renamed from: b */
    private static char[] f3648b = new char[24];

    /* renamed from: a */
    private static int m3533a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m3534b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m3536d(j - j2, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m3535c(long j, PrintWriter printWriter) {
        m3536d(j, printWriter, 0);
    }

    /* renamed from: d */
    public static void m3536d(long j, PrintWriter printWriter, int i) {
        synchronized (f3647a) {
            printWriter.print(new String(f3648b, 0, m3537e(j, i)));
        }
    }

    /* renamed from: e */
    private static int m3537e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i12;
        boolean z5;
        boolean z6;
        boolean z7;
        int i13;
        long j2 = j;
        int i14 = i;
        if (f3648b.length < i14) {
            f3648b = new char[i14];
        }
        char[] cArr = f3648b;
        int i15 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i15 == 0) {
            int i16 = i14 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i15 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i17 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i18 = floor / 60;
            i4 = floor - (i18 * 60);
            i5 = i18;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i14 != 0) {
            int a = m3533a(i2, 1, false, 0);
            if (a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int a2 = a + m3533a(i3, 1, z5, 2);
            if (a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int a3 = a2 + m3533a(i5, 1, z6, 2);
            if (a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a4 = a3 + m3533a(i4, 1, z7, 2);
            if (a4 > 0) {
                i13 = 3;
            } else {
                i13 = 0;
            }
            i6 = 0;
            for (int a5 = a4 + m3533a(i17, 2, true, i13) + 1; a5 < i14; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i19 = i6 + 1;
        if (i14 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i22 = i19;
        int f = m3538f(cArr, i2, 'd', i19, false, 0);
        if (f != i22) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int f2 = m3538f(cArr, i3, 'h', f, z2, i7);
        if (f2 != i22) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int f3 = m3538f(cArr, i5, 'm', f2, z3, i8);
        if (f3 != i22) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int f4 = m3538f(cArr, i4, 's', f3, z4, i9);
        if (!z || f4 == i22) {
            i12 = 0;
        } else {
            i12 = 3;
        }
        int f5 = m3538f(cArr, i17, 'm', f4, true, i12);
        cArr[f5] = 's';
        return f5 + 1;
    }

    /* renamed from: f */
    private static int m3538f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
