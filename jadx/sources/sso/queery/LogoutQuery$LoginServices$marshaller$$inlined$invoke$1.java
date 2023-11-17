package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogoutQuery;

public final class LogoutQuery$LoginServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ LogoutQuery.LoginServices this$0;

    public LogoutQuery$LoginServices$marshaller$$inlined$invoke$1(LogoutQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LogoutQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(LogoutQuery.LoginServices.RESPONSE_FIELDS[1], this.this$0.getLogout());
    }
}
