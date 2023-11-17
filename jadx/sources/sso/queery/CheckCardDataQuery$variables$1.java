package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class CheckCardDataQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ CheckCardDataQuery this$0;

    CheckCardDataQuery$variables$1(CheckCardDataQuery checkCardDataQuery) {
        this.this$0 = checkCardDataQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new CheckCardDataQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CheckCardDataQuery checkCardDataQuery = this.this$0;
        linkedHashMap.put("cardNo", checkCardDataQuery.getCardNo());
        linkedHashMap.put("cvv", checkCardDataQuery.getCvv());
        linkedHashMap.put("expDate", checkCardDataQuery.getExpDate());
        if (checkCardDataQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", checkCardDataQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
