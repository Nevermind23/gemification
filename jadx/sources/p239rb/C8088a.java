package p239rb;

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
import p252sb.C8296d;
import p265tb.C8432a;

/* renamed from: rb.a */
public final class C8088a implements C5763l {

    /* renamed from: b */
    private static final C5766o[] f23247b = new C5766o[0];

    /* renamed from: a */
    private final C8296d f23248a = new C8296d();

    /* renamed from: d */
    private static C7508b m30621d(C7508b bVar) {
        int[] k = bVar.mo21981k();
        int[] f = bVar.mo21976f();
        if (k == null || f == null) {
            throw NotFoundException.m23155a();
        }
        int e = m30622e(k, bVar);
        int i = k[1];
        int i2 = f[1];
        int i3 = k[0];
        int i4 = ((f[0] - i3) + 1) / e;
        int i5 = ((i2 - i) + 1) / e;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.m23155a();
        }
        int i6 = e / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C7508b bVar2 = new C7508b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i12 = (i9 * e) + i7;
            for (int i13 = 0; i13 < i4; i13++) {
                if (bVar.mo21974e((i13 * e) + i8, i12)) {
                    bVar2.mo21984n(i13, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: e */
    private static int m30622e(int[] iArr, C7508b bVar) {
        int l = bVar.mo21982l();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < l && bVar.mo21974e(i, i2)) {
            i++;
        }
        if (i != l) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.m23155a();
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        C5766o[] oVarArr;
        C7511e eVar;
        if (map == null || !map.containsKey(C5754d.PURE_BARCODE)) {
            C7513g b = new C8432a(cVar.mo18870a()).mo23616b();
            C7511e b2 = this.f23248a.mo23455b(b.mo22009a());
            oVarArr = b.mo22010b();
            eVar = b2;
        } else {
            eVar = this.f23248a.mo23455b(m30621d(cVar.mo18870a()));
            oVarArr = f23247b;
        }
        C5764m mVar = new C5764m(eVar.mo22001h(), eVar.mo21998e(), oVarArr, C5751a.DATA_MATRIX);
        List a = eVar.mo21994a();
        if (a != null) {
            mVar.mo18899h(C5765n.BYTE_SEGMENTS, a);
        }
        String b3 = eVar.mo21995b();
        if (b3 != null) {
            mVar.mo18899h(C5765n.ERROR_CORRECTION_LEVEL, b3);
        }
        return mVar;
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }
}
