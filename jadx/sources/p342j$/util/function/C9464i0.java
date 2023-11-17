package p342j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.i0 */
public final /* synthetic */ class C9464i0 implements C9468k0 {

    /* renamed from: a */
    public final /* synthetic */ ObjDoubleConsumer f26112a;

    private /* synthetic */ C9464i0(ObjDoubleConsumer objDoubleConsumer) {
        this.f26112a = objDoubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9468k0 m34823a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof C9466j0 ? ((C9466j0) objDoubleConsumer).f26114a : new C9464i0(objDoubleConsumer);
    }

    public final /* synthetic */ void accept(Object obj, double d) {
        this.f26112a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9464i0) {
            obj = ((C9464i0) obj).f26112a;
        }
        return this.f26112a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26112a.hashCode();
    }
}
