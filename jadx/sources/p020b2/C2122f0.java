package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8936b;
import p319y1.C9024m;

/* renamed from: b2.f0 */
public abstract class C2122f0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6276a = C2224c.C2225a.m8482a("nm", "r", "hd");

    /* renamed from: a */
    static C9024m m8195a(C2224c cVar, C2325h hVar) {
        boolean z = false;
        String str = null;
        C8936b bVar = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6276a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                bVar = C2117d.m8184f(cVar, hVar, true);
            } else if (x != 2) {
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        if (z) {
            return null;
        }
        return new C9024m(str, bVar);
    }
}
