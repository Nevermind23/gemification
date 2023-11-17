package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;

/* renamed from: j$.util.stream.W */
public final /* synthetic */ class C9608W implements C9428G {

    /* renamed from: a */
    public final /* synthetic */ int f26320a;

    /* renamed from: b */
    public final /* synthetic */ C9657g2 f26321b;

    public /* synthetic */ C9608W(int i, C9657g2 g2Var) {
        this.f26320a = i;
        this.f26321b = g2Var;
    }

    public final void accept(int i) {
        int i2 = this.f26320a;
        C9657g2 g2Var = this.f26321b;
        switch (i2) {
            case 0:
                g2Var.accept(i);
                return;
            default:
                ((C9616Y) g2Var).f26342a.accept(i);
                return;
        }
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        switch (this.f26320a) {
            case 0:
                g.getClass();
                return new C9425D(this, g);
            default:
                g.getClass();
                return new C9425D(this, g);
        }
    }
}
