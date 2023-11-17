package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9368M;
import p342j$.util.C9381a;
import p342j$.util.C9417e0;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.I2 */
final class C9556I2 extends C9580O2 implements C9359D {

    /* renamed from: g */
    final /* synthetic */ C9560J2 f26227g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9556I2(C9560J2 j2, int i, int i2, int i3, int i4) {
        super(j2, i, i2, i3, i4);
        this.f26227g = j2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34649b(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25802b(int i, Object obj, Object obj2) {
        ((C9475o) obj2).accept(((double[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9368M mo25803f(Object obj, int i, int i2) {
        return C9417e0.m34762j((double[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C9368M mo25804i(int i, int i2, int i3, int i4) {
        return new C9556I2(this.f26227g, i, i2, i3, i4);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34656p(this, consumer);
    }
}
