package p839ns;

import com.github.mikephil.charting.utils.Utils;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import g91.C32343x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p342j$.util.DesugarCollections;
import p707as.C19273c;
import p783hv.C25070b;
import p792iv.C25260a;
import p793iw.C25263b;
import p832mv.C26301a;
import p832mv.C26305b;
import p859ps.C27618a;
import p891su.C28261a;

/* renamed from: ns.k */
public final class C26584k implements C25260a {

    /* renamed from: k */
    public static final C26585a f67200k = new C26585a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f67201d;

    /* renamed from: e */
    private final C27618a f67202e;

    /* renamed from: f */
    private Map f67203f = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* renamed from: g */
    private C40765a f67204g;

    /* renamed from: h */
    private Map f67205h;

    /* renamed from: i */
    private C40765a f67206i;

    /* renamed from: j */
    private C40765a f67207j;

    /* renamed from: ns.k$a */
    public static final class C26585a {
        private C26585a() {
        }

        public /* synthetic */ C26585a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C26584k(IRetrofitService iRetrofitService, C27618a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f67201d = iRetrofitService;
        this.f67202e = aVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f67204g = h1;
        this.f67205h = DesugarCollections.synchronizedMap(new LinkedHashMap());
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create()");
        this.f67206i = h12;
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create()");
        this.f67207j = h13;
    }

    /* renamed from: A4 */
    private final C26305b m82982A4(C26305b bVar, double d) {
        if (bVar instanceof C26305b.C26306a) {
            return C26305b.C26306a.m82270g((C26305b.C26306a) bVar, (C28261a) null, d, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 29, (Object) null);
        }
        if (bVar instanceof C26305b.C26307b) {
            return C26305b.C26307b.m82277g((C26305b.C26307b) bVar, (String) null, (String) null, d, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 59, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m82993j4(String str, double d, C26584k kVar) {
        C41536l.m120489i(str, "$title");
        C41536l.m120489i(kVar, "this$0");
        C26301a.C26302a aVar = new C26301a.C26302a(str, d, 0, 4, (DefaultConstructorMarker) null);
        Map map = kVar.f67205h;
        C41536l.m120488h(map, "operations");
        map.put(Long.valueOf(aVar.mo65461f()), aVar);
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83000r4();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m82994k4(C25263b bVar, C26584k kVar) {
        C41536l.m120489i(bVar, "$operation");
        C41536l.m120489i(kVar, "this$0");
        C26301a.C26304b bVar2 = new C26301a.C26304b(bVar, 0, 2, (DefaultConstructorMarker) null);
        if (kVar.f67205h.containsKey(Long.valueOf(bVar2.mo65466c()))) {
            kVar.f67205h.remove(Long.valueOf(bVar.mo63831o()));
        } else {
            Map map = kVar.f67205h;
            C41536l.m120488h(map, "operations");
            map.put(Long.valueOf(bVar.mo63831o()), bVar2);
        }
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83000r4();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final void m82995l4(C28261a aVar, C26584k kVar) {
        C41536l.m120489i(aVar, "$contact");
        C41536l.m120489i(kVar, "this$0");
        C26305b.C26306a aVar2 = new C26305b.C26306a(aVar, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 30, (DefaultConstructorMarker) null);
        if (kVar.f67203f.containsKey(aVar2.mo65470a())) {
            kVar.f67203f.remove(aVar2.mo65470a());
        } else {
            Map map = kVar.f67203f;
            C41536l.m120488h(map, "receivers");
            map.put(aVar2.mo65470a(), aVar2);
        }
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83001s4();
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m82996m4(String str, String str2, C26584k kVar) {
        C41536l.m120489i(str, "$receiverPhoneNumber");
        C41536l.m120489i(str2, "$receiverName");
        C41536l.m120489i(kVar, "this$0");
        C26305b.C26307b bVar = new C26305b.C26307b(str, str2, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 60, (DefaultConstructorMarker) null);
        Map map = kVar.f67203f;
        C41536l.m120488h(map, "receivers");
        map.put(bVar.mo65470a(), bVar);
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83001s4();
    }

    /* renamed from: n4 */
    private final C25070b m82997n4() {
        return (C25070b) this.f67207j.mo95100j1();
    }

    /* renamed from: p4 */
    private final BigDecimal m82998p4() {
        Collection values = this.f67205h.values();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (Object next : values) {
            C41536l.m120488h(bigDecimal, "sum");
            bigDecimal = bigDecimal.add(new BigDecimal(String.valueOf(((C26301a) next).mo65457a())));
            C41536l.m120488h(bigDecimal, "this.add(other)");
        }
        C41536l.m120488h(bigDecimal, "sum");
        return bigDecimal;
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m82999q4(C26584k kVar, boolean z) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m83005w4(z);
    }

    /* renamed from: r4 */
    private final void m83000r4() {
        this.f67206i.onNext(C41358y.m120025o0(C41358y.m120036z0(this.f67205h.values())));
    }

    /* renamed from: s4 */
    private final void m83001s4() {
        this.f67204g.onNext(C41358y.m120025o0(C41358y.m120036z0(this.f67203f.values())));
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m83002t4(C26584k kVar, long j) {
        C41536l.m120489i(kVar, "this$0");
        kVar.f67205h.remove(Long.valueOf(j));
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83000r4();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m83003u4(C26584k kVar, String str) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(str, "$receiverId");
        kVar.f67203f.remove(str);
        m83006x4(kVar, false, 1, (Object) null);
        kVar.m83001s4();
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m83004v4(C26584k kVar) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m83005w4(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Double] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83005w4(boolean r14) {
        /*
            r13 = this;
            java.math.BigDecimal r0 = r13.m82998p4()
            java.util.List r1 = ie1.C41341q.m119907j()
            if (r14 == 0) goto L_0x000c
            r2 = r0
            goto L_0x0012
        L_0x000c:
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0012:
            java.util.Map r3 = r13.f67203f
            java.lang.String r4 = "receivers"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00b5
            java.util.Map r1 = r13.f67203f
            int r1 = r1.size()
            if (r14 == 0) goto L_0x002b
            int r1 = r1 + 1
        L_0x002b:
            long r3 = (long) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r3)
            java.lang.String r3 = "valueOf(this.toLong())"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            r3 = 2
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            java.math.BigDecimal r3 = r0.divide(r1, r3, r4)
            java.util.Map r4 = r13.f67203f
            java.util.Collection r4 = r4.values()
            java.util.List r4 = ie1.C41358y.m120025o0(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = ie1.C41343r.m119925u(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0055:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0072
            java.lang.Object r6 = r4.next()
            mv.b r6 = (p832mv.C26305b) r6
            java.lang.String r7 = "it"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)
            double r7 = r3.doubleValue()
            mv.b r6 = r13.m82982A4(r6, r7)
            r5.add(r6)
            goto L_0x0055
        L_0x0072:
            java.lang.String r4 = "moneyToSplit"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.math.BigDecimal r1 = r3.multiply(r1)
            java.lang.String r4 = "this.multiply(other)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            java.math.BigDecimal r1 = r0.subtract(r1)
            java.lang.String r4 = "this.subtract(other)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            java.math.BigDecimal r1 = r3.add(r1)
            java.lang.String r3 = "this.add(other)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            if (r14 == 0) goto L_0x0096
            r2 = r5
            goto L_0x00b8
        L_0x0096:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            java.lang.Object r4 = ie1.C41358y.m120007W(r3)
            java.lang.String r5 = "first()"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            mv.b r4 = (p832mv.C26305b) r4
            double r5 = r1.doubleValue()
            mv.b r1 = r13.m82982A4(r4, r5)
            r4 = 0
            r3.set(r4, r1)
            r1 = r2
            r2 = r3
            goto L_0x00b8
        L_0x00b5:
            r12 = r2
            r2 = r1
            r1 = r12
        L_0x00b8:
            ee1.a r10 = r13.f67207j
            hv.b r11 = new hv.b
            r3 = 0
            double r4 = r1.doubleValue()
            double r6 = r0.doubleValue()
            double r8 = r0.doubleValue()
            r0 = r11
            r1 = r3
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r6, r8)
            r10.onNext(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p839ns.C26584k.m83005w4(boolean):void");
    }

    /* renamed from: x4 */
    static /* synthetic */ void m83006x4(C26584k kVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            C25070b n4 = kVar.m82997n4();
            if (n4 != null) {
                z = n4.mo63516e();
            } else {
                z = true;
            }
        }
        kVar.m83005w4(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m83007y4(C26584k kVar, String str, double d) {
        Object obj;
        double d2;
        C26584k kVar2 = kVar;
        String str2 = str;
        C41536l.m120489i(kVar2, "this$0");
        C41536l.m120489i(str2, "$receiverId");
        C25070b n4 = kVar.m82997n4();
        if (n4 != null) {
            ArrayList arrayList = new ArrayList(n4.mo63519g());
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C41536l.m120484d(((C26305b) it.next()).mo65470a(), str2)) {
                    break;
                } else {
                    i++;
                }
            }
            C26305b bVar = (C26305b) C41358y.m120010Z(arrayList, i);
            if (bVar != null) {
                double c = bVar.mo65472c();
                if (bVar instanceof C26305b.C26306a) {
                    obj = C26305b.C26306a.m82270g((C26305b.C26306a) bVar, (C28261a) null, d, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 29, (Object) null);
                } else if (bVar instanceof C26305b.C26307b) {
                    obj = C26305b.C26307b.m82277g((C26305b.C26307b) bVar, (String) null, (String) null, d, Utils.DOUBLE_EPSILON, (String) null, (C26305b.C26308c) null, 59, (Object) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.set(i, obj);
                BigDecimal add = new BigDecimal(String.valueOf(n4.mo63522i())).add(new BigDecimal(String.valueOf(d)));
                C41536l.m120488h(add, "this.add(other)");
                BigDecimal subtract = add.subtract(new BigDecimal(String.valueOf(c)));
                C41536l.m120488h(subtract, "this.subtract(other)");
                double c2 = n4.mo63514c();
                if (!n4.mo63516e() || arrayList.size() != 1) {
                    d2 = c2;
                } else {
                    BigDecimal subtract2 = new BigDecimal(String.valueOf(n4.mo63518f())).subtract(subtract);
                    C41536l.m120488h(subtract2, "this.subtract(other)");
                    BigDecimal add2 = new BigDecimal(String.valueOf(n4.mo63514c())).add(subtract2);
                    C41536l.m120488h(add2, "this.add(other)");
                    d2 = add2.doubleValue();
                    subtract = new BigDecimal(String.valueOf(n4.mo63518f()));
                }
                kVar2.f67207j.onNext(C25070b.m80025b(n4, true, arrayList, false, d2, Utils.DOUBLE_EPSILON, subtract.doubleValue(), 20, (Object) null));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m83008z4(C26584k kVar, double d) {
        List list;
        C41536l.m120489i(kVar, "this$0");
        C25070b n4 = kVar.m82997n4();
        if (n4 != null) {
            BigDecimal add = new BigDecimal(String.valueOf(n4.mo63522i())).add(new BigDecimal(String.valueOf(d)));
            C41536l.m120488h(add, "this.add(other)");
            BigDecimal subtract = add.subtract(new BigDecimal(String.valueOf(n4.mo63514c())));
            C41536l.m120488h(subtract, "this.subtract(other)");
            List g = n4.mo63519g();
            if (g.size() == 1) {
                BigDecimal subtract2 = new BigDecimal(String.valueOf(n4.mo63518f())).subtract(subtract);
                C41536l.m120488h(subtract2, "this.subtract(other)");
                BigDecimal add2 = new BigDecimal(String.valueOf(((C26305b) C41358y.m120007W(g)).mo65472c())).add(subtract2);
                C41536l.m120488h(add2, "this.add(other)");
                List e = C41339p.m119900e(kVar.m82982A4((C26305b) C41358y.m120007W(g), add2.doubleValue()));
                list = e;
                subtract = new BigDecimal(String.valueOf(n4.mo63518f()));
            } else {
                list = g;
            }
            kVar.f67207j.onNext(C25070b.m80025b(n4, true, list, true, d, Utils.DOUBLE_EPSILON, subtract.doubleValue(), 16, (Object) null));
        }
    }

    /* renamed from: C3 */
    public C40762x mo63777C3(C25263b bVar) {
        C41536l.m120489i(bVar, "operation");
        C40762x z = C40762x.m118162z(Boolean.valueOf(this.f67205h.containsKey(Long.valueOf(bVar.mo63831o()))));
        C41536l.m120488h(z, "just(operations.containsKey(operation.entryId))");
        return z;
    }

    /* renamed from: L2 */
    public void mo63778L2() {
        this.f67203f.clear();
        this.f67204g.onNext(C41341q.m119907j());
        m83005w4(true);
    }

    /* renamed from: L3 */
    public C40749p mo63779L3() {
        C40749p c0 = this.f67206i.mo95017c0();
        C41536l.m120488h(c0, "operationsSubject.hide()");
        return c0;
    }

    /* renamed from: P1 */
    public C40734b mo63780P1() {
        C40734b t = C40734b.m117924t(new C26581h(this));
        C41536l.m120488h(t, "fromAction {\n           …matically(true)\n        }");
        return t;
    }

    /* renamed from: Q2 */
    public C40734b mo63781Q2(String str, String str2) {
        C41536l.m120489i(str, "receiverPhoneNumber");
        C41536l.m120489i(str2, "receiverName");
        C40734b t = C40734b.m117924t(new C26579f(str, str2, this));
        C41536l.m120488h(t, "fromAction {\n           …ReceiversList()\n        }");
        return t;
    }

    /* renamed from: R1 */
    public C40734b mo63782R1(String str) {
        C41536l.m120489i(str, "receiverId");
        C40734b t = C40734b.m117924t(new C26575b(this, str));
        C41536l.m120488h(t, "fromAction {\n           …ReceiversList()\n        }");
        return t;
    }

    /* renamed from: S2 */
    public C40734b mo63783S2(double d) {
        C40734b t = C40734b.m117924t(new C26582i(this, d));
        C41536l.m120488h(t, "fromAction {\n           …)\n            }\n        }");
        return t;
    }

    /* renamed from: V2 */
    public C40734b mo63784V2(boolean z) {
        C40734b t = C40734b.m117924t(new C26578e(this, z));
        C41536l.m120488h(t, "fromAction {\n           …ically(include)\n        }");
        return t;
    }

    /* renamed from: X3 */
    public C40734b mo63785X3(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        C40734b t = C40734b.m117924t(new C26583j(aVar, this));
        C41536l.m120488h(t, "fromAction {\n           …ReceiversList()\n        }");
        return t;
    }

    /* renamed from: a1 */
    public C40734b mo63786a1(String str, String str2, long j, double d) {
        String str3 = str;
        C41536l.m120489i(str3, "requestDescription");
        String str4 = str2;
        C41536l.m120489i(str4, "accountNumber");
        C40762x<BankApiResponse<String>> createMoneyRequest = this.f67201d.createMoneyRequest("TRANSFERS_CREATE_MONEY_REQUEST", "MONEY_REQUEST", str3, str4, Long.valueOf(j), Double.valueOf(d), C32343x.m95471n1(C27618a.m85467d(this.f67202e, C41358y.m120036z0(this.f67203f.values()), false, false, (Double) null, 14, (Object) null)), (String) null, (String) null);
        C41536l.m120488h(createMoneyRequest, "service.createMoneyReque…           null\n        )");
        return C19273c.m64720f(createMoneyRequest);
    }

    public void clean() {
        this.f67203f.clear();
        this.f67204g.onComplete();
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f67204g = h1;
        this.f67205h.clear();
        this.f67206i.onComplete();
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create()");
        this.f67206i = h12;
        this.f67207j.onComplete();
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create()");
        this.f67207j = h13;
    }

    /* renamed from: g3 */
    public C40734b mo63787g3(String str, double d) {
        C41536l.m120489i(str, "receiverId");
        C40734b t = C40734b.m117924t(new C26576c(this, str, d));
        C41536l.m120488h(t, "fromAction {\n           …}\n            }\n        }");
        return t;
    }

    /* renamed from: h1 */
    public C40749p mo63788h1() {
        C40749p c0 = this.f67207j.mo95017c0();
        C41536l.m120488h(c0, "billSplitSubject.hide()");
        return c0;
    }

    /* renamed from: i1 */
    public C40734b mo63789i1(String str, String str2, long j) {
        Double d;
        List list;
        boolean z;
        C41536l.m120489i(str, "requestDescription");
        C41536l.m120489i(str2, "acctNo");
        IRetrofitService iRetrofitService = this.f67201d;
        Long valueOf = Long.valueOf(j);
        C25070b n4 = m82997n4();
        Double d2 = null;
        if (n4 != null) {
            d = Double.valueOf(n4.mo63522i());
        } else {
            d = null;
        }
        C27618a aVar = this.f67202e;
        C25070b n42 = m82997n4();
        if (n42 != null) {
            list = n42.mo63519g();
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        C25070b n43 = m82997n4();
        if (n43 != null) {
            z = n43.mo63516e();
        } else {
            z = false;
        }
        C25070b n44 = m82997n4();
        if (n44 != null) {
            d2 = Double.valueOf(n44.mo63514c());
        }
        C40762x<BankApiResponse<String>> createMoneyRequest = iRetrofitService.createMoneyRequest("TRANSFERS_CREATE_MONEY_REQUEST", "BILL_SPLIT", str, str2, valueOf, d, C32343x.m95471n1(aVar.mo66989c(list, true, z, d2)), C32343x.m95471n1(this.f67202e.mo66988b(C41358y.m120036z0(this.f67205h.values()))), C32343x.m95471n1(this.f67202e.mo66987a(C41358y.m120036z0(this.f67205h.values()))));
        C41536l.m120488h(createMoneyRequest, "service.createMoneyReque…     ).toJson()\n        )");
        return C19273c.m64720f(createMoneyRequest);
    }

    /* renamed from: k3 */
    public C40749p mo63790k3() {
        C40749p c0 = this.f67204g.mo95017c0();
        C41536l.m120488h(c0, "receiversSubject.hide()");
        return c0;
    }

    /* renamed from: n3 */
    public C40734b mo63791n3(C25263b bVar) {
        C41536l.m120489i(bVar, "operation");
        C40734b t = C40734b.m117924t(new C26574a(bVar, this));
        C41536l.m120488h(t, "fromAction {\n           …perationsList()\n        }");
        return t;
    }

    /* renamed from: q0 */
    public C40734b mo63792q0(String str, double d) {
        C41536l.m120489i(str, "title");
        C40734b t = C40734b.m117924t(new C26580g(str, d, this));
        C41536l.m120488h(t, "fromAction {\n           …perationsList()\n        }");
        return t;
    }

    /* renamed from: r1 */
    public C40734b mo63793r1(long j) {
        C40734b t = C40734b.m117924t(new C26577d(this, j));
        C41536l.m120488h(t, "fromAction {\n           …perationsList()\n        }");
        return t;
    }

    /* renamed from: t2 */
    public void mo63794t2() {
        this.f67205h.clear();
        this.f67206i.onNext(C41341q.m119907j());
    }

    /* renamed from: y2 */
    public C40762x mo63795y2(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        C40762x z = C40762x.m118162z(Boolean.valueOf(this.f67203f.containsKey(String.valueOf(aVar.mo67857m()))));
        C41536l.m120488h(z, "just(receivers.containsKey(contact.id.toString()))");
        return z;
    }
}
