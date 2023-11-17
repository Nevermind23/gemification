package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.DepositFeatureEntity */
public final class DepositFeatureEntity {
    private final String dictionaryKey;
    private final String lookupName;
    private final String lookupValue;

    public DepositFeatureEntity(String str, String str2, String str3) {
        this.lookupName = str;
        this.lookupValue = str2;
        this.dictionaryKey = str3;
    }

    public static /* synthetic */ DepositFeatureEntity copy$default(DepositFeatureEntity depositFeatureEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositFeatureEntity.lookupName;
        }
        if ((i & 2) != 0) {
            str2 = depositFeatureEntity.lookupValue;
        }
        if ((i & 4) != 0) {
            str3 = depositFeatureEntity.dictionaryKey;
        }
        return depositFeatureEntity.copy(str, str2, str3);
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

    public final DepositFeatureEntity copy(String str, String str2, String str3) {
        return new DepositFeatureEntity(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositFeatureEntity)) {
            return false;
        }
        DepositFeatureEntity depositFeatureEntity = (DepositFeatureEntity) obj;
        return C41536l.m120484d(this.lookupName, depositFeatureEntity.lookupName) && C41536l.m120484d(this.lookupValue, depositFeatureEntity.lookupValue) && C41536l.m120484d(this.dictionaryKey, depositFeatureEntity.dictionaryKey);
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

    public int hashCode() {
        String str = this.lookupName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lookupValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dictionaryKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.lookupName;
        String str2 = this.lookupValue;
        String str3 = this.dictionaryKey;
        return "DepositFeatureEntity(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ")";
    }
}
