package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardPinDeliveryTypeEntity */
public final class DebitCardPinDeliveryTypeEntity {
    private final DeliveryTypeEntity deliveryType;
    private final String dictionaryKey;
    private final String plcClass;
    private final String plcType;

    public DebitCardPinDeliveryTypeEntity(String str, String str2, DeliveryTypeEntity deliveryTypeEntity, String str3) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(deliveryTypeEntity, "deliveryType");
        C41536l.m120489i(str3, "dictionaryKey");
        this.plcClass = str;
        this.plcType = str2;
        this.deliveryType = deliveryTypeEntity;
        this.dictionaryKey = str3;
    }

    public static /* synthetic */ DebitCardPinDeliveryTypeEntity copy$default(DebitCardPinDeliveryTypeEntity debitCardPinDeliveryTypeEntity, String str, String str2, DeliveryTypeEntity deliveryTypeEntity, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debitCardPinDeliveryTypeEntity.plcClass;
        }
        if ((i & 2) != 0) {
            str2 = debitCardPinDeliveryTypeEntity.plcType;
        }
        if ((i & 4) != 0) {
            deliveryTypeEntity = debitCardPinDeliveryTypeEntity.deliveryType;
        }
        if ((i & 8) != 0) {
            str3 = debitCardPinDeliveryTypeEntity.dictionaryKey;
        }
        return debitCardPinDeliveryTypeEntity.copy(str, str2, deliveryTypeEntity, str3);
    }

    public final String component1() {
        return this.plcClass;
    }

    public final String component2() {
        return this.plcType;
    }

    public final DeliveryTypeEntity component3() {
        return this.deliveryType;
    }

    public final String component4() {
        return this.dictionaryKey;
    }

    public final DebitCardPinDeliveryTypeEntity copy(String str, String str2, DeliveryTypeEntity deliveryTypeEntity, String str3) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(deliveryTypeEntity, "deliveryType");
        C41536l.m120489i(str3, "dictionaryKey");
        return new DebitCardPinDeliveryTypeEntity(str, str2, deliveryTypeEntity, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardPinDeliveryTypeEntity)) {
            return false;
        }
        DebitCardPinDeliveryTypeEntity debitCardPinDeliveryTypeEntity = (DebitCardPinDeliveryTypeEntity) obj;
        return C41536l.m120484d(this.plcClass, debitCardPinDeliveryTypeEntity.plcClass) && C41536l.m120484d(this.plcType, debitCardPinDeliveryTypeEntity.plcType) && this.deliveryType == debitCardPinDeliveryTypeEntity.deliveryType && C41536l.m120484d(this.dictionaryKey, debitCardPinDeliveryTypeEntity.dictionaryKey);
    }

    public final DeliveryTypeEntity getDeliveryType() {
        return this.deliveryType;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getPlcClass() {
        return this.plcClass;
    }

    public final String getPlcType() {
        return this.plcType;
    }

    public int hashCode() {
        return (((((this.plcClass.hashCode() * 31) + this.plcType.hashCode()) * 31) + this.deliveryType.hashCode()) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        String str = this.plcClass;
        String str2 = this.plcType;
        DeliveryTypeEntity deliveryTypeEntity = this.deliveryType;
        String str3 = this.dictionaryKey;
        return "DebitCardPinDeliveryTypeEntity(plcClass=" + str + ", plcType=" + str2 + ", deliveryType=" + deliveryTypeEntity + ", dictionaryKey=" + str3 + ")";
    }
}
