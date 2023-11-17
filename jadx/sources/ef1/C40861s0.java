package ef1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.scheduling.C41639h;

/* renamed from: ef1.s0 */
public abstract class C40861s0 extends C41639h {

    /* renamed from: f */
    public int f96571f;

    public C40861s0(int i) {
        this.f96571f = i;
    }

    /* renamed from: a */
    public abstract void mo95198a(Object obj, Throwable th);

    /* renamed from: c */
    public abstract Continuation mo95199c();

    /* renamed from: d */
    public Throwable mo95200d(Object obj) {
        C40881y yVar = obj instanceof C40881y ? (C40881y) obj : null;
        if (yVar != null) {
            return yVar.f96602a;
        }
        return null;
    }

    /* renamed from: f */
    public Object mo95201f(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public final void mo95224j(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C41211b.m119461a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C41536l.m120486f(th);
            C40810g0.m118295a(mo95199c().mo94380b(), new C40828k0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: k */
    public abstract Object mo95203k();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r4.mo95191O0() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r4.mo95191O0() != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.i r0 = r10.f97875e
            kotlin.coroutines.Continuation r1 = r10.mo95199c()     // Catch:{ all -> 0x00b0 }
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.C41596f) r1     // Catch:{ all -> 0x00b0 }
            kotlin.coroutines.Continuation r2 = r1.f97789h     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r1.f97791j     // Catch:{ all -> 0x00b0 }
            me1.f r3 = r2.mo94380b()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C41592e0.m120649c(r3, r1)     // Catch:{ all -> 0x00b0 }
            kotlinx.coroutines.internal.a0 r4 = kotlinx.coroutines.internal.C41592e0.f97780a     // Catch:{ all -> 0x00b0 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            ef1.n2 r4 = ef1.C40786c0.m118264g(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            me1.f r6 = r2.mo94380b()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r10.mo95203k()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r8 = r10.mo95200d(r7)     // Catch:{ all -> 0x00a3 }
            if (r8 != 0) goto L_0x003e
            int r9 = r10.f96571f     // Catch:{ all -> 0x00a3 }
            boolean r9 = ef1.C40864t0.m118455b(r9)     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x003e
            ef1.o1$b r9 = ef1.C40845o1.f96561d3     // Catch:{ all -> 0x00a3 }
            me1.f$b r6 = r6.mo23736c(r9)     // Catch:{ all -> 0x00a3 }
            ef1.o1 r6 = (ef1.C40845o1) r6     // Catch:{ all -> 0x00a3 }
            goto L_0x003f
        L_0x003e:
            r6 = r5
        L_0x003f:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.mo95131k()     // Catch:{ all -> 0x00a3 }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.mo95212n()     // Catch:{ all -> 0x00a3 }
            r10.mo95198a(r7, r6)     // Catch:{ all -> 0x00a3 }
            he1.n$a r7 = he1.C41225n.f97210d     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = he1.C41228o.m119482a(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = he1.C41225n.m119478a(r6)     // Catch:{ all -> 0x00a3 }
            r2.mo94382h(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x005c:
            if (r8 == 0) goto L_0x006c
            he1.n$a r6 = he1.C41225n.f97210d     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = he1.C41228o.m119482a(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = he1.C41225n.m119478a(r6)     // Catch:{ all -> 0x00a3 }
            r2.mo94382h(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x006c:
            he1.n$a r6 = he1.C41225n.f97210d     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = r10.mo95201f(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = he1.C41225n.m119478a(r6)     // Catch:{ all -> 0x00a3 }
            r2.mo94382h(r6)     // Catch:{ all -> 0x00a3 }
        L_0x0079:
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0083
            boolean r2 = r4.mo95191O0()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0086
        L_0x0083:
            kotlinx.coroutines.internal.C41592e0.m120647a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x0086:
            r0.mo96447a()     // Catch:{ all -> 0x0090 }
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = he1.C41225n.m119478a(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x009b
        L_0x0090:
            r0 = move-exception
            he1.n$a r1 = he1.C41225n.f97210d
            java.lang.Object r0 = he1.C41228o.m119482a(r0)
            java.lang.Object r0 = he1.C41225n.m119478a(r0)
        L_0x009b:
            java.lang.Throwable r0 = he1.C41225n.m119479b(r0)
            r10.mo95224j(r5, r0)
            goto L_0x00cf
        L_0x00a3:
            r2 = move-exception
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo95191O0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            kotlinx.coroutines.internal.C41592e0.m120647a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            he1.n$a r2 = he1.C41225n.f97210d     // Catch:{ all -> 0x00bd }
            r0.mo96447a()     // Catch:{ all -> 0x00bd }
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = he1.C41225n.m119478a(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00c8
        L_0x00bd:
            r0 = move-exception
            he1.n$a r2 = he1.C41225n.f97210d
            java.lang.Object r0 = he1.C41228o.m119482a(r0)
            java.lang.Object r0 = he1.C41225n.m119478a(r0)
        L_0x00c8:
            java.lang.Throwable r0 = he1.C41225n.m119479b(r0)
            r10.mo95224j(r1, r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40861s0.run():void");
    }
}
