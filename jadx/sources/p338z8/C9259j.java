package p338z8;

import java.util.concurrent.Executor;

/* renamed from: z8.j */
public abstract class C9259j {

    /* renamed from: z8.j$a */
    private enum C9260a implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m34159a() {
        return C9260a.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m34160b(Executor executor) {
        return new C9261k(executor);
    }
}
