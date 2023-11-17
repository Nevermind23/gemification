package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.d1 */
final class C9641d1 extends C9568L2 implements C9524C0, C9745y0 {
    C9641d1() {
    }

    /* renamed from: C */
    public final C9362G mo25890C() {
        return super.spliterator();
    }

    /* renamed from: D */
    public final /* synthetic */ void mo25796j(Integer[] numArr, int i) {
        C9735w0.m35787A0(this, numArr, i);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final void accept(int i) {
        super.accept(i);
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9524C0 mo25682b() {
        return this;
    }

    /* renamed from: b */
    public final C9539F0 m35452b() {
        return this;
    }

    /* renamed from: c */
    public final C9534E0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: e */
    public final void mo25915e(Object obj, int i) {
        super.mo25915e((int[]) obj, i);
    }

    /* renamed from: g */
    public final Object mo25916g() {
        return (int[]) super.mo25916g();
    }

    /* renamed from: h */
    public final void mo25917h(Object obj) {
        super.mo25917h((C9428G) obj);
    }

    /* renamed from: o */
    public final void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        clear();
        mo25919z(j);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    public final C9368M spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124811spliterator() {
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
        return C9735w0.m35793G0(this, j, j2);
    }
}
