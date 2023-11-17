package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ApproveFinancialContactQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ApproveFinancialContactQuery this$0;

    ApproveFinancialContactQuery$variables$1(ApproveFinancialContactQuery approveFinancialContactQuery) {
        this.this$0 = approveFinancialContactQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42588x167eb299(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ApproveFinancialContactQuery approveFinancialContactQuery = this.this$0;
        if (approveFinancialContactQuery.getContactId().f22756b) {
            linkedHashMap.put("contactId", approveFinancialContactQuery.getContactId().f22755a);
        }
        linkedHashMap.put("contactType", approveFinancialContactQuery.getContactType());
        if (approveFinancialContactQuery.getContactValue().f22756b) {
            linkedHashMap.put("contactValue", approveFinancialContactQuery.getContactValue().f22755a);
        }
        linkedHashMap.put("oneTimePassword", approveFinancialContactQuery.getOneTimePassword());
        if (approveFinancialContactQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", approveFinancialContactQuery.getOperationReference().f22755a);
        }
        if (approveFinancialContactQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", approveFinancialContactQuery.getProcessReference().f22755a);
        }
        if (approveFinancialContactQuery.getOnboardingOperationReference().f22756b) {
            linkedHashMap.put("onboardingOperationReference", approveFinancialContactQuery.getOnboardingOperationReference().f22755a);
        }
        return linkedHashMap;
    }
}
