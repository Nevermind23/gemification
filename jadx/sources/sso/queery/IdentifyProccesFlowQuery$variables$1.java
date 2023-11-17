package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class IdentifyProccesFlowQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ IdentifyProccesFlowQuery this$0;

    IdentifyProccesFlowQuery$variables$1(IdentifyProccesFlowQuery identifyProccesFlowQuery) {
        this.this$0 = identifyProccesFlowQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42793x619a5c72(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IdentifyProccesFlowQuery identifyProccesFlowQuery = this.this$0;
        linkedHashMap.put("pin", identifyProccesFlowQuery.getPin());
        if (identifyProccesFlowQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", identifyProccesFlowQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
