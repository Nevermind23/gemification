package p341ge.bog.mobilebank.model;

import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.KeyValue */
public class KeyValue {
    @C8664c("key")
    String key;
    @C8664c("value")
    String value;

    public KeyValue() {
    }

    public KeyValue copy() {
        return new KeyValue(this.key, this.value);
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "KeyValue{key='" + this.key + '\'' + ", value='" + this.value + '\'' + '}';
    }

    public KeyValue(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
