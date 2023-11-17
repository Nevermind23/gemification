package p341ge.bog.mobilebank.cardapplications.data.entity.instantcards;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.instantcards.PointTypeEntity */
public enum PointTypeEntity {
    COUNTRY("COUNTRY"),
    CITY("CITY"),
    ADDRESS("ADDRESS");
    
    private final String value;

    private PointTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
