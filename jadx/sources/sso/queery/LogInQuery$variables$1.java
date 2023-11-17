package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class LogInQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ LogInQuery this$0;

    LogInQuery$variables$1(LogInQuery logInQuery) {
        this.this$0 = logInQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new LogInQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LogInQuery logInQuery = this.this$0;
        linkedHashMap.put("username", logInQuery.getUsername());
        linkedHashMap.put("password", logInQuery.getPassword());
        linkedHashMap.put("processReference", logInQuery.getProcessReference());
        linkedHashMap.put("tmxSessionId", logInQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
