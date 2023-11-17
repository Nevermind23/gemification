package nd1;

import ae1.C40293a;
import ed1.C40737d;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import p469io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: nd1.h */
public final class C41781h extends AtomicReference implements C40737d, C41205b, C41399f {
    private static final long serialVersionUID = -4361286194466301354L;

    /* renamed from: d */
    final C41399f f98093d;

    /* renamed from: e */
    final C41394a f98094e;

    public C41781h(C41394a aVar) {
        this.f98093d = this;
        this.f98094e = aVar;
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        C40293a.m116722s(new OnErrorNotImplementedException(th));
    }

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return get() == C41498c.DISPOSED;
    }

    public void onComplete() {
        try {
            this.f98094e.run();
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
        }
        lazySet(C41498c.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.f98093d.accept(th);
        } catch (Throwable th2) {
            C41300a.m119661b(th2);
            C40293a.m116722s(th2);
        }
        lazySet(C41498c.DISPOSED);
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120376g(this, bVar);
    }

    public C41781h(C41399f fVar, C41394a aVar) {
        this.f98093d = fVar;
        this.f98094e = aVar;
    }
}
