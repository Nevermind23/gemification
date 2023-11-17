package bn0;

import hn0.C15537b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.kyc.data.network.model.CityApiModel;

/* renamed from: bn0.a */
public final class C10340a {
    /* renamed from: a */
    public final List mo26947a(List list) {
        C41536l.m120489i(list, "cities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CityApiModel cityApiModel = (CityApiModel) it.next();
            arrayList.add(new C15537b(cityApiModel.getRegion(), cityApiModel.getRegionDesc(), cityApiModel.getCountry()));
        }
        return arrayList;
    }
}
