package p342j$.util.function;

/* renamed from: j$.util.function.e0 */
public final /* synthetic */ class C9456e0 implements C9462h0 {

    /* renamed from: a */
    public final /* synthetic */ int f26104a;

    /* renamed from: b */
    public final /* synthetic */ C9462h0 f26105b;

    /* renamed from: c */
    public final /* synthetic */ C9462h0 f26106c;

    public /* synthetic */ C9456e0(C9462h0 h0Var, C9462h0 h0Var2, int i) {
        this.f26104a = i;
        this.f26105b = h0Var;
        this.f26106c = h0Var2;
    }

    public final long applyAsLong(long j) {
        int i = this.f26104a;
        C9462h0 h0Var = this.f26106c;
        C9462h0 h0Var2 = this.f26105b;
        switch (i) {
            case 0:
                return h0Var.applyAsLong(h0Var2.applyAsLong(j));
            default:
                return h0Var2.applyAsLong(h0Var.applyAsLong(j));
        }
    }

    /* renamed from: d */
    public final C9462h0 mo25550d(C9462h0 h0Var) {
        switch (this.f26104a) {
            case 0:
                h0Var.getClass();
                return new C9456e0(this, h0Var, 0);
            default:
                h0Var.getClass();
                return new C9456e0(this, h0Var, 0);
        }
    }

    /* renamed from: e */
    public final C9462h0 mo25551e(C9462h0 h0Var) {
        switch (this.f26104a) {
            case 0:
                h0Var.getClass();
                return new C9456e0(this, h0Var, 1);
            default:
                h0Var.getClass();
                return new C9456e0(this, h0Var, 1);
        }
    }
}
