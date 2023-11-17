package z20;

import a30.C19151a;
import g91.C32289b0;
import h50.C24882b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p793iw.C25263b;
import p832mv.C26301a;

/* renamed from: z20.a */
public final class C30140a {
    /* renamed from: a */
    private final C19151a m91174a(C26301a.C26302a aVar) {
        return new C19151a(aVar.mo65461f(), true, aVar.mo65459e(), aVar.mo65458d(), (String) null, false, 48, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    private final C19151a m91175b(C26301a.C26304b bVar) {
        C25263b b = bVar.mo65465b();
        return new C19151a(bVar.mo65466c(), false, b.mo63840w(), bVar.mo65457a(), C32289b0.m95093e(C24882b.m79535c(b)), C24882b.m79534b(b));
    }

    /* renamed from: c */
    private final C19151a m91176c(C26301a aVar) {
        if (aVar instanceof C26301a.C26304b) {
            return m91175b((C26301a.C26304b) aVar);
        }
        if (aVar instanceof C26301a.C26302a) {
            return m91174a((C26301a.C26302a) aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public final List mo70492d(List list) {
        C41536l.m120489i(list, "operations");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m91176c((C26301a) it.next()));
        }
        return arrayList;
    }
}
