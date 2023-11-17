package p372cc;

import com.google.zxing.FormatException;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import p200ob.C7510d;
import p200ob.C7511e;
import p358bc.C10224c;

/* renamed from: cc.e */
abstract class C10386e {

    /* renamed from: a */
    private static final char[] f29581a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f29582b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f29583c;

    /* renamed from: cc.e$a */
    static /* synthetic */ class C10387a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29584a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cc.e$b[] r0 = p372cc.C10386e.C10388b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29584a = r0
                cc.e$b r1 = p372cc.C10386e.C10388b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29584a     // Catch:{ NoSuchFieldError -> 0x001d }
                cc.e$b r1 = p372cc.C10386e.C10388b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29584a     // Catch:{ NoSuchFieldError -> 0x0028 }
                cc.e$b r1 = p372cc.C10386e.C10388b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29584a     // Catch:{ NoSuchFieldError -> 0x0033 }
                cc.e$b r1 = p372cc.C10386e.C10388b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29584a     // Catch:{ NoSuchFieldError -> 0x003e }
                cc.e$b r1 = p372cc.C10386e.C10388b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29584a     // Catch:{ NoSuchFieldError -> 0x0049 }
                cc.e$b r1 = p372cc.C10386e.C10388b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p372cc.C10386e.C10387a.<clinit>():void");
        }
    }

    /* renamed from: cc.e$b */
    private enum C10388b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f29583c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f29583c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m37732a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 900;
        int i7 = 6;
        if (i6 == 901) {
            int[] iArr2 = new int[6];
            int i8 = i2 + 1;
            int i9 = iArr[i2];
            boolean z = false;
            int i12 = 0;
            while (true) {
                long j3 = 0;
                while (true) {
                    int i13 = iArr[0];
                    if (i5 < i13 && !z) {
                        int i14 = i4 + 1;
                        iArr2[i4] = i9;
                        j3 = (j3 * j) + ((long) i9);
                        int i15 = i5 + 1;
                        i9 = iArr[i5];
                        if (i9 != 928) {
                            switch (i9) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i9) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                        default:
                                            if (i14 % 5 != 0 || i14 <= 0) {
                                                i5 = i15;
                                                i4 = i14;
                                                j = 900;
                                                i7 = 6;
                                                break;
                                            } else {
                                                int i16 = 0;
                                                while (i16 < i7) {
                                                    byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i16) * 8))));
                                                    i16++;
                                                    i7 = 6;
                                                }
                                                i8 = i15;
                                                i12 = 0;
                                                j2 = 900;
                                            }
                                    }
                                    break;
                            }
                        }
                        i5 = i15 - 1;
                        i4 = i14;
                        j = 900;
                        i7 = 6;
                        z = true;
                    } else if (i5 == i13 && i9 < 900) {
                        iArr2[i4] = i9;
                        i4++;
                    }
                }
            }
            iArr2[i4] = i9;
            i4++;
            for (int i17 = 0; i17 < i4; i17++) {
                byteArrayOutputStream.write((byte) iArr2[i17]);
            }
            i3 = i5;
        } else if (i6 != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            int i18 = 0;
            while (true) {
                long j4 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i19 = i3 + 1;
                    int i22 = iArr[i3];
                    if (i22 < 900) {
                        i18++;
                        j4 = (j4 * 900) + ((long) i22);
                    } else {
                        if (i22 != 928) {
                            switch (i22) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i22) {
                                        case 922:
                                        case 923:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i3 = i19 - 1;
                        z2 = true;
                        if (i18 % 5 != 0 && i18 > 0) {
                            for (int i23 = 0; i23 < 6; i23++) {
                                byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i23) * 8))));
                            }
                            i18 = 0;
                        }
                    }
                    i3 = i19;
                    if (i18 % 5 != 0) {
                    }
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: b */
    static C7511e m37733b(int[] iArr, String str) {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        C10224c cVar = new C10224c();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        i = m37738g(iArr, i3, sb);
                        break;
                    case 901:
                        i = m37732a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = m37737f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.m23153a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(C7510d.m28557b(iArr[i3]).name());
                                break;
                            case 928:
                                i = m37735d(iArr, i3, cVar);
                                break;
                            default:
                                i = m37738g(iArr, i3 - 1, sb);
                                break;
                        }
                        i = m37732a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw FormatException.m23153a();
            }
        }
        if (sb.length() != 0) {
            C7511e eVar = new C7511e((byte[]) null, sb.toString(), (List) null, str);
            eVar.mo22006m(cVar);
            return eVar;
        }
        throw FormatException.m23153a();
    }

    /* renamed from: c */
    private static String m37734c(int[] iArr, int i) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f29583c[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.m23153a();
    }

    /* renamed from: d */
    static int m37735d(int[] iArr, int i, C10224c cVar) {
        int i2;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i];
                i3++;
                i++;
            }
            cVar.mo26786j(Integer.parseInt(m37734c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = m37738g(iArr, i, sb);
            cVar.mo26780d(sb.toString());
            if (iArr[g] == 923) {
                i2 = g + 1;
            } else {
                i2 = -1;
            }
            while (g < iArr[0]) {
                int i4 = iArr[g];
                if (i4 == 922) {
                    g++;
                    cVar.mo26783g(true);
                } else if (i4 == 923) {
                    int i5 = g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            g = m37738g(iArr, i5 + 1, sb2);
                            cVar.mo26781e(sb2.toString());
                            break;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            g = m37737f(iArr, i5 + 1, sb3);
                            cVar.mo26785i(Integer.parseInt(sb3.toString()));
                            break;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            g = m37737f(iArr, i5 + 1, sb4);
                            cVar.mo26788l(Long.parseLong(sb4.toString()));
                            break;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            g = m37738g(iArr, i5 + 1, sb5);
                            cVar.mo26787k(sb5.toString());
                            break;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            g = m37738g(iArr, i5 + 1, sb6);
                            cVar.mo26778b(sb6.toString());
                            break;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            g = m37737f(iArr, i5 + 1, sb7);
                            cVar.mo26782f(Long.parseLong(sb7.toString()));
                            break;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            g = m37737f(iArr, i5 + 1, sb8);
                            cVar.mo26779c(Integer.parseInt(sb8.toString()));
                            break;
                        default:
                            throw FormatException.m23153a();
                    }
                } else {
                    throw FormatException.m23153a();
                }
            }
            if (i2 != -1) {
                int i6 = g - i2;
                if (cVar.mo26777a()) {
                    i6--;
                }
                cVar.mo26784h(Arrays.copyOfRange(iArr, i2, i6 + i2));
            }
            return g;
        }
        throw FormatException.m23153a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b4, code lost:
        r6 = (char) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r6 = 0;
        r11 = r2;
        r2 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d5, code lost:
        if (r6 == 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        r15.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00da, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m37736e(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            r1 = 0
            r2 = r0
            r3 = r1
        L_0x0005:
            if (r3 >= r14) goto L_0x00de
            r4 = r12[r3]
            int[] r5 = p372cc.C10386e.C10387a.f29584a
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 29
            r8 = 26
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x0090;
                case 3: goto L_0x0069;
                case 4: goto L_0x004d;
                case 5: goto L_0x003a;
                case 6: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00d4
        L_0x0020:
            if (r4 >= r7) goto L_0x0027
            char[] r0 = f29581a
            char r6 = r0[r4]
            goto L_0x003f
        L_0x0027:
            if (r4 == r7) goto L_0x0036
            if (r4 == r10) goto L_0x0036
            if (r4 == r9) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r0 = r13[r3]
            char r0 = (char) r0
            r15.append(r0)
        L_0x0034:
            r6 = r1
            goto L_0x003f
        L_0x0036:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            goto L_0x00d4
        L_0x003a:
            if (r4 >= r8) goto L_0x0042
            int r4 = r4 + 65
            char r6 = (char) r4
        L_0x003f:
            r0 = r2
            goto L_0x00d5
        L_0x0042:
            if (r4 == r8) goto L_0x003f
            if (r4 == r10) goto L_0x0049
            r0 = r2
            goto L_0x00d4
        L_0x0049:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            goto L_0x00d4
        L_0x004d:
            if (r4 >= r7) goto L_0x0055
            char[] r5 = f29581a
            char r6 = r5[r4]
            goto L_0x00d5
        L_0x0055:
            if (r4 == r7) goto L_0x0065
            if (r4 == r10) goto L_0x0065
            if (r4 == r9) goto L_0x005d
            goto L_0x00d4
        L_0x005d:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d4
        L_0x0065:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            goto L_0x00d4
        L_0x0069:
            r5 = 25
            if (r4 >= r5) goto L_0x0073
            char[] r5 = f29582b
            char r6 = r5[r4]
            goto L_0x00d5
        L_0x0073:
            if (r4 == r10) goto L_0x008d
            if (r4 == r9) goto L_0x0086
            switch(r4) {
                case 25: goto L_0x0083;
                case 26: goto L_0x00d5;
                case 27: goto L_0x007f;
                case 28: goto L_0x008d;
                case 29: goto L_0x007c;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00d4
        L_0x007c:
            cc.e$b r2 = p372cc.C10386e.C10388b.PUNCT_SHIFT
            goto L_0x00c0
        L_0x007f:
            cc.e$b r0 = p372cc.C10386e.C10388b.LOWER
            goto L_0x00d4
        L_0x0083:
            cc.e$b r0 = p372cc.C10386e.C10388b.PUNCT
            goto L_0x00d4
        L_0x0086:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d4
        L_0x008d:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            goto L_0x00d4
        L_0x0090:
            if (r4 >= r8) goto L_0x0095
            int r4 = r4 + 97
            goto L_0x00b4
        L_0x0095:
            if (r4 == r10) goto L_0x00ad
            if (r4 == r9) goto L_0x00a6
            switch(r4) {
                case 26: goto L_0x00d5;
                case 27: goto L_0x00a3;
                case 28: goto L_0x00a0;
                case 29: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00d4
        L_0x009d:
            cc.e$b r2 = p372cc.C10386e.C10388b.PUNCT_SHIFT
            goto L_0x00c0
        L_0x00a0:
            cc.e$b r0 = p372cc.C10386e.C10388b.MIXED
            goto L_0x00d4
        L_0x00a3:
            cc.e$b r2 = p372cc.C10386e.C10388b.ALPHA_SHIFT
            goto L_0x00c0
        L_0x00a6:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d4
        L_0x00ad:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
            goto L_0x00d4
        L_0x00b0:
            if (r4 >= r8) goto L_0x00b6
            int r4 = r4 + 65
        L_0x00b4:
            char r6 = (char) r4
            goto L_0x00d5
        L_0x00b6:
            if (r4 == r10) goto L_0x00d2
            if (r4 == r9) goto L_0x00cb
            switch(r4) {
                case 26: goto L_0x00d5;
                case 27: goto L_0x00c8;
                case 28: goto L_0x00c5;
                case 29: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00d4
        L_0x00be:
            cc.e$b r2 = p372cc.C10386e.C10388b.PUNCT_SHIFT
        L_0x00c0:
            r6 = r1
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00d5
        L_0x00c5:
            cc.e$b r0 = p372cc.C10386e.C10388b.MIXED
            goto L_0x00d4
        L_0x00c8:
            cc.e$b r0 = p372cc.C10386e.C10388b.LOWER
            goto L_0x00d4
        L_0x00cb:
            r4 = r13[r3]
            char r4 = (char) r4
            r15.append(r4)
            goto L_0x00d4
        L_0x00d2:
            cc.e$b r0 = p372cc.C10386e.C10388b.ALPHA
        L_0x00d4:
            r6 = r1
        L_0x00d5:
            if (r6 == 0) goto L_0x00da
            r15.append(r6)
        L_0x00da:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p372cc.C10386e.m37736e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    private static int m37737f(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i >= i3 || z) {
                return i;
            }
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i4 == i3) {
                z = true;
            }
            if (i5 < 900) {
                iArr2[i2] = i5;
                i2++;
            } else {
                if (!(i5 == 900 || i5 == 901 || i5 == 928)) {
                    switch (i5) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i4--;
                z = true;
            }
            if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                sb.append(m37734c(iArr2, i2));
                i2 = 0;
            }
            i = i4;
        }
        return i;
    }

    /* renamed from: g */
    private static int m37738g(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[((i2 - i) << 1)];
        int[] iArr3 = new int[((i2 - i) << 1)];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m37736e(iArr2, iArr3, i3, sb);
        return i;
    }
}
