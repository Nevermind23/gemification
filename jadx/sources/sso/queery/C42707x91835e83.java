package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$GetPasswordPolicyRules$Companion$invoke$1$levels$1 */
final class C42707x91835e83 extends C41537m implements C43075l {
    public static final C42707x91835e83 INSTANCE = new C42707x91835e83();

    C42707x91835e83() {
        super(1);
    }

    public final GetPasswordPolicyRulesQuery.Level invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetPasswordPolicyRulesQuery.Level) bVar.mo19033b(C427081.INSTANCE);
    }
}
