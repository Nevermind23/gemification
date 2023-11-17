package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.IdentifyProccesFlowQuery;
import sso.type.ProcessFlow;

/* renamed from: sso.queery.IdentifyProccesFlowQuery$IdentifyProcessFlow$marshaller$$inlined$invoke$1 */
public final class C42790x46f27965 implements C8122n {
    final /* synthetic */ IdentifyProccesFlowQuery.IdentifyProcessFlow this$0;

    public C42790x46f27965(IdentifyProccesFlowQuery.IdentifyProcessFlow identifyProcessFlow) {
        this.this$0 = identifyProcessFlow;
    }

    public void marshal(C8135p pVar) {
        String str;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(IdentifyProccesFlowQuery.IdentifyProcessFlow.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = IdentifyProccesFlowQuery.IdentifyProcessFlow.RESPONSE_FIELDS[1];
        ProcessFlow processFlow = this.this$0.getProcessFlow();
        if (processFlow != null) {
            str = processFlow.getRawValue();
        } else {
            str = null;
        }
        pVar.mo23319d(kVar, str);
        pVar.mo23319d(IdentifyProccesFlowQuery.IdentifyProcessFlow.RESPONSE_FIELDS[2], this.this$0.getProcessReference());
    }
}
