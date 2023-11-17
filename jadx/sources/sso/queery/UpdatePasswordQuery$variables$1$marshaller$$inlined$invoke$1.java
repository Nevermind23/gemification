package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class UpdatePasswordQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ UpdatePasswordQuery this$0;

    public UpdatePasswordQuery$variables$1$marshaller$$inlined$invoke$1(UpdatePasswordQuery updatePasswordQuery) {
        this.this$0 = updatePasswordQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getOperationId().f22756b) {
            gVar.mo23291a("operationId", (String) this.this$0.getOperationId().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
        gVar.mo23291a("password", this.this$0.getPassword());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getScaAuthCode().f22756b) {
            gVar.mo23291a("scaAuthCode", (String) this.this$0.getScaAuthCode().f22755a);
        }
    }
}
