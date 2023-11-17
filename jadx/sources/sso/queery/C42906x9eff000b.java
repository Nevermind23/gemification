package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ValidateOnboardingDataQuery;

/* renamed from: sso.queery.ValidateOnboardingDataQuery$ValidateOnboardingData$marshaller$$inlined$invoke$1 */
public final class C42906x9eff000b implements C8122n {
    final /* synthetic */ ValidateOnboardingDataQuery.ValidateOnboardingData this$0;

    public C42906x9eff000b(ValidateOnboardingDataQuery.ValidateOnboardingData validateOnboardingData) {
        this.this$0 = validateOnboardingData;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[1], this.this$0.getCustomerId());
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[2], this.this$0.getCustomerType());
        pVar.mo23318c(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[3], this.this$0.getErrorCode());
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[4], this.this$0.getErrorKey());
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[5], this.this$0.getClientHasActualAddress());
        pVar.mo23319d(ValidateOnboardingDataQuery.ValidateOnboardingData.RESPONSE_FIELDS[6], this.this$0.getScanResultBlob());
    }
}
