package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ConfirmationOnTermsQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ConfirmationOnTermsQuery this$0;

    ConfirmationOnTermsQuery$variables$1(ConfirmationOnTermsQuery confirmationOnTermsQuery) {
        this.this$0 = confirmationOnTermsQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42625x17c02c88(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConfirmationOnTermsQuery confirmationOnTermsQuery = this.this$0;
        if (confirmationOnTermsQuery.getPin().f22756b) {
            linkedHashMap.put("pin", confirmationOnTermsQuery.getPin().f22755a);
        }
        if (confirmationOnTermsQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", confirmationOnTermsQuery.getProcessReference().f22755a);
        }
        if (confirmationOnTermsQuery.getServiceKey().f22756b) {
            linkedHashMap.put("serviceKey", confirmationOnTermsQuery.getServiceKey().f22755a);
        }
        if (confirmationOnTermsQuery.getDocumentContent().f22756b) {
            linkedHashMap.put("documentContent", confirmationOnTermsQuery.getDocumentContent().f22755a);
        }
        return linkedHashMap;
    }
}
