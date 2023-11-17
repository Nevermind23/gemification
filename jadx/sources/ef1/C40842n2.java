package ef1;

import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41592e0;
import kotlinx.coroutines.internal.C41627z;
import me1.C41752f;

/* renamed from: ef1.n2 */
public final class C40842n2 extends C41627z {

    /* renamed from: g */
    private ThreadLocal f96555g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40842n2(me1.C41752f r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            ef1.o2 r0 = ef1.C40848o2.f96563d
            me1.f$b r1 = r3.mo23736c(r0)
            if (r1 != 0) goto L_0x000d
            me1.f r0 = r3.mo23741u(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f96555g = r0
            me1.f r4 = r4.mo94380b()
            me1.d$b r0 = me1.C41748d.f98026f3
            me1.f$b r4 = r4.mo23736c(r0)
            boolean r4 = r4 instanceof ef1.C40793d0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.C41592e0.m120649c(r3, r4)
            kotlinx.coroutines.internal.C41592e0.m120647a(r3, r4)
            r2.mo95192P0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40842n2.<init>(me1.f, kotlin.coroutines.Continuation):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo95125K0(Object obj) {
        C41224m mVar = (C41224m) this.f96555g.get();
        C40842n2 n2Var = null;
        if (mVar != null) {
            C41592e0.m120647a((C41752f) mVar.mo95675a(), mVar.mo95676b());
            this.f96555g.set(n2Var);
        }
        Object a = C40782b0.m118252a(obj, this.f97837f);
        Continuation continuation = this.f97837f;
        C41752f b = continuation.mo94380b();
        Object c = C41592e0.m120649c(b, n2Var);
        if (c != C41592e0.f97780a) {
            n2Var = C40786c0.m118264g(continuation, b, c);
        }
        try {
            this.f97837f.mo94382h(a);
            C41238w wVar = C41238w.f97225a;
        } finally {
            if (n2Var == null || n2Var.mo95191O0()) {
                C41592e0.m120647a(b, c);
            }
        }
    }

    /* renamed from: O0 */
    public final boolean mo95191O0() {
        if (this.f96555g.get() == null) {
            return false;
        }
        this.f96555g.set((Object) null);
        return true;
    }

    /* renamed from: P0 */
    public final void mo95192P0(C41752f fVar, Object obj) {
        this.f96555g.set(C41233s.m119492a(fVar, obj));
    }
}
