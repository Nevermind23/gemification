package p342j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.o0 */
public final /* synthetic */ class C9476o0 implements C9480q0 {

    /* renamed from: a */
    public final /* synthetic */ ObjLongConsumer f26121a;

    private /* synthetic */ C9476o0(ObjLongConsumer objLongConsumer) {
        this.f26121a = objLongConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9480q0 m34833a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof C9478p0 ? ((C9478p0) objLongConsumer).f26123a : new C9476o0(objLongConsumer);
    }

    public final /* synthetic */ void accept(Object obj, long j) {
        this.f26121a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9476o0) {
            obj = ((C9476o0) obj).f26121a;
        }
        return this.f26121a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26121a.hashCode();
    }
}
