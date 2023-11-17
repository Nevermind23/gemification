package p341ge.bog.mobilebank.cleanarch.data.offer.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.offer.entity.CreditOfferLimitEntity */
public final class CreditOfferLimitEntity {
    private final String cardCcy;
    private final String cardLimit;
    private final String limitCategory;
    private final String operationType;
    private final String titleDictionaryKey;
    private final String titleDictionaryKeyValue;

    public CreditOfferLimitEntity(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "operationType");
        C41536l.m120489i(str2, "cardCcy");
        C41536l.m120489i(str3, "limitCategory");
        C41536l.m120489i(str4, "cardLimit");
        this.operationType = str;
        this.cardCcy = str2;
        this.limitCategory = str3;
        this.cardLimit = str4;
        this.titleDictionaryKey = str5;
        this.titleDictionaryKeyValue = str6;
    }

    public static /* synthetic */ CreditOfferLimitEntity copy$default(CreditOfferLimitEntity creditOfferLimitEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditOfferLimitEntity.operationType;
        }
        if ((i & 2) != 0) {
            str2 = creditOfferLimitEntity.cardCcy;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = creditOfferLimitEntity.limitCategory;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = creditOfferLimitEntity.cardLimit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = creditOfferLimitEntity.titleDictionaryKey;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = creditOfferLimitEntity.titleDictionaryKeyValue;
        }
        return creditOfferLimitEntity.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.operationType;
    }

    public final String component2() {
        return this.cardCcy;
    }

    public final String component3() {
        return this.limitCategory;
    }

    public final String component4() {
        return this.cardLimit;
    }

    public final String component5() {
        return this.titleDictionaryKey;
    }

    public final String component6() {
        return this.titleDictionaryKeyValue;
    }

    public final CreditOfferLimitEntity copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "operationType");
        C41536l.m120489i(str2, "cardCcy");
        C41536l.m120489i(str3, "limitCategory");
        C41536l.m120489i(str4, "cardLimit");
        return new CreditOfferLimitEntity(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferLimitEntity)) {
            return false;
        }
        CreditOfferLimitEntity creditOfferLimitEntity = (CreditOfferLimitEntity) obj;
        return C41536l.m120484d(this.operationType, creditOfferLimitEntity.operationType) && C41536l.m120484d(this.cardCcy, creditOfferLimitEntity.cardCcy) && C41536l.m120484d(this.limitCategory, creditOfferLimitEntity.limitCategory) && C41536l.m120484d(this.cardLimit, creditOfferLimitEntity.cardLimit) && C41536l.m120484d(this.titleDictionaryKey, creditOfferLimitEntity.titleDictionaryKey) && C41536l.m120484d(this.titleDictionaryKeyValue, creditOfferLimitEntity.titleDictionaryKeyValue);
    }

    public final String getCardCcy() {
        return this.cardCcy;
    }

    public final String getCardLimit() {
        return this.cardLimit;
    }

    public final String getLimitCategory() {
        return this.limitCategory;
    }

    public final String getOperationType() {
        return this.operationType;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public final String getTitleDictionaryKeyValue() {
        return this.titleDictionaryKeyValue;
    }

    public int hashCode() {
        int hashCode = ((((((this.operationType.hashCode() * 31) + this.cardCcy.hashCode()) * 31) + this.limitCategory.hashCode()) * 31) + this.cardLimit.hashCode()) * 31;
        String str = this.titleDictionaryKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleDictionaryKeyValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.operationType;
        String str2 = this.cardCcy;
        String str3 = this.limitCategory;
        String str4 = this.cardLimit;
        String str5 = this.titleDictionaryKey;
        String str6 = this.titleDictionaryKeyValue;
        return "CreditOfferLimitEntity(operationType=" + str + ", cardCcy=" + str2 + ", limitCategory=" + str3 + ", cardLimit=" + str4 + ", titleDictionaryKey=" + str5 + ", titleDictionaryKeyValue=" + str6 + ")";
    }
}
