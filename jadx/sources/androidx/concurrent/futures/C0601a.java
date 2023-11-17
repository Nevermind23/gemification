package androidx.concurrent.futures;

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

/* renamed from: androidx.concurrent.futures.a */
public abstract class C0601a implements C8421a {

    /* renamed from: g */
    static final boolean f2451g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h */
    private static final Logger f2452h;

    /* renamed from: i */
    static final C0603b f2453i;

    /* renamed from: j */
    private static final Object f2454j = new Object();

    /* renamed from: d */
    volatile Object f2455d;

    /* renamed from: e */
    volatile C0607e f2456e;

    /* renamed from: f */
    volatile C0610h f2457f;

    /* renamed from: androidx.concurrent.futures.a$b */
    private static abstract class C0603b {
        private C0603b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo2822a(C0601a aVar, C0607e eVar, C0607e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo2823b(C0601a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo2824c(C0601a aVar, C0610h hVar, C0610h hVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo2825d(C0610h hVar, C0610h hVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo2826e(C0610h hVar, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.a$c */
    private static final class C0604c {

        /* renamed from: c */
        static final C0604c f2458c;

        /* renamed from: d */
        static final C0604c f2459d;

        /* renamed from: a */
        final boolean f2460a;

        /* renamed from: b */
        final Throwable f2461b;

        static {
            if (C0601a.f2451g) {
                f2459d = null;
                f2458c = null;
                return;
            }
            f2459d = new C0604c(false, (Throwable) null);
            f2458c = new C0604c(true, (Throwable) null);
        }

        C0604c(boolean z, Throwable th) {
            this.f2460a = z;
            this.f2461b = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$d */
    private static final class C0605d {

        /* renamed from: b */
        static final C0605d f2462b = new C0605d(new C0606a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f2463a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        class C0606a extends Throwable {
            C0606a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C0605d(Throwable th) {
            this.f2463a = (Throwable) C0601a.m2333f(th);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$e */
    private static final class C0607e {

        /* renamed from: d */
        static final C0607e f2464d = new C0607e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f2465a;

        /* renamed from: b */
        final Executor f2466b;

        /* renamed from: c */
        C0607e f2467c;

        C0607e(Runnable runnable, Executor executor) {
            this.f2465a = runnable;
            this.f2466b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    private static final class C0608f extends C0603b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f2468a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f2469b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f2470c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f2471d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f2472e;

        C0608f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f2468a = atomicReferenceFieldUpdater;
            this.f2469b = atomicReferenceFieldUpdater2;
            this.f2470c = atomicReferenceFieldUpdater3;
            this.f2471d = atomicReferenceFieldUpdater4;
            this.f2472e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2822a(C0601a aVar, C0607e eVar, C0607e eVar2) {
            return C0611b.m2366a(this.f2471d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2823b(C0601a aVar, Object obj, Object obj2) {
            return C0611b.m2366a(this.f2472e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2824c(C0601a aVar, C0610h hVar, C0610h hVar2) {
            return C0611b.m2366a(this.f2470c, aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2825d(C0610h hVar, C0610h hVar2) {
            this.f2469b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2826e(C0610h hVar, Thread thread) {
            this.f2468a.lazySet(hVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$g */
    private static final class C0609g extends C0603b {
        C0609g() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2822a(C0601a aVar, C0607e eVar, C0607e eVar2) {
            synchronized (aVar) {
                if (aVar.f2456e != eVar) {
                    return false;
                }
                aVar.f2456e = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2823b(C0601a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2455d != obj) {
                    return false;
                }
                aVar.f2455d = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2824c(C0601a aVar, C0610h hVar, C0610h hVar2) {
            synchronized (aVar) {
                if (aVar.f2457f != hVar) {
                    return false;
                }
                aVar.f2457f = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2825d(C0610h hVar, C0610h hVar2) {
            hVar.f2475b = hVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2826e(C0610h hVar, Thread thread) {
            hVar.f2474a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    private static final class C0610h {

        /* renamed from: c */
        static final C0610h f2473c = new C0610h(false);

        /* renamed from: a */
        volatile Thread f2474a;

        /* renamed from: b */
        volatile C0610h f2475b;

        C0610h(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2828a(C0610h hVar) {
            C0601a.f2453i.mo2825d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2829b() {
            Thread thread = this.f2474a;
            if (thread != null) {
                this.f2474a = null;
                LockSupport.unpark(thread);
            }
        }

        C0610h() {
            C0601a.f2453i.mo2826e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.concurrent.futures.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$h> r0 = androidx.concurrent.futures.C0601a.C0610h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f2451g = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.C0601a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f2452h = r2
            androidx.concurrent.futures.a$f r2 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.concurrent.futures.a$e> r0 = androidx.concurrent.futures.C0601a.C0607e.class
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
            androidx.concurrent.futures.a$g r2 = new androidx.concurrent.futures.a$g
            r2.<init>()
        L_0x004e:
            f2453i = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f2452h
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f2454j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.C0601a.<clinit>():void");
    }

    protected C0601a() {
    }

    /* renamed from: a */
    private void m2331a(StringBuilder sb) {
        try {
            Object n = m2338n(this);
            sb.append("SUCCESS, result=[");
            sb.append(m2341v(n));
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

    /* renamed from: e */
    private static CancellationException m2332e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: f */
    static Object m2333f(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: g */
    private C0607e m2334g(C0607e eVar) {
        C0607e eVar2;
        do {
            eVar2 = this.f2456e;
        } while (!f2453i.mo2822a(this, eVar2, C0607e.f2464d));
        C0607e eVar3 = eVar2;
        C0607e eVar4 = eVar;
        C0607e eVar5 = eVar3;
        while (eVar5 != null) {
            C0607e eVar6 = eVar5.f2467c;
            eVar5.f2467c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: h */
    static void m2335h(C0601a aVar) {
        aVar.m2339r();
        aVar.mo2809b();
        C0607e g = aVar.m2334g((C0607e) null);
        while (g != null) {
            C0607e eVar = g.f2467c;
            m2336j(g.f2465a, g.f2466b);
            g = eVar;
        }
    }

    /* renamed from: j */
    private static void m2336j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f2452h;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: l */
    private Object m2337l(Object obj) {
        if (obj instanceof C0604c) {
            throw m2332e("Task was cancelled.", ((C0604c) obj).f2461b);
        } else if (obj instanceof C0605d) {
            throw new ExecutionException(((C0605d) obj).f2463a);
        } else if (obj == f2454j) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: n */
    static Object m2338n(Future future) {
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

    /* renamed from: r */
    private void m2339r() {
        C0610h hVar;
        do {
            hVar = this.f2457f;
        } while (!f2453i.mo2824c(this, hVar, C0610h.f2473c));
        while (hVar != null) {
            hVar.mo2829b();
            hVar = hVar.f2475b;
        }
    }

    /* renamed from: s */
    private void m2340s(C0610h hVar) {
        hVar.f2474a = null;
        while (true) {
            C0610h hVar2 = this.f2457f;
            if (hVar2 != C0610h.f2473c) {
                C0610h hVar3 = null;
                while (hVar2 != null) {
                    C0610h hVar4 = hVar2.f2475b;
                    if (hVar2.f2474a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f2475b = hVar4;
                        if (hVar3.f2474a == null) {
                        }
                    } else if (!f2453i.mo2824c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: v */
    private String m2341v(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2809b() {
    }

    /* renamed from: c */
    public final void mo2810c(Runnable runnable, Executor executor) {
        m2333f(runnable);
        m2333f(executor);
        C0607e eVar = this.f2456e;
        if (eVar != C0607e.f2464d) {
            C0607e eVar2 = new C0607e(runnable, executor);
            do {
                eVar2.f2467c = eVar;
                if (!f2453i.mo2822a(this, eVar, eVar2)) {
                    eVar = this.f2456e;
                } else {
                    return;
                }
            } while (eVar != C0607e.f2464d);
        }
        m2336j(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        C0604c cVar;
        Object obj = this.f2455d;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || false) {
            if (f2451g) {
                cVar = new C0604c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                cVar = C0604c.f2458c;
            } else {
                cVar = C0604c.f2459d;
            }
            if (f2453i.mo2823b(this, obj, cVar)) {
                if (z) {
                    mo2816o();
                }
                m2335h(this);
                return true;
            }
        }
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f2455d;
            if ((obj != null) && true) {
                return m2337l(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0610h hVar = this.f2457f;
                if (hVar != C0610h.f2473c) {
                    C0610h hVar2 = new C0610h();
                    do {
                        hVar2.mo2828a(hVar);
                        if (f2453i.mo2824c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2455d;
                                    if ((obj2 != null) && true) {
                                        return m2337l(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m2340s(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m2340s(hVar2);
                        } else {
                            hVar = this.f2457f;
                        }
                    } while (hVar != C0610h.f2473c);
                }
                return m2337l(this.f2455d);
            }
            while (nanos > 0) {
                Object obj3 = this.f2455d;
                if ((obj3 != null) && true) {
                    return m2337l(obj3);
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
        return this.f2455d instanceof C0604c;
    }

    public final boolean isDone() {
        return (this.f2455d != null) & true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2816o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo2817q() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo2818t(Object obj) {
        if (obj == null) {
            obj = f2454j;
        }
        if (!f2453i.mo2823b(this, (Object) null, obj)) {
            return false;
        }
        m2335h(this);
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
            m2331a(sb);
        } else {
            try {
                str = mo2817q();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2331a(sb);
            } else {
                sb.append(ProductType.PRODUCT_STATUS_PENDING);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo2820u(Throwable th) {
        if (!f2453i.mo2823b(this, (Object) null, new C0605d((Throwable) m2333f(th)))) {
            return false;
        }
        m2335h(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo2821w() {
        Object obj = this.f2455d;
        if (!(obj instanceof C0604c) || !((C0604c) obj).f2460a) {
            return false;
        }
        return true;
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2455d;
            if ((obj2 != null) && true) {
                return m2337l(obj2);
            }
            C0610h hVar = this.f2457f;
            if (hVar != C0610h.f2473c) {
                C0610h hVar2 = new C0610h();
                do {
                    hVar2.mo2828a(hVar);
                    if (f2453i.mo2824c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2455d;
                            } else {
                                m2340s(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return m2337l(obj);
                    }
                    hVar = this.f2457f;
                } while (hVar != C0610h.f2473c);
            }
            return m2337l(this.f2455d);
        }
        throw new InterruptedException();
    }
}
