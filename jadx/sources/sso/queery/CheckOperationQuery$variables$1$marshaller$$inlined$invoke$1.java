package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

public final class CheckOperationQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ CheckOperationQuery this$0;

    public CheckOperationQuery$variables$1$marshaller$$inlined$invoke$1(CheckOperationQuery checkOperationQuery) {
        this.this$0 = checkOperationQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("operationId", this.this$0.getOperationId());
        gVar.mo23291a(IRetrofitService.SERVICE_ID, this.this$0.getServiceId());
        gVar.mo23294d("operationProperties", new CheckOperationQuery$variables$1$marshaller$1$1(this.this$0));
    }
}
