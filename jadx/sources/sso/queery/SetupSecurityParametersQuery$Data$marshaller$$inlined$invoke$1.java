package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.SetupSecurityParametersQuery;

public final class SetupSecurityParametersQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ SetupSecurityParametersQuery.Data this$0;

    public SetupSecurityParametersQuery$Data$marshaller$$inlined$invoke$1(SetupSecurityParametersQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = SetupSecurityParametersQuery.Data.RESPONSE_FIELDS[0];
        SetupSecurityParametersQuery.LoginServices loginServices = this.this$0.getLoginServices();
        if (loginServices != null) {
            nVar = loginServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
