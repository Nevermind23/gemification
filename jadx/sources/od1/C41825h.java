package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import hd1.C41205b;
import hd1.C41206c;
import id1.C41300a;
import jd1.C41394a;

/* renamed from: od1.h */
public final class C41825h extends C40734b {

    /* renamed from: d */
    final C41394a f98176d;

    public C41825h(C41394a aVar) {
        this.f98176d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41205b b = C41206c.m119454b();
        dVar.onSubscribe(b);
        try {
            this.f98176d.run();
            if (!b.isDisposed()) {
                dVar.onComplete();
            }
        } catch (Throwable th) {
            C41300a.m119661b(th);
            if (!b.isDisposed()) {
                dVar.onError(th);
            } else {
                C40293a.m116722s(th);
            }
        }
    }
}
