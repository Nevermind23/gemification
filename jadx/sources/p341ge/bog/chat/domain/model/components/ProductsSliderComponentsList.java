package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductsSliderComponentsList */
public final class ProductsSliderComponentsList extends Component {
    private final List<ProductsSliderComponent> products;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductsSliderComponentsList(List<ProductsSliderComponent> list) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(list, "products");
        this.products = list;
    }

    public static /* synthetic */ ProductsSliderComponentsList copy$default(ProductsSliderComponentsList productsSliderComponentsList, List<ProductsSliderComponent> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productsSliderComponentsList.products;
        }
        return productsSliderComponentsList.copy(list);
    }

    public final List<ProductsSliderComponent> component1() {
        return this.products;
    }

    public final ProductsSliderComponentsList copy(List<ProductsSliderComponent> list) {
        C41536l.m120489i(list, "products");
        return new ProductsSliderComponentsList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductsSliderComponentsList) && C41536l.m120484d(this.products, ((ProductsSliderComponentsList) obj).products);
    }

    public final List<ProductsSliderComponent> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode();
    }

    public String toString() {
        List<ProductsSliderComponent> list = this.products;
        return "ProductsSliderComponentsList(products=" + list + ")";
    }
}
