package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductOfferComponent */
public final class ProductOfferComponent extends Component {
    private final List<ProductOfferBody> body;
    private final ProductOfferHeader header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductOfferComponent(ProductOfferHeader productOfferHeader, List<ProductOfferBody> list) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(productOfferHeader, "header");
        C41536l.m120489i(list, "body");
        this.header = productOfferHeader;
        this.body = list;
    }

    public static /* synthetic */ ProductOfferComponent copy$default(ProductOfferComponent productOfferComponent, ProductOfferHeader productOfferHeader, List<ProductOfferBody> list, int i, Object obj) {
        if ((i & 1) != 0) {
            productOfferHeader = productOfferComponent.header;
        }
        if ((i & 2) != 0) {
            list = productOfferComponent.body;
        }
        return productOfferComponent.copy(productOfferHeader, list);
    }

    public final ProductOfferHeader component1() {
        return this.header;
    }

    public final List<ProductOfferBody> component2() {
        return this.body;
    }

    public final ProductOfferComponent copy(ProductOfferHeader productOfferHeader, List<ProductOfferBody> list) {
        C41536l.m120489i(productOfferHeader, "header");
        C41536l.m120489i(list, "body");
        return new ProductOfferComponent(productOfferHeader, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOfferComponent)) {
            return false;
        }
        ProductOfferComponent productOfferComponent = (ProductOfferComponent) obj;
        return C41536l.m120484d(this.header, productOfferComponent.header) && C41536l.m120484d(this.body, productOfferComponent.body);
    }

    public final List<ProductOfferBody> getBody() {
        return this.body;
    }

    public final ProductOfferHeader getHeader() {
        return this.header;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        ProductOfferHeader productOfferHeader = this.header;
        List<ProductOfferBody> list = this.body;
        return "ProductOfferComponent(header=" + productOfferHeader + ", body=" + list + ")";
    }
}
