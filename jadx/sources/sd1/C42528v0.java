package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import id1.C41300a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import jd1.C41405l;
import kd1.C41499d;
import ld1.C41692b;
import md1.C41735d;

/* renamed from: sd1.v0 */
public abstract class C42528v0 {

    /* renamed from: sd1.v0$a */
    public static final class C42529a extends AtomicInteger implements C41735d, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: d */
        final C40756v f100099d;

        /* renamed from: e */
        final Object f100100e;

        public C42529a(C40756v vVar, Object obj) {
            this.f100099d = vVar;
            this.f100100e = obj;
        }

        /* renamed from: c */
        public Object mo96258c() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f100100e;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        /* renamed from: f */
        public boolean mo96261f(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f100099d.onNext(this.f100100e);
                if (get() == 2) {
                    lazySet(3);
                    this.f100099d.onComplete();
                }
            }
        }
    }

    /* renamed from: sd1.v0$b */
    static final class C42530b extends C40749p {

        /* renamed from: d */
        final Object f100101d;

        /* renamed from: e */
        final C41405l f100102e;

        C42530b(Object obj, C41405l lVar) {
            this.f100101d = obj;
            this.f100102e = lVar;
        }

        /* renamed from: I0 */
        public void mo94344I0(C40756v vVar) {
            try {
                C40754t tVar = (C40754t) C41692b.m120934e(this.f100102e.apply(this.f100101d), "The mapper returned a null ObservableSource");
                if (tVar instanceof Callable) {
                    try {
                        Object call = ((Callable) tVar).call();
                        if (call == null) {
                            C41499d.m120381g(vVar);
                            return;
                        }
                        C42529a aVar = new C42529a(vVar, call);
                        vVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        C41499d.m120384n(th, vVar);
                    }
                } else {
                    tVar.mo95016c(vVar);
                }
            } catch (Throwable th2) {
                C41499d.m120384n(th2, vVar);
            }
        }
    }

    /* renamed from: a */
    public static C40749p m123157a(Object obj, C41405l lVar) {
        return C40293a.m116717n(new C42530b(obj, lVar));
    }

    /* renamed from: b */
    public static boolean m123158b(C40754t tVar, C40756v vVar, C41405l lVar) {
        if (!(tVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) tVar).call();
            if (call == null) {
                C41499d.m120381g(vVar);
                return true;
            }
            try {
                C40754t tVar2 = (C40754t) C41692b.m120934e(lVar.apply(call), "The mapper returned a null ObservableSource");
                if (tVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) tVar2).call();
                        if (call2 == null) {
                            C41499d.m120381g(vVar);
                            return true;
                        }
                        C42529a aVar = new C42529a(vVar, call2);
                        vVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        C41499d.m120384n(th, vVar);
                        return true;
                    }
                } else {
                    tVar2.mo95016c(vVar);
                }
                return true;
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                C41499d.m120384n(th2, vVar);
                return true;
            }
        } catch (Throwable th3) {
            C41300a.m119661b(th3);
            C41499d.m120384n(th3, vVar);
            return true;
        }
    }
}
