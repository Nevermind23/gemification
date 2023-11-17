package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity */
public enum CollectionTypeEntity {
    DEPOSIT("DEPOSIT"),
    BOND("BOND");
    
    private final String value;

    private CollectionTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
