package j40;

import android.graphics.Color;
import he1.C41224m;
import i40.C25115a;
import i40.C25116b;
import i40.C25117c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p760fw.C20575a;
import p936wv.C29575a;
import p936wv.C29576b;
import p936wv.C29577c;
import p936wv.C29578d;
import p936wv.C29579e;
import p936wv.C29580f;
import p936wv.C29581g;
import p936wv.C29582h;
import r90.C27950a;

/* renamed from: j40.a */
public final class C25326a {

    /* renamed from: j40.a$a */
    public static final class C25327a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29575a) obj).mo69424e(), ((C29575a) obj2).mo69424e());
        }
    }

    /* renamed from: j40.a$b */
    public static final class C25328b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C25115a) obj).mo63635h(), ((C25115a) obj2).mo63635h());
        }
    }

    /* renamed from: j40.a$c */
    public static final class C25329c implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((AddBudgetModel) obj).mo54894j(), ((AddBudgetModel) obj2).mo54894j());
        }
    }

    /* renamed from: j40.a$d */
    public static final class C25330d implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C25115a) obj).mo63635h(), ((C25115a) obj2).mo63635h());
        }
    }

    /* renamed from: j40.a$e */
    public static final class C25331e implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C25115a) obj).mo63635h(), ((C25115a) obj2).mo63635h());
        }
    }

    /* renamed from: j40.a$f */
    public static final class C25332f implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((AddBudgetModel) obj).mo54894j(), ((AddBudgetModel) obj2).mo54894j());
        }
    }

    /* renamed from: a */
    private final AddBudgetModel m80495a(HashMap hashMap, C20575a aVar) {
        long j;
        BigDecimal bigDecimal;
        Long c;
        HashMap hashMap2 = hashMap;
        C29575a aVar2 = (C29575a) hashMap2.get(Long.valueOf(aVar.mo49102b()));
        if (aVar2 == null || (c = aVar2.mo69422c()) == null) {
            j = 0;
        } else {
            j = c.longValue();
        }
        ArrayList arrayList = new ArrayList();
        long b = aVar.mo49102b();
        String j2 = m80501j(aVar.mo49103c(), aVar.mo49108g());
        boolean containsKey = hashMap2.containsKey(Long.valueOf(aVar.mo49102b()));
        String a = aVar.mo49101a();
        int parseColor = Color.parseColor("#" + a);
        C29575a aVar3 = (C29575a) hashMap2.get(Long.valueOf(aVar.mo49102b()));
        if (aVar3 == null || (bigDecimal = aVar3.mo69430i()) == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120488h(bigDecimal2, "budgetIds[category.catId…       ?: BigDecimal.ZERO");
        return new AddBudgetModel(j, arrayList, b, j2, containsKey, parseColor, bigDecimal2, false, (String) null, aVar.mo49109h(), false, 1408, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    private final AddBudgetModel m80496b(C20575a aVar, C29576b bVar, boolean z) {
        String str;
        long j;
        Long c;
        Float f = null;
        if (bVar != null) {
            str = bVar.mo69434b();
        } else {
            str = null;
        }
        if (str != null) {
            str = C27950a.m86287d(str, false, 2, (Object) null);
        }
        String str2 = str;
        if (bVar == null || (c = bVar.mo69435c()) == null) {
            j = 0;
        } else {
            j = c.longValue();
        }
        long j2 = j;
        ArrayList arrayList = new ArrayList();
        long b = aVar.mo49102b();
        String j3 = m80501j(aVar.mo49103c(), aVar.mo49108g());
        int parseColor = Color.parseColor("#" + aVar.mo49101a());
        if (bVar != null) {
            f = Float.valueOf(bVar.mo69436d());
        }
        C41536l.m120486f(f);
        BigDecimal valueOf = BigDecimal.valueOf((double) f.floatValue());
        C41536l.m120488h(valueOf, "valueOf(budget?.value!!.toDouble())");
        return new AddBudgetModel(j2, arrayList, b, j3, z, parseColor, valueOf, false, str2, aVar.mo49109h(), false, 1152, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    private final C25115a m80497c(C29575a aVar) {
        return new C25115a(new ArrayList(), aVar.mo69422c(), aVar.mo69420a(), aVar.mo69426f(), aVar.mo69421b(), aVar.mo69431j(), aVar.mo69423d(), aVar.mo69427g(), aVar.mo69428h(), aVar.mo69430i(), aVar.mo69424e());
    }

    /* renamed from: d */
    private final C25115a m80498d(C29575a aVar, List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m80497c((C29575a) it.next()));
        }
        return new C25115a(arrayList, aVar.mo69422c(), aVar.mo69420a(), aVar.mo69426f(), aVar.mo69421b(), aVar.mo69431j(), aVar.mo69423d(), aVar.mo69427g(), aVar.mo69428h(), aVar.mo69430i(), aVar.mo69424e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x008f A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m80499g(java.util.List r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r15.iterator()
        L_0x000e:
            boolean r3 = r2.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r2.next()
            r6 = r3
            wv.a r6 = (p936wv.C29575a) r6
            java.lang.Long r6 = r6.mo69426f()
            if (r6 != 0) goto L_0x0024
            r4 = r5
        L_0x0024:
            if (r4 == 0) goto L_0x000e
            r1.add(r3)
            goto L_0x000e
        L_0x002a:
            java.util.List r1 = ie1.C41358y.m119991B0(r1)
            int r2 = r1.size()
            if (r2 <= r5) goto L_0x003c
            j40.a$a r2 = new j40.a$a
            r2.<init>()
            ie1.C41349u.m119946y(r1, r2)
        L_0x003c:
            java.util.Iterator r2 = r1.iterator()
        L_0x0040:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r2.next()
            wv.a r3 = (p936wv.C29575a) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r15.iterator()
        L_0x0055:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x007e
            java.lang.Object r8 = r7.next()
            r9 = r8
            wv.a r9 = (p936wv.C29575a) r9
            java.lang.Long r9 = r9.mo69426f()
            long r10 = r3.mo69420a()
            if (r9 != 0) goto L_0x006d
            goto L_0x0077
        L_0x006d:
            long r12 = r9.longValue()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0077
            r9 = r5
            goto L_0x0078
        L_0x0077:
            r9 = r4
        L_0x0078:
            if (r9 == 0) goto L_0x0055
            r6.add(r8)
            goto L_0x0055
        L_0x007e:
            i40.a r3 = r14.m80498d(r3, r6)
            r0.add(r3)
            goto L_0x0040
        L_0x0086:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x008f:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x00de
            java.lang.Object r3 = r15.next()
            r6 = r3
            wv.a r6 = (p936wv.C29575a) r6
            java.lang.Long r7 = r6.mo69426f()
            if (r7 == 0) goto L_0x00d7
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            r6 = r4
            goto L_0x00d3
        L_0x00aa:
            java.util.Iterator r7 = r1.iterator()
        L_0x00ae:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r7.next()
            wv.a r8 = (p936wv.C29575a) r8
            long r8 = r8.mo69420a()
            java.lang.Long r10 = r6.mo69426f()
            if (r10 != 0) goto L_0x00c5
            goto L_0x00cf
        L_0x00c5:
            long r10 = r10.longValue()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00cf
            r8 = r5
            goto L_0x00d0
        L_0x00cf:
            r8 = r4
        L_0x00d0:
            if (r8 == 0) goto L_0x00ae
            r6 = r5
        L_0x00d3:
            if (r6 != 0) goto L_0x00d7
            r6 = r5
            goto L_0x00d8
        L_0x00d7:
            r6 = r4
        L_0x00d8:
            if (r6 == 0) goto L_0x008f
            r2.add(r3)
            goto L_0x008f
        L_0x00de:
            java.util.ArrayList r15 = new java.util.ArrayList
            r1 = 10
            int r1 = ie1.C41343r.m119925u(r2, r1)
            r15.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x00ed:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0101
            java.lang.Object r2 = r1.next()
            wv.a r2 = (p936wv.C29575a) r2
            i40.a r2 = r14.m80497c(r2)
            r15.add(r2)
            goto L_0x00ed
        L_0x0101:
            java.util.List r15 = ie1.C41358y.m119991B0(r15)
            int r1 = r15.size()
            if (r1 <= r5) goto L_0x0113
            j40.a$b r1 = new j40.a$b
            r1.<init>()
            ie1.C41349u.m119946y(r15, r1)
        L_0x0113:
            r0.addAll(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j40.C25326a.m80499g(java.util.List):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0053 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m80500h(java.util.List r17, java.util.List r18) {
        /*
            r16 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r17.iterator()
        L_0x0009:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()
            r5 = r2
            i40.a r5 = (i40.C25115a) r5
            java.lang.Long r5 = r5.mo63637i()
            if (r5 == 0) goto L_0x001f
            r3 = r4
        L_0x001f:
            if (r3 == 0) goto L_0x0009
            r0.add(r2)
            goto L_0x0009
        L_0x0025:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r17.iterator()
        L_0x002e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x004a
            java.lang.Object r5 = r2.next()
            r6 = r5
            i40.a r6 = (i40.C25115a) r6
            java.lang.Long r6 = r6.mo63637i()
            if (r6 != 0) goto L_0x0043
            r6 = r4
            goto L_0x0044
        L_0x0043:
            r6 = r3
        L_0x0044:
            if (r6 == 0) goto L_0x002e
            r1.add(r5)
            goto L_0x002e
        L_0x004a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0098
            java.lang.Object r5 = r0.next()
            r6 = r5
            i40.a r6 = (i40.C25115a) r6
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x0068
        L_0x0066:
            r6 = r3
            goto L_0x0091
        L_0x0068:
            java.util.Iterator r7 = r1.iterator()
        L_0x006c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0066
            java.lang.Object r8 = r7.next()
            i40.a r8 = (i40.C25115a) r8
            long r8 = r8.mo63629c()
            java.lang.Long r10 = r6.mo63637i()
            if (r10 != 0) goto L_0x0083
            goto L_0x008d
        L_0x0083:
            long r10 = r10.longValue()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            r8 = r4
            goto L_0x008e
        L_0x008d:
            r8 = r3
        L_0x008e:
            if (r8 == 0) goto L_0x006c
            r6 = r4
        L_0x0091:
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0053
            r2.add(r5)
            goto L_0x0053
        L_0x0098:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r5 = r17.iterator()
        L_0x00a6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r5.next()
            i40.a r6 = (i40.C25115a) r6
            long r7 = r6.mo63629c()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r1.put(r7, r6)
            goto L_0x00a6
        L_0x00be:
            java.util.Iterator r5 = r18.iterator()
        L_0x00c2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x012f
            java.lang.Object r6 = r5.next()
            fw.a r6 = (p760fw.C20575a) r6
            long r7 = r6.mo49102b()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            boolean r7 = r1.containsKey(r7)
            if (r7 == 0) goto L_0x00c2
            long r7 = r6.mo49102b()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r7 = r1.get(r7)
            i40.a r7 = (i40.C25115a) r7
            kotlin.jvm.internal.C41536l.m120486f(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r17.iterator()
        L_0x00f6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011f
            java.lang.Object r10 = r9.next()
            r11 = r10
            i40.a r11 = (i40.C25115a) r11
            java.lang.Long r11 = r11.mo63637i()
            long r12 = r6.mo49102b()
            if (r11 != 0) goto L_0x010e
            goto L_0x0118
        L_0x010e:
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0118
            r11 = r4
            goto L_0x0119
        L_0x0118:
            r11 = r3
        L_0x0119:
            if (r11 == 0) goto L_0x00f6
            r8.add(r10)
            goto L_0x00f6
        L_0x011f:
            j40.a$e r6 = new j40.a$e
            r6.<init>()
            java.util.List r6 = ie1.C41358y.m120030t0(r8, r6)
            r7.mo63640l(r6)
            r0.add(r7)
            goto L_0x00c2
        L_0x012f:
            r0.addAll(r2)
            int r1 = r0.size()
            if (r1 <= r4) goto L_0x0140
            j40.a$d r1 = new j40.a$d
            r1.<init>()
            ie1.C41349u.m119946y(r0, r1)
        L_0x0140:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j40.C25326a.m80500h(java.util.List, java.util.List):java.util.List");
    }

    /* renamed from: j */
    private final String m80501j(boolean z, String str) {
        if (z) {
            return str;
        }
        String substring = str.substring(1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        return C27950a.m86287d(substring, false, 2, (Object) null);
    }

    /* renamed from: e */
    public final C25117c mo63895e(C29577c cVar) {
        C41536l.m120489i(cVar, "budgetingDataResponse");
        return new C25117c(m80499g(cVar.mo69441a()), cVar.mo69442b(), cVar.mo69443c(), cVar.mo69444d(), cVar.mo69445e(), cVar.mo69447f(), cVar.mo69448g());
    }

    /* renamed from: f */
    public final List mo63896f(C41224m mVar) {
        Object obj;
        C41536l.m120489i(mVar, "budgetsAndCategories");
        ArrayList arrayList = new ArrayList();
        List<C29575a> a = ((C29581g) mVar.mo95678e()).mo69470a().mo69441a();
        List<C20575a> list = (List) mVar.mo95680f();
        HashMap hashMap = new HashMap();
        for (C29575a aVar : a) {
            hashMap.put(Long.valueOf(aVar.mo69420a()), aVar);
        }
        for (C20575a aVar2 : list) {
            AddBudgetModel a2 = m80495a(hashMap, aVar2);
            List<C20575a> i = aVar2.mo49111i();
            if (i != null) {
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(i, 10));
                for (C20575a a3 : i) {
                    arrayList2.add(Boolean.valueOf(a2.mo54885d().add(m80495a(hashMap, a3))));
                }
            }
            if (!a2.mo54896l()) {
                Iterator it = a2.mo54885d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AddBudgetModel) obj).mo54896l()) {
                        break;
                    }
                }
                if (obj != null) {
                    List d = a2.mo54885d();
                    C41550z zVar = new C41550z();
                    zVar.f97717d = BigDecimal.ZERO;
                    for (Object next : d) {
                        Object obj2 = zVar.f97717d;
                        C41536l.m120488h(obj2, "sum");
                        BigDecimal add = ((BigDecimal) obj2).add(((AddBudgetModel) next).mo54895k());
                        C41536l.m120488h(add, "this.add(other)");
                        zVar.f97717d = add;
                    }
                    Object obj3 = zVar.f97717d;
                    C41536l.m120488h(obj3, "sum");
                    a2.mo54901s((BigDecimal) obj3);
                }
            }
            arrayList.add(a2);
        }
        if (arrayList.size() > 1) {
            C41349u.m119946y(arrayList, new C25329c());
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List mo63897i(C29579e eVar) {
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        Object obj3;
        boolean z3;
        C41550z zVar = new C41550z();
        zVar.f97717d = C41341q.m119907j();
        if (eVar != null) {
            for (C29580f a : eVar.mo69459b()) {
                for (C29578d dVar : a.mo69464a()) {
                    for (C20575a aVar : eVar.mo69460c()) {
                        List i = aVar.mo49111i();
                        if (i != null) {
                            Iterator it = i.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it.next();
                                if (((C20575a) obj3).mo49102b() == dVar.mo69452b()) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                                if (z3) {
                                    break;
                                }
                            }
                            if (((C20575a) obj3) != null) {
                                dVar.mo69454d(Long.valueOf(aVar.mo49102b()));
                            }
                        }
                    }
                }
            }
            List<C29580f> b = eVar.mo69459b();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (C29580f fVar : b) {
                C25116b bVar = r9;
                C25116b bVar2 = new C25116b(fVar.mo69465b(), fVar.mo69466c(), eVar.mo69458a().mo69470a().mo69448g(), (List) null, 8, (DefaultConstructorMarker) null);
                arrayList.add(bVar);
            }
            zVar.f97717d = arrayList;
            List<C29575a> a2 = eVar.mo69458a().mo69470a().mo69441a();
            ArrayList<C25115a> arrayList2 = new ArrayList<>(C41343r.m119925u(a2, 10));
            for (C29575a c : a2) {
                arrayList2.add(m80497c(c));
            }
            int size = eVar.mo69459b().size();
            for (int i2 = 0; i2 < size; i2++) {
                C29580f fVar2 = (C29580f) eVar.mo69459b().get(i2);
                List a3 = ((C25116b) ((List) zVar.f97717d).get(i2)).mo63643a();
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
                for (C25115a b2 : arrayList2) {
                    BigDecimal bigDecimal = BigDecimal.ZERO;
                    C41536l.m120488h(bigDecimal, "ZERO");
                    arrayList3.add(C25115a.m80144b(b2, (List) null, (Long) null, 0, (Long) null, (String) null, (Boolean) null, (String) null, (String) null, bigDecimal, (BigDecimal) null, (Integer) null, 1791, (Object) null));
                }
                a3.addAll(arrayList3);
                for (C29578d dVar2 : fVar2.mo69464a()) {
                    Iterator it2 = ((C25116b) ((List) zVar.f97717d).get(i2)).mo63643a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (dVar2.mo69452b() == ((C25115a) obj).mo63629c()) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    C25115a aVar2 = (C25115a) obj;
                    if (aVar2 != null) {
                        aVar2.mo63641m(dVar2.mo69451a());
                    }
                    Iterator it3 = ((C25116b) ((List) zVar.f97717d).get(i2)).mo63643a().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        long c2 = ((C25115a) obj2).mo63629c();
                        Long c3 = dVar2.mo69453c();
                        if (c3 != null && c2 == c3.longValue()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C25115a aVar3 = (C25115a) obj2;
                    if (aVar3 != null) {
                        BigDecimal add = aVar3.mo63638j().add(dVar2.mo69451a());
                        C41536l.m120488h(add, "this.add(other)");
                        aVar3.mo63641m(add);
                    }
                }
                ((C25116b) ((List) zVar.f97717d).get(i2)).mo63647e(m80500h(((C25116b) ((List) zVar.f97717d).get(i2)).mo63643a(), eVar.mo69460c()));
                C25116b bVar3 = (C25116b) ((List) zVar.f97717d).get(i2);
                List a4 = ((C25116b) ((List) zVar.f97717d).get(i2)).mo63643a();
                C41550z zVar2 = new C41550z();
                zVar2.f97717d = BigDecimal.ZERO;
                for (Object next : a4) {
                    Object obj4 = zVar2.f97717d;
                    C41536l.m120488h(obj4, "sum");
                    BigDecimal add2 = ((BigDecimal) obj4).add(((C25115a) next).mo63638j());
                    C41536l.m120488h(add2, "this.add(other)");
                    zVar2.f97717d = add2;
                }
                Object obj5 = zVar2.f97717d;
                C41536l.m120488h(obj5, "sum");
                bVar3.mo63649f((BigDecimal) obj5);
            }
        }
        return (List) zVar.f97717d;
    }

    /* renamed from: k */
    public final List mo63898k(C41224m mVar) {
        String str;
        boolean z;
        String str2;
        boolean z2;
        C41536l.m120489i(mVar, "data");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C29576b bVar : ((C29582h) mVar.mo95678e()).mo69474a()) {
            hashMap.put(Long.valueOf(bVar.mo69433a()), bVar);
        }
        for (C29576b bVar2 : ((C29582h) mVar.mo95678e()).mo69475b()) {
            hashMap.put(Long.valueOf(bVar2.mo69433a()), bVar2);
        }
        for (C20575a aVar : (Iterable) mVar.mo95680f()) {
            if (hashMap.containsKey(Long.valueOf(aVar.mo49102b()))) {
                C29576b bVar3 = (C29576b) hashMap.get(Long.valueOf(aVar.mo49102b()));
                if (bVar3 != null) {
                    str = bVar3.mo69434b();
                } else {
                    str = null;
                }
                if ((str != null || !C41358y.m119999O(((C29582h) mVar.mo95678e()).mo69474a(), bVar3)) && !C41358y.m119999O(((C29582h) mVar.mo95678e()).mo69475b(), bVar3)) {
                    z = false;
                } else {
                    z = true;
                }
                AddBudgetModel b = m80496b(aVar, bVar3, z);
                List<C20575a> i = aVar.mo49111i();
                if (i != null) {
                    for (C20575a aVar2 : i) {
                        C29576b bVar4 = (C29576b) hashMap.get(Long.valueOf(aVar2.mo49102b()));
                        if (bVar4 != null) {
                            str2 = bVar4.mo69434b();
                        } else {
                            str2 = null;
                        }
                        if ((str2 != null || !C41358y.m119999O(((C29582h) mVar.mo95678e()).mo69474a(), bVar4)) && !C41358y.m119999O(((C29582h) mVar.mo95678e()).mo69475b(), bVar4)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (bVar4 != null) {
                            b.mo54885d().add(m80496b(aVar2, bVar4, z2));
                        }
                    }
                }
                arrayList.add(b);
            }
        }
        if (arrayList.size() > 1) {
            C41349u.m119946y(arrayList, new C25332f());
        }
        return arrayList;
    }
}
