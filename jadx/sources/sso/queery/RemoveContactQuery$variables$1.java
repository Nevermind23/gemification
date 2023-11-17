package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RemoveContactQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RemoveContactQuery this$0;

    RemoveContactQuery$variables$1(RemoveContactQuery removeContactQuery) {
        this.this$0 = removeContactQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new RemoveContactQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RemoveContactQuery removeContactQuery = this.this$0;
        linkedHashMap.put("contactId", removeContactQuery.getContactId());
        if (removeContactQuery.getOperationId().f22756b) {
            linkedHashMap.put("operationId", removeContactQuery.getOperationId().f22755a);
        }
        if (removeContactQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", removeContactQuery.getOperationReference().f22755a);
        }
        if (removeContactQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", removeContactQuery.getScaAuthCode().f22755a);
        }
        return linkedHashMap;
    }
}
