package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.m1 */
final class C9686m1 extends C9576N2 implements C9529D0, C9750z0 {
    C9686m1() {
    }

    /* renamed from: C */
    public final C9365J mo25902C() {
        return super.spliterator();
    }

    /* renamed from: D */
    public final /* synthetic */ void mo25796j(Long[] lArr, int i) {
        C9735w0.m35788B0(this, lArr, i);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final void accept(long j) {
        super.accept(j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25901k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9529D0 mo25682b() {
        return this;
    }

    /* renamed from: b */
    public final C9539F0 m35641b() {
        return this;
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: e */
    public final void mo25915e(Object obj, int i) {
        super.mo25915e((long[]) obj, i);
    }

    /* renamed from: g */
    public final Object mo25916g() {
        return (long[]) super.mo25916g();
    }

    /* renamed from: h */
    public final void mo25917h(Object obj) {
        super.mo25917h((C9444X) obj);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        C9735w0.m35833u0(this, l);
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

    public final C9368M spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124813spliterator() {
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
        return C9735w0.m35794H0(this, j, j2);
    }
}
