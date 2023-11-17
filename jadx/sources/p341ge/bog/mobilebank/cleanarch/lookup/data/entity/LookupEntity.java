package p341ge.bog.mobilebank.cleanarch.lookup.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity */
public final class LookupEntity {
    private final String dictionaryKey;
    private final String lookupName;
    private final String lookupValue;
    private final int orderNumber;

    public LookupEntity(String str, String str2, String str3, int i) {
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        this.lookupName = str;
        this.lookupValue = str2;
        this.dictionaryKey = str3;
        this.orderNumber = i;
    }

    public static /* synthetic */ LookupEntity copy$default(LookupEntity lookupEntity, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lookupEntity.lookupName;
        }
        if ((i2 & 2) != 0) {
            str2 = lookupEntity.lookupValue;
        }
        if ((i2 & 4) != 0) {
            str3 = lookupEntity.dictionaryKey;
        }
        if ((i2 & 8) != 0) {
            i = lookupEntity.orderNumber;
        }
        return lookupEntity.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.lookupName;
    }

    public final String component2() {
        return this.lookupValue;
    }

    public final String component3() {
        return this.dictionaryKey;
    }

    public final int component4() {
        return this.orderNumber;
    }

    public final LookupEntity copy(String str, String str2, String str3, int i) {
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        return new LookupEntity(str, str2, str3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookupEntity)) {
            return false;
        }
        LookupEntity lookupEntity = (LookupEntity) obj;
        return C41536l.m120484d(this.lookupName, lookupEntity.lookupName) && C41536l.m120484d(this.lookupValue, lookupEntity.lookupValue) && C41536l.m120484d(this.dictionaryKey, lookupEntity.dictionaryKey) && this.orderNumber == lookupEntity.orderNumber;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getLookupName() {
        return this.lookupName;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public final int getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        return (((((this.lookupName.hashCode() * 31) + this.lookupValue.hashCode()) * 31) + this.dictionaryKey.hashCode()) * 31) + this.orderNumber;
    }

    public String toString() {
        String str = this.lookupName;
        String str2 = this.lookupValue;
        String str3 = this.dictionaryKey;
        int i = this.orderNumber;
        return "LookupEntity(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ", orderNumber=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LookupEntity(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i);
    }
}
