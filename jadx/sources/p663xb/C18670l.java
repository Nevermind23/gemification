package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.l */
public final class C18670l extends C18684z {
    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + C18683y.m63320s(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C18683y.m63315j(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        C18677s.m63291c(str);
        boolean[] zArr = new boolean[67];
        int b = C18677s.m63290b(zArr, 0, C18683y.f52315d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            b += C18677s.m63290b(zArr, b, C18683y.f52318g[Character.digit(str.charAt(i), 10)], false);
        }
        int b2 = b + C18677s.m63290b(zArr, b, C18683y.f52316e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            b2 += C18677s.m63290b(zArr, b2, C18683y.f52318g[Character.digit(str.charAt(i2), 10)], true);
        }
        C18677s.m63290b(zArr, b2, C18683y.f52315d, true);
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.EAN_8);
    }
}
