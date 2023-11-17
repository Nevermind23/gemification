package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.DebitCardEntity */
public final class DebitCardEntity {
    private final String cardNameKey;
    private final String cardPriceValue;
    private final ExternalFileEntity cardSmallImage;
    private final String subProductCode;
    private final String typeName;

    public DebitCardEntity(String str, String str2, ExternalFileEntity externalFileEntity, String str3, String str4) {
        this.cardNameKey = str;
        this.typeName = str2;
        this.cardSmallImage = externalFileEntity;
        this.subProductCode = str3;
        this.cardPriceValue = str4;
    }

    public static /* synthetic */ DebitCardEntity copy$default(DebitCardEntity debitCardEntity, String str, String str2, ExternalFileEntity externalFileEntity, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debitCardEntity.cardNameKey;
        }
        if ((i & 2) != 0) {
            str2 = debitCardEntity.typeName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            externalFileEntity = debitCardEntity.cardSmallImage;
        }
        ExternalFileEntity externalFileEntity2 = externalFileEntity;
        if ((i & 8) != 0) {
            str3 = debitCardEntity.subProductCode;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = debitCardEntity.cardPriceValue;
        }
        return debitCardEntity.copy(str, str5, externalFileEntity2, str6, str4);
    }

    public final String component1() {
        return this.cardNameKey;
    }

    public final String component2() {
        return this.typeName;
    }

    public final ExternalFileEntity component3() {
        return this.cardSmallImage;
    }

    public final String component4() {
        return this.subProductCode;
    }

    public final String component5() {
        return this.cardPriceValue;
    }

    public final DebitCardEntity copy(String str, String str2, ExternalFileEntity externalFileEntity, String str3, String str4) {
        return new DebitCardEntity(str, str2, externalFileEntity, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardEntity)) {
            return false;
        }
        DebitCardEntity debitCardEntity = (DebitCardEntity) obj;
        return C41536l.m120484d(this.cardNameKey, debitCardEntity.cardNameKey) && C41536l.m120484d(this.typeName, debitCardEntity.typeName) && C41536l.m120484d(this.cardSmallImage, debitCardEntity.cardSmallImage) && C41536l.m120484d(this.subProductCode, debitCardEntity.subProductCode) && C41536l.m120484d(this.cardPriceValue, debitCardEntity.cardPriceValue);
    }

    public final String getCardNameKey() {
        return this.cardNameKey;
    }

    public final String getCardPriceValue() {
        return this.cardPriceValue;
    }

    public final ExternalFileEntity getCardSmallImage() {
        return this.cardSmallImage;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        String str = this.cardNameKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.typeName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.cardSmallImage;
        int hashCode3 = (hashCode2 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        String str3 = this.subProductCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardPriceValue;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.cardNameKey;
        String str2 = this.typeName;
        ExternalFileEntity externalFileEntity = this.cardSmallImage;
        String str3 = this.subProductCode;
        String str4 = this.cardPriceValue;
        return "DebitCardEntity(cardNameKey=" + str + ", typeName=" + str2 + ", cardSmallImage=" + externalFileEntity + ", subProductCode=" + str3 + ", cardPriceValue=" + str4 + ")";
    }
}
