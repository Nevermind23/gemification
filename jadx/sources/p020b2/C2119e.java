package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p319y1.C9009a;

/* renamed from: b2.e */
abstract class C2119e {

    /* renamed from: a */
    private static final C2224c.C2225a f6272a = C2224c.C2225a.m8482a("ef");

    /* renamed from: b */
    private static final C2224c.C2225a f6273b = C2224c.C2225a.m8482a("ty", "v");

    /* renamed from: a */
    private static C9009a m8191a(C2224c cVar, C2325h hVar) {
        cVar.mo7153n();
        C9009a aVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (cVar.hasNext()) {
                    int x = cVar.mo7160x(f6273b);
                    if (x != 0) {
                        if (x != 1) {
                            cVar.mo7161y();
                            cVar.mo7148N();
                        } else if (z) {
                            aVar = new C9009a(C2117d.m8183e(cVar, hVar));
                        } else {
                            cVar.mo7148N();
                        }
                    } else if (cVar.mo7157t() == 0) {
                        z = true;
                    }
                } else {
                    cVar.mo7155q();
                    return aVar;
                }
            }
        }
    }

    /* renamed from: b */
    static C9009a m8192b(C2224c cVar, C2325h hVar) {
        C9009a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.mo7160x(f6272a) != 0) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                cVar.mo7152k();
                while (cVar.hasNext()) {
                    C9009a a = m8191a(cVar, hVar);
                    if (a != null) {
                        aVar = a;
                    }
                }
                cVar.mo7154o();
            }
        }
        return aVar;
    }
}
