package p267u0;

import ef1.C40793d0;
import ef1.C40811g1;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: u0.g */
public abstract class C8472g {
    /* renamed from: a */
    public static final C40793d0 m31756a(C8503w wVar) {
        C41536l.m120489i(wVar, "<this>");
        Map k = wVar.mo23810k();
        Object obj = k.get("QueryDispatcher");
        if (obj == null) {
            obj = C40811g1.m118297a(wVar.mo23814o());
            k.put("QueryDispatcher", obj);
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C40793d0) obj;
    }

    /* renamed from: b */
    public static final C40793d0 m31757b(C8503w wVar) {
        C41536l.m120489i(wVar, "<this>");
        Map k = wVar.mo23810k();
        Object obj = k.get("TransactionDispatcher");
        if (obj == null) {
            obj = C40811g1.m118297a(wVar.mo23816s());
            k.put("TransactionDispatcher", obj);
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C40793d0) obj;
    }
}
