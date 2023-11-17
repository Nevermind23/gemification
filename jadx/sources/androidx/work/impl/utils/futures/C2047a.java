package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.C0611b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p262t8.C8421a;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: androidx.work.impl.utils.futures.a */
public abstract class C2047a implements C8421a {

    /* renamed from: g */
    static final boolean f6166g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h */
    private static final Logger f6167h;

    /* renamed from: i */
    static final C2049b f6168i;

    /* renamed from: j */
    private static final Object f6169j = new Object();

    /* renamed from: d */
    volatile Object f6170d;

    /* renamed from: e */
    volatile C2053e f6171e;

    /* renamed from: f */
    volatile C2057i f6172f;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    private static abstract class C2049b {
        private C2049b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo6900a(C2047a aVar, C2053e eVar, C2053e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo6901b(C2047a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo6902c(C2047a aVar, C2057i iVar, C2057i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo6903d(C2057i iVar, C2057i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6904e(C2057i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    private static final class C2050c {

        /* renamed from: c */
        static final C2050c f6173c;

        /* renamed from: d */
        static final C2050c f6174d;

        /* renamed from: a */
        final boolean f6175a;

        /* renamed from: b */
        final Throwable f6176b;

        static {
            if (C2047a.f6166g) {
                f6174d = null;
                f6173c = null;
                return;
            }
            f6174d = new C2050c(false, (Throwable) null);
            f6173c = new C2050c(true, (Throwable) null);
        }

        C2050c(boolean z, Throwable th) {
            this.f6175a = z;
            this.f6176b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    private static final class C2051d {

        /* renamed from: b */
        static final C2051d f6177b = new C2051d(new C2052a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f6178a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        class C2052a extends Throwable {
            C2052a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C2051d(Throwable th) {
            this.f6178a = (Throwable) C2047a.m7993e(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    private static final class C2053e {

        /* renamed from: d */
        static final C2053e f6179d = new C2053e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f6180a;

        /* renamed from: b */
        final Executor f6181b;

        /* renamed from: c */
        C2053e f6182c;

        C2053e(Runnable runnable, Executor executor) {
            this.f6180a = runnable;
            this.f6181b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    private static final class C2054f extends C2049b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f6183a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f6184b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f6185c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f6186d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f6187e;

        C2054f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f6183a = atomicReferenceFieldUpdater;
            this.f6184b = atomicReferenceFieldUpdater2;
            this.f6185c = atomicReferenceFieldUpdater3;
            this.f6186d = atomicReferenceFieldUpdater4;
            this.f6187e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6900a(C2047a aVar, C2053e eVar, C2053e eVar2) {
            return C0611b.m2366a(this.f6186d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6901b(C2047a aVar, Object obj, Object obj2) {
            return C0611b.m2366a(this.f6187e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6902c(C2047a aVar, C2057i iVar, C2057i iVar2) {
            return C0611b.m2366a(this.f6185c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6903d(C2057i iVar, C2057i iVar2) {
            this.f6184b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6904e(C2057i iVar, Thread thread) {
            this.f6183a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    private static final class C2055g implements Runnable {

        /* renamed from: d */
        final C2047a f6188d;

        /* renamed from: e */
        final C8421a f6189e;

        C2055g(C2047a aVar, C8421a aVar2) {
            this.f6188d = aVar;
            this.f6189e = aVar2;
        }

        public void run() {
            if (this.f6188d.f6170d == this) {
                if (C2047a.f6168i.mo6901b(this.f6188d, this, C2047a.m7998j(this.f6189e))) {
                    C2047a.m7995g(this.f6188d);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    private static final class C2056h extends C2049b {
        C2056h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6900a(C2047a aVar, C2053e eVar, C2053e eVar2) {
            synchronized (aVar) {
                if (aVar.f6171e != eVar) {
                    return false;
                }
                aVar.f6171e = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6901b(C2047a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f6170d != obj) {
                    return false;
                }
                aVar.f6170d = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6902c(C2047a aVar, C2057i iVar, C2057i iVar2) {
            synchronized (aVar) {
                if (aVar.f6172f != iVar) {
                    return false;
                }
                aVar.f6172f = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6903d(C2057i iVar, C2057i iVar2) {
            iVar.f6192b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6904e(C2057i iVar, Thread thread) {
            iVar.f6191a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    private static final class C2057i {

        /* renamed from: c */
        static final C2057i f6190c = new C2057i(false);

        /* renamed from: a */
        volatile Thread f6191a;

        /* renamed from: b */
        volatile C2057i f6192b;

        C2057i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6907a(C2057i iVar) {
            C2047a.f6168i.mo6903d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6908b() {
            Thread thread = this.f6191a;
            if (thread != null) {
                this.f6191a = null;
                LockSupport.unpark(thread);
            }
        }

        C2057i() {
            C2047a.f6168i.mo6904e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.C2047a.C2057i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f6166g = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.C2047a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f6167h = r2
            androidx.work.impl.utils.futures.a$f r2 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r0 = androidx.work.impl.utils.futures.C2047a.C2053e.class
            java.lang.String r3 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r2 = new androidx.work.impl.utils.futures.a$h
            r2.<init>()
        L_0x004e:
            f6168i = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f6167h
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f6169j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C2047a.<clinit>():void");
    }

    protected C2047a() {
    }

    /* renamed from: a */
    private void m7991a(StringBuilder sb) {
        try {
            Object k = m7999k(this);
            sb.append("SUCCESS, result=[");
            sb.append(m8002s(k));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: d */
    private static CancellationException m7992d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static Object m7993e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    private C2053e m7994f(C2053e eVar) {
        C2053e eVar2;
        do {
            eVar2 = this.f6171e;
        } while (!f6168i.mo6900a(this, eVar2, C2053e.f6179d));
        C2053e eVar3 = eVar2;
        C2053e eVar4 = eVar;
        C2053e eVar5 = eVar3;
        while (eVar5 != null) {
            C2053e eVar6 = eVar5.f6182c;
            eVar5.f6182c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: g */
    static void m7995g(C2047a aVar) {
        C2053e eVar = null;
        while (true) {
            aVar.m8000n();
            aVar.mo6888b();
            C2053e f = aVar.m7994f(eVar);
            while (true) {
                if (f != null) {
                    eVar = f.f6182c;
                    Runnable runnable = f.f6180a;
                    if (runnable instanceof C2055g) {
                        C2055g gVar = (C2055g) runnable;
                        aVar = gVar.f6188d;
                        if (aVar.f6170d == gVar) {
                            if (f6168i.mo6901b(aVar, gVar, m7998j(gVar.f6189e))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m7996h(runnable, f.f6181b);
                    }
                    f = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private static void m7996h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f6167h;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    private Object m7997i(Object obj) {
        if (obj instanceof C2050c) {
            throw m7992d("Task was cancelled.", ((C2050c) obj).f6176b);
        } else if (obj instanceof C2051d) {
            throw new ExecutionException(((C2051d) obj).f6178a);
        } else if (obj == f6169j) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: j */
    static Object m7998j(C8421a aVar) {
        if (aVar instanceof C2047a) {
            Object obj = ((C2047a) aVar).f6170d;
            if (!(obj instanceof C2050c)) {
                return obj;
            }
            C2050c cVar = (C2050c) obj;
            if (!cVar.f6175a) {
                return obj;
            }
            if (cVar.f6176b != null) {
                return new C2050c(false, cVar.f6176b);
            }
            return C2050c.f6174d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f6166g) && isCancelled) {
            return C2050c.f6174d;
        }
        try {
            Object k = m7999k(aVar);
            if (k == null) {
                return f6169j;
            }
            return k;
        } catch (ExecutionException e) {
            return new C2051d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C2050c(false, e2);
            }
            return new C2051d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new C2051d(th);
        }
    }

    /* renamed from: k */
    private static Object m7999k(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: n */
    private void m8000n() {
        C2057i iVar;
        do {
            iVar = this.f6172f;
        } while (!f6168i.mo6902c(this, iVar, C2057i.f6190c));
        while (iVar != null) {
            iVar.mo6908b();
            iVar = iVar.f6192b;
        }
    }

    /* renamed from: o */
    private void m8001o(C2057i iVar) {
        iVar.f6191a = null;
        while (true) {
            C2057i iVar2 = this.f6172f;
            if (iVar2 != C2057i.f6190c) {
                C2057i iVar3 = null;
                while (iVar2 != null) {
                    C2057i iVar4 = iVar2.f6192b;
                    if (iVar2.f6191a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f6192b = iVar4;
                        if (iVar3.f6191a == null) {
                        }
                    } else if (!f6168i.mo6902c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: s */
    private String m8002s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6888b() {
    }

    /* renamed from: c */
    public final void mo2810c(Runnable runnable, Executor executor) {
        m7993e(runnable);
        m7993e(executor);
        C2053e eVar = this.f6171e;
        if (eVar != C2053e.f6179d) {
            C2053e eVar2 = new C2053e(runnable, executor);
            do {
                eVar2.f6182c = eVar;
                if (!f6168i.mo6900a(this, eVar, eVar2)) {
                    eVar = this.f6171e;
                } else {
                    return;
                }
            } while (eVar != C2053e.f6179d);
        }
        m7996h(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [t8.a, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6170d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C2047a.C2055g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f6166g
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C2047a.C2050c.f6173c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C2047a.C2050c.f6174d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f6168i
            boolean r6 = r6.mo6901b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo6894l()
        L_0x0035:
            m7995g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C2047a.C2055g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.C2047a.C2055g) r0
            t8.a r0 = r0.f6189e
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C2047a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.C2047a) r4
            java.lang.Object r0 = r4.f6170d
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C2047a.C2055g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f6170d
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C2047a.C2055g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C2047a.cancel(boolean):boolean");
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f6170d;
            if ((obj != null) && (!(obj instanceof C2055g))) {
                return m7997i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C2057i iVar = this.f6172f;
                if (iVar != C2057i.f6190c) {
                    C2057i iVar2 = new C2057i();
                    do {
                        iVar2.mo6907a(iVar);
                        if (f6168i.mo6902c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6170d;
                                    if ((obj2 != null) && (!(obj2 instanceof C2055g))) {
                                        return m7997i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m8001o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m8001o(iVar2);
                        } else {
                            iVar = this.f6172f;
                        }
                    } while (iVar != C2057i.f6190c);
                }
                return m7997i(this.f6170d);
            }
            while (nanos > 0) {
                Object obj3 = this.f6170d;
                if ((obj3 != null) && (!(obj3 instanceof C2055g))) {
                    return m7997i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f6170d instanceof C2050c;
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f6170d;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof C2055g)) & z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6894l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo6895m() {
        Object obj = this.f6170d;
        if (obj instanceof C2055g) {
            return "setFuture=[" + m8002s(((C2055g) obj).f6189e) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo6896p(Object obj) {
        if (obj == null) {
            obj = f6169j;
        }
        if (!f6168i.mo6901b(this, (Object) null, obj)) {
            return false;
        }
        m7995g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo6897q(Throwable th) {
        if (!f6168i.mo6901b(this, (Object) null, new C2051d((Throwable) m7993e(th)))) {
            return false;
        }
        m7995g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo6898r(C8421a aVar) {
        C2055g gVar;
        C2051d dVar;
        m7993e(aVar);
        Object obj = this.f6170d;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f6168i.mo6901b(this, (Object) null, m7998j(aVar))) {
                    return false;
                }
                m7995g(this);
                return true;
            }
            gVar = new C2055g(this, aVar);
            if (f6168i.mo6901b(this, (Object) null, gVar)) {
                try {
                    aVar.mo2810c(gVar, C2058b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C2051d.f6177b;
                }
                return true;
            }
            obj = this.f6170d;
        }
        if (obj instanceof C2050c) {
            aVar.cancel(((C2050c) obj).f6175a);
        }
        return false;
        f6168i.mo6901b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7991a(sb);
        } else {
            try {
                str = mo6895m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7991a(sb);
            } else {
                sb.append(ProductType.PRODUCT_STATUS_PENDING);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6170d;
            if ((obj2 != null) && (!(obj2 instanceof C2055g))) {
                return m7997i(obj2);
            }
            C2057i iVar = this.f6172f;
            if (iVar != C2057i.f6190c) {
                C2057i iVar2 = new C2057i();
                do {
                    iVar2.mo6907a(iVar);
                    if (f6168i.mo6902c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6170d;
                            } else {
                                m8001o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C2055g))));
                        return m7997i(obj);
                    }
                    iVar = this.f6172f;
                } while (iVar != C2057i.f6190c);
            }
            return m7997i(this.f6170d);
        }
        throw new InterruptedException();
    }
}
