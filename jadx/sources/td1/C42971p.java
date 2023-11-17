package td1;

import ae1.C40293a;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import hd1.C41206c;
import id1.C41300a;
import java.util.concurrent.Callable;
import ld1.C41692b;

/* renamed from: td1.p */
public final class C42971p extends C40762x {

    /* renamed from: d */
    final Callable f100292d;

    public C42971p(Callable callable) {
        this.f100292d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C41205b b = C41206c.m119454b();
        zVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object e = C41692b.m120934e(this.f100292d.call(), "The callable returned a null value");
                if (!b.isDisposed()) {
                    zVar.mo95096a(e);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                if (!b.isDisposed()) {
                    zVar.onError(th);
                } else {
                    C40293a.m116722s(th);
                }
            }
        }
    }
}
