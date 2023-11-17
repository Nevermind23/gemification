package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class AddContactQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ AddContactQuery this$0;

    public AddContactQuery$variables$1$marshaller$$inlined$invoke$1(AddContactQuery addContactQuery) {
        this.this$0 = addContactQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("contact", this.this$0.getContact());
        gVar.mo23291a("contactType", this.this$0.getContactType().getRawValue());
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
