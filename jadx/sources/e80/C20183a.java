package e80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.CountryEntity;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;

/* renamed from: e80.a */
public final class C20183a {
    /* renamed from: a */
    public final Country mo48597a(CountryEntity countryEntity) {
        C41536l.m120489i(countryEntity, "countryEntity");
        return new Country(countryEntity.getCode(), countryEntity.getCode2(), countryEntity.getName(), countryEntity.getOrder());
    }

    /* renamed from: b */
    public final List mo48598b(List list) {
        C41536l.m120489i(list, "countries");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo48597a((CountryEntity) it.next()));
        }
        return arrayList;
    }
}
