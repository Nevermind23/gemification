package p122ib;

import com.google.zxing.C5751a;
import com.google.zxing.C5756f;
import com.google.zxing.C5768q;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p161lb.C7035a;
import p161lb.C7037c;
import p200ob.C7508b;

/* renamed from: ib.c */
public final class C6630c implements C5768q {
    /* renamed from: b */
    private static C7508b m26047b(String str, C5751a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == C5751a.AZTEC) {
            return m26048c(C7037c.m27253d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: c */
    private static C7508b m26048c(C7035a aVar, int i, int i2) {
        C7508b a = aVar.mo21245a();
        if (a != null) {
            int l = a.mo21982l();
            int h = a.mo21978h();
            int max = Math.max(i, l);
            int max2 = Math.max(i2, h);
            int min = Math.min(max / l, max2 / h);
            int i3 = (max - (l * min)) / 2;
            int i4 = (max2 - (h * min)) / 2;
            C7508b bVar = new C7508b(max, max2);
            int i5 = 0;
            while (i5 < h) {
                int i6 = 0;
                int i7 = i3;
                while (i6 < l) {
                    if (a.mo21974e(i6, i5)) {
                        bVar.mo21985o(i7, i4, min, min);
                    }
                    i6++;
                    i7 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            C5756f fVar = C5756f.CHARACTER_SET;
            if (map.containsKey(fVar)) {
                charset = Charset.forName(map.get(fVar).toString());
            }
            C5756f fVar2 = C5756f.ERROR_CORRECTION;
            if (map.containsKey(fVar2)) {
                i3 = Integer.parseInt(map.get(fVar2).toString());
            }
            C5756f fVar3 = C5756f.AZTEC_LAYERS;
            if (map.containsKey(fVar3)) {
                i4 = Integer.parseInt(map.get(fVar3).toString());
            }
        }
        return m26047b(str, aVar, i, i2, charset, i3, i4);
    }
}
