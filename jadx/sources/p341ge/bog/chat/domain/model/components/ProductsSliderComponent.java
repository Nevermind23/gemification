package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductsSliderComponent */
public final class ProductsSliderComponent {
    private final List<ProductSliderBodyItem> body;
    private final ProductSliderHeader header;

    public ProductsSliderComponent(ProductSliderHeader productSliderHeader, List<ProductSliderBodyItem> list) {
        C41536l.m120489i(productSliderHeader, "header");
        C41536l.m120489i(list, "body");
        this.header = productSliderHeader;
        this.body = list;
    }

    public static /* synthetic */ ProductsSliderComponent copy$default(ProductsSliderComponent productsSliderComponent, ProductSliderHeader productSliderHeader, List<ProductSliderBodyItem> list, int i, Object obj) {
        if ((i & 1) != 0) {
            productSliderHeader = productsSliderComponent.header;
        }
        if ((i & 2) != 0) {
            list = productsSliderComponent.body;
        }
        return productsSliderComponent.copy(productSliderHeader, list);
    }

    public final ProductSliderHeader component1() {
        return this.header;
    }

    public final List<ProductSliderBodyItem> component2() {
        return this.body;
    }

    public final ProductsSliderComponent copy(ProductSliderHeader productSliderHeader, List<ProductSliderBodyItem> list) {
        C41536l.m120489i(productSliderHeader, "header");
        C41536l.m120489i(list, "body");
        return new ProductsSliderComponent(productSliderHeader, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductsSliderComponent)) {
            return false;
        }
        ProductsSliderComponent productsSliderComponent = (ProductsSliderComponent) obj;
        return C41536l.m120484d(this.header, productsSliderComponent.header) && C41536l.m120484d(this.body, productsSliderComponent.body);
    }

    public final List<ProductSliderBodyItem> getBody() {
        return this.body;
    }

    public final ProductSliderHeader getHeader() {
        return this.header;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        ProductSliderHeader productSliderHeader = this.header;
        List<ProductSliderBodyItem> list = this.body;
        return "ProductsSliderComponent(header=" + productSliderHeader + ", body=" + list + ")";
    }
}
