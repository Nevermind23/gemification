package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.SetupSecurityParametersQuery;

/* renamed from: sso.queery.SetupSecurityParametersQuery$SetupSecurityParameters$marshaller$$inlined$invoke$1 */
public final class C42867x7e153359 implements C8122n {
    final /* synthetic */ SetupSecurityParametersQuery.SetupSecurityParameters this$0;

    public C42867x7e153359(SetupSecurityParametersQuery.SetupSecurityParameters setupSecurityParameters) {
        this.this$0 = setupSecurityParameters;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(SetupSecurityParametersQuery.SetupSecurityParameters.RESPONSE_FIELDS[0], this.this$0.get__typename());
        this.this$0.getFragments().marshaller().marshal(pVar);
    }
}
