package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.CheckOperationQuery;

public final class CheckOperationQuery$CheckOperation$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ CheckOperationQuery.CheckOperation this$0;

    public CheckOperationQuery$CheckOperation$marshaller$$inlined$invoke$1(CheckOperationQuery.CheckOperation checkOperation) {
        this.this$0 = checkOperation;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(CheckOperationQuery.CheckOperation.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(CheckOperationQuery.CheckOperation.RESPONSE_FIELDS[1], this.this$0.getOperationReference());
        pVar.mo23320e(CheckOperationQuery.CheckOperation.RESPONSE_FIELDS[2], this.this$0.getRequireSCA());
        pVar.mo23319d(CheckOperationQuery.CheckOperation.RESPONSE_FIELDS[3], this.this$0.getScaAuthCode());
    }
}
