package p677yb;

import com.google.zxing.NotFoundException;
import p663xb.C18676r;

/* renamed from: yb.a */
public abstract class C18871a extends C18676r {

    /* renamed from: a */
    private final int[] f52806a = new int[4];

    /* renamed from: b */
    private final int[] f52807b;

    /* renamed from: c */
    private final float[] f52808c;

    /* renamed from: d */
    private final float[] f52809d;

    /* renamed from: e */
    private final int[] f52810e;

    /* renamed from: f */
    private final int[] f52811f;

    protected C18871a() {
        int[] iArr = new int[8];
        this.f52807b = iArr;
        this.f52808c = new float[4];
        this.f52809d = new float[4];
        this.f52810e = new int[(iArr.length / 2)];
        this.f52811f = new int[(iArr.length / 2)];
    }

    /* renamed from: i */
    protected static void m63853i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: p */
    protected static void m63854p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: q */
    protected static boolean m63855q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    protected static int m63856r(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C18676r.m63283f(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo46842j() {
        return this.f52807b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] mo46843k() {
        return this.f52806a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo46844l() {
        return this.f52811f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo46845m() {
        return this.f52809d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int[] mo46846n() {
        return this.f52810e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final float[] mo46847o() {
        return this.f52808c;
    }
}
