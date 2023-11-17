package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RequestFinancialContactSetQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RequestFinancialContactSetQuery this$0;

    RequestFinancialContactSetQuery$variables$1(RequestFinancialContactSetQuery requestFinancialContactSetQuery) {
        this.this$0 = requestFinancialContactSetQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42849x9703691(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RequestFinancialContactSetQuery requestFinancialContactSetQuery = this.this$0;
        if (requestFinancialContactSetQuery.getContactId().f22756b) {
            linkedHashMap.put("contactId", requestFinancialContactSetQuery.getContactId().f22755a);
        }
        linkedHashMap.put("contactType", requestFinancialContactSetQuery.getContactType());
        linkedHashMap.put("tmxSessionId", requestFinancialContactSetQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
