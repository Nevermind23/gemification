package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetUsernamePolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$Data$Companion$invoke$1$loginServices$1 */
final class C42784x2ecdf372 extends C41537m implements C43075l {
    public static final C42784x2ecdf372 INSTANCE = new C42784x2ecdf372();

    C42784x2ecdf372() {
        super(1);
    }

    public final GetUsernamePolicyRulesQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetUsernamePolicyRulesQuery.LoginServices.Companion.invoke(oVar);
    }
}
