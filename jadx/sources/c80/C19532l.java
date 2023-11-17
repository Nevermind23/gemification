package c80;

import d80.C19927a;
import e80.C20183a;
import ed1.C40762x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.consumerloanapplication.data.lookup.entity.OrganizationEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p845ny.C26639a;
import ue1.C43075l;
import v70.C29000a;
import v80.C29002a;

/* renamed from: c80.l */
public final class C19532l implements C29002a {

    /* renamed from: l */
    public static final C19533a f53829l = new C19533a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f53830d;

    /* renamed from: e */
    private final C29000a f53831e;

    /* renamed from: f */
    private final C20183a f53832f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List f53833g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f53834h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List f53835i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f53836j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List f53837k;

    /* renamed from: c80.l$a */
    public static final class C19533a {
        private C19533a() {
        }

        public /* synthetic */ C19533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c80.l$b */
    /* synthetic */ class C19534b extends C41535k implements C43075l {
        C19534b(Object obj) {
            super(1, obj, C20183a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C20183a) this.receiver).mo48598b(list);
        }
    }

    /* renamed from: c80.l$c */
    static final class C19535c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19532l f53838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19535c(C19532l lVar) {
            super(1);
            this.f53838d = lVar;
        }

        /* renamed from: a */
        public final void mo47774a(List list) {
            this.f53838d.f53837k = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47774a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c80.l$d */
    static final class C19536d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19536d f53839d = new C19536d();

        C19536d() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "lookup");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: c80.l$e */
    static final class C19537e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19532l f53840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19537e(C19532l lVar) {
            super(1);
            this.f53840d = lVar;
        }

        /* renamed from: a */
        public final void mo47776a(List list) {
            this.f53840d.f53834h = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47776a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c80.l$f */
    static final class C19538f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19538f f53841d = new C19538f();

        C19538f() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "lookup");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: c80.l$g */
    static final class C19539g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19532l f53842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19539g(C19532l lVar) {
            super(1);
            this.f53842d = lVar;
        }

        /* renamed from: a */
        public final void mo47778a(List list) {
            this.f53842d.f53833g = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47778a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c80.l$h */
    static final class C19540h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19540h f53843d = new C19540h();

        C19540h() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "lookup");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: c80.l$i */
    static final class C19541i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19532l f53844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19541i(C19532l lVar) {
            super(1);
            this.f53844d = lVar;
        }

        /* renamed from: a */
        public final void mo47780a(List list) {
            this.f53844d.f53836j = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47780a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c80.l$j */
    static final class C19542j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19542j f53845d = new C19542j();

        C19542j() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "lookup");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: c80.l$k */
    static final class C19543k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19532l f53846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19543k(C19532l lVar) {
            super(1);
            this.f53846d = lVar;
        }

        /* renamed from: a */
        public final void mo47782a(List list) {
            this.f53846d.f53835i = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47782a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c80.l$l */
    static final class C19544l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19544l f53847d = new C19544l();

        C19544l() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "organizations");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C19927a.m65808a((OrganizationEntity) it.next()));
            }
            return arrayList;
        }
    }

    public C19532l(IRetrofitService iRetrofitService, C29000a aVar, C20183a aVar2) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "claService");
        C41536l.m120489i(aVar2, "countryMapper");
        this.f53830d = iRetrofitService;
        this.f53831e = aVar;
        this.f53832f = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final List m65113A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final List m65130q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m65131r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final List m65132s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m65133t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final List m65134u4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m65135v4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final List m65136w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m65137x4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final List m65138y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m65139z4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: D */
    public C40762x mo47767D() {
        List list = this.f53836j;
        if (list == null) {
            C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f53830d.lookup("LOANS_GET_LOVS_BY_LOOKUP_NAME", "CL_APP_OTHER_INCOME_POSITIONS");
            C41536l.m120488h(lookup, "service.lookup(LOANS_GET…P_OTHER_INCOME_POSITIONS)");
            C40762x m = C19273c.m64722h(lookup).mo95062A(new C19526f(C19540h.f53843d)).mo95084m(new C19527g(new C19541i(this)));
            C41536l.m120488h(m, "override fun getJobPosit…ositions)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(list);
        C41536l.m120488h(z, "{\n            Single.just(jobPositions)\n        }");
        return z;
    }

    /* renamed from: F */
    public C40762x mo47768F(String str) {
        C41536l.m120489i(str, "keyword");
        C40762x A = this.f53831e.mo68838F(str).mo95062A(new C19530j(C19544l.f53847d));
        C41536l.m120488h(A, "claService.getOrganizati…toOrganizationModel() } }");
        return A;
    }

    /* renamed from: a */
    public C40762x mo47769a() {
        List list = this.f53837k;
        if (list == null) {
            C40762x m = this.f53831e.mo68844a().mo95062A(new C19531k(new C19534b(this.f53832f))).mo95084m(new C19522b(new C19535c(this)));
            C41536l.m120488h(m, "override fun getCountrie…ountries)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(list);
        C41536l.m120488h(z, "{\n            Single.just(countries)\n        }");
        return z;
    }

    /* renamed from: b3 */
    public C40762x mo47770b3() {
        List list = this.f53835i;
        if (list == null) {
            C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f53830d.lookup("LOANS_GET_LOVS_BY_LOOKUP_NAME", "APPLICATON_DESIRED_LOAN_TERM");
            C41536l.m120488h(lookup, "service.lookup(LOANS_GET…ICATON_DESIRED_LOAN_TERM)");
            C40762x m = C19273c.m64722h(lookup).mo95062A(new C19528h(C19542j.f53845d)).mo95084m(new C19529i(new C19543k(this)));
            C41536l.m120488h(m, "override fun getLoanTerm…oanTerms)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(list);
        C41536l.m120488h(z, "{\n            Single.just(loanTerms)\n        }");
        return z;
    }

    public void clean() {
        this.f53833g = null;
        this.f53834h = null;
        this.f53835i = null;
        this.f53836j = null;
        this.f53837k = null;
    }

    /* renamed from: o0 */
    public C40762x mo47771o0() {
        List list = this.f53833g;
        if (list == null) {
            C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f53830d.lookup("LOANS_GET_LOVS_BY_LOOKUP_NAME", "APP_INCOME_TYPES");
            C41536l.m120488h(lookup, "service.lookup(LOANS_GET…P_NAME, APP_INCOME_TYPES)");
            C40762x m = C19273c.m64722h(lookup).mo95062A(new C19524d(C19538f.f53841d)).mo95084m(new C19525e(new C19539g(this)));
            C41536l.m120488h(m, "override fun getIncomeTy…omeTypes)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(list);
        C41536l.m120488h(z, "{\n            Single.just(incomeTypes)\n        }");
        return z;
    }

    /* renamed from: x3 */
    public C40762x mo47772x3() {
        List list = this.f53834h;
        if (list == null) {
            C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f53830d.lookup("LOANS_GET_LOVS_BY_LOOKUP_NAME", "LOAN_APP_INCOME_CCY");
            C41536l.m120488h(lookup, "service.lookup(LOANS_GET…AME, LOAN_APP_INCOME_CCY)");
            C40762x m = C19273c.m64722h(lookup).mo95062A(new C19521a(C19536d.f53839d)).mo95084m(new C19523c(new C19537e(this)));
            C41536l.m120488h(m, "override fun getCurrency…rrencies)\n        }\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(list);
        C41536l.m120488h(z, "{\n            Single.just(currencies)\n        }");
        return z;
    }
}
