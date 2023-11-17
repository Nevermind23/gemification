package ef1;

import he1.C41225n;
import he1.C41228o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: ef1.b0 */
public abstract class C40782b0 {
    /* renamed from: a */
    public static final Object m118252a(Object obj, Continuation continuation) {
        if (!(obj instanceof C40881y)) {
            return C41225n.m119478a(obj);
        }
        C41225n.C41226a aVar = C41225n.f97210d;
        return C41225n.m119478a(C41228o.m119482a(((C40881y) obj).f96602a));
    }

    /* renamed from: b */
    public static final Object m118253b(Object obj, C40839n nVar) {
        Throwable b = C41225n.m119479b(obj);
        if (b == null) {
            return obj;
        }
        return new C40881y(b, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final Object m118254c(Object obj, C43075l lVar) {
        Throwable b = C41225n.m119479b(obj);
        if (b != null) {
            return new C40881y(b, false, 2, (DefaultConstructorMarker) null);
        }
        if (lVar != null) {
            return new C40884z(obj, lVar);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m118255d(Object obj, C43075l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m118254c(obj, lVar);
    }
}
