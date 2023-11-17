package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductOfferHeader */
public final class ProductOfferHeader {
    @C8664c("product_type")
    private final ProductType productType;
    private final String status;
    private final String title;
    private final String type;

    public ProductOfferHeader(String str, String str2, String str3, ProductType productType2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "status");
        this.title = str;
        this.type = str2;
        this.status = str3;
        this.productType = productType2;
    }

    public static /* synthetic */ ProductOfferHeader copy$default(ProductOfferHeader productOfferHeader, String str, String str2, String str3, ProductType productType2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productOfferHeader.title;
        }
        if ((i & 2) != 0) {
            str2 = productOfferHeader.type;
        }
        if ((i & 4) != 0) {
            str3 = productOfferHeader.status;
        }
        if ((i & 8) != 0) {
            productType2 = productOfferHeader.productType;
        }
        return productOfferHeader.copy(str, str2, str3, productType2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.status;
    }

    public final ProductType component4() {
        return this.productType;
    }

    public final ProductOfferHeader copy(String str, String str2, String str3, ProductType productType2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "status");
        return new ProductOfferHeader(str, str2, str3, productType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOfferHeader)) {
            return false;
        }
        ProductOfferHeader productOfferHeader = (ProductOfferHeader) obj;
        return C41536l.m120484d(this.title, productOfferHeader.title) && C41536l.m120484d(this.type, productOfferHeader.type) && C41536l.m120484d(this.status, productOfferHeader.status) && this.productType == productOfferHeader.productType;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31;
        ProductType productType2 = this.productType;
        return hashCode + (productType2 == null ? 0 : productType2.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.type;
        String str3 = this.status;
        ProductType productType2 = this.productType;
        return "ProductOfferHeader(title=" + str + ", type=" + str2 + ", status=" + str3 + ", productType=" + productType2 + ")";
    }
}
