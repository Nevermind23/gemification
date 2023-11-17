package ef1;

import me1.C41752f;

/* renamed from: ef1.g0 */
public abstract class C40810g0 {
    /* renamed from: a */
    public static final void m118295a(C41752f fVar, Throwable th) {
        try {
            C40799e0 e0Var = (C40799e0) fVar.mo23736c(C40799e0.f96522c3);
            if (e0Var != null) {
                e0Var.mo95155x(fVar, th);
            } else {
                C40806f0.m118288a(fVar, th);
            }
        } catch (Throwable th2) {
            C40806f0.m118288a(fVar, m118296b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m118296b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C41211b.m119461a(runtimeException, th);
        return runtimeException;
    }
}
