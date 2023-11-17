package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

public final class CheckOperationQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ CheckOperationQuery this$0;

    CheckOperationQuery$variables$1(CheckOperationQuery checkOperationQuery) {
        this.this$0 = checkOperationQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new CheckOperationQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CheckOperationQuery checkOperationQuery = this.this$0;
        linkedHashMap.put("operationId", checkOperationQuery.getOperationId());
        linkedHashMap.put(IRetrofitService.SERVICE_ID, checkOperationQuery.getServiceId());
        linkedHashMap.put("operationProperties", checkOperationQuery.getOperationProperties());
        return linkedHashMap;
    }
}
