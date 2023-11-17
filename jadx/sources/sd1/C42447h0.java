package sd1;

import ed1.C40749p;
import ed1.C40756v;
import md1.C41738g;
import sd1.C42528v0;

/* renamed from: sd1.h0 */
public final class C42447h0 extends C40749p implements C41738g {

    /* renamed from: d */
    private final Object f99843d;

    public C42447h0(Object obj) {
        this.f99843d = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42528v0.C42529a aVar = new C42528v0.C42529a(vVar, this.f99843d);
        vVar.onSubscribe(aVar);
        aVar.run();
    }

    public Object call() {
        return this.f99843d;
    }
}
