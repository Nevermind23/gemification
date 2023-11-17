package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.RequestFinancialContactSetQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42849x9703691 implements C8106f {
    final /* synthetic */ RequestFinancialContactSetQuery this$0;

    public C42849x9703691(RequestFinancialContactSetQuery requestFinancialContactSetQuery) {
        this.this$0 = requestFinancialContactSetQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getContactId().f22756b) {
            gVar.mo23291a("contactId", (String) this.this$0.getContactId().f22755a);
        }
        gVar.mo23291a("contactType", this.this$0.getContactType());
        gVar.mo23291a("tmxSessionId", this.this$0.getTmxSessionId());
    }
}
