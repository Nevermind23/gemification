package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.ConfirmationOnTermsQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42625x17c02c88 implements C8106f {
    final /* synthetic */ ConfirmationOnTermsQuery this$0;

    public C42625x17c02c88(ConfirmationOnTermsQuery confirmationOnTermsQuery) {
        this.this$0 = confirmationOnTermsQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getPin().f22756b) {
            gVar.mo23291a("pin", (String) this.this$0.getPin().f22755a);
        }
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getServiceKey().f22756b) {
            gVar.mo23291a("serviceKey", (String) this.this$0.getServiceKey().f22755a);
        }
        if (this.this$0.getDocumentContent().f22756b) {
            gVar.mo23291a("documentContent", (String) this.this$0.getDocumentContent().f22755a);
        }
    }
}
