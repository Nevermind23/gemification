package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class UpdateClientTurnoverInfoQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ UpdateClientTurnoverInfoQuery this$0;

    UpdateClientTurnoverInfoQuery$variables$1(UpdateClientTurnoverInfoQuery updateClientTurnoverInfoQuery) {
        this.this$0 = updateClientTurnoverInfoQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42885xe1e31708(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpdateClientTurnoverInfoQuery updateClientTurnoverInfoQuery = this.this$0;
        linkedHashMap.put("operationReference", updateClientTurnoverInfoQuery.getOperationReference());
        linkedHashMap.put("processReference", updateClientTurnoverInfoQuery.getProcessReference());
        linkedHashMap.put("turnOverFrequency", updateClientTurnoverInfoQuery.getTurnOverFrequency());
        linkedHashMap.put("turnoverVolume", updateClientTurnoverInfoQuery.getTurnoverVolume());
        return linkedHashMap;
    }
}
