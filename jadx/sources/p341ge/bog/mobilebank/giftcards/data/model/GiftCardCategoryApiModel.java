package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardCategoryApiModel */
public final class GiftCardCategoryApiModel {
    private final String categoryDescEn;
    private final String categoryDescGe;
    private final long categoryId;
    private final String categoryImageUrl;
    private final String dictionaryKey;
    private final List<GiftCardOfferApiModel> offers;

    public GiftCardCategoryApiModel(long j, String str, String str2, String str3, String str4, List<GiftCardOfferApiModel> list) {
        this.categoryId = j;
        this.categoryDescEn = str;
        this.categoryDescGe = str2;
        this.categoryImageUrl = str3;
        this.dictionaryKey = str4;
        this.offers = list;
    }

    public static /* synthetic */ GiftCardCategoryApiModel copy$default(GiftCardCategoryApiModel giftCardCategoryApiModel, long j, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        GiftCardCategoryApiModel giftCardCategoryApiModel2 = giftCardCategoryApiModel;
        return giftCardCategoryApiModel.copy((i & 1) != 0 ? giftCardCategoryApiModel2.categoryId : j, (i & 2) != 0 ? giftCardCategoryApiModel2.categoryDescEn : str, (i & 4) != 0 ? giftCardCategoryApiModel2.categoryDescGe : str2, (i & 8) != 0 ? giftCardCategoryApiModel2.categoryImageUrl : str3, (i & 16) != 0 ? giftCardCategoryApiModel2.dictionaryKey : str4, (i & 32) != 0 ? giftCardCategoryApiModel2.offers : list);
    }

    public final long component1() {
        return this.categoryId;
    }

    public final String component2() {
        return this.categoryDescEn;
    }

    public final String component3() {
        return this.categoryDescGe;
    }

    public final String component4() {
        return this.categoryImageUrl;
    }

    public final String component5() {
        return this.dictionaryKey;
    }

    public final List<GiftCardOfferApiModel> component6() {
        return this.offers;
    }

    public final GiftCardCategoryApiModel copy(long j, String str, String str2, String str3, String str4, List<GiftCardOfferApiModel> list) {
        return new GiftCardCategoryApiModel(j, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardCategoryApiModel)) {
            return false;
        }
        GiftCardCategoryApiModel giftCardCategoryApiModel = (GiftCardCategoryApiModel) obj;
        return this.categoryId == giftCardCategoryApiModel.categoryId && C41536l.m120484d(this.categoryDescEn, giftCardCategoryApiModel.categoryDescEn) && C41536l.m120484d(this.categoryDescGe, giftCardCategoryApiModel.categoryDescGe) && C41536l.m120484d(this.categoryImageUrl, giftCardCategoryApiModel.categoryImageUrl) && C41536l.m120484d(this.dictionaryKey, giftCardCategoryApiModel.dictionaryKey) && C41536l.m120484d(this.offers, giftCardCategoryApiModel.offers);
    }

    public final String getCategoryDescEn() {
        return this.categoryDescEn;
    }

    public final String getCategoryDescGe() {
        return this.categoryDescGe;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryImageUrl() {
        return this.categoryImageUrl;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final List<GiftCardOfferApiModel> getOffers() {
        return this.offers;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.categoryId) * 31;
        String str = this.categoryDescEn;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categoryDescGe;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryImageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dictionaryKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<GiftCardOfferApiModel> list = this.offers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.categoryId;
        String str = this.categoryDescEn;
        String str2 = this.categoryDescGe;
        String str3 = this.categoryImageUrl;
        String str4 = this.dictionaryKey;
        List<GiftCardOfferApiModel> list = this.offers;
        return "GiftCardCategoryApiModel(categoryId=" + j + ", categoryDescEn=" + str + ", categoryDescGe=" + str2 + ", categoryImageUrl=" + str3 + ", dictionaryKey=" + str4 + ", offers=" + list + ")";
    }
}
