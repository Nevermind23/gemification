package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.BiometricLoginQuery;

public final class BiometricLoginQuery$LoginServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ BiometricLoginQuery.LoginServices this$0;

    public BiometricLoginQuery$LoginServices$marshaller$$inlined$invoke$1(BiometricLoginQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(BiometricLoginQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = BiometricLoginQuery.LoginServices.RESPONSE_FIELDS[1];
        BiometricLoginQuery.Login login = this.this$0.getLogin();
        if (login != null) {
            nVar = login.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
