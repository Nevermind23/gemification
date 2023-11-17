package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8936b;
import p307x1.C8946l;
import p319y1.C9023l;

/* renamed from: b2.e0 */
abstract class C2120e0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6274a = C2224c.C2225a.m8482a("nm", "c", "o", "tr", "hd");

    /* renamed from: a */
    static C9023l m8193a(C2224c cVar, C2325h hVar) {
        String str = null;
        C8936b bVar = null;
        C8936b bVar2 = null;
        C8946l lVar = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6274a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                bVar = C2117d.m8184f(cVar, hVar, false);
            } else if (x == 2) {
                bVar2 = C2117d.m8184f(cVar, hVar, false);
            } else if (x == 3) {
                lVar = C2115c.m8177g(cVar, hVar);
            } else if (x != 4) {
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        return new C9023l(str, bVar, bVar2, lVar, z);
    }
}
