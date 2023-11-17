package p342j$.util.stream;

/* renamed from: j$.util.stream.l2 */
final class C9682l2 extends C9632b2 {

    /* renamed from: b */
    long f26416b;

    /* renamed from: c */
    long f26417c;

    /* renamed from: d */
    final /* synthetic */ C9687m2 f26418d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9682l2(C9687m2 m2Var, C9657g2 g2Var) {
        super(g2Var);
        this.f26418d = m2Var;
        this.f26416b = m2Var.f26423t;
        long j = m2Var.f26424u;
        this.f26417c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(long j) {
        long j2 = this.f26416b;
        if (j2 == 0) {
            long j3 = this.f26417c;
            if (j3 > 0) {
                this.f26417c = j3 - 1;
                this.f26347a.accept(j);
                return;
            }
            return;
        }
        this.f26416b = j2 - 1;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26347a.mo25695p(C9735w0.m35798L0(j, this.f26418d.f26423t, this.f26417c));
    }

    /* renamed from: r */
    public final boolean mo25696r() {
        return this.f26417c == 0 || this.f26347a.mo25696r();
    }
}
