package qd1;

import ae1.C40293a;
import ed1.C40746m;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: qd1.c */
public final class C42299c extends AtomicReference implements C40746m, C41205b {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: d */
    final C41399f f99475d;

    /* renamed from: e */
    final C41399f f99476e;

    /* renamed from: f */
    final C41394a f99477f;

    public C42299c(C41399f fVar, C41399f fVar2, C41394a aVar) {
        this.f99475d = fVar;
        this.f99476e = fVar2;
        this.f99477f = aVar;
    }

    /* renamed from: a */
    public void mo94967a(Object obj) {
        lazySet(C41498c.DISPOSED);
        try {
            this.f99475d.accept(obj);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
        }
    }

    public void dispose() {
        C41498c.m120371a(this);
    }

    public boolean isDisposed() {
        return C41498c.m120372b((C41205b) get());
    }

    public void onComplete() {
        lazySet(C41498c.DISPOSED);
        try {
            this.f99477f.run();
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(C41498c.DISPOSED);
        try {
            this.f99476e.accept(th);
        } catch (Throwable th2) {
            C41300a.m119661b(th2);
            C40293a.m116722s(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(C41205b bVar) {
        C41498c.m120376g(this, bVar);
    }
}
