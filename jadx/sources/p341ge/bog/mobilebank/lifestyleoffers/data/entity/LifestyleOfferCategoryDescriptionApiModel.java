package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferCategoryDescriptionApiModel */
public final class LifestyleOfferCategoryDescriptionApiModel {
    private final String categoryDescEn;
    private final String categoryDescGe;
    private final String categoryIconUrl;
    private final Long categoryId;
    private final String categoryImageUrl;

    public LifestyleOfferCategoryDescriptionApiModel(Long l, String str, String str2, String str3, String str4) {
        this.categoryId = l;
        this.categoryDescGe = str;
        this.categoryDescEn = str2;
        this.categoryIconUrl = str3;
        this.categoryImageUrl = str4;
    }

    public static /* synthetic */ LifestyleOfferCategoryDescriptionApiModel copy$default(LifestyleOfferCategoryDescriptionApiModel lifestyleOfferCategoryDescriptionApiModel, Long l, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lifestyleOfferCategoryDescriptionApiModel.categoryId;
        }
        if ((i & 2) != 0) {
            str = lifestyleOfferCategoryDescriptionApiModel.categoryDescGe;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = lifestyleOfferCategoryDescriptionApiModel.categoryDescEn;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = lifestyleOfferCategoryDescriptionApiModel.categoryIconUrl;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = lifestyleOfferCategoryDescriptionApiModel.categoryImageUrl;
        }
        return lifestyleOfferCategoryDescriptionApiModel.copy(l, str5, str6, str7, str4);
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

    public final LifestyleOfferCategoryDescriptionApiModel copy(Long l, String str, String str2, String str3, String str4) {
        return new LifestyleOfferCategoryDescriptionApiModel(l, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleOfferCategoryDescriptionApiModel)) {
            return false;
        }
        LifestyleOfferCategoryDescriptionApiModel lifestyleOfferCategoryDescriptionApiModel = (LifestyleOfferCategoryDescriptionApiModel) obj;
        return C41536l.m120484d(this.categoryId, lifestyleOfferCategoryDescriptionApiModel.categoryId) && C41536l.m120484d(this.categoryDescGe, lifestyleOfferCategoryDescriptionApiModel.categoryDescGe) && C41536l.m120484d(this.categoryDescEn, lifestyleOfferCategoryDescriptionApiModel.categoryDescEn) && C41536l.m120484d(this.categoryIconUrl, lifestyleOfferCategoryDescriptionApiModel.categoryIconUrl) && C41536l.m120484d(this.categoryImageUrl, lifestyleOfferCategoryDescriptionApiModel.categoryImageUrl);
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.categoryId;
        String str = this.categoryDescGe;
        String str2 = this.categoryDescEn;
        String str3 = this.categoryIconUrl;
        String str4 = this.categoryImageUrl;
        return "LifestyleOfferCategoryDescriptionApiModel(categoryId=" + l + ", categoryDescGe=" + str + ", categoryDescEn=" + str2 + ", categoryIconUrl=" + str3 + ", categoryImageUrl=" + str4 + ")";
    }
}
