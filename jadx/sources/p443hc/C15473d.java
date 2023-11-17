package p443hc;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p200ob.C7509c;
import p200ob.C7510d;
import p200ob.C7511e;
import p200ob.C7518l;

/* renamed from: hc.d */
abstract class C15473d {

    /* renamed from: a */
    private static final char[] f43896a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: hc.d$a */
    static /* synthetic */ class C15474a {

        /* renamed from: a */
        static final /* synthetic */ int[] f43897a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                hc.h[] r0 = p443hc.C15478h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43897a = r0
                hc.h r1 = p443hc.C15478h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x001d }
                hc.h r1 = p443hc.C15478h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0028 }
                hc.h r1 = p443hc.C15478h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0033 }
                hc.h r1 = p443hc.C15478h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x003e }
                hc.h r1 = p443hc.C15478h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0049 }
                hc.h r1 = p443hc.C15478h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0054 }
                hc.h r1 = p443hc.C15478h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0060 }
                hc.h r1 = p443hc.C15478h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x006c }
                hc.h r1 = p443hc.C15478h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f43897a     // Catch:{ NoSuchFieldError -> 0x0078 }
                hc.h r1 = p443hc.C15478h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p443hc.C15473d.C15474a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static C7511e m55965a(byte[] bArr, C15480j jVar, C15476f fVar, Map map) {
        C15478h a;
        C15478h hVar;
        ArrayList arrayList;
        String str;
        C15480j jVar2 = jVar;
        C7509c cVar = new C7509c(bArr);
        StringBuilder sb = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        C7510d dVar = null;
        while (true) {
            try {
                if (cVar.mo21989a() < 4) {
                    a = C15478h.TERMINATOR;
                } else {
                    a = C15478h.m55983a(cVar.mo21992d(4));
                }
                C15478h hVar2 = a;
                int[] iArr = C15474a.f43897a;
                switch (iArr[hVar2.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        break;
                    case 8:
                        if (cVar.mo21989a() >= 16) {
                            int d = cVar.mo21992d(8);
                            i2 = cVar.mo21992d(8);
                            i = d;
                            break;
                        } else {
                            throw FormatException.m23153a();
                        }
                    case 9:
                        dVar = C7510d.m28557b(m55971g(cVar));
                        if (dVar != null) {
                            break;
                        } else {
                            throw FormatException.m23153a();
                        }
                    case 10:
                        int d2 = cVar.mo21992d(4);
                        int d3 = cVar.mo21992d(hVar2.mo42565c(jVar2));
                        if (d2 == z) {
                            m55968d(cVar, sb, d3);
                            break;
                        }
                        break;
                    default:
                        int d4 = cVar.mo21992d(hVar2.mo42565c(jVar2));
                        int i3 = iArr[hVar2.ordinal()];
                        if (i3 != z) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    hVar = hVar2;
                                    m55967c(cVar, sb, d4, dVar, arrayList2, map);
                                    break;
                                } else if (i3 == 4) {
                                    m55969e(cVar, sb, d4);
                                    break;
                                } else {
                                    throw FormatException.m23153a();
                                }
                            } else {
                                hVar = hVar2;
                                m55966b(cVar, sb, d4, z2);
                                break;
                            }
                        } else {
                            hVar = hVar2;
                            m55970f(cVar, sb, d4);
                            break;
                        }
                }
                hVar = hVar2;
                if (hVar == C15478h.TERMINATOR) {
                    String sb2 = sb.toString();
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    if (fVar == null) {
                        str = null;
                    } else {
                        str = fVar.toString();
                    }
                    return new C7511e(bArr, sb2, arrayList, str, i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.m23153a();
            }
        }
    }

    /* renamed from: b */
    private static void m55966b(C7509c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo21989a() >= 11) {
                int d = cVar.mo21992d(11);
                sb.append(m55972h(d / 45));
                sb.append(m55972h(d % 45));
                i -= 2;
            } else {
                throw FormatException.m23153a();
            }
        }
        if (i == 1) {
            if (cVar.mo21989a() >= 6) {
                sb.append(m55972h(cVar.mo21992d(6)));
            } else {
                throw FormatException.m23153a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m55967c(C7509c cVar, StringBuilder sb, int i, C7510d dVar, Collection collection, Map map) {
        String str;
        if ((i << 3) <= cVar.mo21989a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo21992d(8);
            }
            if (dVar == null) {
                str = C7518l.m28596a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m23153a();
            }
        } else {
            throw FormatException.m23153a();
        }
    }

    /* renamed from: d */
    private static void m55968d(C7509c cVar, StringBuilder sb, int i) {
        int i2;
        if (i * 13 <= cVar.mo21989a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.mo21992d(13);
                int i4 = (d % 96) | ((d / 96) << 8);
                if (i4 < 2560) {
                    i2 = 41377;
                } else {
                    i2 = 42657;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m23153a();
            }
        } else {
            throw FormatException.m23153a();
        }
    }

    /* renamed from: e */
    private static void m55969e(C7509c cVar, StringBuilder sb, int i) {
        int i2;
        if (i * 13 <= cVar.mo21989a()) {
            byte[] bArr = new byte[(i * 2)];
            int i3 = 0;
            while (i > 0) {
                int d = cVar.mo21992d(13);
                int i4 = (d % 192) | ((d / 192) << 8);
                if (i4 < 7936) {
                    i2 = 33088;
                } else {
                    i2 = 49472;
                }
                int i5 = i4 + i2;
                bArr[i3] = (byte) (i5 >> 8);
                bArr[i3 + 1] = (byte) i5;
                i3 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m23153a();
            }
        } else {
            throw FormatException.m23153a();
        }
    }

    /* renamed from: f */
    private static void m55970f(C7509c cVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (cVar.mo21989a() >= 10) {
                int d = cVar.mo21992d(10);
                if (d < 1000) {
                    sb.append(m55972h(d / 100));
                    sb.append(m55972h((d / 10) % 10));
                    sb.append(m55972h(d % 10));
                    i -= 3;
                } else {
                    throw FormatException.m23153a();
                }
            } else {
                throw FormatException.m23153a();
            }
        }
        if (i == 2) {
            if (cVar.mo21989a() >= 7) {
                int d2 = cVar.mo21992d(7);
                if (d2 < 100) {
                    sb.append(m55972h(d2 / 10));
                    sb.append(m55972h(d2 % 10));
                    return;
                }
                throw FormatException.m23153a();
            }
            throw FormatException.m23153a();
        } else if (i != 1) {
        } else {
            if (cVar.mo21989a() >= 4) {
                int d3 = cVar.mo21992d(4);
                if (d3 < 10) {
                    sb.append(m55972h(d3));
                    return;
                }
                throw FormatException.m23153a();
            }
            throw FormatException.m23153a();
        }
    }

    /* renamed from: g */
    private static int m55971g(C7509c cVar) {
        int d = cVar.mo21992d(8);
        if ((d & 128) == 0) {
            return d & C11051p3.f31760d;
        }
        if ((d & 192) == 128) {
            return cVar.mo21992d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo21992d(16) | ((d & 31) << 16);
        }
        throw FormatException.m23153a();
    }

    /* renamed from: h */
    private static char m55972h(int i) {
        char[] cArr = f43896a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m23153a();
    }
}
