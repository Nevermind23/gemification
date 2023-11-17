package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.ChecksumException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p200ob.C7507a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: xb.g */
public final class C18665g extends C18676r {

    /* renamed from: c */
    private static final char[] f52282c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f52283d;

    /* renamed from: e */
    static final int f52284e;

    /* renamed from: a */
    private final StringBuilder f52285a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f52286b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, TextTypeView.NO_SEPARATOR, 394, 360, 356, 354, 308, 282, 344, 332, 326, BogInputLayout.INPUT_TYPE_TEXT_PASSWORD, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, BogInputLayout.INPUT_TYPE_NUM_REAL, 468, 466, 458, 366, 374, 430, 294, 474, 470, BogInputLayout.INPUT_TYPE_NUMBER_SIGNED, 350};
        f52283d = iArr;
        f52284e = iArr[47];
    }

    /* renamed from: i */
    private static void m63244i(CharSequence charSequence) {
        int length = charSequence.length();
        m63245j(charSequence, length - 2, 20);
        m63245j(charSequence, length - 1, 15);
    }

    /* renamed from: j */
    private static void m63245j(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f52282c[i3 % 47]) {
            throw ChecksumException.m23152a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a3, code lost:
        r1.append(r4);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m63246k(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r0) goto L_0x00b3
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00ac
            r5 = 100
            if (r4 > r5) goto L_0x00ac
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a7
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0096;
                case 98: goto L_0x004d;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = r2
            goto L_0x00a3
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009c
        L_0x0037:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m23153a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009c
        L_0x0043:
            if (r5 != r7) goto L_0x0048
            r4 = 58
            goto L_0x00a3
        L_0x0048:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m23153a()
            throw r9
        L_0x004d:
            if (r5 < r8) goto L_0x0056
            r4 = 69
            if (r5 > r4) goto L_0x0056
            int r5 = r5 + -38
            goto L_0x009c
        L_0x0056:
            r4 = 70
            if (r5 < r4) goto L_0x0061
            r4 = 74
            if (r5 > r4) goto L_0x0061
            int r5 = r5 + -11
            goto L_0x009c
        L_0x0061:
            r4 = 75
            if (r5 < r4) goto L_0x006a
            if (r5 > r6) goto L_0x006a
            int r5 = r5 + 16
            goto L_0x009c
        L_0x006a:
            r4 = 80
            if (r5 < r4) goto L_0x0075
            r4 = 84
            if (r5 > r4) goto L_0x0075
            int r5 = r5 + 43
            goto L_0x009c
        L_0x0075:
            r4 = 85
            if (r5 != r4) goto L_0x007a
            goto L_0x002c
        L_0x007a:
            r4 = 86
            if (r5 != r4) goto L_0x0081
            r4 = 64
            goto L_0x00a3
        L_0x0081:
            r4 = 87
            if (r5 != r4) goto L_0x0088
            r4 = 96
            goto L_0x00a3
        L_0x0088:
            r4 = 88
            if (r5 < r4) goto L_0x0091
            if (r5 > r7) goto L_0x0091
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a3
        L_0x0091:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m23153a()
            throw r9
        L_0x0096:
            if (r5 < r8) goto L_0x009e
            if (r5 > r7) goto L_0x009e
            int r5 = r5 + -64
        L_0x009c:
            char r4 = (char) r5
            goto L_0x00a3
        L_0x009e:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m23153a()
            throw r9
        L_0x00a3:
            r1.append(r4)
            goto L_0x00af
        L_0x00a7:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.m23153a()
            throw r9
        L_0x00ac:
            r1.append(r4)
        L_0x00af:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b3:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18665g.m63246k(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    private int[] m63247l(C7507a aVar) {
        int l = aVar.mo21961l();
        int j = aVar.mo21959j(0);
        Arrays.fill(this.f52286b, 0);
        int[] iArr = this.f52286b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = j;
        while (j < l) {
            if (aVar.mo21956g(j) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else if (m63249n(iArr) == f52284e) {
                    return new int[]{i2, j};
                } else {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            j++;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: m */
    private static char m63248m(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f52283d;
            if (i2 >= iArr.length) {
                throw NotFoundException.m23155a();
            } else if (iArr[i2] == i) {
                return f52282c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: n */
    private static int m63249n(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        int[] l = m63247l(aVar);
        int j = aVar.mo21959j(l[1]);
        int l2 = aVar.mo21961l();
        int[] iArr = this.f52286b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f52285a;
        sb.setLength(0);
        while (true) {
            C18676r.m63284g(aVar, j, iArr);
            int n = m63249n(iArr);
            if (n >= 0) {
                char m = m63248m(n);
                sb.append(m);
                int i2 = j;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int j2 = aVar.mo21959j(i2);
                if (m == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (j2 == l2 || !aVar.mo21956g(j2)) {
                        throw NotFoundException.m23155a();
                    } else if (sb.length() >= 2) {
                        m63244i(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C5764m(m63246k(sb), (byte[]) null, new C5766o[]{new C5766o(((float) (l[1] + l[0])) / 2.0f, f), new C5766o(((float) j) + (((float) i4) / 2.0f), f)}, C5751a.CODE_93);
                    } else {
                        throw NotFoundException.m23155a();
                    }
                } else {
                    j = j2;
                }
            } else {
                throw NotFoundException.m23155a();
            }
        }
    }
}
