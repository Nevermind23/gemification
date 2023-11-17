package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.YesNoApiModel */
public enum YesNoApiModel {
    YES("Y"),
    NO("N");
    
    private final String value;

    private YesNoApiModel(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
