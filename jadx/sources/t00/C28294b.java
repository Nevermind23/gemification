package t00;

import j20.C25317d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p739dv.C20105d;
import p831mu.C26299a;
import u00.C28534b;

/* renamed from: t00.b */
public final class C28294b {

    /* renamed from: a */
    private final C25317d f71798a;

    /* renamed from: b */
    private final C28295c f71799b;

    public C28294b(C25317d dVar, C28295c cVar) {
        C41536l.m120489i(dVar, "paymentDataUIMapper");
        C41536l.m120489i(cVar, "summariesUIMapper");
        this.f71798a = dVar;
        this.f71799b = cVar;
    }

    /* renamed from: a */
    public final C28534b mo67923a(C26299a aVar) {
        C41536l.m120489i(aVar, "data");
        List a = this.f71799b.mo67924a(aVar.mo65445b());
        List<C20105d> a2 = aVar.mo65444a();
        C25317d dVar = this.f71798a;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a2, 10));
        for (C20105d a3 : a2) {
            arrayList.add(dVar.mo63882a(a3));
        }
        return new C28534b(a, arrayList);
    }
}
