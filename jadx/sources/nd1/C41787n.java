package nd1;

import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: nd1.n */
public final class C41787n implements C40764z {

    /* renamed from: d */
    final AtomicReference f98107d;

    /* renamed from: e */
    final C40764z f98108e;

    public C41787n(AtomicReference atomicReference, C40764z zVar) {
        this.f98107d = atomicReference;
        this.f98108e = zVar;
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        this.f98108e.mo95096a(obj);
    }

    public void onError(Throwable th) {
        this.f98108e.onError(th);
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120373c(this.f98107d, bVar);
    }
}
