package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferCategoryApiModel */
public final class LifestyleOfferCategoryApiModel {
    private final String categoryDescEn;
    private final String categoryDescGe;
    private final String categoryIconUrl;
    private final Long categoryId;
    private final String categoryImageUrl;
    private final List<LifestyleOfferApiModel> offers;

    public LifestyleOfferCategoryApiModel(Long l, String str, String str2, String str3, String str4, List<LifestyleOfferApiModel> list) {
        this.categoryId = l;
        this.categoryDescGe = str;
        this.categoryDescEn = str2;
        this.categoryIconUrl = str3;
        this.categoryImageUrl = str4;
        this.offers = list;
    }

    public static /* synthetic */ LifestyleOfferCategoryApiModel copy$default(LifestyleOfferCategoryApiModel lifestyleOfferCategoryApiModel, Long l, String str, String str2, String str3, String str4, List<LifestyleOfferApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lifestyleOfferCategoryApiModel.categoryId;
        }
        if ((i & 2) != 0) {
            str = lifestyleOfferCategoryApiModel.categoryDescGe;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = lifestyleOfferCategoryApiModel.categoryDescEn;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = lifestyleOfferCategoryApiModel.categoryIconUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = lifestyleOfferCategoryApiModel.categoryImageUrl;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            list = lifestyleOfferCategoryApiModel.offers;
        }
        return lifestyleOfferCategoryApiModel.copy(l, str5, str6, str7, str8, list);
    }

    public final Long component1() {
        return this.categoryId;
    }

    public final String component2() {
        return this.categoryDescGe;
    }

    public final String component3() {
        return this.categoryDescEn;
    }

    public final String component4() {
        return this.categoryIconUrl;
    }

    public final String component5() {
        return this.categoryImageUrl;
    }

    public final List<LifestyleOfferApiModel> component6() {
        return this.offers;
    }

    public final LifestyleOfferCategoryApiModel copy(Long l, String str, String str2, String str3, String str4, List<LifestyleOfferApiModel> list) {
        return new LifestyleOfferCategoryApiModel(l, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleOfferCategoryApiModel)) {
            return false;
        }
        LifestyleOfferCategoryApiModel lifestyleOfferCategoryApiModel = (LifestyleOfferCategoryApiModel) obj;
        return C41536l.m120484d(this.categoryId, lifestyleOfferCategoryApiModel.categoryId) && C41536l.m120484d(this.categoryDescGe, lifestyleOfferCategoryApiModel.categoryDescGe) && C41536l.m120484d(this.categoryDescEn, lifestyleOfferCategoryApiModel.categoryDescEn) && C41536l.m120484d(this.categoryIconUrl, lifestyleOfferCategoryApiModel.categoryIconUrl) && C41536l.m120484d(this.categoryImageUrl, lifestyleOfferCategoryApiModel.categoryImageUrl) && C41536l.m120484d(this.offers, lifestyleOfferCategoryApiModel.offers);
    }

    public final String getCategoryDescEn() {
        return this.categoryDescEn;
    }

    public final String getCategoryDescGe() {
        return this.categoryDescGe;
    }

    public final String getCategoryIconUrl() {
        return this.categoryIconUrl;
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryImageUrl() {
        return this.categoryImageUrl;
    }

    public final List<LifestyleOfferApiModel> getOffers() {
        return this.offers;
    }

    public int hashCode() {
        Long l = this.categoryId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.categoryDescGe;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categoryDescEn;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryIconUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryImageUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<LifestyleOfferApiModel> list = this.offers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.categoryId;
        String str = this.categoryDescGe;
        String str2 = this.categoryDescEn;
        String str3 = this.categoryIconUrl;
        String str4 = this.categoryImageUrl;
        List<LifestyleOfferApiModel> list = this.offers;
        return "LifestyleOfferCategoryApiModel(categoryId=" + l + ", categoryDescGe=" + str + ", categoryDescEn=" + str2 + ", categoryIconUrl=" + str3 + ", categoryImageUrl=" + str4 + ", offers=" + list + ")";
    }
}
