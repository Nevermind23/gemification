package p341ge.bog.mobilebank.autoliabilityinsurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.data.model.RegisterPolicyResultApiModel */
public final class RegisterPolicyResultApiModel {
    private final boolean paymentSucceeded;
    private final PolicyApiModel policy;

    public RegisterPolicyResultApiModel(boolean z, PolicyApiModel policyApiModel) {
        C41536l.m120489i(policyApiModel, "policy");
        this.paymentSucceeded = z;
        this.policy = policyApiModel;
    }

    public static /* synthetic */ RegisterPolicyResultApiModel copy$default(RegisterPolicyResultApiModel registerPolicyResultApiModel, boolean z, PolicyApiModel policyApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = registerPolicyResultApiModel.paymentSucceeded;
        }
        if ((i & 2) != 0) {
            policyApiModel = registerPolicyResultApiModel.policy;
        }
        return registerPolicyResultApiModel.copy(z, policyApiModel);
    }

    public final boolean component1() {
        return this.paymentSucceeded;
    }

    public final PolicyApiModel component2() {
        return this.policy;
    }

    public final RegisterPolicyResultApiModel copy(boolean z, PolicyApiModel policyApiModel) {
        C41536l.m120489i(policyApiModel, "policy");
        return new RegisterPolicyResultApiModel(z, policyApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterPolicyResultApiModel)) {
            return false;
        }
        RegisterPolicyResultApiModel registerPolicyResultApiModel = (RegisterPolicyResultApiModel) obj;
        return this.paymentSucceeded == registerPolicyResultApiModel.paymentSucceeded && C41536l.m120484d(this.policy, registerPolicyResultApiModel.policy);
    }

    public final boolean getPaymentSucceeded() {
        return this.paymentSucceeded;
    }

    public final PolicyApiModel getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        boolean z = this.paymentSucceeded;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.policy.hashCode();
    }

    public String toString() {
        boolean z = this.paymentSucceeded;
        PolicyApiModel policyApiModel = this.policy;
        return "RegisterPolicyResultApiModel(paymentSucceeded=" + z + ", policy=" + policyApiModel + ")";
    }
}
