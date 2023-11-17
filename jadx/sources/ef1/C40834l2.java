package ef1;

/* renamed from: ef1.l2 */
public final class C40834l2 {

    /* renamed from: a */
    public static final C40834l2 f96545a = new C40834l2();

    /* renamed from: b */
    private static final ThreadLocal f96546b = new ThreadLocal();

    private C40834l2() {
    }

    /* renamed from: a */
    public final C40882y0 mo95177a() {
        return (C40882y0) f96546b.get();
    }

    /* renamed from: b */
    public final C40882y0 mo95178b() {
        ThreadLocal threadLocal = f96546b;
        C40882y0 y0Var = (C40882y0) threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        C40882y0 a = C40783b1.m118256a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo95179c() {
        f96546b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo95180d(C40882y0 y0Var) {
        f96546b.set(y0Var);
    }
}
