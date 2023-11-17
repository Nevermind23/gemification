package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class SetFinancialPhoneQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ SetFinancialPhoneQuery this$0;

    SetFinancialPhoneQuery$variables$1(SetFinancialPhoneQuery setFinancialPhoneQuery) {
        this.this$0 = setFinancialPhoneQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new SetFinancialPhoneQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SetFinancialPhoneQuery setFinancialPhoneQuery = this.this$0;
        linkedHashMap.put("contactId", setFinancialPhoneQuery.getContactId());
        if (setFinancialPhoneQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", setFinancialPhoneQuery.getScaAuthCode().f22755a);
        }
        linkedHashMap.put("tmxSessionId", setFinancialPhoneQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
