package p097h;

import java.util.concurrent.Executor;

/* renamed from: h.c */
public class C6408c extends C6413f {

    /* renamed from: c */
    private static volatile C6408c f19658c;

    /* renamed from: d */
    private static final Executor f19659d = new C6406a();

    /* renamed from: e */
    private static final Executor f19660e = new C6407b();

    /* renamed from: a */
    private C6413f f19661a;

    /* renamed from: b */
    private final C6413f f19662b;

    private C6408c() {
        C6409d dVar = new C6409d();
        this.f19662b = dVar;
        this.f19661a = dVar;
    }

    /* renamed from: f */
    public static Executor m25462f() {
        return f19660e;
    }

    /* renamed from: g */
    public static C6408c m25463g() {
        if (f19658c != null) {
            return f19658c;
        }
        synchronized (C6408c.class) {
            if (f19658c == null) {
                f19658c = new C6408c();
            }
        }
        return f19658c;
    }

    /* renamed from: a */
    public void mo20292a(Runnable runnable) {
        this.f19661a.mo20292a(runnable);
    }

    /* renamed from: b */
    public boolean mo20293b() {
        return this.f19661a.mo20293b();
    }

    /* renamed from: c */
    public void mo20294c(Runnable runnable) {
        this.f19661a.mo20294c(runnable);
    }
}
