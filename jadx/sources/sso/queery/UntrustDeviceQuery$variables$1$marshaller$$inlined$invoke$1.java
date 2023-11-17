package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class UntrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ UntrustDeviceQuery this$0;

    public UntrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1(UntrustDeviceQuery untrustDeviceQuery) {
        this.this$0 = untrustDeviceQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("deviceId", this.this$0.getDeviceId());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
    }
}
