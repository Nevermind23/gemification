package nd1;

import ae1.C40293a;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: nd1.m */
public final class C41786m extends AtomicReference implements C40756v, C41205b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: d */
    final C41399f f98103d;

    /* renamed from: e */
    final C41399f f98104e;

    /* renamed from: f */
    final C41394a f98105f;

    /* renamed from: g */
    final C41399f f98106g;

    public C41786m(C41399f fVar, C41399f fVar2, C41394a aVar, C41399f fVar3) {
        this.f98103d = fVar;
        this.f98104e = fVar2;
        this.f98105f = aVar;
        this.f98106g = fVar3;
    }

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return get() == C41498c.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(C41498c.DISPOSED);
            try {
                this.f98105f.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C41498c.DISPOSED);
            try {
                this.f98104e.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                C40293a.m116722s(new CompositeException(th, th2));
            }
        } else {
            C40293a.m116722s(th);
        }
    }

    public void onNext(Object obj) {
        if (!isDisposed()) {
            try {
                this.f98103d.accept(obj);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                ((C41205b) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(C41205b bVar) {
        if (C41498c.m120376g(this, bVar)) {
            try {
                this.f98106g.accept(this);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                bVar.dispose();
                onError(th);
            }
        }
    }
}
