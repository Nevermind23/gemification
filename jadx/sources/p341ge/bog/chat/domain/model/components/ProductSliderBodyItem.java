package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductSliderBodyItem */
public final class ProductSliderBodyItem {
    @C8664c("is_positive")
    private final boolean isPositive;
    private final String title;

    public ProductSliderBodyItem(String str, boolean z) {
        C41536l.m120489i(str, "title");
        this.title = str;
        this.isPositive = z;
    }

    public static /* synthetic */ ProductSliderBodyItem copy$default(ProductSliderBodyItem productSliderBodyItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSliderBodyItem.title;
        }
        if ((i & 2) != 0) {
            z = productSliderBodyItem.isPositive;
        }
        return productSliderBodyItem.copy(str, z);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component2() {
        return this.isPositive;
    }

    public final ProductSliderBodyItem copy(String str, boolean z) {
        C41536l.m120489i(str, "title");
        return new ProductSliderBodyItem(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSliderBodyItem)) {
            return false;
        }
        ProductSliderBodyItem productSliderBodyItem = (ProductSliderBodyItem) obj;
        return C41536l.m120484d(this.title, productSliderBodyItem.title) && this.isPositive == productSliderBodyItem.isPositive;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        boolean z = this.isPositive;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isPositive() {
        return this.isPositive;
    }

    public String toString() {
        String str = this.title;
        boolean z = this.isPositive;
        return "ProductSliderBodyItem(title=" + str + ", isPositive=" + z + ")";
    }
}
