package kotlinx.coroutines.internal;

import ef1.C40793d0;
import ef1.C40839n;
import ef1.C40840n0;
import ef1.C40844o0;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C41606k extends C40793d0 implements Runnable, C40844o0 {

    /* renamed from: f */
    private final C40793d0 f97805f;

    /* renamed from: g */
    private final int f97806g;

    /* renamed from: h */
    private final /* synthetic */ C40844o0 f97807h;

    /* renamed from: i */
    private final C41614p f97808i;

    /* renamed from: j */
    private final Object f97809j;
    private volatile int runningWorkers;

    public C41606k(C40793d0 d0Var, int i) {
        C40844o0 o0Var;
        this.f97805f = d0Var;
        this.f97806g = i;
        if (d0Var instanceof C40844o0) {
            o0Var = (C40844o0) d0Var;
        } else {
            o0Var = null;
        }
        this.f97807h = o0Var == null ? C40840n0.m118357a() : o0Var;
        this.f97808i = new C41614p(false);
        this.f97809j = new Object();
    }

    /* renamed from: Q */
    private final boolean m120704Q(Runnable runnable) {
        this.f97808i.mo96400a(runnable);
        if (this.runningWorkers >= this.f97806g) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private final boolean m120705e0() {
        synchronized (this.f97809j) {
            if (this.runningWorkers >= this.f97806g) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: e */
    public void mo95161e(long j, C40839n nVar) {
        this.f97807h.mo95161e(j, nVar);
    }

    /* renamed from: h */
    public void mo95148h(C41752f fVar, Runnable runnable) {
        if (!m120704Q(runnable) && m120705e0()) {
            this.f97805f.mo95148h(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f97809j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f97808i.mo96402c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = he1.C41238w.f97225a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.p r2 = r4.f97808i
            java.lang.Object r2 = r2.mo96403d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            me1.g r3 = me1.C41758g.f98029d
            ef1.C40810g0.m118295a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            ef1.d0 r2 = r4.f97805f
            boolean r2 = r2.mo95149i(r4)
            if (r2 == 0) goto L_0x0002
            ef1.d0 r0 = r4.f97805f
            r0.mo95148h(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f97809j
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.p r2 = r4.f97808i     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo96402c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41606k.run():void");
    }
}
