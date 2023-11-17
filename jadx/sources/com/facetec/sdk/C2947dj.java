package com.facetec.sdk;

/* renamed from: com.facetec.sdk.dj */
public class C2947dj {

    /* renamed from: a */
    public long f9933a;

    /* renamed from: b */
    public int f9934b;

    /* renamed from: c */
    public int f9935c;

    /* renamed from: d */
    public float f9936d;

    /* renamed from: e */
    public long f9937e;

    /* renamed from: f */
    public double f9938f;

    /* renamed from: g */
    public Object f9939g;

    /* renamed from: h */
    public double f9940h;

    /* renamed from: i */
    public Object f9941i;

    /* renamed from: j */
    public float f9942j;

    /* renamed from: k */
    private final float[] f9943k;

    /* renamed from: l */
    private int f9944l;

    /* renamed from: m */
    private final long[] f9945m;

    /* renamed from: n */
    private final int[] f9946n;

    /* renamed from: o */
    private int f9947o;

    /* renamed from: q */
    private final Object[] f9948q;

    /* renamed from: s */
    private final double[] f9949s;

    public C2947dj(long j, Object obj) {
        this.f9946n = new int[10];
        long[] jArr = new long[10];
        this.f9945m = jArr;
        this.f9943k = new float[10];
        this.f9949s = new double[10];
        Object[] objArr = new Object[10];
        this.f9948q = objArr;
        jArr[4] = j;
        objArr[6] = obj;
        this.f9944l = 0;
        this.f9947o = -1;
    }

    /* renamed from: d */
    public int mo9115d(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                long[] jArr = this.f9945m;
                int i3 = this.f9944l;
                this.f9944l = i3 + 1;
                jArr[i3] = jArr[4];
                return 0;
            case 2:
                Object[] objArr = this.f9948q;
                int i4 = this.f9944l;
                this.f9944l = i4 + 1;
                objArr[i4] = objArr[6];
                return 0;
            case 3:
                Object[] objArr2 = this.f9948q;
                int i5 = this.f9944l;
                this.f9944l = i5 + 1;
                objArr2[i5] = objArr2[7];
                return 0;
            case 4:
                int i6 = this.f9944l - this.f9934b;
                this.f9944l = i6;
                this.f9947o = i6;
                return 0;
            case 5:
                long[] jArr2 = this.f9945m;
                int i7 = this.f9947o;
                this.f9947o = i7 + 1;
                this.f9933a = jArr2[i7];
                return 0;
            case 6:
                Object[] objArr3 = this.f9948q;
                int i8 = this.f9947o;
                this.f9947o = i8 + 1;
                Object obj = objArr3[i8];
                objArr3[i8] = null;
                this.f9939g = obj;
                return 0;
            case 7:
                int[] iArr = this.f9946n;
                int i9 = this.f9944l;
                int i12 = i9 + 1;
                iArr[i9] = 2;
                iArr[i12] = 2;
                int i13 = (i12 + 1) - 1;
                this.f9944l = i13;
                iArr[i13 - 1] = iArr[i13 - 1] % iArr[i13];
                return 0;
            case 8:
                int i14 = this.f9944l - 1;
                this.f9944l = i14;
                this.f9948q[i14] = null;
                return 0;
            case 9:
                break;
            case 10:
                int[] iArr2 = this.f9946n;
                int i15 = this.f9944l;
                this.f9944l = i15 + 1;
                iArr2[i15] = this.f9934b;
                break;
            case 11:
                int[] iArr3 = this.f9946n;
                int i16 = this.f9944l;
                this.f9944l = i16 + 1;
                iArr3[i16] = 123;
                return 0;
            case 12:
                int i17 = this.f9944l - 1;
                int[] iArr4 = this.f9946n;
                iArr4[i17 - 1] = iArr4[i17 - 1] + iArr4[i17];
                int i18 = i17 + 1;
                iArr4[i17] = iArr4[i18 - 2];
                this.f9944l = i18 + 1;
                iArr4[i18] = 128;
                return 0;
            case 13:
                int i19 = this.f9944l - 1;
                this.f9944l = i19;
                int[] iArr5 = this.f9946n;
                iArr5[i19 - 1] = iArr5[i19 - 1] % iArr5[i19];
                return 0;
            case 14:
                int[] iArr6 = this.f9946n;
                int i22 = this.f9947o;
                this.f9947o = i22 + 1;
                this.f9935c = iArr6[i22];
                return 0;
            case 15:
                int[] iArr7 = this.f9946n;
                int i23 = this.f9944l;
                this.f9944l = i23 + 1;
                iArr7[i23] = 2;
                return 0;
            case 16:
                int i24 = this.f9944l - 1;
                this.f9944l = i24;
                if (this.f9946n[i24] == 0) {
                    i2 = 0;
                }
                this.f9935c = i2;
                return 0;
            case 17:
                Object[] objArr4 = this.f9948q;
                int i25 = this.f9944l;
                Object obj2 = objArr4[i25 - 1];
                objArr4[i25 - 1] = null;
                this.f9939g = obj2;
                return 0;
            case 18:
                long[] jArr3 = this.f9945m;
                int i26 = this.f9944l;
                int i27 = i26 + 1;
                jArr3[i26] = jArr3[4];
                Object[] objArr5 = this.f9948q;
                int i28 = i27 + 1;
                objArr5[i27] = objArr5[6];
                this.f9944l = i28 + 1;
                objArr5[i28] = objArr5[7];
                return 0;
            case 19:
                Object[] objArr6 = this.f9948q;
                int i29 = this.f9944l;
                this.f9944l = i29 + 1;
                objArr6[i29] = null;
                return 0;
            case 20:
                int[] iArr8 = this.f9946n;
                int i32 = this.f9944l - 1;
                this.f9944l = i32;
                this.f9935c = iArr8[i32];
                return 0;
            case 21:
                int[] iArr9 = this.f9946n;
                int i33 = this.f9944l;
                this.f9944l = i33 + 1;
                iArr9[i33] = 14;
                return 0;
            case 22:
                int[] iArr10 = this.f9946n;
                int i34 = this.f9944l;
                this.f9944l = i34 + 1;
                iArr10[i34] = 93;
                return 0;
            case 23:
                for (int i35 = this.f9944l - 1; i35 >= 0; i35--) {
                    this.f9948q[i35] = null;
                }
                Object[] objArr7 = this.f9948q;
                this.f9944l = 1 + 0;
                objArr7[0] = this.f9941i;
                return 0;
            case 24:
                Object[] objArr8 = this.f9948q;
                int i36 = this.f9944l;
                this.f9944l = i36 + 1;
                objArr8[i36] = objArr8[4];
                return 0;
            case 25:
                Object[] objArr9 = this.f9948q;
                int i37 = this.f9944l;
                this.f9944l = i37 + 1;
                objArr9[i37] = objArr9[5];
                return 0;
            case 26:
                int[] iArr11 = this.f9946n;
                int i38 = this.f9944l;
                iArr11[i38] = 2;
                int i39 = (i38 + 1) - 1;
                this.f9944l = i39;
                iArr11[i39 - 1] = iArr11[i39 - 1] % iArr11[i39];
                int i42 = i39 - 1;
                this.f9944l = i42;
                this.f9948q[i42] = null;
                return 0;
            case 27:
                int[] iArr12 = this.f9946n;
                int i43 = this.f9944l;
                this.f9944l = i43 + 1;
                iArr12[i43] = 71;
                return 0;
            case 28:
                int i44 = this.f9944l - 1;
                this.f9944l = i44;
                if (this.f9946n[i44] != 0) {
                    i2 = 0;
                }
                this.f9935c = i2;
                return 0;
            case 29:
                int[] iArr13 = this.f9946n;
                int i45 = this.f9944l;
                this.f9944l = i45 + 1;
                iArr13[i45] = 1;
                return 0;
            case 30:
                int[] iArr14 = this.f9946n;
                int i46 = this.f9944l;
                this.f9944l = i46 + 1;
                iArr14[i46] = 0;
                return 0;
            case 31:
                Object[] objArr10 = this.f9948q;
                int i47 = this.f9944l;
                this.f9944l = i47 + 1;
                objArr10[i47] = this.f9941i;
                return 0;
            case 32:
                int i48 = this.f9944l - 1;
                this.f9944l = i48;
                Object[] objArr11 = this.f9948q;
                Object obj3 = objArr11[i48];
                objArr11[i48] = null;
                objArr11[7] = obj3;
                return 0;
            case 33:
                long[] jArr4 = this.f9945m;
                int i49 = this.f9944l;
                int i52 = i49 + 1;
                jArr4[i49] = jArr4[4];
                Object[] objArr12 = this.f9948q;
                this.f9944l = i52 + 1;
                objArr12[i52] = objArr12[6];
                return 0;
            case 34:
                int[] iArr15 = this.f9946n;
                int i53 = this.f9944l;
                iArr15[i53] = 35;
                int i54 = (i53 + 1) - 1;
                this.f9944l = i54;
                iArr15[i54 - 1] = iArr15[i54 - 1] + iArr15[i54];
                return 0;
            case 35:
                int[] iArr16 = this.f9946n;
                int i55 = this.f9944l;
                int i56 = i55 + 1;
                iArr16[i55] = iArr16[i56 - 2];
                iArr16[i56] = 128;
                int i57 = (i56 + 1) - 1;
                this.f9944l = i57;
                iArr16[i57 - 1] = iArr16[i57 - 1] % iArr16[i57];
                return 0;
            case 36:
                int[] iArr17 = this.f9946n;
                int i58 = this.f9944l;
                iArr17[i58] = 2;
                int i59 = (i58 + 1) - 1;
                this.f9944l = i59;
                iArr17[i59 - 1] = iArr17[i59 - 1] % iArr17[i59];
                return 0;
            case 37:
                int i62 = this.f9944l - 1;
                Object[] objArr13 = this.f9948q;
                Object obj4 = objArr13[i62];
                objArr13[i62] = null;
                objArr13[7] = obj4;
                long[] jArr5 = this.f9945m;
                this.f9944l = i62 + 1;
                jArr5[i62] = jArr5[4];
                return 0;
            case 38:
                int[] iArr18 = this.f9946n;
                int i63 = this.f9944l;
                this.f9944l = i63 + 1;
                iArr18[i63] = 2;
                return 0;
            case 39:
                int[] iArr19 = this.f9946n;
                int i64 = this.f9944l;
                this.f9944l = i64 + 1;
                iArr19[i64] = 25;
                return 0;
            case 40:
                int i65 = this.f9944l - 1;
                this.f9944l = i65;
                Object[] objArr14 = this.f9948q;
                Object obj5 = objArr14[i65];
                objArr14[i65] = null;
                objArr14[5] = obj5;
                return 0;
            case 41:
                Object[] objArr15 = this.f9948q;
                int i66 = this.f9944l;
                int i67 = i66 + 1;
                this.f9944l = i67;
                objArr15[i66] = objArr15[i67 - 2];
                return 0;
            case 42:
                int i68 = this.f9944l - 1;
                this.f9944l = i68;
                Object[] objArr16 = this.f9948q;
                Object obj6 = objArr16[i68];
                objArr16[i68] = null;
                objArr16[6] = obj6;
                Object obj7 = objArr16[i68 - 1];
                objArr16[i68 - 1] = null;
                this.f9946n[i68 - 1] = ((Object[]) obj7).length;
                return 0;
            case 43:
                int i69 = this.f9944l - 1;
                int[] iArr20 = this.f9946n;
                iArr20[7] = iArr20[i69];
                iArr20[i69] = 0;
                int i72 = (i69 + 1) - 1;
                this.f9944l = i72;
                iArr20[8] = iArr20[i72];
                return 0;
            case 44:
                int i73 = this.f9944l - 2;
                this.f9944l = i73;
                int[] iArr21 = this.f9946n;
                if (iArr21[i73] >= iArr21[i73 + 1]) {
                    i2 = 0;
                }
                this.f9935c = i2;
                return 0;
            case 45:
                int[] iArr22 = this.f9946n;
                int i74 = this.f9944l;
                int i75 = i74 + 1;
                iArr22[i74] = iArr22[8];
                this.f9944l = i75 + 1;
                iArr22[i75] = iArr22[7];
                return 0;
            case 46:
                int[] iArr23 = this.f9946n;
                int i76 = this.f9944l;
                iArr23[i76] = iArr23[8];
                int i77 = (i76 + 1) - 1;
                this.f9944l = i77;
                Object[] objArr17 = this.f9948q;
                Object[] objArr18 = objArr17[i77 - 1];
                objArr17[i77 - 1] = null;
                objArr17[i77 - 1] = objArr18[iArr23[i77]];
                int i78 = i77 - 1;
                this.f9944l = i78;
                Object obj8 = objArr17[i78];
                objArr17[i78] = null;
                objArr17[9] = obj8;
                return 0;
            case 47:
                Object[] objArr19 = this.f9948q;
                int i79 = this.f9944l;
                this.f9944l = i79 + 1;
                objArr19[i79] = objArr19[9];
                return 0;
            case 48:
                int[] iArr24 = this.f9946n;
                iArr24[8] = iArr24[8] + 1;
                return 0;
            case 49:
                Object[] objArr20 = this.f9948q;
                int i82 = this.f9944l;
                int i83 = i82 + 1;
                objArr20[i82] = objArr20[5];
                int[] iArr25 = this.f9946n;
                this.f9944l = i83 + 1;
                iArr25[i83] = 41;
                return 0;
            case 50:
                int i84 = this.f9944l - 1;
                this.f9944l = i84;
                int[] iArr26 = this.f9946n;
                iArr26[i84 - 1] = iArr26[i84 - 1] % iArr26[i84];
                int i85 = i84 - 1;
                this.f9944l = i85;
                this.f9948q[i85] = null;
                return 0;
            case 51:
                int[] iArr27 = this.f9946n;
                int i86 = this.f9944l;
                int i87 = i86 + 1;
                iArr27[i86] = 2;
                this.f9944l = i87 + 1;
                iArr27[i87] = 2;
                return 0;
            case 52:
                int[] iArr28 = this.f9946n;
                int i88 = this.f9944l;
                iArr28[i88] = 105;
                int i89 = (i88 + 1) - 1;
                iArr28[i89 - 1] = iArr28[i89 - 1] + iArr28[i89];
                int i92 = i89 + 1;
                this.f9944l = i92;
                iArr28[i89] = iArr28[i92 - 2];
                return 0;
            case 53:
                int[] iArr29 = this.f9946n;
                int i93 = this.f9944l;
                iArr29[i93] = 128;
                int i94 = (i93 + 1) - 1;
                this.f9944l = i94;
                iArr29[i94 - 1] = iArr29[i94 - 1] % iArr29[i94];
                return 0;
            case 54:
                int[] iArr30 = this.f9946n;
                int i95 = this.f9944l;
                iArr30[i95] = 115;
                int i96 = (i95 + 1) - 1;
                iArr30[i96 - 1] = iArr30[i96 - 1] + iArr30[i96];
                int i97 = i96 + 1;
                this.f9944l = i97;
                iArr30[i96] = iArr30[i97 - 2];
                return 0;
            case 55:
                int[] iArr31 = this.f9946n;
                int i98 = this.f9944l;
                this.f9944l = i98 + 1;
                iArr31[i98] = 128;
                return 0;
            case 56:
                int[] iArr32 = this.f9946n;
                int i99 = this.f9944l;
                int i100 = i99 + 1;
                iArr32[i99] = 2;
                this.f9944l = i100 + 1;
                iArr32[i100] = 4;
                return 0;
            case 57:
                int i101 = this.f9944l - 1;
                int[] iArr33 = this.f9946n;
                iArr33[i101 - 1] = iArr33[i101 - 1] + iArr33[i101];
                int i102 = i101 - 1;
                this.f9944l = i102;
                this.f9948q[i102] = null;
                return 0;
            case 58:
                int[] iArr34 = this.f9946n;
                int i103 = this.f9944l;
                this.f9944l = i103 + 1;
                iArr34[i103] = 55;
                return 0;
            case 59:
                int i104 = this.f9944l - 1;
                this.f9944l = i104;
                int[] iArr35 = this.f9946n;
                iArr35[i104 - 1] = iArr35[i104 - 1] + iArr35[i104];
                return 0;
            case 60:
                int[] iArr36 = this.f9946n;
                int i105 = this.f9944l;
                this.f9944l = i105 + 1;
                iArr36[i105] = 79;
                return 0;
            case 61:
                int[] iArr37 = this.f9946n;
                int i106 = this.f9944l;
                this.f9944l = i106 + 1;
                iArr37[i106] = 52;
                return 0;
            case 62:
                int i107 = this.f9944l - 1;
                this.f9944l = i107;
                Object[] objArr21 = this.f9948q;
                Object obj9 = objArr21[i107];
                objArr21[i107] = null;
                objArr21[4] = obj9;
                return 0;
            case 63:
                int[] iArr38 = this.f9946n;
                int i108 = this.f9944l;
                int i109 = i108 + 1;
                iArr38[i108] = 46;
                this.f9944l = i109 + 1;
                iArr38[i109] = 47;
                return 0;
            case 64:
                int[] iArr39 = this.f9946n;
                int i110 = this.f9944l;
                this.f9944l = i110 + 1;
                iArr39[i110] = 59;
                return 0;
            case 65:
                int[] iArr40 = this.f9946n;
                int i111 = this.f9944l;
                iArr40[i111] = 105;
                int i112 = (i111 + 1) - 1;
                this.f9944l = i112;
                iArr40[i112 - 1] = iArr40[i112 - 1] + iArr40[i112];
                return 0;
            case 66:
                int[] iArr41 = this.f9946n;
                int i113 = this.f9944l;
                iArr41[i113] = 33;
                int i114 = (i113 + 1) - 1;
                iArr41[i114 - 1] = iArr41[i114 - 1] + iArr41[i114];
                int i115 = i114 + 1;
                this.f9944l = i115;
                iArr41[i114] = iArr41[i115 - 2];
                return 0;
            case 67:
                int[] iArr42 = this.f9946n;
                int i116 = this.f9944l;
                iArr42[i116] = 13;
                int i117 = (i116 + 1) - 1;
                this.f9944l = i117;
                iArr42[i117 - 1] = iArr42[i117 - 1] + iArr42[i117];
                return 0;
            case 68:
                int[] iArr43 = this.f9946n;
                int i118 = this.f9944l;
                int i119 = i118 + 1;
                iArr43[i118] = iArr43[i119 - 2];
                this.f9944l = i119 + 1;
                iArr43[i119] = 128;
                return 0;
            case 69:
                int[] iArr44 = this.f9946n;
                int i120 = this.f9944l;
                this.f9944l = i120 + 1;
                iArr44[i120] = 90;
                return 0;
            case 70:
                int[] iArr45 = this.f9946n;
                int i121 = this.f9944l;
                this.f9944l = i121 + 1;
                iArr45[i121] = 0;
                return 0;
            case 71:
                int i122 = this.f9944l - 1;
                this.f9944l = i122;
                int[] iArr46 = this.f9946n;
                iArr46[i122 - 1] = iArr46[i122 - 1] / iArr46[i122];
                int i123 = i122 - 1;
                this.f9944l = i123;
                this.f9948q[i123] = null;
                return 0;
            case 72:
                int[] iArr47 = this.f9946n;
                int i124 = this.f9944l;
                this.f9944l = i124 + 1;
                iArr47[i124] = 8;
                return 0;
            default:
                return i;
        }
        return 0;
    }

    public C2947dj(long j, Object obj, Object obj2) {
        this.f9946n = new int[10];
        long[] jArr = new long[10];
        this.f9945m = jArr;
        this.f9943k = new float[10];
        this.f9949s = new double[10];
        Object[] objArr = new Object[10];
        this.f9948q = objArr;
        jArr[4] = j;
        objArr[6] = obj;
        objArr[7] = obj2;
        this.f9944l = 0;
        this.f9947o = -1;
    }

    public C2947dj(Object obj) {
        this.f9946n = new int[10];
        this.f9945m = new long[10];
        this.f9943k = new float[10];
        this.f9949s = new double[10];
        Object[] objArr = new Object[10];
        this.f9948q = objArr;
        objArr[4] = obj;
        this.f9944l = 0;
        this.f9947o = -1;
    }

    public C2947dj(Object obj, Object obj2) {
        this.f9946n = new int[10];
        this.f9945m = new long[10];
        this.f9943k = new float[10];
        this.f9949s = new double[10];
        Object[] objArr = new Object[10];
        this.f9948q = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        this.f9944l = 0;
        this.f9947o = -1;
    }
}
