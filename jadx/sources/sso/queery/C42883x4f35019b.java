package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.UpdateClientTurnoverInfoQuery;

/* renamed from: sso.queery.UpdateClientTurnoverInfoQuery$UpdateClientTurnoverInfo$marshaller$$inlined$invoke$1 */
public final class C42883x4f35019b implements C8122n {
    final /* synthetic */ UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo this$0;

    public C42883x4f35019b(UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo updateClientTurnoverInfo) {
        this.this$0 = updateClientTurnoverInfo;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23320e(UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo.RESPONSE_FIELDS[1], this.this$0.getNeedToSetFinancialMail());
    }
}
