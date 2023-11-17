package ef1;

import he1.C41225n;
import he1.C41228o;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41596f;

/* renamed from: ef1.l0 */
public abstract class C40832l0 {
    /* renamed from: a */
    public static final String m118329a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m118330b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m118331c(Continuation continuation) {
        Object obj;
        if (continuation instanceof C41596f) {
            return continuation.toString();
        }
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41225n.m119478a(continuation + '@' + m118330b(continuation));
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        Throwable b = C41225n.m119479b(obj);
        String str = obj;
        if (b != null) {
            str = continuation.getClass().getName() + '@' + m118330b(continuation);
        }
        return (String) str;
    }
}
