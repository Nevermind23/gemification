package p341ge.bog.mobilebank.insurance.travelinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.data.model.RegisterPolicyResultApiModel */
public final class RegisterPolicyResultApiModel {
    private final Integer docKey;
    private final int errorCode;

    public RegisterPolicyResultApiModel(Integer num, int i) {
        this.docKey = num;
        this.errorCode = i;
    }

    public static /* synthetic */ RegisterPolicyResultApiModel copy$default(RegisterPolicyResultApiModel registerPolicyResultApiModel, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = registerPolicyResultApiModel.docKey;
        }
        if ((i2 & 2) != 0) {
            i = registerPolicyResultApiModel.errorCode;
        }
        return registerPolicyResultApiModel.copy(num, i);
    }

    public final Integer component1() {
        return this.docKey;
    }

    public final int component2() {
        return this.errorCode;
    }

    public final RegisterPolicyResultApiModel copy(Integer num, int i) {
        return new RegisterPolicyResultApiModel(num, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterPolicyResultApiModel)) {
            return false;
        }
        RegisterPolicyResultApiModel registerPolicyResultApiModel = (RegisterPolicyResultApiModel) obj;
        return C41536l.m120484d(this.docKey, registerPolicyResultApiModel.docKey) && this.errorCode == registerPolicyResultApiModel.errorCode;
    }

    public final Integer getDocKey() {
        return this.docKey;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        Integer num = this.docKey;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.errorCode;
    }

    public String toString() {
        Integer num = this.docKey;
        int i = this.errorCode;
        return "RegisterPolicyResultApiModel(docKey=" + num + ", errorCode=" + i + ")";
    }
}
