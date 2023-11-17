package p471jc;

import com.google.zxing.WriterException;
import p200ob.C7507a;
import p443hc.C15476f;
import p443hc.C15480j;

/* renamed from: jc.e */
abstract class C15742e {

    /* renamed from: a */
    private static final int[][] f44621a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f44622b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f44623c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f44624d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m56700a(C7507a aVar, C15476f fVar, C15480j jVar, int i, C15738b bVar) {
        m56702c(bVar);
        m56703d(jVar, bVar);
        m56711l(fVar, i, bVar);
        m56718s(jVar, bVar);
        m56705f(aVar, i, bVar);
    }

    /* renamed from: b */
    static int m56701b(int i, int i2) {
        if (i2 != 0) {
            int n = m56713n(i2);
            int i3 = i << (n - 1);
            while (m56713n(i3) >= n) {
                i3 ^= i2 << (m56713n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m56702c(C15738b bVar) {
        bVar.mo43118a((byte) -1);
    }

    /* renamed from: d */
    static void m56703d(C15480j jVar, C15738b bVar) {
        m56709j(bVar);
        m56704e(bVar);
        m56717r(jVar, bVar);
        m56710k(bVar);
    }

    /* renamed from: e */
    private static void m56704e(C15738b bVar) {
        if (bVar.mo43119b(8, bVar.mo43121d() - 8) != 0) {
            bVar.mo43123f(8, bVar.mo43121d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: f */
    static void m56705f(C7507a aVar, int i, C15738b bVar) {
        boolean z;
        int e = bVar.mo43122e() - 1;
        int d = bVar.mo43121d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo43121d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m56714o(bVar.mo43119b(i5, d))) {
                        if (i2 < aVar.mo21961l()) {
                            z = aVar.mo21956g(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C15741d.m56697f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo43124g(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo21961l()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + aVar.mo21961l());
        }
    }

    /* renamed from: g */
    private static void m56706g(int i, int i2, C15738b bVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m56714o(bVar.mo43119b(i4, i2))) {
                bVar.mo43123f(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: h */
    private static void m56707h(int i, int i2, C15738b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f44622b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo43123f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m56708i(int i, int i2, C15738b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f44621a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo43123f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m56709j(C15738b bVar) {
        int length = f44621a[0].length;
        m56708i(0, 0, bVar);
        m56708i(bVar.mo43122e() - length, 0, bVar);
        m56708i(0, bVar.mo43122e() - length, bVar);
        m56706g(0, 7, bVar);
        m56706g(bVar.mo43122e() - 8, 7, bVar);
        m56706g(0, bVar.mo43122e() - 8, bVar);
        m56712m(7, 0, bVar);
        m56712m((bVar.mo43121d() - 7) - 1, 0, bVar);
        m56712m(7, bVar.mo43121d() - 7, bVar);
    }

    /* renamed from: k */
    private static void m56710k(C15738b bVar) {
        int i = 8;
        while (i < bVar.mo43122e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m56714o(bVar.mo43119b(i, 6))) {
                bVar.mo43123f(i, 6, i3);
            }
            if (m56714o(bVar.mo43119b(6, i))) {
                bVar.mo43123f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m56711l(C15476f fVar, int i, C15738b bVar) {
        int i2;
        C7507a aVar = new C7507a();
        m56715p(fVar, i, aVar);
        for (int i3 = 0; i3 < aVar.mo21961l(); i3++) {
            boolean g = aVar.mo21956g((aVar.mo21961l() - 1) - i3);
            int[] iArr = f44624d[i3];
            bVar.mo43124g(iArr[0], iArr[1], g);
            int i4 = 8;
            if (i3 < 8) {
                i2 = 8;
                i4 = (bVar.mo43122e() - i3) - 1;
            } else {
                i2 = (bVar.mo43121d() - 7) + (i3 - 8);
            }
            bVar.mo43124g(i4, i2, g);
        }
    }

    /* renamed from: m */
    private static void m56712m(int i, int i2, C15738b bVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m56714o(bVar.mo43119b(i, i4))) {
                bVar.mo43123f(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: n */
    static int m56713n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    private static boolean m56714o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m56715p(C15476f fVar, int i, C7507a aVar) {
        if (C15743f.m56719b(i)) {
            int b = (fVar.mo42559b() << 3) | i;
            aVar.mo21951c(b, 5);
            aVar.mo21951c(m56701b(b, 1335), 10);
            C7507a aVar2 = new C7507a();
            aVar2.mo21951c(21522, 15);
            aVar.mo21968t(aVar2);
            if (aVar.mo21961l() != 15) {
                throw new WriterException("should not happen but we got: " + aVar.mo21961l());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m56716q(C15480j jVar, C7507a aVar) {
        aVar.mo21951c(jVar.mo42572j(), 6);
        aVar.mo21951c(m56701b(jVar.mo42572j(), 7973), 12);
        if (aVar.mo21961l() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.mo21961l());
        }
    }

    /* renamed from: r */
    private static void m56717r(C15480j jVar, C15738b bVar) {
        if (jVar.mo42572j() >= 2) {
            int[] iArr = f44623c[jVar.mo42572j() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m56714o(bVar.mo43119b(i2, i))) {
                            m56707h(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m56718s(C15480j jVar, C15738b bVar) {
        if (jVar.mo42572j() >= 7) {
            C7507a aVar = new C7507a();
            m56716q(jVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean g = aVar.mo21956g(i);
                    i--;
                    bVar.mo43124g(i2, (bVar.mo43121d() - 11) + i3, g);
                    bVar.mo43124g((bVar.mo43121d() - 11) + i3, i2, g);
                }
            }
        }
    }
}
