package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetUserContactsQuery;

public final class GetUserContactsQuery$CommonServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetUserContactsQuery.CommonServices this$0;

    public GetUserContactsQuery$CommonServices$marshaller$$inlined$invoke$1(GetUserContactsQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetUserContactsQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetUserContactsQuery.CommonServices.RESPONSE_FIELDS[1], this.this$0.getGetUserContacts(), GetUserContactsQuery$CommonServices$marshaller$1$1.INSTANCE);
    }
}
