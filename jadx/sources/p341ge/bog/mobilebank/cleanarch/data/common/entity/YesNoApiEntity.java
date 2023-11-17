package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity */
public enum YesNoApiEntity {
    YES("Y"),
    NO("N");
    
    private final String value;

    private YesNoApiEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
