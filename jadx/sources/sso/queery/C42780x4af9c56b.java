package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetUsernamePolicyRulesQuery;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$LoginServices$marshaller$$inlined$invoke$1 */
public final class C42780x4af9c56b implements C8122n {
    final /* synthetic */ GetUsernamePolicyRulesQuery.LoginServices this$0;

    public C42780x4af9c56b(GetUsernamePolicyRulesQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetUsernamePolicyRulesQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetUsernamePolicyRulesQuery.LoginServices.RESPONSE_FIELDS[1];
        GetUsernamePolicyRulesQuery.GetUsernamePolicyRules getUsernamePolicyRules = this.this$0.getGetUsernamePolicyRules();
        if (getUsernamePolicyRules != null) {
            nVar = getUsernamePolicyRules.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
