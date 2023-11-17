package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8935a;
import p307x1.C8936b;
import p307x1.C8945k;

/* renamed from: b2.b */
public abstract class C2113b {

    /* renamed from: a */
    private static final C2224c.C2225a f6265a = C2224c.C2225a.m8482a("a");

    /* renamed from: b */
    private static final C2224c.C2225a f6266b = C2224c.C2225a.m8482a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C8945k m8167a(C2224c cVar, C2325h hVar) {
        cVar.mo7153n();
        C8945k kVar = null;
        while (cVar.hasNext()) {
            if (cVar.mo7160x(f6265a) != 0) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                kVar = m8168b(cVar, hVar);
            }
        }
        cVar.mo7155q();
        if (kVar == null) {
            return new C8945k((C8935a) null, (C8935a) null, (C8936b) null, (C8936b) null);
        }
        return kVar;
    }

    /* renamed from: b */
    private static C8945k m8168b(C2224c cVar, C2325h hVar) {
        cVar.mo7153n();
        C8935a aVar = null;
        C8935a aVar2 = null;
        C8936b bVar = null;
        C8936b bVar2 = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6266b);
            if (x == 0) {
                aVar = C2117d.m8181c(cVar, hVar);
            } else if (x == 1) {
                aVar2 = C2117d.m8181c(cVar, hVar);
            } else if (x == 2) {
                bVar = C2117d.m8183e(cVar, hVar);
            } else if (x != 3) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                bVar2 = C2117d.m8183e(cVar, hVar);
            }
        }
        cVar.mo7155q();
        return new C8945k(aVar, aVar2, bVar, bVar2);
    }
}
