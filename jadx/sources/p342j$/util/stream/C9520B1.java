package p342j$.util.stream;

import com.github.mikephil.charting.utils.Utils;
import p342j$.util.C9504k;
import p342j$.util.function.C9467k;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.B1 */
final class C9520B1 implements C9583P1, C9642d2 {

    /* renamed from: a */
    private boolean f26167a;

    /* renamed from: b */
    private double f26168b;

    /* renamed from: c */
    final /* synthetic */ C9467k f26169c;

    C9520B1(C9467k kVar) {
        this.f26169c = kVar;
    }

    public final void accept(double d) {
        if (this.f26167a) {
            this.f26167a = false;
        } else {
            d = this.f26169c.applyAsDouble(this.f26168b, d);
        }
        this.f26168b = d;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25697s((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object get() {
        return this.f26167a ? C9504k.m34864a() : C9504k.m34865d(this.f26168b);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        C9520B1 b1 = (C9520B1) p1;
        if (!b1.f26167a) {
            accept(b1.f26168b);
        }
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26167a = true;
        this.f26168b = Utils.DOUBLE_EPSILON;
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }
}
