package p319y1;

import java.util.Arrays;
import p048d2.C5802d;
import p048d2.C5807i;

/* renamed from: y1.d */
public class C9012d {

    /* renamed from: a */
    private final float[] f25047a;

    /* renamed from: b */
    private final int[] f25048b;

    public C9012d(float[] fArr, int[] iArr) {
        this.f25047a = fArr;
        this.f25048b = iArr;
    }

    /* renamed from: b */
    private int m33340b(float f) {
        int binarySearch = Arrays.binarySearch(this.f25047a, f);
        if (binarySearch >= 0) {
            return this.f25048b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.f25048b[0];
        }
        int[] iArr = this.f25048b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f25047a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return C5802d.m23326c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    /* renamed from: a */
    public C9012d mo24421a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m33340b(fArr[i]);
        }
        return new C9012d(fArr, iArr);
    }

    /* renamed from: c */
    public int[] mo24422c() {
        return this.f25048b;
    }

    /* renamed from: d */
    public float[] mo24423d() {
        return this.f25047a;
    }

    /* renamed from: e */
    public int mo24424e() {
        return this.f25048b.length;
    }

    /* renamed from: f */
    public void mo24425f(C9012d dVar, C9012d dVar2, float f) {
        if (dVar.f25048b.length == dVar2.f25048b.length) {
            for (int i = 0; i < dVar.f25048b.length; i++) {
                this.f25047a[i] = C5807i.m23370i(dVar.f25047a[i], dVar2.f25047a[i], f);
                this.f25048b[i] = C5802d.m23326c(f, dVar.f25048b[i], dVar2.f25048b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f25048b.length + " vs " + dVar2.f25048b.length + ")");
    }
}
