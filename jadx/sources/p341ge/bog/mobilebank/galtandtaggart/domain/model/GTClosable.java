package p341ge.bog.mobilebank.galtandtaggart.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.model.GTClosable */
public final class GTClosable {
    private final String fieldDictionaryKey;
    private final Boolean fieldValue;

    public GTClosable(Boolean bool, String str) {
        this.fieldValue = bool;
        this.fieldDictionaryKey = str;
    }

    public static /* synthetic */ GTClosable copy$default(GTClosable gTClosable, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = gTClosable.fieldValue;
        }
        if ((i & 2) != 0) {
            str = gTClosable.fieldDictionaryKey;
        }
        return gTClosable.copy(bool, str);
    }

    public final Boolean component1() {
        return this.fieldValue;
    }

    public final String component2() {
        return this.fieldDictionaryKey;
    }

    public final GTClosable copy(Boolean bool, String str) {
        return new GTClosable(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTClosable)) {
            return false;
        }
        GTClosable gTClosable = (GTClosable) obj;
        return C41536l.m120484d(this.fieldValue, gTClosable.fieldValue) && C41536l.m120484d(this.fieldDictionaryKey, gTClosable.fieldDictionaryKey);
    }

    public final String getFieldDictionaryKey() {
        return this.fieldDictionaryKey;
    }

    public final Boolean getFieldValue() {
        return this.fieldValue;
    }

    public int hashCode() {
        Boolean bool = this.fieldValue;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.fieldDictionaryKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Boolean bool = this.fieldValue;
        String str = this.fieldDictionaryKey;
        return "GTClosable(fieldValue=" + bool + ", fieldDictionaryKey=" + str + ")";
    }
}
