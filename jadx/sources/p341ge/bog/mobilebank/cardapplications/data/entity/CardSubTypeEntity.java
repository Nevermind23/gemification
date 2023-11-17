package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardSubTypeEntity */
public final class CardSubTypeEntity {
    private final YesNoApiEntity digitalCardFlag;
    private final String orderNumber;
    private final String product;
    private final String regionId;
    private final String subProductCode;

    public CardSubTypeEntity(String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(str3, "orderNumber");
        C41536l.m120489i(str4, "regionId");
        C41536l.m120489i(yesNoApiEntity, "digitalCardFlag");
        this.product = str;
        this.subProductCode = str2;
        this.orderNumber = str3;
        this.regionId = str4;
        this.digitalCardFlag = yesNoApiEntity;
    }

    public static /* synthetic */ CardSubTypeEntity copy$default(CardSubTypeEntity cardSubTypeEntity, String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardSubTypeEntity.product;
        }
        if ((i & 2) != 0) {
            str2 = cardSubTypeEntity.subProductCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cardSubTypeEntity.orderNumber;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cardSubTypeEntity.regionId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            yesNoApiEntity = cardSubTypeEntity.digitalCardFlag;
        }
        return cardSubTypeEntity.copy(str, str5, str6, str7, yesNoApiEntity);
    }

    public final String component1() {
        return this.product;
    }

    public final String component2() {
        return this.subProductCode;
    }

    public final String component3() {
        return this.orderNumber;
    }

    public final String component4() {
        return this.regionId;
    }

    public final YesNoApiEntity component5() {
        return this.digitalCardFlag;
    }

    public final CardSubTypeEntity copy(String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "product");
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(str3, "orderNumber");
        C41536l.m120489i(str4, "regionId");
        C41536l.m120489i(yesNoApiEntity, "digitalCardFlag");
        return new CardSubTypeEntity(str, str2, str3, str4, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSubTypeEntity)) {
            return false;
        }
        CardSubTypeEntity cardSubTypeEntity = (CardSubTypeEntity) obj;
        return C41536l.m120484d(this.product, cardSubTypeEntity.product) && C41536l.m120484d(this.subProductCode, cardSubTypeEntity.subProductCode) && C41536l.m120484d(this.orderNumber, cardSubTypeEntity.orderNumber) && C41536l.m120484d(this.regionId, cardSubTypeEntity.regionId) && this.digitalCardFlag == cardSubTypeEntity.digitalCardFlag;
    }

    public final YesNoApiEntity getDigitalCardFlag() {
        return this.digitalCardFlag;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRegionId() {
        return this.regionId;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        return (((((((this.product.hashCode() * 31) + this.subProductCode.hashCode()) * 31) + this.orderNumber.hashCode()) * 31) + this.regionId.hashCode()) * 31) + this.digitalCardFlag.hashCode();
    }

    public String toString() {
        String str = this.product;
        String str2 = this.subProductCode;
        String str3 = this.orderNumber;
        String str4 = this.regionId;
        YesNoApiEntity yesNoApiEntity = this.digitalCardFlag;
        return "CardSubTypeEntity(product=" + str + ", subProductCode=" + str2 + ", orderNumber=" + str3 + ", regionId=" + str4 + ", digitalCardFlag=" + yesNoApiEntity + ")";
    }
}
