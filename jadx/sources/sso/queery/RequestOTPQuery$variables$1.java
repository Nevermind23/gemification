package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RequestOTPQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RequestOTPQuery this$0;

    RequestOTPQuery$variables$1(RequestOTPQuery requestOTPQuery) {
        this.this$0 = requestOTPQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new RequestOTPQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RequestOTPQuery requestOTPQuery = this.this$0;
        if (requestOTPQuery.getContact().f22756b) {
            linkedHashMap.put("contact", requestOTPQuery.getContact().f22755a);
        }
        if (requestOTPQuery.getContactId().f22756b) {
            linkedHashMap.put("contactId", requestOTPQuery.getContactId().f22755a);
        }
        if (requestOTPQuery.getContactType().f22756b) {
            linkedHashMap.put("contactType", requestOTPQuery.getContactType().f22755a);
        }
        if (requestOTPQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", requestOTPQuery.getProcessReference().f22755a);
        }
        if (requestOTPQuery.getManuallyEnteredContact().f22756b) {
            linkedHashMap.put("manuallyEnteredContact", requestOTPQuery.getManuallyEnteredContact().f22755a);
        }
        if (requestOTPQuery.getManuallyEnteredContactType().f22756b) {
            linkedHashMap.put("manuallyEnteredContactType", requestOTPQuery.getManuallyEnteredContactType().f22755a);
        }
        if (requestOTPQuery.getScaOperationReference().f22756b) {
            linkedHashMap.put("scaOperationReference", requestOTPQuery.getScaOperationReference().f22755a);
        }
        return linkedHashMap;
    }
}
