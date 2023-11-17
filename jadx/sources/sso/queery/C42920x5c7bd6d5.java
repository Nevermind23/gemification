package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ValidateOnboardingDocumentDataQuery;

/* renamed from: sso.queery.ValidateOnboardingDocumentDataQuery$ValidateOnboardingDocumentData$marshaller$$inlined$invoke$1 */
public final class C42920x5c7bd6d5 implements C8122n {
    final /* synthetic */ ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData this$0;

    public C42920x5c7bd6d5(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData validateOnboardingDocumentData) {
        this.this$0 = validateOnboardingDocumentData;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[1], this.this$0.getCustomerId());
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[2], this.this$0.getCustomerType());
        pVar.mo23318c(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[3], this.this$0.getErrorCode());
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[4], this.this$0.getErrorKey());
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData.RESPONSE_FIELDS[5], this.this$0.getClientHasActualAddress());
    }
}
