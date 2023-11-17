package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.ArrayList;
import p033c2.C2224c;
import p294w1.C8737d;
import p319y1.C9027p;

/* renamed from: b2.m */
abstract class C2135m {

    /* renamed from: a */
    private static final C2224c.C2225a f6302a = C2224c.C2225a.m8482a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final C2224c.C2225a f6303b = C2224c.C2225a.m8482a("shapes");

    /* renamed from: a */
    static C8737d m8218a(C2224c cVar, C2325h hVar) {
        ArrayList arrayList = new ArrayList();
        cVar.mo7153n();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6302a);
            if (x == 0) {
                c = cVar.mo7147I0().charAt(0);
            } else if (x == 1) {
                d2 = cVar.mo7156s();
            } else if (x == 2) {
                d = cVar.mo7156s();
            } else if (x == 3) {
                str = cVar.mo7147I0();
            } else if (x == 4) {
                str2 = cVar.mo7147I0();
            } else if (x != 5) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                cVar.mo7153n();
                while (cVar.hasNext()) {
                    if (cVar.mo7160x(f6303b) != 0) {
                        cVar.mo7161y();
                        cVar.mo7148N();
                    } else {
                        cVar.mo7152k();
                        while (cVar.hasNext()) {
                            arrayList.add((C9027p) C2125h.m8200a(cVar, hVar));
                        }
                        cVar.mo7154o();
                    }
                }
                cVar.mo7155q();
            }
        }
        cVar.mo7155q();
        return new C8737d(arrayList, c, d2, d, str, str2);
    }
}
