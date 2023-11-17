package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BplCategopriesWithMerchantsApiEntity */
public final class BplCategopriesWithMerchantsApiEntity {
    @C8664c("categoriesWithMerchants")
    private List<BnplCategoryWithMerchantsApiEntity> categoriesWithMerchants;

    public BplCategopriesWithMerchantsApiEntity(List<BnplCategoryWithMerchantsApiEntity> list) {
        this.categoriesWithMerchants = list;
    }

    public static /* synthetic */ BplCategopriesWithMerchantsApiEntity copy$default(BplCategopriesWithMerchantsApiEntity bplCategopriesWithMerchantsApiEntity, List<BnplCategoryWithMerchantsApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bplCategopriesWithMerchantsApiEntity.categoriesWithMerchants;
        }
        return bplCategopriesWithMerchantsApiEntity.copy(list);
    }

    public final List<BnplCategoryWithMerchantsApiEntity> component1() {
        return this.categoriesWithMerchants;
    }

    public final BplCategopriesWithMerchantsApiEntity copy(List<BnplCategoryWithMerchantsApiEntity> list) {
        return new BplCategopriesWithMerchantsApiEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BplCategopriesWithMerchantsApiEntity) && C41536l.m120484d(this.categoriesWithMerchants, ((BplCategopriesWithMerchantsApiEntity) obj).categoriesWithMerchants);
    }

    public final List<BnplCategoryWithMerchantsApiEntity> getCategoriesWithMerchants() {
        return this.categoriesWithMerchants;
    }

    public int hashCode() {
        List<BnplCategoryWithMerchantsApiEntity> list = this.categoriesWithMerchants;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setCategoriesWithMerchants(List<BnplCategoryWithMerchantsApiEntity> list) {
        this.categoriesWithMerchants = list;
    }

    public String toString() {
        List<BnplCategoryWithMerchantsApiEntity> list = this.categoriesWithMerchants;
        return "BplCategopriesWithMerchantsApiEntity(categoriesWithMerchants=" + list + ")";
    }
}
