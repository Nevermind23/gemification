package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.h3 */
public final /* synthetic */ class C9663h3 implements C9647e2 {

    /* renamed from: a */
    public final /* synthetic */ int f26392a;

    /* renamed from: b */
    public final /* synthetic */ C9428G f26393b;

    public /* synthetic */ C9663h3(C9428G g, int i) {
        this.f26392a = i;
        this.f26393b = g;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f26392a) {
            case 0:
                C9735w0.m35824p0();
                throw null;
            default:
                C9735w0.m35824p0();
                throw null;
        }
    }

    public final void accept(int i) {
        int i2 = this.f26392a;
        C9428G g = this.f26393b;
        switch (i2) {
            case 0:
                ((C9568L2) g).accept(i);
                return;
            default:
                g.accept(i);
                return;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f26392a) {
            case 0:
                C9735w0.m35837x0();
                throw null;
            default:
                C9735w0.m35837x0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f26392a) {
            case 0:
                mo25881q((Integer) obj);
                return;
            default:
                mo25881q((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26392a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        switch (this.f26392a) {
            case 0:
                g.getClass();
                return new C9425D(this, g);
            default:
                g.getClass();
                return new C9425D(this, g);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo25695p(long j) {
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        switch (this.f26392a) {
            case 0:
                C9735w0.m35829s0(this, num);
                return;
            default:
                C9735w0.m35829s0(this, num);
                return;
        }
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
