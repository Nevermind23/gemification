package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ConfirmationOnTermsQuery;

/* renamed from: sso.queery.ConfirmationOnTermsQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42624x42d53a17 implements C8122n {
    final /* synthetic */ ConfirmationOnTermsQuery.RegistrationServices this$0;

    public C42624x42d53a17(ConfirmationOnTermsQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ConfirmationOnTermsQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23318c(ConfirmationOnTermsQuery.RegistrationServices.RESPONSE_FIELDS[1], this.this$0.getConfirmationOnTerms());
    }
}
