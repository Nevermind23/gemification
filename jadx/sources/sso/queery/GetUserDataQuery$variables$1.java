package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetUserDataQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetUserDataQuery this$0;

    GetUserDataQuery$variables$1(GetUserDataQuery getUserDataQuery) {
        this.this$0 = getUserDataQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new GetUserDataQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("processReference", this.this$0.getProcessReference());
        return linkedHashMap;
    }
}
