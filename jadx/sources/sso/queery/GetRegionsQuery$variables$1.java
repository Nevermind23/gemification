package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetRegionsQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetRegionsQuery this$0;

    GetRegionsQuery$variables$1(GetRegionsQuery getRegionsQuery) {
        this.this$0 = getRegionsQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new GetRegionsQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetRegionsQuery getRegionsQuery = this.this$0;
        linkedHashMap.put("processReference", getRegionsQuery.getProcessReference());
        linkedHashMap.put("country", getRegionsQuery.getCountry());
        return linkedHashMap;
    }
}
