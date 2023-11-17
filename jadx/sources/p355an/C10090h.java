package p355an;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel;
import p551om.C17265a;
import p551om.C17266b;

/* renamed from: an.h */
public final class C10090h {
    /* renamed from: b */
    private final List m36955b(List list, Map map) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17266b bVar = (C17266b) it.next();
            arrayList.add(new DebitCardDeliveryDistrictUiModel(bVar.mo44660b(), bVar.mo44661c(), bVar.mo44659a(), (String) map.get(Long.valueOf(bVar.mo44661c()))));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo26551a(List list, Map map) {
        C41536l.m120489i(list, "cities");
        C41536l.m120489i(map, "map");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17265a aVar = (C17265a) it.next();
            arrayList.add(new DebitCardDeliveryCityUiModel(aVar.mo44653a(), m36955b(aVar.mo44654b(), map), aVar.mo44655c()));
        }
        return arrayList;
    }
}
