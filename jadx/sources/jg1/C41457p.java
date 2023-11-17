package jg1;

/* renamed from: jg1.p */
final class C41457p {

    /* renamed from: a */
    final Object f97587a;

    /* renamed from: b */
    final C41454n f97588b;

    /* renamed from: c */
    volatile boolean f97589c = true;

    C41457p(Object obj, C41454n nVar) {
        this.f97587a = obj;
        this.f97588b = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C41457p)) {
            return false;
        }
        C41457p pVar = (C41457p) obj;
        if (this.f97587a != pVar.f97587a || !this.f97588b.equals(pVar.f97588b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f97587a.hashCode() + this.f97588b.f97574f.hashCode();
    }
}
