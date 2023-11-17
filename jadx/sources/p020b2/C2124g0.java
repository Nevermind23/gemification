package p020b2;

import p033c2.C2224c;
import p061e2.C6016d;

/* renamed from: b2.g0 */
public class C2124g0 implements C2138n0 {

    /* renamed from: a */
    public static final C2124g0 f6278a = new C2124g0();

    private C2124g0() {
    }

    /* renamed from: b */
    public C6016d mo7008a(C2224c cVar, float f) {
        boolean z;
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo7152k();
        }
        float s = (float) cVar.mo7156s();
        float s2 = (float) cVar.mo7156s();
        while (cVar.hasNext()) {
            cVar.mo7148N();
        }
        if (z) {
            cVar.mo7154o();
        }
        return new C6016d((s / 100.0f) * f, (s2 / 100.0f) * f);
    }
}
