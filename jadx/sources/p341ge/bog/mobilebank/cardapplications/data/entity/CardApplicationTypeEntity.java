package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity */
public final class CardApplicationTypeEntity {
    public static final C13933a Companion = new C13933a((DefaultConstructorMarker) null);
    public static final String LOOKUP_NAME_CARD_APP_TYPE = "CARD_APP_TYPE";
    public static final String LOOKUP_NAME_CARD_APP_TYPE_DESC = "CARD_APP_TYPE_DESC";
    private final List<LookupEntity> cardAppType;
    private final String cardOrderAgreementStatus;
    private final String clientCountry;
    private final String countryNameEn;
    private final String countryNameGe;
    private final List<RegionEntity> regions;
    private final String showInstantCard;

    /* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CardApplicationTypeEntity$a */
    public static final class C13933a {
        private C13933a() {
        }

        public /* synthetic */ C13933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CardApplicationTypeEntity(List<LookupEntity> list, String str, String str2, String str3, String str4, String str5, List<RegionEntity> list2) {
        this.cardAppType = list;
        this.clientCountry = str;
        this.cardOrderAgreementStatus = str2;
        this.countryNameGe = str3;
        this.countryNameEn = str4;
        this.showInstantCard = str5;
        this.regions = list2;
    }

    public static /* synthetic */ CardApplicationTypeEntity copy$default(CardApplicationTypeEntity cardApplicationTypeEntity, List<LookupEntity> list, String str, String str2, String str3, String str4, String str5, List<RegionEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardApplicationTypeEntity.cardAppType;
        }
        if ((i & 2) != 0) {
            str = cardApplicationTypeEntity.clientCountry;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = cardApplicationTypeEntity.cardOrderAgreementStatus;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = cardApplicationTypeEntity.countryNameGe;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = cardApplicationTypeEntity.countryNameEn;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = cardApplicationTypeEntity.showInstantCard;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            list2 = cardApplicationTypeEntity.regions;
        }
        return cardApplicationTypeEntity.copy(list, str6, str7, str8, str9, str10, list2);
    }

    public final List<LookupEntity> component1() {
        return this.cardAppType;
    }

    public final String component2() {
        return this.clientCountry;
    }

    public final String component3() {
        return this.cardOrderAgreementStatus;
    }

    public final String component4() {
        return this.countryNameGe;
    }

    public final String component5() {
        return this.countryNameEn;
    }

    public final String component6() {
        return this.showInstantCard;
    }

    public final List<RegionEntity> component7() {
        return this.regions;
    }

    public final CardApplicationTypeEntity copy(List<LookupEntity> list, String str, String str2, String str3, String str4, String str5, List<RegionEntity> list2) {
        return new CardApplicationTypeEntity(list, str, str2, str3, str4, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardApplicationTypeEntity)) {
            return false;
        }
        CardApplicationTypeEntity cardApplicationTypeEntity = (CardApplicationTypeEntity) obj;
        return C41536l.m120484d(this.cardAppType, cardApplicationTypeEntity.cardAppType) && C41536l.m120484d(this.clientCountry, cardApplicationTypeEntity.clientCountry) && C41536l.m120484d(this.cardOrderAgreementStatus, cardApplicationTypeEntity.cardOrderAgreementStatus) && C41536l.m120484d(this.countryNameGe, cardApplicationTypeEntity.countryNameGe) && C41536l.m120484d(this.countryNameEn, cardApplicationTypeEntity.countryNameEn) && C41536l.m120484d(this.showInstantCard, cardApplicationTypeEntity.showInstantCard) && C41536l.m120484d(this.regions, cardApplicationTypeEntity.regions);
    }

    public final List<LookupEntity> getCardAppType() {
        return this.cardAppType;
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

    public final List<RegionEntity> getRegions() {
        return this.regions;
    }

    public final String getShowInstantCard() {
        return this.showInstantCard;
    }

    public int hashCode() {
        List<LookupEntity> list = this.cardAppType;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.clientCountry;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardOrderAgreementStatus;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryNameGe;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryNameEn;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.showInstantCard;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<RegionEntity> list2 = this.regions;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        List<LookupEntity> list = this.cardAppType;
        String str = this.clientCountry;
        String str2 = this.cardOrderAgreementStatus;
        String str3 = this.countryNameGe;
        String str4 = this.countryNameEn;
        String str5 = this.showInstantCard;
        List<RegionEntity> list2 = this.regions;
        return "CardApplicationTypeEntity(cardAppType=" + list + ", clientCountry=" + str + ", cardOrderAgreementStatus=" + str2 + ", countryNameGe=" + str3 + ", countryNameEn=" + str4 + ", showInstantCard=" + str5 + ", regions=" + list2 + ")";
    }
}
