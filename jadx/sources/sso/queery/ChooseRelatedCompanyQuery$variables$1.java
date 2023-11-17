package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ChooseRelatedCompanyQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ChooseRelatedCompanyQuery this$0;

    ChooseRelatedCompanyQuery$variables$1(ChooseRelatedCompanyQuery chooseRelatedCompanyQuery) {
        this.this$0 = chooseRelatedCompanyQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42621xa5413d1e(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ChooseRelatedCompanyQuery chooseRelatedCompanyQuery = this.this$0;
        linkedHashMap.put("relatedCompanyKey", chooseRelatedCompanyQuery.getRelatedCompanyKey());
        linkedHashMap.put("processReference", chooseRelatedCompanyQuery.getProcessReference());
        return linkedHashMap;
    }
}
