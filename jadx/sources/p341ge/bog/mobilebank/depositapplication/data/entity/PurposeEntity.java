package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.PurposeEntity */
public final class PurposeEntity {
    private final String fieldType;
    private final List<DepositPurposeEntity> purposes;

    public PurposeEntity(String str, List<DepositPurposeEntity> list) {
        C41536l.m120489i(str, "fieldType");
        C41536l.m120489i(list, "purposes");
        this.fieldType = str;
        this.purposes = list;
    }

    public static /* synthetic */ PurposeEntity copy$default(PurposeEntity purposeEntity, String str, List<DepositPurposeEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purposeEntity.fieldType;
        }
        if ((i & 2) != 0) {
            list = purposeEntity.purposes;
        }
        return purposeEntity.copy(str, list);
    }

    public final String component1() {
        return this.fieldType;
    }

    public final List<DepositPurposeEntity> component2() {
        return this.purposes;
    }

    public final PurposeEntity copy(String str, List<DepositPurposeEntity> list) {
        C41536l.m120489i(str, "fieldType");
        C41536l.m120489i(list, "purposes");
        return new PurposeEntity(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurposeEntity)) {
            return false;
        }
        PurposeEntity purposeEntity = (PurposeEntity) obj;
        return C41536l.m120484d(this.fieldType, purposeEntity.fieldType) && C41536l.m120484d(this.purposes, purposeEntity.purposes);
    }

    public final String getFieldType() {
        return this.fieldType;
    }

    public final List<DepositPurposeEntity> getPurposes() {
        return this.purposes;
    }

    public int hashCode() {
        return (this.fieldType.hashCode() * 31) + this.purposes.hashCode();
    }

    public String toString() {
        String str = this.fieldType;
        List<DepositPurposeEntity> list = this.purposes;
        return "PurposeEntity(fieldType=" + str + ", purposes=" + list + ")";
    }
}
