package p239rb;

import android.support.p013v4.media.session.C0125b;
import com.google.zxing.C5751a;
import com.google.zxing.C5755e;
import com.google.zxing.C5756f;
import com.google.zxing.C5768q;
import java.util.Map;
import p200ob.C7508b;
import p278ub.C8671e;
import p278ub.C8675i;
import p278ub.C8676j;
import p278ub.C8677k;
import p278ub.C8678l;
import p471jc.C15738b;

/* renamed from: rb.b */
public final class C8089b implements C5768q {
    /* renamed from: b */
    private static C7508b m30626b(C15738b bVar, int i, int i2) {
        C7508b bVar2;
        int e = bVar.mo43122e();
        int d = bVar.mo43121d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 < d || i < e) {
            bVar2 = new C7508b(e, d);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new C7508b(i, i2);
        }
        bVar2.mo21970b();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (bVar.mo43119b(i7, i5) == 1) {
                    bVar2.mo21985o(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }

    /* renamed from: c */
    private static C7508b m30627c(C8671e eVar, C8677k kVar, int i, int i2) {
        boolean z;
        boolean z2;
        int h = kVar.mo24054h();
        int g = kVar.mo24053g();
        C15738b bVar = new C15738b(kVar.mo24056j(), kVar.mo24055i());
        int i3 = 0;
        for (int i4 = 0; i4 < g; i4++) {
            if (i4 % kVar.f24492e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.mo24056j(); i6++) {
                    if (i6 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bVar.mo43124g(i5, i3, z2);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < h; i8++) {
                if (i8 % kVar.f24491d == 0) {
                    bVar.mo43124g(i7, i3, true);
                    i7++;
                }
                bVar.mo43124g(i7, i3, eVar.mo24029e(i8, i4));
                i7++;
                int i9 = kVar.f24491d;
                if (i8 % i9 == i9 - 1) {
                    if (i4 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo43124g(i7, i3, z);
                    i7++;
                }
            }
            i3++;
            int i12 = kVar.f24492e;
            if (i4 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < kVar.mo24056j(); i14++) {
                    bVar.mo43124g(i13, i3, true);
                    i13++;
                }
                i3++;
            }
        }
        return m30626b(bVar, i, i2);
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C5751a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            C8678l lVar = C8678l.FORCE_NONE;
            if (map != null) {
                C8678l lVar2 = (C8678l) map.get(C5756f.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                C0125b.m366a(map.get(C5756f.MIN_SIZE));
                C0125b.m366a(map.get(C5756f.MAX_SIZE));
            }
            String b = C8676j.m32369b(str, lVar, (C5755e) null, (C5755e) null);
            C8677k l = C8677k.m32385l(b.length(), lVar, (C5755e) null, (C5755e) null, true);
            C8671e eVar = new C8671e(C8675i.m32367b(b, l), l.mo24054h(), l.mo24053g());
            eVar.mo24030h();
            return m30627c(eVar, l, i, i2);
        }
    }
}
