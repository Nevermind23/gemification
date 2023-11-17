package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class AddContactQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ AddContactQuery this$0;

    AddContactQuery$variables$1(AddContactQuery addContactQuery) {
        this.this$0 = addContactQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new AddContactQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AddContactQuery addContactQuery = this.this$0;
        linkedHashMap.put("contact", addContactQuery.getContact());
        linkedHashMap.put("contactType", addContactQuery.getContactType());
        if (addContactQuery.getOperationId().f22756b) {
            linkedHashMap.put("operationId", addContactQuery.getOperationId().f22755a);
        }
        if (addContactQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", addContactQuery.getOperationReference().f22755a);
        }
        if (addContactQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", addContactQuery.getScaAuthCode().f22755a);
        }
        return linkedHashMap;
    }
}
