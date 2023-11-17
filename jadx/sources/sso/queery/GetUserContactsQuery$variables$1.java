package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetUserContactsQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetUserContactsQuery this$0;

    GetUserContactsQuery$variables$1(GetUserContactsQuery getUserContactsQuery) {
        this.this$0 = getUserContactsQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new GetUserContactsQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetUserContactsQuery getUserContactsQuery = this.this$0;
        linkedHashMap.put("processReference", getUserContactsQuery.getProcessReference());
        if (getUserContactsQuery.getPreSelectedContact().f22756b) {
            linkedHashMap.put("preSelectedContact", getUserContactsQuery.getPreSelectedContact().f22755a);
        }
        return linkedHashMap;
    }
}
