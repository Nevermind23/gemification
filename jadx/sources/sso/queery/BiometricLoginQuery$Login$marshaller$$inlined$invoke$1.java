package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.BiometricLoginQuery;

public final class BiometricLoginQuery$Login$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ BiometricLoginQuery.Login this$0;

    public BiometricLoginQuery$Login$marshaller$$inlined$invoke$1(BiometricLoginQuery.Login login) {
        this.this$0 = login;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(BiometricLoginQuery.Login.RESPONSE_FIELDS[0], this.this$0.get__typename());
        this.this$0.getFragments().marshaller().marshal(pVar);
    }
}
