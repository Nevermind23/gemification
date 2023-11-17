package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTurnoverTypesQuery;

/* renamed from: sso.queery.GetTurnoverTypesQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42767x6a001f78 implements C8122n {
    final /* synthetic */ GetTurnoverTypesQuery.RegistrationServices this$0;

    public C42767x6a001f78(GetTurnoverTypesQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTurnoverTypesQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetTurnoverTypesQuery.RegistrationServices.RESPONSE_FIELDS[1], this.this$0.getGetTurnoverTypes(), GetTurnoverTypesQuery$RegistrationServices$marshaller$1$1.INSTANCE);
    }
}
