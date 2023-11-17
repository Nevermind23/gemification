package ef1;

import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.List;
import java.util.ServiceLoader;
import me1.C41752f;

/* renamed from: ef1.f0 */
public abstract class C40806f0 {

    /* renamed from: a */
    private static final List f96529a;

    static {
        Class<C40799e0> cls = C40799e0.class;
        f96529a = C40355o.m116850A(C40349m.m116842c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m118288a(C41752f fVar, Throwable th) {
        for (C40799e0 x : f96529a) {
            try {
                x.mo95155x(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C40810g0.m118296b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            C41211b.m119461a(th, new C40855q0(fVar));
            C41225n.m119478a(C41238w.f97225a);
        } catch (Throwable th3) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            C41225n.m119478a(C41228o.m119482a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
