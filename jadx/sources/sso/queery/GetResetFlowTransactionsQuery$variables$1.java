package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetResetFlowTransactionsQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetResetFlowTransactionsQuery this$0;

    GetResetFlowTransactionsQuery$variables$1(GetResetFlowTransactionsQuery getResetFlowTransactionsQuery) {
        this.this$0 = getResetFlowTransactionsQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42747x192e9371(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetResetFlowTransactionsQuery getResetFlowTransactionsQuery = this.this$0;
        if (getResetFlowTransactionsQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getResetFlowTransactionsQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
