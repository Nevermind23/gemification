package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ValidateOnboardingDocumentDataQuery;

/* renamed from: sso.queery.ValidateOnboardingDocumentDataQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42918x16110594 implements C8122n {
    final /* synthetic */ ValidateOnboardingDocumentDataQuery.RegistrationServices this$0;

    public C42918x16110594(ValidateOnboardingDocumentDataQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ValidateOnboardingDocumentDataQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = ValidateOnboardingDocumentDataQuery.RegistrationServices.RESPONSE_FIELDS[1];
        ValidateOnboardingDocumentDataQuery.ValidateOnboardingDocumentData validateOnboardingDocumentData = this.this$0.getValidateOnboardingDocumentData();
        if (validateOnboardingDocumentData != null) {
            nVar = validateOnboardingDocumentData.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
