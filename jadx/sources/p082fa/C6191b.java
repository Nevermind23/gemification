package p082fa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: fa.b */
public abstract class C6191b {

    /* renamed from: a */
    private static final C6190a f19191a;

    /* renamed from: b */
    private static volatile C6190a f19192b;

    /* renamed from: fa.b$b */
    private static class C6193b implements C6190a {
        private C6193b() {
        }

        /* renamed from: a */
        public ExecutorService mo19780a(ThreadFactory threadFactory, C6194c cVar) {
            return mo19781b(1, threadFactory, cVar);
        }

        /* renamed from: b */
        public ExecutorService mo19781b(int i, ThreadFactory threadFactory, C6194c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C6193b bVar = new C6193b();
        f19191a = bVar;
        f19192b = bVar;
    }

    /* renamed from: a */
    public static C6190a m24683a() {
        return f19192b;
    }
}
