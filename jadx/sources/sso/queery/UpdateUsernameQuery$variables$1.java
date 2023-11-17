package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class UpdateUsernameQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ UpdateUsernameQuery this$0;

    UpdateUsernameQuery$variables$1(UpdateUsernameQuery updateUsernameQuery) {
        this.this$0 = updateUsernameQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new UpdateUsernameQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpdateUsernameQuery updateUsernameQuery = this.this$0;
        if (updateUsernameQuery.getRequest().f22756b) {
            linkedHashMap.put("request", updateUsernameQuery.getRequest().f22755a);
        }
        return linkedHashMap;
    }
}
