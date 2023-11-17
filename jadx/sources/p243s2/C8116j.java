package p243s2;

/* renamed from: s2.j */
final class C8116j extends C8115i {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    private final Object f23268d;

    /* renamed from: s2.j$a */
    class C8117a implements C8105e {

        /* renamed from: a */
        final /* synthetic */ C8102b f23269a;

        C8117a(C8102b bVar) {
            this.f23269a = bVar;
        }

        public Object apply(Object obj) {
            this.f23269a.apply(obj);
            return obj;
        }
    }

    C8116j(Object obj) {
        this.f23268d = obj;
    }

    /* renamed from: b */
    public C8115i mo23276b(C8102b bVar) {
        C8140s.m30753a(bVar);
        return mo23281g(new C8117a(bVar));
    }

    /* renamed from: c */
    public C8115i mo23277c(C8105e eVar) {
        C8140s.m30753a(eVar);
        return (C8115i) C8140s.m30754b((C8115i) eVar.apply(this.f23268d), "the Function passed to Optional.flatMap() must not return null.");
    }

    /* renamed from: e */
    public Object mo23278e() {
        return this.f23268d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8116j) {
            return this.f23268d.equals(((C8116j) obj).f23268d);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo23280f() {
        return true;
    }

    /* renamed from: g */
    public C8115i mo23281g(C8105e eVar) {
        return new C8116j(C8140s.m30754b(eVar.apply(this.f23268d), "the Function passed to Optional.map() must not return null."));
    }

    public int hashCode() {
        return this.f23268d.hashCode() + 1502476572;
    }

    /* renamed from: i */
    public Object mo23283i() {
        return this.f23268d;
    }

    public String toString() {
        return "Optional.of(" + this.f23268d + ")";
    }
}
