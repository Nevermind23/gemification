package rh0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.data.model.LookupApiModel;
import xh0.C29797m;

/* renamed from: rh0.i */
public final class C28042i {
    /* renamed from: b */
    private final C29797m m86446b(LookupApiModel lookupApiModel) {
        int i;
        long id = lookupApiModel.getId();
        String dictionaryKey = lookupApiModel.getDictionaryKey();
        String lookupName = lookupApiModel.getLookupName();
        String lookupValue = lookupApiModel.getLookupValue();
        Integer orderNumber = lookupApiModel.getOrderNumber();
        if (orderNumber != null) {
            i = orderNumber.intValue();
        } else {
            i = 0;
        }
        return new C29797m(id, dictionaryKey, lookupName, lookupValue, i, lookupApiModel.getDictionaryKeyId(), lookupApiModel.getDictionaryValue(), lookupApiModel.getDictionaryValueEn());
    }

    /* renamed from: a */
    public final List mo67584a(List list) {
        C41536l.m120489i(list, "lookupData");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m86446b((LookupApiModel) it.next()));
        }
        return arrayList;
    }
}
