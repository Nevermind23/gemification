package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class SetFinancialPhoneQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ SetFinancialPhoneQuery this$0;

    public SetFinancialPhoneQuery$variables$1$marshaller$$inlined$invoke$1(SetFinancialPhoneQuery setFinancialPhoneQuery) {
        this.this$0 = setFinancialPhoneQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("contactId", this.this$0.getContactId());
        if (this.this$0.getScaAuthCode().f22756b) {
            gVar.mo23291a("scaAuthCode", (String) this.this$0.getScaAuthCode().f22755a);
        }
        gVar.mo23291a("tmxSessionId", this.this$0.getTmxSessionId());
    }
}
