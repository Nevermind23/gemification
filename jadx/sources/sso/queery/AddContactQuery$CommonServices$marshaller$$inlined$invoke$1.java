package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.AddContactQuery;

public final class AddContactQuery$CommonServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ AddContactQuery.CommonServices this$0;

    public AddContactQuery$CommonServices$marshaller$$inlined$invoke$1(AddContactQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(AddContactQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(AddContactQuery.CommonServices.RESPONSE_FIELDS[1], this.this$0.getAddContact());
    }
}
