package p471jc;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p200ob.C7507a;
import p200ob.C7510d;
import p226qb.C8001a;
import p226qb.C8004d;
import p443hc.C15476f;
import p443hc.C15478h;
import p443hc.C15480j;

/* renamed from: jc.c */
public abstract class C15739c {

    /* renamed from: a */
    private static final int[] f44619a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: jc.c$a */
    static /* synthetic */ class C15740a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                hc.h[] r0 = p443hc.C15478h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44620a = r0
                hc.h r1 = p443hc.C15478h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44620a     // Catch:{ NoSuchFieldError -> 0x001d }
                hc.h r1 = p443hc.C15478h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44620a     // Catch:{ NoSuchFieldError -> 0x0028 }
                hc.h r1 = p443hc.C15478h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44620a     // Catch:{ NoSuchFieldError -> 0x0033 }
                hc.h r1 = p443hc.C15478h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p471jc.C15739c.C15740a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static void m56670a(String str, C7507a aVar, String str2) {
        try {
            for (byte c : str.getBytes(str2)) {
                aVar.mo21951c(c, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* renamed from: b */
    static void m56671b(CharSequence charSequence, C7507a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int p = m56685p(charSequence.charAt(i));
            if (p != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int p2 = m56685p(charSequence.charAt(i2));
                    if (p2 != -1) {
                        aVar.mo21951c((p * 45) + p2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo21951c(p, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    static void m56672c(String str, C15478h hVar, C7507a aVar, String str2) {
        int i = C15740a.f44620a[hVar.ordinal()];
        if (i == 1) {
            m56677h(str, aVar);
        } else if (i == 2) {
            m56671b(str, aVar);
        } else if (i == 3) {
            m56670a(str, aVar, str2);
        } else if (i == 4) {
            m56674e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(hVar)));
        }
    }

    /* renamed from: d */
    private static void m56673d(C7510d dVar, C7507a aVar) {
        aVar.mo21951c(C15478h.ECI.mo42564b(), 4);
        aVar.mo21951c(dVar.mo21993c(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m56674e(java.lang.String r6, p200ob.C7507a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = r4
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo21951c(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p471jc.C15739c.m56674e(java.lang.String, ob.a):void");
    }

    /* renamed from: f */
    static void m56675f(int i, C15480j jVar, C15478h hVar, C7507a aVar) {
        int c = hVar.mo42565c(jVar);
        int i2 = 1 << c;
        if (i < i2) {
            aVar.mo21951c(i, c);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m56676g(C15478h hVar, C7507a aVar) {
        aVar.mo21951c(hVar.mo42564b(), 4);
    }

    /* renamed from: h */
    static void m56677h(CharSequence charSequence, C7507a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo21951c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo21951c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo21951c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m56678i(C15478h hVar, C7507a aVar, C7507a aVar2, C15480j jVar) {
        return aVar.mo21961l() + hVar.mo42565c(jVar) + aVar2.mo21961l();
    }

    /* renamed from: j */
    private static int m56679j(C15738b bVar) {
        return C15741d.m56692a(bVar) + C15741d.m56694c(bVar) + C15741d.m56695d(bVar) + C15741d.m56696e(bVar);
    }

    /* renamed from: k */
    private static int m56680k(C7507a aVar, C15476f fVar, C15480j jVar, C15738b bVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C15742e.m56700a(aVar, fVar, jVar, i3, bVar);
            int j = m56679j(bVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static C15478h m56681l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m56688s(str)) {
            return C15478h.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m56685p(charAt) == -1) {
                return C15478h.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return C15478h.ALPHANUMERIC;
        }
        if (z2) {
            return C15478h.NUMERIC;
        }
        return C15478h.BYTE;
    }

    /* renamed from: m */
    private static C15480j m56682m(int i, C15476f fVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C15480j i3 = C15480j.m55990i(i2);
            if (m56691v(i, i3, fVar)) {
                return i3;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        if (p471jc.C15743f.m56719b(r9) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p471jc.C15743f m56683n(java.lang.String r7, p443hc.C15476f r8, java.util.Map r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            com.google.zxing.f r2 = com.google.zxing.C5756f.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            com.google.zxing.f r3 = com.google.zxing.C5756f.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            hc.h r4 = m56681l(r7, r3)
            ob.a r5 = new ob.a
            r5.<init>()
            hc.h r6 = p443hc.C15478h.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            ob.d r2 = p200ob.C7510d.m28556a(r3)
            if (r2 == 0) goto L_0x0036
            m56673d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            com.google.zxing.f r2 = com.google.zxing.C5756f.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = r1
        L_0x0042:
            if (r0 == 0) goto L_0x0059
            com.google.zxing.f r0 = com.google.zxing.C5756f.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x0059
            hc.h r0 = p443hc.C15478h.FNC1_FIRST_POSITION
            m56676g(r0, r5)
        L_0x0059:
            m56676g(r4, r5)
            ob.a r0 = new ob.a
            r0.<init>()
            m56672c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0091
            com.google.zxing.f r1 = com.google.zxing.C5756f.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0091
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            hc.j r1 = p443hc.C15480j.m55990i(r1)
            int r2 = m56678i(r4, r5, r0, r1)
            boolean r2 = m56691v(r2, r1, r8)
            if (r2 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0091:
            hc.j r1 = m56689t(r8, r4, r5, r0)
        L_0x0095:
            ob.a r2 = new ob.a
            r2.<init>()
            r2.mo21950b(r5)
            if (r4 != r6) goto L_0x00a4
            int r7 = r0.mo21962m()
            goto L_0x00a8
        L_0x00a4:
            int r7 = r7.length()
        L_0x00a8:
            m56675f(r7, r1, r4, r2)
            r2.mo21950b(r0)
            hc.j$b r7 = r1.mo42570f(r8)
            int r0 = r1.mo42571h()
            int r3 = r7.mo42579d()
            int r0 = r0 - r3
            m56690u(r0, r2)
            int r3 = r1.mo42571h()
            int r7 = r7.mo42578c()
            ob.a r7 = m56687r(r2, r3, r0, r7)
            jc.f r0 = new jc.f
            r0.<init>()
            r0.mo43127c(r8)
            r0.mo43130f(r4)
            r0.mo43131g(r1)
            int r2 = r1.mo42569e()
            jc.b r3 = new jc.b
            r3.<init>(r2, r2)
            r2 = -1
            if (r9 == 0) goto L_0x00ff
            com.google.zxing.f r4 = com.google.zxing.C5756f.QR_MASK_PATTERN
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            boolean r4 = p471jc.C15743f.m56719b(r9)
            if (r4 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r9 = r2
        L_0x0100:
            if (r9 != r2) goto L_0x0106
            int r9 = m56680k(r7, r8, r1, r3)
        L_0x0106:
            r0.mo43128d(r9)
            p471jc.C15742e.m56700a(r7, r8, r1, r9, r3)
            r0.mo43129e(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p471jc.C15739c.m56683n(java.lang.String, hc.f, java.util.Map):jc.f");
    }

    /* renamed from: o */
    static byte[] m56684o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C8004d(C8001a.f23055l).mo23156b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m56685p(int i) {
        int[] iArr = f44619a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    static void m56686q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i12 = i9 + 1;
            int i13 = i7 - i9;
            int i14 = i8 - i12;
            if (i13 != i14) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i13) * i6) + ((i12 + i14) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i13;
            } else {
                iArr[0] = i12;
                iArr2[0] = i14;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: r */
    static C7507a m56687r(C7507a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo21962m() == i5) {
            ArrayList<C15737a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i12 = 0; i12 < i6; i12++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m56686q(i, i2, i3, i12, iArr, iArr2);
                int i13 = iArr[0];
                byte[] bArr = new byte[i13];
                aVar.mo21967s(i7 << 3, bArr, 0, i13);
                byte[] o = m56684o(bArr, iArr2[0]);
                arrayList.add(new C15737a(bArr, o));
                i8 = Math.max(i8, i13);
                i9 = Math.max(i9, o.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C7507a aVar2 = new C7507a();
                for (int i14 = 0; i14 < i8; i14++) {
                    for (C15737a a : arrayList) {
                        byte[] a2 = a.mo43116a();
                        if (i14 < a2.length) {
                            aVar2.mo21951c(a2[i14], 8);
                        }
                    }
                }
                for (int i15 = 0; i15 < i9; i15++) {
                    for (C15737a b : arrayList) {
                        byte[] b2 = b.mo43117b();
                        if (i15 < b2.length) {
                            aVar2.mo21951c(b2[i15], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo21962m()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i4 + " and " + aVar2.mo21962m() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m56688s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C15480j m56689t(C15476f fVar, C15478h hVar, C7507a aVar, C7507a aVar2) {
        return m56682m(m56678i(hVar, aVar, aVar2, m56682m(m56678i(hVar, aVar, aVar2, C15480j.m55990i(1)), fVar)), fVar);
    }

    /* renamed from: u */
    static void m56690u(int i, C7507a aVar) {
        int i2;
        int i3 = i << 3;
        if (aVar.mo21961l() <= i3) {
            for (int i4 = 0; i4 < 4 && aVar.mo21961l() < i3; i4++) {
                aVar.mo21949a(false);
            }
            int l = aVar.mo21961l() & 7;
            if (l > 0) {
                while (l < 8) {
                    aVar.mo21949a(false);
                    l++;
                }
            }
            int m = i - aVar.mo21962m();
            for (int i5 = 0; i5 < m; i5++) {
                if ((i5 & 1) == 0) {
                    i2 = 236;
                } else {
                    i2 = 17;
                }
                aVar.mo21951c(i2, 8);
            }
            if (aVar.mo21961l() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.mo21961l() + " > " + i3);
    }

    /* renamed from: v */
    private static boolean m56691v(int i, C15480j jVar, C15476f fVar) {
        if (jVar.mo42571h() - jVar.mo42570f(fVar).mo42579d() >= (i + 7) / 8) {
            return true;
        }
        return false;
    }
}
