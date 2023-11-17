package p342j$.util.stream;

import p342j$.util.function.C9424C;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9467k;

/* renamed from: j$.util.stream.A1 */
final class C9515A1 extends C9735w0 {

    /* renamed from: h */
    public final /* synthetic */ int f26161h;

    /* renamed from: i */
    final /* synthetic */ Object f26162i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9515A1(C9611W2 w2, Object obj, int i) {
        super(w2);
        this.f26161h = i;
        this.f26162i = obj;
    }

    /* renamed from: u1 */
    public final C9583P1 mo25683u1() {
        int i = this.f26161h;
        Object obj = this.f26162i;
        switch (i) {
            case 0:
                return new C9520B1((C9467k) obj);
            case 1:
                return new C9535E1((C9457f) obj);
            case 2:
                return new C9563K1((C9424C) obj);
            default:
                return new C9579O1((C9440T) obj);
        }
    }
}
