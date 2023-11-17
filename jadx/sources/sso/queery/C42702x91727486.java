package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetPasswordPolicyRulesQuery;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$LoginServices$marshaller$$inlined$invoke$1 */
public final class C42702x91727486 implements C8122n {
    final /* synthetic */ GetPasswordPolicyRulesQuery.LoginServices this$0;

    public C42702x91727486(GetPasswordPolicyRulesQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetPasswordPolicyRulesQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetPasswordPolicyRulesQuery.LoginServices.RESPONSE_FIELDS[1];
        GetPasswordPolicyRulesQuery.GetPasswordPolicyRules getPasswordPolicyRules = this.this$0.getGetPasswordPolicyRules();
        if (getPasswordPolicyRules != null) {
            nVar = getPasswordPolicyRules.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
