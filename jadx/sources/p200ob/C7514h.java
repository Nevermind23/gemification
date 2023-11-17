package p200ob;

import com.google.zxing.C5752b;
import com.google.zxing.C5758h;
import com.google.zxing.NotFoundException;

/* renamed from: ob.h */
public abstract class C7514h extends C5752b {

    /* renamed from: d */
    private static final byte[] f21924d = new byte[0];

    /* renamed from: b */
    private byte[] f21925b = f21924d;

    /* renamed from: c */
    private final int[] f21926c = new int[32];

    public C7514h(C5758h hVar) {
        super(hVar);
    }

    /* renamed from: g */
    private static int m28576g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i12 = iArr[i8] * i9 * i9;
            if (i12 > i7) {
                i6 = i8;
                i7 = i12;
            }
        }
        if (i3 <= i6) {
            int i13 = i3;
            i3 = i6;
            i6 = i13;
        }
        if (i3 - i6 > length / 16) {
            int i14 = i3 - 1;
            int i15 = -1;
            int i16 = i14;
            while (i14 > i6) {
                int i17 = i14 - i6;
                int i18 = i17 * i17 * (i3 - i14) * (i2 - iArr[i14]);
                if (i18 > i15) {
                    i16 = i14;
                    i15 = i18;
                }
                i14--;
            }
            return i16 << 3;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: h */
    private void m28577h(int i) {
        if (this.f21925b.length < i) {
            this.f21925b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f21926c[i2] = 0;
        }
    }

    /* renamed from: b */
    public C7508b mo18865b() {
        C5758h e = mo18868e();
        int d = e.mo18884d();
        int a = e.mo18883a();
        C7508b bVar = new C7508b(d, a);
        m28577h(d);
        int[] iArr = this.f21926c;
        for (int i = 1; i < 5; i++) {
            byte[] c = e.mo18879c((a * i) / 5, this.f21925b);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m28576g(iArr);
        byte[] b = e.mo18878b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b[i6 + i7] & 255) < g) {
                    bVar.mo21984n(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public C7507a mo18866c(int i, C7507a aVar) {
        C5758h e = mo18868e();
        int d = e.mo18884d();
        if (aVar == null || aVar.mo21961l() < d) {
            aVar = new C7507a(d);
        } else {
            aVar.mo21953d();
        }
        m28577h(d);
        byte[] c = e.mo18879c(i, this.f21925b);
        int[] iArr = this.f21926c;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m28576g(iArr);
        if (d < 3) {
            for (int i4 = 0; i4 < d; i4++) {
                if ((c[i4] & 255) < g) {
                    aVar.mo21965q(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    aVar.mo21965q(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
