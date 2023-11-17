package p355an;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37622x;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel;
import p674xm.C18781a;

/* renamed from: an.g */
public final class C10089g {
    /* renamed from: a */
    public final AddressAdapterModel mo26548a(DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel) {
        C41536l.m120489i(debitCardDeliveryCityUiModel, "city");
        String a = debitCardDeliveryCityUiModel.mo39900a();
        long d = debitCardDeliveryCityUiModel.mo39902d();
        List<DebitCardDeliveryDistrictUiModel> b = debitCardDeliveryCityUiModel.mo39901b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (DebitCardDeliveryDistrictUiModel b2 : b) {
            arrayList.add(mo26549b(b2));
        }
        return new AddressAdapterModel(a, d, arrayList, C18781a.DELIVERY_CITY, 0, C41341q.m119910m(debitCardDeliveryCityUiModel.mo39900a(), C37622x.f90386a.mo90794a(debitCardDeliveryCityUiModel.mo39900a())), true, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final AddressAdapterModel mo26549b(DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel) {
        C41536l.m120489i(debitCardDeliveryDistrictUiModel, "districtUiModel");
        return new AddressAdapterModel(debitCardDeliveryDistrictUiModel.mo39913b(), debitCardDeliveryDistrictUiModel.mo39914d(), (List) null, C18781a.DELIVERY_DISTRICT, 0, C41341q.m119910m(debitCardDeliveryDistrictUiModel.mo39913b(), C37622x.f90386a.mo90794a(debitCardDeliveryDistrictUiModel.mo39913b())), false, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final List mo26550c(List list) {
        C41536l.m120489i(list, "cities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo26548a((DebitCardDeliveryCityUiModel) it.next()));
        }
        return arrayList;
    }
}
