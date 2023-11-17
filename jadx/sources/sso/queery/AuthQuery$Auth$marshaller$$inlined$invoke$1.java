package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.AuthQuery;

public final class AuthQuery$Auth$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ AuthQuery.Auth this$0;

    public AuthQuery$Auth$marshaller$$inlined$invoke$1(AuthQuery.Auth auth) {
        this.this$0 = auth;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(AuthQuery.Auth.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(AuthQuery.Auth.RESPONSE_FIELDS[1], this.this$0.getToken());
    }
}
