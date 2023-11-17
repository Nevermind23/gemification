package p638vd;

/* renamed from: vd.a */
public enum C18298a {
    PINCH(r1),
    TAP(r4),
    LONG_TAP(r4),
    SCROLL_HORIZONTAL(r1),
    SCROLL_VERTICAL(r1);
    

    /* renamed from: d */
    private C18303e f51704d;

    private C18298a(C18303e eVar) {
        this.f51704d = eVar;
    }

    /* renamed from: a */
    public boolean mo46034a(C18299b bVar) {
        return bVar == C18299b.NONE || bVar.mo46035b() == this.f51704d;
    }
}
