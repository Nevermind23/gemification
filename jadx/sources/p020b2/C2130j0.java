package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import p033c2.C2224c;
import p319y1.C9011c;
import p319y1.C9027p;

/* renamed from: b2.j0 */
abstract class C2130j0 {

    /* renamed from: a */
    private static final C2224c.C2225a f6290a = C2224c.C2225a.m8482a("nm", "hd", "it");

    /* renamed from: a */
    static C9027p m8211a(C2224c cVar, C2325h hVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6290a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                z = cVar.mo7146E0();
            } else if (x != 2) {
                cVar.mo7148N();
            } else {
                cVar.mo7152k();
                while (cVar.hasNext()) {
                    C9011c a = C2125h.m8200a(cVar, hVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                cVar.mo7154o();
            }
        }
        return new C9027p(str, arrayList, z);
    }
}
