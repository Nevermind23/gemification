package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity */
public final class ProductTypeApiEntity {
    private final String clientKey;
    private final String product;
    private final String status;

    public ProductTypeApiEntity() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductTypeApiEntity copy$default(ProductTypeApiEntity productTypeApiEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productTypeApiEntity.clientKey;
        }
        if ((i & 2) != 0) {
            str2 = productTypeApiEntity.product;
        }
        if ((i & 4) != 0) {
            str3 = productTypeApiEntity.status;
        }
        return productTypeApiEntity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.product;
    }

    public final String component3() {
        return this.status;
    }

    public final ProductTypeApiEntity copy(String str, String str2, String str3) {
        return new ProductTypeApiEntity(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTypeApiEntity)) {
            return false;
        }
        ProductTypeApiEntity productTypeApiEntity = (ProductTypeApiEntity) obj;
        return C41536l.m120484d(this.clientKey, productTypeApiEntity.clientKey) && C41536l.m120484d(this.product, productTypeApiEntity.product) && C41536l.m120484d(this.status, productTypeApiEntity.status);
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.clientKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.clientKey;
        String str2 = this.product;
        String str3 = this.status;
        return "ProductTypeApiEntity(clientKey=" + str + ", product=" + str2 + ", status=" + str3 + ")";
    }

    public ProductTypeApiEntity(String str, String str2, String str3) {
        this.clientKey = str;
        this.product = str2;
        this.status = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductTypeApiEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
