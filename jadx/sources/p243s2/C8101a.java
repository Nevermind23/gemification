package p243s2;

/* renamed from: s2.a */
final class C8101a extends C8115i {

    /* renamed from: d */
    static final C8101a f23261d = new C8101a();
    private static final long serialVersionUID = 0;

    private C8101a() {
    }

    /* renamed from: k */
    static C8115i m30644k() {
        return f23261d;
    }

    private Object readResolve() {
        return f23261d;
    }

    /* renamed from: b */
    public C8115i mo23276b(C8102b bVar) {
        C8140s.m30753a(bVar);
        return C8115i.m30668a();
    }

    /* renamed from: c */
    public C8115i mo23277c(C8105e eVar) {
        C8140s.m30753a(eVar);
        return C8115i.m30668a();
    }

    /* renamed from: e */
    public Object mo23278e() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public boolean mo23280f() {
        return false;
    }

    /* renamed from: g */
    public C8115i mo23281g(C8105e eVar) {
        C8140s.m30753a(eVar);
        return C8115i.m30668a();
    }

    public int hashCode() {
        return 2040732332;
    }

    /* renamed from: i */
    public Object mo23283i() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
