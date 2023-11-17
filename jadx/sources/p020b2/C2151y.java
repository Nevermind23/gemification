package p020b2;

import p033c2.C2224c;
import p319y1.C9018i;

/* renamed from: b2.y */
abstract class C2151y {

    /* renamed from: a */
    private static final C2224c.C2225a f6328a = C2224c.C2225a.m8482a("nm", "mm", "hd");

    /* renamed from: a */
    static C9018i m8258a(C2224c cVar) {
        String str = null;
        boolean z = false;
        C9018i.C9019a aVar = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6328a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                aVar = C9018i.C9019a.m33380b(cVar.mo7157t());
            } else if (x != 2) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                z = cVar.mo7146E0();
            }
        }
        return new C9018i(str, aVar, z);
    }
}
