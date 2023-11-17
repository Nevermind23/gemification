package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowContactsQuery;

public final class GetResetFlowContactsQuery$Contact$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetResetFlowContactsQuery.Contact this$0;

    public GetResetFlowContactsQuery$Contact$marshaller$$inlined$invoke$1(GetResetFlowContactsQuery.Contact contact) {
        this.this$0 = contact;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[1], this.this$0.getHashId());
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[2], this.this$0.getFirstName());
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[3], this.this$0.getFirstNameInt());
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[4], this.this$0.getLastName());
        pVar.mo23319d(GetResetFlowContactsQuery.Contact.RESPONSE_FIELDS[5], this.this$0.getLastNameInt());
    }
}
