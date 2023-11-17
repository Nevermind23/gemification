package p341ge.bog.mobilebank.cardapplications.data.entity.delivery;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.delivery.CardDeliveryAddressesEntity */
public final class CardDeliveryAddressesEntity {
    private final List<DeliveryCityEntity> cities;

    public CardDeliveryAddressesEntity(List<DeliveryCityEntity> list) {
        this.cities = list;
    }

    public static /* synthetic */ CardDeliveryAddressesEntity copy$default(CardDeliveryAddressesEntity cardDeliveryAddressesEntity, List<DeliveryCityEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardDeliveryAddressesEntity.cities;
        }
        return cardDeliveryAddressesEntity.copy(list);
    }

    public final List<DeliveryCityEntity> component1() {
        return this.cities;
    }

    public final CardDeliveryAddressesEntity copy(List<DeliveryCityEntity> list) {
        return new CardDeliveryAddressesEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardDeliveryAddressesEntity) && C41536l.m120484d(this.cities, ((CardDeliveryAddressesEntity) obj).cities);
    }

    public final List<DeliveryCityEntity> getCities() {
        return this.cities;
    }

    public int hashCode() {
        List<DeliveryCityEntity> list = this.cities;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<DeliveryCityEntity> list = this.cities;
        return "CardDeliveryAddressesEntity(cities=" + list + ")";
    }
}
