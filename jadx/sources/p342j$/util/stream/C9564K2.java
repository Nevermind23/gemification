package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9368M;
import p342j$.util.C9381a;
import p342j$.util.C9417e0;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.K2 */
final class C9564K2 extends C9580O2 implements C9362G {

    /* renamed from: g */
    final /* synthetic */ C9568L2 f26238g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9564K2(C9568L2 l2, int i, int i2, int i3, int i4) {
        super(l2, i, i2, i3, i4);
        this.f26238g = l2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34650f(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25802b(int i, Object obj, Object obj2) {
        ((C9428G) obj2).accept(((int[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9368M mo25803f(Object obj, int i, int i2) {
        return C9417e0.m34763k((int[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C9368M mo25804i(int i, int i2, int i3, int i4) {
        return new C9564K2(this.f26238g, i, i2, i3, i4);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34657q(this, consumer);
    }
}
