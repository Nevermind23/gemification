package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8936b;
import p319y1.C9033s;

/* renamed from: b2.m0 */
abstract class C2136m0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6304a = C2224c.C2225a.m8482a("s", "e", "o", "nm", "m", "hd");

    /* renamed from: a */
    static C9033s m8219a(C2224c cVar, C2325h hVar) {
        String str = null;
        C9033s.C9034a aVar = null;
        C8936b bVar = null;
        C8936b bVar2 = null;
        C8936b bVar3 = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6304a);
            if (x == 0) {
                bVar = C2117d.m8184f(cVar, hVar, false);
            } else if (x == 1) {
                bVar2 = C2117d.m8184f(cVar, hVar, false);
            } else if (x == 2) {
                bVar3 = C2117d.m8184f(cVar, hVar, false);
            } else if (x == 3) {
                str = cVar.mo7147I0();
            } else if (x == 4) {
                aVar = C9033s.C9034a.m33453b(cVar.mo7157t());
            } else if (x != 5) {
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        return new C9033s(str, aVar, bVar, bVar2, bVar3, z);
    }
}
