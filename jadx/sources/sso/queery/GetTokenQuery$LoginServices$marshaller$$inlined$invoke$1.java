package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTokenQuery;

public final class GetTokenQuery$LoginServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetTokenQuery.LoginServices this$0;

    public GetTokenQuery$LoginServices$marshaller$$inlined$invoke$1(GetTokenQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTokenQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetTokenQuery.LoginServices.RESPONSE_FIELDS[1];
        GetTokenQuery.GetToken getToken = this.this$0.getGetToken();
        if (getToken != null) {
            nVar = getToken.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
