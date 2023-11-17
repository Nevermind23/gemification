package p372cc;

import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import p213pb.C7798a;
import p358bc.C10222a;

/* renamed from: cc.i */
abstract class C10392i {

    /* renamed from: a */
    private static final float[][] f29599a;

    static {
        int i;
        int length = C10222a.f28412b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f29599a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C10222a.f28412b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = Utils.FLOAT_EPSILON;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f29599a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m37769a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m37770b(int[] iArr) {
        int d = C7798a.m29510d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f29599a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = Utils.FLOAT_EPSILON;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C10222a.f28412b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m37771c(int[] iArr) {
        int a = m37769a(iArr);
        if (C10222a.m37296a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m37772d(int[] iArr) {
        int c = m37771c(m37773e(iArr));
        if (c != -1) {
            return c;
        }
        return m37770b(iArr);
    }

    /* renamed from: e */
    private static int[] m37773e(int[] iArr) {
        float d = (float) C7798a.m29510d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (d / 34.0f) + ((((float) i3) * d) / 17.0f);
            int i4 = iArr[i2];
            if (((float) (i + i4)) <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
