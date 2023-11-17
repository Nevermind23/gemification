package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class UpdateProfilePictureStatusQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ UpdateProfilePictureStatusQuery this$0;

    UpdateProfilePictureStatusQuery$variables$1(UpdateProfilePictureStatusQuery updateProfilePictureStatusQuery) {
        this.this$0 = updateProfilePictureStatusQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42894xa7e812e5(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpdateProfilePictureStatusQuery updateProfilePictureStatusQuery = this.this$0;
        if (updateProfilePictureStatusQuery.getStatus().f22756b) {
            linkedHashMap.put("status", updateProfilePictureStatusQuery.getStatus().f22755a);
        }
        return linkedHashMap;
    }
}
