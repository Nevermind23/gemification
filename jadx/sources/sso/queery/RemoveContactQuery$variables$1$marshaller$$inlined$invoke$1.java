package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class RemoveContactQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ RemoveContactQuery this$0;

    public RemoveContactQuery$variables$1$marshaller$$inlined$invoke$1(RemoveContactQuery removeContactQuery) {
        this.this$0 = removeContactQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("contactId", this.this$0.getContactId());
        if (this.this$0.getOperationId().f22756b) {
            gVar.mo23291a("operationId", (String) this.this$0.getOperationId().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
        if (this.this$0.getScaAuthCode().f22756b) {
            gVar.mo23291a("scaAuthCode", (String) this.this$0.getScaAuthCode().f22755a);
        }
    }
}
