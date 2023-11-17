package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.CheckOperationQuery;

public final class CheckOperationQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ CheckOperationQuery.Data this$0;

    public CheckOperationQuery$Data$marshaller$$inlined$invoke$1(CheckOperationQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = CheckOperationQuery.Data.RESPONSE_FIELDS[0];
        CheckOperationQuery.ScaServices scaServices = this.this$0.getScaServices();
        if (scaServices != null) {
            nVar = scaServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
