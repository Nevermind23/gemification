package p342j$.util.stream;

import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.P0 */
final class C9582P0 extends C9586Q0 implements C9529D0 {
    C9582P0(C9529D0 d0, C9529D0 d02) {
        super(d0, d02);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35791E0(this, consumer);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo25796j(Long[] lArr, int i) {
        C9735w0.m35788B0(this, lArr, i);
    }

    /* renamed from: d */
    public final Object mo25747d(int i) {
        return new long[i];
    }

    public final C9368M spliterator() {
        return new C9656g1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124804spliterator() {
        return new C9656g1(this);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35794H0(this, j, j2);
    }
}
