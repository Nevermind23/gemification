package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class SetPassCodeQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ SetPassCodeQuery this$0;

    SetPassCodeQuery$variables$1(SetPassCodeQuery setPassCodeQuery) {
        this.this$0 = setPassCodeQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new SetPassCodeQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SetPassCodeQuery setPassCodeQuery = this.this$0;
        linkedHashMap.put("passCode", setPassCodeQuery.getPassCode());
        linkedHashMap.put("processReference", setPassCodeQuery.getProcessReference());
        linkedHashMap.put("userName", setPassCodeQuery.getUserName());
        return linkedHashMap;
    }
}
