package p020b2;

import android.graphics.Path;
import com.airbnb.lottie.C2325h;
import java.util.Collections;
import p033c2.C2224c;
import p061e2.C6013a;
import p307x1.C8936b;
import p307x1.C8937c;
import p307x1.C8938d;
import p307x1.C8940f;
import p319y1.C9013e;
import p319y1.C9015g;

/* renamed from: b2.p */
abstract class C2140p {

    /* renamed from: a */
    private static final C2224c.C2225a f6307a = C2224c.C2225a.m8482a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final C2224c.C2225a f6308b = C2224c.C2225a.m8482a("p", "k");

    /* renamed from: a */
    static C9013e m8228a(C2224c cVar, C2325h hVar) {
        C8938d dVar;
        C9015g gVar;
        Path.FillType fillType;
        C8938d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        C9015g gVar2 = null;
        C8937c cVar2 = null;
        C8940f fVar = null;
        C8940f fVar2 = null;
        boolean z = false;
        while (cVar.hasNext()) {
            switch (cVar.mo7160x(f6307a)) {
                case 0:
                    str = cVar.mo7147I0();
                    break;
                case 1:
                    cVar.mo7153n();
                    int i = -1;
                    while (cVar.hasNext()) {
                        int x = cVar.mo7160x(f6308b);
                        if (x == 0) {
                            i = cVar.mo7157t();
                        } else if (x != 1) {
                            cVar.mo7161y();
                            cVar.mo7148N();
                        } else {
                            cVar2 = C2117d.m8185g(cVar, hVar, i);
                        }
                    }
                    cVar.mo7155q();
                    break;
                case 2:
                    dVar2 = C2117d.m8186h(cVar, hVar);
                    break;
                case 3:
                    if (cVar.mo7157t() == 1) {
                        gVar = C9015g.LINEAR;
                    } else {
                        gVar = C9015g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = C2117d.m8187i(cVar, hVar);
                    break;
                case 5:
                    fVar2 = C2117d.m8187i(cVar, hVar);
                    break;
                case 6:
                    if (cVar.mo7157t() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = cVar.mo7146E0();
                    break;
                default:
                    cVar.mo7161y();
                    cVar.mo7148N();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new C8938d(Collections.singletonList(new C6013a(100)));
        } else {
            dVar = dVar2;
        }
        return new C9013e(str, gVar2, fillType2, cVar2, dVar, fVar, fVar2, (C8936b) null, (C8936b) null, z);
    }
}
