package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$GetPasswordPolicyRules$Companion$invoke$1$rules$1 */
final class C42709xd074a29d extends C41537m implements C43075l {
    public static final C42709xd074a29d INSTANCE = new C42709xd074a29d();

    C42709xd074a29d() {
        super(1);
    }

    public final GetPasswordPolicyRulesQuery.Rule invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetPasswordPolicyRulesQuery.Rule) bVar.mo19033b(C427101.INSTANCE);
    }
}
