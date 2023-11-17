package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.ProductSliderHeaderBadge */
public final class ProductSliderHeaderBadge {
    @C8664c("left_text")
    private final String leftText;
    @C8664c("middle_text")
    private final String middleText;
    @C8664c("right_text")
    private final String rightText;

    public ProductSliderHeaderBadge(String str, String str2, String str3) {
        this.leftText = str;
        this.middleText = str2;
        this.rightText = str3;
    }

    public static /* synthetic */ ProductSliderHeaderBadge copy$default(ProductSliderHeaderBadge productSliderHeaderBadge, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSliderHeaderBadge.leftText;
        }
        if ((i & 2) != 0) {
            str2 = productSliderHeaderBadge.middleText;
        }
        if ((i & 4) != 0) {
            str3 = productSliderHeaderBadge.rightText;
        }
        return productSliderHeaderBadge.copy(str, str2, str3);
    }

    public final String component1() {
        return this.leftText;
    }

    public final String component2() {
        return this.middleText;
    }

    public final String component3() {
        return this.rightText;
    }

    public final ProductSliderHeaderBadge copy(String str, String str2, String str3) {
        return new ProductSliderHeaderBadge(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSliderHeaderBadge)) {
            return false;
        }
        ProductSliderHeaderBadge productSliderHeaderBadge = (ProductSliderHeaderBadge) obj;
        return C41536l.m120484d(this.leftText, productSliderHeaderBadge.leftText) && C41536l.m120484d(this.middleText, productSliderHeaderBadge.middleText) && C41536l.m120484d(this.rightText, productSliderHeaderBadge.rightText);
    }

    public final String getLeftText() {
        return this.leftText;
    }

    public final String getMiddleText() {
        return this.middleText;
    }

    public final String getRightText() {
        return this.rightText;
    }

    public int hashCode() {
        String str = this.leftText;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightText;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.leftText;
        String str2 = this.middleText;
        String str3 = this.rightText;
        return "ProductSliderHeaderBadge(leftText=" + str + ", middleText=" + str2 + ", rightText=" + str3 + ")";
    }
}
