package p342j$.util.stream;

import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.N0 */
final class C9574N0 extends C9586Q0 implements C9519B0 {
    C9574N0(C9519B0 b0, C9519B0 b02) {
        super(b0, b02);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35789C0(this, consumer);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo25796j(Double[] dArr, int i) {
        C9735w0.m35839z0(this, dArr, i);
    }

    /* renamed from: d */
    public final Object mo25747d(int i) {
        return new double[i];
    }

    public final C9368M spliterator() {
        return new C9646e1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124802spliterator() {
        return new C9646e1(this);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35792F0(this, j, j2);
    }
}
