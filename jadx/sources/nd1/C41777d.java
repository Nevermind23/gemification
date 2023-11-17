package nd1;

import ae1.C40293a;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41395b;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: nd1.d */
public final class C41777d extends AtomicReference implements C40764z, C41205b {
    private static final long serialVersionUID = 4943102778943297569L;

    /* renamed from: d */
    final C41395b f98084d;

    public C41777d(C41395b bVar) {
        this.f98084d = bVar;
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        try {
            lazySet(C41498c.DISPOSED);
            this.f98084d.accept(obj, (Object) null);
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
        try {
            lazySet(C41498c.DISPOSED);
            this.f98084d.accept((Object) null, th);
        } catch (Throwable th2) {
            C41300a.m119661b(th2);
            C40293a.m116722s(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120376g(this, bVar);
    }
}
