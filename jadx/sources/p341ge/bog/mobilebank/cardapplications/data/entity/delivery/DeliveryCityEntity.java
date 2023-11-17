package p341ge.bog.mobilebank.cardapplications.data.entity.delivery;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryCityEntity */
public final class DeliveryCityEntity {
    private final String cityName;
    private final List<DeliveryDistrictEntity> districts;

    /* renamed from: id */
    private final long f41310id;

    public DeliveryCityEntity(String str, List<DeliveryDistrictEntity> list, long j) {
        C41536l.m120489i(str, "cityName");
        this.cityName = str;
        this.districts = list;
        this.f41310id = j;
    }

    public static /* synthetic */ DeliveryCityEntity copy$default(DeliveryCityEntity deliveryCityEntity, String str, List<DeliveryDistrictEntity> list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCityEntity.cityName;
        }
        if ((i & 2) != 0) {
            list = deliveryCityEntity.districts;
        }
        if ((i & 4) != 0) {
            j = deliveryCityEntity.f41310id;
        }
        return deliveryCityEntity.copy(str, list, j);
    }

    public final String component1() {
        return this.cityName;
    }

    public final List<DeliveryDistrictEntity> component2() {
        return this.districts;
    }

    public final long component3() {
        return this.f41310id;
    }

    public final DeliveryCityEntity copy(String str, List<DeliveryDistrictEntity> list, long j) {
        C41536l.m120489i(str, "cityName");
        return new DeliveryCityEntity(str, list, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryCityEntity)) {
            return false;
        }
        DeliveryCityEntity deliveryCityEntity = (DeliveryCityEntity) obj;
        return C41536l.m120484d(this.cityName, deliveryCityEntity.cityName) && C41536l.m120484d(this.districts, deliveryCityEntity.districts) && this.f41310id == deliveryCityEntity.f41310id;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final List<DeliveryDistrictEntity> getDistricts() {
        return this.districts;
    }

    public final long getId() {
        return this.f41310id;
    }

    public int hashCode() {
        int hashCode = this.cityName.hashCode() * 31;
        List<DeliveryDistrictEntity> list = this.districts;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + C7397t.m28148a(this.f41310id);
    }

    public String toString() {
        String str = this.cityName;
        List<DeliveryDistrictEntity> list = this.districts;
        long j = this.f41310id;
        return "DeliveryCityEntity(cityName=" + str + ", districts=" + list + ", id=" + j + ")";
    }
}
