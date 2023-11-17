package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardClientCountryInfoEntity */
public final class CardClientCountryInfoEntity {
    private final String cardOrderAgreementStatus;
    private final String clientCountry;
    private final String countryNameEn;
    private final String countryNameGe;
    private final YesNoApiEntity showInstantCard;

    public CardClientCountryInfoEntity(String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "clientCountry");
        C41536l.m120489i(str3, "countryNameGe");
        C41536l.m120489i(str4, "countryNameEn");
        this.clientCountry = str;
        this.cardOrderAgreementStatus = str2;
        this.countryNameGe = str3;
        this.countryNameEn = str4;
        this.showInstantCard = yesNoApiEntity;
    }

    public static /* synthetic */ CardClientCountryInfoEntity copy$default(CardClientCountryInfoEntity cardClientCountryInfoEntity, String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardClientCountryInfoEntity.clientCountry;
        }
        if ((i & 2) != 0) {
            str2 = cardClientCountryInfoEntity.cardOrderAgreementStatus;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cardClientCountryInfoEntity.countryNameGe;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cardClientCountryInfoEntity.countryNameEn;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            yesNoApiEntity = cardClientCountryInfoEntity.showInstantCard;
        }
        return cardClientCountryInfoEntity.copy(str, str5, str6, str7, yesNoApiEntity);
    }

    public final String component1() {
        return this.clientCountry;
    }

    public final String component2() {
        return this.cardOrderAgreementStatus;
    }

    public final String component3() {
        return this.countryNameGe;
    }

    public final String component4() {
        return this.countryNameEn;
    }

    public final YesNoApiEntity component5() {
        return this.showInstantCard;
    }

    public final CardClientCountryInfoEntity copy(String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity) {
        C41536l.m120489i(str, "clientCountry");
        C41536l.m120489i(str3, "countryNameGe");
        C41536l.m120489i(str4, "countryNameEn");
        return new CardClientCountryInfoEntity(str, str2, str3, str4, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardClientCountryInfoEntity)) {
            return false;
        }
        CardClientCountryInfoEntity cardClientCountryInfoEntity = (CardClientCountryInfoEntity) obj;
        return C41536l.m120484d(this.clientCountry, cardClientCountryInfoEntity.clientCountry) && C41536l.m120484d(this.cardOrderAgreementStatus, cardClientCountryInfoEntity.cardOrderAgreementStatus) && C41536l.m120484d(this.countryNameGe, cardClientCountryInfoEntity.countryNameGe) && C41536l.m120484d(this.countryNameEn, cardClientCountryInfoEntity.countryNameEn) && this.showInstantCard == cardClientCountryInfoEntity.showInstantCard;
    }

    public final String getCardOrderAgreementStatus() {
        return this.cardOrderAgreementStatus;
    }

    public final String getClientCountry() {
        return this.clientCountry;
    }

    public final String getCountryNameEn() {
        return this.countryNameEn;
    }

    public final String getCountryNameGe() {
        return this.countryNameGe;
    }

    public final YesNoApiEntity getShowInstantCard() {
        return this.showInstantCard;
    }

    public int hashCode() {
        int hashCode = this.clientCountry.hashCode() * 31;
        String str = this.cardOrderAgreementStatus;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.countryNameGe.hashCode()) * 31) + this.countryNameEn.hashCode()) * 31;
        YesNoApiEntity yesNoApiEntity = this.showInstantCard;
        if (yesNoApiEntity != null) {
            i = yesNoApiEntity.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.clientCountry;
        String str2 = this.cardOrderAgreementStatus;
        String str3 = this.countryNameGe;
        String str4 = this.countryNameEn;
        YesNoApiEntity yesNoApiEntity = this.showInstantCard;
        return "CardClientCountryInfoEntity(clientCountry=" + str + ", cardOrderAgreementStatus=" + str2 + ", countryNameGe=" + str3 + ", countryNameEn=" + str4 + ", showInstantCard=" + yesNoApiEntity + ")";
    }
}
