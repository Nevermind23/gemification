package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class LogoutQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ LogoutQuery this$0;

    LogoutQuery$variables$1(LogoutQuery logoutQuery) {
        this.this$0 = logoutQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new LogoutQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("processReference", this.this$0.getProcessReference());
        return linkedHashMap;
    }
}
