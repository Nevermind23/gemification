package kd1;

import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kd1.g */
public final class C41502g extends AtomicReference implements C41205b {
    private static final long serialVersionUID = -754898800686245608L;

    public C41502g() {
    }

    /* renamed from: a */
    public boolean mo96265a(C41205b bVar) {
        return C41498c.m120373c(this, bVar);
    }

    /* renamed from: b */
    public boolean mo96266b(C41205b bVar) {
        return C41498c.m120375f(this, bVar);
    }

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return C41498c.m120372b((C41205b) get());
    }

    public C41502g(C41205b bVar) {
        lazySet(bVar);
    }
}
