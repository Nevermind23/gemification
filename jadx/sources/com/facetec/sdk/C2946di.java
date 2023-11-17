package com.facetec.sdk;

/* renamed from: com.facetec.sdk.di */
public class C2946di {

    /* renamed from: a */
    public float f9916a;

    /* renamed from: b */
    public long f9917b;

    /* renamed from: c */
    public int f9918c;

    /* renamed from: d */
    public int f9919d;

    /* renamed from: e */
    public long f9920e;

    /* renamed from: f */
    public double f9921f;

    /* renamed from: g */
    public double f9922g;

    /* renamed from: h */
    public Object f9923h;

    /* renamed from: i */
    public Object f9924i;

    /* renamed from: j */
    public float f9925j;

    /* renamed from: k */
    private int f9926k;

    /* renamed from: l */
    private final float[] f9927l = new float[11];

    /* renamed from: m */
    private final long[] f9928m = new long[11];

    /* renamed from: n */
    private final int[] f9929n = new int[11];

    /* renamed from: o */
    private int f9930o;

    /* renamed from: q */
    private final Object[] f9931q;

    /* renamed from: s */
    private final double[] f9932s = new double[11];

    public C2946di(Object obj) {
        Object[] objArr = new Object[11];
        this.f9931q = objArr;
        objArr[6] = obj;
        this.f9930o = 0;
        this.f9926k = -1;
    }

    /* renamed from: a */
    public int mo9114a(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                Object[] objArr = this.f9931q;
                int i3 = this.f9930o;
                this.f9930o = i3 + 1;
                objArr[i3] = this.f9923h;
                return 0;
            case 2:
                int i4 = this.f9930o - 1;
                this.f9930o = i4;
                Object[] objArr2 = this.f9931q;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                if (obj == null) {
                    i2 = 0;
                }
                this.f9918c = i2;
                return 0;
            case 3:
                int i5 = this.f9930o - this.f9919d;
                this.f9930o = i5;
                this.f9926k = i5;
                return 0;
            case 4:
                Object[] objArr3 = this.f9931q;
                int i6 = this.f9926k;
                this.f9926k = i6 + 1;
                Object obj2 = objArr3[i6];
                objArr3[i6] = null;
                this.f9924i = obj2;
                return 0;
            case 5:
                int[] iArr = this.f9929n;
                int i7 = this.f9930o;
                this.f9930o = i7 + 1;
                iArr[i7] = this.f9919d;
                return 0;
            case 6:
                this.f9918c = this.f9929n[this.f9930o - 1];
                return 0;
            case 7:
                Object[] objArr4 = this.f9931q;
                int i8 = this.f9930o;
                this.f9930o = i8 + 1;
                objArr4[i8] = objArr4[6];
                return 0;
            case 8:
                int[] iArr2 = this.f9929n;
                int i9 = this.f9926k;
                this.f9926k = i9 + 1;
                this.f9918c = iArr2[i9];
                return 0;
            case 9:
                int[] iArr3 = this.f9929n;
                int i12 = this.f9930o;
                this.f9930o = i12 + 1;
                iArr3[i12] = 64;
                return 0;
            case 10:
                int i13 = this.f9930o - 1;
                this.f9930o = i13;
                Object[] objArr5 = this.f9931q;
                Object obj3 = objArr5[i13];
                objArr5[i13] = null;
                objArr5[6] = obj3;
                return 0;
            case 11:
                int[] iArr4 = this.f9929n;
                int i14 = this.f9930o;
                this.f9930o = i14 + 1;
                iArr4[i14] = 5;
                return 0;
            case 12:
                int[] iArr5 = this.f9929n;
                int i15 = this.f9930o;
                this.f9930o = i15 + 1;
                iArr5[i15] = 0;
                return 0;
            case 13:
                int i16 = this.f9930o - 1;
                this.f9930o = i16;
                int[] iArr6 = this.f9929n;
                iArr6[i16 - 1] = iArr6[i16 - 1] + iArr6[i16];
                return 0;
            case 14:
                int[] iArr7 = this.f9929n;
                int i17 = this.f9930o;
                this.f9930o = i17 + 1;
                iArr7[i17] = 63;
                return 0;
            case 15:
                int[] iArr8 = this.f9929n;
                int i18 = this.f9930o;
                this.f9930o = i18 + 1;
                iArr8[i18] = 16;
                return 0;
            case 16:
                int i19 = this.f9930o - 1;
                int[] iArr9 = this.f9929n;
                iArr9[i19 - 1] = iArr9[i19 - 1] >> iArr9[i19];
                int i22 = i19 - 1;
                this.f9930o = i22;
                iArr9[i22 - 1] = iArr9[i22 - 1] + iArr9[i22];
                return 0;
            case 17:
                int[] iArr10 = this.f9929n;
                int i23 = this.f9930o;
                iArr10[i23 - 1] = (byte) iArr10[i23 - 1];
                return 0;
            case 18:
                int i24 = this.f9930o - 1;
                Object[] objArr6 = this.f9931q;
                Object obj4 = objArr6[i24];
                objArr6[i24] = null;
                objArr6[7] = obj4;
                this.f9930o = i24 + 1;
                objArr6[i24] = objArr6[6];
                return 0;
            case 19:
                int[] iArr11 = this.f9929n;
                int i25 = this.f9930o;
                Object[] objArr7 = this.f9931q;
                Object obj5 = objArr7[i25 - 1];
                objArr7[i25 - 1] = null;
                iArr11[i25 - 1] = ((Object[]) obj5).length;
                int i26 = i25 - 1;
                iArr11[8] = iArr11[i26];
                this.f9930o = i26 + 1;
                iArr11[i26] = 0;
                return 0;
            case 20:
                int i27 = this.f9930o - 1;
                this.f9930o = i27;
                int[] iArr12 = this.f9929n;
                iArr12[9] = iArr12[i27];
                return 0;
            case 21:
                int i28 = this.f9930o - 2;
                this.f9930o = i28;
                int[] iArr13 = this.f9929n;
                if (iArr13[i28] >= iArr13[i28 + 1]) {
                    i2 = 0;
                }
                this.f9918c = i2;
                return 0;
            case 22:
                int[] iArr14 = this.f9929n;
                int i29 = this.f9930o;
                int i32 = i29 + 1;
                iArr14[i29] = iArr14[9];
                this.f9930o = i32 + 1;
                iArr14[i32] = iArr14[8];
                return 0;
            case 23:
                int[] iArr15 = this.f9929n;
                int i33 = this.f9930o;
                this.f9930o = i33 + 1;
                iArr15[i33] = iArr15[9];
                return 0;
            case 24:
                int i34 = this.f9930o - 1;
                this.f9930o = i34;
                Object[] objArr8 = this.f9931q;
                Object[] objArr9 = objArr8[i34 - 1];
                objArr8[i34 - 1] = null;
                objArr8[i34 - 1] = objArr9[this.f9929n[i34]];
                int i35 = i34 - 1;
                this.f9930o = i35;
                Object obj6 = objArr8[i35];
                objArr8[i35] = null;
                objArr8[10] = obj6;
                return 0;
            case 25:
                Object[] objArr10 = this.f9931q;
                int i36 = this.f9930o;
                this.f9930o = i36 + 1;
                objArr10[i36] = objArr10[10];
                return 0;
            case 26:
                int i37 = this.f9930o - 1;
                Object[] objArr11 = this.f9931q;
                Object obj7 = objArr11[i37];
                objArr11[i37] = null;
                objArr11[10] = obj7;
                this.f9930o = i37 + 1;
                objArr11[i37] = objArr11[7];
                return 0;
            case 27:
                int[] iArr16 = this.f9929n;
                int i38 = this.f9930o;
                int i39 = i38 + 1;
                iArr16[i38] = 16;
                this.f9930o = i39 + 1;
                iArr16[i39] = 0;
                return 0;
            case 28:
                int i42 = this.f9930o - 1;
                int[] iArr17 = this.f9929n;
                iArr17[i42 - 1] = iArr17[i42 - 1] - iArr17[i42];
                int i43 = i42 + 1;
                iArr17[i42] = 91;
                this.f9930o = i43 + 1;
                iArr17[i43] = 0;
                return 0;
            case 29:
                int i44 = this.f9930o - 1;
                this.f9930o = i44;
                if (this.f9929n[i44] == 0) {
                    i2 = 0;
                }
                this.f9918c = i2;
                return 0;
            case 30:
                int[] iArr18 = this.f9929n;
                iArr18[9] = iArr18[9] + 1;
                return 0;
            case 31:
                int[] iArr19 = this.f9929n;
                int i45 = this.f9930o;
                int i46 = i45 + 1;
                iArr19[i45] = 2;
                this.f9930o = i46 + 1;
                iArr19[i46] = 2;
                return 0;
            case 32:
                int i47 = this.f9930o - 1;
                this.f9930o = i47;
                int[] iArr20 = this.f9929n;
                iArr20[i47 - 1] = iArr20[i47 - 1] % iArr20[i47];
                return 0;
            case 33:
                int i48 = this.f9930o - 1;
                this.f9930o = i48;
                this.f9931q[i48] = null;
                return 0;
            case 34:
                int[] iArr21 = this.f9929n;
                int i49 = this.f9930o;
                iArr21[i49] = 31;
                int i52 = (i49 + 1) - 1;
                iArr21[i52 - 1] = iArr21[i52 - 1] + iArr21[i52];
                int i53 = i52 + 1;
                this.f9930o = i53;
                iArr21[i52] = iArr21[i53 - 2];
                return 0;
            case 35:
                int[] iArr22 = this.f9929n;
                int i54 = this.f9930o;
                this.f9930o = i54 + 1;
                iArr22[i54] = 128;
                return 0;
            case 36:
                int[] iArr23 = this.f9929n;
                int i55 = this.f9930o;
                this.f9930o = i55 + 1;
                iArr23[i55] = 2;
                return 0;
            case 37:
                int[] iArr24 = this.f9929n;
                int i56 = this.f9930o;
                int i57 = i56 + 1;
                iArr24[i56] = 5;
                iArr24[i57] = 5;
                int i58 = (i57 + 1) - 1;
                this.f9930o = i58;
                iArr24[i58 - 1] = iArr24[i58 - 1] - iArr24[i58];
                return 0;
            case 38:
                int[] iArr25 = this.f9929n;
                int i59 = this.f9930o;
                this.f9930o = i59 + 1;
                iArr25[i59] = 93;
                return 0;
            case 39:
                int i62 = this.f9930o - 1;
                int[] iArr26 = this.f9929n;
                iArr26[i62 - 1] = iArr26[i62 - 1] + iArr26[i62];
                int i63 = i62 + 1;
                this.f9930o = i63;
                iArr26[i62] = iArr26[i63 - 2];
                return 0;
            case 40:
                int i64 = this.f9930o - 1;
                this.f9930o = i64;
                if (this.f9929n[i64] != 0) {
                    i2 = 0;
                }
                this.f9918c = i2;
                return 0;
            case 41:
                Object[] objArr12 = this.f9931q;
                int i65 = this.f9930o;
                Object obj8 = objArr12[i65 - 1];
                objArr12[i65 - 1] = null;
                this.f9924i = obj8;
                return 0;
            case 42:
                Object[] objArr13 = this.f9931q;
                int i66 = this.f9930o;
                this.f9930o = i66 + 1;
                objArr13[i66] = null;
                return 0;
            case 43:
                int[] iArr27 = this.f9929n;
                int i67 = this.f9930o;
                Object[] objArr14 = this.f9931q;
                Object obj9 = objArr14[i67 - 1];
                objArr14[i67 - 1] = null;
                iArr27[i67 - 1] = ((int[]) obj9).length;
                return 0;
            case 44:
                int[] iArr28 = this.f9929n;
                int i68 = this.f9930o - 1;
                this.f9930o = i68;
                this.f9918c = iArr28[i68];
                return 0;
            case 45:
                int[] iArr29 = this.f9929n;
                int i69 = this.f9930o;
                this.f9930o = i69 + 1;
                iArr29[i69] = 0;
                return 0;
            case 46:
                int[] iArr30 = this.f9929n;
                int i72 = this.f9930o;
                this.f9930o = i72 + 1;
                iArr30[i72] = 37;
                return 0;
            case 47:
                int[] iArr31 = this.f9929n;
                int i73 = this.f9930o;
                this.f9930o = i73 + 1;
                iArr31[i73] = 1;
                return 0;
            case 48:
                int[] iArr32 = this.f9929n;
                int i74 = this.f9930o;
                this.f9930o = i74 + 1;
                iArr32[i74] = 75;
                return 0;
            case 49:
                int[] iArr33 = this.f9929n;
                int i75 = this.f9930o;
                this.f9930o = i75 + 1;
                iArr33[i75] = 68;
                return 0;
            case 50:
                for (int i76 = this.f9930o - 1; i76 >= 0; i76--) {
                    this.f9931q[i76] = null;
                }
                Object[] objArr15 = this.f9931q;
                this.f9930o = 1 + 0;
                objArr15[0] = this.f9923h;
                return 0;
            default:
                return i;
        }
    }
}
