package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import ue1.C43075l;

/* renamed from: kotlinx.coroutines.internal.g */
public abstract class C41598g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C41584a0 f97795a = new C41584a0("UNDEFINED");

    /* renamed from: b */
    public static final C41584a0 f97796b = new C41584a0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo95191O0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m120673b(kotlin.coroutines.Continuation r6, java.lang.Object r7, ue1.C43075l r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C41596f
            if (r0 == 0) goto L_0x00b6
            kotlinx.coroutines.internal.f r6 = (kotlinx.coroutines.internal.C41596f) r6
            java.lang.Object r8 = ef1.C40782b0.m118254c(r7, r8)
            ef1.d0 r0 = r6.f97788g
            me1.f r1 = r6.mo94380b()
            boolean r0 = r0.mo95149i(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f97790i = r8
            r6.f96571f = r1
            ef1.d0 r7 = r6.f97788g
            me1.f r8 = r6.mo94380b()
            r7.mo95148h(r8, r6)
            goto L_0x00b9
        L_0x0026:
            ef1.l2 r0 = ef1.C40834l2.f96545a
            ef1.y0 r0 = r0.mo95178b()
            boolean r2 = r0.mo95273p0()
            if (r2 == 0) goto L_0x003b
            r6.f97790i = r8
            r6.f96571f = r1
            r0.mo95270h0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo95272n0(r1)
            r2 = 0
            me1.f r3 = r6.mo94380b()     // Catch:{ all -> 0x00a9 }
            ef1.o1$b r4 = ef1.C40845o1.f96561d3     // Catch:{ all -> 0x00a9 }
            me1.f$b r3 = r3.mo23736c(r4)     // Catch:{ all -> 0x00a9 }
            ef1.o1 r3 = (ef1.C40845o1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo95131k()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo95212n()     // Catch:{ all -> 0x00a9 }
            r6.mo95198a(r8, r3)     // Catch:{ all -> 0x00a9 }
            he1.n$a r8 = he1.C41225n.f97210d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = he1.C41228o.m119482a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = he1.C41225n.m119478a(r8)     // Catch:{ all -> 0x00a9 }
            r6.mo94382h(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            kotlin.coroutines.Continuation r8 = r6.f97789h     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f97791j     // Catch:{ all -> 0x00a9 }
            me1.f r4 = r8.mo94380b()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.C41592e0.m120649c(r4, r3)     // Catch:{ all -> 0x00a9 }
            kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.internal.C41592e0.f97780a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            ef1.n2 r8 = ef1.C40786c0.m118264g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            kotlin.coroutines.Continuation r5 = r6.f97789h     // Catch:{ all -> 0x0095 }
            r5.mo94382h(r7)     // Catch:{ all -> 0x0095 }
            he1.w r7 = he1.C41238w.f97225a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo95191O0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.C41592e0.m120647a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo95191O0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.C41592e0.m120647a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo95276x0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo95224j(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo95269Q(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo95269Q(r1)
            throw r6
        L_0x00b6:
            r6.mo94382h(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41598g.m120673b(kotlin.coroutines.Continuation, java.lang.Object, ue1.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m120674c(Continuation continuation, Object obj, C43075l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m120673b(continuation, obj, lVar);
    }
}
