package p925vv;

import ed1.C40762x;
import he1.C41224m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p750ew.C20300c;
import p760fw.C20575a;
import p936wv.C29581g;
import ue1.C43079p;

/* renamed from: vv.h */
public final class C29176h {

    /* renamed from: a */
    private final C29174f f74194a;

    /* renamed from: b */
    private final C20300c f74195b;

    /* renamed from: vv.h$a */
    static final class C29177a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C29177a f74196d = new C29177a();

        C29177a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C29581g gVar, List list) {
            C41536l.m120489i(gVar, "budgets");
            C41536l.m120489i(list, "categories");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C20575a) next).mo49105e()) {
                    arrayList.add(next);
                }
            }
            return new C41224m(gVar, arrayList);
        }
    }

    public C29176h(C29174f fVar, C20300c cVar) {
        C41536l.m120489i(fVar, "budgetingUseCase");
        C41536l.m120489i(cVar, "transactionCategoriesUseCase");
        this.f74194a = fVar;
        this.f74195b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C41224m m89112c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo69015b() {
        C40762x T = C40762x.m118154T(this.f74194a.mo69014a(), this.f74195b.mo48784a(), new C29175g(C29177a.f74196d));
        C41536l.m120488h(T, "zip(\n            budgeti…)\n            }\n        )");
        return T;
    }
}
