package p089g4;

import java.util.concurrent.Executor;

/* renamed from: g4.e */
public abstract class C6212e {

    /* renamed from: a */
    private static final Executor f19229a = new C6213a();

    /* renamed from: b */
    private static final Executor f19230b = new C6214b();

    /* renamed from: g4.e$a */
    class C6213a implements Executor {
        C6213a() {
        }

        public void execute(Runnable runnable) {
            C6224l.m24753v(runnable);
        }
    }

    /* renamed from: g4.e$b */
    class C6214b implements Executor {
        C6214b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m24710a() {
        return f19230b;
    }

    /* renamed from: b */
    public static Executor m24711b() {
        return f19229a;
    }
}
