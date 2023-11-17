package p097h;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h.d */
public class C6409d extends C6413f {

    /* renamed from: a */
    private final Object f19663a = new Object();

    /* renamed from: b */
    private final ExecutorService f19664b = Executors.newFixedThreadPool(4, new C6410a());

    /* renamed from: c */
    private volatile Handler f19665c;

    /* renamed from: h.d$a */
    class C6410a implements ThreadFactory {

        /* renamed from: d */
        private final AtomicInteger f19666d = new AtomicInteger(0);

        C6410a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f19666d.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: h.d$b */
    private static class C6411b {
        /* renamed from: a */
        public static Handler m25473a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: d */
    private static Handler m25469d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6411b.m25473a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: a */
    public void mo20292a(Runnable runnable) {
        this.f19664b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo20293b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo20294c(Runnable runnable) {
        if (this.f19665c == null) {
            synchronized (this.f19663a) {
                if (this.f19665c == null) {
                    this.f19665c = m25469d(Looper.getMainLooper());
                }
            }
        }
        this.f19665c.post(runnable);
    }
}
