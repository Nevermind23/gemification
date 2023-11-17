package ef1;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;

/* renamed from: ef1.f */
final class C40805f extends C40777a {

    /* renamed from: f */
    private final Thread f96527f;

    /* renamed from: g */
    private final C40882y0 f96528g;

    public C40805f(C41752f fVar, Thread thread, C40882y0 y0Var) {
        super(fVar, true, true);
        this.f96527f = thread;
        this.f96528g = y0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo95157G(Object obj) {
        if (!C41536l.m120484d(Thread.currentThread(), this.f96527f)) {
            Thread thread = this.f96527f;
            C40785c.m118257a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ef1.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo95158O0() {
        /*
            r6 = this;
            ef1.C40785c.m118257a()
            ef1.y0 r0 = r6.f96528g     // Catch:{ all -> 0x0060 }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            ef1.C40882y0.m118581o0(r0, r2, r1, r3)     // Catch:{ all -> 0x0060 }
        L_0x000d:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x004f
            ef1.y0 r0 = r6.f96528g     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x001c
            long r4 = r0.mo95275s0()     // Catch:{ all -> 0x002e }
            goto L_0x0021
        L_0x001c:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0021:
            boolean r0 = r6.mo95239i0()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0030
            ef1.C40785c.m118257a()     // Catch:{ all -> 0x002e }
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch:{ all -> 0x002e }
            goto L_0x000d
        L_0x002e:
            r0 = move-exception
            goto L_0x0058
        L_0x0030:
            ef1.y0 r0 = r6.f96528g     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0037
            ef1.C40882y0.m118579e0(r0, r2, r1, r3)     // Catch:{ all -> 0x0060 }
        L_0x0037:
            ef1.C40785c.m118257a()
            java.lang.Object r0 = r6.mo95236d0()
            java.lang.Object r0 = ef1.C40877w1.m118569h(r0)
            boolean r1 = r0 instanceof ef1.C40881y
            if (r1 == 0) goto L_0x0049
            r3 = r0
            ef1.y r3 = (ef1.C40881y) r3
        L_0x0049:
            if (r3 != 0) goto L_0x004c
            return r0
        L_0x004c:
            java.lang.Throwable r0 = r3.f96602a
            throw r0
        L_0x004f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            r6.mo95232H(r0)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x0058:
            ef1.y0 r4 = r6.f96528g     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005f
            ef1.C40882y0.m118579e0(r4, r2, r1, r3)     // Catch:{ all -> 0x0060 }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            ef1.C40785c.m118257a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40805f.mo95158O0():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public boolean mo95159j0() {
        return true;
    }
}
