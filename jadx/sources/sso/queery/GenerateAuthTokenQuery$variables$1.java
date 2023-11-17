package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GenerateAuthTokenQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GenerateAuthTokenQuery this$0;

    GenerateAuthTokenQuery$variables$1(GenerateAuthTokenQuery generateAuthTokenQuery) {
        this.this$0 = generateAuthTokenQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new GenerateAuthTokenQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GenerateAuthTokenQuery generateAuthTokenQuery = this.this$0;
        linkedHashMap.put("extCustomerId", generateAuthTokenQuery.getExtCustomerId());
        linkedHashMap.put("processReference", generateAuthTokenQuery.getProcessReference());
        linkedHashMap.put("username", generateAuthTokenQuery.getUsername());
        linkedHashMap.put("authTokenType", generateAuthTokenQuery.getAuthTokenType());
        return linkedHashMap;
    }
}
