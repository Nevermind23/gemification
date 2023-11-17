package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetFlowQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetFlowQuery this$0;

    GetFlowQuery$variables$1(GetFlowQuery getFlowQuery) {
        this.this$0 = getFlowQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new GetFlowQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetFlowQuery getFlowQuery = this.this$0;
        if (getFlowQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getFlowQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
