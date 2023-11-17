package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOffersApiModel */
public final class LifestyleOffersApiModel {
    private final List<LifestyleOfferCategoryApiModel> allOffersCategories;
    private final List<LifestyleOfferSimpleApiModel> lastMinuteOffers;
    private final List<LifestyleOfferSimpleApiModel> recommendedOffers;
    private final List<LifestyleOfferCategoryDescriptionApiModel> topCategories;
    private final List<LifestyleOfferSimpleApiModel> topOffers;

    public LifestyleOffersApiModel(List<LifestyleOfferSimpleApiModel> list, List<LifestyleOfferSimpleApiModel> list2, List<LifestyleOfferSimpleApiModel> list3, List<LifestyleOfferCategoryApiModel> list4, List<LifestyleOfferCategoryDescriptionApiModel> list5) {
        this.topOffers = list;
        this.recommendedOffers = list2;
        this.lastMinuteOffers = list3;
        this.allOffersCategories = list4;
        this.topCategories = list5;
    }

    public static /* synthetic */ LifestyleOffersApiModel copy$default(LifestyleOffersApiModel lifestyleOffersApiModel, List<LifestyleOfferSimpleApiModel> list, List<LifestyleOfferSimpleApiModel> list2, List<LifestyleOfferSimpleApiModel> list3, List<LifestyleOfferCategoryApiModel> list4, List<LifestyleOfferCategoryDescriptionApiModel> list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lifestyleOffersApiModel.topOffers;
        }
        if ((i & 2) != 0) {
            list2 = lifestyleOffersApiModel.recommendedOffers;
        }
        List<LifestyleOfferSimpleApiModel> list6 = list2;
        if ((i & 4) != 0) {
            list3 = lifestyleOffersApiModel.lastMinuteOffers;
        }
        List<LifestyleOfferSimpleApiModel> list7 = list3;
        if ((i & 8) != 0) {
            list4 = lifestyleOffersApiModel.allOffersCategories;
        }
        List<LifestyleOfferCategoryApiModel> list8 = list4;
        if ((i & 16) != 0) {
            list5 = lifestyleOffersApiModel.topCategories;
        }
        return lifestyleOffersApiModel.copy(list, list6, list7, list8, list5);
    }

    public final List<LifestyleOfferSimpleApiModel> component1() {
        return this.topOffers;
    }

    public final List<LifestyleOfferSimpleApiModel> component2() {
        return this.recommendedOffers;
    }

    public final List<LifestyleOfferSimpleApiModel> component3() {
        return this.lastMinuteOffers;
    }

    public final List<LifestyleOfferCategoryApiModel> component4() {
        return this.allOffersCategories;
    }

    public final List<LifestyleOfferCategoryDescriptionApiModel> component5() {
        return this.topCategories;
    }

    public final LifestyleOffersApiModel copy(List<LifestyleOfferSimpleApiModel> list, List<LifestyleOfferSimpleApiModel> list2, List<LifestyleOfferSimpleApiModel> list3, List<LifestyleOfferCategoryApiModel> list4, List<LifestyleOfferCategoryDescriptionApiModel> list5) {
        return new LifestyleOffersApiModel(list, list2, list3, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleOffersApiModel)) {
            return false;
        }
        LifestyleOffersApiModel lifestyleOffersApiModel = (LifestyleOffersApiModel) obj;
        return C41536l.m120484d(this.topOffers, lifestyleOffersApiModel.topOffers) && C41536l.m120484d(this.recommendedOffers, lifestyleOffersApiModel.recommendedOffers) && C41536l.m120484d(this.lastMinuteOffers, lifestyleOffersApiModel.lastMinuteOffers) && C41536l.m120484d(this.allOffersCategories, lifestyleOffersApiModel.allOffersCategories) && C41536l.m120484d(this.topCategories, lifestyleOffersApiModel.topCategories);
    }

    public final List<LifestyleOfferCategoryApiModel> getAllOffersCategories() {
        return this.allOffersCategories;
    }

    public final List<LifestyleOfferSimpleApiModel> getLastMinuteOffers() {
        return this.lastMinuteOffers;
    }

    public final List<LifestyleOfferSimpleApiModel> getRecommendedOffers() {
        return this.recommendedOffers;
    }

    public final List<LifestyleOfferCategoryDescriptionApiModel> getTopCategories() {
        return this.topCategories;
    }

    public final List<LifestyleOfferSimpleApiModel> getTopOffers() {
        return this.topOffers;
    }

    public int hashCode() {
        List<LifestyleOfferSimpleApiModel> list = this.topOffers;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LifestyleOfferSimpleApiModel> list2 = this.recommendedOffers;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LifestyleOfferSimpleApiModel> list3 = this.lastMinuteOffers;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<LifestyleOfferCategoryApiModel> list4 = this.allOffersCategories;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<LifestyleOfferCategoryDescriptionApiModel> list5 = this.topCategories;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        List<LifestyleOfferSimpleApiModel> list = this.topOffers;
        List<LifestyleOfferSimpleApiModel> list2 = this.recommendedOffers;
        List<LifestyleOfferSimpleApiModel> list3 = this.lastMinuteOffers;
        List<LifestyleOfferCategoryApiModel> list4 = this.allOffersCategories;
        List<LifestyleOfferCategoryDescriptionApiModel> list5 = this.topCategories;
        return "LifestyleOffersApiModel(topOffers=" + list + ", recommendedOffers=" + list2 + ", lastMinuteOffers=" + list3 + ", allOffersCategories=" + list4 + ", topCategories=" + list5 + ")";
    }
}
