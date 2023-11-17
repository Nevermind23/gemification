package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8942h;
import p319y1.C9028q;

/* renamed from: b2.k0 */
abstract class C2132k0 {

    /* renamed from: a */
    static C2224c.C2225a f6298a = C2224c.C2225a.m8482a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C9028q m8214a(C2224c cVar, C2325h hVar) {
        String str = null;
        int i = 0;
        boolean z = false;
        C8942h hVar2 = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6298a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                i = cVar.mo7157t();
            } else if (x == 2) {
                hVar2 = C2117d.m8189k(cVar, hVar);
            } else if (x != 3) {
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        return new C9028q(str, i, hVar2, z);
    }
}
