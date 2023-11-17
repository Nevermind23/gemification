package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8936b;
import p307x1.C8940f;
import p307x1.C8947m;
import p319y1.C9022k;

/* renamed from: b2.d0 */
abstract class C2118d0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6271a = C2224c.C2225a.m8482a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C9022k m8190a(C2224c cVar, C2325h hVar) {
        String str = null;
        C8947m mVar = null;
        C8940f fVar = null;
        C8936b bVar = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6271a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                mVar = C2111a.m8164b(cVar, hVar);
            } else if (x == 2) {
                fVar = C2117d.m8187i(cVar, hVar);
            } else if (x == 3) {
                bVar = C2117d.m8183e(cVar, hVar);
            } else if (x != 4) {
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        return new C9022k(str, mVar, fVar, bVar, z);
    }
}
