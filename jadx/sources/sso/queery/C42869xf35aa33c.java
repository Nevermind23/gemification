package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.SetupSecurityParametersQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42869xf35aa33c implements C8106f {
    final /* synthetic */ SetupSecurityParametersQuery this$0;

    public C42869xf35aa33c(SetupSecurityParametersQuery setupSecurityParametersQuery) {
        this.this$0 = setupSecurityParametersQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23295e("biometricAuthRequired", Boolean.valueOf(this.this$0.getBiometricAuthRequired()));
        if (this.this$0.getOperationId().f22756b) {
            gVar.mo23291a("operationId", (String) this.this$0.getOperationId().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
        if (this.this$0.getPasscode().f22756b) {
            gVar.mo23291a("passcode", (String) this.this$0.getPasscode().f22755a);
        }
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getScaAuthCode().f22756b) {
            gVar.mo23291a("scaAuthCode", (String) this.this$0.getScaAuthCode().f22755a);
        }
    }
}
