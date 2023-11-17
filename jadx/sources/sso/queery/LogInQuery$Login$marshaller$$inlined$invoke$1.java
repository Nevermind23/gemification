package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogInQuery;

public final class LogInQuery$Login$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ LogInQuery.Login this$0;

    public LogInQuery$Login$marshaller$$inlined$invoke$1(LogInQuery.Login login) {
        this.this$0 = login;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LogInQuery.Login.RESPONSE_FIELDS[0], this.this$0.get__typename());
        this.this$0.getFragments().marshaller().marshal(pVar);
    }
}
