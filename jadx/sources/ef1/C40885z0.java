package ef1;

import androidx.concurrent.futures.C0611b;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.internal.C41601h0;
import kotlinx.coroutines.internal.C41603i0;
import kotlinx.coroutines.internal.C41615q;
import me1.C41752f;

/* renamed from: ef1.z0 */
public abstract class C40885z0 extends C40779a1 implements C40844o0 {

    /* renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96608i;

    /* renamed from: j */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96609j;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: ef1.z0$a */
    private final class C40886a extends C40887b {

        /* renamed from: f */
        private final C40839n f96610f;

        public C40886a(long j, C40839n nVar) {
            super(j);
            this.f96610f = nVar;
        }

        public void run() {
            this.f96610f.mo95189w(C40885z0.this, C41238w.f97225a);
        }

        public String toString() {
            return super.toString() + this.f96610f;
        }
    }

    /* renamed from: ef1.z0$b */
    public static abstract class C40887b implements Runnable, Comparable, C40870v0, C41603i0 {
        private volatile Object _heap;

        /* renamed from: d */
        public long f96612d;

        /* renamed from: e */
        private int f96613e = -1;

        public C40887b(long j) {
            this.f96612d = j;
        }

        /* renamed from: a */
        public void mo95287a(C41601h0 h0Var) {
            boolean z;
            if (this._heap != C40790c1.f96516a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = h0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public C41601h0 mo95288c() {
            Object obj = this._heap;
            if (obj instanceof C41601h0) {
                return (C41601h0) obj;
            }
            return null;
        }

        public final synchronized void dispose() {
            C40888c cVar;
            Object obj = this._heap;
            if (obj != C40790c1.f96516a) {
                if (obj instanceof C40888c) {
                    cVar = (C40888c) obj;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.mo96382g(this);
                }
                this._heap = C40790c1.f96516a;
            }
        }

        /* renamed from: e */
        public void mo95290e(int i) {
            this.f96613e = i;
        }

        /* renamed from: f */
        public int mo95291f() {
            return this.f96613e;
        }

        /* renamed from: g */
        public int compareTo(C40887b bVar) {
            int i = ((this.f96612d - bVar.f96612d) > 0 ? 1 : ((this.f96612d - bVar.f96612d) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: h */
        public final synchronized int mo95293h(long j, C40888c cVar, C40885z0 z0Var) {
            if (this._heap == C40790c1.f96516a) {
                return 2;
            }
            synchronized (cVar) {
                C40887b bVar = (C40887b) cVar.mo96378b();
                if (z0Var.m118597a1()) {
                    return 1;
                }
                if (bVar == null) {
                    cVar.f96614b = j;
                } else {
                    long j2 = bVar.f96612d;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - cVar.f96614b > 0) {
                        cVar.f96614b = j;
                    }
                }
                long j3 = this.f96612d;
                long j4 = cVar.f96614b;
                if (j3 - j4 < 0) {
                    this.f96612d = j4;
                }
                cVar.mo96377a(this);
                return 0;
            }
        }

        /* renamed from: j */
        public final boolean mo95294j(long j) {
            return j - this.f96612d >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f96612d + ']';
        }
    }

    /* renamed from: ef1.z0$c */
    public static final class C40888c extends C41601h0 {

        /* renamed from: b */
        public long f96614b;

        public C40888c(long j) {
            this.f96614b = j;
        }
    }

    static {
        Class<C40885z0> cls = C40885z0.class;
        Class<Object> cls2 = Object.class;
        f96608i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f96609j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    /* renamed from: O0 */
    private final void m118594O0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C0611b.m2366a(f96608i, this, (Object) null, C40790c1.f96517b)) {
                    return;
                }
            } else if (obj instanceof C41615q) {
                ((C41615q) obj).mo96405d();
                return;
            } else if (obj != C40790c1.f96517b) {
                C41615q qVar = new C41615q(8, true);
                qVar.mo96404a((Runnable) obj);
                if (C0611b.m2366a(f96608i, this, obj, qVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: V0 */
    private final Runnable m118595V0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C41615q) {
                C41615q qVar = (C41615q) obj;
                Object j = qVar.mo96409j();
                if (j != C41615q.f97821h) {
                    return (Runnable) j;
                }
                C0611b.m2366a(f96608i, this, obj, qVar.mo96408i());
            } else if (obj == C40790c1.f96517b) {
                return null;
            } else {
                if (C0611b.m2366a(f96608i, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: Y0 */
    private final boolean m118596Y0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m118597a1()) {
                return false;
            }
            if (obj == null) {
                if (C0611b.m2366a(f96608i, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C41615q) {
                C41615q qVar = (C41615q) obj;
                int a = qVar.mo96404a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C0611b.m2366a(f96608i, this, obj, qVar.mo96408i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C40790c1.f96517b) {
                return false;
            } else {
                C41615q qVar2 = new C41615q(8, true);
                qVar2.mo96404a((Runnable) obj);
                qVar2.mo96404a(runnable);
                if (C0611b.m2366a(f96608i, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public final boolean m118597a1() {
        return this._isCompleted;
    }

    /* renamed from: i1 */
    private final void m118598i1() {
        C40887b bVar;
        C40785c.m118257a();
        long nanoTime = System.nanoTime();
        while (true) {
            C40888c cVar = (C40888c) this._delayed;
            if (cVar != null && (bVar = (C40887b) cVar.mo96384i()) != null) {
                mo95136H0(nanoTime, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: q1 */
    private final int m118599q1(long j, C40887b bVar) {
        if (m118597a1()) {
            return 1;
        }
        C40888c cVar = (C40888c) this._delayed;
        if (cVar == null) {
            C0611b.m2366a(f96609j, this, (Object) null, new C40888c(j));
            Object obj = this._delayed;
            C41536l.m120486f(obj);
            cVar = (C40888c) obj;
        }
        return bVar.mo95293h(j, cVar, this);
    }

    /* renamed from: r1 */
    private final void m118600r1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: s1 */
    private final boolean m118601s1(C40887b bVar) {
        C40888c cVar = (C40888c) this._delayed;
        return (cVar != null ? (C40887b) cVar.mo96381e() : null) == bVar;
    }

    /* renamed from: W0 */
    public void mo95181W0(Runnable runnable) {
        if (m118596Y0(runnable)) {
            mo95137K0();
        } else {
            C40836m0.f96547k.mo95181W0(runnable);
        }
    }

    /* renamed from: e */
    public void mo95161e(long j, C40839n nVar) {
        long c = C40790c1.m118270c(j);
        if (c < 4611686018427387903L) {
            C40785c.m118257a();
            long nanoTime = System.nanoTime();
            C40886a aVar = new C40886a(c + nanoTime, nVar);
            mo95284p1(nanoTime, aVar);
            C40854q.m118426a(nVar, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f1 */
    public boolean mo95282f1() {
        if (!mo95274q0()) {
            return false;
        }
        C40888c cVar = (C40888c) this._delayed;
        if (cVar != null && !cVar.mo96380d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C41615q) {
                return ((C41615q) obj).mo96407g();
            }
            if (obj != C40790c1.f96517b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void mo95148h(C41752f fVar, Runnable runnable) {
        mo95181W0(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k1 */
    public final void mo95283k1() {
        this._queue = null;
        this._delayed = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public long mo95271m0() {
        C40887b bVar;
        if (super.mo95271m0() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C41615q) {
                if (!((C41615q) obj).mo96407g()) {
                    return 0;
                }
            } else if (obj == C40790c1.f96517b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C40888c cVar = (C40888c) this._delayed;
        if (cVar == null || (bVar = (C40887b) cVar.mo96381e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = bVar.f96612d;
        C40785c.m118257a();
        return C43429k.m124586e(j - System.nanoTime(), 0);
    }

    /* renamed from: p1 */
    public final void mo95284p1(long j, C40887b bVar) {
        int q1 = m118599q1(j, bVar);
        if (q1 != 0) {
            if (q1 == 1) {
                mo95136H0(j, bVar);
            } else if (q1 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m118601s1(bVar)) {
            mo95137K0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo95275s0() {
        /*
            r9 = this;
            boolean r0 = r9.mo95276x0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            ef1.z0$c r0 = (ef1.C40885z0.C40888c) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo96380d()
            if (r3 != 0) goto L_0x0045
            ef1.C40785c.m118257a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.i0 r5 = r0.mo96378b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            ef1.z0$b r5 = (ef1.C40885z0.C40887b) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo95294j(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m118596Y0(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = r8
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            kotlinx.coroutines.internal.i0 r5 = r0.mo96383h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
        L_0x003c:
            monitor-exit(r0)
        L_0x003d:
            ef1.z0$b r6 = (ef1.C40885z0.C40887b) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m118595V0()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo95271m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef1.C40885z0.mo95275s0():long");
    }

    public void shutdown() {
        C40834l2.f96545a.mo95179c();
        m118600r1(true);
        m118594O0();
        do {
        } while (mo95275s0() <= 0);
        m118598i1();
    }
}
