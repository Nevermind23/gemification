package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.PerformScaQuery;

public final class PerformScaQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ PerformScaQuery.Data this$0;

    public PerformScaQuery$Data$marshaller$$inlined$invoke$1(PerformScaQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = PerformScaQuery.Data.RESPONSE_FIELDS[0];
        PerformScaQuery.ScaServices scaServices = this.this$0.getScaServices();
        if (scaServices != null) {
            nVar = scaServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
