package p176n0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n0.c */
abstract class C7190c {

    /* renamed from: i */
    private static final ThreadFactory f21340i;

    /* renamed from: j */
    private static final BlockingQueue f21341j;

    /* renamed from: k */
    public static final Executor f21342k;

    /* renamed from: l */
    private static C7196f f21343l;

    /* renamed from: m */
    private static volatile Executor f21344m;

    /* renamed from: d */
    private final C7198h f21345d;

    /* renamed from: e */
    private final FutureTask f21346e;

    /* renamed from: f */
    private volatile C7197g f21347f = C7197g.PENDING;

    /* renamed from: g */
    final AtomicBoolean f21348g = new AtomicBoolean();

    /* renamed from: h */
    final AtomicBoolean f21349h = new AtomicBoolean();

    /* renamed from: n0.c$a */
    static class C7191a implements ThreadFactory {

        /* renamed from: d */
        private final AtomicInteger f21350d = new AtomicInteger(1);

        C7191a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f21350d.getAndIncrement());
        }
    }

    /* renamed from: n0.c$b */
    class C7192b extends C7198h {
        C7192b() {
        }

        public Object call() {
            C7190c.this.f21349h.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = C7190c.this.mo21526b(this.f21360d);
                Binder.flushPendingCommands();
                C7190c.this.mo21556k(obj);
                return obj;
            } catch (Throwable th) {
                C7190c.this.mo21556k(obj);
                throw th;
            }
        }
    }

    /* renamed from: n0.c$c */
    class C7193c extends FutureTask {
        C7193c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C7190c.this.mo21557l(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C7190c.this.mo21557l((Object) null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: n0.c$d */
    static /* synthetic */ class C7194d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21353a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                n0.c$g[] r0 = p176n0.C7190c.C7197g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21353a = r0
                n0.c$g r1 = p176n0.C7190c.C7197g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21353a     // Catch:{ NoSuchFieldError -> 0x001d }
                n0.c$g r1 = p176n0.C7190c.C7197g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p176n0.C7190c.C7194d.<clinit>():void");
        }
    }

    /* renamed from: n0.c$e */
    private static class C7195e {

        /* renamed from: a */
        final C7190c f21354a;

        /* renamed from: b */
        final Object[] f21355b;

        C7195e(C7190c cVar, Object... objArr) {
            this.f21354a = cVar;
            this.f21355b = objArr;
        }
    }

    /* renamed from: n0.c$f */
    private static class C7196f extends Handler {
        C7196f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C7195e eVar = (C7195e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f21354a.mo21552d(eVar.f21355b[0]);
            } else if (i == 2) {
                eVar.f21354a.mo21555j(eVar.f21355b);
            }
        }
    }

    /* renamed from: n0.c$g */
    public enum C7197g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: n0.c$h */
    private static abstract class C7198h implements Callable {

        /* renamed from: d */
        Object[] f21360d;

        C7198h() {
        }
    }

    static {
        C7191a aVar = new C7191a();
        f21340i = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f21341j = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f21342k = threadPoolExecutor;
        f21344m = threadPoolExecutor;
    }

    C7190c() {
        C7192b bVar = new C7192b();
        this.f21345d = bVar;
        this.f21346e = new C7193c(bVar);
    }

    /* renamed from: e */
    private static Handler m27721e() {
        C7196f fVar;
        synchronized (C7190c.class) {
            if (f21343l == null) {
                f21343l = new C7196f();
            }
            fVar = f21343l;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean mo21550a(boolean z) {
        this.f21348g.set(true);
        return this.f21346e.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo21526b(Object... objArr);

    /* renamed from: c */
    public final C7190c mo21551c(Executor executor, Object... objArr) {
        if (this.f21347f != C7197g.PENDING) {
            int i = C7194d.f21353a[this.f21347f.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f21347f = C7197g.RUNNING;
            mo21554i();
            this.f21345d.f21360d = objArr;
            executor.execute(this.f21346e);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21552d(Object obj) {
        if (mo21553f()) {
            mo21527g(obj);
        } else {
            mo21528h(obj);
        }
        this.f21347f = C7197g.FINISHED;
    }

    /* renamed from: f */
    public final boolean mo21553f() {
        return this.f21348g.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo21527g(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo21528h(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo21554i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo21555j(Object... objArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Object mo21556k(Object obj) {
        m27721e().obtainMessage(1, new C7195e(this, obj)).sendToTarget();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo21557l(Object obj) {
        if (!this.f21349h.get()) {
            mo21556k(obj);
        }
    }
}
