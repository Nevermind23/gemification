package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.U0 */
final class C9601U0 extends C9560J2 implements C9519B0, C9740x0 {
    C9601U0() {
    }

    /* renamed from: C */
    public final C9359D mo25883C() {
        return super.spliterator();
    }

    /* renamed from: D */
    public final /* synthetic */ void mo25796j(Double[] dArr, int i) {
        C9735w0.m35839z0(this, dArr, i);
    }

    public final void accept(double d) {
        super.accept(d);
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

    /* renamed from: b */
    public final C9519B0 mo25682b() {
        return this;
    }

    /* renamed from: b */
    public final C9539F0 m35276b() {
        return this;
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: e */
    public final void mo25915e(Object obj, int i) {
        super.mo25915e((double[]) obj, i);
    }

    /* renamed from: g */
    public final Object mo25916g() {
        return (double[]) super.mo25916g();
    }

    /* renamed from: h */
    public final void mo25917h(Object obj) {
        super.mo25917h((C9475o) obj);
    }

    /* renamed from: o */
    public final void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        clear();
        mo25919z(j);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }

    public final C9368M spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124806spliterator() {
        return super.spliterator();
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    /* renamed from: u */
    public final /* synthetic */ Object[] mo25798u(C9431J j) {
        return C9735w0.m35838y0(this, j);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35792F0(this, j, j2);
    }
}
