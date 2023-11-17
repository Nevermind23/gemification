package px0;

import cx0.C31453a;
import cx0.C31456c;
import he1.C41224m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37833c;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p748eu.C20292b;
import p758fu.C20557a;
import sx0.C38574b;

/* renamed from: px0.d */
public final class C38029d {

    /* renamed from: b */
    public static final C38030a f91372b = new C38030a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f91373a;

    /* renamed from: px0.d$a */
    public static final class C38030a {
        private C38030a() {
        }

        public /* synthetic */ C38030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: px0.d$b */
    public static final class C38031b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C31456c) obj).mo71852c().mo71830m()), Integer.valueOf(((C31456c) obj2).mo71852c().mo71830m()));
        }
    }

    /* renamed from: px0.d$c */
    public static final class C38032c implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C31456c) obj).mo71852c().mo71830m()), Integer.valueOf(((C31456c) obj2).mo71852c().mo71830m()));
        }
    }

    /* renamed from: px0.d$d */
    public static final class C38033d implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C31456c) obj).mo71852c().mo71830m()), Integer.valueOf(((C31456c) obj2).mo71852c().mo71830m()));
        }
    }

    /* renamed from: px0.d$e */
    public static final class C38034e implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C31456c) obj).mo71852c().mo71830m()), Integer.valueOf(((C31456c) obj2).mo71852c().mo71830m()));
        }
    }

    public C38029d(C20292b bVar) {
        int i;
        Double c;
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C20557a b = bVar.mo48775b("PAYMENT_SUBCATEGORY_PROVIDERS_MAX_COUNT");
        if (b == null || (c = b.mo49086c()) == null) {
            i = 4;
        } else {
            i = (int) c.doubleValue();
        }
        this.f91373a = i;
    }

    /* renamed from: a */
    public final C38035e mo91400a(C31456c cVar) {
        C41536l.m120489i(cVar, "node");
        List t0 = C41358y.m120030t0(cVar.mo71851b().values(), new C38031b());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : t0) {
            if (C41536l.m120484d(((C31456c) next).mo71852c().mo71844z(), Boolean.TRUE)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList, arrayList2);
        C37833c cVar2 = C37833c.f90838a;
        List m = C41341q.m119910m(new C38574b.C38580d(cVar2.mo91140b(), (List) mVar.mo95675a()), new C38574b.C38578c(cVar2.mo91139a(), (List) mVar.mo95676b()));
        StringSource.Dictionary R = cVar2.mo91132R();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : m) {
            if (((C38574b) next2).mo92173b()) {
                arrayList3.add(next2);
            }
        }
        return new C38035e(cVar, R, arrayList3, (String) null, 0, 24, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final C38035e mo91401b(C31456c cVar) {
        C41536l.m120489i(cVar, "node");
        List<C31456c> t0 = C41358y.m120030t0(cVar.mo71851b().values(), new C38032c());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
        for (C31456c cVar2 : t0) {
            arrayList.add(new C38574b.C38576b(C34646b.m101747a(cVar2.mo71852c().mo71837t(), true, new Object[0]), C41358y.m120036z0(cVar2.mo71851b().values()), cVar2, this.f91373a));
        }
        StringSource.Dictionary a = C34646b.m101747a(cVar.mo71852c().mo71837t(), true, new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((C38574b.C38576b) next).mo92173b()) {
                arrayList2.add(next);
            }
        }
        return new C38035e(cVar, a, arrayList2, "", 0, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final C38035e mo91402c(List list, List list2, String str, C31456c cVar) {
        String str2;
        C31453a c;
        C41536l.m120489i(list, "payments");
        C41536l.m120489i(list2, "templates");
        C41536l.m120489i(str, "query");
        C41536l.m120489i(cVar, "node");
        List t0 = C41358y.m120030t0(list, new C38033d());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : t0) {
            if (((C31456c) next).mo71854e()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C41224m mVar = new C41224m(arrayList, arrayList2);
        List<C31456c> list3 = (List) mVar.mo95675a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : (List) mVar.mo95676b()) {
            C31456c d = ((C31456c) next2).mo71853d();
            Object obj = linkedHashMap.get(d);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(d, obj);
            }
            ((List) obj).add(next2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C31456c cVar2 = (C31456c) entry.getKey();
            if (cVar2 == null || (c = cVar2.mo71852c()) == null || (str2 = c.mo71837t()) == null) {
                str2 = "";
            }
            arrayList3.add(new C38574b.C38582e(C34646b.m101747a(str2, true, new Object[0]), (List) entry.getValue()));
        }
        ArrayList arrayList4 = new ArrayList(C41343r.m119925u(list3, 10));
        for (C31456c cVar3 : list3) {
            arrayList4.add(new C38574b.C38582e(C34646b.m101747a(cVar3.mo71852c().mo71837t(), true, new Object[0]), C41358y.m120036z0(cVar3.mo71851b().values())));
        }
        List m0 = C41358y.m120023m0(C41358y.m120023m0(C41339p.m119900e(new C38574b.C38584f(C37833c.f90838a.mo91134T(), list2)), arrayList3), arrayList4);
        List arrayList5 = new ArrayList();
        for (Object next3 : m0) {
            if (((C38574b) next3).mo92173b()) {
                arrayList5.add(next3);
            }
        }
        if (arrayList5.isEmpty()) {
            arrayList5 = C41339p.m119900e(C38574b.C38575a.f92420b);
        }
        return new C38035e(cVar, C37833c.f90838a.mo91133S(), arrayList5, str, 0, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final C38035e mo91403d(C31456c cVar) {
        C41536l.m120489i(cVar, "node");
        List e = C41339p.m119900e(new C38574b.C38582e(C34646b.m101747a(cVar.mo71852c().mo71837t(), true, new Object[0]), C41358y.m120030t0(cVar.mo71851b().values(), new C38034e())));
        StringSource.Dictionary f = C37833c.f90838a.mo91144f();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (((C38574b.C38582e) next).mo92173b()) {
                arrayList.add(next);
            }
        }
        return new C38035e(cVar, f, arrayList, (String) null, 0, 24, (DefaultConstructorMarker) null);
    }
}
