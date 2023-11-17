package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class CheckCardDataQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ CheckCardDataQuery this$0;

    public CheckCardDataQuery$variables$1$marshaller$$inlined$invoke$1(CheckCardDataQuery checkCardDataQuery) {
        this.this$0 = checkCardDataQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("cardNo", this.this$0.getCardNo());
        gVar.mo23291a("cvv", this.this$0.getCvv());
        gVar.mo23291a("expDate", this.this$0.getExpDate());
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
    }
}
