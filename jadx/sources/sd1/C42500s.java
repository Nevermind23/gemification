package sd1;

import ed1.C40749p;
import ed1.C40756v;
import id1.C41300a;
import java.util.concurrent.Callable;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: sd1.s */
public final class C42500s extends C40749p {

    /* renamed from: d */
    final Callable f100010d;

    public C42500s(Callable callable) {
        this.f100010d = callable;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        try {
            th = (Throwable) C41692b.m120934e(this.f100010d.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C41300a.m119661b(th);
        }
        C41499d.m120384n(th, vVar);
    }
}
