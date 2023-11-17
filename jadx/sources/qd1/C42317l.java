package qd1;

import ae1.C40293a;
import ed1.C40744k;
import ed1.C40746m;
import hd1.C41205b;
import hd1.C41206c;
import id1.C41300a;
import java.util.concurrent.Callable;

/* renamed from: qd1.l */
public final class C42317l extends C40744k implements Callable {

    /* renamed from: d */
    final Callable f99513d;

    public C42317l(Callable callable) {
        this.f99513d = callable;
    }

    public Object call() {
        return this.f99513d.call();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo94961w(C40746m mVar) {
        C41205b b = C41206c.m119454b();
        mVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f99513d.call();
                if (b.isDisposed()) {
                    return;
                }
                if (call == null) {
                    mVar.onComplete();
                } else {
                    mVar.mo94967a(call);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                if (!b.isDisposed()) {
                    mVar.onError(th);
                } else {
                    C40293a.m116722s(th);
                }
            }
        }
    }
}
