package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.PerformScaQuery;

public final class PerformScaQuery$ScaServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ PerformScaQuery.ScaServices this$0;

    public PerformScaQuery$ScaServices$marshaller$$inlined$invoke$1(PerformScaQuery.ScaServices scaServices) {
        this.this$0 = scaServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(PerformScaQuery.ScaServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(PerformScaQuery.ScaServices.RESPONSE_FIELDS[1], this.this$0.getPerformSca());
    }
}
