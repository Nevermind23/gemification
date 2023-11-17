package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class PerformScaQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ PerformScaQuery this$0;

    public PerformScaQuery$variables$1$marshaller$$inlined$invoke$1(PerformScaQuery performScaQuery) {
        this.this$0 = performScaQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("operationReference", this.this$0.getOperationReference());
        gVar.mo23291a("deviceId", this.this$0.getDeviceId());
        gVar.mo23294d("authElements", new PerformScaQuery$variables$1$marshaller$1$1(this.this$0));
    }
}
