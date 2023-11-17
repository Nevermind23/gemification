package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.CheckOperationQuery;

public final class CheckOperationQuery$ScaServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ CheckOperationQuery.ScaServices this$0;

    public CheckOperationQuery$ScaServices$marshaller$$inlined$invoke$1(CheckOperationQuery.ScaServices scaServices) {
        this.this$0 = scaServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(CheckOperationQuery.ScaServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = CheckOperationQuery.ScaServices.RESPONSE_FIELDS[1];
        CheckOperationQuery.CheckOperation checkOperation = this.this$0.getCheckOperation();
        if (checkOperation != null) {
            nVar = checkOperation.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
