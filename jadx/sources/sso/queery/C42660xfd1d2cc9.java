package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetFlowQuery;
import sso.type.RecoveryProcessFlow;

/* renamed from: sso.queery.GetFlowQuery$GetPasswordRecoveryFlow$marshaller$$inlined$invoke$1 */
public final class C42660xfd1d2cc9 implements C8122n {
    final /* synthetic */ GetFlowQuery.GetPasswordRecoveryFlow this$0;

    public C42660xfd1d2cc9(GetFlowQuery.GetPasswordRecoveryFlow getPasswordRecoveryFlow) {
        this.this$0 = getPasswordRecoveryFlow;
    }

    public void marshal(C8135p pVar) {
        String str;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetFlowQuery.GetPasswordRecoveryFlow.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetFlowQuery.GetPasswordRecoveryFlow.RESPONSE_FIELDS[1];
        RecoveryProcessFlow processFlow = this.this$0.getProcessFlow();
        if (processFlow != null) {
            str = processFlow.getRawValue();
        } else {
            str = null;
        }
        pVar.mo23319d(kVar, str);
        pVar.mo23319d(GetFlowQuery.GetPasswordRecoveryFlow.RESPONSE_FIELDS[2], this.this$0.getProcessReference());
    }
}
