package p341ge.bog.mobilebank.cardapplications.data.entity.delivery;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryDistrictEntity */
public final class DeliveryDistrictEntity {
    private final long cityId;
    private final String districtName;

    /* renamed from: id */
    private final long f41311id;

    public DeliveryDistrictEntity(String str, long j, long j2) {
        C41536l.m120489i(str, "districtName");
        this.districtName = str;
        this.f41311id = j;
        this.cityId = j2;
    }

    public static /* synthetic */ DeliveryDistrictEntity copy$default(DeliveryDistrictEntity deliveryDistrictEntity, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryDistrictEntity.districtName;
        }
        if ((i & 2) != 0) {
            j = deliveryDistrictEntity.f41311id;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = deliveryDistrictEntity.cityId;
        }
        return deliveryDistrictEntity.copy(str, j3, j2);
    }

    public final String component1() {
        return this.districtName;
    }

    public final long component2() {
        return this.f41311id;
    }

    public final long component3() {
        return this.cityId;
    }

    public final DeliveryDistrictEntity copy(String str, long j, long j2) {
        C41536l.m120489i(str, "districtName");
        return new DeliveryDistrictEntity(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryDistrictEntity)) {
            return false;
        }
        DeliveryDistrictEntity deliveryDistrictEntity = (DeliveryDistrictEntity) obj;
        return C41536l.m120484d(this.districtName, deliveryDistrictEntity.districtName) && this.f41311id == deliveryDistrictEntity.f41311id && this.cityId == deliveryDistrictEntity.cityId;
    }

    public final long getCityId() {
        return this.cityId;
    }

    public final String getDistrictName() {
        return this.districtName;
    }

    public final long getId() {
        return this.f41311id;
    }

    public int hashCode() {
        return (((this.districtName.hashCode() * 31) + C7397t.m28148a(this.f41311id)) * 31) + C7397t.m28148a(this.cityId);
    }

    public String toString() {
        String str = this.districtName;
        long j = this.f41311id;
        long j2 = this.cityId;
        return "DeliveryDistrictEntity(districtName=" + str + ", id=" + j + ", cityId=" + j2 + ")";
    }
}
