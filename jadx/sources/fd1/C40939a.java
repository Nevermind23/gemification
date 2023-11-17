package fd1;

import ed1.C40757w;
import id1.C41300a;
import java.util.concurrent.Callable;
import jd1.C41405l;

/* renamed from: fd1.a */
public abstract class C40939a {

    /* renamed from: a */
    private static volatile C41405l f96704a;

    /* renamed from: b */
    private static volatile C41405l f96705b;

    /* renamed from: a */
    static Object m118711a(C41405l lVar, Object obj) {
        try {
            return lVar.apply(obj);
        } catch (Throwable th) {
            throw C41300a.m119660a(th);
        }
    }

    /* renamed from: b */
    static C40757w m118712b(C41405l lVar, Callable callable) {
        C40757w wVar = (C40757w) m118711a(lVar, callable);
        if (wVar != null) {
            return wVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    static C40757w m118713c(Callable callable) {
        try {
            C40757w wVar = (C40757w) callable.call();
            if (wVar != null) {
                return wVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C41300a.m119660a(th);
        }
    }

    /* renamed from: d */
    public static C40757w m118714d(Callable callable) {
        if (callable != null) {
            C41405l lVar = f96704a;
            if (lVar == null) {
                return m118713c(callable);
            }
            return m118712b(lVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static C40757w m118715e(C40757w wVar) {
        if (wVar != null) {
            C41405l lVar = f96705b;
            if (lVar == null) {
                return wVar;
            }
            return (C40757w) m118711a(lVar, wVar);
        }
        throw new NullPointerException("scheduler == null");
    }
}
