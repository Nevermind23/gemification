package nd1;

import ae1.C40293a;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41399f;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: nd1.i */
public final class C41782i extends AtomicReference implements C40764z, C41205b {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: d */
    final C41399f f98095d;

    /* renamed from: e */
    final C41399f f98096e;

    public C41782i(C41399f fVar, C41399f fVar2) {
        this.f98095d = fVar;
        this.f98096e = fVar2;
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        lazySet(C41498c.DISPOSED);
        try {
            this.f98095d.accept(obj);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
        }
    }

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return get() == C41498c.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(C41498c.DISPOSED);
        try {
            this.f98096e.accept(th);
        } catch (Throwable th2) {
            C41300a.m119661b(th2);
            C40293a.m116722s(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120376g(this, bVar);
    }
}
