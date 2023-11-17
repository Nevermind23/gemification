package hd1;

import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;

/* renamed from: hd1.f */
public final class C41209f implements C41205b {

    /* renamed from: d */
    final AtomicReference f97194d = new AtomicReference();

    /* renamed from: a */
    public boolean mo95668a(C41205b bVar) {
        return C41498c.m120375f(this.f97194d, bVar);
    }

    public void dispose() {
        C41498c.m120371a(this.f97194d);
    }

    public boolean isDisposed() {
        return C41498c.m120372b((C41205b) this.f97194d.get());
    }
}
