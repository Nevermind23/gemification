package p663xb;

import com.google.zxing.C5751a;
import com.google.zxing.C5756f;
import com.google.zxing.C5768q;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import p200ob.C7508b;

/* renamed from: xb.s */
public abstract class C18677s implements C5768q {

    /* renamed from: a */
    private static final Pattern f52304a = Pattern.compile("[0-9]+");

    /* renamed from: b */
    protected static int m63290b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: c */
    protected static void m63291c(String str) {
        if (!f52304a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: g */
    private static C7508b m63292g(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C7508b bVar = new C7508b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo21985o(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            Collection f = mo46493f();
            if (f == null || f.contains(aVar)) {
                int e = mo46495e();
                if (map != null) {
                    C5756f fVar = C5756f.MARGIN;
                    if (map.containsKey(fVar)) {
                        e = Integer.parseInt(map.get(fVar).toString());
                    }
                }
                return m63292g(mo46492d(str), i, i2, e);
            }
            throw new IllegalArgumentException("Can only encode " + f + ", but got " + aVar);
        }
    }

    /* renamed from: d */
    public abstract boolean[] mo46492d(String str);

    /* renamed from: e */
    public int mo46495e() {
        return 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Collection mo46493f();
}
