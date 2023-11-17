package p342j$.util.stream;

/* renamed from: j$.util.stream.n2 */
final class C9692n2 extends C9622Z1 {

    /* renamed from: b */
    long f26431b;

    /* renamed from: c */
    long f26432c;

    /* renamed from: d */
    final /* synthetic */ C9697o2 f26433d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9692n2(C9697o2 o2Var, C9657g2 g2Var) {
        super(g2Var);
        this.f26433d = o2Var;
        this.f26431b = o2Var.f26442t;
        long j = o2Var.f26443u;
        this.f26432c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(double d) {
        long j = this.f26431b;
        if (j == 0) {
            long j2 = this.f26432c;
            if (j2 > 0) {
                this.f26432c = j2 - 1;
                this.f26338a.accept(d);
                return;
            }
            return;
        }
        this.f26431b = j - 1;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26338a.mo25695p(C9735w0.m35798L0(j, this.f26433d.f26442t, this.f26432c));
    }

    /* renamed from: r */
    public final boolean mo25696r() {
        return this.f26432c == 0 || this.f26338a.mo25696r();
    }
}
