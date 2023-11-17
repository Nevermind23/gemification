package com.facetec.sdk;

/* renamed from: com.facetec.sdk.dk */
public class C2948dk {

    /* renamed from: a */
    public int f9950a;

    /* renamed from: b */
    public float f9951b;

    /* renamed from: c */
    public int f9952c;

    /* renamed from: d */
    public long f9953d;

    /* renamed from: e */
    public long f9954e;

    /* renamed from: f */
    public float f9955f;

    /* renamed from: g */
    public double f9956g;

    /* renamed from: h */
    public Object f9957h;

    /* renamed from: i */
    public Object f9958i;

    /* renamed from: j */
    public double f9959j;

    /* renamed from: k */
    private int f9960k;

    /* renamed from: l */
    private final float[] f9961l;

    /* renamed from: m */
    private final int[] f9962m;

    /* renamed from: n */
    private final long[] f9963n;

    /* renamed from: o */
    private int f9964o;

    /* renamed from: q */
    private final double[] f9965q;

    /* renamed from: t */
    private final Object[] f9966t;

    public C2948dk(Object obj) {
        this.f9962m = new int[15];
        this.f9963n = new long[15];
        this.f9961l = new float[15];
        this.f9965q = new double[15];
        Object[] objArr = new Object[15];
        this.f9966t = objArr;
        objArr[10] = obj;
        this.f9960k = 0;
        this.f9964o = -1;
    }

    /* renamed from: d */
    public int mo9116d(int i) {
        switch (i) {
            case 1:
                int i2 = this.f9960k - this.f9952c;
                this.f9960k = i2;
                this.f9964o = i2;
                return 0;
            case 2:
                Object[] objArr = this.f9966t;
                int i3 = this.f9964o;
                this.f9964o = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.f9957h = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.f9966t;
                int i4 = this.f9960k;
                this.f9960k = i4 + 1;
                objArr2[i4] = this.f9958i;
                return 0;
            case 4:
                Object[] objArr3 = this.f9966t;
                int i5 = this.f9960k;
                this.f9960k = i5 + 1;
                objArr3[i5] = objArr3[10];
                return 0;
            case 5:
                int i6 = this.f9960k - 1;
                this.f9960k = i6;
                this.f9966t[i6] = null;
                return 0;
            case 6:
                int[] iArr = this.f9962m;
                int i7 = this.f9960k;
                this.f9960k = i7 + 1;
                iArr[i7] = 2;
                return 0;
            case 7:
                int[] iArr2 = this.f9962m;
                int i8 = this.f9960k;
                iArr2[i8] = 2;
                int i9 = (i8 + 1) - 1;
                this.f9960k = i9;
                iArr2[i9 - 1] = iArr2[i9 - 1] % iArr2[i9];
                return 0;
            case 8:
                break;
            case 9:
                int[] iArr3 = this.f9962m;
                int i12 = this.f9960k;
                this.f9960k = i12 + 1;
                iArr3[i12] = this.f9952c;
                break;
            case 10:
                int[] iArr4 = this.f9962m;
                int i13 = this.f9960k;
                this.f9960k = i13 + 1;
                iArr4[i13] = 19;
                return 0;
            case 11:
                int i14 = this.f9960k - 1;
                this.f9960k = i14;
                int[] iArr5 = this.f9962m;
                iArr5[i14 - 1] = iArr5[i14 - 1] + iArr5[i14];
                return 0;
            case 12:
                int[] iArr6 = this.f9962m;
                int i15 = this.f9960k;
                int i16 = i15 + 1;
                iArr6[i15] = iArr6[i16 - 2];
                iArr6[i16] = 128;
                int i17 = (i16 + 1) - 1;
                this.f9960k = i17;
                iArr6[i17 - 1] = iArr6[i17 - 1] % iArr6[i17];
                return 0;
            case 13:
                int[] iArr7 = this.f9962m;
                int i18 = this.f9964o;
                this.f9964o = i18 + 1;
                this.f9950a = iArr7[i18];
                return 0;
            case 14:
                int i19 = this.f9960k - 1;
                this.f9960k = i19;
                int[] iArr8 = this.f9962m;
                iArr8[i19 - 1] = iArr8[i19 - 1] % iArr8[i19];
                return 0;
            case 15:
                int i22 = this.f9960k - 1;
                this.f9960k = i22;
                this.f9950a = this.f9962m[i22] != 0 ? 1 : 0;
                return 0;
            case 16:
                Object[] objArr4 = this.f9966t;
                int i23 = this.f9960k;
                Object obj2 = objArr4[i23 - 1];
                objArr4[i23 - 1] = null;
                this.f9957h = obj2;
                return 0;
            case 17:
                int[] iArr9 = this.f9962m;
                int i24 = this.f9960k;
                this.f9960k = i24 + 1;
                iArr9[i24] = 43;
                return 0;
            case 18:
                int[] iArr10 = this.f9962m;
                int i25 = this.f9960k;
                this.f9960k = i25 + 1;
                iArr10[i25] = 0;
                return 0;
            case 19:
                int i26 = this.f9960k - 1;
                this.f9960k = i26;
                int[] iArr11 = this.f9962m;
                iArr11[i26 - 1] = iArr11[i26 - 1] / iArr11[i26];
                int i27 = i26 - 1;
                this.f9960k = i27;
                this.f9966t[i27] = null;
                return 0;
            case 20:
                int[] iArr12 = this.f9962m;
                int i28 = this.f9960k;
                this.f9960k = i28 + 1;
                iArr12[i28] = 33;
                return 0;
            case 21:
                int[] iArr13 = this.f9962m;
                int i29 = this.f9960k;
                int i32 = i29 + 1;
                this.f9960k = i32;
                iArr13[i29] = iArr13[i32 - 2];
                return 0;
            case 22:
                int[] iArr14 = this.f9962m;
                int i33 = this.f9960k;
                this.f9960k = i33 + 1;
                iArr14[i33] = 128;
                return 0;
            case 23:
                int[] iArr15 = this.f9962m;
                int i34 = this.f9960k - 1;
                this.f9960k = i34;
                this.f9950a = iArr15[i34];
                return 0;
            case 24:
                int[] iArr16 = this.f9962m;
                int i35 = this.f9960k;
                this.f9960k = i35 + 1;
                iArr16[i35] = 1;
                return 0;
            case 25:
                int[] iArr17 = this.f9962m;
                int i36 = this.f9960k;
                this.f9960k = i36 + 1;
                iArr17[i36] = 0;
                return 0;
            case 26:
                for (int i37 = this.f9960k - 1; i37 >= 0; i37--) {
                    this.f9966t[i37] = null;
                }
                Object[] objArr5 = this.f9966t;
                this.f9960k = 0 + 1;
                objArr5[0] = this.f9958i;
                return 0;
            case 27:
                int[] iArr18 = this.f9962m;
                int i38 = this.f9960k;
                this.f9960k = i38 + 1;
                iArr18[i38] = -1;
                return 0;
            case 28:
                int i39 = this.f9960k - 1;
                int[] iArr19 = this.f9962m;
                iArr19[11] = iArr19[i39];
                Object[] objArr6 = this.f9966t;
                this.f9960k = i39 + 1;
                objArr6[i39] = objArr6[10];
                return 0;
            case 29:
                float[] fArr = this.f9961l;
                int i42 = this.f9960k;
                this.f9960k = i42 + 1;
                fArr[i42] = this.f9951b;
                return 0;
            case 30:
                float[] fArr2 = this.f9961l;
                int i43 = this.f9960k;
                this.f9960k = i43 + 1;
                fArr2[i43] = 0.0f;
                return 0;
            case 31:
                int i44 = this.f9960k - 1;
                int[] iArr20 = this.f9962m;
                float[] fArr3 = this.f9961l;
                iArr20[i44 - 1] = (fArr3[i44 - 1] > fArr3[i44] ? 1 : (fArr3[i44 - 1] == fArr3[i44] ? 0 : -1));
                int i45 = i44 - 1;
                this.f9960k = i45;
                iArr20[i45 - 1] = iArr20[i45 - 1] + iArr20[i45];
                return 0;
            case 32:
                int[] iArr21 = this.f9962m;
                int i46 = this.f9960k;
                this.f9960k = i46 + 1;
                iArr21[i46] = 133;
                return 0;
            case 33:
                int i47 = this.f9960k - 1;
                this.f9960k = i47;
                int[] iArr22 = this.f9962m;
                iArr22[i47 - 1] = iArr22[i47 - 1] - iArr22[i47];
                return 0;
            case 34:
                int[] iArr23 = this.f9962m;
                int i48 = this.f9960k;
                iArr23[i48 - 1] = (char) iArr23[i48 - 1];
                return 0;
            case 35:
                int i49 = this.f9960k - 1;
                this.f9960k = i49;
                int[] iArr24 = this.f9962m;
                iArr24[11] = iArr24[i49];
                return 0;
            case 36:
                int[] iArr25 = this.f9962m;
                int i52 = this.f9960k;
                int i53 = i52 + 1;
                iArr25[i52] = 0;
                this.f9960k = i53 + 1;
                iArr25[i53] = 0;
                return 0;
            case 37:
                int[] iArr26 = this.f9962m;
                int i54 = this.f9960k;
                int i55 = i54 + 1;
                iArr26[i54] = 9450;
                this.f9960k = i55 + 1;
                iArr26[i55] = 0;
                return 0;
            case 38:
                int i56 = this.f9960k - 1;
                this.f9960k = i56;
                int[] iArr27 = this.f9962m;
                iArr27[i56 - 1] = iArr27[i56 - 1] - iArr27[i56];
                iArr27[i56 - 1] = (char) iArr27[i56 - 1];
                return 0;
            case 39:
                int[] iArr28 = this.f9962m;
                int i57 = this.f9960k;
                iArr28[i57] = 16;
                int i58 = (i57 + 1) - 1;
                this.f9960k = i58;
                iArr28[i58 - 1] = iArr28[i58 - 1] >> iArr28[i58];
                return 0;
            case 40:
                long[] jArr = this.f9963n;
                int i59 = this.f9960k;
                this.f9960k = i59 + 1;
                jArr[i59] = this.f9953d;
                return 0;
            case 41:
                long[] jArr2 = this.f9963n;
                int i62 = this.f9960k;
                jArr2[i62] = 0;
                int i63 = (i62 + 1) - 1;
                this.f9960k = i63;
                this.f9962m[i63 - 1] = (jArr2[i63 - 1] > jArr2[i63] ? 1 : (jArr2[i63 - 1] == jArr2[i63] ? 0 : -1));
                return 0;
            case 42:
                int[] iArr29 = this.f9962m;
                int i64 = this.f9960k;
                int i65 = i64 + 1;
                iArr29[i64] = 6135;
                this.f9960k = i65 + 1;
                iArr29[i65] = 0;
                return 0;
            case 43:
                int[] iArr30 = this.f9962m;
                int i66 = this.f9960k;
                iArr30[i66] = 3;
                int i67 = (i66 + 1) - 1;
                this.f9960k = i67;
                iArr30[11] = iArr30[i67];
                return 0;
            case 44:
                int[] iArr31 = this.f9962m;
                int i68 = this.f9960k;
                iArr31[i68] = 16;
                int i69 = (i68 + 1) - 1;
                iArr31[i69 - 1] = iArr31[i69 - 1] >> iArr31[i69];
                int i72 = i69 - 1;
                this.f9960k = i72;
                iArr31[i72 - 1] = iArr31[i72 - 1] - iArr31[i72];
                return 0;
            case 45:
                long[] jArr3 = this.f9963n;
                int i73 = this.f9960k;
                jArr3[i73] = 0;
                int i74 = (i73 + 1) - 1;
                int[] iArr32 = this.f9962m;
                iArr32[i74 - 1] = (jArr3[i74 - 1] > jArr3[i74] ? 1 : (jArr3[i74 - 1] == jArr3[i74] ? 0 : -1));
                int i75 = i74 - 1;
                this.f9960k = i75;
                iArr32[i75 - 1] = iArr32[i75 - 1] + iArr32[i75];
                return 0;
            case 46:
                int[] iArr33 = this.f9962m;
                int i76 = this.f9960k;
                this.f9960k = i76 + 1;
                iArr33[i76] = 4;
                return 0;
            case 47:
                long[] jArr4 = this.f9963n;
                int i77 = this.f9960k;
                this.f9960k = i77 + 1;
                jArr4[i77] = 0;
                return 0;
            case 48:
                long[] jArr5 = this.f9963n;
                int i78 = this.f9964o;
                this.f9964o = i78 + 1;
                this.f9954e = jArr5[i78];
                return 0;
            case 49:
                int[] iArr34 = this.f9962m;
                int i79 = this.f9960k;
                iArr34[i79] = 5;
                int i82 = (i79 + 1) - 1;
                this.f9960k = i82;
                iArr34[11] = iArr34[i82];
                return 0;
            case 50:
                int[] iArr35 = this.f9962m;
                int i83 = this.f9960k;
                this.f9960k = i83 + 1;
                iArr35[i83] = iArr35[11];
                return 0;
            case 51:
                int i84 = this.f9960k - 1;
                this.f9960k = i84;
                int[] iArr36 = this.f9962m;
                iArr36[i84 - 1] = iArr36[i84] | iArr36[i84 - 1];
                return 0;
            case 52:
                int[] iArr37 = this.f9962m;
                int i85 = this.f9960k;
                int i86 = i85 + 1;
                iArr37[i85] = 2;
                iArr37[i86] = 2;
                int i87 = (i86 + 1) - 1;
                this.f9960k = i87;
                iArr37[i87 - 1] = iArr37[i87 - 1] % iArr37[i87];
                return 0;
            case 53:
                int[] iArr38 = this.f9962m;
                int i88 = this.f9960k;
                iArr38[i88] = 121;
                int i89 = (i88 + 1) - 1;
                iArr38[i89 - 1] = iArr38[i89 - 1] + iArr38[i89];
                int i92 = i89 + 1;
                this.f9960k = i92;
                iArr38[i89] = iArr38[i92 - 2];
                return 0;
            case 54:
                int i93 = this.f9960k - 1;
                this.f9960k = i93;
                this.f9950a = this.f9962m[i93] == 0 ? 1 : 0;
                return 0;
            case 55:
                int[] iArr39 = this.f9962m;
                int i94 = this.f9960k;
                iArr39[i94] = 2;
                int i95 = (i94 + 1) - 1;
                this.f9960k = i95;
                iArr39[11] = iArr39[i95];
                return 0;
            case 56:
                int[] iArr40 = this.f9962m;
                int i96 = this.f9960k;
                iArr40[i96] = 87;
                int i97 = (i96 + 1) - 1;
                iArr40[i97 - 1] = iArr40[i97 - 1] + iArr40[i97];
                int i98 = i97 + 1;
                this.f9960k = i98;
                iArr40[i97] = iArr40[i98 - 2];
                return 0;
            case 57:
                int[] iArr41 = this.f9962m;
                int i99 = this.f9960k;
                this.f9960k = i99 + 1;
                iArr41[i99] = 81;
                return 0;
            case 58:
                int[] iArr42 = this.f9962m;
                int i100 = this.f9960k;
                this.f9960k = i100 + 1;
                iArr42[i100] = 21;
                return 0;
            case 59:
                int i101 = this.f9960k - 2;
                this.f9960k = i101;
                int[] iArr43 = this.f9962m;
                this.f9950a = iArr43[i101] >= iArr43[i101 + 1] ? 1 : 0;
                return 0;
            case 60:
                Object[] objArr7 = this.f9966t;
                int i102 = this.f9960k;
                int i103 = i102 + 1;
                objArr7[i102] = objArr7[i103 - 2];
                int i104 = i103 - 1;
                this.f9960k = i104;
                Object obj3 = objArr7[i104];
                objArr7[i104] = null;
                objArr7[12] = obj3;
                return 0;
            case 61:
                int[] iArr44 = this.f9962m;
                int i105 = this.f9960k;
                Object[] objArr8 = this.f9966t;
                Object obj4 = objArr8[i105 - 1];
                objArr8[i105 - 1] = null;
                iArr44[i105 - 1] = ((Object[]) obj4).length;
                int i106 = i105 - 1;
                this.f9960k = i106;
                iArr44[13] = iArr44[i106];
                return 0;
            case 62:
                int[] iArr45 = this.f9962m;
                int i107 = this.f9960k;
                iArr45[i107] = 0;
                int i108 = (i107 + 1) - 1;
                this.f9960k = i108;
                iArr45[14] = iArr45[i108];
                return 0;
            case 63:
                int[] iArr46 = this.f9962m;
                int i109 = this.f9960k;
                int i110 = i109 + 1;
                iArr46[i109] = iArr46[14];
                this.f9960k = i110 + 1;
                iArr46[i110] = iArr46[13];
                return 0;
            case 64:
                int i111 = this.f9960k - 2;
                this.f9960k = i111;
                int[] iArr47 = this.f9962m;
                this.f9950a = iArr47[i111] < iArr47[i111 + 1] ? 1 : 0;
                return 0;
            case 65:
                Object[] objArr9 = this.f9966t;
                int i112 = this.f9960k;
                this.f9960k = i112 + 1;
                objArr9[i112] = objArr9[12];
                return 0;
            case 66:
                int[] iArr48 = this.f9962m;
                int i113 = this.f9960k;
                this.f9960k = i113 + 1;
                iArr48[i113] = iArr48[14];
                return 0;
            case 67:
                int i114 = this.f9960k - 1;
                this.f9960k = i114;
                Object[] objArr10 = this.f9966t;
                Object[] objArr11 = objArr10[i114 - 1];
                objArr10[i114 - 1] = null;
                objArr10[i114 - 1] = objArr11[this.f9962m[i114]];
                return 0;
            case 68:
                int[] iArr49 = this.f9962m;
                int i115 = this.f9960k;
                this.f9960k = i115 + 1;
                iArr49[i115] = 20;
                return 0;
            case 69:
                int i116 = this.f9960k - 1;
                int[] iArr50 = this.f9962m;
                iArr50[i116 - 1] = iArr50[i116 - 1] + iArr50[i116];
                iArr50[i116] = 6;
                int i117 = (i116 + 1) - 1;
                this.f9960k = i117;
                iArr50[i117 - 1] = iArr50[i117 - 1] >> iArr50[i117];
                return 0;
            case 70:
                int[] iArr51 = this.f9962m;
                int i118 = this.f9960k;
                this.f9960k = i118 + 1;
                iArr51[i118] = 8;
                return 0;
            case 71:
                int i119 = this.f9960k - 1;
                int[] iArr52 = this.f9962m;
                iArr52[i119 - 1] = iArr52[i119 - 1] >> iArr52[i119];
                int i120 = i119 - 1;
                this.f9960k = i120;
                iArr52[i120 - 1] = iArr52[i120 - 1] + iArr52[i120];
                iArr52[i120 - 1] = (char) iArr52[i120 - 1];
                return 0;
            case 72:
                int[] iArr53 = this.f9962m;
                iArr53[14] = iArr53[14] + 1;
                return 0;
            case 73:
                int i121 = this.f9960k - 1;
                this.f9960k = i121;
                this.f9950a = this.f9962m[i121] > 0 ? 1 : 0;
                return 0;
            case 74:
                int i122 = this.f9960k - 1;
                this.f9960k = i122;
                int[] iArr54 = this.f9962m;
                iArr54[i122 - 1] = iArr54[i122] & iArr54[i122 - 1];
                return 0;
            case 75:
                int[] iArr55 = this.f9962m;
                int i123 = this.f9960k;
                int i124 = i123 + 1;
                iArr55[i123] = 2;
                this.f9960k = i124 + 1;
                iArr55[i124] = 2;
                return 0;
            case 76:
                int[] iArr56 = this.f9962m;
                int i125 = this.f9960k;
                int i126 = i125 + 1;
                iArr56[i125] = iArr56[i126 - 2];
                this.f9960k = i126 + 1;
                iArr56[i126] = 128;
                return 0;
            case 77:
                int[] iArr57 = this.f9962m;
                int i127 = this.f9960k;
                int i128 = i127 + 1;
                iArr57[i127] = 69;
                iArr57[i128] = 0;
                int i129 = (i128 + 1) - 1;
                this.f9960k = i129;
                iArr57[i129 - 1] = iArr57[i129 - 1] / iArr57[i129];
                return 0;
            case 78:
                int[] iArr58 = this.f9962m;
                int i130 = this.f9960k;
                iArr58[i130] = 119;
                int i131 = (i130 + 1) - 1;
                this.f9960k = i131;
                iArr58[i131 - 1] = iArr58[i131 - 1] + iArr58[i131];
                return 0;
            case 79:
                int[] iArr59 = this.f9962m;
                int i132 = this.f9960k;
                this.f9960k = i132 + 1;
                iArr59[i132] = 1;
                return 0;
            case 80:
                int[] iArr60 = this.f9962m;
                int i133 = this.f9960k;
                iArr60[i133] = 128;
                int i134 = (i133 + 1) - 1;
                this.f9960k = i134;
                iArr60[i134 - 1] = iArr60[i134 - 1] % iArr60[i134];
                return 0;
            case 81:
                int[] iArr61 = this.f9962m;
                int i135 = this.f9960k;
                this.f9960k = i135 + 1;
                iArr61[i135] = 90;
                return 0;
            case 82:
                int[] iArr62 = this.f9962m;
                int i136 = this.f9960k;
                this.f9960k = i136 + 1;
                iArr62[i136] = 9;
                return 0;
            case 83:
                int[] iArr63 = this.f9962m;
                int i137 = this.f9960k;
                int i138 = i137 + 1;
                iArr63[i137] = iArr63[i138 - 2];
                int i139 = i138 - 1;
                iArr63[11] = iArr63[i139];
                Object[] objArr12 = this.f9966t;
                this.f9960k = i139 + 1;
                objArr12[i139] = objArr12[10];
                return 0;
            case 84:
                int i140 = this.f9960k - 2;
                this.f9960k = i140;
                int[] iArr64 = this.f9962m;
                this.f9950a = iArr64[i140] != iArr64[i140 + 1] ? 1 : 0;
                return 0;
            case 85:
                int[] iArr65 = this.f9962m;
                int i141 = this.f9960k;
                int i142 = i141 + 1;
                iArr65[i141] = iArr65[11];
                Object[] objArr13 = this.f9966t;
                this.f9960k = i142 + 1;
                objArr13[i142] = objArr13[10];
                return 0;
            case 86:
                Object[] objArr14 = this.f9966t;
                int i143 = this.f9960k;
                int i144 = i143 + 1;
                objArr14[i143] = objArr14[10];
                int[] iArr66 = this.f9962m;
                this.f9960k = i144 + 1;
                iArr66[i144] = iArr66[11];
                return 0;
            case 87:
                int[] iArr67 = this.f9962m;
                int i145 = this.f9960k;
                int i146 = i145 + 1;
                iArr67[i145] = iArr67[11];
                Object[] objArr15 = this.f9966t;
                int i147 = i146 + 1;
                objArr15[i146] = objArr15[10];
                this.f9960k = i147 + 1;
                iArr67[i147] = iArr67[11];
                return 0;
            case 88:
                int i148 = this.f9960k - 1;
                this.f9960k = i148;
                int[] iArr68 = this.f9962m;
                iArr68[i148 - 1] = iArr68[i148 - 1] % iArr68[i148];
                int i149 = i148 - 1;
                this.f9960k = i149;
                this.f9966t[i149] = null;
                return 0;
            case 89:
                int[] iArr69 = this.f9962m;
                int i150 = this.f9960k;
                iArr69[i150] = 49;
                int i151 = (i150 + 1) - 1;
                iArr69[i151 - 1] = iArr69[i151 - 1] + iArr69[i151];
                int i152 = i151 + 1;
                this.f9960k = i152;
                iArr69[i151] = iArr69[i152 - 2];
                return 0;
            case 90:
                int[] iArr70 = this.f9962m;
                int i153 = this.f9960k;
                this.f9960k = i153 + 1;
                iArr70[i153] = 115;
                return 0;
            case 91:
                int i154 = this.f9960k - 1;
                int[] iArr71 = this.f9962m;
                iArr71[i154 - 1] = iArr71[i154 - 1] + iArr71[i154];
                int i155 = i154 + 1;
                this.f9960k = i155;
                iArr71[i154] = iArr71[i155 - 2];
                return 0;
            case 92:
                int[] iArr72 = this.f9962m;
                int i156 = this.f9960k;
                iArr72[i156] = 3;
                int i157 = (i156 + 1) - 1;
                iArr72[i157 - 1] = iArr72[i157 - 1] + iArr72[i157];
                int i158 = i157 + 1;
                this.f9960k = i158;
                iArr72[i157] = iArr72[i158 - 2];
                return 0;
            case 93:
                int[] iArr73 = this.f9962m;
                int i159 = this.f9960k;
                this.f9960k = i159 + 1;
                iArr73[i159] = 117;
                return 0;
            case 94:
                int[] iArr74 = this.f9962m;
                int i160 = this.f9960k;
                this.f9960k = i160 + 1;
                iArr74[i160] = 97;
                return 0;
            case 95:
                int[] iArr75 = this.f9962m;
                int i161 = this.f9960k;
                this.f9960k = i161 + 1;
                iArr75[i161] = 67;
                return 0;
            case 96:
                Object[] objArr16 = this.f9966t;
                int i162 = this.f9960k;
                int i163 = i162 + 1;
                objArr16[i162] = objArr16[10];
                int[] iArr76 = this.f9962m;
                this.f9960k = i163 + 1;
                iArr76[i163] = 0;
                return 0;
            case 97:
                int[] iArr77 = this.f9962m;
                int i164 = this.f9960k;
                this.f9960k = i164 + 1;
                iArr77[i164] = 11;
                return 0;
            case 98:
                int i165 = this.f9960k - 1;
                int[] iArr78 = this.f9962m;
                iArr78[i165 - 1] = iArr78[i165 - 1] + iArr78[i165];
                int i166 = i165 + 1;
                iArr78[i165] = iArr78[i166 - 2];
                this.f9960k = i166 + 1;
                iArr78[i166] = 128;
                return 0;
            case 99:
                int[] iArr79 = this.f9962m;
                int i167 = this.f9960k;
                int i168 = i167 + 1;
                iArr79[i167] = 22;
                iArr79[i168] = 0;
                int i169 = (i168 + 1) - 1;
                this.f9960k = i169;
                iArr79[i169 - 1] = iArr79[i169 - 1] / iArr79[i169];
                return 0;
            case 100:
                int[] iArr80 = this.f9962m;
                int i170 = this.f9960k;
                iArr80[i170] = 51;
                int i171 = (i170 + 1) - 1;
                iArr80[i171 - 1] = iArr80[i171 - 1] + iArr80[i171];
                int i172 = i171 + 1;
                this.f9960k = i172;
                iArr80[i171] = iArr80[i172 - 2];
                return 0;
            case 101:
                int[] iArr81 = this.f9962m;
                int i173 = this.f9960k;
                this.f9960k = i173 + 1;
                iArr81[i173] = 84;
                return 0;
            case 102:
                int[] iArr82 = this.f9962m;
                int i174 = this.f9960k;
                this.f9960k = i174 + 1;
                iArr82[i174] = 89;
                return 0;
            case 103:
                int i175 = this.f9960k - 1;
                Object[] objArr17 = this.f9966t;
                Object obj5 = objArr17[i175];
                objArr17[i175] = null;
                objArr17[12] = obj5;
                int i176 = i175 + 1;
                objArr17[i175] = objArr17[10];
                int[] iArr83 = this.f9962m;
                this.f9960k = i176 + 1;
                iArr83[i176] = iArr83[11];
                return 0;
            case 104:
                int[] iArr84 = this.f9962m;
                int i177 = this.f9960k;
                this.f9960k = i177 + 1;
                iArr84[i177] = 95;
                return 0;
            case 105:
                int[] iArr85 = this.f9962m;
                int i178 = this.f9960k;
                int i179 = i178 + 1;
                iArr85[i178] = 0;
                int i180 = i179 + 1;
                iArr85[i179] = 0;
                this.f9960k = i180 + 1;
                iArr85[i180] = 0;
                return 0;
            case 106:
                int[] iArr86 = this.f9962m;
                int i181 = this.f9960k;
                this.f9960k = i181 + 1;
                iArr86[i181] = 3;
                return 0;
            case 107:
                int[] iArr87 = this.f9962m;
                int i182 = this.f9960k;
                iArr87[i182] = 3;
                int i183 = (i182 + 1) - 1;
                iArr87[i183 - 1] = iArr87[i183 - 1] * iArr87[i183];
                int i184 = i183 - 1;
                this.f9960k = i184;
                this.f9966t[i184] = null;
                return 0;
            case 108:
                int[] iArr88 = this.f9962m;
                int i185 = this.f9960k;
                this.f9960k = i185 + 1;
                iArr88[i185] = 63;
                return 0;
            case 109:
                int[] iArr89 = this.f9962m;
                int i186 = this.f9960k;
                this.f9960k = i186 + 1;
                iArr89[i186] = 17;
                return 0;
            case 110:
                int[] iArr90 = this.f9962m;
                int i187 = this.f9960k;
                this.f9960k = i187 + 1;
                iArr90[i187] = 50;
                return 0;
            case 111:
                int[] iArr91 = this.f9962m;
                int i188 = this.f9960k;
                iArr91[i188] = 73;
                int i189 = (i188 + 1) - 1;
                iArr91[i189 - 1] = iArr91[i189 - 1] + iArr91[i189];
                int i190 = i189 + 1;
                this.f9960k = i190;
                iArr91[i189] = iArr91[i190 - 2];
                return 0;
            case 112:
                Object[] objArr18 = this.f9966t;
                int i191 = this.f9960k;
                this.f9960k = i191 + 1;
                objArr18[i191] = null;
                return 0;
            case 113:
                int[] iArr92 = this.f9962m;
                int i192 = this.f9960k;
                this.f9960k = i192 + 1;
                iArr92[i192] = 73;
                return 0;
            case 114:
                int[] iArr93 = this.f9962m;
                int i193 = this.f9960k;
                this.f9960k = i193 + 1;
                iArr93[i193] = 49;
                return 0;
            case 115:
                int[] iArr94 = this.f9962m;
                int i194 = this.f9960k;
                iArr94[i194] = 61;
                int i195 = (i194 + 1) - 1;
                this.f9960k = i195;
                iArr94[i195 - 1] = iArr94[i195 - 1] + iArr94[i195];
                return 0;
            default:
                return i;
        }
        return 0;
    }

    public C2948dk(Object obj, int i) {
        int[] iArr = new int[15];
        this.f9962m = iArr;
        this.f9963n = new long[15];
        this.f9961l = new float[15];
        this.f9965q = new double[15];
        Object[] objArr = new Object[15];
        this.f9966t = objArr;
        objArr[10] = obj;
        iArr[11] = i;
        this.f9960k = 0;
        this.f9964o = -1;
    }
}
