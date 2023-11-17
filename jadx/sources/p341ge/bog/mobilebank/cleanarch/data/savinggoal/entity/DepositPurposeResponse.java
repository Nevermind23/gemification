package p341ge.bog.mobilebank.cleanarch.data.savinggoal.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.savinggoal.entity.DepositPurposeResponse */
public final class DepositPurposeResponse {
    private final String fieldType;
    private final List<DepositPurposeApiEntity> purposes;

    public DepositPurposeResponse(String str, List<DepositPurposeApiEntity> list) {
        C41536l.m120489i(str, "fieldType");
        C41536l.m120489i(list, "purposes");
        this.fieldType = str;
        this.purposes = list;
    }

    public static /* synthetic */ DepositPurposeResponse copy$default(DepositPurposeResponse depositPurposeResponse, String str, List<DepositPurposeApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositPurposeResponse.fieldType;
        }
        if ((i & 2) != 0) {
            list = depositPurposeResponse.purposes;
        }
        return depositPurposeResponse.copy(str, list);
    }

    public final String component1() {
        return this.fieldType;
    }

    public final List<DepositPurposeApiEntity> component2() {
        return this.purposes;
    }

    public final DepositPurposeResponse copy(String str, List<DepositPurposeApiEntity> list) {
        C41536l.m120489i(str, "fieldType");
        C41536l.m120489i(list, "purposes");
        return new DepositPurposeResponse(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositPurposeResponse)) {
            return false;
        }
        DepositPurposeResponse depositPurposeResponse = (DepositPurposeResponse) obj;
        return C41536l.m120484d(this.fieldType, depositPurposeResponse.fieldType) && C41536l.m120484d(this.purposes, depositPurposeResponse.purposes);
    }

    public final String getFieldType() {
        return this.fieldType;
    }

    public final List<DepositPurposeApiEntity> getPurposes() {
        return this.purposes;
    }

    public int hashCode() {
        return (this.fieldType.hashCode() * 31) + this.purposes.hashCode();
    }

    public String toString() {
        String str = this.fieldType;
        List<DepositPurposeApiEntity> list = this.purposes;
        return "DepositPurposeResponse(fieldType=" + str + ", purposes=" + list + ")";
    }
}
