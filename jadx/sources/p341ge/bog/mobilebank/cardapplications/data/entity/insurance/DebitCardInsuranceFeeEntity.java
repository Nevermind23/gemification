package p341ge.bog.mobilebank.cardapplications.data.entity.insurance;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceFeeEntity */
public final class DebitCardInsuranceFeeEntity {
    private final Double fee;
    private final Double insuranceRealFee;
    private final String insuranceType;

    public DebitCardInsuranceFeeEntity(Double d, String str, Double d2) {
        this.fee = d;
        this.insuranceType = str;
        this.insuranceRealFee = d2;
    }

    public static /* synthetic */ DebitCardInsuranceFeeEntity copy$default(DebitCardInsuranceFeeEntity debitCardInsuranceFeeEntity, Double d, String str, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = debitCardInsuranceFeeEntity.fee;
        }
        if ((i & 2) != 0) {
            str = debitCardInsuranceFeeEntity.insuranceType;
        }
        if ((i & 4) != 0) {
            d2 = debitCardInsuranceFeeEntity.insuranceRealFee;
        }
        return debitCardInsuranceFeeEntity.copy(d, str, d2);
    }

    public final Double component1() {
        return this.fee;
    }

    public final String component2() {
        return this.insuranceType;
    }

    public final Double component3() {
        return this.insuranceRealFee;
    }

    public final DebitCardInsuranceFeeEntity copy(Double d, String str, Double d2) {
        return new DebitCardInsuranceFeeEntity(d, str, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardInsuranceFeeEntity)) {
            return false;
        }
        DebitCardInsuranceFeeEntity debitCardInsuranceFeeEntity = (DebitCardInsuranceFeeEntity) obj;
        return C41536l.m120484d(this.fee, debitCardInsuranceFeeEntity.fee) && C41536l.m120484d(this.insuranceType, debitCardInsuranceFeeEntity.insuranceType) && C41536l.m120484d(this.insuranceRealFee, debitCardInsuranceFeeEntity.insuranceRealFee);
    }

    public final Double getFee() {
        return this.fee;
    }

    public final Double getInsuranceRealFee() {
        return this.insuranceRealFee;
    }

    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public int hashCode() {
        Double d = this.fee;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.insuranceType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.insuranceRealFee;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Double d = this.fee;
        String str = this.insuranceType;
        Double d2 = this.insuranceRealFee;
        return "DebitCardInsuranceFeeEntity(fee=" + d + ", insuranceType=" + str + ", insuranceRealFee=" + d2 + ")";
    }
}
