package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.AddContactQuery;

public final class AddContactQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ AddContactQuery.Data this$0;

    public AddContactQuery$Data$marshaller$$inlined$invoke$1(AddContactQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = AddContactQuery.Data.RESPONSE_FIELDS[0];
        AddContactQuery.CommonServices commonServices = this.this$0.getCommonServices();
        if (commonServices != null) {
            nVar = commonServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
