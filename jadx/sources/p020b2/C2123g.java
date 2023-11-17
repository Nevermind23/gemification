package p020b2;

import android.graphics.Color;
import p033c2.C2224c;

/* renamed from: b2.g */
public class C2123g implements C2138n0 {

    /* renamed from: a */
    public static final C2123g f6277a = new C2123g();

    private C2123g() {
    }

    /* renamed from: b */
    public Integer mo7008a(C2224c cVar, float f) {
        boolean z;
        double d;
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo7152k();
        }
        double s = cVar.mo7156s();
        double s2 = cVar.mo7156s();
        double s3 = cVar.mo7156s();
        if (cVar.mo7158v() == C2224c.C2226b.NUMBER) {
            d = cVar.mo7156s();
        } else {
            d = 1.0d;
        }
        if (z) {
            cVar.mo7154o();
        }
        if (s <= 1.0d && s2 <= 1.0d && s3 <= 1.0d) {
            s *= 255.0d;
            s2 *= 255.0d;
            s3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) s, (int) s2, (int) s3));
    }
}
