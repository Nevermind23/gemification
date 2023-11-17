package p341ge.bog.mobilebank.deposits.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeEntity */
public final class DepositSavingGoalPurposeEntity {
    private final String dictionaryKey;
    private final String dictionaryKeyId;
    private final String dictionaryValue;
    private final String dictionaryValueEn;
    private final String iconUrl;

    /* renamed from: id */
    private final Long f60514id;
    private final String lookupName;
    private final String lookupValue;
    private final long savingGoalId;

    public DepositSavingGoalPurposeEntity(String str, long j, Long l, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str2, "lookupName");
        C41536l.m120489i(str3, "lookupValue");
        C41536l.m120489i(str4, "dictionaryKeyId");
        C41536l.m120489i(str5, "dictionaryKey");
        C41536l.m120489i(str6, "dictionaryValue");
        C41536l.m120489i(str7, "dictionaryValueEn");
        this.iconUrl = str;
        this.savingGoalId = j;
        this.f60514id = l;
        this.lookupName = str2;
        this.lookupValue = str3;
        this.dictionaryKeyId = str4;
        this.dictionaryKey = str5;
        this.dictionaryValue = str6;
        this.dictionaryValueEn = str7;
    }

    public static /* synthetic */ DepositSavingGoalPurposeEntity copy$default(DepositSavingGoalPurposeEntity depositSavingGoalPurposeEntity, String str, long j, Long l, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        DepositSavingGoalPurposeEntity depositSavingGoalPurposeEntity2 = depositSavingGoalPurposeEntity;
        int i2 = i;
        return depositSavingGoalPurposeEntity.copy((i2 & 1) != 0 ? depositSavingGoalPurposeEntity2.iconUrl : str, (i2 & 2) != 0 ? depositSavingGoalPurposeEntity2.savingGoalId : j, (i2 & 4) != 0 ? depositSavingGoalPurposeEntity2.f60514id : l, (i2 & 8) != 0 ? depositSavingGoalPurposeEntity2.lookupName : str2, (i2 & 16) != 0 ? depositSavingGoalPurposeEntity2.lookupValue : str3, (i2 & 32) != 0 ? depositSavingGoalPurposeEntity2.dictionaryKeyId : str4, (i2 & 64) != 0 ? depositSavingGoalPurposeEntity2.dictionaryKey : str5, (i2 & 128) != 0 ? depositSavingGoalPurposeEntity2.dictionaryValue : str6, (i2 & C11398b.f33139r) != 0 ? depositSavingGoalPurposeEntity2.dictionaryValueEn : str7);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final long component2() {
        return this.savingGoalId;
    }

    public final Long component3() {
        return this.f60514id;
    }

    public final String component4() {
        return this.lookupName;
    }

    public final String component5() {
        return this.lookupValue;
    }

    public final String component6() {
        return this.dictionaryKeyId;
    }

    public final String component7() {
        return this.dictionaryKey;
    }

    public final String component8() {
        return this.dictionaryValue;
    }

    public final String component9() {
        return this.dictionaryValueEn;
    }

    public final DepositSavingGoalPurposeEntity copy(String str, long j, Long l, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str2;
        C41536l.m120489i(str8, "lookupName");
        String str9 = str3;
        C41536l.m120489i(str9, "lookupValue");
        String str10 = str4;
        C41536l.m120489i(str10, "dictionaryKeyId");
        String str11 = str5;
        C41536l.m120489i(str11, "dictionaryKey");
        String str12 = str6;
        C41536l.m120489i(str12, "dictionaryValue");
        String str13 = str7;
        C41536l.m120489i(str13, "dictionaryValueEn");
        return new DepositSavingGoalPurposeEntity(str, j, l, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositSavingGoalPurposeEntity)) {
            return false;
        }
        DepositSavingGoalPurposeEntity depositSavingGoalPurposeEntity = (DepositSavingGoalPurposeEntity) obj;
        return C41536l.m120484d(this.iconUrl, depositSavingGoalPurposeEntity.iconUrl) && this.savingGoalId == depositSavingGoalPurposeEntity.savingGoalId && C41536l.m120484d(this.f60514id, depositSavingGoalPurposeEntity.f60514id) && C41536l.m120484d(this.lookupName, depositSavingGoalPurposeEntity.lookupName) && C41536l.m120484d(this.lookupValue, depositSavingGoalPurposeEntity.lookupValue) && C41536l.m120484d(this.dictionaryKeyId, depositSavingGoalPurposeEntity.dictionaryKeyId) && C41536l.m120484d(this.dictionaryKey, depositSavingGoalPurposeEntity.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, depositSavingGoalPurposeEntity.dictionaryValue) && C41536l.m120484d(this.dictionaryValueEn, depositSavingGoalPurposeEntity.dictionaryValueEn);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final String getDictionaryValueEn() {
        return this.dictionaryValueEn;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Long getId() {
        return this.f60514id;
    }

    public final String getLookupName() {
        return this.lookupName;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public final long getSavingGoalId() {
        return this.savingGoalId;
    }

    public int hashCode() {
        String str = this.iconUrl;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + C7397t.m28148a(this.savingGoalId)) * 31;
        Long l = this.f60514id;
        if (l != null) {
            i = l.hashCode();
        }
        return ((((((((((((hashCode + i) * 31) + this.lookupName.hashCode()) * 31) + this.lookupValue.hashCode()) * 31) + this.dictionaryKeyId.hashCode()) * 31) + this.dictionaryKey.hashCode()) * 31) + this.dictionaryValue.hashCode()) * 31) + this.dictionaryValueEn.hashCode();
    }

    public String toString() {
        String str = this.iconUrl;
        long j = this.savingGoalId;
        Long l = this.f60514id;
        String str2 = this.lookupName;
        String str3 = this.lookupValue;
        String str4 = this.dictionaryKeyId;
        String str5 = this.dictionaryKey;
        String str6 = this.dictionaryValue;
        String str7 = this.dictionaryValueEn;
        return "DepositSavingGoalPurposeEntity(iconUrl=" + str + ", savingGoalId=" + j + ", id=" + l + ", lookupName=" + str2 + ", lookupValue=" + str3 + ", dictionaryKeyId=" + str4 + ", dictionaryKey=" + str5 + ", dictionaryValue=" + str6 + ", dictionaryValueEn=" + str7 + ")";
    }
}
