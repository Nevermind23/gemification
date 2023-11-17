package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import id1.C41300a;
import java.util.concurrent.Callable;
import ld1.C41692b;
import nd1.C41783j;

/* renamed from: sd1.z */
public final class C42546z extends C40749p implements Callable {

    /* renamed from: d */
    final Callable f100149d;

    public C42546z(Callable callable) {
        this.f100149d = callable;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C41783j jVar = new C41783j(vVar);
        vVar.onSubscribe(jVar);
        if (!jVar.isDisposed()) {
            try {
                jVar.mo96606d(C41692b.m120934e(this.f100149d.call(), "Callable returned null"));
            } catch (Throwable th) {
                C41300a.m119661b(th);
                if (!jVar.isDisposed()) {
                    vVar.onError(th);
                } else {
                    C40293a.m116722s(th);
                }
            }
        }
    }

    public Object call() {
        return C41692b.m120934e(this.f100149d.call(), "The callable returned a null value");
    }
}
