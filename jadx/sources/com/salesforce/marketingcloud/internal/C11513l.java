package com.salesforce.marketingcloud.internal;

import com.salesforce.marketingcloud.C11461g;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.salesforce.marketingcloud.internal.l */
public class C11513l {

    /* renamed from: c */
    private static final String f33428c = "~!SdkExecutors";

    /* renamed from: a */
    private final ExecutorService f33429a;

    /* renamed from: b */
    private final ExecutorService f33430b;

    /* renamed from: com.salesforce.marketingcloud.internal.l$a */
    class C11514a implements RejectedExecutionHandler {
        C11514a() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C11461g.m41894e(C11513l.f33428c, "Fixed Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    /* renamed from: com.salesforce.marketingcloud.internal.l$b */
    class C11515b implements RejectedExecutionHandler {
        C11515b() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            C11461g.m41894e(C11513l.f33428c, "Cached Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    public C11513l() {
        this(Executors.newFixedThreadPool(1), Executors.newCachedThreadPool());
    }

    /* renamed from: a */
    public ExecutorService mo30088a() {
        return this.f33430b;
    }

    /* renamed from: b */
    public ExecutorService mo30089b() {
        return this.f33429a;
    }

    /* renamed from: c */
    public void mo30090c() {
        List<Runnable> shutdownNow;
        List<Runnable> shutdownNow2;
        if (!this.f33429a.isShutdown()) {
            this.f33429a.shutdown();
        }
        if (!this.f33430b.isShutdown()) {
            this.f33430b.shutdown();
        }
        try {
            ExecutorService executorService = this.f33429a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit) && (shutdownNow2 = this.f33429a.shutdownNow()) != null && !shutdownNow2.isEmpty()) {
                C11461g.m41884b(f33428c, "Shutdown DiskIO executor with %d tasks pending", Integer.valueOf(shutdownNow2.size()));
            }
            if (!this.f33430b.awaitTermination(5, timeUnit) && (shutdownNow = this.f33430b.shutdownNow()) != null && !shutdownNow.isEmpty()) {
                C11461g.m41884b(f33428c, "Shutdown CachedExecutor executor with %d tasks pending", Integer.valueOf(shutdownNow.size()));
            }
        } catch (InterruptedException e) {
            C11461g.m41885b(f33428c, e, "Unable to complete executors", new Object[0]);
        }
    }

    public C11513l(ExecutorService executorService, ExecutorService executorService2) {
        if (executorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService).setRejectedExecutionHandler(new C11514a());
        }
        this.f33429a = executorService;
        if (executorService2 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService2).setRejectedExecutionHandler(new C11515b());
        }
        this.f33430b = executorService2;
    }
}
