package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RequestFinancialContactApproveQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RequestFinancialContactApproveQuery this$0;

    RequestFinancialContactApproveQuery$variables$1(RequestFinancialContactApproveQuery requestFinancialContactApproveQuery) {
        this.this$0 = requestFinancialContactApproveQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42841xb8672d3c(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RequestFinancialContactApproveQuery requestFinancialContactApproveQuery = this.this$0;
        if (requestFinancialContactApproveQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", requestFinancialContactApproveQuery.getProcessReference().f22755a);
        }
        if (requestFinancialContactApproveQuery.getContactId().f22756b) {
            linkedHashMap.put("contactId", requestFinancialContactApproveQuery.getContactId().f22755a);
        }
        linkedHashMap.put("contactType", requestFinancialContactApproveQuery.getContactType());
        if (requestFinancialContactApproveQuery.getContactValue().f22756b) {
            linkedHashMap.put("contactValue", requestFinancialContactApproveQuery.getContactValue().f22755a);
        }
        if (requestFinancialContactApproveQuery.getPersonalNumber().f22756b) {
            linkedHashMap.put("personalNumber", requestFinancialContactApproveQuery.getPersonalNumber().f22755a);
        }
        if (requestFinancialContactApproveQuery.getOnboardingOperationReference().f22756b) {
            linkedHashMap.put("onboardingOperationReference", requestFinancialContactApproveQuery.getOnboardingOperationReference().f22755a);
        }
        return linkedHashMap;
    }
}
