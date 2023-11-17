package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetOnboardingAccessTokenQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetOnboardingAccessTokenQuery this$0;

    GetOnboardingAccessTokenQuery$variables$1(GetOnboardingAccessTokenQuery getOnboardingAccessTokenQuery) {
        this.this$0 = getOnboardingAccessTokenQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42675xa5bbfe39(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetOnboardingAccessTokenQuery getOnboardingAccessTokenQuery = this.this$0;
        linkedHashMap.put("contactValue", getOnboardingAccessTokenQuery.getContactValue());
        linkedHashMap.put("flowKey", getOnboardingAccessTokenQuery.getFlowKey());
        linkedHashMap.put("personalNumber", getOnboardingAccessTokenQuery.getPersonalNumber());
        if (getOnboardingAccessTokenQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getOnboardingAccessTokenQuery.getProcessReference().f22755a);
        }
        if (getOnboardingAccessTokenQuery.getXDeviceKey().f22756b) {
            linkedHashMap.put("xDeviceKey", getOnboardingAccessTokenQuery.getXDeviceKey().f22755a);
        }
        if (getOnboardingAccessTokenQuery.getXUserAgent().f22756b) {
            linkedHashMap.put("xUserAgent", getOnboardingAccessTokenQuery.getXUserAgent().f22755a);
        }
        return linkedHashMap;
    }
}
