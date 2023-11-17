package p231r3;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: r3.a */
public final class C8049a implements ExecutorService {

    /* renamed from: e */
    private static final long f23206e = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f */
    private static volatile int f23207f;

    /* renamed from: d */
    private final ExecutorService f23208d;

    /* renamed from: r3.a$b */
    public static final class C8051b {

        /* renamed from: a */
        private final boolean f23209a;

        /* renamed from: b */
        private int f23210b;

        /* renamed from: c */
        private int f23211c;

        /* renamed from: d */
        private final ThreadFactory f23212d = new C8052c();

        /* renamed from: e */
        private C8056e f23213e = C8056e.f23227d;

        /* renamed from: f */
        private String f23214f;

        /* renamed from: g */
        private long f23215g;

        C8051b(boolean z) {
            this.f23209a = z;
        }

        /* renamed from: a */
        public C8049a mo23226a() {
            if (!TextUtils.isEmpty(this.f23214f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f23210b, this.f23211c, this.f23215g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C8054d(this.f23212d, this.f23214f, this.f23213e, this.f23209a));
                if (this.f23215g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C8049a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f23214f);
        }

        /* renamed from: b */
        public C8051b mo23227b(String str) {
            this.f23214f = str;
            return this;
        }

        /* renamed from: c */
        public C8051b mo23228c(int i) {
            this.f23210b = i;
            this.f23211c = i;
            return this;
        }
    }

    /* renamed from: r3.a$c */
    private static final class C8052c implements ThreadFactory {

        /* renamed from: r3.a$c$a */
        class C8053a extends Thread {
            C8053a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private C8052c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C8053a(runnable);
        }
    }

    /* renamed from: r3.a$d */
    private static final class C8054d implements ThreadFactory {

        /* renamed from: d */
        private final ThreadFactory f23217d;

        /* renamed from: e */
        private final String f23218e;

        /* renamed from: f */
        final C8056e f23219f;

        /* renamed from: g */
        final boolean f23220g;

        /* renamed from: h */
        private final AtomicInteger f23221h = new AtomicInteger();

        /* renamed from: r3.a$d$a */
        class C8055a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ Runnable f23222d;

            C8055a(Runnable runnable) {
                this.f23222d = runnable;
            }

            public void run() {
                if (C8054d.this.f23220g) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f23222d.run();
                } catch (Throwable th) {
                    C8054d.this.f23219f.mo23233a(th);
                }
            }
        }

        C8054d(ThreadFactory threadFactory, String str, C8056e eVar, boolean z) {
            this.f23217d = threadFactory;
            this.f23218e = str;
            this.f23219f = eVar;
            this.f23220g = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f23217d.newThread(new C8055a(runnable));
            newThread.setName("glide-" + this.f23218e + "-thread-" + this.f23221h.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: r3.a$e */
    public interface C8056e {

        /* renamed from: a */
        public static final C8056e f23224a = new C8057a();

        /* renamed from: b */
        public static final C8056e f23225b;

        /* renamed from: c */
        public static final C8056e f23226c = new C8059c();

        /* renamed from: d */
        public static final C8056e f23227d;

        /* renamed from: r3.a$e$a */
        class C8057a implements C8056e {
            C8057a() {
            }

            /* renamed from: a */
            public void mo23233a(Throwable th) {
            }
        }

        /* renamed from: r3.a$e$b */
        class C8058b implements C8056e {
            C8058b() {
            }

            /* renamed from: a */
            public void mo23233a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: r3.a$e$c */
        class C8059c implements C8056e {
            C8059c() {
            }

            /* renamed from: a */
            public void mo23233a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C8058b bVar = new C8058b();
            f23225b = bVar;
            f23227d = bVar;
        }

        /* renamed from: a */
        void mo23233a(Throwable th);
    }

    C8049a(ExecutorService executorService) {
        this.f23208d = executorService;
    }

    /* renamed from: a */
    static int m30545a() {
        return m30546b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m30546b() {
        if (f23207f == 0) {
            f23207f = Math.min(4, C8060b.m30561a());
        }
        return f23207f;
    }

    /* renamed from: c */
    public static C8051b m30547c() {
        return new C8051b(true).mo23228c(m30545a()).mo23227b("animation");
    }

    /* renamed from: d */
    public static C8049a m30548d() {
        return m30547c().mo23226a();
    }

    /* renamed from: e */
    public static C8051b m30549e() {
        return new C8051b(true).mo23228c(1).mo23227b("disk-cache");
    }

    /* renamed from: f */
    public static C8049a m30550f() {
        return m30549e().mo23226a();
    }

    /* renamed from: g */
    public static C8051b m30551g() {
        return new C8051b(false).mo23228c(m30546b()).mo23227b("source");
    }

    /* renamed from: h */
    public static C8049a m30552h() {
        return m30551g().mo23226a();
    }

    /* renamed from: i */
    public static C8049a m30553i() {
        return new C8049a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f23206e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C8054d(new C8052c(), "source-unlimited", C8056e.f23227d, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f23208d.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f23208d.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f23208d.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f23208d.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f23208d.isShutdown();
    }

    public boolean isTerminated() {
        return this.f23208d.isTerminated();
    }

    public void shutdown() {
        this.f23208d.shutdown();
    }

    public List shutdownNow() {
        return this.f23208d.shutdownNow();
    }

    public Future submit(Runnable runnable) {
        return this.f23208d.submit(runnable);
    }

    public String toString() {
        return this.f23208d.toString();
    }

    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f23208d.invokeAll(collection, j, timeUnit);
    }

    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f23208d.invokeAny(collection, j, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f23208d.submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return this.f23208d.submit(callable);
    }
}
