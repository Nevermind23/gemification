package p341ge.bog.mobilebank.insurance.presentation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26248b;
import ml0.C26252e;
import ml0.C26254g;
import nl0.C26553j;
import p341ge.bog.mobilebank.insurance.presentation.C24476b;
import p341ge.bog.mobilebank.insurance.presentation.C24479c;

/* renamed from: ge.bog.mobilebank.insurance.presentation.h */
public final class C24508h {

    /* renamed from: a */
    public static final C24509a f63218a = new C24509a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.insurance.presentation.h$a */
    public static final class C24509a {
        private C24509a() {
        }

        public /* synthetic */ C24509a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List mo62485a(C26248b bVar) {
        C41536l.m120489i(bVar, "polices");
        ArrayList arrayList = new ArrayList();
        List<C26252e> a = bVar.mo65271a();
        if (a != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
            for (C26252e eVar : a) {
                arrayList2.add(new C24476b.C24477a(eVar.mo65311w(), eVar.mo65313y(), eVar.mo65312x(), eVar));
            }
            arrayList.addAll(arrayList2);
        }
        List<C26254g> b = bVar.mo65272b();
        if (b != null) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(b, 10));
            for (C26254g gVar : b) {
                arrayList3.add(new C24476b.C24478b(gVar.mo65342u(), gVar.mo65344w(), gVar.mo65343v(), C41536l.m120484d(gVar.mo65339s(), "AMX"), gVar));
            }
            arrayList.addAll(arrayList3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : arrayList) {
            String a2 = ((C24476b) next).mo62463a();
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a2, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList<C26553j> arrayList4 = new ArrayList<>(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            List list = (List) value.getValue();
            arrayList4.add(new C26553j(((C24476b) C41358y.m120007W(list)).mo62465c(), ((C24476b) C41358y.m120007W(list)).mo62464b(), list));
        }
        ArrayList arrayList5 = new ArrayList(C41343r.m119925u(arrayList4, 10));
        for (C26553j dVar : arrayList4) {
            arrayList5.add(new C24479c.C24483d(dVar));
        }
        return C41358y.m120036z0(arrayList5);
    }
}
