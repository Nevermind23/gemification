package sso.queery;

import android.support.p013v4.media.session.C0125b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8135p;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43079p;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$GetPasswordPolicyRules$marshaller$1$2 */
final class C42712xcd2aa0d6 extends C41537m implements C43079p {
    public static final C42712xcd2aa0d6 INSTANCE = new C42712xcd2aa0d6();

    C42712xcd2aa0d6() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C0125b.m366a(obj2);
        invoke((List<GetPasswordPolicyRulesQuery.Rule>) (List) obj, (C8135p.C8136a) null);
        return C41238w.f97225a;
    }

    public final void invoke(List<GetPasswordPolicyRulesQuery.Rule> list, C8135p.C8136a aVar) {
        C41536l.m120489i(aVar, "listItemWriter");
        if (list != null) {
            for (GetPasswordPolicyRulesQuery.Rule rule : list) {
                aVar.mo23324b(rule != null ? rule.marshaller() : null);
            }
        }
    }
}
