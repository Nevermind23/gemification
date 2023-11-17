package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9368M;
import p342j$.util.C9381a;
import p342j$.util.C9417e0;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.M2 */
final class C9572M2 extends C9580O2 implements C9365J {

    /* renamed from: g */
    final /* synthetic */ C9576N2 f26250g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9572M2(C9576N2 n2, int i, int i2, int i3, int i4) {
        super(n2, i, i2, i3, i4);
        this.f26250g = n2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34651i(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25802b(int i, Object obj, Object obj2) {
        ((C9444X) obj2).accept(((long[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9368M mo25803f(Object obj, int i, int i2) {
        return C9417e0.m34764l((long[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C9368M mo25804i(int i, int i2, int i3, int i4) {
        return new C9572M2(this.f26250g, i, i2, i3, i4);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34658r(this, consumer);
    }
}
