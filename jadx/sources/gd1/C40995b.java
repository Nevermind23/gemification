package gd1;

import ae1.C40293a;
import android.os.Handler;
import android.os.Message;
import ed1.C40757w;
import hd1.C41205b;
import hd1.C41206c;
import java.util.concurrent.TimeUnit;

/* renamed from: gd1.b */
final class C40995b extends C40757w {

    /* renamed from: c */
    private final Handler f96802c;

    /* renamed from: d */
    private final boolean f96803d;

    /* renamed from: gd1.b$a */
    private static final class C40996a extends C40757w.C40760c {

        /* renamed from: d */
        private final Handler f96804d;

        /* renamed from: e */
        private final boolean f96805e;

        /* renamed from: f */
        private volatile boolean f96806f;

        C40996a(Handler handler, boolean z) {
            this.f96804d = handler;
            this.f96805e = z;
        }

        /* renamed from: c */
        public C41205b mo95059c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f96806f) {
                return C41206c.m119453a();
            } else {
                C40997b bVar = new C40997b(this.f96804d, C40293a.m116724u(runnable));
                Message obtain = Message.obtain(this.f96804d, bVar);
                obtain.obj = this;
                if (this.f96805e) {
                    obtain.setAsynchronous(true);
                }
                this.f96804d.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f96806f) {
                    return bVar;
                }
                this.f96804d.removeCallbacks(bVar);
                return C41206c.m119453a();
            }
        }

        public void dispose() {
            this.f96806f = true;
            this.f96804d.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f96806f;
        }
    }

    /* renamed from: gd1.b$b */
    private static final class C40997b implements Runnable, C41205b {

        /* renamed from: d */
        private final Handler f96807d;

        /* renamed from: e */
        private final Runnable f96808e;

        /* renamed from: f */
        private volatile boolean f96809f;

        C40997b(Handler handler, Runnable runnable) {
            this.f96807d = handler;
            this.f96808e = runnable;
        }

        public void dispose() {
            this.f96807d.removeCallbacks(this);
            this.f96809f = true;
        }

        public boolean isDisposed() {
            return this.f96809f;
        }

        public void run() {
            try {
                this.f96808e.run();
            } catch (Throwable th) {
                C40293a.m116722s(th);
            }
        }
    }

    C40995b(Handler handler, boolean z) {
        this.f96802c = handler;
        this.f96803d = z;
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C40996a(this.f96802c, this.f96803d);
    }

    /* renamed from: d */
    public C41205b mo95053d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C40997b bVar = new C40997b(this.f96802c, C40293a.m116724u(runnable));
            Message obtain = Message.obtain(this.f96802c, bVar);
            if (this.f96803d) {
                obtain.setAsynchronous(true);
            }
            this.f96802c.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
