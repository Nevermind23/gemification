package p299w6;

import java.util.Iterator;

/* renamed from: w6.f */
final class C8864f implements C8863e {

    /* renamed from: a */
    final /* synthetic */ C8858a f24833a;

    C8864f(C8858a aVar) {
        this.f24833a = aVar;
    }

    /* renamed from: a */
    public final void mo24292a(C8861c cVar) {
        this.f24833a.f24828a = cVar;
        Iterator it = this.f24833a.f24830c.iterator();
        while (it.hasNext()) {
            ((C8871m) it.next()).mo24294b(this.f24833a.f24828a);
        }
        this.f24833a.f24830c.clear();
        this.f24833a.f24829b = null;
    }
}
