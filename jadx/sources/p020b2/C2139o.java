package p020b2;

import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p033c2.C2224c;
import p048d2.C5802d;
import p048d2.C5807i;
import p319y1.C9012d;

/* renamed from: b2.o */
public class C2139o implements C2138n0 {

    /* renamed from: a */
    private int f6306a;

    public C2139o(int i) {
        this.f6306a = i;
    }

    /* renamed from: b */
    private C9012d m8222b(C9012d dVar, List list) {
        int i = this.f6306a * 4;
        if (list.size() <= i) {
            return dVar;
        }
        float[] d = dVar.mo24423d();
        int[] c = dVar.mo24422c();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = ((Float) list.get(i)).floatValue();
            } else {
                fArr2[i2] = ((Float) list.get(i)).floatValue();
                i2++;
            }
            i++;
        }
        float[] e = m8224e(dVar.mo24423d(), fArr);
        int length = e.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = e[i3];
            int binarySearch = Arrays.binarySearch(d, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = mo7022c(f, fArr2[binarySearch2], d, c);
            } else {
                iArr[i3] = m8223d(f, c[binarySearch], fArr, fArr2);
            }
        }
        return new C9012d(e, iArr);
    }

    /* renamed from: d */
    private int m8223d(float f, int i, float[] fArr, float[] fArr2) {
        float f2;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f3 = fArr[i2];
            int i3 = (f3 > f ? 1 : (f3 == f ? 0 : -1));
            if (i3 >= 0 || i2 == fArr.length - 1) {
                if (i3 <= 0) {
                    f2 = fArr2[i2];
                } else {
                    int i4 = i2 - 1;
                    float f4 = fArr[i4];
                    f2 = C5807i.m23370i(fArr2[i4], fArr2[i2], (f - f4) / (f3 - f4));
                }
                return Color.argb((int) (f2 * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* renamed from: e */
    protected static float[] m8224e(float[] fArr, float[] fArr2) {
        float f;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = Float.NaN;
            if (i2 < fArr.length) {
                f = fArr[i2];
            } else {
                f = Float.NaN;
            }
            if (i3 < fArr2.length) {
                f2 = fArr2[i3];
            }
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        if (i == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo7022c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), C5802d.m23326c(f5, Color.red(i4), Color.red(i3)), C5802d.m23326c(f5, Color.green(i4), Color.green(i3)), C5802d.m23326c(f5, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* renamed from: f */
    public C9012d mo7008a(C2224c cVar, float f) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo7152k();
        }
        while (cVar.hasNext()) {
            arrayList.add(Float.valueOf((float) cVar.mo7156s()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(Utils.FLOAT_EPSILON));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f6306a = 2;
        }
        if (z) {
            cVar.mo7154o();
        }
        if (this.f6306a == -1) {
            this.f6306a = arrayList.size() / 4;
        }
        int i = this.f6306a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6306a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(C11051p3.f31759c, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return m8222b(new C9012d(fArr, iArr), arrayList);
    }
}
