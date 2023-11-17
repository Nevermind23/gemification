package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.MarketStatus */
public enum MarketStatus {
    OPEN("OPEN"),
    NOT_OPENED_YET("NOT_OPENED_YET"),
    CLOSED(ProductType.PRODUCT_STATUS_CLOSED);
    
    private final String value;

    private MarketStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
