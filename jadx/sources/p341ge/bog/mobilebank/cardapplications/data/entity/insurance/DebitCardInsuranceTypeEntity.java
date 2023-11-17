package p341ge.bog.mobilebank.cardapplications.data.entity.insurance;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceTypeEntity */
public final class DebitCardInsuranceTypeEntity {
    private final String cardSubProductCode;
    private final String detailsDictionaryKey;
    private final String dictionaryKey;

    /* renamed from: id */
    private final String f41313id;
    private final String insuranceLimitOnlinePaymentsValue;
    private final String insuranceLimitPosValue;
    private final String insuranceType;

    public DebitCardInsuranceTypeEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "insuranceType");
        C41536l.m120489i(str3, "cardSubProductCode");
        C41536l.m120489i(str4, "dictionaryKey");
        C41536l.m120489i(str5, "detailsDictionaryKey");
        C41536l.m120489i(str6, "insuranceLimitPosValue");
        C41536l.m120489i(str7, "insuranceLimitOnlinePaymentsValue");
        this.f41313id = str;
        this.insuranceType = str2;
        this.cardSubProductCode = str3;
        this.dictionaryKey = str4;
        this.detailsDictionaryKey = str5;
        this.insuranceLimitPosValue = str6;
        this.insuranceLimitOnlinePaymentsValue = str7;
    }

    public static /* synthetic */ DebitCardInsuranceTypeEntity copy$default(DebitCardInsuranceTypeEntity debitCardInsuranceTypeEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debitCardInsuranceTypeEntity.f41313id;
        }
        if ((i & 2) != 0) {
            str2 = debitCardInsuranceTypeEntity.insuranceType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = debitCardInsuranceTypeEntity.cardSubProductCode;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = debitCardInsuranceTypeEntity.dictionaryKey;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = debitCardInsuranceTypeEntity.detailsDictionaryKey;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = debitCardInsuranceTypeEntity.insuranceLimitPosValue;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = debitCardInsuranceTypeEntity.insuranceLimitOnlinePaymentsValue;
        }
        return debitCardInsuranceTypeEntity.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.f41313id;
    }

    public final String component2() {
        return this.insuranceType;
    }

    public final String component3() {
        return this.cardSubProductCode;
    }

    public final String component4() {
        return this.dictionaryKey;
    }

    public final String component5() {
        return this.detailsDictionaryKey;
    }

    public final String component6() {
        return this.insuranceLimitPosValue;
    }

    public final String component7() {
        return this.insuranceLimitOnlinePaymentsValue;
    }

    public final DebitCardInsuranceTypeEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "insuranceType");
        C41536l.m120489i(str3, "cardSubProductCode");
        C41536l.m120489i(str4, "dictionaryKey");
        C41536l.m120489i(str5, "detailsDictionaryKey");
        C41536l.m120489i(str6, "insuranceLimitPosValue");
        String str8 = str7;
        C41536l.m120489i(str8, "insuranceLimitOnlinePaymentsValue");
        return new DebitCardInsuranceTypeEntity(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardInsuranceTypeEntity)) {
            return false;
        }
        DebitCardInsuranceTypeEntity debitCardInsuranceTypeEntity = (DebitCardInsuranceTypeEntity) obj;
        return C41536l.m120484d(this.f41313id, debitCardInsuranceTypeEntity.f41313id) && C41536l.m120484d(this.insuranceType, debitCardInsuranceTypeEntity.insuranceType) && C41536l.m120484d(this.cardSubProductCode, debitCardInsuranceTypeEntity.cardSubProductCode) && C41536l.m120484d(this.dictionaryKey, debitCardInsuranceTypeEntity.dictionaryKey) && C41536l.m120484d(this.detailsDictionaryKey, debitCardInsuranceTypeEntity.detailsDictionaryKey) && C41536l.m120484d(this.insuranceLimitPosValue, debitCardInsuranceTypeEntity.insuranceLimitPosValue) && C41536l.m120484d(this.insuranceLimitOnlinePaymentsValue, debitCardInsuranceTypeEntity.insuranceLimitOnlinePaymentsValue);
    }

    public final String getCardSubProductCode() {
        return this.cardSubProductCode;
    }

    public final String getDetailsDictionaryKey() {
        return this.detailsDictionaryKey;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getId() {
        return this.f41313id;
    }

    public final String getInsuranceLimitOnlinePaymentsValue() {
        return this.insuranceLimitOnlinePaymentsValue;
    }

    public final String getInsuranceLimitPosValue() {
        return this.insuranceLimitPosValue;
    }

    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public int hashCode() {
        return (((((((((((this.f41313id.hashCode() * 31) + this.insuranceType.hashCode()) * 31) + this.cardSubProductCode.hashCode()) * 31) + this.dictionaryKey.hashCode()) * 31) + this.detailsDictionaryKey.hashCode()) * 31) + this.insuranceLimitPosValue.hashCode()) * 31) + this.insuranceLimitOnlinePaymentsValue.hashCode();
    }

    public String toString() {
        String str = this.f41313id;
        String str2 = this.insuranceType;
        String str3 = this.cardSubProductCode;
        String str4 = this.dictionaryKey;
        String str5 = this.detailsDictionaryKey;
        String str6 = this.insuranceLimitPosValue;
        String str7 = this.insuranceLimitOnlinePaymentsValue;
        return "DebitCardInsuranceTypeEntity(id=" + str + ", insuranceType=" + str2 + ", cardSubProductCode=" + str3 + ", dictionaryKey=" + str4 + ", detailsDictionaryKey=" + str5 + ", insuranceLimitPosValue=" + str6 + ", insuranceLimitOnlinePaymentsValue=" + str7 + ")";
    }
}
