package sso.queery;

import android.support.p013v4.media.session.C0125b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8135p;
import sso.queery.GetUsernamePolicyRulesQuery;
import ue1.C43079p;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$GetUsernamePolicyRules$marshaller$1$1 */
final class C42787x4a9cbf4b extends C41537m implements C43079p {
    public static final C42787x4a9cbf4b INSTANCE = new C42787x4a9cbf4b();

    C42787x4a9cbf4b() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C0125b.m366a(obj2);
        invoke((List<GetUsernamePolicyRulesQuery.Rule>) (List) obj, (C8135p.C8136a) null);
        return C41238w.f97225a;
    }

    public final void invoke(List<GetUsernamePolicyRulesQuery.Rule> list, C8135p.C8136a aVar) {
        C41536l.m120489i(aVar, "listItemWriter");
        if (list != null) {
            for (GetUsernamePolicyRulesQuery.Rule rule : list) {
                aVar.mo23324b(rule != null ? rule.marshaller() : null);
            }
        }
    }
}
