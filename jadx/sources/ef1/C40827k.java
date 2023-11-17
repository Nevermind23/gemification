package ef1;

import he1.C41238w;
import java.util.concurrent.Future;

/* renamed from: ef1.k */
final class C40827k extends C40831l {

    /* renamed from: d */
    private final Future f96542d;

    public C40827k(Future future) {
        this.f96542d = future;
    }

    /* renamed from: a */
    public void mo95153a(Throwable th) {
        if (th != null) {
            this.f96542d.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo95153a((Throwable) obj);
        return C41238w.f97225a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f96542d + ']';
    }
}
