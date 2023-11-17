package e61;

import ed1.C40762x;
import f61.C31927a;
import f61.C31928b;
import f61.C31931c;
import f61.C31932d;
import f61.C31933e;
import f61.C31934f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: e61.g */
public final class C31677g {

    /* renamed from: a */
    private final C31675e f78267a;

    public C31677g(C31675e eVar) {
        C41536l.m120489i(eVar, "isStorySeen");
        this.f78267a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m93823c(List list, C31677g gVar) {
        List list2 = list;
        C31677g gVar2 = gVar;
        C41536l.m120489i(list2, "$list");
        C41536l.m120489i(gVar2, "this$0");
        int i = 10;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31932d dVar = (C31932d) it.next();
            List<C31931c> c = dVar.mo72403c();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(c, i));
            for (C31931c cVar : c) {
                arrayList2.add(C31931c.m94284b(cVar, 0, (String) null, (String) null, (String) null, (String) null, (C31928b) null, (C31928b) null, (C31927a) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, gVar2.f78267a.mo72095a(cVar.mo72397o()), (C31934f) null, 98303, (Object) null));
            }
            arrayList.add(C31932d.m94302b(dVar, (C31933e) null, arrayList2, 1, (Object) null));
            i = 10;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C40762x mo72097b(List list) {
        C41536l.m120489i(list, "list");
        C40762x v = C40762x.m118160v(new C31676f(list, this));
        C41536l.m120488h(v, "fromCallable {\n\n        …        )\n        }\n    }");
        return v;
    }
}
