package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RefreshTokenQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RefreshTokenQuery this$0;

    RefreshTokenQuery$variables$1(RefreshTokenQuery refreshTokenQuery) {
        this.this$0 = refreshTokenQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new RefreshTokenQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RefreshTokenQuery refreshTokenQuery = this.this$0;
        linkedHashMap.put("processReference", refreshTokenQuery.getProcessReference());
        linkedHashMap.put("refreshToken", refreshTokenQuery.getRefreshToken());
        return linkedHashMap;
    }
}
