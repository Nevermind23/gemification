package p341ge.bog.mobilebank.cleanarch.data.savinggoal.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.savinggoal.entity.DepositPurposeApiEntity */
public final class DepositPurposeApiEntity {
    private final String dictionaryKey;
    private final long dictionaryKeyId;
    private final String dictionaryValue;

    /* renamed from: id */
    private final Long f56457id;
    private final String lookupName;
    private final String lookupValue;
    private final int orderNumber;
    private final long savingGoalId;

    public DepositPurposeApiEntity(Long l, long j, String str, String str2, long j2, int i, String str3, String str4) {
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        C41536l.m120489i(str4, "dictionaryValue");
        this.f56457id = l;
        this.savingGoalId = j;
        this.lookupName = str;
        this.lookupValue = str2;
        this.dictionaryKeyId = j2;
        this.orderNumber = i;
        this.dictionaryKey = str3;
        this.dictionaryValue = str4;
    }

    public static /* synthetic */ DepositPurposeApiEntity copy$default(DepositPurposeApiEntity depositPurposeApiEntity, Long l, long j, String str, String str2, long j2, int i, String str3, String str4, int i2, Object obj) {
        DepositPurposeApiEntity depositPurposeApiEntity2 = depositPurposeApiEntity;
        int i3 = i2;
        return depositPurposeApiEntity.copy((i3 & 1) != 0 ? depositPurposeApiEntity2.f56457id : l, (i3 & 2) != 0 ? depositPurposeApiEntity2.savingGoalId : j, (i3 & 4) != 0 ? depositPurposeApiEntity2.lookupName : str, (i3 & 8) != 0 ? depositPurposeApiEntity2.lookupValue : str2, (i3 & 16) != 0 ? depositPurposeApiEntity2.dictionaryKeyId : j2, (i3 & 32) != 0 ? depositPurposeApiEntity2.orderNumber : i, (i3 & 64) != 0 ? depositPurposeApiEntity2.dictionaryKey : str3, (i3 & 128) != 0 ? depositPurposeApiEntity2.dictionaryValue : str4);
    }

    public final Long component1() {
        return this.f56457id;
    }

    public final long component2() {
        return this.savingGoalId;
    }

    public final String component3() {
        return this.lookupName;
    }

    public final String component4() {
        return this.lookupValue;
    }

    public final long component5() {
        return this.dictionaryKeyId;
    }

    public final int component6() {
        return this.orderNumber;
    }

    public final String component7() {
        return this.dictionaryKey;
    }

    public final String component8() {
        return this.dictionaryValue;
    }

    public final DepositPurposeApiEntity copy(Long l, long j, String str, String str2, long j2, int i, String str3, String str4) {
        String str5 = str;
        C41536l.m120489i(str5, "lookupName");
        String str6 = str2;
        C41536l.m120489i(str6, "lookupValue");
        String str7 = str3;
        C41536l.m120489i(str7, "dictionaryKey");
        String str8 = str4;
        C41536l.m120489i(str8, "dictionaryValue");
        return new DepositPurposeApiEntity(l, j, str5, str6, j2, i, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositPurposeApiEntity)) {
            return false;
        }
        DepositPurposeApiEntity depositPurposeApiEntity = (DepositPurposeApiEntity) obj;
        return C41536l.m120484d(this.f56457id, depositPurposeApiEntity.f56457id) && this.savingGoalId == depositPurposeApiEntity.savingGoalId && C41536l.m120484d(this.lookupName, depositPurposeApiEntity.lookupName) && C41536l.m120484d(this.lookupValue, depositPurposeApiEntity.lookupValue) && this.dictionaryKeyId == depositPurposeApiEntity.dictionaryKeyId && this.orderNumber == depositPurposeApiEntity.orderNumber && C41536l.m120484d(this.dictionaryKey, depositPurposeApiEntity.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, depositPurposeApiEntity.dictionaryValue);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final long getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final Long getId() {
        return this.f56457id;
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

    public final long getSavingGoalId() {
        return this.savingGoalId;
    }

    public int hashCode() {
        Long l = this.f56457id;
        return ((((((((((((((l == null ? 0 : l.hashCode()) * 31) + C7397t.m28148a(this.savingGoalId)) * 31) + this.lookupName.hashCode()) * 31) + this.lookupValue.hashCode()) * 31) + C7397t.m28148a(this.dictionaryKeyId)) * 31) + this.orderNumber) * 31) + this.dictionaryKey.hashCode()) * 31) + this.dictionaryValue.hashCode();
    }

    public String toString() {
        Long l = this.f56457id;
        long j = this.savingGoalId;
        String str = this.lookupName;
        String str2 = this.lookupValue;
        long j2 = this.dictionaryKeyId;
        int i = this.orderNumber;
        String str3 = this.dictionaryKey;
        String str4 = this.dictionaryValue;
        return "DepositPurposeApiEntity(id=" + l + ", savingGoalId=" + j + ", lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKeyId=" + j2 + ", orderNumber=" + i + ", dictionaryKey=" + str3 + ", dictionaryValue=" + str4 + ")";
    }
}
