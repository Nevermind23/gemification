package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import hd1.C41205b;
import hd1.C41206c;
import id1.C41300a;
import java.util.concurrent.Callable;

/* renamed from: od1.i */
public final class C41826i extends C40734b {

    /* renamed from: d */
    final Callable f98177d;

    public C41826i(Callable callable) {
        this.f98177d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41205b b = C41206c.m119454b();
        dVar.onSubscribe(b);
        try {
            this.f98177d.call();
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
