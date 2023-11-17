package xh1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: xh1.e0 */
public abstract class C43303e0 {

    /* renamed from: xh1.e0$a */
    class C43304a {

        /* renamed from: a */
        Exception f101064a;

        C43304a() {
        }
    }

    /* renamed from: xh1.e0$b */
    class C43305b {

        /* renamed from: a */
        public Object f101065a;

        C43305b() {
        }
    }

    /* renamed from: xh1.e0$c */
    class C43306c implements C43309f {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f101066a;

        C43306c(CountDownLatch countDownLatch) {
            this.f101066a = countDownLatch;
        }

        public void run() {
            this.f101066a.await();
        }
    }

    /* renamed from: xh1.e0$d */
    class C43307d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C43305b f101067d;

        /* renamed from: e */
        final /* synthetic */ Callable f101068e;

        /* renamed from: f */
        final /* synthetic */ C43304a f101069f;

        /* renamed from: g */
        final /* synthetic */ CountDownLatch f101070g;

        C43307d(C43305b bVar, Callable callable, C43304a aVar, CountDownLatch countDownLatch) {
            this.f101067d = bVar;
            this.f101068e = callable;
            this.f101069f = aVar;
            this.f101070g = countDownLatch;
        }

        public void run() {
            try {
                this.f101067d.f101065a = this.f101068e.call();
            } catch (Exception e) {
                this.f101069f.f101064a = e;
            }
            this.f101070g.countDown();
        }
    }

    /* renamed from: xh1.e0$e */
    class C43308e implements Callable {

        /* renamed from: d */
        final /* synthetic */ Runnable f101071d;

        C43308e(Runnable runnable) {
            this.f101071d = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f101071d.run();
            return null;
        }
    }

    /* renamed from: xh1.e0$f */
    public interface C43309f {
        void run();
    }

    /* renamed from: xh1.e0$g */
    public static class C43310g {

        /* renamed from: a */
        private Thread f101072a = Thread.currentThread();

        /* renamed from: a */
        public void mo102001a() {
            this.f101072a = null;
        }
    }

    /* renamed from: a */
    public static void m124332a(CountDownLatch countDownLatch) {
        m124335d(new C43306c(countDownLatch));
    }

    /* renamed from: b */
    public static void m124333b() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    /* renamed from: c */
    static StackTraceElement[] m124334c(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    /* renamed from: d */
    public static void m124335d(C43309f fVar) {
        boolean z = false;
        while (true) {
            try {
                fVar.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public static Object m124336e(Handler handler, Callable callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            C43305b bVar = new C43305b();
            C43304a aVar = new C43304a();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new C43307d(bVar, callable, aVar, countDownLatch));
            m124332a(countDownLatch);
            if (aVar.f101064a == null) {
                return bVar.f101065a;
            }
            RuntimeException runtimeException = new RuntimeException(aVar.f101064a);
            runtimeException.setStackTrace(m124334c(aVar.f101064a.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    /* renamed from: f */
    public static void m124337f(Handler handler, Runnable runnable) {
        m124336e(handler, new C43308e(runnable));
    }
}
