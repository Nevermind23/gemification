package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8936b;
import p307x1.C8947m;
import p319y1.C9020j;

/* renamed from: b2.c0 */
abstract class C2116c0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6270a = C2224c.C2225a.m8482a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* renamed from: a */
    static C9020j m8178a(C2224c cVar, C2325h hVar, int i) {
        boolean z;
        C2224c cVar2 = cVar;
        C2325h hVar2 = hVar;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = z;
        String str = null;
        C9020j.C9021a aVar = null;
        C8936b bVar = null;
        C8947m mVar = null;
        C8936b bVar2 = null;
        C8936b bVar3 = null;
        C8936b bVar4 = null;
        C8936b bVar5 = null;
        C8936b bVar6 = null;
        while (cVar.hasNext()) {
            switch (cVar2.mo7160x(f6270a)) {
                case 0:
                    str = cVar.mo7147I0();
                    break;
                case 1:
                    aVar = C9020j.C9021a.m33394b(cVar.mo7157t());
                    break;
                case 2:
                    bVar = C2117d.m8184f(cVar2, hVar2, false);
                    break;
                case 3:
                    mVar = C2111a.m8164b(cVar, hVar);
                    break;
                case 4:
                    bVar2 = C2117d.m8184f(cVar2, hVar2, false);
                    break;
                case 5:
                    bVar4 = C2117d.m8183e(cVar, hVar);
                    break;
                case 6:
                    bVar6 = C2117d.m8184f(cVar2, hVar2, false);
                    break;
                case 7:
                    bVar3 = C2117d.m8183e(cVar, hVar);
                    break;
                case 8:
                    bVar5 = C2117d.m8184f(cVar2, hVar2, false);
                    break;
                case 9:
                    z2 = cVar.mo7146E0();
                    break;
                case 10:
                    if (cVar.mo7157t() != 3) {
                        z3 = false;
                        break;
                    } else {
                        z3 = true;
                        break;
                    }
                default:
                    cVar.mo7161y();
                    cVar.mo7148N();
                    break;
            }
        }
        return new C9020j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z2, z3);
    }
}
