package p342j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.l0 */
public final /* synthetic */ class C9470l0 implements C9474n0 {

    /* renamed from: a */
    public final /* synthetic */ ObjIntConsumer f26117a;

    private /* synthetic */ C9470l0(ObjIntConsumer objIntConsumer) {
        this.f26117a = objIntConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9474n0 m34827a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof C9472m0 ? ((C9472m0) objIntConsumer).f26119a : new C9470l0(objIntConsumer);
    }

    public final /* synthetic */ void accept(Object obj, int i) {
        this.f26117a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9470l0) {
            obj = ((C9470l0) obj).f26117a;
        }
        return this.f26117a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26117a.hashCode();
    }
}
