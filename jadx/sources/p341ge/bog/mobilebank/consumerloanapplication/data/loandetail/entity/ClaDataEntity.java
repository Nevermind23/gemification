package p341ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.loandetail.entity.ClaDataEntity */
public final class ClaDataEntity {
    private final String productType;
    private final String subProductType;
    private final List<ClaDetailsItemEntity> subProducts;

    public ClaDataEntity(String str, String str2, List<ClaDetailsItemEntity> list) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "subProductType");
        C41536l.m120489i(list, "subProducts");
        this.productType = str;
        this.subProductType = str2;
        this.subProducts = list;
    }

    public static /* synthetic */ ClaDataEntity copy$default(ClaDataEntity claDataEntity, String str, String str2, List<ClaDetailsItemEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claDataEntity.productType;
        }
        if ((i & 2) != 0) {
            str2 = claDataEntity.subProductType;
        }
        if ((i & 4) != 0) {
            list = claDataEntity.subProducts;
        }
        return claDataEntity.copy(str, str2, list);
    }

    public final String component1() {
        return this.productType;
    }

    public final String component2() {
        return this.subProductType;
    }

    public final List<ClaDetailsItemEntity> component3() {
        return this.subProducts;
    }

    public final ClaDataEntity copy(String str, String str2, List<ClaDetailsItemEntity> list) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "subProductType");
        C41536l.m120489i(list, "subProducts");
        return new ClaDataEntity(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaDataEntity)) {
            return false;
        }
        ClaDataEntity claDataEntity = (ClaDataEntity) obj;
        return C41536l.m120484d(this.productType, claDataEntity.productType) && C41536l.m120484d(this.subProductType, claDataEntity.subProductType) && C41536l.m120484d(this.subProducts, claDataEntity.subProducts);
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getSubProductType() {
        return this.subProductType;
    }

    public final List<ClaDetailsItemEntity> getSubProducts() {
        return this.subProducts;
    }

    public int hashCode() {
        return (((this.productType.hashCode() * 31) + this.subProductType.hashCode()) * 31) + this.subProducts.hashCode();
    }

    public String toString() {
        String str = this.productType;
        String str2 = this.subProductType;
        List<ClaDetailsItemEntity> list = this.subProducts;
        return "ClaDataEntity(productType=" + str + ", subProductType=" + str2 + ", subProducts=" + list + ")";
    }
}
