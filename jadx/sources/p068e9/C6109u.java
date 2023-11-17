package p068e9;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p027b9.C2184f;

/* renamed from: e9.u */
public abstract class C6109u {

    /* renamed from: e9.u$a */
    class C6110a implements ThreadFactory {

        /* renamed from: d */
        final /* synthetic */ String f18988d;

        /* renamed from: e */
        final /* synthetic */ AtomicLong f18989e;

        /* renamed from: e9.u$a$a */
        class C6111a extends C6053c {

            /* renamed from: d */
            final /* synthetic */ Runnable f18990d;

            C6111a(Runnable runnable) {
                this.f18990d = runnable;
            }

            /* renamed from: a */
            public void mo19544a() {
                this.f18990d.run();
            }
        }

        C6110a(String str, AtomicLong atomicLong) {
            this.f18988d = str;
            this.f18989e = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C6111a(runnable));
            newThread.setName(this.f18988d + this.f18989e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: e9.u$b */
    class C6112b extends C6053c {

        /* renamed from: d */
        final /* synthetic */ String f18992d;

        /* renamed from: e */
        final /* synthetic */ ExecutorService f18993e;

        /* renamed from: f */
        final /* synthetic */ long f18994f;

        /* renamed from: g */
        final /* synthetic */ TimeUnit f18995g;

        C6112b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f18992d = str;
            this.f18993e = executorService;
            this.f18994f = j;
            this.f18995g = timeUnit;
        }

        /* renamed from: a */
        public void mo19544a() {
            try {
                C2184f f = C2184f.m8346f();
                f.mo7089b("Executing shutdown hook for " + this.f18992d);
                this.f18993e.shutdown();
                if (!this.f18993e.awaitTermination(this.f18994f, this.f18995g)) {
                    C2184f f2 = C2184f.m8346f();
                    f2.mo7089b(this.f18992d + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f18993e.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C2184f.m8346f().mo7089b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f18992d}));
                this.f18993e.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m24431a(String str, ExecutorService executorService) {
        m24432b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m24432b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C6112b bVar = new C6112b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m24433c(String str) {
        ExecutorService e = m24435e(m24434d(str), new ThreadPoolExecutor.DiscardPolicy());
        m24431a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m24434d(String str) {
        return new C6110a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    private static ExecutorService m24435e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
