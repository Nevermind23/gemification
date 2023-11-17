package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$Data$Companion$invoke$1$loginServices$1 */
final class C42706x27d21237 extends C41537m implements C43075l {
    public static final C42706x27d21237 INSTANCE = new C42706x27d21237();

    C42706x27d21237() {
        super(1);
    }

    public final GetPasswordPolicyRulesQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetPasswordPolicyRulesQuery.LoginServices.Companion.invoke(oVar);
    }
}
