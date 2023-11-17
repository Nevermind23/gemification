package p341ge.bog.mobilebank.cardapplications.data.entity.instantcards;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.instantcards.ValidatedInstantCardEntity */
public final class ValidatedInstantCardEntity {
    private final String cardClass;
    private final String cardType;
    private final String pinDeliveryType;
    private final String product;

    public ValidatedInstantCardEntity(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "pinDeliveryType");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str3, "cardClass");
        C41536l.m120489i(str4, "product");
        this.pinDeliveryType = str;
        this.cardType = str2;
        this.cardClass = str3;
        this.product = str4;
    }

    public static /* synthetic */ ValidatedInstantCardEntity copy$default(ValidatedInstantCardEntity validatedInstantCardEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validatedInstantCardEntity.pinDeliveryType;
        }
        if ((i & 2) != 0) {
            str2 = validatedInstantCardEntity.cardType;
        }
        if ((i & 4) != 0) {
            str3 = validatedInstantCardEntity.cardClass;
        }
        if ((i & 8) != 0) {
            str4 = validatedInstantCardEntity.product;
        }
        return validatedInstantCardEntity.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.pinDeliveryType;
    }

    public final String component2() {
        return this.cardType;
    }

    public final String component3() {
        return this.cardClass;
    }

    public final String component4() {
        return this.product;
    }

    public final ValidatedInstantCardEntity copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "pinDeliveryType");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str3, "cardClass");
        C41536l.m120489i(str4, "product");
        return new ValidatedInstantCardEntity(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidatedInstantCardEntity)) {
            return false;
        }
        ValidatedInstantCardEntity validatedInstantCardEntity = (ValidatedInstantCardEntity) obj;
        return C41536l.m120484d(this.pinDeliveryType, validatedInstantCardEntity.pinDeliveryType) && C41536l.m120484d(this.cardType, validatedInstantCardEntity.cardType) && C41536l.m120484d(this.cardClass, validatedInstantCardEntity.cardClass) && C41536l.m120484d(this.product, validatedInstantCardEntity.product);
    }

    public final String getCardClass() {
        return this.cardClass;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getPinDeliveryType() {
        return this.pinDeliveryType;
    }

    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((((this.pinDeliveryType.hashCode() * 31) + this.cardType.hashCode()) * 31) + this.cardClass.hashCode()) * 31) + this.product.hashCode();
    }

    public String toString() {
        String str = this.pinDeliveryType;
        String str2 = this.cardType;
        String str3 = this.cardClass;
        String str4 = this.product;
        return "ValidatedInstantCardEntity(pinDeliveryType=" + str + ", cardType=" + str2 + ", cardClass=" + str3 + ", product=" + str4 + ")";
    }
}
