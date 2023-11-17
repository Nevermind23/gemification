package p355an;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p565pm.C17389d;
import p674xm.C18781a;

/* renamed from: an.u */
public final class C10104u {
    /* renamed from: a */
    public final AddressAdapterModel mo26581a(C17389d dVar) {
        C41536l.m120489i(dVar, "instantDeliveryPoint");
        String b = dVar.mo44908b();
        long a = dVar.mo44907a();
        C18781a aVar = C18781a.INSTANT_DELIVERY_DISTRICT;
        String b2 = dVar.mo44908b();
        Locale locale = Locale.ROOT;
        String lowerCase = b2.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = dVar.mo44910d().toLowerCase(locale);
        C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return new AddressAdapterModel(b, a, (List) null, aVar, 0, C41341q.m119910m(lowerCase, lowerCase2), false, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo26582b(List list) {
        C41536l.m120489i(list, "points");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26581a((C17389d) it.next()));
        }
        return arrayList;
    }
}
