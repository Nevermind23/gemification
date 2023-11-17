package com.facetec.sdk;

/* renamed from: com.facetec.sdk.dh */
public class C2945dh {

    /* renamed from: a */
    public float f9899a;

    /* renamed from: b */
    public int f9900b;

    /* renamed from: c */
    public long f9901c;

    /* renamed from: d */
    public int f9902d;

    /* renamed from: e */
    public long f9903e;

    /* renamed from: f */
    public Object f9904f;

    /* renamed from: g */
    public double f9905g;

    /* renamed from: h */
    public Object f9906h;

    /* renamed from: i */
    public float f9907i;

    /* renamed from: j */
    public double f9908j;

    /* renamed from: k */
    private final float[] f9909k = new float[10];

    /* renamed from: l */
    private int f9910l;

    /* renamed from: m */
    private final int[] f9911m = new int[10];

    /* renamed from: n */
    private final long[] f9912n = new long[10];

    /* renamed from: o */
    private int f9913o;

    /* renamed from: s */
    private final double[] f9914s = new double[10];

    /* renamed from: t */
    private final Object[] f9915t;

    public C2945dh(Object obj) {
        Object[] objArr = new Object[10];
        this.f9915t = objArr;
        objArr[5] = obj;
        this.f9913o = 0;
        this.f9910l = -1;
    }

    /* renamed from: c */
    public int mo9113c(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                Object[] objArr = this.f9915t;
                int i3 = this.f9913o;
                this.f9913o = i3 + 1;
                objArr[i3] = this.f9906h;
                return 0;
            case 2:
                int i4 = this.f9913o - this.f9900b;
                this.f9913o = i4;
                this.f9910l = i4;
                return 0;
            case 3:
                Object[] objArr2 = this.f9915t;
                int i5 = this.f9910l;
                this.f9910l = i5 + 1;
                Object obj = objArr2[i5];
                objArr2[i5] = null;
                this.f9904f = obj;
                return 0;
            case 4:
                int[] iArr = this.f9911m;
                int i6 = this.f9913o;
                this.f9913o = i6 + 1;
                iArr[i6] = this.f9900b;
                return 0;
            case 5:
                int i7 = this.f9913o - 1;
                this.f9913o = i7;
                if (this.f9911m[i7] == 0) {
                    i2 = 0;
                }
                this.f9902d = i2;
                return 0;
            case 6:
                Object[] objArr3 = this.f9915t;
                int i8 = this.f9913o;
                this.f9913o = i8 + 1;
                objArr3[i8] = objArr3[5];
                return 0;
            case 7:
                int[] iArr2 = this.f9911m;
                int i9 = this.f9910l;
                this.f9910l = i9 + 1;
                this.f9902d = iArr2[i9];
                return 0;
            case 8:
                int[] iArr3 = this.f9911m;
                int i12 = this.f9913o;
                this.f9913o = i12 + 1;
                iArr3[i12] = 1;
                return 0;
            case 9:
                int i13 = this.f9913o - 2;
                this.f9913o = i13;
                Object[] objArr4 = this.f9915t;
                Object obj2 = objArr4[i13];
                objArr4[i13] = null;
                Object obj3 = objArr4[i13 + 1];
                objArr4[i13 + 1] = null;
                if (obj2 != obj3) {
                    i2 = 0;
                }
                this.f9902d = i2;
                return 0;
            case 10:
                Object[] objArr5 = this.f9915t;
                int i14 = this.f9913o;
                int i15 = i14 + 1;
                objArr5[i14] = objArr5[8];
                int[] iArr4 = this.f9911m;
                this.f9913o = i15 + 1;
                iArr4[i15] = 1;
                return 0;
            case 11:
                Object[] objArr6 = this.f9915t;
                int i16 = this.f9913o;
                this.f9913o = i16 + 1;
                objArr6[i16] = objArr6[6];
                return 0;
            case 12:
                int[] iArr5 = this.f9911m;
                int i17 = this.f9913o;
                this.f9913o = i17 + 1;
                iArr5[i17] = 0;
                return 0;
            case 13:
                Object[] objArr7 = this.f9915t;
                int i18 = this.f9913o;
                int i19 = i18 + 1;
                objArr7[i18] = objArr7[7];
                this.f9913o = i19 + 1;
                objArr7[i19] = objArr7[5];
                return 0;
            case 14:
                Object[] objArr8 = this.f9915t;
                int i22 = this.f9913o;
                this.f9913o = i22 + 1;
                objArr8[i22] = objArr8[8];
                return 0;
            case 15:
                int i23 = this.f9913o - 1;
                this.f9913o = i23;
                this.f9915t[i23] = null;
                return 0;
            case 16:
                Object[] objArr9 = this.f9915t;
                int i24 = this.f9913o;
                int i25 = i24 + 1;
                objArr9[i24] = objArr9[8];
                int[] iArr6 = this.f9911m;
                this.f9913o = i25 + 1;
                iArr6[i25] = 0;
                return 0;
            case 17:
                int[] iArr7 = this.f9911m;
                int i26 = this.f9913o;
                this.f9913o = i26 + 1;
                iArr7[i26] = 2;
                return 0;
            case 18:
                int[] iArr8 = this.f9911m;
                int i27 = this.f9913o;
                iArr8[i27] = 2;
                int i28 = (i27 + 1) - 1;
                this.f9913o = i28;
                iArr8[i28 - 1] = iArr8[i28 - 1] % iArr8[i28];
                int i29 = i28 - 1;
                this.f9913o = i29;
                this.f9915t[i29] = null;
                return 0;
            case 19:
                break;
            case 20:
                int[] iArr9 = this.f9911m;
                int i32 = this.f9913o;
                iArr9[i32] = 25;
                int i33 = (i32 + 1) - 1;
                iArr9[i33 - 1] = iArr9[i33 - 1] + iArr9[i33];
                int i34 = i33 + 1;
                this.f9913o = i34;
                iArr9[i33] = iArr9[i34 - 2];
                break;
            case 21:
                int[] iArr10 = this.f9911m;
                int i35 = this.f9913o;
                iArr10[i35] = 128;
                int i36 = (i35 + 1) - 1;
                this.f9913o = i36;
                iArr10[i36 - 1] = iArr10[i36 - 1] % iArr10[i36];
                return 0;
            case 22:
                int[] iArr11 = this.f9911m;
                int i37 = this.f9913o;
                iArr11[i37] = 2;
                int i38 = (i37 + 1) - 1;
                this.f9913o = i38;
                iArr11[i38 - 1] = iArr11[i38 - 1] % iArr11[i38];
                return 0;
            case 23:
                int i39 = this.f9913o - 1;
                this.f9913o = i39;
                if (this.f9911m[i39] != 0) {
                    i2 = 0;
                }
                this.f9902d = i2;
                return 0;
            case 24:
                int[] iArr12 = this.f9911m;
                int i42 = this.f9913o;
                this.f9913o = i42 + 1;
                iArr12[i42] = 85;
                return 0;
            case 25:
                int i43 = this.f9913o - 1;
                this.f9913o = i43;
                int[] iArr13 = this.f9911m;
                iArr13[i43 - 1] = iArr13[i43 - 1] + iArr13[i43];
                return 0;
            case 26:
                int[] iArr14 = this.f9911m;
                int i44 = this.f9913o;
                int i45 = i44 + 1;
                this.f9913o = i45;
                iArr14[i44] = iArr14[i45 - 2];
                return 0;
            case 27:
                int i46 = this.f9913o - 1;
                this.f9913o = i46;
                int[] iArr15 = this.f9911m;
                iArr15[i46 - 1] = iArr15[i46 - 1] % iArr15[i46];
                return 0;
            case 28:
                Object[] objArr10 = this.f9915t;
                int i47 = this.f9913o;
                Object obj4 = objArr10[i47 - 1];
                objArr10[i47 - 1] = null;
                this.f9904f = obj4;
                return 0;
            case 29:
                Object[] objArr11 = this.f9915t;
                int i48 = this.f9913o;
                int i49 = i48 + 1;
                this.f9913o = i49;
                objArr11[i48] = null;
                Object obj5 = objArr11[i49 - 1];
                objArr11[i49 - 1] = null;
                this.f9911m[i49 - 1] = ((int[]) obj5).length;
                return 0;
            case 30:
                int[] iArr16 = this.f9911m;
                int i52 = this.f9913o;
                this.f9913o = i52 + 1;
                iArr16[i52] = 93;
                return 0;
            case 31:
                int i53 = this.f9913o - 1;
                int[] iArr17 = this.f9911m;
                iArr17[i53 - 1] = iArr17[i53 - 1] + iArr17[i53];
                int i54 = i53 + 1;
                iArr17[i53] = iArr17[i54 - 2];
                this.f9913o = i54 + 1;
                iArr17[i54] = 128;
                return 0;
            case 32:
                int[] iArr18 = this.f9911m;
                int i55 = this.f9913o;
                int i56 = i55 + 1;
                iArr18[i55] = 88;
                this.f9913o = i56 + 1;
                iArr18[i56] = 0;
                return 0;
            case 33:
                int i57 = this.f9913o - 1;
                this.f9913o = i57;
                int[] iArr19 = this.f9911m;
                iArr19[i57 - 1] = iArr19[i57 - 1] / iArr19[i57];
                int i58 = i57 - 1;
                this.f9913o = i58;
                this.f9915t[i58] = null;
                return 0;
            case 34:
                int[] iArr20 = this.f9911m;
                int i59 = this.f9913o - 1;
                this.f9913o = i59;
                this.f9902d = iArr20[i59];
                return 0;
            case 35:
                int[] iArr21 = this.f9911m;
                int i62 = this.f9913o;
                this.f9913o = i62 + 1;
                iArr21[i62] = 64;
                return 0;
            case 36:
                int[] iArr22 = this.f9911m;
                int i63 = this.f9913o;
                this.f9913o = i63 + 1;
                iArr22[i63] = 78;
                return 0;
            case 37:
                int[] iArr23 = this.f9911m;
                int i64 = this.f9913o;
                this.f9913o = i64 + 1;
                iArr23[i64] = 49;
                return 0;
            case 38:
                int[] iArr24 = this.f9911m;
                int i65 = this.f9913o;
                this.f9913o = i65 + 1;
                iArr24[i65] = 34;
                return 0;
            case 39:
                int[] iArr25 = this.f9911m;
                int i66 = this.f9913o;
                this.f9913o = i66 + 1;
                iArr25[i66] = 38;
                return 0;
            case 40:
                int[] iArr26 = this.f9911m;
                int i67 = this.f9913o;
                this.f9913o = i67 + 1;
                iArr26[i67] = 89;
                return 0;
            case 41:
                for (int i68 = this.f9913o - 1; i68 >= 0; i68--) {
                    this.f9915t[i68] = null;
                }
                Object[] objArr12 = this.f9915t;
                this.f9913o = 1 + 0;
                objArr12[0] = this.f9906h;
                return 0;
            case 42:
                Object[] objArr13 = this.f9915t;
                int i69 = this.f9913o;
                this.f9913o = i69 + 1;
                objArr13[i69] = objArr13[9];
                return 0;
            case 43:
                int i72 = this.f9913o - 1;
                this.f9913o = i72;
                Object[] objArr14 = this.f9915t;
                Object obj6 = objArr14[i72];
                objArr14[i72] = null;
                if (obj6 != null) {
                    i2 = 0;
                }
                this.f9902d = i2;
                return 0;
            case 44:
                Object[] objArr15 = this.f9915t;
                int i73 = this.f9913o;
                int i74 = i73 + 1;
                objArr15[i73] = objArr15[5];
                int[] iArr27 = this.f9911m;
                this.f9913o = i74 + 1;
                iArr27[i74] = 1;
                return 0;
            case 45:
                Object[] objArr16 = this.f9915t;
                int i75 = this.f9913o;
                this.f9913o = i75 + 1;
                objArr16[i75] = objArr16[7];
                return 0;
            case 46:
                Object[] objArr17 = this.f9915t;
                int i76 = this.f9913o;
                int i77 = i76 + 1;
                objArr17[i76] = objArr17[8];
                int i78 = i77 + 1;
                objArr17[i77] = objArr17[5];
                this.f9913o = i78 + 1;
                objArr17[i78] = objArr17[9];
                return 0;
            case 47:
                int[] iArr28 = this.f9911m;
                int i79 = this.f9913o;
                iArr28[i79] = 77;
                int i82 = (i79 + 1) - 1;
                this.f9913o = i82;
                iArr28[i82 - 1] = iArr28[i82 - 1] + iArr28[i82];
                return 0;
            case 48:
                int[] iArr29 = this.f9911m;
                int i83 = this.f9913o;
                this.f9913o = i83 + 1;
                iArr29[i83] = 128;
                return 0;
            case 49:
                int[] iArr30 = this.f9911m;
                int i84 = this.f9913o;
                iArr30[i84] = 57;
                int i85 = (i84 + 1) - 1;
                this.f9913o = i85;
                iArr30[i85 - 1] = iArr30[i85 - 1] + iArr30[i85];
                return 0;
            case 50:
                Object[] objArr18 = this.f9915t;
                int i86 = this.f9913o;
                int i87 = i86 + 1;
                objArr18[i86] = objArr18[i87 - 2];
                this.f9913o = i87 + 1;
                objArr18[i87] = objArr18[6];
                return 0;
            case 51:
                int[] iArr31 = this.f9911m;
                int i88 = this.f9913o;
                int i89 = i88 + 1;
                iArr31[i88] = 2;
                iArr31[i89] = 2;
                int i92 = (i89 + 1) - 1;
                this.f9913o = i92;
                iArr31[i92 - 1] = iArr31[i92 - 1] % iArr31[i92];
                return 0;
            case 52:
                int[] iArr32 = this.f9911m;
                int i93 = this.f9913o;
                iArr32[i93] = 107;
                int i94 = (i93 + 1) - 1;
                iArr32[i94 - 1] = iArr32[i94 - 1] + iArr32[i94];
                int i95 = i94 + 1;
                this.f9913o = i95;
                iArr32[i94] = iArr32[i95 - 2];
                return 0;
            case 53:
                int[] iArr33 = this.f9911m;
                int i96 = this.f9913o;
                int i97 = i96 + 1;
                iArr33[i96] = iArr33[i97 - 2];
                iArr33[i97] = 128;
                int i98 = (i97 + 1) - 1;
                this.f9913o = i98;
                iArr33[i98 - 1] = iArr33[i98 - 1] % iArr33[i98];
                return 0;
            case 54:
                int i99 = this.f9913o - 1;
                Object[] objArr19 = this.f9915t;
                objArr19[i99] = null;
                int i100 = i99 + 1;
                objArr19[i99] = objArr19[5];
                this.f9913o = i100 + 1;
                objArr19[i100] = objArr19[6];
                return 0;
            case 55:
                Object[] objArr20 = this.f9915t;
                int i101 = this.f9913o;
                int i102 = i101 + 1;
                this.f9913o = i102;
                objArr20[i101] = objArr20[i102 - 2];
                return 0;
            case 56:
                int i103 = this.f9913o - 1;
                this.f9913o = i103;
                Object[] objArr21 = this.f9915t;
                Object obj7 = objArr21[i103];
                objArr21[i103] = null;
                objArr21[6] = obj7;
                return 0;
            case 57:
                Object[] objArr22 = this.f9915t;
                int i104 = this.f9913o;
                int i105 = i104 + 1;
                objArr22[i104] = objArr22[5];
                int[] iArr34 = this.f9911m;
                this.f9913o = i105 + 1;
                iArr34[i105] = 0;
                return 0;
            case 58:
                Object[] objArr23 = this.f9915t;
                int i106 = this.f9913o;
                int i107 = i106 + 1;
                objArr23[i106] = objArr23[5];
                int i108 = i107 + 1;
                objArr23[i107] = objArr23[8];
                int[] iArr35 = this.f9911m;
                this.f9913o = i108 + 1;
                iArr35[i108] = 0;
                return 0;
            case 59:
                int[] iArr36 = this.f9911m;
                int i109 = this.f9913o;
                iArr36[i109] = 9;
                int i110 = (i109 + 1) - 1;
                this.f9913o = i110;
                iArr36[i110 - 1] = iArr36[i110 - 1] + iArr36[i110];
                return 0;
            case 60:
                int[] iArr37 = this.f9911m;
                int i111 = this.f9913o;
                int i112 = i111 + 1;
                iArr37[i111] = iArr37[i112 - 2];
                this.f9913o = i112 + 1;
                iArr37[i112] = 128;
                return 0;
            case 61:
                int i113 = this.f9913o - 1;
                Object[] objArr24 = this.f9915t;
                objArr24[i113] = null;
                this.f9913o = i113 + 1;
                objArr24[i113] = objArr24[5];
                return 0;
            case 62:
                Object[] objArr25 = this.f9915t;
                int i114 = this.f9913o;
                this.f9913o = i114 + 1;
                objArr25[i114] = null;
                return 0;
            case 63:
                int[] iArr38 = this.f9911m;
                int i115 = this.f9913o;
                this.f9913o = i115 + 1;
                iArr38[i115] = 33;
                return 0;
            case 64:
                int[] iArr39 = this.f9911m;
                int i116 = this.f9913o;
                this.f9913o = i116 + 1;
                iArr39[i116] = 23;
                return 0;
            case 65:
                int i117 = this.f9913o - 2;
                this.f9913o = i117;
                int[] iArr40 = this.f9911m;
                if (iArr40[i117] < iArr40[i117 + 1]) {
                    i2 = 0;
                }
                this.f9902d = i2;
                return 0;
            case 66:
                int[] iArr41 = this.f9911m;
                int i118 = this.f9913o;
                int i119 = i118 + 1;
                iArr41[i118] = 2;
                this.f9913o = i119 + 1;
                iArr41[i119] = 2;
                return 0;
            case 67:
                int[] iArr42 = this.f9911m;
                int i120 = this.f9913o;
                iArr42[i120] = 91;
                int i121 = (i120 + 1) - 1;
                this.f9913o = i121;
                iArr42[i121 - 1] = iArr42[i121 - 1] + iArr42[i121];
                return 0;
            case 68:
                int[] iArr43 = this.f9911m;
                int i122 = this.f9913o;
                this.f9913o = i122 + 1;
                iArr43[i122] = 4;
                return 0;
            case 69:
                int[] iArr44 = this.f9911m;
                int i123 = this.f9913o;
                iArr44[i123] = 2;
                int i124 = (i123 + 1) - 1;
                iArr44[i124 - 1] = iArr44[i124 - 1] << iArr44[i124];
                int i125 = i124 - 1;
                this.f9913o = i125;
                this.f9915t[i125] = null;
                return 0;
            case 70:
                int[] iArr45 = this.f9911m;
                int i126 = this.f9913o;
                this.f9913o = i126 + 1;
                iArr45[i126] = 80;
                return 0;
            case 71:
                int[] iArr46 = this.f9911m;
                int i127 = this.f9913o;
                this.f9913o = i127 + 1;
                iArr46[i127] = 69;
                return 0;
            default:
                return i;
        }
        return 0;
    }

    public C2945dh(Object obj, Object obj2) {
        Object[] objArr = new Object[10];
        this.f9915t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.f9913o = 0;
        this.f9910l = -1;
    }

    public C2945dh(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = new Object[10];
        this.f9915t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        this.f9913o = 0;
        this.f9910l = -1;
    }

    public C2945dh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = new Object[10];
        this.f9915t = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        objArr[9] = obj5;
        this.f9913o = 0;
        this.f9910l = -1;
    }
}
