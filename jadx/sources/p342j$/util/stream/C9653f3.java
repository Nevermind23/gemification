package p342j$.util.stream;

import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.f3 */
public final /* synthetic */ class C9653f3 implements C9642d2 {

    /* renamed from: a */
    public final /* synthetic */ int f26383a;

    /* renamed from: b */
    public final /* synthetic */ C9475o f26384b;

    public /* synthetic */ C9653f3(C9475o oVar, int i) {
        this.f26383a = i;
        this.f26384b = oVar;
    }

    public final void accept(double d) {
        int i = this.f26383a;
        C9475o oVar = this.f26384b;
        switch (i) {
            case 0:
                ((C9560J2) oVar).accept(d);
                return;
            default:
                oVar.accept(d);
                return;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f26383a) {
            case 0:
                C9735w0.m35836w0();
                throw null;
            default:
                C9735w0.m35836w0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f26383a) {
            case 0:
                C9735w0.m35837x0();
                throw null;
            default:
                C9735w0.m35837x0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f26383a) {
            case 0:
                mo25697s((Double) obj);
                return;
            default:
                mo25697s((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26383a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        switch (this.f26383a) {
            case 0:
                oVar.getClass();
                return new C9469l(this, oVar);
            default:
                oVar.getClass();
                return new C9469l(this, oVar);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo25695p(long j) {
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        switch (this.f26383a) {
            case 0:
                C9735w0.m35826q0(this, d);
                return;
            default:
                C9735w0.m35826q0(this, d);
                return;
        }
    }
}
