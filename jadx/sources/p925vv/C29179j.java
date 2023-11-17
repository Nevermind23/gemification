package p925vv;

import ed1.C40762x;
import he1.C41224m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p750ew.C20300c;
import p760fw.C20575a;
import p936wv.C29582h;
import p947xv.C29860a;

/* renamed from: vv.j */
public final class C29179j {

    /* renamed from: a */
    private final C29860a f74197a;

    /* renamed from: b */
    private final C20300c f74198b;

    public C29179j(C29860a aVar, C20300c cVar) {
        C41536l.m120489i(aVar, "budgetingRepository");
        C41536l.m120489i(cVar, "transactionCategoriesUseCase");
        this.f74197a = aVar;
        this.f74198b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C41224m m89116c(C29582h hVar, List list) {
        C41536l.m120489i(hVar, "budgets");
        C41536l.m120489i(list, "categories");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C20575a) next).mo49105e()) {
                arrayList.add(next);
            }
        }
        return new C41224m(hVar, arrayList);
    }

    /* renamed from: b */
    public final C40762x mo69017b(List list, List list2) {
        C41536l.m120489i(list, "updatedBudgets");
        C41536l.m120489i(list2, "createdBudgets");
        C40762x T = C40762x.m118154T(this.f74197a.mo70103n2(list, list2), this.f74198b.mo48784a(), new C29178i());
        C41536l.m120488h(T, "zip(\n                bud…              }\n        )");
        return T;
    }
}
