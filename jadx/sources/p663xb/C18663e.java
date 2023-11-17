package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5764m;
import com.google.zxing.C5766o;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p200ob.C7507a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: xb.e */
public final class C18663e extends C18676r {

    /* renamed from: e */
    static final int[] f52277e = {52, 289, 97, 352, 49, BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, TextTypeView.SEPARATOR_FULL, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f52278a;

    /* renamed from: b */
    private final boolean f52279b;

    /* renamed from: c */
    private final StringBuilder f52280c;

    /* renamed from: d */
    private final int[] f52281d;

    public C18663e() {
        this(false);
    }

    /* renamed from: i */
    private static String m63235i(CharSequence charSequence) {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = ':';
                                    sb.append(c);
                                } else {
                                    throw FormatException.m23153a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw FormatException.m23153a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            c = '@';
                        } else if (charAt2 == 'W') {
                            c = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            c = 127;
                        } else {
                            throw FormatException.m23153a();
                        }
                        sb.append(c);
                    }
                    c = 0;
                    sb.append(c);
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw FormatException.m23153a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: j */
    private static int[] m63236j(C7507a aVar, int[] iArr) {
        int l = aVar.mo21961l();
        int j = aVar.mo21959j(0);
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
                } else if (m63238l(iArr) != 148 || !aVar.mo21963n(Math.max(0, i2 - ((j - i2) / 2)), i2, false)) {
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    return new int[]{i2, j};
                }
                iArr[i] = 1;
                z = !z;
            }
            j++;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: k */
    private static char m63237k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f52277e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw NotFoundException.m23155a();
            }
        }
    }

    /* renamed from: l */
    private static int m63238l(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i12 = iArr[i9];
                    if (i12 > i2) {
                        i4--;
                        if ((i12 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: d */
    public C5764m mo46487d(int i, C7507a aVar, Map map) {
        String str;
        int[] iArr = this.f52281d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f52280c;
        sb.setLength(0);
        int[] j = m63236j(aVar, iArr);
        int j2 = aVar.mo21959j(j[1]);
        int l = aVar.mo21961l();
        while (true) {
            C18676r.m63284g(aVar, j2, iArr);
            int l2 = m63238l(iArr);
            if (l2 >= 0) {
                char k = m63237k(l2);
                sb.append(k);
                int i2 = j2;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int j3 = aVar.mo21959j(i2);
                if (k == '*') {
                    sb.setLength(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (j3 - j2) - i4;
                    if (j3 == l || (i6 << 1) >= i4) {
                        if (this.f52278a) {
                            int length = sb.length() - 1;
                            int i7 = 0;
                            for (int i8 = 0; i8 < length; i8++) {
                                i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f52280c.charAt(i8));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw ChecksumException.m23152a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f52279b) {
                                str = m63235i(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new C5764m(str, (byte[]) null, new C5766o[]{new C5766o(((float) (j[1] + j[0])) / 2.0f, f), new C5766o(((float) j2) + (((float) i4) / 2.0f), f)}, C5751a.CODE_39);
                        }
                        throw NotFoundException.m23155a();
                    }
                    throw NotFoundException.m23155a();
                }
                j2 = j3;
            } else {
                throw NotFoundException.m23155a();
            }
        }
    }

    public C18663e(boolean z) {
        this(z, false);
    }

    public C18663e(boolean z, boolean z2) {
        this.f52278a = z;
        this.f52279b = z2;
        this.f52280c = new StringBuilder(20);
        this.f52281d = new int[9];
    }
}
