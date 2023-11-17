package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.PiggyBankPausePeriodEntity */
public final class PiggyBankPausePeriodEntity {
    private final String dictionaryKey;
    private final String dictionaryValue;
    private final String endDate;
    private final String periodType;
    private final String startDate;

    public PiggyBankPausePeriodEntity(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "periodType");
        C41536l.m120489i(str2, "startDate");
        C41536l.m120489i(str3, "endDate");
        this.periodType = str;
        this.startDate = str2;
        this.endDate = str3;
        this.dictionaryKey = str4;
        this.dictionaryValue = str5;
    }

    public static /* synthetic */ PiggyBankPausePeriodEntity copy$default(PiggyBankPausePeriodEntity piggyBankPausePeriodEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = piggyBankPausePeriodEntity.periodType;
        }
        if ((i & 2) != 0) {
            str2 = piggyBankPausePeriodEntity.startDate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = piggyBankPausePeriodEntity.endDate;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = piggyBankPausePeriodEntity.dictionaryKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = piggyBankPausePeriodEntity.dictionaryValue;
        }
        return piggyBankPausePeriodEntity.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.periodType;
    }

    public final String component2() {
        return this.startDate;
    }

    public final String component3() {
        return this.endDate;
    }

    public final String component4() {
        return this.dictionaryKey;
    }

    public final String component5() {
        return this.dictionaryValue;
    }

    public final PiggyBankPausePeriodEntity copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "periodType");
        C41536l.m120489i(str2, "startDate");
        C41536l.m120489i(str3, "endDate");
        return new PiggyBankPausePeriodEntity(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankPausePeriodEntity)) {
            return false;
        }
        PiggyBankPausePeriodEntity piggyBankPausePeriodEntity = (PiggyBankPausePeriodEntity) obj;
        return C41536l.m120484d(this.periodType, piggyBankPausePeriodEntity.periodType) && C41536l.m120484d(this.startDate, piggyBankPausePeriodEntity.startDate) && C41536l.m120484d(this.endDate, piggyBankPausePeriodEntity.endDate) && C41536l.m120484d(this.dictionaryKey, piggyBankPausePeriodEntity.dictionaryKey) && C41536l.m120484d(this.dictionaryValue, piggyBankPausePeriodEntity.dictionaryValue);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int hashCode = ((((this.periodType.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.endDate.hashCode()) * 31;
        String str = this.dictionaryKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dictionaryValue;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.periodType;
        String str2 = this.startDate;
        String str3 = this.endDate;
        String str4 = this.dictionaryKey;
        String str5 = this.dictionaryValue;
        return "PiggyBankPausePeriodEntity(periodType=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ", dictionaryKey=" + str4 + ", dictionaryValue=" + str5 + ")";
    }
}
