package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GenerateAuthTokenQuery;

/* renamed from: sso.queery.GenerateAuthTokenQuery$LoginServices$marshaller$$inlined$invoke$1 */
public final class C42628x78e55d6e implements C8122n {
    final /* synthetic */ GenerateAuthTokenQuery.LoginServices this$0;

    public C42628x78e55d6e(GenerateAuthTokenQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GenerateAuthTokenQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GenerateAuthTokenQuery.LoginServices.RESPONSE_FIELDS[1], this.this$0.getGenerateAuthToken());
    }
}
