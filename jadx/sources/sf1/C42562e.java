package sf1;

import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;

/* renamed from: sf1.e */
public final class C42562e {

    /* renamed from: h */
    public static final C42564b f100168h = new C42564b((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final C42562e f100169i = new C42562e(new C42565c(C42197d.m122519M(C41536l.m120497q(C42197d.f99272i, " TaskRunner"), true)));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Logger f100170j;

    /* renamed from: a */
    private final C42563a f100171a;

    /* renamed from: b */
    private int f100172b = 10000;

    /* renamed from: c */
    private boolean f100173c;

    /* renamed from: d */
    private long f100174d;

    /* renamed from: e */
    private final List f100175e = new ArrayList();

    /* renamed from: f */
    private final List f100176f = new ArrayList();

    /* renamed from: g */
    private final Runnable f100177g = new C42566d(this);

    /* renamed from: sf1.e$a */
    public interface C42563a {
        /* renamed from: b */
        long mo98015b();

        /* renamed from: c */
        void mo98016c(C42562e eVar);

        /* renamed from: d */
        void mo98017d(C42562e eVar, long j);

        void execute(Runnable runnable);
    }

    /* renamed from: sf1.e$b */
    public static final class C42564b {
        private C42564b() {
        }

        public /* synthetic */ C42564b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger mo98019a() {
            return C42562e.f100170j;
        }
    }

    /* renamed from: sf1.e$c */
    public static final class C42565c implements C42563a {

        /* renamed from: a */
        private final ThreadPoolExecutor f100178a;

        public C42565c(ThreadFactory threadFactory) {
            C41536l.m120489i(threadFactory, "threadFactory");
            this.f100178a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: b */
        public long mo98015b() {
            return System.nanoTime();
        }

        /* renamed from: c */
        public void mo98016c(C42562e eVar) {
            C41536l.m120489i(eVar, "taskRunner");
            eVar.notify();
        }

        /* renamed from: d */
        public void mo98017d(C42562e eVar, long j) {
            C41536l.m120489i(eVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                eVar.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            C41536l.m120489i(runnable, "runnable");
            this.f100178a.execute(runnable);
        }
    }

    /* renamed from: sf1.e$d */
    public static final class C42566d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C42562e f100179d;

        C42566d(C42562e eVar) {
            this.f100179d = eVar;
        }

        public void run() {
            C42558a d;
            long j;
            while (true) {
                C42562e eVar = this.f100179d;
                synchronized (eVar) {
                    d = eVar.mo98010d();
                }
                if (d != null) {
                    C42561d d2 = d.mo97991d();
                    C41536l.m120486f(d2);
                    C42562e eVar2 = this.f100179d;
                    boolean isLoggable = C42562e.f100168h.mo98019a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d2.mo98002h().mo98012g().mo98015b();
                        C42559b.m123210c(d, d2, "starting");
                    } else {
                        j = -1;
                    }
                    try {
                        eVar2.m123231j(d);
                        C41238w wVar = C41238w.f97225a;
                        if (isLoggable) {
                            C42559b.m123210c(d, d2, C41536l.m120497q("finished run in ", C42559b.m123209b(d2.mo98002h().mo98012g().mo98015b() - j)));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            C42559b.m123210c(d, d2, C41536l.m120497q("failed a run in ", C42559b.m123209b(d2.mo98002h().mo98012g().mo98015b() - j)));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C42562e.class.getName());
        C41536l.m120488h(logger, "getLogger(TaskRunner::class.java.name)");
        f100170j = logger;
    }

    public C42562e(C42563a aVar) {
        C41536l.m120489i(aVar, "backend");
        this.f100171a = aVar;
    }

    /* renamed from: c */
    private final void m123229c(C42558a aVar, long j) {
        boolean z;
        if (!C42197d.f99271h || Thread.holdsLock(this)) {
            C42561d d = aVar.mo97991d();
            C41536l.m120486f(d);
            if (d.mo97997c() == aVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                boolean d2 = d.mo97998d();
                d.mo98006m(false);
                d.mo98005l((C42558a) null);
                this.f100175e.remove(d);
                if (j != -1 && !d2 && !d.mo98001g()) {
                    d.mo98004k(aVar, j, true);
                }
                if (!d.mo97999e().isEmpty()) {
                    this.f100176f.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* renamed from: e */
    private final void m123230e(C42558a aVar) {
        if (!C42197d.f99271h || Thread.holdsLock(this)) {
            aVar.mo97993g(-1);
            C42561d d = aVar.mo97991d();
            C41536l.m120486f(d);
            d.mo97999e().remove(aVar);
            this.f100176f.remove(d);
            d.mo98005l(aVar);
            this.f100175e.add(d);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m123231j(C42558a aVar) {
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(aVar.mo97989b());
            try {
                long f = aVar.mo94430f();
                synchronized (this) {
                    m123229c(aVar, f);
                    C41238w wVar = C41238w.f97225a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    m123229c(aVar, -1);
                    C41238w wVar2 = C41238w.f97225a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sf1.C42558a mo98010d() {
        /*
            r14 = this;
            boolean r0 = pf1.C42197d.f99271h
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List r0 = r14.f100176f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            sf1.e$a r0 = r14.f100171a
            long r2 = r0.mo98015b()
            java.util.List r0 = r14.f100176f
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            sf1.d r7 = (sf1.C42561d) r7
            java.util.List r7 = r7.mo97999e()
            java.lang.Object r7 = r7.get(r9)
            sf1.a r7 = (sf1.C42558a) r7
            long r10 = r7.mo97990c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009d
            r14.m123230e(r6)
            if (r0 != 0) goto L_0x0095
            boolean r0 = r14.f100173c
            if (r0 != 0) goto L_0x009c
            java.util.List r0 = r14.f100176f
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x009c
        L_0x0095:
            sf1.e$a r0 = r14.f100171a
            java.lang.Runnable r1 = r14.f100177g
            r0.execute(r1)
        L_0x009c:
            return r6
        L_0x009d:
            boolean r0 = r14.f100173c
            if (r0 == 0) goto L_0x00ae
            long r6 = r14.f100174d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            sf1.e$a r0 = r14.f100171a
            r0.mo98016c(r14)
        L_0x00ad:
            return r1
        L_0x00ae:
            r14.f100173c = r8
            long r2 = r2 + r4
            r14.f100174d = r2
            sf1.e$a r0 = r14.f100171a     // Catch:{ InterruptedException -> 0x00be }
            r0.mo98017d(r14, r4)     // Catch:{ InterruptedException -> 0x00be }
        L_0x00b8:
            r14.f100173c = r9
            goto L_0x0032
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c2
        L_0x00be:
            r14.mo98011f()     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x00c2:
            r14.f100173c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.C42562e.mo98010d():sf1.a");
    }

    /* renamed from: f */
    public final void mo98011f() {
        int size = this.f100175e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((C42561d) this.f100175e.get(size)).mo97996b();
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        int size2 = this.f100176f.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                C42561d dVar = (C42561d) this.f100176f.get(size2);
                dVar.mo97996b();
                if (dVar.mo97999e().isEmpty()) {
                    this.f100176f.remove(size2);
                }
                if (i2 >= 0) {
                    size2 = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final C42563a mo98012g() {
        return this.f100171a;
    }

    /* renamed from: h */
    public final void mo98013h(C42561d dVar) {
        C41536l.m120489i(dVar, "taskQueue");
        if (!C42197d.f99271h || Thread.holdsLock(this)) {
            if (dVar.mo97997c() == null) {
                if (!dVar.mo97999e().isEmpty()) {
                    C42197d.m122537c(this.f100176f, dVar);
                } else {
                    this.f100176f.remove(dVar);
                }
            }
            if (this.f100173c) {
                this.f100171a.mo98016c(this);
            } else {
                this.f100171a.execute(this.f100177g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    /* renamed from: i */
    public final C42561d mo98014i() {
        int i;
        synchronized (this) {
            i = this.f100172b;
            this.f100172b = i + 1;
        }
        return new C42561d(this, C41536l.m120497q("Q", Integer.valueOf(i)));
    }
}
