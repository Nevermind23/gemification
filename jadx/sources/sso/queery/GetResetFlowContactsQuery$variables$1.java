package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetResetFlowContactsQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetResetFlowContactsQuery this$0;

    GetResetFlowContactsQuery$variables$1(GetResetFlowContactsQuery getResetFlowContactsQuery) {
        this.this$0 = getResetFlowContactsQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42733x60e6e96f(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetResetFlowContactsQuery getResetFlowContactsQuery = this.this$0;
        if (getResetFlowContactsQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getResetFlowContactsQuery.getProcessReference().f22755a);
        }
        if (getResetFlowContactsQuery.getFlowType().f22756b) {
            linkedHashMap.put("flowType", getResetFlowContactsQuery.getFlowType().f22755a);
        }
        return linkedHashMap;
    }
}
