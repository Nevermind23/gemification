package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.OfferedPlanTypesEntity */
public final class OfferedPlanTypesEntity {
    private final String planType;
    private final String planTypeDescDictionaryKey;
    private final String planTypeDescDictionaryKeyValue;
    private final String planTypeDictionaryKey;
    private final String planTypeDictionaryKeyValue;

    public OfferedPlanTypesEntity(String str, String str2, String str3, String str4, String str5) {
        this.planTypeDictionaryKey = str;
        this.planType = str2;
        this.planTypeDictionaryKeyValue = str3;
        this.planTypeDescDictionaryKey = str4;
        this.planTypeDescDictionaryKeyValue = str5;
    }

    public static /* synthetic */ OfferedPlanTypesEntity copy$default(OfferedPlanTypesEntity offeredPlanTypesEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offeredPlanTypesEntity.planTypeDictionaryKey;
        }
        if ((i & 2) != 0) {
            str2 = offeredPlanTypesEntity.planType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = offeredPlanTypesEntity.planTypeDictionaryKeyValue;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = offeredPlanTypesEntity.planTypeDescDictionaryKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = offeredPlanTypesEntity.planTypeDescDictionaryKeyValue;
        }
        return offeredPlanTypesEntity.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.planTypeDictionaryKey;
    }

    public final String component2() {
        return this.planType;
    }

    public final String component3() {
        return this.planTypeDictionaryKeyValue;
    }

    public final String component4() {
        return this.planTypeDescDictionaryKey;
    }

    public final String component5() {
        return this.planTypeDescDictionaryKeyValue;
    }

    public final OfferedPlanTypesEntity copy(String str, String str2, String str3, String str4, String str5) {
        return new OfferedPlanTypesEntity(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferedPlanTypesEntity)) {
            return false;
        }
        OfferedPlanTypesEntity offeredPlanTypesEntity = (OfferedPlanTypesEntity) obj;
        return C41536l.m120484d(this.planTypeDictionaryKey, offeredPlanTypesEntity.planTypeDictionaryKey) && C41536l.m120484d(this.planType, offeredPlanTypesEntity.planType) && C41536l.m120484d(this.planTypeDictionaryKeyValue, offeredPlanTypesEntity.planTypeDictionaryKeyValue) && C41536l.m120484d(this.planTypeDescDictionaryKey, offeredPlanTypesEntity.planTypeDescDictionaryKey) && C41536l.m120484d(this.planTypeDescDictionaryKeyValue, offeredPlanTypesEntity.planTypeDescDictionaryKeyValue);
    }

    public final String getPlanType() {
        return this.planType;
    }

    public final String getPlanTypeDescDictionaryKey() {
        return this.planTypeDescDictionaryKey;
    }

    public final String getPlanTypeDescDictionaryKeyValue() {
        return this.planTypeDescDictionaryKeyValue;
    }

    public final String getPlanTypeDictionaryKey() {
        return this.planTypeDictionaryKey;
    }

    public final String getPlanTypeDictionaryKeyValue() {
        return this.planTypeDictionaryKeyValue;
    }

    public int hashCode() {
        String str = this.planTypeDictionaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.planType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.planTypeDictionaryKeyValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.planTypeDescDictionaryKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.planTypeDescDictionaryKeyValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.planTypeDictionaryKey;
        String str2 = this.planType;
        String str3 = this.planTypeDictionaryKeyValue;
        String str4 = this.planTypeDescDictionaryKey;
        String str5 = this.planTypeDescDictionaryKeyValue;
        return "OfferedPlanTypesEntity(planTypeDictionaryKey=" + str + ", planType=" + str2 + ", planTypeDictionaryKeyValue=" + str3 + ", planTypeDescDictionaryKey=" + str4 + ", planTypeDescDictionaryKeyValue=" + str5 + ")";
    }
}
