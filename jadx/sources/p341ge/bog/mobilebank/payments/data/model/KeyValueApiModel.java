package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.KeyValueApiModel */
public final class KeyValueApiModel {
    private final String key;
    private final String value;

    public KeyValueApiModel(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ KeyValueApiModel copy$default(KeyValueApiModel keyValueApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyValueApiModel.key;
        }
        if ((i & 2) != 0) {
            str2 = keyValueApiModel.value;
        }
        return keyValueApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final KeyValueApiModel copy(String str, String str2) {
        return new KeyValueApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyValueApiModel)) {
            return false;
        }
        KeyValueApiModel keyValueApiModel = (KeyValueApiModel) obj;
        return C41536l.m120484d(this.key, keyValueApiModel.key) && C41536l.m120484d(this.value, keyValueApiModel.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        return "KeyValueApiModel(key=" + str + ", value=" + str2 + ")";
    }
}
