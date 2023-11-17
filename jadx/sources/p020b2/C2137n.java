package p020b2;

import p033c2.C2224c;
import p294w1.C8736c;

/* renamed from: b2.n */
abstract class C2137n {

    /* renamed from: a */
    private static final C2224c.C2225a f6305a = C2224c.C2225a.m8482a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C8736c m8220a(C2224c cVar) {
        cVar.mo7153n();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6305a);
            if (x == 0) {
                str = cVar.mo7147I0();
            } else if (x == 1) {
                str3 = cVar.mo7147I0();
            } else if (x == 2) {
                str2 = cVar.mo7147I0();
            } else if (x != 3) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                f = (float) cVar.mo7156s();
            }
        }
        cVar.mo7155q();
        return new C8736c(str, str3, str2, f);
    }
}
