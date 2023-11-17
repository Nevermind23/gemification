package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class UpdatePasswordQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ UpdatePasswordQuery this$0;

    UpdatePasswordQuery$variables$1(UpdatePasswordQuery updatePasswordQuery) {
        this.this$0 = updatePasswordQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new UpdatePasswordQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpdatePasswordQuery updatePasswordQuery = this.this$0;
        if (updatePasswordQuery.getOperationId().f22756b) {
            linkedHashMap.put("operationId", updatePasswordQuery.getOperationId().f22755a);
        }
        if (updatePasswordQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", updatePasswordQuery.getOperationReference().f22755a);
        }
        linkedHashMap.put("password", updatePasswordQuery.getPassword());
        linkedHashMap.put("processReference", updatePasswordQuery.getProcessReference());
        if (updatePasswordQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", updatePasswordQuery.getScaAuthCode().f22755a);
        }
        return linkedHashMap;
    }
}
