package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.os.Process;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.m */
public class C11571m extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f33580a = 2;

    /* renamed from: com.salesforce.marketingcloud.media.m$a */
    class C11572a implements ThreadFactory {

        /* renamed from: com.salesforce.marketingcloud.media.m$a$a */
        class C11573a extends Thread {
            C11573a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        C11572a() {
        }

        public Thread newThread(Runnable runnable) {
            return new C11573a(runnable);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.m$b */
    private static class C11574b extends FutureTask<C11561e> implements Comparable<Runnable> {
        C11574b(C11561e eVar) {
            super(eVar, (Object) null);
        }

        /* renamed from: a */
        public int compareTo(Runnable runnable) {
            return 0;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.m$c */
    private static class C11575c extends FutureTask<C11576n> implements Comparable<Runnable> {

        /* renamed from: a */
        private final C11576n f33582a;

        C11575c(C11576n nVar) {
            super(nVar, (Object) null);
            this.f33582a = nVar;
        }

        /* renamed from: a */
        public int compareTo(Runnable runnable) {
            if (runnable instanceof C11575c) {
                return ((C11575c) runnable).f33582a.f33598l.ordinal() - this.f33582a.f33598l.ordinal();
            }
            return 0;
        }
    }

    C11571m() {
        super(2, 2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C11572a());
    }

    public Future<?> submit(Runnable runnable) {
        RunnableFuture cVar = runnable instanceof C11576n ? new C11575c((C11576n) runnable) : new C11574b((C11561e) runnable);
        execute(cVar);
        return cVar;
    }
}
