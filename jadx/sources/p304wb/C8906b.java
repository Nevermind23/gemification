package p304wb;

import java.text.DecimalFormat;
import java.util.List;
import p200ob.C7511e;

/* renamed from: wb.b */
abstract class C8906b {

    /* renamed from: a */
    private static final String[] f24920a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    /* renamed from: a */
    static C7511e m33088a(byte[] bArr, int i) {
        String str;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            if (i == 2) {
                str = new DecimalFormat("0000000000".substring(0, m33094g(bArr))).format((long) m33093f(bArr));
            } else {
                str = m33095h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) m33090c(bArr));
            String format2 = decimalFormat.format((long) m33096i(bArr));
            sb.append(m33092e(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, str + 29 + format + 29 + format2 + 29);
            } else {
                sb.insert(0, str + 29 + format + 29 + format2 + 29);
            }
        } else if (i == 4) {
            sb.append(m33092e(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(m33092e(bArr, 1, 77));
        }
        return new C7511e(bArr, sb.toString(), (List) null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m33089b(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    private static int m33090c(byte[] bArr) {
        return m33091d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    private static int m33091d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m33089b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (r5 != 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m33092e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            r2 = 0
            r3 = r13
            r5 = r1
            r4 = r2
            r6 = r4
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0069
            java.lang.String[] r7 = f24920a
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x005a;
                case 65521: goto L_0x005a;
                case 65522: goto L_0x005a;
                case 65523: goto L_0x005a;
                case 65524: goto L_0x005a;
                case 65525: goto L_0x0056;
                case 65526: goto L_0x0054;
                case 65527: goto L_0x0052;
                case 65528: goto L_0x004f;
                case 65529: goto L_0x004d;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x0061
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x0061
        L_0x004d:
            r5 = r1
            goto L_0x0061
        L_0x004f:
            r5 = r1
            r4 = r8
            goto L_0x0061
        L_0x0052:
            r5 = r1
            goto L_0x0058
        L_0x0054:
            r5 = 3
            goto L_0x0057
        L_0x0056:
            r5 = 2
        L_0x0057:
            r6 = r4
        L_0x0058:
            r4 = r2
            goto L_0x0061
        L_0x005a:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = r8
        L_0x0061:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0066
            r4 = r6
        L_0x0066:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0069:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0086
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0086
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0069
        L_0x0086:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p304wb.C8906b.m33092e(byte[], int, int):java.lang.String");
    }

    /* renamed from: f */
    private static int m33093f(byte[] bArr) {
        return m33091d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    private static int m33094g(byte[] bArr) {
        return m33091d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    private static String m33095h(byte[] bArr) {
        String[] strArr = f24920a;
        return String.valueOf(new char[]{strArr[0].charAt(m33091d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m33091d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m33091d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m33091d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m33091d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m33091d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    private static int m33096i(byte[] bArr) {
        return m33091d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
