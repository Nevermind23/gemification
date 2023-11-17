package p861pu;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;

/* renamed from: pu.a */
public final class C27621a {
    /* renamed from: a */
    public final C20463a mo66994a(LookupEntity lookupEntity) {
        C41536l.m120489i(lookupEntity, "entity");
        return new C20463a(lookupEntity.getLookupName(), lookupEntity.getLookupValue(), lookupEntity.getDictionaryKey(), lookupEntity.getOrderNumber());
    }

    /* renamed from: b */
    public final List mo66995b(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66994a((LookupEntity) it.next()));
        }
        return arrayList;
    }
}
