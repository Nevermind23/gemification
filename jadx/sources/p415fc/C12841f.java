package p415fc;

import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p200ob.C7510d;

/* renamed from: fc.f */
abstract class C12841f {

    /* renamed from: a */
    private static final byte[] f37961a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f37962b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f37963c;

    /* renamed from: d */
    private static final byte[] f37964d = new byte[128];

    /* renamed from: e */
    private static final Charset f37965e = StandardCharsets.ISO_8859_1;

    /* renamed from: fc.f$a */
    static /* synthetic */ class C12842a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37966a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                fc.c[] r0 = p415fc.C12838c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37966a = r0
                fc.c r1 = p415fc.C12838c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37966a     // Catch:{ NoSuchFieldError -> 0x001d }
                fc.c r1 = p415fc.C12838c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37966a     // Catch:{ NoSuchFieldError -> 0x0028 }
                fc.c r1 = p415fc.C12838c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p415fc.C12841f.C12842a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        f37963c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f37961a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f37963c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f37964d, (byte) -1);
        while (true) {
            byte[] bArr3 = f37962b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f37964d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m48605a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = m48615k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p415fc.C12841f.m48605a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    /* renamed from: b */
    private static int m48606b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m48615k(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    private static int m48607c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m48615k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m48618n(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: d */
    private static void m48608d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append(913);
        } else if (i2 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: e */
    static String m48609e(String str, C12838c cVar, Charset charset) {
        C7510d a;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f37965e;
        } else if (!f37965e.equals(charset) && (a = C7510d.m28556a(charset.name())) != null) {
            m48612h(a.mo21993c(), sb);
        }
        int length = str.length();
        int i = C12842a.f37966a[cVar.ordinal()];
        if (i == 1) {
            m48611g(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m48608d(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int b = m48606b(str, i2);
                if (b >= 13) {
                    sb.append(902);
                    m48610f(str, i2, b, sb);
                    i2 += b;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int c = m48607c(str, i2);
                    if (c >= 5 || b == length) {
                        if (i4 != 0) {
                            sb.append(900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = m48611g(str, i2, c, sb, i3);
                        i2 += c;
                    } else {
                        int a2 = m48605a(str, i2, charset);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i5 = a2 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m48608d(bytes2, 0, 1, 0, sb);
                        } else {
                            m48608d(bytes2, 0, bytes2.length, i4, sb);
                            i4 = 1;
                            i3 = 0;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append(902);
            m48610f(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static void m48610f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x000f A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m48611g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 0
            r5 = r20
            r6 = r4
        L_0x000f:
            int r7 = r17 + r6
            char r8 = r0.charAt(r7)
            r9 = 26
            r10 = 32
            r11 = 28
            r12 = 27
            r13 = 29
            r14 = 2
            r15 = 1
            if (r5 == 0) goto L_0x00bc
            if (r5 == r15) goto L_0x0083
            if (r5 == r14) goto L_0x003c
            boolean r7 = m48617m(r8)
            if (r7 == 0) goto L_0x0037
            byte[] r7 = f37964d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f2
        L_0x0037:
            r3.append(r13)
        L_0x003a:
            r5 = r4
            goto L_0x000f
        L_0x003c:
            boolean r9 = m48616l(r8)
            if (r9 == 0) goto L_0x004c
            byte[] r7 = f37963c
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f2
        L_0x004c:
            boolean r9 = m48614j(r8)
            if (r9 == 0) goto L_0x0056
            r3.append(r11)
            goto L_0x003a
        L_0x0056:
            boolean r9 = m48613i(r8)
            if (r9 == 0) goto L_0x0061
            r3.append(r12)
            goto L_0x00d8
        L_0x0061:
            int r7 = r7 + 1
            if (r7 >= r1) goto L_0x0076
            char r7 = r0.charAt(r7)
            boolean r7 = m48617m(r7)
            if (r7 == 0) goto L_0x0076
            r5 = 25
            r3.append(r5)
            r5 = 3
            goto L_0x000f
        L_0x0076:
            r3.append(r13)
            byte[] r7 = f37964d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f2
        L_0x0083:
            boolean r7 = m48613i(r8)
            if (r7 == 0) goto L_0x0096
            if (r8 != r10) goto L_0x008f
            r3.append(r9)
            goto L_0x00f2
        L_0x008f:
            int r8 = r8 + -97
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f2
        L_0x0096:
            boolean r7 = m48614j(r8)
            if (r7 == 0) goto L_0x00a6
            r3.append(r12)
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f2
        L_0x00a6:
            boolean r7 = m48616l(r8)
            if (r7 == 0) goto L_0x00b0
            r3.append(r11)
            goto L_0x00e4
        L_0x00b0:
            r3.append(r13)
            byte[] r7 = f37964d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f2
        L_0x00bc:
            boolean r7 = m48614j(r8)
            if (r7 == 0) goto L_0x00cf
            if (r8 != r10) goto L_0x00c8
            r3.append(r9)
            goto L_0x00f2
        L_0x00c8:
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f2
        L_0x00cf:
            boolean r7 = m48613i(r8)
            if (r7 == 0) goto L_0x00db
            r3.append(r12)
        L_0x00d8:
            r5 = r15
            goto L_0x000f
        L_0x00db:
            boolean r7 = m48616l(r8)
            if (r7 == 0) goto L_0x00e7
            r3.append(r11)
        L_0x00e4:
            r5 = r14
            goto L_0x000f
        L_0x00e7:
            r3.append(r13)
            byte[] r7 = f37964d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
        L_0x00f2:
            int r6 = r6 + 1
            if (r6 < r1) goto L_0x000f
            int r0 = r3.length()
            r1 = r4
            r6 = r1
        L_0x00fc:
            if (r1 >= r0) goto L_0x011a
            int r7 = r1 % 2
            if (r7 == 0) goto L_0x0104
            r7 = r15
            goto L_0x0105
        L_0x0104:
            r7 = r4
        L_0x0105:
            if (r7 == 0) goto L_0x0113
            int r6 = r6 * 30
            char r7 = r3.charAt(r1)
            int r6 = r6 + r7
            char r6 = (char) r6
            r2.append(r6)
            goto L_0x0117
        L_0x0113:
            char r6 = r3.charAt(r1)
        L_0x0117:
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x011a:
            int r0 = r0 % r14
            if (r0 == 0) goto L_0x0124
            int r6 = r6 * 30
            int r6 = r6 + r13
            char r0 = (char) r6
            r2.append(r0)
        L_0x0124:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p415fc.C12841f.m48611g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    private static void m48612h(int i, StringBuilder sb) {
        if (i >= 0 && i < 900) {
            sb.append(927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: i */
    private static boolean m48613i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m48614j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m48615k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    private static boolean m48616l(char c) {
        return f37963c[c] != -1;
    }

    /* renamed from: m */
    private static boolean m48617m(char c) {
        return f37964d[c] != -1;
    }

    /* renamed from: n */
    private static boolean m48618n(char c) {
        if (c == 9 || c == 10 || c == 13) {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
