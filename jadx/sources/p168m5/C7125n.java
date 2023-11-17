package p168m5;

import java.util.concurrent.Executor;
import p220q5.C7894a;

/* renamed from: m5.n */
class C7125n implements Executor {

    /* renamed from: d */
    private final Executor f21126d;

    /* renamed from: m5.n$a */
    static class C7126a implements Runnable {

        /* renamed from: d */
        private final Runnable f21127d;

        C7126a(Runnable runnable) {
            this.f21127d = runnable;
        }

        public void run() {
            try {
                this.f21127d.run();
            } catch (Exception e) {
                C7894a.m29866d("Executor", "Background execution failure.", e);
            }
        }
    }

    C7125n(Executor executor) {
        this.f21126d = executor;
    }

    public void execute(Runnable runnable) {
        this.f21126d.execute(new C7126a(runnable));
    }
}
