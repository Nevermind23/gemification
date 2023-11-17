package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetUsernamePolicyRulesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$GetUsernamePolicyRules$Companion$invoke$1$rules$1 */
final class C42785xfe0ec013 extends C41537m implements C43075l {
    public static final C42785xfe0ec013 INSTANCE = new C42785xfe0ec013();

    C42785xfe0ec013() {
        super(1);
    }

    public final GetUsernamePolicyRulesQuery.Rule invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetUsernamePolicyRulesQuery.Rule) bVar.mo19033b(C427861.INSTANCE);
    }
}
