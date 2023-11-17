package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.ProductTypeApiModel */
public final class ProductTypeApiModel {
    private final String clientKey;
    private final String product;
    private final String status;

    public ProductTypeApiModel(String str, String str2, String str3) {
        C41536l.m120489i(str2, "product");
        this.clientKey = str;
        this.product = str2;
        this.status = str3;
    }

    public static /* synthetic */ ProductTypeApiModel copy$default(ProductTypeApiModel productTypeApiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productTypeApiModel.clientKey;
        }
        if ((i & 2) != 0) {
            str2 = productTypeApiModel.product;
        }
        if ((i & 4) != 0) {
            str3 = productTypeApiModel.status;
        }
        return productTypeApiModel.copy(str, str2, str3);
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

    public final ProductTypeApiModel copy(String str, String str2, String str3) {
        C41536l.m120489i(str2, "product");
        return new ProductTypeApiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTypeApiModel)) {
            return false;
        }
        ProductTypeApiModel productTypeApiModel = (ProductTypeApiModel) obj;
        return C41536l.m120484d(this.clientKey, productTypeApiModel.clientKey) && C41536l.m120484d(this.product, productTypeApiModel.product) && C41536l.m120484d(this.status, productTypeApiModel.status);
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
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.product.hashCode()) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.clientKey;
        String str2 = this.product;
        String str3 = this.status;
        return "ProductTypeApiModel(clientKey=" + str + ", product=" + str2 + ", status=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductTypeApiModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3);
    }
}
