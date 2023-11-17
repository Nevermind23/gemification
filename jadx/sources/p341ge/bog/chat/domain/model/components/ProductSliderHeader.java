package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductSliderHeader */
public final class ProductSliderHeader {
    @C8664c("additional_info")
    private final String additionalInfo;
    private final ProductSliderHeaderBadge badge;
    @C8664c("min_amount_title")
    private final String minAmountTitle;
    @C8664c("min_amount_value")
    private final String minAmountValue;
    @C8664c("product_type")
    private final ProductType productType;
    private final String title;

    public ProductSliderHeader(String str, String str2, String str3, String str4, ProductType productType2, ProductSliderHeaderBadge productSliderHeaderBadge) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "minAmountTitle");
        C41536l.m120489i(str3, "minAmountValue");
        this.title = str;
        this.minAmountTitle = str2;
        this.minAmountValue = str3;
        this.additionalInfo = str4;
        this.productType = productType2;
        this.badge = productSliderHeaderBadge;
    }

    public static /* synthetic */ ProductSliderHeader copy$default(ProductSliderHeader productSliderHeader, String str, String str2, String str3, String str4, ProductType productType2, ProductSliderHeaderBadge productSliderHeaderBadge, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSliderHeader.title;
        }
        if ((i & 2) != 0) {
            str2 = productSliderHeader.minAmountTitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = productSliderHeader.minAmountValue;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = productSliderHeader.additionalInfo;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            productType2 = productSliderHeader.productType;
        }
        ProductType productType3 = productType2;
        if ((i & 32) != 0) {
            productSliderHeaderBadge = productSliderHeader.badge;
        }
        return productSliderHeader.copy(str, str5, str6, str7, productType3, productSliderHeaderBadge);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.minAmountTitle;
    }

    public final String component3() {
        return this.minAmountValue;
    }

    public final String component4() {
        return this.additionalInfo;
    }

    public final ProductType component5() {
        return this.productType;
    }

    public final ProductSliderHeaderBadge component6() {
        return this.badge;
    }

    public final ProductSliderHeader copy(String str, String str2, String str3, String str4, ProductType productType2, ProductSliderHeaderBadge productSliderHeaderBadge) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "minAmountTitle");
        C41536l.m120489i(str3, "minAmountValue");
        return new ProductSliderHeader(str, str2, str3, str4, productType2, productSliderHeaderBadge);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSliderHeader)) {
            return false;
        }
        ProductSliderHeader productSliderHeader = (ProductSliderHeader) obj;
        return C41536l.m120484d(this.title, productSliderHeader.title) && C41536l.m120484d(this.minAmountTitle, productSliderHeader.minAmountTitle) && C41536l.m120484d(this.minAmountValue, productSliderHeader.minAmountValue) && C41536l.m120484d(this.additionalInfo, productSliderHeader.additionalInfo) && this.productType == productSliderHeader.productType && C41536l.m120484d(this.badge, productSliderHeader.badge);
    }

    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final ProductSliderHeaderBadge getBadge() {
        return this.badge;
    }

    public final String getMinAmountTitle() {
        return this.minAmountTitle;
    }

    public final String getMinAmountValue() {
        return this.minAmountValue;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.minAmountTitle.hashCode()) * 31) + this.minAmountValue.hashCode()) * 31;
        String str = this.additionalInfo;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProductType productType2 = this.productType;
        int hashCode3 = (hashCode2 + (productType2 == null ? 0 : productType2.hashCode())) * 31;
        ProductSliderHeaderBadge productSliderHeaderBadge = this.badge;
        if (productSliderHeaderBadge != null) {
            i = productSliderHeaderBadge.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.minAmountTitle;
        String str3 = this.minAmountValue;
        String str4 = this.additionalInfo;
        ProductType productType2 = this.productType;
        ProductSliderHeaderBadge productSliderHeaderBadge = this.badge;
        return "ProductSliderHeader(title=" + str + ", minAmountTitle=" + str2 + ", minAmountValue=" + str3 + ", additionalInfo=" + str4 + ", productType=" + productType2 + ", badge=" + productSliderHeaderBadge + ")";
    }
}
