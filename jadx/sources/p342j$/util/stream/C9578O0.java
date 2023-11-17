package p342j$.util.stream;

import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.O0 */
final class C9578O0 extends C9586Q0 implements C9524C0 {
    C9578O0(C9524C0 c0, C9524C0 c02) {
        super(c0, c02);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25794a(Consumer consumer) {
        C9735w0.m35790D0(this, consumer);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo25796j(Integer[] numArr, int i) {
        C9735w0.m35787A0(this, numArr, i);
    }

    /* renamed from: d */
    public final Object mo25747d(int i) {
        return new int[i];
    }

    public final C9368M spliterator() {
        return new C9651f1(this);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final C9371P m124803spliterator() {
        return new C9651f1(this);
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35793G0(this, j, j2);
    }
}
