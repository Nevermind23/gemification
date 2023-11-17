package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.CheckCardDataQuery;

/* renamed from: sso.queery.CheckCardDataQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42604x4e1baa28 implements C8122n {
    final /* synthetic */ CheckCardDataQuery.RegistrationServices this$0;

    public C42604x4e1baa28(CheckCardDataQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(CheckCardDataQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = CheckCardDataQuery.RegistrationServices.RESPONSE_FIELDS[1];
        CheckCardDataQuery.CheckCardData checkCardData = this.this$0.getCheckCardData();
        if (checkCardData != null) {
            nVar = checkCardData.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
