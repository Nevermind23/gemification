package ug1;

import com.salesforce.marketingcloud.C11398b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: ug1.a */
public abstract class C43101a {

    /* renamed from: a */
    private static final byte[] f100544a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    private static final byte[] f100545b;

    /* renamed from: c */
    private static final byte[] f100546c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    private static final byte[] f100547d;

    /* renamed from: e */
    private static final byte[] f100548e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    private static final byte[] f100549f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    static {
        byte[] bArr = new byte[C11398b.f33139r];
        // fill-array-data instruction
        bArr[0] = -9;
        bArr[1] = -9;
        bArr[2] = -9;
        bArr[3] = -9;
        bArr[4] = -9;
        bArr[5] = -9;
        bArr[6] = -9;
        bArr[7] = -9;
        bArr[8] = -9;
        bArr[9] = -5;
        bArr[10] = -5;
        bArr[11] = -9;
        bArr[12] = -9;
        bArr[13] = -5;
        bArr[14] = -9;
        bArr[15] = -9;
        bArr[16] = -9;
        bArr[17] = -9;
        bArr[18] = -9;
        bArr[19] = -9;
        bArr[20] = -9;
        bArr[21] = -9;
        bArr[22] = -9;
        bArr[23] = -9;
        bArr[24] = -9;
        bArr[25] = -9;
        bArr[26] = -9;
        bArr[27] = -9;
        bArr[28] = -9;
        bArr[29] = -9;
        bArr[30] = -9;
        bArr[31] = -9;
        bArr[32] = -5;
        bArr[33] = -9;
        bArr[34] = -9;
        bArr[35] = -9;
        bArr[36] = -9;
        bArr[37] = -9;
        bArr[38] = -9;
        bArr[39] = -9;
        bArr[40] = -9;
        bArr[41] = -9;
        bArr[42] = -9;
        bArr[43] = 62;
        bArr[44] = -9;
        bArr[45] = -9;
        bArr[46] = -9;
        bArr[47] = 63;
        bArr[48] = 52;
        bArr[49] = 53;
        bArr[50] = 54;
        bArr[51] = 55;
        bArr[52] = 56;
        bArr[53] = 57;
        bArr[54] = 58;
        bArr[55] = 59;
        bArr[56] = 60;
        bArr[57] = 61;
        bArr[58] = -9;
        bArr[59] = -9;
        bArr[60] = -9;
        bArr[61] = -1;
        bArr[62] = -9;
        bArr[63] = -9;
        bArr[64] = -9;
        bArr[65] = 0;
        bArr[66] = 1;
        bArr[67] = 2;
        bArr[68] = 3;
        bArr[69] = 4;
        bArr[70] = 5;
        bArr[71] = 6;
        bArr[72] = 7;
        bArr[73] = 8;
        bArr[74] = 9;
        bArr[75] = 10;
        bArr[76] = 11;
        bArr[77] = 12;
        bArr[78] = 13;
        bArr[79] = 14;
        bArr[80] = 15;
        bArr[81] = 16;
        bArr[82] = 17;
        bArr[83] = 18;
        bArr[84] = 19;
        bArr[85] = 20;
        bArr[86] = 21;
        bArr[87] = 22;
        bArr[88] = 23;
        bArr[89] = 24;
        bArr[90] = 25;
        bArr[91] = -9;
        bArr[92] = -9;
        bArr[93] = -9;
        bArr[94] = -9;
        bArr[95] = -9;
        bArr[96] = -9;
        bArr[97] = 26;
        bArr[98] = 27;
        bArr[99] = 28;
        bArr[100] = 29;
        bArr[101] = 30;
        bArr[102] = 31;
        bArr[103] = 32;
        bArr[104] = 33;
        bArr[105] = 34;
        bArr[106] = 35;
        bArr[107] = 36;
        bArr[108] = 37;
        bArr[109] = 38;
        bArr[110] = 39;
        bArr[111] = 40;
        bArr[112] = 41;
        bArr[113] = 42;
        bArr[114] = 43;
        bArr[115] = 44;
        bArr[116] = 45;
        bArr[117] = 46;
        bArr[118] = 47;
        bArr[119] = 48;
        bArr[120] = 49;
        bArr[121] = 50;
        bArr[122] = 51;
        bArr[123] = -9;
        bArr[124] = -9;
        bArr[125] = -9;
        bArr[126] = -9;
        bArr[127] = -9;
        bArr[128] = -9;
        bArr[129] = -9;
        bArr[130] = -9;
        bArr[131] = -9;
        bArr[132] = -9;
        bArr[133] = -9;
        bArr[134] = -9;
        bArr[135] = -9;
        bArr[136] = -9;
        bArr[137] = -9;
        bArr[138] = -9;
        bArr[139] = -9;
        bArr[140] = -9;
        bArr[141] = -9;
        bArr[142] = -9;
        bArr[143] = -9;
        bArr[144] = -9;
        bArr[145] = -9;
        bArr[146] = -9;
        bArr[147] = -9;
        bArr[148] = -9;
        bArr[149] = -9;
        bArr[150] = -9;
        bArr[151] = -9;
        bArr[152] = -9;
        bArr[153] = -9;
        bArr[154] = -9;
        bArr[155] = -9;
        bArr[156] = -9;
        bArr[157] = -9;
        bArr[158] = -9;
        bArr[159] = -9;
        bArr[160] = -9;
        bArr[161] = -9;
        bArr[162] = -9;
        bArr[163] = -9;
        bArr[164] = -9;
        bArr[165] = -9;
        bArr[166] = -9;
        bArr[167] = -9;
        bArr[168] = -9;
        bArr[169] = -9;
        bArr[170] = -9;
        bArr[171] = -9;
        bArr[172] = -9;
        bArr[173] = -9;
        bArr[174] = -9;
        bArr[175] = -9;
        bArr[176] = -9;
        bArr[177] = -9;
        bArr[178] = -9;
        bArr[179] = -9;
        bArr[180] = -9;
        bArr[181] = -9;
        bArr[182] = -9;
        bArr[183] = -9;
        bArr[184] = -9;
        bArr[185] = -9;
        bArr[186] = -9;
        bArr[187] = -9;
        bArr[188] = -9;
        bArr[189] = -9;
        bArr[190] = -9;
        bArr[191] = -9;
        bArr[192] = -9;
        bArr[193] = -9;
        bArr[194] = -9;
        bArr[195] = -9;
        bArr[196] = -9;
        bArr[197] = -9;
        bArr[198] = -9;
        bArr[199] = -9;
        bArr[200] = -9;
        bArr[201] = -9;
        bArr[202] = -9;
        bArr[203] = -9;
        bArr[204] = -9;
        bArr[205] = -9;
        bArr[206] = -9;
        bArr[207] = -9;
        bArr[208] = -9;
        bArr[209] = -9;
        bArr[210] = -9;
        bArr[211] = -9;
        bArr[212] = -9;
        bArr[213] = -9;
        bArr[214] = -9;
        bArr[215] = -9;
        bArr[216] = -9;
        bArr[217] = -9;
        bArr[218] = -9;
        bArr[219] = -9;
        bArr[220] = -9;
        bArr[221] = -9;
        bArr[222] = -9;
        bArr[223] = -9;
        bArr[224] = -9;
        bArr[225] = -9;
        bArr[226] = -9;
        bArr[227] = -9;
        bArr[228] = -9;
        bArr[229] = -9;
        bArr[230] = -9;
        bArr[231] = -9;
        bArr[232] = -9;
        bArr[233] = -9;
        bArr[234] = -9;
        bArr[235] = -9;
        bArr[236] = -9;
        bArr[237] = -9;
        bArr[238] = -9;
        bArr[239] = -9;
        bArr[240] = -9;
        bArr[241] = -9;
        bArr[242] = -9;
        bArr[243] = -9;
        bArr[244] = -9;
        bArr[245] = -9;
        bArr[246] = -9;
        bArr[247] = -9;
        bArr[248] = -9;
        bArr[249] = -9;
        bArr[250] = -9;
        bArr[251] = -9;
        bArr[252] = -9;
        bArr[253] = -9;
        bArr[254] = -9;
        bArr[255] = -9;
        f100545b = bArr;
        byte[] bArr2 = new byte[C11398b.f33139r];
        // fill-array-data instruction
        bArr2[0] = -9;
        bArr2[1] = -9;
        bArr2[2] = -9;
        bArr2[3] = -9;
        bArr2[4] = -9;
        bArr2[5] = -9;
        bArr2[6] = -9;
        bArr2[7] = -9;
        bArr2[8] = -9;
        bArr2[9] = -5;
        bArr2[10] = -5;
        bArr2[11] = -9;
        bArr2[12] = -9;
        bArr2[13] = -5;
        bArr2[14] = -9;
        bArr2[15] = -9;
        bArr2[16] = -9;
        bArr2[17] = -9;
        bArr2[18] = -9;
        bArr2[19] = -9;
        bArr2[20] = -9;
        bArr2[21] = -9;
        bArr2[22] = -9;
        bArr2[23] = -9;
        bArr2[24] = -9;
        bArr2[25] = -9;
        bArr2[26] = -9;
        bArr2[27] = -9;
        bArr2[28] = -9;
        bArr2[29] = -9;
        bArr2[30] = -9;
        bArr2[31] = -9;
        bArr2[32] = -5;
        bArr2[33] = -9;
        bArr2[34] = -9;
        bArr2[35] = -9;
        bArr2[36] = -9;
        bArr2[37] = -9;
        bArr2[38] = -9;
        bArr2[39] = -9;
        bArr2[40] = -9;
        bArr2[41] = -9;
        bArr2[42] = -9;
        bArr2[43] = -9;
        bArr2[44] = -9;
        bArr2[45] = 62;
        bArr2[46] = -9;
        bArr2[47] = -9;
        bArr2[48] = 52;
        bArr2[49] = 53;
        bArr2[50] = 54;
        bArr2[51] = 55;
        bArr2[52] = 56;
        bArr2[53] = 57;
        bArr2[54] = 58;
        bArr2[55] = 59;
        bArr2[56] = 60;
        bArr2[57] = 61;
        bArr2[58] = -9;
        bArr2[59] = -9;
        bArr2[60] = -9;
        bArr2[61] = -1;
        bArr2[62] = -9;
        bArr2[63] = -9;
        bArr2[64] = -9;
        bArr2[65] = 0;
        bArr2[66] = 1;
        bArr2[67] = 2;
        bArr2[68] = 3;
        bArr2[69] = 4;
        bArr2[70] = 5;
        bArr2[71] = 6;
        bArr2[72] = 7;
        bArr2[73] = 8;
        bArr2[74] = 9;
        bArr2[75] = 10;
        bArr2[76] = 11;
        bArr2[77] = 12;
        bArr2[78] = 13;
        bArr2[79] = 14;
        bArr2[80] = 15;
        bArr2[81] = 16;
        bArr2[82] = 17;
        bArr2[83] = 18;
        bArr2[84] = 19;
        bArr2[85] = 20;
        bArr2[86] = 21;
        bArr2[87] = 22;
        bArr2[88] = 23;
        bArr2[89] = 24;
        bArr2[90] = 25;
        bArr2[91] = -9;
        bArr2[92] = -9;
        bArr2[93] = -9;
        bArr2[94] = -9;
        bArr2[95] = 63;
        bArr2[96] = -9;
        bArr2[97] = 26;
        bArr2[98] = 27;
        bArr2[99] = 28;
        bArr2[100] = 29;
        bArr2[101] = 30;
        bArr2[102] = 31;
        bArr2[103] = 32;
        bArr2[104] = 33;
        bArr2[105] = 34;
        bArr2[106] = 35;
        bArr2[107] = 36;
        bArr2[108] = 37;
        bArr2[109] = 38;
        bArr2[110] = 39;
        bArr2[111] = 40;
        bArr2[112] = 41;
        bArr2[113] = 42;
        bArr2[114] = 43;
        bArr2[115] = 44;
        bArr2[116] = 45;
        bArr2[117] = 46;
        bArr2[118] = 47;
        bArr2[119] = 48;
        bArr2[120] = 49;
        bArr2[121] = 50;
        bArr2[122] = 51;
        bArr2[123] = -9;
        bArr2[124] = -9;
        bArr2[125] = -9;
        bArr2[126] = -9;
        bArr2[127] = -9;
        bArr2[128] = -9;
        bArr2[129] = -9;
        bArr2[130] = -9;
        bArr2[131] = -9;
        bArr2[132] = -9;
        bArr2[133] = -9;
        bArr2[134] = -9;
        bArr2[135] = -9;
        bArr2[136] = -9;
        bArr2[137] = -9;
        bArr2[138] = -9;
        bArr2[139] = -9;
        bArr2[140] = -9;
        bArr2[141] = -9;
        bArr2[142] = -9;
        bArr2[143] = -9;
        bArr2[144] = -9;
        bArr2[145] = -9;
        bArr2[146] = -9;
        bArr2[147] = -9;
        bArr2[148] = -9;
        bArr2[149] = -9;
        bArr2[150] = -9;
        bArr2[151] = -9;
        bArr2[152] = -9;
        bArr2[153] = -9;
        bArr2[154] = -9;
        bArr2[155] = -9;
        bArr2[156] = -9;
        bArr2[157] = -9;
        bArr2[158] = -9;
        bArr2[159] = -9;
        bArr2[160] = -9;
        bArr2[161] = -9;
        bArr2[162] = -9;
        bArr2[163] = -9;
        bArr2[164] = -9;
        bArr2[165] = -9;
        bArr2[166] = -9;
        bArr2[167] = -9;
        bArr2[168] = -9;
        bArr2[169] = -9;
        bArr2[170] = -9;
        bArr2[171] = -9;
        bArr2[172] = -9;
        bArr2[173] = -9;
        bArr2[174] = -9;
        bArr2[175] = -9;
        bArr2[176] = -9;
        bArr2[177] = -9;
        bArr2[178] = -9;
        bArr2[179] = -9;
        bArr2[180] = -9;
        bArr2[181] = -9;
        bArr2[182] = -9;
        bArr2[183] = -9;
        bArr2[184] = -9;
        bArr2[185] = -9;
        bArr2[186] = -9;
        bArr2[187] = -9;
        bArr2[188] = -9;
        bArr2[189] = -9;
        bArr2[190] = -9;
        bArr2[191] = -9;
        bArr2[192] = -9;
        bArr2[193] = -9;
        bArr2[194] = -9;
        bArr2[195] = -9;
        bArr2[196] = -9;
        bArr2[197] = -9;
        bArr2[198] = -9;
        bArr2[199] = -9;
        bArr2[200] = -9;
        bArr2[201] = -9;
        bArr2[202] = -9;
        bArr2[203] = -9;
        bArr2[204] = -9;
        bArr2[205] = -9;
        bArr2[206] = -9;
        bArr2[207] = -9;
        bArr2[208] = -9;
        bArr2[209] = -9;
        bArr2[210] = -9;
        bArr2[211] = -9;
        bArr2[212] = -9;
        bArr2[213] = -9;
        bArr2[214] = -9;
        bArr2[215] = -9;
        bArr2[216] = -9;
        bArr2[217] = -9;
        bArr2[218] = -9;
        bArr2[219] = -9;
        bArr2[220] = -9;
        bArr2[221] = -9;
        bArr2[222] = -9;
        bArr2[223] = -9;
        bArr2[224] = -9;
        bArr2[225] = -9;
        bArr2[226] = -9;
        bArr2[227] = -9;
        bArr2[228] = -9;
        bArr2[229] = -9;
        bArr2[230] = -9;
        bArr2[231] = -9;
        bArr2[232] = -9;
        bArr2[233] = -9;
        bArr2[234] = -9;
        bArr2[235] = -9;
        bArr2[236] = -9;
        bArr2[237] = -9;
        bArr2[238] = -9;
        bArr2[239] = -9;
        bArr2[240] = -9;
        bArr2[241] = -9;
        bArr2[242] = -9;
        bArr2[243] = -9;
        bArr2[244] = -9;
        bArr2[245] = -9;
        bArr2[246] = -9;
        bArr2[247] = -9;
        bArr2[248] = -9;
        bArr2[249] = -9;
        bArr2[250] = -9;
        bArr2[251] = -9;
        bArr2[252] = -9;
        bArr2[253] = -9;
        bArr2[254] = -9;
        bArr2[255] = -9;
        f100547d = bArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m123680d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        } else if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        } else if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2)}));
        } else {
            byte[] k = m123687k(i3);
            byte b = bArr[i + 2];
            if (b == 61) {
                bArr2[i2] = (byte) ((((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            }
            byte b2 = bArr[i4];
            if (b2 == 61) {
                int i6 = ((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18) | ((k[b] & 255) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            byte b3 = ((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18) | ((k[b] & 255) << 6) | (k[b2] & 255);
            bArr2[i2] = (byte) (b3 >> 16);
            bArr2[i2 + 1] = (byte) (b3 >> 8);
            bArr2[i5] = (byte) b3;
            return 3;
        }
    }

    /* renamed from: e */
    private static byte[] m123681e(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        byte[] j = m123686j(i4);
        int i7 = 0;
        if (i2 > 0) {
            i5 = (bArr[i] << 24) >>> 8;
        } else {
            i5 = 0;
        }
        if (i2 > 1) {
            i6 = (bArr[i + 1] << 24) >>> 16;
        } else {
            i6 = 0;
        }
        int i8 = i5 | i6;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << 24) >>> 24;
        }
        int i9 = i8 | i7;
        if (i2 == 1) {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = j[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = j[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = j[i9 & 63];
            return bArr2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static byte[] m123682f(byte[] bArr, byte[] bArr2, int i, int i2) {
        m123681e(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: g */
    public static String m123683g(byte[] bArr) {
        try {
            return m123684h(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m123684h(byte[] bArr, int i, int i2, int i3) {
        byte[] i4 = m123685i(bArr, i, i2, i3);
        try {
            return new String(i4, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(i4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x005a A[SYNTHETIC, Splitter:B:46:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x005f A[SYNTHETIC, Splitter:B:50:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0064 A[SYNTHETIC, Splitter:B:54:0x0064] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m123685i(byte[] r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L_0x0126
            if (r7 < 0) goto L_0x010f
            if (r8 < 0) goto L_0x00f8
            int r1 = r7 + r8
            int r2 = r0.length
            r9 = 1
            if (r1 > r2) goto L_0x00d4
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0068
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            r2.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            ug1.a$a r3 = new ug1.a$a     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r3.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003c:
            r0 = move-exception
            goto L_0x0057
        L_0x003e:
            r0 = move-exception
            goto L_0x004b
        L_0x0040:
            r0 = move-exception
            goto L_0x0058
        L_0x0042:
            r0 = move-exception
            r4 = r1
            goto L_0x004b
        L_0x0045:
            r0 = move-exception
            r3 = r1
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x004b:
            r1 = r2
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x0058
        L_0x0051:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r2 = r1
        L_0x0057:
            r1 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r0
        L_0x0068:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x006e
            r11 = r9
            goto L_0x006f
        L_0x006e:
            r11 = 0
        L_0x006f:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * r12
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0079
            r2 = r12
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x0080
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x0080:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x008a:
            if (r6 >= r15) goto L_0x00b4
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            m123681e(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00ad
            r2 = 76
            if (r1 < r2) goto L_0x00ad
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00af
        L_0x00ad:
            r17 = r1
        L_0x00af:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L_0x008a
        L_0x00b4:
            r10 = r6
            if (r10 >= r8) goto L_0x00c7
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            m123681e(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c7:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto L_0x00d3
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        L_0x00d3:
            return r14
        L_0x00d4:
            r2 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r3[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r3[r9] = r2
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r3[r2] = r0
            java.lang.String r0 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x00f8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x010f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0126:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.C43101a.m123685i(byte[], int, int, int):byte[]");
    }

    /* renamed from: j */
    private static final byte[] m123686j(int i) {
        if ((i & 16) == 16) {
            return f100546c;
        }
        if ((i & 32) == 32) {
            return f100548e;
        }
        return f100544a;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final byte[] m123687k(int i) {
        if ((i & 16) == 16) {
            return f100547d;
        }
        if ((i & 32) == 32) {
            return f100549f;
        }
        return f100545b;
    }

    /* renamed from: ug1.a$a */
    public static class C43102a extends FilterOutputStream {

        /* renamed from: d */
        private boolean f100550d;

        /* renamed from: e */
        private int f100551e;

        /* renamed from: f */
        private byte[] f100552f;

        /* renamed from: g */
        private int f100553g;

        /* renamed from: h */
        private int f100554h;

        /* renamed from: i */
        private boolean f100555i;

        /* renamed from: j */
        private byte[] f100556j;

        /* renamed from: k */
        private boolean f100557k;

        /* renamed from: l */
        private int f100558l;

        /* renamed from: m */
        private byte[] f100559m;

        public C43102a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z;
            int i2;
            boolean z2 = true;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f100555i = z;
            z2 = (i & 1) == 0 ? false : z2;
            this.f100550d = z2;
            if (z2) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            this.f100553g = i2;
            this.f100552f = new byte[i2];
            this.f100551e = 0;
            this.f100554h = 0;
            this.f100557k = false;
            this.f100556j = new byte[4];
            this.f100558l = i;
            this.f100559m = C43101a.m123687k(i);
        }

        /* renamed from: a */
        public void mo101675a() {
            int i = this.f100551e;
            if (i <= 0) {
                return;
            }
            if (this.f100550d) {
                this.out.write(C43101a.m123682f(this.f100556j, this.f100552f, i, this.f100558l));
                this.f100551e = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void close() {
            mo101675a();
            super.close();
            this.f100552f = null;
            this.out = null;
        }

        public void write(int i) {
            if (this.f100557k) {
                this.out.write(i);
            } else if (this.f100550d) {
                byte[] bArr = this.f100552f;
                int i2 = this.f100551e;
                int i3 = i2 + 1;
                this.f100551e = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f100553g;
                if (i3 >= i4) {
                    this.out.write(C43101a.m123682f(this.f100556j, bArr, i4, this.f100558l));
                    int i5 = this.f100554h + 4;
                    this.f100554h = i5;
                    if (this.f100555i && i5 >= 76) {
                        this.out.write(10);
                        this.f100554h = 0;
                    }
                    this.f100551e = 0;
                }
            } else {
                byte b = this.f100559m[i & C11051p3.f31760d];
                if (b > -5) {
                    byte[] bArr2 = this.f100552f;
                    int i6 = this.f100551e;
                    int i7 = i6 + 1;
                    this.f100551e = i7;
                    bArr2[i6] = (byte) i;
                    if (i7 >= this.f100553g) {
                        this.out.write(this.f100556j, 0, C43101a.m123680d(bArr2, 0, this.f100556j, 0, this.f100558l));
                        this.f100551e = 0;
                    }
                } else if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f100557k) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }
}
