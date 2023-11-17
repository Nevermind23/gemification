package com.facetec.sdk;

/* renamed from: com.facetec.sdk.dg */
public class C2944dg {

    /* renamed from: a */
    public int f9882a;

    /* renamed from: b */
    public long f9883b;

    /* renamed from: c */
    public long f9884c;

    /* renamed from: d */
    public float f9885d;

    /* renamed from: e */
    public int f9886e;

    /* renamed from: f */
    public Object f9887f;

    /* renamed from: g */
    public double f9888g;

    /* renamed from: h */
    public double f9889h;

    /* renamed from: i */
    public float f9890i;

    /* renamed from: j */
    public Object f9891j;

    /* renamed from: k */
    private final int[] f9892k;

    /* renamed from: l */
    private int f9893l;

    /* renamed from: m */
    private final long[] f9894m = new long[10];

    /* renamed from: n */
    private final float[] f9895n = new float[10];

    /* renamed from: o */
    private int f9896o;

    /* renamed from: q */
    private final double[] f9897q = new double[10];

    /* renamed from: r */
    private final Object[] f9898r;

    public C2944dg(Object obj, Object obj2, int i) {
        int[] iArr = new int[10];
        this.f9892k = iArr;
        Object[] objArr = new Object[10];
        this.f9898r = objArr;
        objArr[6] = obj;
        objArr[7] = obj2;
        iArr[8] = i;
        this.f9893l = 0;
        this.f9896o = -1;
    }

    /* renamed from: c */
    public int mo9112c(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                int i3 = this.f9893l - this.f9882a;
                this.f9893l = i3;
                this.f9896o = i3;
                return 0;
            case 2:
                Object[] objArr = this.f9898r;
                int i4 = this.f9896o;
                this.f9896o = i4 + 1;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.f9887f = obj;
                return 0;
            case 3:
                int[] iArr = this.f9892k;
                int i5 = this.f9896o;
                this.f9896o = i5 + 1;
                this.f9886e = iArr[i5];
                return 0;
            case 4:
                Object[] objArr2 = this.f9898r;
                int i6 = this.f9893l;
                int i7 = i6 + 1;
                objArr2[i6] = objArr2[6];
                int[] iArr2 = this.f9892k;
                this.f9893l = i7 + 1;
                iArr2[i7] = 0;
                return 0;
            case 5:
                Object[] objArr3 = this.f9898r;
                int i8 = this.f9893l;
                this.f9893l = i8 + 1;
                objArr3[i8] = this.f9891j;
                return 0;
            case 6:
                Object[] objArr4 = this.f9898r;
                int i9 = this.f9893l;
                this.f9893l = i9 + 1;
                objArr4[i9] = objArr4[6];
                return 0;
            case 7:
                int i12 = this.f9893l - 1;
                this.f9893l = i12;
                this.f9898r[i12] = null;
                return 0;
            case 8:
                int[] iArr3 = this.f9892k;
                int i13 = this.f9893l;
                this.f9893l = i13 + 1;
                iArr3[i13] = this.f9882a;
                return 0;
            case 9:
                int[] iArr4 = this.f9892k;
                int i14 = this.f9893l - 1;
                this.f9893l = i14;
                this.f9886e = iArr4[i14];
                return 0;
            case 10:
                int i15 = this.f9893l - 1;
                this.f9893l = i15;
                int[] iArr5 = this.f9892k;
                Object[] objArr5 = this.f9898r;
                Object obj2 = objArr5[i15 - 1];
                objArr5[i15 - 1] = null;
                iArr5[i15 - 1] = ((int[]) obj2)[iArr5[i15]];
                return 0;
            case 11:
                int[] iArr6 = this.f9892k;
                int i16 = this.f9893l;
                this.f9893l = i16 + 1;
                iArr6[i16] = iArr6[8];
                return 0;
            case 12:
                int i17 = this.f9893l - 1;
                this.f9893l = i17;
                if (this.f9892k[i17] != 0) {
                    i2 = 0;
                }
                this.f9886e = i2;
                return 0;
            case 13:
                int[] iArr7 = this.f9892k;
                int i18 = this.f9893l;
                this.f9893l = i18 + 1;
                iArr7[i18] = 0;
                return 0;
            case 14:
                this.f9886e = this.f9892k[this.f9893l - 1];
                return 0;
            case 15:
                Object[] objArr6 = this.f9898r;
                int i19 = this.f9893l;
                int i22 = i19 + 1;
                objArr6[i19] = objArr6[6];
                this.f9893l = i22 + 1;
                objArr6[i22] = objArr6[7];
                return 0;
            case 16:
                Object[] objArr7 = this.f9898r;
                int i23 = this.f9893l;
                this.f9893l = i23 + 1;
                objArr7[i23] = objArr7[7];
                return 0;
            case 17:
                int[] iArr8 = this.f9892k;
                int i24 = this.f9893l;
                this.f9893l = i24 + 1;
                iArr8[i24] = 1;
                return 0;
            case 18:
                int[] iArr9 = this.f9892k;
                int i25 = this.f9893l;
                int i26 = i25 + 1;
                iArr9[i25] = 2;
                this.f9893l = i26 + 1;
                iArr9[i26] = 2;
                return 0;
            case 19:
                int i27 = this.f9893l - 1;
                this.f9893l = i27;
                int[] iArr10 = this.f9892k;
                iArr10[i27 - 1] = iArr10[i27 - 1] % iArr10[i27];
                return 0;
            case 20:
                break;
            case 21:
                int[] iArr11 = this.f9892k;
                int i28 = this.f9893l;
                iArr11[i28] = 99;
                int i29 = (i28 + 1) - 1;
                this.f9893l = i29;
                iArr11[i29 - 1] = iArr11[i29 - 1] + iArr11[i29];
                break;
            case 22:
                int[] iArr12 = this.f9892k;
                int i32 = this.f9893l;
                int i33 = i32 + 1;
                this.f9893l = i33;
                iArr12[i32] = iArr12[i33 - 2];
                return 0;
            case 23:
                int[] iArr13 = this.f9892k;
                int i34 = this.f9893l;
                iArr13[i34] = 128;
                int i35 = (i34 + 1) - 1;
                this.f9893l = i35;
                iArr13[i35 - 1] = iArr13[i35 - 1] % iArr13[i35];
                return 0;
            case 24:
                int[] iArr14 = this.f9892k;
                int i36 = this.f9893l;
                this.f9893l = i36 + 1;
                iArr14[i36] = 2;
                return 0;
            case 25:
                int i37 = this.f9893l - 1;
                this.f9893l = i37;
                if (this.f9892k[i37] == 0) {
                    i2 = 0;
                }
                this.f9886e = i2;
                return 0;
            case 26:
                int[] iArr15 = this.f9892k;
                int i38 = this.f9893l;
                this.f9893l = i38 + 1;
                iArr15[i38] = 63;
                return 0;
            case 27:
                int i39 = this.f9893l - 1;
                int[] iArr16 = this.f9892k;
                iArr16[i39 - 1] = iArr16[i39 - 1] + iArr16[i39];
                int i42 = i39 + 1;
                iArr16[i39] = iArr16[i42 - 2];
                this.f9893l = i42 + 1;
                iArr16[i42] = 128;
                return 0;
            default:
                return i;
        }
        return 0;
    }
}
