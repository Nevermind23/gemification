package p342j$.util.stream;

/* renamed from: j$.util.stream.j2 */
final class C9672j2 extends C9627a2 {

    /* renamed from: b */
    long f26402b;

    /* renamed from: c */
    long f26403c;

    /* renamed from: d */
    final /* synthetic */ C9677k2 f26404d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9672j2(C9677k2 k2Var, C9657g2 g2Var) {
        super(g2Var);
        this.f26404d = k2Var;
        this.f26402b = k2Var.f26412t;
        long j = k2Var.f26413u;
        this.f26403c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(int i) {
        long j = this.f26402b;
        if (j == 0) {
            long j2 = this.f26403c;
            if (j2 > 0) {
                this.f26403c = j2 - 1;
                this.f26342a.accept(i);
                return;
            }
            return;
        }
        this.f26402b = j - 1;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26342a.mo25695p(C9735w0.m35798L0(j, this.f26404d.f26412t, this.f26403c));
    }

    /* renamed from: r */
    public final boolean mo25696r() {
        return this.f26403c == 0 || this.f26342a.mo25696r();
    }
}
