package ae1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40741h;
import ed1.C40744k;
import ed1.C40746m;
import ed1.C40749p;
import ed1.C40756v;
import ed1.C40757w;
import ed1.C40762x;
import ed1.C40764z;
import java.util.concurrent.Callable;
import jd1.C41396c;
import jd1.C41399f;
import jd1.C41405l;
import ld1.C41692b;
import p469io.reactivex.exceptions.CompositeException;
import p469io.reactivex.exceptions.MissingBackpressureException;
import p469io.reactivex.exceptions.OnErrorNotImplementedException;
import p469io.reactivex.exceptions.UndeliverableException;
import uh1.C43107b;
import yd1.C43364i;
import zd1.C43413a;

/* renamed from: ae1.a */
public abstract class C40293a {

    /* renamed from: a */
    static volatile C41399f f95737a;

    /* renamed from: b */
    static volatile C41405l f95738b;

    /* renamed from: c */
    static volatile C41405l f95739c;

    /* renamed from: d */
    static volatile C41405l f95740d;

    /* renamed from: e */
    static volatile C41405l f95741e;

    /* renamed from: f */
    static volatile C41405l f95742f;

    /* renamed from: g */
    static volatile C41405l f95743g;

    /* renamed from: h */
    static volatile C41405l f95744h;

    /* renamed from: i */
    static volatile C41405l f95745i;

    /* renamed from: j */
    static volatile C41405l f95746j;

    /* renamed from: k */
    static volatile C41405l f95747k;

    /* renamed from: l */
    static volatile C41405l f95748l;

    /* renamed from: m */
    static volatile C41405l f95749m;

    /* renamed from: n */
    static volatile C41405l f95750n;

    /* renamed from: o */
    static volatile C41396c f95751o;

    /* renamed from: p */
    static volatile C41396c f95752p;

    /* renamed from: q */
    static volatile C41396c f95753q;

    /* renamed from: r */
    static volatile C41396c f95754r;

    /* renamed from: s */
    static volatile C41396c f95755s;

    /* renamed from: t */
    static volatile boolean f95756t;

    /* renamed from: u */
    static volatile boolean f95757u;

    /* renamed from: A */
    public static void m116702A(C41399f fVar) {
        if (!f95756t) {
            f95737a = fVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: B */
    static void m116703B(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    static Object m116704a(C41396c cVar, Object obj, Object obj2) {
        try {
            return cVar.apply(obj, obj2);
        } catch (Throwable th) {
            throw C43364i.m124412e(th);
        }
    }

    /* renamed from: b */
    static Object m116705b(C41405l lVar, Object obj) {
        try {
            return lVar.apply(obj);
        } catch (Throwable th) {
            throw C43364i.m124412e(th);
        }
    }

    /* renamed from: c */
    static C40757w m116706c(C41405l lVar, Callable callable) {
        return (C40757w) C41692b.m120934e(m116705b(lVar, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static C40757w m116707d(Callable callable) {
        try {
            return (C40757w) C41692b.m120934e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C43364i.m124412e(th);
        }
    }

    /* renamed from: e */
    public static C40757w m116708e(Callable callable) {
        C41692b.m120934e(callable, "Scheduler Callable can't be null");
        C41405l lVar = f95739c;
        if (lVar == null) {
            return m116707d(callable);
        }
        return m116706c(lVar, callable);
    }

    /* renamed from: f */
    public static C40757w m116709f(Callable callable) {
        C41692b.m120934e(callable, "Scheduler Callable can't be null");
        C41405l lVar = f95741e;
        if (lVar == null) {
            return m116707d(callable);
        }
        return m116706c(lVar, callable);
    }

    /* renamed from: g */
    public static C40757w m116710g(Callable callable) {
        C41692b.m120934e(callable, "Scheduler Callable can't be null");
        C41405l lVar = f95742f;
        if (lVar == null) {
            return m116707d(callable);
        }
        return m116706c(lVar, callable);
    }

    /* renamed from: h */
    public static C40757w m116711h(Callable callable) {
        C41692b.m120934e(callable, "Scheduler Callable can't be null");
        C41405l lVar = f95740d;
        if (lVar == null) {
            return m116707d(callable);
        }
        return m116706c(lVar, callable);
    }

    /* renamed from: i */
    static boolean m116712i(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m116713j() {
        return f95757u;
    }

    /* renamed from: k */
    public static C40734b m116714k(C40734b bVar) {
        C41405l lVar = f95750n;
        if (lVar != null) {
            return (C40734b) m116705b(lVar, bVar);
        }
        return bVar;
    }

    /* renamed from: l */
    public static C40741h m116715l(C40741h hVar) {
        C41405l lVar = f95745i;
        if (lVar != null) {
            return (C40741h) m116705b(lVar, hVar);
        }
        return hVar;
    }

    /* renamed from: m */
    public static C40744k m116716m(C40744k kVar) {
        C41405l lVar = f95748l;
        if (lVar != null) {
            return (C40744k) m116705b(lVar, kVar);
        }
        return kVar;
    }

    /* renamed from: n */
    public static C40749p m116717n(C40749p pVar) {
        C41405l lVar = f95746j;
        if (lVar != null) {
            return (C40749p) m116705b(lVar, pVar);
        }
        return pVar;
    }

    /* renamed from: o */
    public static C40762x m116718o(C40762x xVar) {
        C41405l lVar = f95749m;
        if (lVar != null) {
            return (C40762x) m116705b(lVar, xVar);
        }
        return xVar;
    }

    /* renamed from: p */
    public static C43413a m116719p(C43413a aVar) {
        C41405l lVar = f95747k;
        if (lVar != null) {
            return (C43413a) m116705b(lVar, aVar);
        }
        return aVar;
    }

    /* renamed from: q */
    public static boolean m116720q() {
        return false;
    }

    /* renamed from: r */
    public static C40757w m116721r(C40757w wVar) {
        C41405l lVar = f95743g;
        if (lVar == null) {
            return wVar;
        }
        return (C40757w) m116705b(lVar, wVar);
    }

    /* renamed from: s */
    public static void m116722s(Throwable th) {
        C41399f fVar = f95737a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m116712i(th)) {
            th = new UndeliverableException(th);
        }
        if (fVar != null) {
            try {
                fVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m116703B(th2);
            }
        }
        th.printStackTrace();
        m116703B(th);
    }

    /* renamed from: t */
    public static C40757w m116723t(C40757w wVar) {
        C41405l lVar = f95744h;
        if (lVar == null) {
            return wVar;
        }
        return (C40757w) m116705b(lVar, wVar);
    }

    /* renamed from: u */
    public static Runnable m116724u(Runnable runnable) {
        C41692b.m120934e(runnable, "run is null");
        C41405l lVar = f95738b;
        if (lVar == null) {
            return runnable;
        }
        return (Runnable) m116705b(lVar, runnable);
    }

    /* renamed from: v */
    public static C40737d m116725v(C40734b bVar, C40737d dVar) {
        C41396c cVar = f95755s;
        if (cVar != null) {
            return (C40737d) m116704a(cVar, bVar, dVar);
        }
        return dVar;
    }

    /* renamed from: w */
    public static C40746m m116726w(C40744k kVar, C40746m mVar) {
        C41396c cVar = f95752p;
        if (cVar != null) {
            return (C40746m) m116704a(cVar, kVar, mVar);
        }
        return mVar;
    }

    /* renamed from: x */
    public static C40756v m116727x(C40749p pVar, C40756v vVar) {
        C41396c cVar = f95753q;
        if (cVar != null) {
            return (C40756v) m116704a(cVar, pVar, vVar);
        }
        return vVar;
    }

    /* renamed from: y */
    public static C40764z m116728y(C40762x xVar, C40764z zVar) {
        C41396c cVar = f95754r;
        if (cVar != null) {
            return (C40764z) m116704a(cVar, xVar, zVar);
        }
        return zVar;
    }

    /* renamed from: z */
    public static C43107b m116729z(C40741h hVar, C43107b bVar) {
        C41396c cVar = f95751o;
        if (cVar != null) {
            return (C43107b) m116704a(cVar, hVar, bVar);
        }
        return bVar;
    }
}
