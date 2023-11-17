package com.facetec.sdk;

import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: com.facetec.sdk.do */
public class C2958do {

    /* renamed from: a */
    public long f10017a;

    /* renamed from: b */
    public int f10018b;

    /* renamed from: c */
    public long f10019c;

    /* renamed from: d */
    public int f10020d;

    /* renamed from: e */
    public float f10021e;

    /* renamed from: f */
    public Object f10022f;

    /* renamed from: g */
    public double f10023g;

    /* renamed from: h */
    public float f10024h;

    /* renamed from: i */
    public double f10025i;

    /* renamed from: j */
    public Object f10026j;

    /* renamed from: k */
    private final long[] f10027k;

    /* renamed from: l */
    private int f10028l;

    /* renamed from: m */
    private final int[] f10029m;

    /* renamed from: n */
    private int f10030n;

    /* renamed from: o */
    private final float[] f10031o;

    /* renamed from: q */
    private final double[] f10032q;

    /* renamed from: s */
    private final Object[] f10033s;

    public C2958do() {
        this.f10029m = new int[17];
        this.f10027k = new long[17];
        this.f10031o = new float[17];
        this.f10032q = new double[17];
        this.f10033s = new Object[17];
        this.f10030n = 0;
        this.f10028l = -1;
    }

    /* renamed from: d */
    public int mo9125d(int i) {
        switch (i) {
            case 1:
                int[] iArr = this.f10029m;
                int i2 = this.f10030n;
                this.f10030n = i2 + 1;
                iArr[i2] = this.f10018b;
                return 0;
            case 2:
                int[] iArr2 = this.f10029m;
                int i3 = this.f10030n;
                int i4 = i3 + 1;
                iArr2[i3] = 2;
                this.f10030n = i4 + 1;
                iArr2[i4] = 2;
                return 0;
            case 3:
                int i5 = this.f10030n - 1;
                this.f10030n = i5;
                int[] iArr3 = this.f10029m;
                iArr3[i5 - 1] = iArr3[i5 - 1] % iArr3[i5];
                int i6 = i5 - 1;
                this.f10030n = i6;
                this.f10033s[i6] = null;
                return 0;
            case 4:
                this.f10020d = this.f10029m[this.f10030n - 1];
                return 0;
            case 5:
                break;
            case 6:
                int[] iArr4 = this.f10029m;
                int i7 = this.f10030n;
                this.f10030n = i7 + 1;
                iArr4[i7] = 75;
                break;
            case 7:
                int i8 = this.f10030n - 1;
                int[] iArr5 = this.f10029m;
                iArr5[i8 - 1] = iArr5[i8 - 1] + iArr5[i8];
                int i9 = i8 + 1;
                iArr5[i8] = iArr5[i9 - 2];
                this.f10030n = i9 + 1;
                iArr5[i9] = 128;
                return 0;
            case 8:
                int i12 = this.f10030n - this.f10018b;
                this.f10030n = i12;
                this.f10028l = i12;
                return 0;
            case 9:
                int[] iArr6 = this.f10029m;
                int i13 = this.f10028l;
                this.f10028l = i13 + 1;
                this.f10020d = iArr6[i13];
                return 0;
            case 10:
                int i14 = this.f10030n - 1;
                this.f10030n = i14;
                int[] iArr7 = this.f10029m;
                iArr7[i14 - 1] = iArr7[i14 - 1] % iArr7[i14];
                return 0;
            case 11:
                int[] iArr8 = this.f10029m;
                int i15 = this.f10030n;
                this.f10030n = i15 + 1;
                iArr8[i15] = 2;
                return 0;
            case 12:
                int i16 = this.f10030n - 1;
                this.f10030n = i16;
                this.f10020d = this.f10029m[i16] != 0 ? 1 : 0;
                return 0;
            case 13:
                int[] iArr9 = this.f10029m;
                int i17 = this.f10030n;
                iArr9[i17] = 41;
                int i18 = (i17 + 1) - 1;
                this.f10030n = i18;
                iArr9[i18 - 1] = iArr9[i18 - 1] + iArr9[i18];
                return 0;
            case 14:
                int[] iArr10 = this.f10029m;
                int i19 = this.f10030n;
                int i22 = i19 + 1;
                iArr10[i19] = iArr10[i22 - 2];
                this.f10030n = i22 + 1;
                iArr10[i22] = 128;
                return 0;
            case 15:
                int i23 = this.f10030n - 1;
                this.f10030n = i23;
                this.f10020d = this.f10029m[i23] == 0 ? 1 : 0;
                return 0;
            case 16:
                Object[] objArr = this.f10033s;
                int i24 = this.f10030n;
                Object obj = objArr[i24 - 1];
                objArr[i24 - 1] = null;
                this.f10026j = obj;
                return 0;
            case 17:
                int[] iArr11 = this.f10029m;
                int i25 = this.f10030n;
                this.f10030n = i25 + 1;
                iArr11[i25] = 2;
                return 0;
            case 18:
                int[] iArr12 = this.f10029m;
                int i26 = this.f10030n;
                iArr12[i26] = 0;
                int i27 = (i26 + 1) - 1;
                this.f10030n = i27;
                iArr12[i27 - 1] = iArr12[i27 - 1] / iArr12[i27];
                return 0;
            case 19:
                int i28 = this.f10030n - 1;
                this.f10030n = i28;
                this.f10033s[i28] = null;
                return 0;
            case 20:
                int[] iArr13 = this.f10029m;
                int i29 = this.f10030n - 1;
                this.f10030n = i29;
                this.f10020d = iArr13[i29];
                return 0;
            case 21:
                int[] iArr14 = this.f10029m;
                int i32 = this.f10030n;
                this.f10030n = i32 + 1;
                iArr14[i32] = 1;
                return 0;
            case 22:
                int[] iArr15 = this.f10029m;
                int i33 = this.f10030n;
                this.f10030n = i33 + 1;
                iArr15[i33] = 0;
                return 0;
            case 23:
                for (int i34 = this.f10030n - 1; i34 >= 0; i34--) {
                    this.f10033s[i34] = null;
                }
                Object[] objArr2 = this.f10033s;
                this.f10030n = 0 + 1;
                objArr2[0] = this.f10022f;
                return 0;
            case 24:
                Object[] objArr3 = this.f10033s;
                int i35 = this.f10030n;
                this.f10030n = i35 + 1;
                objArr3[i35] = this.f10022f;
                return 0;
            case 25:
                int[] iArr16 = this.f10029m;
                int i36 = this.f10030n;
                this.f10030n = i36 + 1;
                iArr16[i36] = 37;
                return 0;
            case 26:
                int[] iArr17 = this.f10029m;
                int i37 = this.f10030n;
                this.f10030n = i37 + 1;
                iArr17[i37] = 48;
                return 0;
            case 27:
                Object[] objArr4 = this.f10033s;
                int i38 = this.f10028l;
                this.f10028l = i38 + 1;
                Object obj2 = objArr4[i38];
                objArr4[i38] = null;
                this.f10026j = obj2;
                return 0;
            case 28:
                int i39 = this.f10030n - 1;
                this.f10030n = i39;
                int[] iArr18 = this.f10029m;
                iArr18[i39 - 1] = iArr18[i39 - 1] - iArr18[i39];
                return 0;
            case 29:
                int[] iArr19 = this.f10029m;
                int i42 = this.f10030n;
                this.f10030n = i42 + 1;
                iArr19[i42] = 19;
                return 0;
            case 30:
                int i43 = this.f10030n - 1;
                int[] iArr20 = this.f10029m;
                iArr20[i43 - 1] = iArr20[i43 - 1] + iArr20[i43];
                int i44 = i43 + 1;
                this.f10030n = i44;
                iArr20[i43] = iArr20[i44 - 2];
                return 0;
            case 31:
                int[] iArr21 = this.f10029m;
                int i45 = this.f10030n;
                iArr21[i45] = 128;
                int i46 = (i45 + 1) - 1;
                this.f10030n = i46;
                iArr21[i46 - 1] = iArr21[i46 - 1] % iArr21[i46];
                return 0;
            case 32:
                Object[] objArr5 = this.f10033s;
                int i47 = this.f10030n;
                this.f10030n = i47 + 1;
                objArr5[i47] = null;
                return 0;
            case 33:
                int[] iArr22 = this.f10029m;
                int i48 = this.f10030n;
                iArr22[i48] = 105;
                int i49 = (i48 + 1) - 1;
                iArr22[i49 - 1] = iArr22[i49 - 1] + iArr22[i49];
                int i52 = i49 + 1;
                this.f10030n = i52;
                iArr22[i49] = iArr22[i52 - 2];
                return 0;
            case 34:
                int[] iArr23 = this.f10029m;
                int i53 = this.f10030n;
                this.f10030n = i53 + 1;
                iArr23[i53] = 128;
                return 0;
            case 35:
                int[] iArr24 = this.f10029m;
                int i54 = this.f10030n;
                iArr24[i54] = 2;
                int i55 = (i54 + 1) - 1;
                this.f10030n = i55;
                iArr24[i55 - 1] = iArr24[i55 - 1] % iArr24[i55];
                return 0;
            case 36:
                int[] iArr25 = this.f10029m;
                int i56 = this.f10030n;
                this.f10030n = i56 + 1;
                iArr25[i56] = 56;
                return 0;
            case 37:
                int[] iArr26 = this.f10029m;
                int i57 = this.f10030n;
                this.f10030n = i57 + 1;
                iArr26[i57] = 11;
                return 0;
            case 38:
                int i58 = this.f10030n - 1;
                this.f10030n = i58;
                int[] iArr27 = this.f10029m;
                iArr27[i58 - 1] = iArr27[i58 - 1] / iArr27[i58];
                return 0;
            case 39:
                int[] iArr28 = this.f10029m;
                int i59 = this.f10030n;
                this.f10030n = i59 + 1;
                iArr28[i59] = 91;
                return 0;
            case 40:
                int[] iArr29 = this.f10029m;
                int i62 = this.f10030n;
                this.f10030n = i62 + 1;
                iArr29[i62] = 44;
                return 0;
            case 41:
                int[] iArr30 = this.f10029m;
                int i63 = this.f10030n;
                iArr30[i63] = 2;
                int i64 = (i63 + 1) - 1;
                this.f10030n = i64;
                iArr30[i64 - 1] = iArr30[i64 - 1] % iArr30[i64];
                int i65 = i64 - 1;
                this.f10030n = i65;
                this.f10033s[i65] = null;
                return 0;
            case 42:
                int[] iArr31 = this.f10029m;
                int i66 = this.f10030n;
                this.f10030n = i66 + 1;
                iArr31[i66] = 45;
                return 0;
            case 43:
                int[] iArr32 = this.f10029m;
                int i67 = this.f10030n;
                this.f10030n = i67 + 1;
                iArr32[i67] = 47;
                return 0;
            case 44:
                int[] iArr33 = this.f10029m;
                int i68 = this.f10030n;
                iArr33[i68] = 0;
                int i69 = (i68 + 1) - 1;
                this.f10030n = i69;
                iArr33[i69 - 1] = iArr33[i69 - 1] / iArr33[i69];
                int i72 = i69 - 1;
                this.f10030n = i72;
                this.f10033s[i72] = null;
                return 0;
            case 45:
                int[] iArr34 = this.f10029m;
                int i73 = this.f10030n;
                this.f10030n = i73 + 1;
                iArr34[i73] = 24;
                return 0;
            case 46:
                int[] iArr35 = this.f10029m;
                int i74 = this.f10030n;
                this.f10030n = i74 + 1;
                iArr35[i74] = 82;
                return 0;
            case 47:
                int i75 = this.f10030n - 2;
                this.f10030n = i75;
                Object[] objArr6 = this.f10033s;
                Object obj3 = objArr6[i75];
                objArr6[i75] = null;
                Object obj4 = objArr6[i75 + 1];
                objArr6[i75 + 1] = null;
                this.f10020d = obj3 == obj4 ? 1 : 0;
                return 0;
            case 48:
                int[] iArr36 = this.f10029m;
                int i76 = this.f10030n;
                this.f10030n = i76 + 1;
                iArr36[i76] = -1;
                return 0;
            case 49:
                int[] iArr37 = this.f10029m;
                int i77 = this.f10030n;
                this.f10030n = i77 + 1;
                iArr37[i77] = 640;
                return 0;
            case 50:
                int[] iArr38 = this.f10029m;
                int i78 = this.f10030n;
                this.f10030n = i78 + 1;
                iArr38[i78] = 39;
                return 0;
            case 51:
                int i79 = this.f10030n - 1;
                this.f10030n = i79;
                int[] iArr39 = this.f10029m;
                iArr39[i79 - 1] = iArr39[i79 - 1] + iArr39[i79];
                return 0;
            case 52:
                int[] iArr40 = this.f10029m;
                int i82 = this.f10030n;
                int i83 = i82 + 1;
                iArr40[i82] = iArr40[i83 - 2];
                iArr40[i83] = 128;
                int i84 = (i83 + 1) - 1;
                this.f10030n = i84;
                iArr40[i84 - 1] = iArr40[i84 - 1] % iArr40[i84];
                return 0;
            case 53:
                int[] iArr41 = this.f10029m;
                int i85 = this.f10030n;
                iArr41[i85] = 15;
                int i86 = (i85 + 1) - 1;
                this.f10030n = i86;
                iArr41[i86 - 1] = iArr41[i86 - 1] + iArr41[i86];
                return 0;
            case 54:
                int[] iArr42 = this.f10029m;
                int i87 = this.f10030n;
                iArr42[i87] = 95;
                int i88 = (i87 + 1) - 1;
                this.f10030n = i88;
                iArr42[i88 - 1] = iArr42[i88 - 1] + iArr42[i88];
                return 0;
            case 55:
                int[] iArr43 = this.f10029m;
                int i89 = this.f10030n;
                int i92 = i89 + 1;
                this.f10030n = i92;
                iArr43[i89] = iArr43[i92 - 2];
                return 0;
            case 56:
                int[] iArr44 = this.f10029m;
                int i93 = this.f10030n;
                this.f10030n = i93 + 1;
                iArr44[i93] = 69;
                return 0;
            case 57:
                int[] iArr45 = this.f10029m;
                int i94 = this.f10030n;
                iArr45[i94] = 5;
                int i95 = (i94 + 1) - 1;
                iArr45[i95 - 1] = iArr45[i95 - 1] + iArr45[i95];
                int i96 = i95 + 1;
                this.f10030n = i96;
                iArr45[i95] = iArr45[i96 - 2];
                return 0;
            case 58:
                int[] iArr46 = this.f10029m;
                int i97 = this.f10030n;
                this.f10030n = i97 + 1;
                iArr46[i97] = 99;
                return 0;
            case 59:
                int[] iArr47 = this.f10029m;
                int i98 = this.f10030n;
                this.f10030n = i98 + 1;
                iArr47[i98] = 0;
                return 0;
            case 60:
                int i99 = this.f10030n - 1;
                this.f10030n = i99;
                int[] iArr48 = this.f10029m;
                iArr48[i99 - 1] = iArr48[i99 - 1] / iArr48[i99];
                int i100 = i99 - 1;
                this.f10030n = i100;
                this.f10033s[i100] = null;
                return 0;
            case 61:
                int[] iArr49 = this.f10029m;
                int i101 = this.f10030n;
                this.f10030n = i101 + 1;
                iArr49[i101] = 34;
                return 0;
            case 62:
                int[] iArr50 = this.f10029m;
                int i102 = this.f10030n;
                this.f10030n = i102 + 1;
                iArr50[i102] = 5;
                return 0;
            case 63:
                Object[] objArr7 = this.f10033s;
                int i103 = this.f10030n;
                this.f10030n = i103 + 1;
                objArr7[i103] = objArr7[10];
                return 0;
            case 64:
                int[] iArr51 = this.f10029m;
                int i104 = this.f10030n;
                this.f10030n = i104 + 1;
                iArr51[i104] = 66;
                return 0;
            case 65:
                int[] iArr52 = this.f10029m;
                int i105 = this.f10030n;
                int i106 = i105 + 1;
                iArr52[i105] = 48;
                this.f10030n = i106 + 1;
                iArr52[i106] = 0;
                return 0;
            case 66:
                int[] iArr53 = this.f10029m;
                int i107 = this.f10030n;
                this.f10030n = i107 + 1;
                iArr53[i107] = -8;
                return 0;
            case 67:
                int[] iArr54 = this.f10029m;
                int i108 = this.f10030n;
                this.f10030n = i108 + 1;
                iArr54[i108] = 111;
                return 0;
            case 68:
                int[] iArr55 = this.f10029m;
                int i109 = this.f10030n;
                iArr55[i109] = 93;
                int i110 = (i109 + 1) - 1;
                this.f10030n = i110;
                iArr55[i110 - 1] = iArr55[i110 - 1] + iArr55[i110];
                return 0;
            case 69:
                int i111 = this.f10030n - 1;
                this.f10030n = i111;
                int[] iArr56 = this.f10029m;
                iArr56[10] = iArr56[i111];
                return 0;
            case 70:
                int[] iArr57 = this.f10029m;
                int i112 = this.f10030n;
                this.f10030n = i112 + 1;
                iArr57[i112] = 6;
                return 0;
            case 71:
                int[] iArr58 = this.f10029m;
                int i113 = this.f10030n;
                this.f10030n = i113 + 1;
                iArr58[i113] = iArr58[10];
                return 0;
            case 72:
                int[] iArr59 = this.f10029m;
                int i114 = this.f10030n;
                int i115 = i114 + 1;
                iArr59[i114] = 2;
                iArr59[i115] = 2;
                int i116 = (i115 + 1) - 1;
                this.f10030n = i116;
                iArr59[i116 - 1] = iArr59[i116 - 1] % iArr59[i116];
                return 0;
            case 73:
                int[] iArr60 = this.f10029m;
                int i117 = this.f10030n;
                iArr60[i117] = 13;
                int i118 = (i117 + 1) - 1;
                iArr60[i118 - 1] = iArr60[i118 - 1] + iArr60[i118];
                int i119 = i118 + 1;
                this.f10030n = i119;
                iArr60[i118] = iArr60[i119 - 2];
                return 0;
            case 74:
                Object[] objArr8 = this.f10033s;
                int i120 = this.f10030n;
                int i121 = i120 + 1;
                this.f10030n = i121;
                objArr8[i120] = null;
                Object obj5 = objArr8[i121 - 1];
                objArr8[i121 - 1] = null;
                this.f10029m[i121 - 1] = ((int[]) obj5).length;
                return 0;
            case 75:
                int[] iArr61 = this.f10029m;
                int i122 = this.f10030n;
                this.f10030n = i122 + 1;
                iArr61[i122] = 61;
                return 0;
            case 76:
                int[] iArr62 = this.f10029m;
                int i123 = this.f10030n;
                int i124 = i123 + 1;
                iArr62[i123] = 4;
                this.f10030n = i124 + 1;
                iArr62[i124] = 4;
                return 0;
            case 77:
                int i125 = this.f10030n - 1;
                int[] iArr63 = this.f10029m;
                iArr63[i125 - 1] = iArr63[i125 - 1] >>> iArr63[i125];
                int i126 = i125 - 1;
                this.f10030n = i126;
                this.f10033s[i126] = null;
                return 0;
            case 78:
                int[] iArr64 = this.f10029m;
                int i127 = this.f10030n;
                this.f10030n = i127 + 1;
                iArr64[i127] = 85;
                return 0;
            case 79:
                int[] iArr65 = this.f10029m;
                int i128 = this.f10030n;
                this.f10030n = i128 + 1;
                iArr65[i128] = 50;
                return 0;
            case 80:
                int[] iArr66 = this.f10029m;
                int i129 = this.f10030n;
                iArr66[i129] = 35;
                int i130 = (i129 + 1) - 1;
                iArr66[i130 - 1] = iArr66[i130 - 1] + iArr66[i130];
                int i131 = i130 + 1;
                this.f10030n = i131;
                iArr66[i130] = iArr66[i131 - 2];
                return 0;
            case 81:
                int[] iArr67 = this.f10029m;
                int i132 = this.f10030n;
                Object[] objArr9 = this.f10033s;
                Object obj6 = objArr9[i132 - 1];
                objArr9[i132 - 1] = null;
                iArr67[i132 - 1] = ((int[]) obj6).length;
                int i133 = i132 - 1;
                this.f10030n = i133;
                objArr9[i133] = null;
                return 0;
            case 82:
                int[] iArr68 = this.f10029m;
                int i134 = this.f10030n;
                this.f10030n = i134 + 1;
                iArr68[i134] = 25;
                return 0;
            case 83:
                int i135 = this.f10030n - 1;
                this.f10030n = i135;
                Object[] objArr10 = this.f10033s;
                Object obj7 = objArr10[i135];
                objArr10[i135] = null;
                objArr10[10] = obj7;
                return 0;
            case 84:
                long[] jArr = this.f10027k;
                int i136 = this.f10030n;
                this.f10030n = i136 + 1;
                jArr[i136] = this.f10017a;
                return 0;
            case 85:
                int[] iArr69 = this.f10029m;
                int i137 = this.f10030n;
                this.f10030n = i137 + 1;
                iArr69[i137] = 30;
                return 0;
            case 86:
                long[] jArr2 = this.f10027k;
                int i138 = this.f10030n;
                this.f10030n = i138 + 1;
                jArr2[i138] = 0;
                return 0;
            case 87:
                int i139 = this.f10030n - 1;
                int[] iArr70 = this.f10029m;
                long[] jArr3 = this.f10027k;
                iArr70[i139 - 1] = (jArr3[i139 - 1] > jArr3[i139] ? 1 : (jArr3[i139 - 1] == jArr3[i139] ? 0 : -1));
                int i140 = i139 - 1;
                this.f10030n = i140;
                iArr70[i140 - 1] = iArr70[i140 - 1] + iArr70[i140];
                return 0;
            case 88:
                int[] iArr71 = this.f10029m;
                int i141 = this.f10030n;
                iArr71[i141] = 55;
                int i142 = (i141 + 1) - 1;
                this.f10030n = i142;
                iArr71[i142 - 1] = iArr71[i142 - 1] + iArr71[i142];
                return 0;
            case 89:
                int[] iArr72 = this.f10029m;
                int i143 = this.f10030n;
                iArr72[i143] = 109;
                int i144 = (i143 + 1) - 1;
                this.f10030n = i144;
                iArr72[i144 - 1] = iArr72[i144 - 1] + iArr72[i144];
                return 0;
            case 90:
                long[] jArr4 = this.f10027k;
                int i145 = this.f10030n;
                int i146 = i145 + 1;
                this.f10030n = i146;
                jArr4[i145] = jArr4[i146 - 2];
                return 0;
            case 91:
                int i147 = this.f10030n - 1;
                this.f10030n = i147;
                long[] jArr5 = this.f10027k;
                jArr5[15] = jArr5[i147];
                return 0;
            case 92:
                int i148 = this.f10030n - 1;
                this.f10030n = i148;
                long[] jArr6 = this.f10027k;
                this.f10029m[i148 - 1] = (jArr6[i148 - 1] > jArr6[i148] ? 1 : (jArr6[i148 - 1] == jArr6[i148] ? 0 : -1));
                return 0;
            case 93:
                long[] jArr7 = this.f10027k;
                int i149 = this.f10030n;
                this.f10030n = i149 + 1;
                jArr7[i149] = jArr7[15];
                return 0;
            case 94:
                int i150 = this.f10030n - 1;
                long[] jArr8 = this.f10027k;
                jArr8[i150 - 1] = jArr8[i150 - 1] + jArr8[i150];
                int[] iArr73 = this.f10029m;
                this.f10030n = i150 + 1;
                iArr73[i150] = 21;
                return 0;
            case 95:
                long[] jArr9 = this.f10027k;
                int i151 = this.f10030n;
                jArr9[i151] = 0;
                int i152 = (i151 + 1) - 1;
                int[] iArr74 = this.f10029m;
                iArr74[i152 - 1] = (jArr9[i152 - 1] > jArr9[i152] ? 1 : (jArr9[i152 - 1] == jArr9[i152] ? 0 : -1));
                int i153 = i152 - 1;
                this.f10030n = i153;
                iArr74[i153 - 1] = iArr74[i153 - 1] + iArr74[i153];
                return 0;
            case 96:
                int[] iArr75 = this.f10029m;
                int i154 = this.f10030n;
                this.f10030n = i154 + 1;
                iArr75[i154] = 21;
                return 0;
            case 97:
                int[] iArr76 = this.f10029m;
                int i155 = this.f10030n;
                this.f10030n = i155 + 1;
                iArr76[i155] = 42;
                return 0;
            case 98:
                int i156 = this.f10030n - 1;
                this.f10030n = i156;
                int[] iArr77 = this.f10029m;
                iArr77[i156 - 1] = iArr77[i156 - 1] - iArr77[i156];
                iArr77[i156 - 1] = (byte) iArr77[i156 - 1];
                return 0;
            case 99:
                int[] iArr78 = this.f10029m;
                int i157 = this.f10030n;
                this.f10030n = i157 + 1;
                iArr78[i157] = 15;
                return 0;
            case 100:
                int[] iArr79 = this.f10029m;
                int i158 = this.f10030n;
                this.f10030n = i158 + 1;
                iArr79[i158] = 16;
                return 0;
            case 101:
                int i159 = this.f10030n - 1;
                this.f10030n = i159;
                int[] iArr80 = this.f10029m;
                iArr80[i159 - 1] = iArr80[i159 - 1] >> iArr80[i159];
                return 0;
            case 102:
                int[] iArr81 = this.f10029m;
                int i160 = this.f10030n;
                int i161 = i160 + 1;
                iArr81[i160] = 56;
                float[] fArr = this.f10031o;
                this.f10030n = i161 + 1;
                fArr[i161] = 0.0f;
                return 0;
            case 103:
                float[] fArr2 = this.f10031o;
                int i162 = this.f10028l;
                this.f10028l = i162 + 1;
                this.f10024h = fArr2[i162];
                return 0;
            case 104:
                float[] fArr3 = this.f10031o;
                int i163 = this.f10030n;
                this.f10030n = i163 + 1;
                fArr3[i163] = this.f10021e;
                return 0;
            case 105:
                float[] fArr4 = this.f10031o;
                int i164 = this.f10030n;
                this.f10030n = i164 + 1;
                fArr4[i164] = 0.0f;
                return 0;
            case 106:
                float[] fArr5 = this.f10031o;
                int i165 = this.f10030n;
                fArr5[i165] = 0.0f;
                int i166 = (i165 + 1) - 1;
                this.f10030n = i166;
                this.f10029m[i166 - 1] = (fArr5[i166 - 1] > fArr5[i166] ? 1 : (fArr5[i166 - 1] == fArr5[i166] ? 0 : -1));
                return 0;
            case 107:
                int[] iArr82 = this.f10029m;
                int i167 = this.f10030n;
                iArr82[i167 - 1] = (byte) iArr82[i167 - 1];
                return 0;
            case 108:
                int[] iArr83 = this.f10029m;
                int i168 = this.f10030n;
                this.f10030n = i168 + 1;
                iArr83[i168] = 52;
                return 0;
            case 109:
                int[] iArr84 = this.f10029m;
                int i169 = this.f10030n;
                this.f10030n = i169 + 1;
                iArr84[i169] = 22;
                return 0;
            case 110:
                Object[] objArr11 = this.f10033s;
                int i170 = this.f10030n;
                int i171 = i170 + 1;
                objArr11[i170] = null;
                int[] iArr85 = this.f10029m;
                this.f10030n = i171 + 1;
                iArr85[i171] = 0;
                return 0;
            case 111:
                int i172 = this.f10030n - 1;
                this.f10030n = i172;
                this.f10020d = this.f10029m[i172] >= 0 ? 1 : 0;
                return 0;
            case 112:
                int[] iArr86 = this.f10029m;
                int i173 = this.f10030n;
                int i174 = i173 + 1;
                iArr86[i173] = 0;
                this.f10030n = i174 + 1;
                iArr86[i174] = 0;
                return 0;
            case 113:
                Object[] objArr12 = this.f10033s;
                int i175 = this.f10030n;
                int i176 = i175 + 1;
                this.f10030n = i176;
                objArr12[i175] = objArr12[i176 - 2];
                return 0;
            case 114:
                int[] iArr87 = this.f10029m;
                int i177 = this.f10030n;
                int i178 = i177 + 1;
                iArr87[i177] = 22;
                int i179 = i178 + 1;
                iArr87[i178] = 0;
                this.f10030n = i179 + 1;
                iArr87[i179] = 0;
                return 0;
            case 115:
                int[] iArr88 = this.f10029m;
                int i180 = this.f10030n;
                this.f10030n = i180 + 1;
                iArr88[i180] = 43;
                return 0;
            case 116:
                int i181 = this.f10030n - 1;
                this.f10030n = i181;
                float[] fArr6 = this.f10031o;
                this.f10029m[i181 - 1] = (fArr6[i181 - 1] > fArr6[i181] ? 1 : (fArr6[i181 - 1] == fArr6[i181] ? 0 : -1));
                return 0;
            case 117:
                int i182 = this.f10030n - 1;
                this.f10030n = i182;
                int[] iArr89 = this.f10029m;
                iArr89[i182 - 1] = iArr89[i182 - 1] + iArr89[i182];
                iArr89[i182 - 1] = (byte) iArr89[i182 - 1];
                return 0;
            case 118:
                double[] dArr = this.f10032q;
                int i183 = this.f10030n;
                this.f10030n = i183 + 1;
                dArr[i183] = this.f10023g;
                return 0;
            case 119:
                int[] iArr90 = this.f10029m;
                int i184 = this.f10030n;
                int i185 = i184 + 1;
                iArr90[i184] = 15;
                this.f10030n = i185 + 1;
                iArr90[i185] = 0;
                return 0;
            case 120:
                double[] dArr2 = this.f10032q;
                int i186 = this.f10030n;
                this.f10030n = i186 + 1;
                dArr2[i186] = 0.0d;
                return 0;
            case 121:
                int i187 = this.f10030n - 1;
                this.f10030n = i187;
                double[] dArr3 = this.f10032q;
                this.f10029m[i187 - 1] = (dArr3[i187 - 1] > dArr3[i187] ? 1 : (dArr3[i187 - 1] == dArr3[i187] ? 0 : -1));
                return 0;
            case 122:
                int[] iArr91 = this.f10029m;
                int i188 = this.f10030n;
                iArr91[i188] = 20;
                int i189 = (i188 + 1) - 1;
                iArr91[i189 - 1] = iArr91[i189 - 1] + iArr91[i189];
                this.f10030n = i189 + 1;
                iArr91[i189] = 6;
                return 0;
            case 123:
                int i190 = this.f10030n - 1;
                int[] iArr92 = this.f10029m;
                iArr92[i190 - 1] = iArr92[i190 - 1] >> iArr92[i190];
                int i191 = i190 - 1;
                this.f10030n = i191;
                iArr92[i191 - 1] = iArr92[i191 - 1] - iArr92[i191];
                return 0;
            case 124:
                int[] iArr93 = this.f10029m;
                int i192 = this.f10030n;
                this.f10030n = i192 + 1;
                iArr93[i192] = 51;
                return 0;
            case 125:
                long[] jArr10 = this.f10027k;
                int i193 = this.f10028l;
                this.f10028l = i193 + 1;
                this.f10019c = jArr10[i193];
                return 0;
            case 126:
                int i194 = this.f10030n - 1;
                this.f10030n = i194;
                Object[] objArr13 = this.f10033s;
                Object[] objArr14 = objArr13[i194 - 1];
                objArr13[i194 - 1] = null;
                objArr13[i194 - 1] = objArr14[this.f10029m[i194]];
                return 0;
            case C11051p3.f31760d /*127*/:
                int[] iArr94 = this.f10029m;
                int i195 = this.f10030n;
                iArr94[i195] = 0;
                int i196 = (i195 + 1) - 1;
                this.f10030n = i196;
                Object[] objArr15 = this.f10033s;
                Object obj8 = objArr15[i196 - 1];
                objArr15[i196 - 1] = null;
                iArr94[i196 - 1] = ((int[]) obj8)[iArr94[i196]];
                return 0;
            case 128:
                int i197 = this.f10030n - 1;
                this.f10030n = i197;
                int[] iArr95 = this.f10029m;
                iArr95[12] = iArr95[i197];
                return 0;
            case 129:
                int[] iArr96 = this.f10029m;
                int i198 = this.f10030n;
                iArr96[i198] = 0;
                int i199 = (i198 + 1) - 1;
                this.f10030n = i199;
                Object[] objArr16 = this.f10033s;
                Object[] objArr17 = objArr16[i199 - 1];
                objArr16[i199 - 1] = null;
                objArr16[i199 - 1] = objArr17[iArr96[i199]];
                return 0;
            case 130:
                int i200 = this.f10030n - 1;
                this.f10030n = i200;
                int[] iArr97 = this.f10029m;
                Object[] objArr18 = this.f10033s;
                Object obj9 = objArr18[i200 - 1];
                objArr18[i200 - 1] = null;
                iArr97[i200 - 1] = ((int[]) obj9)[iArr97[i200]];
                int i201 = i200 + 1;
                this.f10030n = i201;
                iArr97[i200] = iArr97[i201 - 2];
                return 0;
            case 131:
                int i202 = this.f10030n - 2;
                this.f10030n = i202;
                int[] iArr98 = this.f10029m;
                this.f10020d = iArr98[i202] != iArr98[i202 + 1] ? 1 : 0;
                return 0;
            case 132:
                int i203 = this.f10030n - 1;
                int[] iArr99 = this.f10029m;
                iArr99[11] = iArr99[i203];
                this.f10030n = i203 + 1;
                iArr99[i203] = iArr99[12];
                return 0;
            case 133:
                int i204 = this.f10030n - 1;
                this.f10030n = i204;
                Object[] objArr19 = this.f10033s;
                Object obj10 = objArr19[i204];
                objArr19[i204] = null;
                objArr19[12] = obj10;
                return 0;
            case 134:
                int[] iArr100 = this.f10029m;
                int i205 = this.f10030n;
                iArr100[i205] = 2;
                int i206 = (i205 + 1) - 1;
                this.f10030n = i206;
                Object[] objArr20 = this.f10033s;
                Object[] objArr21 = objArr20[i206 - 1];
                objArr20[i206 - 1] = null;
                objArr20[i206 - 1] = objArr21[iArr100[i206]];
                return 0;
            case 135:
                int i207 = this.f10030n - 1;
                Object[] objArr22 = this.f10033s;
                objArr22[i207] = null;
                this.f10030n = i207 + 1;
                objArr22[i207] = objArr22[12];
                return 0;
            case 136:
                Object[] objArr23 = this.f10033s;
                int i208 = this.f10030n;
                int i209 = i208 + 1;
                objArr23[i208] = objArr23[10];
                int[] iArr101 = this.f10029m;
                iArr101[i209] = 3;
                int i210 = (i209 + 1) - 1;
                this.f10030n = i210;
                Object[] objArr24 = objArr23[i210 - 1];
                objArr23[i210 - 1] = null;
                objArr23[i210 - 1] = objArr24[iArr101[i210]];
                return 0;
            case 137:
                Object[] objArr25 = this.f10033s;
                int i211 = this.f10030n;
                int i212 = i211 + 1;
                objArr25[i211] = objArr25[12];
                int i213 = i212 + 1;
                objArr25[i212] = objArr25[10];
                int[] iArr102 = this.f10029m;
                this.f10030n = i213 + 1;
                iArr102[i213] = 4;
                return 0;
            case 138:
                Object[] objArr26 = this.f10033s;
                int i214 = this.f10030n;
                int i215 = i214 + 1;
                objArr26[i214] = objArr26[10];
                int[] iArr103 = this.f10029m;
                this.f10030n = i215 + 1;
                iArr103[i215] = 5;
                return 0;
            case 139:
                Object[] objArr27 = this.f10033s;
                int i216 = this.f10030n;
                int i217 = i216 + 1;
                objArr27[i216] = objArr27[12];
                int i218 = i217 + 1;
                objArr27[i217] = objArr27[10];
                int[] iArr104 = this.f10029m;
                this.f10030n = i218 + 1;
                iArr104[i218] = 6;
                return 0;
            case 140:
                int i219 = this.f10030n - 1;
                Object[] objArr28 = this.f10033s;
                objArr28[i219] = null;
                int i220 = i219 + 1;
                objArr28[i219] = objArr28[12];
                this.f10030n = i220 + 1;
                objArr28[i220] = objArr28[10];
                return 0;
            case 141:
                int[] iArr105 = this.f10029m;
                int i221 = this.f10030n;
                iArr105[i221] = 7;
                int i222 = (i221 + 1) - 1;
                this.f10030n = i222;
                Object[] objArr29 = this.f10033s;
                Object[] objArr30 = objArr29[i222 - 1];
                objArr29[i222 - 1] = null;
                objArr29[i222 - 1] = objArr30[iArr105[i222]];
                return 0;
            case 142:
                Object[] objArr31 = this.f10033s;
                int i223 = this.f10030n;
                int i224 = i223 + 1;
                objArr31[i223] = objArr31[10];
                int[] iArr106 = this.f10029m;
                this.f10030n = i224 + 1;
                iArr106[i224] = 8;
                return 0;
            case 143:
                Object[] objArr32 = this.f10033s;
                int i225 = this.f10030n;
                int i226 = i225 + 1;
                objArr32[i225] = null;
                int[] iArr107 = this.f10029m;
                int i227 = i226 + 1;
                this.f10030n = i227;
                iArr107[i226] = iArr107[11];
                objArr32[i227 - 1] = new int[iArr107[i227 - 1]];
                return 0;
            case 144:
                int i228 = this.f10030n - 1;
                Object[] objArr33 = this.f10033s;
                Object obj11 = objArr33[i228];
                objArr33[i228] = null;
                objArr33[10] = obj11;
                int[] iArr108 = this.f10029m;
                int i229 = i228 + 1;
                iArr108[i228] = iArr108[11];
                this.f10030n = i229 + 1;
                iArr108[i229] = 1;
                return 0;
            case 145:
                int i230 = this.f10030n - 3;
                this.f10030n = i230;
                Object[] objArr34 = this.f10033s;
                Object obj12 = objArr34[i230];
                objArr34[i230] = null;
                int[] iArr109 = this.f10029m;
                ((int[]) obj12)[iArr109[i230 + 1]] = iArr109[i230 + 2];
                return 0;
            case 146:
                int[] iArr110 = this.f10029m;
                int i231 = this.f10030n;
                int i232 = i231 + 1;
                iArr110[i231] = iArr110[11];
                int i233 = i232 + 1;
                iArr110[i232] = iArr110[i233 - 2];
                this.f10030n = i233 + 1;
                iArr110[i233] = 1;
                return 0;
            case 147:
                int i234 = this.f10030n - 1;
                int[] iArr111 = this.f10029m;
                iArr111[i234 - 1] = iArr111[i234 - 1] - iArr111[i234];
                int i235 = i234 - 1;
                iArr111[i235 - 1] = iArr111[i235 - 1] * iArr111[i235];
                this.f10030n = i235 + 1;
                iArr111[i235] = 2;
                return 0;
            case 148:
                int i236 = this.f10030n - 1;
                this.f10030n = i236;
                int[] iArr112 = this.f10029m;
                iArr112[i236 - 1] = iArr112[i236 - 1] % iArr112[i236];
                this.f10030n = i236 + 1;
                iArr112[i236] = 1;
                return 0;
            case 149:
                int i237 = this.f10030n - 1;
                this.f10030n = i237;
                int[] iArr113 = this.f10029m;
                Object[] objArr35 = this.f10033s;
                Object obj13 = objArr35[i237 - 1];
                objArr35[i237 - 1] = null;
                iArr113[i237 - 1] = ((int[]) obj13)[iArr113[i237]];
                this.f10030n = i237 + 1;
                iArr113[i237] = 1;
                return 0;
            case 150:
                int[] iArr114 = this.f10029m;
                int i238 = this.f10030n;
                Object[] objArr36 = this.f10033s;
                Object obj14 = objArr36[i238 - 1];
                objArr36[i238 - 1] = null;
                iArr114[i238 - 1] = ((Object[]) obj14).length;
                return 0;
            case 151:
                int i239 = this.f10030n - 1;
                int[] iArr115 = this.f10029m;
                iArr115[11] = iArr115[i239];
                iArr115[i239] = 0;
                int i240 = (i239 + 1) - 1;
                this.f10030n = i240;
                iArr115[12] = iArr115[i240];
                return 0;
            case 152:
                int[] iArr116 = this.f10029m;
                int i241 = this.f10030n;
                int i242 = i241 + 1;
                iArr116[i241] = iArr116[12];
                this.f10030n = i242 + 1;
                iArr116[i242] = iArr116[11];
                return 0;
            case 153:
                int i243 = this.f10030n - 2;
                this.f10030n = i243;
                int[] iArr117 = this.f10029m;
                this.f10020d = iArr117[i243] < iArr117[i243 + 1] ? 1 : 0;
                return 0;
            case 154:
                int[] iArr118 = this.f10029m;
                int i244 = this.f10030n;
                this.f10030n = i244 + 1;
                iArr118[i244] = iArr118[12];
                return 0;
            case 155:
                int i245 = this.f10030n - 1;
                this.f10030n = i245;
                Object[] objArr37 = this.f10033s;
                Object[] objArr38 = objArr37[i245 - 1];
                objArr37[i245 - 1] = null;
                objArr37[i245 - 1] = objArr38[this.f10029m[i245]];
                int i246 = i245 + 1;
                objArr37[i245] = objArr37[i246 - 2];
                int i247 = i246 - 1;
                this.f10030n = i247;
                Object obj15 = objArr37[i247];
                objArr37[i247] = null;
                objArr37[13] = obj15;
                return 0;
            case 156:
                int i248 = this.f10030n - 1;
                this.f10030n = i248;
                Object[] objArr39 = this.f10033s;
                Object obj16 = objArr39[i248];
                objArr39[i248] = null;
                this.f10020d = obj16 != null ? 1 : 0;
                return 0;
            case 157:
                Object[] objArr40 = this.f10033s;
                int i249 = this.f10030n;
                int i250 = i249 + 1;
                objArr40[i249] = objArr40[i250 - 2];
                int i251 = i250 - 1;
                this.f10030n = i251;
                Object obj17 = objArr40[i251];
                objArr40[i251] = null;
                objArr40[14] = obj17;
                return 0;
            case 158:
                Object[] objArr41 = this.f10033s;
                int i252 = this.f10030n;
                this.f10030n = i252 + 1;
                objArr41[i252] = objArr41[14];
                return 0;
            case 159:
                Object[] objArr42 = this.f10033s;
                int i253 = this.f10030n;
                this.f10030n = i253 + 1;
                objArr42[i253] = objArr42[13];
                return 0;
            case 160:
                int[] iArr119 = this.f10029m;
                iArr119[12] = iArr119[12] + 1;
                return 0;
            case 161:
                int[] iArr120 = this.f10029m;
                int i254 = this.f10030n;
                this.f10030n = i254 + 1;
                iArr120[i254] = 53;
                return 0;
            case 162:
                int i255 = this.f10030n - 1;
                this.f10030n = i255;
                int[] iArr121 = this.f10029m;
                iArr121[i255 - 1] = iArr121[i255 - 1] * iArr121[i255];
                return 0;
            case 163:
                int[] iArr122 = this.f10029m;
                int i256 = this.f10030n;
                this.f10030n = i256 + 1;
                iArr122[i256] = 1;
                return 0;
            case 164:
                int[] iArr123 = this.f10029m;
                int i257 = this.f10030n;
                this.f10030n = i257 + 1;
                iArr123[i257] = 7;
                return 0;
            case 165:
                int[] iArr124 = this.f10029m;
                int i258 = this.f10030n;
                this.f10030n = i258 + 1;
                iArr124[i258] = 17;
                return 0;
            case 166:
                int i259 = this.f10030n - 1;
                this.f10030n = i259;
                Object[] objArr43 = this.f10033s;
                Object obj18 = objArr43[i259];
                objArr43[i259] = null;
                this.f10020d = obj18 == null ? 1 : 0;
                return 0;
            case 167:
                int[] iArr125 = this.f10029m;
                int i260 = this.f10030n;
                this.f10030n = i260 + 1;
                iArr125[i260] = 27;
                return 0;
            case 168:
                int[] iArr126 = this.f10029m;
                int i261 = this.f10030n;
                this.f10030n = i261 + 1;
                iArr126[i261] = 4;
                return 0;
            case 169:
                int[] iArr127 = this.f10029m;
                int i262 = this.f10030n;
                iArr127[i262] = 7;
                int i263 = (i262 + 1) - 1;
                iArr127[i263 - 1] = iArr127[i263 - 1] + iArr127[i263];
                int i264 = i263 + 1;
                this.f10030n = i264;
                iArr127[i263] = iArr127[i264 - 2];
                return 0;
            case 170:
                int[] iArr128 = this.f10029m;
                int i265 = this.f10030n;
                this.f10030n = i265 + 1;
                iArr128[i265] = 23;
                return 0;
            case 171:
                int i266 = this.f10030n - 2;
                this.f10030n = i266;
                Object[] objArr44 = this.f10033s;
                Object obj19 = objArr44[i266];
                objArr44[i266] = null;
                Object obj20 = objArr44[i266 + 1];
                objArr44[i266 + 1] = null;
                this.f10020d = obj19 != obj20 ? 1 : 0;
                return 0;
            case 172:
                int i267 = this.f10030n - 1;
                this.f10030n = i267;
                int[] iArr129 = this.f10029m;
                iArr129[11] = iArr129[i267];
                return 0;
            case 173:
                int[] iArr130 = this.f10029m;
                int i268 = this.f10030n;
                this.f10030n = i268 + 1;
                iArr130[i268] = iArr130[11];
                return 0;
            case 174:
                int i269 = this.f10030n - 1;
                int[] iArr131 = this.f10029m;
                iArr131[i269 - 1] = iArr131[i269 - 1] - iArr131[i269];
                this.f10030n = i269 + 1;
                iArr131[i269] = 49;
                return 0;
            case 175:
                int[] iArr132 = this.f10029m;
                int i270 = this.f10030n;
                int i271 = i270 + 1;
                iArr132[i270] = 16;
                this.f10030n = i271 + 1;
                iArr132[i271] = 0;
                return 0;
            case 176:
                int i272 = this.f10030n - 1;
                Object[] objArr45 = this.f10033s;
                Object obj21 = objArr45[i272];
                objArr45[i272] = null;
                objArr45[11] = obj21;
                this.f10030n = i272 + 1;
                objArr45[i272] = obj21;
                return 0;
            case 177:
                Object[] objArr46 = this.f10033s;
                int i273 = this.f10030n;
                this.f10030n = i273 + 1;
                objArr46[i273] = objArr46[11];
                return 0;
            case 178:
                int i274 = this.f10030n - 1;
                int[] iArr133 = this.f10029m;
                iArr133[i274 - 1] = iArr133[i274 - 1] - iArr133[i274];
                this.f10030n = i274 + 1;
                iArr133[i274] = 48;
                return 0;
            case 179:
                int[] iArr134 = this.f10029m;
                int i275 = this.f10030n;
                iArr134[i275] = 24;
                int i276 = (i275 + 1) - 1;
                this.f10030n = i276;
                iArr134[i276 - 1] = iArr134[i276 - 1] >> iArr134[i276];
                return 0;
            case SubsamplingScaleImageView.ORIENTATION_180 /*180*/:
                Object[] objArr47 = this.f10033s;
                int i277 = this.f10030n;
                this.f10030n = i277 + 1;
                objArr47[i277] = objArr47[12];
                return 0;
            case 181:
                int i278 = this.f10030n - 1;
                this.f10030n = i278;
                Object[] objArr48 = this.f10033s;
                Object obj22 = objArr48[i278];
                objArr48[i278] = null;
                objArr48[11] = obj22;
                return 0;
            case 182:
                int[] iArr135 = this.f10029m;
                int i279 = this.f10030n;
                int i280 = i279 + 1;
                iArr135[i279] = 47;
                float[] fArr7 = this.f10031o;
                this.f10030n = i280 + 1;
                fArr7[i280] = 0.0f;
                return 0;
            case 183:
                int[] iArr136 = this.f10029m;
                int i281 = this.f10030n;
                iArr136[i281] = 85;
                int i282 = (i281 + 1) - 1;
                this.f10030n = i282;
                iArr136[i282 - 1] = iArr136[i282 - 1] + iArr136[i282];
                return 0;
            case 184:
                int[] iArr137 = this.f10029m;
                int i283 = this.f10030n;
                int i284 = i283 + 1;
                iArr137[i283] = 2;
                iArr137[i284] = 3;
                int i285 = (i284 + 1) - 1;
                this.f10030n = i285;
                iArr137[i285 - 1] = iArr137[i285 - 1] - iArr137[i285];
                return 0;
            case 185:
                int[] iArr138 = this.f10029m;
                int i286 = this.f10030n;
                iArr138[i286] = 89;
                int i287 = (i286 + 1) - 1;
                this.f10030n = i287;
                iArr138[i287 - 1] = iArr138[i287 - 1] + iArr138[i287];
                return 0;
            case 186:
                int[] iArr139 = this.f10029m;
                int i288 = this.f10030n;
                iArr139[i288] = 109;
                int i289 = (i288 + 1) - 1;
                iArr139[i289 - 1] = iArr139[i289 - 1] + iArr139[i289];
                int i290 = i289 + 1;
                this.f10030n = i290;
                iArr139[i289] = iArr139[i290 - 2];
                return 0;
            case 187:
                int[] iArr140 = this.f10029m;
                int i291 = this.f10030n;
                iArr140[i291] = 17;
                int i292 = (i291 + 1) - 1;
                this.f10030n = i292;
                iArr140[i292 - 1] = iArr140[i292 - 1] + iArr140[i292];
                return 0;
            case 188:
                int[] iArr141 = this.f10029m;
                int i293 = this.f10030n;
                this.f10030n = i293 + 1;
                iArr141[i293] = 40;
                return 0;
            case 189:
                Object[] objArr49 = this.f10033s;
                int i294 = this.f10030n;
                int i295 = i294 + 1;
                this.f10030n = i295;
                objArr49[i294] = objArr49[11];
                Object obj23 = objArr49[i295 - 1];
                objArr49[i295 - 1] = null;
                this.f10029m[i295 - 1] = ((Object[]) obj23).length;
                return 0;
            case 190:
                int i296 = this.f10030n - 1;
                int[] iArr142 = this.f10029m;
                iArr142[12] = iArr142[i296];
                this.f10030n = i296 + 1;
                iArr142[i296] = 0;
                return 0;
            case 191:
                int i297 = this.f10030n - 1;
                this.f10030n = i297;
                int[] iArr143 = this.f10029m;
                iArr143[13] = iArr143[i297];
                return 0;
            case 192:
                int[] iArr144 = this.f10029m;
                int i298 = this.f10030n;
                int i299 = i298 + 1;
                iArr144[i298] = iArr144[13];
                this.f10030n = i299 + 1;
                iArr144[i299] = iArr144[12];
                return 0;
            case 193:
                int[] iArr145 = this.f10029m;
                int i300 = this.f10030n;
                this.f10030n = i300 + 1;
                iArr145[i300] = iArr145[13];
                return 0;
            case 194:
                int[] iArr146 = this.f10029m;
                iArr146[13] = iArr146[13] + 1;
                return 0;
            case 195:
                int[] iArr147 = this.f10029m;
                int i301 = this.f10030n;
                iArr147[i301] = 5;
                int i302 = (i301 + 1) - 1;
                this.f10030n = i302;
                iArr147[i302 - 1] = iArr147[i302 - 1] + iArr147[i302];
                return 0;
            case 196:
                int[] iArr148 = this.f10029m;
                int i303 = this.f10030n;
                this.f10030n = i303 + 1;
                iArr148[i303] = 117;
                return 0;
            case 197:
                int[] iArr149 = this.f10029m;
                int i304 = this.f10030n;
                this.f10030n = i304 + 1;
                iArr149[i304] = 72;
                return 0;
            case 198:
                int[] iArr150 = this.f10029m;
                int i305 = this.f10030n;
                this.f10030n = i305 + 1;
                iArr150[i305] = 65;
                return 0;
            case 199:
                int[] iArr151 = this.f10029m;
                int i306 = this.f10030n;
                this.f10030n = i306 + 1;
                iArr151[i306] = 96;
                return 0;
            case BogInputLayout.INPUT_NORMAL_STATE /*200*/:
                Object[] objArr50 = this.f10033s;
                int i307 = this.f10030n;
                objArr50[i307] = null;
                int i308 = (i307 + 1) - 1;
                this.f10030n = i308;
                Object obj24 = objArr50[i308];
                objArr50[i308] = null;
                objArr50[13] = obj24;
                return 0;
            case BogInputLayout.INPUT_ERROR_STATE /*201*/:
                Object[] objArr51 = this.f10033s;
                int i309 = this.f10030n;
                int i310 = i309 + 1;
                objArr51[i309] = objArr51[11];
                int[] iArr152 = this.f10029m;
                this.f10030n = i310 + 1;
                iArr152[i310] = 2;
                return 0;
            case 202:
                int i311 = this.f10030n - 1;
                this.f10030n = i311;
                Object[] objArr52 = this.f10033s;
                Object obj25 = objArr52[i311];
                objArr52[i311] = null;
                objArr52[13] = obj25;
                return 0;
            case 203:
                int i312 = this.f10030n - 1;
                this.f10030n = i312;
                Object[] objArr53 = this.f10033s;
                Object obj26 = objArr53[i312];
                objArr53[i312] = null;
                objArr53[14] = obj26;
                return 0;
            case 204:
                Object[] objArr54 = this.f10033s;
                int i313 = this.f10030n;
                objArr54[i313 - 1] = new byte[this.f10029m[i313 - 1]];
                return 0;
            case 205:
                int i314 = this.f10030n - 1;
                this.f10030n = i314;
                Object[] objArr55 = this.f10033s;
                Object obj27 = objArr55[i314];
                objArr55[i314] = null;
                objArr55[15] = obj27;
                return 0;
            case 206:
                Object[] objArr56 = this.f10033s;
                int i315 = this.f10030n;
                this.f10030n = i315 + 1;
                objArr56[i315] = objArr56[15];
                return 0;
            case 207:
                int i316 = this.f10030n - 1;
                this.f10030n = i316;
                this.f10020d = this.f10029m[i316] > 0 ? 1 : 0;
                return 0;
            case 208:
                int[] iArr153 = this.f10029m;
                int i317 = this.f10030n;
                int i318 = i317 + 1;
                iArr153[i317] = iArr153[i318 - 2];
                int i319 = i318 - 1;
                this.f10030n = i319;
                iArr153[16] = iArr153[i319];
                return 0;
            case 209:
                Object[] objArr57 = this.f10033s;
                int i320 = this.f10030n;
                int i321 = i320 + 1;
                objArr57[i320] = objArr57[14];
                this.f10030n = i321 + 1;
                objArr57[i321] = objArr57[15];
                return 0;
            case 210:
                int[] iArr154 = this.f10029m;
                int i322 = this.f10030n;
                int i323 = i322 + 1;
                iArr154[i322] = 0;
                this.f10030n = i323 + 1;
                iArr154[i323] = iArr154[16];
                return 0;
            case 211:
                int i324 = this.f10030n - 1;
                Object[] objArr58 = this.f10033s;
                Object obj28 = objArr58[i324];
                objArr58[i324] = null;
                objArr58[14] = obj28;
                this.f10030n = i324 + 1;
                objArr58[i324] = objArr58[12];
                return 0;
            case 212:
                int i325 = this.f10030n - 1;
                this.f10030n = i325;
                Object[] objArr59 = this.f10033s;
                Object obj29 = objArr59[i325];
                objArr59[i325] = null;
                objArr59[16] = obj29;
                return 0;
            case 213:
                int[] iArr155 = this.f10029m;
                int i326 = this.f10030n;
                Object[] objArr60 = this.f10033s;
                Object obj30 = objArr60[i326 - 1];
                objArr60[i326 - 1] = null;
                iArr155[i326 - 1] = ((Object[]) obj30).length;
                int i327 = i326 - 1;
                iArr155[15] = iArr155[i327];
                this.f10030n = i327 + 1;
                iArr155[i327] = 0;
                return 0;
            case 214:
                int[] iArr156 = this.f10029m;
                int i328 = this.f10030n;
                int i329 = i328 + 1;
                iArr156[i328] = iArr156[13];
                this.f10030n = i329 + 1;
                iArr156[i329] = iArr156[15];
                return 0;
            case 215:
                Object[] objArr61 = this.f10033s;
                int i330 = this.f10030n;
                this.f10030n = i330 + 1;
                objArr61[i330] = objArr61[16];
                return 0;
            case 216:
                int[] iArr157 = this.f10029m;
                int i331 = this.f10030n;
                iArr157[i331] = iArr157[13];
                int i332 = (i331 + 1) - 1;
                this.f10030n = i332;
                Object[] objArr62 = this.f10033s;
                Object[] objArr63 = objArr62[i332 - 1];
                objArr62[i332 - 1] = null;
                objArr62[i332 - 1] = objArr63[iArr157[i332]];
                return 0;
            case 217:
                int i333 = this.f10030n - 1;
                Object[] objArr64 = this.f10033s;
                Object obj31 = objArr64[i333];
                objArr64[i333] = null;
                objArr64[14] = obj31;
                this.f10030n = i333 + 1;
                objArr64[i333] = objArr64[10];
                return 0;
            case 218:
                int[] iArr158 = this.f10029m;
                int i334 = this.f10030n;
                iArr158[i334] = 49;
                int i335 = (i334 + 1) - 1;
                this.f10030n = i335;
                iArr158[i335 - 1] = iArr158[i335 - 1] + iArr158[i335];
                return 0;
            case 219:
                int[] iArr159 = this.f10029m;
                int i336 = this.f10030n;
                iArr159[i336] = 63;
                int i337 = (i336 + 1) - 1;
                this.f10030n = i337;
                iArr159[i337 - 1] = iArr159[i337 - 1] + iArr159[i337];
                return 0;
            case 220:
                int[] iArr160 = this.f10029m;
                int i338 = this.f10030n;
                this.f10030n = i338 + 1;
                iArr160[i338] = 31;
                return 0;
            case 221:
                int[] iArr161 = this.f10029m;
                int i339 = this.f10030n;
                iArr161[i339] = iArr161[10];
                int i340 = (i339 + 1) - 1;
                this.f10030n = i340;
                Object[] objArr65 = this.f10033s;
                Object[] objArr66 = objArr65[i340 - 1];
                objArr65[i340 - 1] = null;
                objArr65[i340 - 1] = objArr66[iArr161[i340]];
                return 0;
            case 222:
                int[] iArr162 = this.f10029m;
                int i341 = this.f10030n;
                iArr162[i341] = 99;
                int i342 = (i341 + 1) - 1;
                this.f10030n = i342;
                iArr162[i342 - 1] = iArr162[i342 - 1] + iArr162[i342];
                return 0;
            case 223:
                int[] iArr163 = this.f10029m;
                int i343 = this.f10030n;
                iArr163[i343] = 45;
                int i344 = (i343 + 1) - 1;
                this.f10030n = i344;
                iArr163[i344 - 1] = iArr163[i344 - 1] + iArr163[i344];
                return 0;
            case 224:
                int[] iArr164 = this.f10029m;
                int i345 = this.f10030n;
                iArr164[i345] = 125;
                int i346 = (i345 + 1) - 1;
                this.f10030n = i346;
                iArr164[i346 - 1] = iArr164[i346 - 1] + iArr164[i346];
                return 0;
            case 225:
                int[] iArr165 = this.f10029m;
                int i347 = this.f10030n;
                this.f10030n = i347 + 1;
                iArr165[i347] = 95;
                return 0;
            case 226:
                int[] iArr166 = this.f10029m;
                int i348 = this.f10030n;
                iArr166[i348] = 101;
                int i349 = (i348 + 1) - 1;
                iArr166[i349 - 1] = iArr166[i349 - 1] + iArr166[i349];
                int i350 = i349 + 1;
                this.f10030n = i350;
                iArr166[i349] = iArr166[i350 - 2];
                return 0;
            case 227:
                int[] iArr167 = this.f10029m;
                int i351 = this.f10030n;
                this.f10030n = i351 + 1;
                iArr167[i351] = 119;
                return 0;
            case 228:
                int[] iArr168 = this.f10029m;
                int i352 = this.f10030n;
                this.f10030n = i352 + 1;
                iArr168[i352] = 125;
                return 0;
            case 229:
                int[] iArr169 = this.f10029m;
                int i353 = this.f10030n;
                iArr169[i353] = 69;
                int i354 = (i353 + 1) - 1;
                iArr169[i354 - 1] = iArr169[i354 - 1] + iArr169[i354];
                int i355 = i354 + 1;
                this.f10030n = i355;
                iArr169[i354] = iArr169[i355 - 2];
                return 0;
            case 230:
                int[] iArr170 = this.f10029m;
                int i356 = this.f10030n;
                this.f10030n = i356 + 1;
                iArr170[i356] = 41;
                return 0;
            case 231:
                int[] iArr171 = this.f10029m;
                int i357 = this.f10030n;
                this.f10030n = i357 + 1;
                iArr171[i357] = 60;
                return 0;
            case 232:
                int[] iArr172 = this.f10029m;
                int i358 = this.f10030n;
                iArr172[i358] = 81;
                int i359 = (i358 + 1) - 1;
                this.f10030n = i359;
                iArr172[i359 - 1] = iArr172[i359 - 1] + iArr172[i359];
                return 0;
            case 233:
                int i360 = this.f10030n - 1;
                int[] iArr173 = this.f10029m;
                iArr173[i360 - 1] = iArr173[i360 - 1] + iArr173[i360];
                this.f10030n = i360 + 1;
                iArr173[i360] = 58;
                return 0;
            case 234:
                int[] iArr174 = this.f10029m;
                int i361 = this.f10030n;
                this.f10030n = i361 + 1;
                iArr174[i361] = 28;
                return 0;
            case 235:
                int[] iArr175 = this.f10029m;
                int i362 = this.f10030n;
                this.f10030n = i362 + 1;
                iArr175[i362] = 8;
                return 0;
            case 236:
                int[] iArr176 = this.f10029m;
                int i363 = this.f10030n;
                this.f10030n = i363 + 1;
                iArr176[i363] = 29;
                return 0;
            case 237:
                int[] iArr177 = this.f10029m;
                int i364 = this.f10030n;
                iArr177[i364] = 16;
                int i365 = (i364 + 1) - 1;
                iArr177[i365 - 1] = iArr177[i365 - 1] >> iArr177[i365];
                int i366 = i365 - 1;
                this.f10030n = i366;
                iArr177[i366 - 1] = iArr177[i366 - 1] - iArr177[i366];
                return 0;
            case 238:
                int[] iArr178 = this.f10029m;
                int i367 = this.f10030n;
                this.f10030n = i367 + 1;
                iArr178[i367] = 59;
                return 0;
            default:
                return i;
        }
        return 0;
    }

    public C2958do(int i) {
        int[] iArr = new int[17];
        this.f10029m = iArr;
        this.f10027k = new long[17];
        this.f10031o = new float[17];
        this.f10032q = new double[17];
        this.f10033s = new Object[17];
        iArr[10] = i;
        this.f10030n = 0;
        this.f10028l = -1;
    }

    public C2958do(Object obj) {
        this.f10029m = new int[17];
        this.f10027k = new long[17];
        this.f10031o = new float[17];
        this.f10032q = new double[17];
        Object[] objArr = new Object[17];
        this.f10033s = objArr;
        objArr[10] = obj;
        this.f10030n = 0;
        this.f10028l = -1;
    }

    public C2958do(Object obj, Object obj2, Object obj3) {
        this.f10029m = new int[17];
        this.f10027k = new long[17];
        this.f10031o = new float[17];
        this.f10032q = new double[17];
        Object[] objArr = new Object[17];
        this.f10033s = objArr;
        objArr[10] = obj;
        objArr[11] = obj2;
        objArr[12] = obj3;
        this.f10030n = 0;
        this.f10028l = -1;
    }
}
