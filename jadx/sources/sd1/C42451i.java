package sd1;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import id1.C41300a;
import java.util.concurrent.Callable;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: sd1.i */
public final class C42451i extends C40749p {

    /* renamed from: d */
    final Callable f99852d;

    public C42451i(Callable callable) {
        this.f99852d = callable;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        try {
            ((C40754t) C41692b.m120934e(this.f99852d.call(), "null ObservableSource supplied")).mo95016c(vVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120384n(th, vVar);
        }
    }
}
