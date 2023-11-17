package j50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p813kw.C25783a;

/* renamed from: j50.a */
public final class C25333a {
    /* renamed from: a */
    public final List mo63905a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "pendingProducts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25783a aVar = (C25783a) it.next();
            arrayList.add(new PendingProductConfirmationData(aVar.mo64410f(), aVar.mo64411g(), aVar.mo64412h(), aVar.mo64406b(), aVar.mo64405a(), aVar.mo64408d(), aVar.mo64413i(), aVar.mo64409e(), aVar.mo64407c()));
        }
        return arrayList;
    }
}
