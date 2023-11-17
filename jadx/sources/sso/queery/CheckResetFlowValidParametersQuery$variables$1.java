package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class CheckResetFlowValidParametersQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ CheckResetFlowValidParametersQuery this$0;

    CheckResetFlowValidParametersQuery$variables$1(CheckResetFlowValidParametersQuery checkResetFlowValidParametersQuery) {
        this.this$0 = checkResetFlowValidParametersQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42615x4ba16666(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CheckResetFlowValidParametersQuery checkResetFlowValidParametersQuery = this.this$0;
        if (checkResetFlowValidParametersQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", checkResetFlowValidParametersQuery.getProcessReference().f22755a);
        }
        if (checkResetFlowValidParametersQuery.getFlowType().f22756b) {
            linkedHashMap.put("flowType", checkResetFlowValidParametersQuery.getFlowType().f22755a);
        }
        if (checkResetFlowValidParametersQuery.getIdHashes().f22756b) {
            linkedHashMap.put("idHashes", checkResetFlowValidParametersQuery.getIdHashes().f22755a);
        }
        return linkedHashMap;
    }
}
