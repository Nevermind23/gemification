package kotlinx.coroutines.scheduling;

import ef1.C40785c;
import ef1.C40832l0;
import he1.C41238w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41626y;
import xe1.C43263c;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final class C41628a implements Executor, Closeable {

    /* renamed from: k */
    public static final C41629a f97838k = new C41629a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private static final /* synthetic */ AtomicLongFieldUpdater f97839l;

    /* renamed from: m */
    static final /* synthetic */ AtomicLongFieldUpdater f97840m;

    /* renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f97841n;

    /* renamed from: o */
    public static final C41584a0 f97842o = new C41584a0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f97843d;

    /* renamed from: e */
    public final int f97844e;

    /* renamed from: f */
    public final long f97845f;

    /* renamed from: g */
    public final String f97846g;

    /* renamed from: h */
    public final C41635d f97847h;

    /* renamed from: i */
    public final C41635d f97848i;

    /* renamed from: j */
    public final C41626y f97849j;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    public static final class C41629a {
        private C41629a() {
        }

        public /* synthetic */ C41629a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    public /* synthetic */ class C41630b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97850a;

        static {
            int[] iArr = new int[C41632d.values().length];
            iArr[C41632d.PARKING.ordinal()] = 1;
            iArr[C41632d.BLOCKING.ordinal()] = 2;
            iArr[C41632d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C41632d.DORMANT.ordinal()] = 4;
            iArr[C41632d.TERMINATED.ordinal()] = 5;
            f97850a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    public enum C41632d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        Class<C41628a> cls = C41628a.class;
        f97839l = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f97840m = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f97841n = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public C41628a(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f97843d = i;
        this.f97844e = i2;
        this.f97845f = j;
        this.f97846g = str;
        boolean z4 = true;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j <= 0 ? false : z4) {
                        this.f97847h = new C41635d();
                        this.f97848i = new C41635d();
                        this.parkedWorkersStack = 0;
                        this.f97849j = new C41626y(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: R */
    private final C41639h m120781R(C41631c cVar, C41639h hVar, boolean z) {
        if (cVar == null || cVar.f97853e == C41632d.TERMINATED) {
            return hVar;
        }
        if (hVar.f97875e.mo96448b() == 0 && cVar.f97853e == C41632d.BLOCKING) {
            return hVar;
        }
        cVar.f97857i = true;
        return cVar.f97852d.mo96451a(hVar, z);
    }

    /* renamed from: U */
    private final boolean m120782U(long j) {
        if (C43429k.m124585d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f97843d) {
            int k = m120786k();
            if (k == 1 && this.f97843d > 1) {
                m120786k();
            }
            if (k > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m120783a(C41639h hVar) {
        boolean z = true;
        if (hVar.f97875e.mo96448b() != 1) {
            z = false;
        }
        if (z) {
            return this.f97848i.mo96400a(hVar);
        }
        return this.f97847h.mo96400a(hVar);
    }

    /* renamed from: a0 */
    static /* synthetic */ boolean m120784a0(C41628a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m120782U(j);
    }

    /* renamed from: e0 */
    private final boolean m120785e0() {
        C41631c s;
        do {
            s = m120790s();
            if (s == null) {
                return false;
            }
        } while (!C41631c.f97851k.compareAndSet(s, -1, 0));
        LockSupport.unpark(s);
        return true;
    }

    /* renamed from: k */
    private final int m120786k() {
        boolean z;
        synchronized (this.f97849j) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z2 = false;
            int d = C43429k.m124585d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (d >= this.f97843d) {
                return 0;
            }
            if (i >= this.f97844e) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.f97849j.mo96421b(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C41631c cVar = new C41631c(this, i2);
                this.f97849j.mo96422c(i2, cVar);
                if (i2 == ((int) (2097151 & f97840m.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    cVar.start();
                    int i3 = d + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: n */
    private final C41631c m120787n() {
        C41631c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C41631c) {
            cVar = (C41631c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !C41536l.m120484d(C41628a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: p */
    public static /* synthetic */ void m120788p(C41628a aVar, Runnable runnable, C41640i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C41643l.f97883f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo96428o(runnable, iVar, z);
    }

    /* renamed from: q */
    private final int m120789q(C41631c cVar) {
        Object h = cVar.mo96436h();
        while (h != f97842o) {
            if (h == null) {
                return 0;
            }
            C41631c cVar2 = (C41631c) h;
            int g = cVar2.mo96435g();
            if (g != 0) {
                return g;
            }
            h = cVar2.mo96436h();
        }
        return -1;
    }

    /* renamed from: s */
    private final C41631c m120790s() {
        while (true) {
            long j = this.parkedWorkersStack;
            C41631c cVar = (C41631c) this.f97849j.mo96421b((int) (2097151 & j));
            if (cVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int q = m120789q(cVar);
            if (q >= 0) {
                if (f97839l.compareAndSet(this, j, ((long) q) | j2)) {
                    cVar.mo96439p(f97842o);
                    return cVar;
                }
            }
        }
    }

    /* renamed from: y */
    private final void m120791y(boolean z) {
        long addAndGet = f97840m.addAndGet(this, 2097152);
        if (!z && !m120785e0() && !m120782U(addAndGet)) {
            m120785e0();
        }
    }

    /* renamed from: Q */
    public final void mo96423Q() {
        if (!m120785e0() && !m120784a0(this, 0, 1, (Object) null)) {
            m120785e0();
        }
    }

    public void close() {
        mo96433x(10000);
    }

    public void execute(Runnable runnable) {
        m120788p(this, runnable, (C41640i) null, false, 6, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final C41639h mo96427m(Runnable runnable, C41640i iVar) {
        long a = C41643l.f97882e.mo96445a();
        if (!(runnable instanceof C41639h)) {
            return new C41642k(runnable, a, iVar);
        }
        C41639h hVar = (C41639h) runnable;
        hVar.f97874d = a;
        hVar.f97875e = iVar;
        return hVar;
    }

    /* renamed from: o */
    public final void mo96428o(Runnable runnable, C41640i iVar, boolean z) {
        boolean z2;
        C40785c.m118257a();
        C41639h m = mo96427m(runnable, iVar);
        C41631c n = m120787n();
        C41639h R = m120781R(n, m, z);
        if (R == null || m120783a(R)) {
            if (!z || n == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (m.f97875e.mo96448b() != 0) {
                m120791y(z2);
            } else if (!z2) {
                mo96423Q();
            }
        } else {
            throw new RejectedExecutionException(this.f97846g + " was terminated");
        }
    }

    /* renamed from: t */
    public final boolean mo96429t(C41631c cVar) {
        long j;
        int g;
        if (cVar.mo96436h() != f97842o) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            g = cVar.mo96435g();
            cVar.mo96439p(this.f97849j.mo96421b((int) (2097151 & j)));
        } while (!f97839l.compareAndSet(this, j, ((2097152 + j) & -2097152) | ((long) g)));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f97849j.mo96420a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C41631c cVar = (C41631c) this.f97849j.mo96421b(i6);
            if (cVar != null) {
                int f = cVar.f97852d.mo96453f();
                int i7 = C41630b.f97850a[cVar.f97853e.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f97846g + '@' + C40832l0.m118330b(this) + "[Pool Size {core = " + this.f97843d + ", max = " + this.f97844e + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f97847h.mo96402c() + ", global blocking queue size = " + this.f97848i.mo96402c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f97843d - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void mo96431u(C41631c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = m120789q(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f97839l.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo96432v(C41639h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C40785c.m118257a();
            throw th;
        }
        C40785c.m118257a();
    }

    /* renamed from: x */
    public final void mo96433x(long j) {
        int i;
        C41639h hVar;
        if (f97841n.compareAndSet(this, 0, 1)) {
            C41631c n = m120787n();
            synchronized (this.f97849j) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.f97849j.mo96421b(i2);
                    C41536l.m120486f(b);
                    C41631c cVar = (C41631c) b;
                    if (cVar != n) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f97852d.mo96454g(this.f97848i);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f97848i.mo96401b();
            this.f97847h.mo96401b();
            while (true) {
                if (n != null) {
                    hVar = n.mo96434f(true);
                    if (hVar != null) {
                        continue;
                        mo96432v(hVar);
                    }
                }
                hVar = (C41639h) this.f97847h.mo96403d();
                if (hVar == null && (hVar = (C41639h) this.f97848i.mo96403d()) == null) {
                    break;
                }
                mo96432v(hVar);
            }
            if (n != null) {
                n.mo96441s(C41632d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    public final class C41631c extends Thread {

        /* renamed from: k */
        static final /* synthetic */ AtomicIntegerFieldUpdater f97851k = AtomicIntegerFieldUpdater.newUpdater(C41631c.class, "workerCtl");

        /* renamed from: d */
        public final C41646o f97852d;

        /* renamed from: e */
        public C41632d f97853e;

        /* renamed from: f */
        private long f97854f;

        /* renamed from: g */
        private long f97855g;

        /* renamed from: h */
        private int f97856h;

        /* renamed from: i */
        public boolean f97857i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C41631c() {
            setDaemon(true);
            this.f97852d = new C41646o();
            this.f97853e = C41632d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C41628a.f97842o;
            this.f97856h = C43263c.f101019d.mo101947c();
        }

        /* renamed from: b */
        private final void m120800b(int i) {
            if (i != 0) {
                C41628a.f97840m.addAndGet(C41628a.this, -2097152);
                if (this.f97853e != C41632d.TERMINATED) {
                    this.f97853e = C41632d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m120801c(int i) {
            if (i != 0 && mo96441s(C41632d.BLOCKING)) {
                C41628a.this.mo96423Q();
            }
        }

        /* renamed from: d */
        private final void m120802d(C41639h hVar) {
            int b = hVar.f97875e.mo96448b();
            m120804i(b);
            m120801c(b);
            C41628a.this.mo96432v(hVar);
            m120800b(b);
        }

        /* renamed from: e */
        private final C41639h m120803e(boolean z) {
            boolean z2;
            C41639h m;
            C41639h m2;
            if (z) {
                if (mo96437k(C41628a.this.f97843d * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (m2 = m120807m()) != null) {
                    return m2;
                }
                C41639h h = this.f97852d.mo96455h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m120807m()) != null) {
                    return m;
                }
            } else {
                C41639h m3 = m120807m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m120811t(false);
        }

        /* renamed from: i */
        private final void m120804i(int i) {
            this.f97854f = 0;
            if (this.f97853e == C41632d.PARKING) {
                this.f97853e = C41632d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m120805j() {
            return this.nextParkedWorker != C41628a.f97842o;
        }

        /* renamed from: l */
        private final void m120806l() {
            if (this.f97854f == 0) {
                this.f97854f = System.nanoTime() + C41628a.this.f97845f;
            }
            LockSupport.parkNanos(C41628a.this.f97845f);
            if (System.nanoTime() - this.f97854f >= 0) {
                this.f97854f = 0;
                m120812u();
            }
        }

        /* renamed from: m */
        private final C41639h m120807m() {
            if (mo96437k(2) == 0) {
                C41639h hVar = (C41639h) C41628a.this.f97847h.mo96403d();
                if (hVar != null) {
                    return hVar;
                }
                return (C41639h) C41628a.this.f97848i.mo96403d();
            }
            C41639h hVar2 = (C41639h) C41628a.this.f97848i.mo96403d();
            if (hVar2 != null) {
                return hVar2;
            }
            return (C41639h) C41628a.this.f97847h.mo96403d();
        }

        /* renamed from: n */
        private final void m120808n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C41628a.this.isTerminated() && this.f97853e != C41632d.TERMINATED) {
                    C41639h f = mo96434f(this.f97857i);
                    if (f != null) {
                        this.f97855g = 0;
                        m120802d(f);
                    } else {
                        this.f97857i = false;
                        if (this.f97855g == 0) {
                            m120810r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo96441s(C41632d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f97855g);
                            this.f97855g = 0;
                        }
                    }
                }
            }
            mo96441s(C41632d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m120809q() {
            boolean z;
            if (this.f97853e == C41632d.CPU_ACQUIRED) {
                return true;
            }
            C41628a aVar = C41628a.this;
            while (true) {
                long j = aVar.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (C41628a.f97840m.compareAndSet(aVar, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f97853e = C41632d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: r */
        private final void m120810r() {
            if (!m120805j()) {
                C41628a.this.mo96429t(this);
                return;
            }
            this.workerCtl = -1;
            while (m120805j() && this.workerCtl == -1 && !C41628a.this.isTerminated() && this.f97853e != C41632d.TERMINATED) {
                mo96441s(C41632d.PARKING);
                Thread.interrupted();
                m120806l();
            }
        }

        /* renamed from: t */
        private final C41639h m120811t(boolean z) {
            long j;
            int i = (int) (C41628a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo96437k(i);
            C41628a aVar = C41628a.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                k++;
                if (k > i) {
                    k = 1;
                }
                C41631c cVar = (C41631c) aVar.f97849j.mo96421b(k);
                if (!(cVar == null || cVar == this)) {
                    if (z) {
                        j = this.f97852d.mo96456k(cVar.f97852d);
                    } else {
                        j = this.f97852d.mo96457l(cVar.f97852d);
                    }
                    if (j == -1) {
                        return this.f97852d.mo96455h();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f97855g = j2;
            return null;
        }

        /* renamed from: u */
        private final void m120812u() {
            C41628a aVar = C41628a.this;
            synchronized (aVar.f97849j) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f97843d) {
                        if (f97851k.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo96438o(0);
                            aVar.mo96431u(this, i, 0);
                            int andDecrement = (int) (C41628a.f97840m.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i) {
                                Object b = aVar.f97849j.mo96421b(andDecrement);
                                C41536l.m120486f(b);
                                C41631c cVar = (C41631c) b;
                                aVar.f97849j.mo96422c(i, cVar);
                                cVar.mo96438o(i);
                                aVar.mo96431u(cVar, andDecrement, i);
                            }
                            aVar.f97849j.mo96422c(andDecrement, (Object) null);
                            C41238w wVar = C41238w.f97225a;
                            this.f97853e = C41632d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C41639h mo96434f(boolean z) {
            C41639h hVar;
            if (m120809q()) {
                return m120803e(z);
            }
            if (z) {
                hVar = this.f97852d.mo96455h();
                if (hVar == null) {
                    hVar = (C41639h) C41628a.this.f97848i.mo96403d();
                }
            } else {
                hVar = (C41639h) C41628a.this.f97848i.mo96403d();
            }
            if (hVar == null) {
                return m120811t(true);
            }
            return hVar;
        }

        /* renamed from: g */
        public final int mo96435g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo96436h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo96437k(int i) {
            int i2 = this.f97856h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f97856h = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo96438o(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(C41628a.this.f97846g);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo96439p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m120808n();
        }

        /* renamed from: s */
        public final boolean mo96441s(C41632d dVar) {
            boolean z;
            C41632d dVar2 = this.f97853e;
            if (dVar2 == C41632d.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C41628a.f97840m.addAndGet(C41628a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f97853e = dVar;
            }
            return z;
        }

        public C41631c(C41628a aVar, int i) {
            this();
            mo96438o(i);
        }
    }
}
