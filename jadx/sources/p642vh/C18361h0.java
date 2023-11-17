package p642vh;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import ue1.C43064a;

/* renamed from: vh.h0 */
public final class C18361h0 implements C41555e {

    /* renamed from: a */
    private final C43064a f51812a;

    public C18361h0(C43064a aVar) {
        this.f51812a = aVar;
    }

    public Object getValue(Object obj, C40303i iVar) {
        String str;
        Object invoke;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C43064a aVar = this.f51812a;
        if (aVar == null || (invoke = aVar.invoke()) == null || (str = invoke.toString()) == null) {
            str = "Unsupported operation";
        }
        throw new UnsupportedOperationException(str);
    }

    public void setValue(Object obj, C40303i iVar, Object obj2) {
        String str;
        Object invoke;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C43064a aVar = this.f51812a;
        if (aVar == null || (invoke = aVar.invoke()) == null || (str = invoke.toString()) == null) {
            str = "Unsupported operation";
        }
        throw new UnsupportedOperationException(str);
    }
}
