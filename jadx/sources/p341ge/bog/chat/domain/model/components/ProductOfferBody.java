package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductOfferBody */
public final class ProductOfferBody {
    @C8664c("is_colored")
    private final Boolean isColored;
    private final String title;
    private final String value;

    public ProductOfferBody(String str, String str2, Boolean bool) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        this.title = str;
        this.value = str2;
        this.isColored = bool;
    }

    public static /* synthetic */ ProductOfferBody copy$default(ProductOfferBody productOfferBody, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productOfferBody.title;
        }
        if ((i & 2) != 0) {
            str2 = productOfferBody.value;
        }
        if ((i & 4) != 0) {
            bool = productOfferBody.isColored;
        }
        return productOfferBody.copy(str, str2, bool);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final Boolean component3() {
        return this.isColored;
    }

    public final ProductOfferBody copy(String str, String str2, Boolean bool) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, C11755a.C11756a.f34100b);
        return new ProductOfferBody(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOfferBody)) {
            return false;
        }
        ProductOfferBody productOfferBody = (ProductOfferBody) obj;
        return C41536l.m120484d(this.title, productOfferBody.title) && C41536l.m120484d(this.value, productOfferBody.value) && C41536l.m120484d(this.isColored, productOfferBody.isColored);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.value.hashCode()) * 31;
        Boolean bool = this.isColored;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isColored() {
        return this.isColored;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.value;
        Boolean bool = this.isColored;
        return "ProductOfferBody(title=" + str + ", value=" + str2 + ", isColored=" + bool + ")";
    }
}
