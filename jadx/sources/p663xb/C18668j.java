package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.j */
public final class C18668j extends C18684z {
    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + C18683y.m63320s(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!C18683y.m63315j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        C18677s.m63291c(str);
        int i = C18667i.f52287j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b = C18677s.m63290b(zArr, 0, C18683y.f52315d, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            b += C18677s.m63290b(zArr, b, C18683y.f52319h[digit], false);
        }
        int b2 = b + C18677s.m63290b(zArr, b, C18683y.f52316e, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            b2 += C18677s.m63290b(zArr, b2, C18683y.f52318g[Character.digit(str.charAt(i3), 10)], true);
        }
        C18677s.m63290b(zArr, b2, C18683y.f52315d, true);
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.EAN_13);
    }
}
