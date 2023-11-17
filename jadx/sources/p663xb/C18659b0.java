package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.b0 */
public final class C18659b0 extends C18684z {
    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + C18683y.m63320s(C18657a0.m63218t(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C18683y.m63315j(C18657a0.m63218t(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        C18677s.m63291c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = C18657a0.f52265k[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b = C18677s.m63290b(zArr, 0, C18683y.f52315d, true);
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                b += C18677s.m63290b(zArr, b, C18683y.f52319h[digit2], false);
            }
            C18677s.m63290b(zArr, b, C18683y.f52317f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.UPC_E);
    }
}
