package p203p1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p216q1.C7817a;

/* renamed from: p1.u */
public class C7657u implements C7817a {

    /* renamed from: d */
    private final ArrayDeque f22268d = new ArrayDeque();

    /* renamed from: e */
    private final Executor f22269e;

    /* renamed from: f */
    private Runnable f22270f;

    /* renamed from: g */
    final Object f22271g = new Object();

    /* renamed from: p1.u$a */
    static class C7658a implements Runnable {

        /* renamed from: d */
        final C7657u f22272d;

        /* renamed from: e */
        final Runnable f22273e;

        C7658a(C7657u uVar, Runnable runnable) {
            this.f22272d = uVar;
            this.f22273e = runnable;
        }

        public void run() {
            try {
                this.f22273e.run();
                synchronized (this.f22272d.f22271g) {
                    this.f22272d.mo22358a();
                }
            } catch (Throwable th) {
                synchronized (this.f22272d.f22271g) {
                    this.f22272d.mo22358a();
                    throw th;
                }
            }
        }
    }

    public C7657u(Executor executor) {
        this.f22269e = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22358a() {
        Runnable runnable = (Runnable) this.f22268d.poll();
        this.f22270f = runnable;
        if (runnable != null) {
            this.f22269e.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f22271g) {
            this.f22268d.add(new C7658a(this, runnable));
            if (this.f22270f == null) {
                mo22358a();
            }
        }
    }

    /* renamed from: w */
    public boolean mo22360w() {
        boolean z;
        synchronized (this.f22271g) {
            if (!this.f22268d.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
