package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$LoginServices$Companion$invoke$1$getPasswordPolicyRules$1 */
final class C42715xfd04369b extends C41537m implements C43075l {
    public static final C42715xfd04369b INSTANCE = new C42715xfd04369b();

    C42715xfd04369b() {
        super(1);
    }

    public final GetPasswordPolicyRulesQuery.GetPasswordPolicyRules invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetPasswordPolicyRulesQuery.GetPasswordPolicyRules.Companion.invoke(oVar);
    }
}
