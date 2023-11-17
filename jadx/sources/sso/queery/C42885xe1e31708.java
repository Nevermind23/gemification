package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.UpdateClientTurnoverInfoQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42885xe1e31708 implements C8106f {
    final /* synthetic */ UpdateClientTurnoverInfoQuery this$0;

    public C42885xe1e31708(UpdateClientTurnoverInfoQuery updateClientTurnoverInfoQuery) {
        this.this$0 = updateClientTurnoverInfoQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("operationReference", this.this$0.getOperationReference());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("turnOverFrequency", this.this$0.getTurnOverFrequency());
        gVar.mo23291a("turnoverVolume", this.this$0.getTurnoverVolume());
    }
}
