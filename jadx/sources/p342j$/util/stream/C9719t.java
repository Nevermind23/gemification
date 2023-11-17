package p342j$.util.stream;

import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.stream.t */
public final /* synthetic */ class C9719t implements C9475o {

    /* renamed from: a */
    public final /* synthetic */ int f26478a;

    /* renamed from: b */
    public final /* synthetic */ C9657g2 f26479b;

    public /* synthetic */ C9719t(int i, C9657g2 g2Var) {
        this.f26478a = i;
        this.f26479b = g2Var;
    }

    public final void accept(double d) {
        int i = this.f26478a;
        C9657g2 g2Var = this.f26479b;
        switch (i) {
            case 0:
                g2Var.accept(d);
                return;
            default:
                ((C9724u) g2Var).f26338a.accept(d);
                return;
        }
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        switch (this.f26478a) {
            case 0:
                oVar.getClass();
                return new C9469l(this, oVar);
            default:
                oVar.getClass();
                return new C9469l(this, oVar);
        }
    }
}
