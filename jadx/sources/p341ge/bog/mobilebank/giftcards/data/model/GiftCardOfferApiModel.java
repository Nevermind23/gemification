package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardOfferApiModel */
public final class GiftCardOfferApiModel {
    private final List<String> offerBrandListEn;
    private final List<String> offerBrandListGe;
    private final long offerId;
    private final String offerLogoStorageId;
    private final String offerLogoStorageUrl;
    private final String offerNameEn;
    private final String offerNameGe;
    private final List<String> purchaseMethods;

    public GiftCardOfferApiModel(long j, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3) {
        this.offerId = j;
        this.offerLogoStorageId = str;
        this.offerLogoStorageUrl = str2;
        this.offerNameEn = str3;
        this.offerNameGe = str4;
        this.purchaseMethods = list;
        this.offerBrandListGe = list2;
        this.offerBrandListEn = list3;
    }

    public static /* synthetic */ GiftCardOfferApiModel copy$default(GiftCardOfferApiModel giftCardOfferApiModel, long j, String str, String str2, String str3, String str4, List list, List list2, List list3, int i, Object obj) {
        GiftCardOfferApiModel giftCardOfferApiModel2 = giftCardOfferApiModel;
        int i2 = i;
        return giftCardOfferApiModel.copy((i2 & 1) != 0 ? giftCardOfferApiModel2.offerId : j, (i2 & 2) != 0 ? giftCardOfferApiModel2.offerLogoStorageId : str, (i2 & 4) != 0 ? giftCardOfferApiModel2.offerLogoStorageUrl : str2, (i2 & 8) != 0 ? giftCardOfferApiModel2.offerNameEn : str3, (i2 & 16) != 0 ? giftCardOfferApiModel2.offerNameGe : str4, (i2 & 32) != 0 ? giftCardOfferApiModel2.purchaseMethods : list, (i2 & 64) != 0 ? giftCardOfferApiModel2.offerBrandListGe : list2, (i2 & 128) != 0 ? giftCardOfferApiModel2.offerBrandListEn : list3);
    }

    public final long component1() {
        return this.offerId;
    }

    public final String component2() {
        return this.offerLogoStorageId;
    }

    public final String component3() {
        return this.offerLogoStorageUrl;
    }

    public final String component4() {
        return this.offerNameEn;
    }

    public final String component5() {
        return this.offerNameGe;
    }

    public final List<String> component6() {
        return this.purchaseMethods;
    }

    public final List<String> component7() {
        return this.offerBrandListGe;
    }

    public final List<String> component8() {
        return this.offerBrandListEn;
    }

    public final GiftCardOfferApiModel copy(long j, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3) {
        return new GiftCardOfferApiModel(j, str, str2, str3, str4, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardOfferApiModel)) {
            return false;
        }
        GiftCardOfferApiModel giftCardOfferApiModel = (GiftCardOfferApiModel) obj;
        return this.offerId == giftCardOfferApiModel.offerId && C41536l.m120484d(this.offerLogoStorageId, giftCardOfferApiModel.offerLogoStorageId) && C41536l.m120484d(this.offerLogoStorageUrl, giftCardOfferApiModel.offerLogoStorageUrl) && C41536l.m120484d(this.offerNameEn, giftCardOfferApiModel.offerNameEn) && C41536l.m120484d(this.offerNameGe, giftCardOfferApiModel.offerNameGe) && C41536l.m120484d(this.purchaseMethods, giftCardOfferApiModel.purchaseMethods) && C41536l.m120484d(this.offerBrandListGe, giftCardOfferApiModel.offerBrandListGe) && C41536l.m120484d(this.offerBrandListEn, giftCardOfferApiModel.offerBrandListEn);
    }

    public final List<String> getOfferBrandListEn() {
        return this.offerBrandListEn;
    }

    public final List<String> getOfferBrandListGe() {
        return this.offerBrandListGe;
    }

    public final long getOfferId() {
        return this.offerId;
    }

    public final String getOfferLogoStorageId() {
        return this.offerLogoStorageId;
    }

    public final String getOfferLogoStorageUrl() {
        return this.offerLogoStorageUrl;
    }

    public final String getOfferNameEn() {
        return this.offerNameEn;
    }

    public final String getOfferNameGe() {
        return this.offerNameGe;
    }

    public final List<String> getPurchaseMethods() {
        return this.purchaseMethods;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.offerId) * 31;
        String str = this.offerLogoStorageId;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerLogoStorageUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerNameEn;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerNameGe;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.purchaseMethods;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.offerBrandListGe;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.offerBrandListEn;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        long j = this.offerId;
        String str = this.offerLogoStorageId;
        String str2 = this.offerLogoStorageUrl;
        String str3 = this.offerNameEn;
        String str4 = this.offerNameGe;
        List<String> list = this.purchaseMethods;
        List<String> list2 = this.offerBrandListGe;
        List<String> list3 = this.offerBrandListEn;
        return "GiftCardOfferApiModel(offerId=" + j + ", offerLogoStorageId=" + str + ", offerLogoStorageUrl=" + str2 + ", offerNameEn=" + str3 + ", offerNameGe=" + str4 + ", purchaseMethods=" + list + ", offerBrandListGe=" + list2 + ", offerBrandListEn=" + list3 + ")";
    }
}
