package p342j$.util.stream;

import p342j$.util.function.Function;

/* renamed from: j$.util.stream.U1 */
final class C9602U1 extends C9614X1 {

    /* renamed from: t */
    public final /* synthetic */ int f26290t;

    /* renamed from: u */
    final /* synthetic */ Function f26291u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9602U1(C9634c cVar, int i, Function function, int i2) {
        super(cVar, i);
        this.f26290t = i2;
        this.f26291u = function;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        switch (this.f26290t) {
            case 0:
                return new C9594S1(this, g2Var, 2);
            default:
                return new C9594S1(this, g2Var, 6);
        }
    }
}
