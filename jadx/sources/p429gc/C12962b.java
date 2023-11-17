package p429gc;

import com.google.zxing.C5751a;
import com.google.zxing.C5756f;
import com.google.zxing.C5768q;
import java.util.Map;
import p200ob.C7508b;
import p443hc.C15476f;
import p471jc.C15738b;
import p471jc.C15739c;
import p471jc.C15743f;

/* renamed from: gc.b */
public final class C12962b implements C5768q {
    /* renamed from: b */
    private static C7508b m48896b(C15743f fVar, int i, int i2, int i3) {
        C15738b a = fVar.mo43126a();
        if (a != null) {
            int e = a.mo43122e();
            int d = a.mo43121d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C7508b bVar = new C7508b(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i12 = 0;
                int i13 = i7;
                while (i12 < e) {
                    if (a.mo43119b(i12, i9) == 1) {
                        bVar.mo21985o(i13, i8, min, min);
                    }
                    i12++;
                    i13 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C5751a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            C15476f fVar = C15476f.L;
            int i3 = 4;
            if (map != null) {
                C5756f fVar2 = C5756f.ERROR_CORRECTION;
                if (map.containsKey(fVar2)) {
                    fVar = C15476f.valueOf(map.get(fVar2).toString());
                }
                C5756f fVar3 = C5756f.MARGIN;
                if (map.containsKey(fVar3)) {
                    i3 = Integer.parseInt(map.get(fVar3).toString());
                }
            }
            return m48896b(C15739c.m56683n(str, fVar, map), i, i2, i3);
        }
    }
}
