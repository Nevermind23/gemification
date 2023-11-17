package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.j3 */
public final /* synthetic */ class C9673j3 implements C9652f2 {

    /* renamed from: a */
    public final /* synthetic */ int f26405a;

    /* renamed from: b */
    public final /* synthetic */ C9444X f26406b;

    public /* synthetic */ C9673j3(C9444X x, int i) {
        this.f26405a = i;
        this.f26406b = x;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f26405a) {
            case 0:
                C9735w0.m35824p0();
                throw null;
            default:
                C9735w0.m35824p0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f26405a) {
            case 0:
                C9735w0.m35836w0();
                throw null;
            default:
                C9735w0.m35836w0();
                throw null;
        }
    }

    public final void accept(long j) {
        int i = this.f26405a;
        C9444X x = this.f26406b;
        switch (i) {
            case 0:
                ((C9576N2) x).accept(j);
                return;
            default:
                x.accept(j);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f26405a) {
            case 0:
                mo25901k((Long) obj);
                return;
            default:
                mo25901k((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26405a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        switch (this.f26405a) {
            case 0:
                x.getClass();
                return new C9441U(this, x);
            default:
                x.getClass();
                return new C9441U(this, x);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        switch (this.f26405a) {
            case 0:
                C9735w0.m35833u0(this, l);
                return;
            default:
                C9735w0.m35833u0(this, l);
                return;
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
}
