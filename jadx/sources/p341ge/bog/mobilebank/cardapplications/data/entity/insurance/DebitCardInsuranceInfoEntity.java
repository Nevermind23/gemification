package p341ge.bog.mobilebank.cardapplications.data.entity.insurance;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceInfoEntity */
public final class DebitCardInsuranceInfoEntity {
    private final List<DebitCardInsuranceFeeEntity> insuranceFee;
    private final List<DebitCardInsuranceTypeEntity> insuranceTypes;
    private final Integer numberOfRecords;

    public DebitCardInsuranceInfoEntity(List<DebitCardInsuranceFeeEntity> list, List<DebitCardInsuranceTypeEntity> list2, Integer num) {
        this.insuranceFee = list;
        this.insuranceTypes = list2;
        this.numberOfRecords = num;
    }

    public static /* synthetic */ DebitCardInsuranceInfoEntity copy$default(DebitCardInsuranceInfoEntity debitCardInsuranceInfoEntity, List<DebitCardInsuranceFeeEntity> list, List<DebitCardInsuranceTypeEntity> list2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = debitCardInsuranceInfoEntity.insuranceFee;
        }
        if ((i & 2) != 0) {
            list2 = debitCardInsuranceInfoEntity.insuranceTypes;
        }
        if ((i & 4) != 0) {
            num = debitCardInsuranceInfoEntity.numberOfRecords;
        }
        return debitCardInsuranceInfoEntity.copy(list, list2, num);
    }

    public final List<DebitCardInsuranceFeeEntity> component1() {
        return this.insuranceFee;
    }

    public final List<DebitCardInsuranceTypeEntity> component2() {
        return this.insuranceTypes;
    }

    public final Integer component3() {
        return this.numberOfRecords;
    }

    public final DebitCardInsuranceInfoEntity copy(List<DebitCardInsuranceFeeEntity> list, List<DebitCardInsuranceTypeEntity> list2, Integer num) {
        return new DebitCardInsuranceInfoEntity(list, list2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardInsuranceInfoEntity)) {
            return false;
        }
        DebitCardInsuranceInfoEntity debitCardInsuranceInfoEntity = (DebitCardInsuranceInfoEntity) obj;
        return C41536l.m120484d(this.insuranceFee, debitCardInsuranceInfoEntity.insuranceFee) && C41536l.m120484d(this.insuranceTypes, debitCardInsuranceInfoEntity.insuranceTypes) && C41536l.m120484d(this.numberOfRecords, debitCardInsuranceInfoEntity.numberOfRecords);
    }

    public final List<DebitCardInsuranceFeeEntity> getInsuranceFee() {
        return this.insuranceFee;
    }

    public final List<DebitCardInsuranceTypeEntity> getInsuranceTypes() {
        return this.insuranceTypes;
    }

    public final Integer getNumberOfRecords() {
        return this.numberOfRecords;
    }

    public int hashCode() {
        List<DebitCardInsuranceFeeEntity> list = this.insuranceFee;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DebitCardInsuranceTypeEntity> list2 = this.insuranceTypes;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.numberOfRecords;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<DebitCardInsuranceFeeEntity> list = this.insuranceFee;
        List<DebitCardInsuranceTypeEntity> list2 = this.insuranceTypes;
        Integer num = this.numberOfRecords;
        return "DebitCardInsuranceInfoEntity(insuranceFee=" + list + ", insuranceTypes=" + list2 + ", numberOfRecords=" + num + ")";
    }
}
