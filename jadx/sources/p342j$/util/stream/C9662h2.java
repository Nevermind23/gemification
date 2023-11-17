package p342j$.util.stream;

/* renamed from: j$.util.stream.h2 */
final class C9662h2 extends C9637c2 {

    /* renamed from: b */
    long f26389b;

    /* renamed from: c */
    long f26390c;

    /* renamed from: d */
    final /* synthetic */ C9667i2 f26391d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9662h2(C9667i2 i2Var, C9657g2 g2Var) {
        super(g2Var);
        this.f26391d = i2Var;
        this.f26389b = i2Var.f26394t;
        long j = i2Var.f26395u;
        this.f26390c = j < 0 ? Long.MAX_VALUE : j;
    }

    public final void accept(Object obj) {
        long j = this.f26389b;
        if (j == 0) {
            long j2 = this.f26390c;
            if (j2 > 0) {
                this.f26390c = j2 - 1;
                this.f26360a.accept(obj);
                return;
            }
            return;
        }
        this.f26389b = j - 1;
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26360a.mo25695p(C9735w0.m35798L0(j, this.f26391d.f26394t, this.f26390c));
    }

    /* renamed from: r */
    public final boolean mo25696r() {
        return this.f26390c == 0 || this.f26360a.mo25696r();
    }
}
