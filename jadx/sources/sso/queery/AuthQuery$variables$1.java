package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class AuthQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ AuthQuery this$0;

    AuthQuery$variables$1(AuthQuery authQuery) {
        this.this$0 = authQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new AuthQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AuthQuery authQuery = this.this$0;
        linkedHashMap.put("channel", authQuery.getChannel());
        linkedHashMap.put("secret", authQuery.getSecret());
        return linkedHashMap;
    }
}
