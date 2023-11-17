package ug1;

import com.salesforce.marketingcloud.C11398b;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import org.java_websocket.exceptions.InvalidDataException;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: ug1.c */
public abstract class C43104c {

    /* renamed from: a */
    private static final CodingErrorAction f100560a = CodingErrorAction.REPORT;

    /* renamed from: b */
    private static final int[] f100561b;

    static {
        int[] iArr = new int[TextTypeView.SEPARATOR_FULL];
        // fill-array-data instruction
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
        iArr[10] = 0;
        iArr[11] = 0;
        iArr[12] = 0;
        iArr[13] = 0;
        iArr[14] = 0;
        iArr[15] = 0;
        iArr[16] = 0;
        iArr[17] = 0;
        iArr[18] = 0;
        iArr[19] = 0;
        iArr[20] = 0;
        iArr[21] = 0;
        iArr[22] = 0;
        iArr[23] = 0;
        iArr[24] = 0;
        iArr[25] = 0;
        iArr[26] = 0;
        iArr[27] = 0;
        iArr[28] = 0;
        iArr[29] = 0;
        iArr[30] = 0;
        iArr[31] = 0;
        iArr[32] = 0;
        iArr[33] = 0;
        iArr[34] = 0;
        iArr[35] = 0;
        iArr[36] = 0;
        iArr[37] = 0;
        iArr[38] = 0;
        iArr[39] = 0;
        iArr[40] = 0;
        iArr[41] = 0;
        iArr[42] = 0;
        iArr[43] = 0;
        iArr[44] = 0;
        iArr[45] = 0;
        iArr[46] = 0;
        iArr[47] = 0;
        iArr[48] = 0;
        iArr[49] = 0;
        iArr[50] = 0;
        iArr[51] = 0;
        iArr[52] = 0;
        iArr[53] = 0;
        iArr[54] = 0;
        iArr[55] = 0;
        iArr[56] = 0;
        iArr[57] = 0;
        iArr[58] = 0;
        iArr[59] = 0;
        iArr[60] = 0;
        iArr[61] = 0;
        iArr[62] = 0;
        iArr[63] = 0;
        iArr[64] = 0;
        iArr[65] = 0;
        iArr[66] = 0;
        iArr[67] = 0;
        iArr[68] = 0;
        iArr[69] = 0;
        iArr[70] = 0;
        iArr[71] = 0;
        iArr[72] = 0;
        iArr[73] = 0;
        iArr[74] = 0;
        iArr[75] = 0;
        iArr[76] = 0;
        iArr[77] = 0;
        iArr[78] = 0;
        iArr[79] = 0;
        iArr[80] = 0;
        iArr[81] = 0;
        iArr[82] = 0;
        iArr[83] = 0;
        iArr[84] = 0;
        iArr[85] = 0;
        iArr[86] = 0;
        iArr[87] = 0;
        iArr[88] = 0;
        iArr[89] = 0;
        iArr[90] = 0;
        iArr[91] = 0;
        iArr[92] = 0;
        iArr[93] = 0;
        iArr[94] = 0;
        iArr[95] = 0;
        iArr[96] = 0;
        iArr[97] = 0;
        iArr[98] = 0;
        iArr[99] = 0;
        iArr[100] = 0;
        iArr[101] = 0;
        iArr[102] = 0;
        iArr[103] = 0;
        iArr[104] = 0;
        iArr[105] = 0;
        iArr[106] = 0;
        iArr[107] = 0;
        iArr[108] = 0;
        iArr[109] = 0;
        iArr[110] = 0;
        iArr[111] = 0;
        iArr[112] = 0;
        iArr[113] = 0;
        iArr[114] = 0;
        iArr[115] = 0;
        iArr[116] = 0;
        iArr[117] = 0;
        iArr[118] = 0;
        iArr[119] = 0;
        iArr[120] = 0;
        iArr[121] = 0;
        iArr[122] = 0;
        iArr[123] = 0;
        iArr[124] = 0;
        iArr[125] = 0;
        iArr[126] = 0;
        iArr[127] = 0;
        iArr[128] = 1;
        iArr[129] = 1;
        iArr[130] = 1;
        iArr[131] = 1;
        iArr[132] = 1;
        iArr[133] = 1;
        iArr[134] = 1;
        iArr[135] = 1;
        iArr[136] = 1;
        iArr[137] = 1;
        iArr[138] = 1;
        iArr[139] = 1;
        iArr[140] = 1;
        iArr[141] = 1;
        iArr[142] = 1;
        iArr[143] = 1;
        iArr[144] = 9;
        iArr[145] = 9;
        iArr[146] = 9;
        iArr[147] = 9;
        iArr[148] = 9;
        iArr[149] = 9;
        iArr[150] = 9;
        iArr[151] = 9;
        iArr[152] = 9;
        iArr[153] = 9;
        iArr[154] = 9;
        iArr[155] = 9;
        iArr[156] = 9;
        iArr[157] = 9;
        iArr[158] = 9;
        iArr[159] = 9;
        iArr[160] = 7;
        iArr[161] = 7;
        iArr[162] = 7;
        iArr[163] = 7;
        iArr[164] = 7;
        iArr[165] = 7;
        iArr[166] = 7;
        iArr[167] = 7;
        iArr[168] = 7;
        iArr[169] = 7;
        iArr[170] = 7;
        iArr[171] = 7;
        iArr[172] = 7;
        iArr[173] = 7;
        iArr[174] = 7;
        iArr[175] = 7;
        iArr[176] = 7;
        iArr[177] = 7;
        iArr[178] = 7;
        iArr[179] = 7;
        iArr[180] = 7;
        iArr[181] = 7;
        iArr[182] = 7;
        iArr[183] = 7;
        iArr[184] = 7;
        iArr[185] = 7;
        iArr[186] = 7;
        iArr[187] = 7;
        iArr[188] = 7;
        iArr[189] = 7;
        iArr[190] = 7;
        iArr[191] = 7;
        iArr[192] = 8;
        iArr[193] = 8;
        iArr[194] = 2;
        iArr[195] = 2;
        iArr[196] = 2;
        iArr[197] = 2;
        iArr[198] = 2;
        iArr[199] = 2;
        iArr[200] = 2;
        iArr[201] = 2;
        iArr[202] = 2;
        iArr[203] = 2;
        iArr[204] = 2;
        iArr[205] = 2;
        iArr[206] = 2;
        iArr[207] = 2;
        iArr[208] = 2;
        iArr[209] = 2;
        iArr[210] = 2;
        iArr[211] = 2;
        iArr[212] = 2;
        iArr[213] = 2;
        iArr[214] = 2;
        iArr[215] = 2;
        iArr[216] = 2;
        iArr[217] = 2;
        iArr[218] = 2;
        iArr[219] = 2;
        iArr[220] = 2;
        iArr[221] = 2;
        iArr[222] = 2;
        iArr[223] = 2;
        iArr[224] = 10;
        iArr[225] = 3;
        iArr[226] = 3;
        iArr[227] = 3;
        iArr[228] = 3;
        iArr[229] = 3;
        iArr[230] = 3;
        iArr[231] = 3;
        iArr[232] = 3;
        iArr[233] = 3;
        iArr[234] = 3;
        iArr[235] = 3;
        iArr[236] = 3;
        iArr[237] = 4;
        iArr[238] = 3;
        iArr[239] = 3;
        iArr[240] = 11;
        iArr[241] = 6;
        iArr[242] = 6;
        iArr[243] = 6;
        iArr[244] = 5;
        iArr[245] = 8;
        iArr[246] = 8;
        iArr[247] = 8;
        iArr[248] = 8;
        iArr[249] = 8;
        iArr[250] = 8;
        iArr[251] = 8;
        iArr[252] = 8;
        iArr[253] = 8;
        iArr[254] = 8;
        iArr[255] = 8;
        iArr[256] = 0;
        iArr[257] = 1;
        iArr[258] = 2;
        iArr[259] = 3;
        iArr[260] = 5;
        iArr[261] = 8;
        iArr[262] = 7;
        iArr[263] = 1;
        iArr[264] = 1;
        iArr[265] = 1;
        iArr[266] = 4;
        iArr[267] = 6;
        iArr[268] = 1;
        iArr[269] = 1;
        iArr[270] = 1;
        iArr[271] = 1;
        iArr[272] = 1;
        iArr[273] = 1;
        iArr[274] = 1;
        iArr[275] = 1;
        iArr[276] = 1;
        iArr[277] = 1;
        iArr[278] = 1;
        iArr[279] = 1;
        iArr[280] = 1;
        iArr[281] = 1;
        iArr[282] = 1;
        iArr[283] = 1;
        iArr[284] = 1;
        iArr[285] = 1;
        iArr[286] = 1;
        iArr[287] = 1;
        iArr[288] = 1;
        iArr[289] = 0;
        iArr[290] = 1;
        iArr[291] = 1;
        iArr[292] = 1;
        iArr[293] = 1;
        iArr[294] = 1;
        iArr[295] = 0;
        iArr[296] = 1;
        iArr[297] = 0;
        iArr[298] = 1;
        iArr[299] = 1;
        iArr[300] = 1;
        iArr[301] = 1;
        iArr[302] = 1;
        iArr[303] = 1;
        iArr[304] = 1;
        iArr[305] = 2;
        iArr[306] = 1;
        iArr[307] = 1;
        iArr[308] = 1;
        iArr[309] = 1;
        iArr[310] = 1;
        iArr[311] = 2;
        iArr[312] = 1;
        iArr[313] = 2;
        iArr[314] = 1;
        iArr[315] = 1;
        iArr[316] = 1;
        iArr[317] = 1;
        iArr[318] = 1;
        iArr[319] = 1;
        iArr[320] = 1;
        iArr[321] = 1;
        iArr[322] = 1;
        iArr[323] = 1;
        iArr[324] = 1;
        iArr[325] = 1;
        iArr[326] = 1;
        iArr[327] = 2;
        iArr[328] = 1;
        iArr[329] = 1;
        iArr[330] = 1;
        iArr[331] = 1;
        iArr[332] = 1;
        iArr[333] = 1;
        iArr[334] = 1;
        iArr[335] = 1;
        iArr[336] = 1;
        iArr[337] = 2;
        iArr[338] = 1;
        iArr[339] = 1;
        iArr[340] = 1;
        iArr[341] = 1;
        iArr[342] = 1;
        iArr[343] = 1;
        iArr[344] = 1;
        iArr[345] = 2;
        iArr[346] = 1;
        iArr[347] = 1;
        iArr[348] = 1;
        iArr[349] = 1;
        iArr[350] = 1;
        iArr[351] = 1;
        iArr[352] = 1;
        iArr[353] = 1;
        iArr[354] = 1;
        iArr[355] = 1;
        iArr[356] = 1;
        iArr[357] = 1;
        iArr[358] = 1;
        iArr[359] = 3;
        iArr[360] = 1;
        iArr[361] = 3;
        iArr[362] = 1;
        iArr[363] = 1;
        iArr[364] = 1;
        iArr[365] = 1;
        iArr[366] = 1;
        iArr[367] = 1;
        iArr[368] = 1;
        iArr[369] = 3;
        iArr[370] = 1;
        iArr[371] = 1;
        iArr[372] = 1;
        iArr[373] = 1;
        iArr[374] = 1;
        iArr[375] = 3;
        iArr[376] = 1;
        iArr[377] = 3;
        iArr[378] = 1;
        iArr[379] = 1;
        iArr[380] = 1;
        iArr[381] = 1;
        iArr[382] = 1;
        iArr[383] = 1;
        iArr[384] = 1;
        iArr[385] = 3;
        iArr[386] = 1;
        iArr[387] = 1;
        iArr[388] = 1;
        iArr[389] = 1;
        iArr[390] = 1;
        iArr[391] = 1;
        iArr[392] = 1;
        iArr[393] = 1;
        iArr[394] = 1;
        iArr[395] = 1;
        iArr[396] = 1;
        iArr[397] = 1;
        iArr[398] = 1;
        iArr[399] = 1;
        f100561b = iArr;
    }

    /* renamed from: a */
    public static byte[] m123690a(String str) {
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    /* renamed from: b */
    public static boolean m123691b(ByteBuffer byteBuffer) {
        return m123692c(byteBuffer, 0);
    }

    /* renamed from: c */
    public static boolean m123692c(ByteBuffer byteBuffer, int i) {
        int remaining = byteBuffer.remaining();
        if (remaining < i) {
            return false;
        }
        int i2 = 0;
        while (i < remaining) {
            int[] iArr = f100561b;
            i2 = iArr[(i2 << 4) + C11398b.f33139r + iArr[byteBuffer.get(i) & 255]];
            if (i2 == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: d */
    public static String m123693d(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.US_ASCII);
    }

    /* renamed from: e */
    public static String m123694e(ByteBuffer byteBuffer) {
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = f100560a;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        try {
            byteBuffer.mark();
            String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (CharacterCodingException e) {
            throw new InvalidDataException(1007, (Throwable) e);
        }
    }

    /* renamed from: f */
    public static byte[] m123695f(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }
}