package p291vb;

import com.google.zxing.C5751a;
import com.google.zxing.C5753c;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p200ob.C7508b;
import p200ob.C7511e;
import p304wb.C8907c;

/* renamed from: vb.a */
public final class C8719a implements C5763l {

    /* renamed from: b */
    private static final C5766o[] f24533b = new C5766o[0];

    /* renamed from: a */
    private final C8907c f24534a = new C8907c();

    /* renamed from: d */
    private static C7508b m32473d(C7508b bVar) {
        int[] g = bVar.mo21977g();
        if (g != null) {
            int i = g[0];
            int i2 = g[1];
            int i3 = g[2];
            int i4 = g[3];
            C7508b bVar2 = new C7508b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo21974e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo21984n(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        C7511e b = this.f24534a.mo24334b(m32473d(cVar.mo18870a()), map);
        C5764m mVar = new C5764m(b.mo22001h(), b.mo21998e(), f24533b, C5751a.MAXICODE);
        String b2 = b.mo21995b();
        if (b2 != null) {
            mVar.mo18899h(C5765n.ERROR_CORRECTION_LEVEL, b2);
        }
        return mVar;
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }
}
