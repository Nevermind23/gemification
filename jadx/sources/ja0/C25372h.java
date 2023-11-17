package ja0;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import ka0.C25695d;
import ka0.C25696e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import la0.C25865a;
import ue1.C43075l;

/* renamed from: ja0.h */
public final class C25372h {

    /* renamed from: a */
    private final C25865a f65019a;

    /* renamed from: ja0.h$a */
    static final class C25373a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25373a f65020d = new C25373a();

        C25373a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "depositTypes");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (C41341q.m119910m(C25695d.CALL, C25695d.ENLARG, C25695d.TERM, C25695d.PREMIUM).contains(((C25696e) next).mo64221g())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public C25372h(C25865a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f65019a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m80547c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo63959b() {
        C40762x A = this.f65019a.mo56595a().mo95062A(new C25371g(C25373a.f65020d));
        C41536l.m120488h(A, "repository.getDepositTyp…)\n            }\n        }");
        return A;
    }
}
