package p663xb;

import com.google.zxing.C5751a;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.b */
public final class C18658b extends C18677s {

    /* renamed from: b */
    private static final char[] f52267b;

    /* renamed from: c */
    private static final char[] f52268c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    private static final char[] f52269d = {'/', ':', '+', '.'};

    /* renamed from: e */
    private static final char f52270e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f52267b = cArr;
        f52270e = cArr[0];
    }

    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f52270e;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f52267b;
            boolean i2 = C18656a.m63211i(cArr, upperCase);
            boolean i3 = C18656a.m63211i(cArr, upperCase2);
            char[] cArr2 = f52268c;
            boolean i4 = C18656a.m63211i(cArr2, upperCase);
            boolean i5 = C18656a.m63211i(cArr2, upperCase2);
            if (i2) {
                if (!i3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (i4) {
                if (!i5) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (i3 || i5) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f52270e;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            }
        }
        int i6 = 20;
        for (int i7 = 1; i7 < str.length() - 1; i7++) {
            if (Character.isDigit(str.charAt(i7)) || str.charAt(i7) == '-' || str.charAt(i7) == '$') {
                i6 += 9;
            } else if (C18656a.m63211i(f52269d, str.charAt(i7))) {
                i6 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i7) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i6 + (str.length() - 1))];
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i9));
            if (i9 == 0 || i9 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i12 = 0;
            while (true) {
                char[] cArr3 = C18656a.f52258d;
                if (i12 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i12]) {
                    i = C18656a.f52259e[i12];
                    break;
                } else {
                    i12++;
                }
            }
            int i13 = 0;
            int i14 = 0;
            boolean z = true;
            while (i13 < 7) {
                zArr[i8] = z;
                i8++;
                if (((i >> (6 - i13)) & 1) == 0 || i14 == 1) {
                    z = !z;
                    i13++;
                    i14 = 0;
                } else {
                    i14++;
                }
            }
            if (i9 < str.length() - 1) {
                zArr[i8] = false;
                i8++;
            }
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.CODABAR);
    }
}
