package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class VerifyOTPQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ VerifyOTPQuery this$0;

    public VerifyOTPQuery$variables$1$marshaller$$inlined$invoke$1(VerifyOTPQuery verifyOTPQuery) {
        this.this$0 = verifyOTPQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("onteTimePassword", this.this$0.getOnteTimePassword());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getRelatedCompanyClientKey().f22756b) {
            gVar.mo23291a("relatedCompanyClientKey", (String) this.this$0.getRelatedCompanyClientKey().f22755a);
        }
    }
}
