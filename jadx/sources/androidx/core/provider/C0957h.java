package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.C1000a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.core.provider.h */
abstract class C0957h {

    /* renamed from: androidx.core.provider.h$a */
    private static class C0958a implements ThreadFactory {

        /* renamed from: d */
        private String f3593d;

        /* renamed from: e */
        private int f3594e;

        /* renamed from: androidx.core.provider.h$a$a */
        private static class C0959a extends Thread {

            /* renamed from: d */
            private final int f3595d;

            C0959a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f3595d = i;
            }

            public void run() {
                Process.setThreadPriority(this.f3595d);
                super.run();
            }
        }

        C0958a(String str, int i) {
            this.f3593d = str;
            this.f3594e = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C0959a(runnable, this.f3593d, this.f3594e);
        }
    }

    /* renamed from: androidx.core.provider.h$b */
    private static class C0960b implements Runnable {

        /* renamed from: d */
        private Callable f3596d;

        /* renamed from: e */
        private C1000a f3597e;

        /* renamed from: f */
        private Handler f3598f;

        /* renamed from: androidx.core.provider.h$b$a */
        class C0961a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C1000a f3599d;

            /* renamed from: e */
            final /* synthetic */ Object f3600e;

            C0961a(C1000a aVar, Object obj) {
                this.f3599d = aVar;
                this.f3600e = obj;
            }

            public void run() {
                this.f3599d.accept(this.f3600e);
            }
        }

        C0960b(Handler handler, Callable callable, C1000a aVar) {
            this.f3596d = callable;
            this.f3597e = aVar;
            this.f3598f = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f3596d.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f3598f.post(new C0961a(this.f3597e, obj));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m3432a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C0958a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static void m3433b(Executor executor, Callable callable, C1000a aVar) {
        executor.execute(new C0960b(C0942b.m3391a(), callable, aVar));
    }

    /* renamed from: c */
    static Object m3434c(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
