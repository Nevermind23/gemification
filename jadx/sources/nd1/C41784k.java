package nd1;

import ae1.C40293a;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import kd1.C41499d;

/* renamed from: nd1.k */
public final class C41784k implements C40756v, C41205b {

    /* renamed from: d */
    final C40756v f98099d;

    /* renamed from: e */
    final C41399f f98100e;

    /* renamed from: f */
    final C41394a f98101f;

    /* renamed from: g */
    C41205b f98102g;

    public C41784k(C40756v vVar, C41399f fVar, C41394a aVar) {
        this.f98099d = vVar;
        this.f98100e = fVar;
        this.f98101f = aVar;
    }

    public void dispose() {
        C41205b bVar = this.f98102g;
        C41498c cVar = C41498c.DISPOSED;
        if (bVar != cVar) {
            this.f98102g = cVar;
            try {
                this.f98101f.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
            bVar.dispose();
        }
    }

    public boolean isDisposed() {
        return this.f98102g.isDisposed();
    }

    public void onComplete() {
        C41205b bVar = this.f98102g;
        C41498c cVar = C41498c.DISPOSED;
        if (bVar != cVar) {
            this.f98102g = cVar;
            this.f98099d.onComplete();
        }
    }

    public void onError(Throwable th) {
        C41205b bVar = this.f98102g;
        C41498c cVar = C41498c.DISPOSED;
        if (bVar != cVar) {
            this.f98102g = cVar;
            this.f98099d.onError(th);
            return;
        }
        C40293a.m116722s(th);
    }

    public void onNext(Object obj) {
        this.f98099d.onNext(obj);
    }

    public void onSubscribe(C41205b bVar) {
        try {
            this.f98100e.accept(bVar);
            if (C41498c.m120378l(this.f98102g, bVar)) {
                this.f98102g = bVar;
                this.f98099d.onSubscribe(this);
            }
        } catch (Throwable th) {
            C41300a.m119661b(th);
            bVar.dispose();
            this.f98102g = C41498c.DISPOSED;
            C41499d.m120384n(th, this.f98099d);
        }
    }
}
