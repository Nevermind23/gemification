package p342j$.util.stream;

import p342j$.util.function.Predicate;

/* renamed from: j$.util.stream.o0 */
final class C9695o0 extends C9715s0 {

    /* renamed from: c */
    final /* synthetic */ C9720t0 f26438c;

    /* renamed from: d */
    final /* synthetic */ Predicate f26439d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9695o0(Predicate predicate, C9720t0 t0Var) {
        super(t0Var);
        this.f26438c = t0Var;
        this.f26439d = predicate;
    }

    public final void accept(Object obj) {
        if (!this.f26475a) {
            boolean test = this.f26439d.test(obj);
            C9720t0 t0Var = this.f26438c;
            if (test == t0Var.f26481a) {
                this.f26475a = true;
                this.f26476b = t0Var.f26482b;
            }
        }
    }
}
