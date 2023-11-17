package p663xb;

import com.google.zxing.C5751a;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.o */
public final class C18673o extends C18677s {

    /* renamed from: b */
    private static final int[] f52297b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f52298c = {3, 1, 1};

    /* renamed from: d */
    private static final int[][] f52299d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            C18677s.m63291c(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b = C18677s.m63290b(zArr, 0, f52297b, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = f52299d;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                b += C18677s.m63290b(zArr, b, iArr, true);
            }
            C18677s.m63290b(zArr, b, f52298c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.ITF);
    }
}
