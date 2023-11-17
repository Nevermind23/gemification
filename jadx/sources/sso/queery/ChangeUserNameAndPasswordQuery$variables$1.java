package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ChangeUserNameAndPasswordQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ChangeUserNameAndPasswordQuery this$0;

    ChangeUserNameAndPasswordQuery$variables$1(ChangeUserNameAndPasswordQuery changeUserNameAndPasswordQuery) {
        this.this$0 = changeUserNameAndPasswordQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42600x880de0c1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ChangeUserNameAndPasswordQuery changeUserNameAndPasswordQuery = this.this$0;
        linkedHashMap.put("userName", changeUserNameAndPasswordQuery.getUserName());
        linkedHashMap.put("password", changeUserNameAndPasswordQuery.getPassword());
        linkedHashMap.put("processReference", changeUserNameAndPasswordQuery.getProcessReference());
        linkedHashMap.put("tmxSessionId", changeUserNameAndPasswordQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
