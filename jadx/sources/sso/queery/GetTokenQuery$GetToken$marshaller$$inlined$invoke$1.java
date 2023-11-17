package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTokenQuery;

public final class GetTokenQuery$GetToken$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetTokenQuery.GetToken this$0;

    public GetTokenQuery$GetToken$marshaller$$inlined$invoke$1(GetTokenQuery.GetToken getToken) {
        this.this$0 = getToken;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTokenQuery.GetToken.RESPONSE_FIELDS[0], this.this$0.get__typename());
        this.this$0.getFragments().marshaller().marshal(pVar);
    }
}
