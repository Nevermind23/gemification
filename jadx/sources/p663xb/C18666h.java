package p663xb;

import com.google.zxing.C5751a;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.h */
public class C18666h extends C18677s {
    /* renamed from: h */
    private static int m63251h(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: i */
    private static int m63252i(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: j */
    static String m63253j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) ((charAt + 'A') - 1));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) ((charAt + 'A') - 27));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) ((charAt + 'A') - 33));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) ((charAt + 'F') - 59));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) ((charAt + 'K') - 91));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) ((charAt + 'A') - 97));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) ((charAt + 'P') - 123));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        String j = m63253j(str);
        int length = j.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((j.length() + 2 + 2) * 9) + 1)];
            int h = m63251h(zArr, 0, C18665g.f52284e);
            for (int i = 0; i < length; i++) {
                h += m63251h(zArr, h, C18665g.f52283d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(j.charAt(i))]);
            }
            int i2 = m63252i(j, 20);
            int[] iArr = C18665g.f52283d;
            int h2 = h + m63251h(zArr, h, iArr[i2]);
            int h3 = h2 + m63251h(zArr, h2, iArr[m63252i(j + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i2), 15)]);
            zArr[h3 + m63251h(zArr, h3, C18665g.f52284e)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.CODE_93);
    }
}
