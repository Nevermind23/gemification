package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8940f;
import p307x1.C8947m;
import p319y1.C9010b;

/* renamed from: b2.f */
abstract class C2121f {

    /* renamed from: a */
    private static final C2224c.C2225a f6275a = C2224c.C2225a.m8482a("nm", "p", "s", "hd", "d");

    /* renamed from: a */
    static C9010b m8194a(C2224c cVar, C2325h hVar, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        C8947m mVar = null;
        C8940f fVar = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6275a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                mVar = C2111a.m8164b(cVar, hVar);
            } else if (x == 2) {
                fVar = C2117d.m8187i(cVar, hVar);
            } else if (x == 3) {
                z3 = cVar.mo7146E0();
            } else if (x != 4) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else if (cVar.mo7157t() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new C9010b(str, mVar, fVar, z2, z3);
    }
}
