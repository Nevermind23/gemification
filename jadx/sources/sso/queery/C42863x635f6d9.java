package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.SetupSecurityParametersQuery;

/* renamed from: sso.queery.SetupSecurityParametersQuery$LoginServices$marshaller$$inlined$invoke$1 */
public final class C42863x635f6d9 implements C8122n {
    final /* synthetic */ SetupSecurityParametersQuery.LoginServices this$0;

    public C42863x635f6d9(SetupSecurityParametersQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(SetupSecurityParametersQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = SetupSecurityParametersQuery.LoginServices.RESPONSE_FIELDS[1];
        SetupSecurityParametersQuery.SetupSecurityParameters setupSecurityParameters = this.this$0.getSetupSecurityParameters();
        if (setupSecurityParameters != null) {
            nVar = setupSecurityParameters.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
