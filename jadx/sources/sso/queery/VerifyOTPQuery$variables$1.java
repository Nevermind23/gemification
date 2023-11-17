package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class VerifyOTPQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ VerifyOTPQuery this$0;

    VerifyOTPQuery$variables$1(VerifyOTPQuery verifyOTPQuery) {
        this.this$0 = verifyOTPQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new VerifyOTPQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VerifyOTPQuery verifyOTPQuery = this.this$0;
        linkedHashMap.put("onteTimePassword", verifyOTPQuery.getOnteTimePassword());
        linkedHashMap.put("processReference", verifyOTPQuery.getProcessReference());
        if (verifyOTPQuery.getRelatedCompanyClientKey().f22756b) {
            linkedHashMap.put("relatedCompanyClientKey", verifyOTPQuery.getRelatedCompanyClientKey().f22755a);
        }
        return linkedHashMap;
    }
}
