package p342j$.util.stream;

/* renamed from: j$.util.stream.p */
final class C9699p extends C9637c2 {

    /* renamed from: b */
    boolean f26444b;

    /* renamed from: c */
    Object f26445c;

    C9699p(C9657g2 g2Var) {
        super(g2Var);
    }

    public final void accept(Object obj) {
        C9657g2 g2Var = this.f26360a;
        if (obj != null) {
            Object obj2 = this.f26445c;
            if (obj2 != null && obj.equals(obj2)) {
                return;
            }
        } else if (!this.f26444b) {
            this.f26444b = true;
            obj = null;
        } else {
            return;
        }
        this.f26445c = obj;
        g2Var.accept(obj);
    }

    /* renamed from: o */
    public final void mo25694o() {
        this.f26444b = false;
        this.f26445c = null;
        this.f26360a.mo25694o();
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26444b = false;
        this.f26445c = null;
        this.f26360a.mo25695p(-1);
    }
}
