package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetLegalAddressQuery;

/* renamed from: sso.queery.GetLegalAddressQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42666xe4f7f7d9 implements C8122n {
    final /* synthetic */ GetLegalAddressQuery.RegistrationServices this$0;

    public C42666xe4f7f7d9(GetLegalAddressQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetLegalAddressQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetLegalAddressQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetLegalAddressQuery.GetLegalAddress getLegalAddress = this.this$0.getGetLegalAddress();
        if (getLegalAddress != null) {
            nVar = getLegalAddress.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
