package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class SetupSecurityParametersQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ SetupSecurityParametersQuery this$0;

    SetupSecurityParametersQuery$variables$1(SetupSecurityParametersQuery setupSecurityParametersQuery) {
        this.this$0 = setupSecurityParametersQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42869xf35aa33c(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SetupSecurityParametersQuery setupSecurityParametersQuery = this.this$0;
        linkedHashMap.put("biometricAuthRequired", Boolean.valueOf(setupSecurityParametersQuery.getBiometricAuthRequired()));
        if (setupSecurityParametersQuery.getOperationId().f22756b) {
            linkedHashMap.put("operationId", setupSecurityParametersQuery.getOperationId().f22755a);
        }
        if (setupSecurityParametersQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", setupSecurityParametersQuery.getOperationReference().f22755a);
        }
        if (setupSecurityParametersQuery.getPasscode().f22756b) {
            linkedHashMap.put("passcode", setupSecurityParametersQuery.getPasscode().f22755a);
        }
        linkedHashMap.put("processReference", setupSecurityParametersQuery.getProcessReference());
        if (setupSecurityParametersQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", setupSecurityParametersQuery.getScaAuthCode().f22755a);
        }
        return linkedHashMap;
    }
}
