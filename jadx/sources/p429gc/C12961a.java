package p429gc;

import com.google.zxing.C5751a;
import com.google.zxing.C5753c;
import com.google.zxing.C5754d;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.List;
import java.util.Map;
import p200ob.C7508b;
import p200ob.C7511e;
import p200ob.C7513g;
import p443hc.C15475e;
import p443hc.C15479i;
import p457ic.C15593c;

/* renamed from: gc.a */
public class C12961a implements C5763l {

    /* renamed from: b */
    private static final C5766o[] f38215b = new C5766o[0];

    /* renamed from: a */
    private final C15475e f38216a = new C15475e();

    /* renamed from: d */
    private static C7508b m48891d(C7508b bVar) {
        int[] k = bVar.mo21981k();
        int[] f = bVar.mo21976f();
        if (k == null || f == null) {
            throw NotFoundException.m23155a();
        }
        float e = m48892e(k, bVar);
        int i = k[1];
        int i2 = f[1];
        int i3 = k[0];
        int i4 = f[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.m23155a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.mo21982l()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / e);
            int round2 = Math.round(((float) (i5 + 1)) / e);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.m23155a();
            } else if (round2 == round) {
                int i6 = (int) (e / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * e)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw NotFoundException.m23155a();
                    }
                }
                int i12 = (((int) (((float) (round2 - 1)) * e)) + i7) - i2;
                if (i12 > 0) {
                    if (i12 <= i6) {
                        i7 -= i12;
                    } else {
                        throw NotFoundException.m23155a();
                    }
                }
                C7508b bVar2 = new C7508b(round, round2);
                for (int i13 = 0; i13 < round2; i13++) {
                    int i14 = ((int) (((float) i13) * e)) + i7;
                    for (int i15 = 0; i15 < round; i15++) {
                        if (bVar.mo21974e(((int) (((float) i15) * e)) + i8, i14)) {
                            bVar2.mo21984n(i15, i13);
                        }
                    }
                }
                return bVar2;
            } else {
                throw NotFoundException.m23155a();
            }
        } else {
            throw NotFoundException.m23155a();
        }
    }

    /* renamed from: e */
    private static float m48892e(int[] iArr, C7508b bVar) {
        int h = bVar.mo21978h();
        int l = bVar.mo21982l();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < l && i2 < h) {
            if (z != bVar.mo21974e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != l && i2 != h) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
    }

    /* renamed from: b */
    public final C5764m mo18887b(C5753c cVar, Map map) {
        C5766o[] oVarArr;
        C7511e eVar;
        if (map == null || !map.containsKey(C5754d.PURE_BARCODE)) {
            C7513g e = new C15593c(cVar.mo18870a()).mo42854e(map);
            C7511e c = this.f38216a.mo42558c(e.mo22009a(), map);
            oVarArr = e.mo22010b();
            eVar = c;
        } else {
            eVar = this.f38216a.mo42558c(m48891d(cVar.mo18870a()), map);
            oVarArr = f38215b;
        }
        if (eVar.mo21997d() instanceof C15479i) {
            ((C15479i) eVar.mo21997d()).mo42566a(oVarArr);
        }
        C5764m mVar = new C5764m(eVar.mo22001h(), eVar.mo21998e(), oVarArr, C5751a.QR_CODE);
        List a = eVar.mo21994a();
        if (a != null) {
            mVar.mo18899h(C5765n.BYTE_SEGMENTS, a);
        }
        String b = eVar.mo21995b();
        if (b != null) {
            mVar.mo18899h(C5765n.ERROR_CORRECTION_LEVEL, b);
        }
        if (eVar.mo22002i()) {
            mVar.mo18899h(C5765n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo22000g()));
            mVar.mo18899h(C5765n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo21999f()));
        }
        return mVar;
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }
}
