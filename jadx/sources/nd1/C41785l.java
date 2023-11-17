package nd1;

import ae1.C40293a;
import ed1.C40737d;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import p469io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: nd1.l */
public final class C41785l extends AtomicReference implements C40737d, C41205b {
    private static final long serialVersionUID = -7545121636549663526L;

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return get() == C41498c.DISPOSED;
    }

    public void onComplete() {
        lazySet(C41498c.DISPOSED);
    }

    public void onError(Throwable th) {
        lazySet(C41498c.DISPOSED);
        C40293a.m116722s(new OnErrorNotImplementedException(th));
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120376g(this, bVar);
    }
}
