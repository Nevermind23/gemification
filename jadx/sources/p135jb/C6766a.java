package p135jb;

import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;
import java.util.List;
import p122ib.C6628a;
import p200ob.C7508b;
import p200ob.C7511e;
import p226qb.C8001a;
import p226qb.C8003c;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: jb.a */
public final class C6766a {

    /* renamed from: b */
    private static final String[] f20327b = {"CTRL_PS", " ", PensionStatusResult.STATUS_ACTIVE, "B", "C", "D", "E", "F", "G", "H", PensionStatusResult.STATUS_INACTIVE, "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", BankApiResponse.CODE_STATUS_WARNING, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f20328c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f20329d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f20330e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", C11110u2.f31950c, ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f20331f = {"CTRL_PS", " ", BankApiResponse.SUCCESSFUL_RESPONSE_CODE, "1", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID, "3", AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID, "5", AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID, "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a */
    private C6628a f20332a;

    /* renamed from: jb.a$a */
    static /* synthetic */ class C6767a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20333a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                jb.a$b[] r0 = p135jb.C6766a.C6768b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20333a = r0
                jb.a$b r1 = p135jb.C6766a.C6768b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20333a     // Catch:{ NoSuchFieldError -> 0x001d }
                jb.a$b r1 = p135jb.C6766a.C6768b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20333a     // Catch:{ NoSuchFieldError -> 0x0028 }
                jb.a$b r1 = p135jb.C6766a.C6768b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20333a     // Catch:{ NoSuchFieldError -> 0x0033 }
                jb.a$b r1 = p135jb.C6766a.C6768b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20333a     // Catch:{ NoSuchFieldError -> 0x003e }
                jb.a$b r1 = p135jb.C6766a.C6768b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p135jb.C6766a.C6767a.<clinit>():void");
        }
    }

    /* renamed from: jb.a$b */
    private enum C6768b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m26391a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = m26397h(zArr, i << 3);
        }
        return bArr;
    }

    /* renamed from: b */
    private boolean[] m26392b(boolean[] zArr) {
        int i;
        C8001a aVar;
        boolean z;
        boolean z2;
        if (this.f20332a.mo20660d() <= 2) {
            aVar = C8001a.f23053j;
            i = 6;
        } else {
            i = 8;
            if (this.f20332a.mo20660d() <= 8) {
                aVar = C8001a.f23057n;
            } else if (this.f20332a.mo20660d() <= 22) {
                aVar = C8001a.f23052i;
                i = 10;
            } else {
                aVar = C8001a.f23051h;
                i = 12;
            }
        }
        int c = this.f20332a.mo20659c();
        int length = zArr.length / i;
        if (length >= c) {
            int length2 = zArr.length % i;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = m26398i(zArr, length2, i);
                i2++;
                length2 += i;
            }
            try {
                new C8003c(aVar).mo23155a(iArr, length - c);
                int i3 = (1 << i) - 1;
                int i4 = 0;
                for (int i5 = 0; i5 < c; i5++) {
                    int i6 = iArr[i5];
                    if (i6 == 0 || i6 == i3) {
                        throw FormatException.m23153a();
                    }
                    if (i6 == 1 || i6 == i3 - 1) {
                        i4++;
                    }
                }
                boolean[] zArr2 = new boolean[((c * i) - i4)];
                int i7 = 0;
                for (int i8 = 0; i8 < c; i8++) {
                    int i9 = iArr[i8];
                    if (i9 == 1 || i9 == i3 - 1) {
                        int i12 = (i7 + i) - 1;
                        if (i9 > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Arrays.fill(zArr2, i7, i12, z);
                        i7 += i - 1;
                    } else {
                        int i13 = i - 1;
                        while (i13 >= 0) {
                            int i14 = i7 + 1;
                            if (((1 << i13) & i9) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zArr2[i7] = z2;
                            i13--;
                            i7 = i14;
                        }
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e) {
                throw FormatException.m23154b(e);
            }
        } else {
            throw FormatException.m23153a();
        }
    }

    /* renamed from: d */
    private boolean[] m26393d(C7508b bVar) {
        int i;
        int i2;
        C7508b bVar2 = bVar;
        boolean e = this.f20332a.mo20661e();
        int d = this.f20332a.mo20660d();
        if (e) {
            i = 11;
        } else {
            i = 14;
        }
        int i3 = i + (d << 2);
        int[] iArr = new int[i3];
        boolean[] zArr = new boolean[m26399j(d, e)];
        int i4 = 2;
        if (e) {
            for (int i5 = 0; i5 < i3; i5++) {
                iArr[i5] = i5;
            }
        } else {
            int i6 = i3 / 2;
            int i7 = ((i3 + 1) + (((i6 - 1) / 15) * 2)) / 2;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = (i8 / 15) + i8;
                iArr[(i6 - i8) - 1] = (i7 - i9) - 1;
                iArr[i6 + i8] = i9 + i7 + 1;
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < d) {
            int i14 = (d - i12) << i4;
            if (e) {
                i2 = 9;
            } else {
                i2 = 12;
            }
            int i15 = i14 + i2;
            int i16 = i12 << 1;
            int i17 = (i3 - 1) - i16;
            int i18 = 0;
            while (i18 < i15) {
                int i19 = i18 << 1;
                int i22 = 0;
                while (i22 < i4) {
                    int i23 = i16 + i22;
                    int i24 = i16 + i18;
                    zArr[i13 + i19 + i22] = bVar2.mo21974e(iArr[i23], iArr[i24]);
                    int i25 = iArr[i24];
                    int i26 = i17 - i22;
                    boolean z = e;
                    zArr[(i15 * 2) + i13 + i19 + i22] = bVar2.mo21974e(i25, iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i17 - i18;
                    zArr[(i15 * 4) + i13 + i19 + i22] = bVar2.mo21974e(i27, iArr[i28]);
                    zArr[(i15 * 6) + i13 + i19 + i22] = bVar2.mo21974e(iArr[i28], iArr[i23]);
                    i22++;
                    d = d;
                    e = z;
                    i4 = 2;
                }
                boolean z2 = e;
                int i29 = d;
                i18++;
                i4 = 2;
            }
            boolean z3 = e;
            int i32 = d;
            i13 += i15 << 3;
            i12++;
            i4 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m26394e(C6768b bVar, int i) {
        int i2 = C6767a.f20333a[bVar.ordinal()];
        if (i2 == 1) {
            return f20327b[i];
        }
        if (i2 == 2) {
            return f20328c[i];
        }
        if (i2 == 3) {
            return f20329d[i];
        }
        if (i2 == 4) {
            return f20330e[i];
        }
        if (i2 == 5) {
            return f20331f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    /* renamed from: f */
    private static String m26395f(boolean[] zArr) {
        int i;
        int length = zArr.length;
        C6768b bVar = C6768b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        C6768b bVar2 = bVar;
        int i2 = 0;
        while (i2 < length) {
            if (bVar == C6768b.BINARY) {
                if (length - i2 < 5) {
                    break;
                }
                int i3 = m26398i(zArr, i2, 5);
                i2 += 5;
                if (i3 == 0) {
                    if (length - i2 < 11) {
                        break;
                    }
                    i3 = m26398i(zArr, i2, 11) + 31;
                    i2 += 11;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        break;
                    } else if (length - i2 < 8) {
                        i2 = length;
                        break;
                    } else {
                        sb.append((char) m26398i(zArr, i2, 8));
                        i2 += 8;
                        i4++;
                    }
                }
            } else {
                if (bVar == C6768b.DIGIT) {
                    i = 4;
                } else {
                    i = 5;
                }
                if (length - i2 < i) {
                    break;
                }
                int i5 = m26398i(zArr, i2, i);
                i2 += i;
                String e = m26394e(bVar, i5);
                if (e.startsWith("CTRL_")) {
                    bVar2 = m26396g(e.charAt(5));
                    if (e.charAt(6) != 'L') {
                        C6768b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb.append(e);
                }
            }
            bVar = bVar2;
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static C6768b m26396g(char c) {
        if (c == 'B') {
            return C6768b.BINARY;
        }
        if (c == 'D') {
            return C6768b.DIGIT;
        }
        if (c == 'P') {
            return C6768b.PUNCT;
        }
        if (c == 'L') {
            return C6768b.LOWER;
        }
        if (c != 'M') {
            return C6768b.UPPER;
        }
        return C6768b.MIXED;
    }

    /* renamed from: h */
    private static byte m26397h(boolean[] zArr, int i) {
        int i2;
        int length = zArr.length - i;
        if (length >= 8) {
            i2 = m26398i(zArr, i, 8);
        } else {
            i2 = m26398i(zArr, i, length) << (8 - length);
        }
        return (byte) i2;
    }

    /* renamed from: i */
    private static int m26398i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    /* renamed from: j */
    private static int m26399j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    /* renamed from: c */
    public C7511e mo20818c(C6628a aVar) {
        this.f20332a = aVar;
        boolean[] b = m26392b(m26393d(aVar.mo22009a()));
        C7511e eVar = new C7511e(m26391a(b), m26395f(b), (List) null, (String) null);
        eVar.mo22005l(b.length);
        return eVar;
    }
}
