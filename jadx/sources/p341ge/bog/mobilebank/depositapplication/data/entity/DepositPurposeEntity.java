package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.DepositPurposeEntity */
public final class DepositPurposeEntity {
    private final String dictionaryKey;
    private final Long dictionaryKeyId;
    private final String iconUrl;

    /* renamed from: id */
    private final long f60097id;
    private final String lookupName;
    private final String lookupValue;
    private final Long orderNumber;

    public DepositPurposeEntity(long j, String str, String str2, String str3, Long l, Long l2, String str4) {
        C41536l.m120489i(str3, "lookupValue");
        C41536l.m120489i(str4, "dictionaryKey");
        this.f60097id = j;
        this.iconUrl = str;
        this.lookupName = str2;
        this.lookupValue = str3;
        this.dictionaryKeyId = l;
        this.orderNumber = l2;
        this.dictionaryKey = str4;
    }

    public static /* synthetic */ DepositPurposeEntity copy$default(DepositPurposeEntity depositPurposeEntity, long j, String str, String str2, String str3, Long l, Long l2, String str4, int i, Object obj) {
        DepositPurposeEntity depositPurposeEntity2 = depositPurposeEntity;
        return depositPurposeEntity.copy((i & 1) != 0 ? depositPurposeEntity2.f60097id : j, (i & 2) != 0 ? depositPurposeEntity2.iconUrl : str, (i & 4) != 0 ? depositPurposeEntity2.lookupName : str2, (i & 8) != 0 ? depositPurposeEntity2.lookupValue : str3, (i & 16) != 0 ? depositPurposeEntity2.dictionaryKeyId : l, (i & 32) != 0 ? depositPurposeEntity2.orderNumber : l2, (i & 64) != 0 ? depositPurposeEntity2.dictionaryKey : str4);
    }

    public final long component1() {
        return this.f60097id;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.lookupName;
    }

    public final String component4() {
        return this.lookupValue;
    }

    public final Long component5() {
        return this.dictionaryKeyId;
    }

    public final Long component6() {
        return this.orderNumber;
    }

    public final String component7() {
        return this.dictionaryKey;
    }

    public final DepositPurposeEntity copy(long j, String str, String str2, String str3, Long l, Long l2, String str4) {
        C41536l.m120489i(str3, "lookupValue");
        String str5 = str4;
        C41536l.m120489i(str5, "dictionaryKey");
        return new DepositPurposeEntity(j, str, str2, str3, l, l2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositPurposeEntity)) {
            return false;
        }
        DepositPurposeEntity depositPurposeEntity = (DepositPurposeEntity) obj;
        return this.f60097id == depositPurposeEntity.f60097id && C41536l.m120484d(this.iconUrl, depositPurposeEntity.iconUrl) && C41536l.m120484d(this.lookupName, depositPurposeEntity.lookupName) && C41536l.m120484d(this.lookupValue, depositPurposeEntity.lookupValue) && C41536l.m120484d(this.dictionaryKeyId, depositPurposeEntity.dictionaryKeyId) && C41536l.m120484d(this.orderNumber, depositPurposeEntity.orderNumber) && C41536l.m120484d(this.dictionaryKey, depositPurposeEntity.dictionaryKey);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Long getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final long getId() {
        return this.f60097id;
    }

    public final String getLookupName() {
        return this.lookupName;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public final Long getOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f60097id) * 31;
        String str = this.iconUrl;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lookupName;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.lookupValue.hashCode()) * 31;
        Long l = this.dictionaryKeyId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.orderNumber;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        long j = this.f60097id;
        String str = this.iconUrl;
        String str2 = this.lookupName;
        String str3 = this.lookupValue;
        Long l = this.dictionaryKeyId;
        Long l2 = this.orderNumber;
        String str4 = this.dictionaryKey;
        return "DepositPurposeEntity(id=" + j + ", iconUrl=" + str + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", dictionaryKeyId=" + l + ", orderNumber=" + l2 + ", dictionaryKey=" + str4 + ")";
    }
}
