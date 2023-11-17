package p674xm;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryCityUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel;

/* renamed from: xm.m */
public final class C18811m {

    /* renamed from: a */
    private final DebitCardDeliveryDistrictUiModel f52559a;

    /* renamed from: b */
    private final DebitCardDeliveryCityUiModel f52560b;

    public C18811m(DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel, DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel) {
        C41536l.m120489i(debitCardDeliveryDistrictUiModel, "district");
        C41536l.m120489i(debitCardDeliveryCityUiModel, "city");
        this.f52559a = debitCardDeliveryDistrictUiModel;
        this.f52560b = debitCardDeliveryCityUiModel;
    }

    /* renamed from: a */
    public final DebitCardDeliveryCityUiModel mo46652a() {
        return this.f52560b;
    }

    /* renamed from: b */
    public final DebitCardDeliveryDistrictUiModel mo46653b() {
        return this.f52559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18811m)) {
            return false;
        }
        C18811m mVar = (C18811m) obj;
        return C41536l.m120484d(this.f52559a, mVar.f52559a) && C41536l.m120484d(this.f52560b, mVar.f52560b);
    }

    public int hashCode() {
        return (this.f52559a.hashCode() * 31) + this.f52560b.hashCode();
    }

    public String toString() {
        DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel = this.f52559a;
        DebitCardDeliveryCityUiModel debitCardDeliveryCityUiModel = this.f52560b;
        return "DeliveryLocationData(district=" + debitCardDeliveryDistrictUiModel + ", city=" + debitCardDeliveryCityUiModel + ")";
    }
}
