package sso.queery;

import android.support.p013v4.media.session.C0125b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8135p;
import sso.queery.GetPasswordPolicyRulesQuery;
import ue1.C43079p;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$GetPasswordPolicyRules$marshaller$1$1 */
final class C42711xcd2aa0d5 extends C41537m implements C43079p {
    public static final C42711xcd2aa0d5 INSTANCE = new C42711xcd2aa0d5();

    C42711xcd2aa0d5() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C0125b.m366a(obj2);
        invoke((List<GetPasswordPolicyRulesQuery.Level>) (List) obj, (C8135p.C8136a) null);
        return C41238w.f97225a;
    }

    public final void invoke(List<GetPasswordPolicyRulesQuery.Level> list, C8135p.C8136a aVar) {
        C41536l.m120489i(aVar, "listItemWriter");
        if (list != null) {
            for (GetPasswordPolicyRulesQuery.Level level : list) {
                aVar.mo23324b(level != null ? level.marshaller() : null);
            }
        }
    }
}
