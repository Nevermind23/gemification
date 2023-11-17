package p020b2;

import android.graphics.PointF;
import p033c2.C2224c;

/* renamed from: b2.b0 */
public class C2114b0 implements C2138n0 {

    /* renamed from: a */
    public static final C2114b0 f6267a = new C2114b0();

    private C2114b0() {
    }

    /* renamed from: b */
    public PointF mo7008a(C2224c cVar, float f) {
        C2224c.C2226b v = cVar.mo7158v();
        if (v == C2224c.C2226b.BEGIN_ARRAY) {
            return C2143s.m8236e(cVar, f);
        }
        if (v == C2224c.C2226b.BEGIN_OBJECT) {
            return C2143s.m8236e(cVar, f);
        }
        if (v == C2224c.C2226b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo7156s()) * f, ((float) cVar.mo7156s()) * f);
            while (cVar.hasNext()) {
                cVar.mo7148N();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + v);
    }
}
