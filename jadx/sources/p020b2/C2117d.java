package p020b2;

import com.airbnb.lottie.C2325h;
import java.util.List;
import p033c2.C2224c;
import p048d2.C5808j;
import p307x1.C8935a;
import p307x1.C8936b;
import p307x1.C8937c;
import p307x1.C8938d;
import p307x1.C8940f;
import p307x1.C8941g;
import p307x1.C8942h;
import p307x1.C8944j;

/* renamed from: b2.d */
public abstract class C2117d {
    /* renamed from: a */
    private static List m8179a(C2224c cVar, float f, C2325h hVar, C2138n0 n0Var) {
        return C2146u.m8247a(cVar, hVar, f, n0Var, false);
    }

    /* renamed from: b */
    private static List m8180b(C2224c cVar, C2325h hVar, C2138n0 n0Var) {
        return C2146u.m8247a(cVar, hVar, 1.0f, n0Var, false);
    }

    /* renamed from: c */
    static C8935a m8181c(C2224c cVar, C2325h hVar) {
        return new C8935a(m8180b(cVar, hVar, C2123g.f6277a));
    }

    /* renamed from: d */
    static C8944j m8182d(C2224c cVar, C2325h hVar) {
        return new C8944j(m8179a(cVar, C5808j.m23377e(), hVar, C2127i.f6282a));
    }

    /* renamed from: e */
    public static C8936b m8183e(C2224c cVar, C2325h hVar) {
        return m8184f(cVar, hVar, true);
    }

    /* renamed from: f */
    public static C8936b m8184f(C2224c cVar, C2325h hVar, boolean z) {
        float f;
        if (z) {
            f = C5808j.m23377e();
        } else {
            f = 1.0f;
        }
        return new C8936b(m8179a(cVar, f, hVar, C2133l.f6299a));
    }

    /* renamed from: g */
    static C8937c m8185g(C2224c cVar, C2325h hVar, int i) {
        return new C8937c(m8180b(cVar, hVar, new C2139o(i)));
    }

    /* renamed from: h */
    static C8938d m8186h(C2224c cVar, C2325h hVar) {
        return new C8938d(m8180b(cVar, hVar, C2142r.f6312a));
    }

    /* renamed from: i */
    static C8940f m8187i(C2224c cVar, C2325h hVar) {
        return new C8940f(C2146u.m8247a(cVar, hVar, C5808j.m23377e(), C2114b0.f6267a, true));
    }

    /* renamed from: j */
    static C8941g m8188j(C2224c cVar, C2325h hVar) {
        return new C8941g(m8180b(cVar, hVar, C2124g0.f6278a));
    }

    /* renamed from: k */
    static C8942h m8189k(C2224c cVar, C2325h hVar) {
        return new C8942h(m8179a(cVar, C5808j.m23377e(), hVar, C2126h0.f6280a));
    }
}
