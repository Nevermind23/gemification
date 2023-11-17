package ef1;

import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41592e0;
import kotlinx.coroutines.internal.C41596f;
import me1.C41752f;

/* renamed from: ef1.t0 */
public abstract class C40864t0 {
    /* renamed from: a */
    public static final void m118454a(C40861s0 s0Var, int i) {
        boolean z;
        Continuation c = s0Var.mo95199c();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(c instanceof C41596f) || m118455b(i) != m118455b(s0Var.f96571f)) {
            m118457d(s0Var, c, z);
            return;
        }
        C40793d0 d0Var = ((C41596f) c).f97788g;
        C41752f b = c.mo94380b();
        if (d0Var.mo95149i(b)) {
            d0Var.mo95148h(b, s0Var);
        } else {
            m118458e(s0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m118455b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m118456c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final void m118457d(C40861s0 s0Var, Continuation continuation, boolean z) {
        Object obj;
        C40842n2 n2Var;
        Object k = s0Var.mo95203k();
        Throwable d = s0Var.mo95200d(k);
        if (d != null) {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41228o.m119482a(d);
        } else {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = s0Var.mo95201f(k);
        }
        Object a = C41225n.m119478a(obj);
        if (z) {
            C41596f fVar = (C41596f) continuation;
            Continuation continuation2 = fVar.f97789h;
            Object obj2 = fVar.f97791j;
            C41752f b = continuation2.mo94380b();
            Object c = C41592e0.m120649c(b, obj2);
            if (c != C41592e0.f97780a) {
                n2Var = C40786c0.m118264g(continuation2, b, c);
            } else {
                n2Var = null;
            }
            try {
                fVar.f97789h.mo94382h(a);
                C41238w wVar = C41238w.f97225a;
            } finally {
                if (n2Var == null || n2Var.mo95191O0()) {
                    C41592e0.m120647a(b, c);
                }
            }
        } else {
            continuation.mo94382h(a);
        }
    }

    /* renamed from: e */
    private static final void m118458e(C40861s0 s0Var) {
        C40882y0 b = C40834l2.f96545a.mo95178b();
        if (b.mo95273p0()) {
            b.mo95270h0(s0Var);
            return;
        }
        b.mo95272n0(true);
        try {
            m118457d(s0Var, s0Var.mo95199c(), true);
            do {
            } while (b.mo95276x0());
        } catch (Throwable th) {
            b.mo95269Q(true);
            throw th;
        }
        b.mo95269Q(true);
    }
}
