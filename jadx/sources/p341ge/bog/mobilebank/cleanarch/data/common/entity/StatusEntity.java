package p341ge.bog.mobilebank.cleanarch.data.common.entity;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.model.PensionStatusResult;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity */
public enum StatusEntity {
    ACTIVE(PensionStatusResult.STATUS_ACTIVE),
    INACTIVE(PensionStatusResult.STATUS_INACTIVE);
    
    private final String value;

    private StatusEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
