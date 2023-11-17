package p341ge.bog.mobilebank.categorypackages.presentation.application.firststage;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import j51.C36732d;
import j51.C36734f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k51.C36874b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14446f;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p441go.C15386k;
import p441go.C15389l;
import p455ho.C15548b;
import p455ho.C15549c;
import p511lo.C16637h;
import p511lo.C16638i;
import p511lo.C16639j;
import p511lo.C16640k;
import p567po.C17455a;
import p581qo.C17572a;
import p582qp.C17575a;
import p596rp.C17711b;
import p596rp.C17712c;
import p596rp.C17713d;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e */
public final class C14439e extends C21481a implements C16637h, C16638i {

    /* renamed from: d */
    private final C17572a f42206d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15389l f42207e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C15386k f42208f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C17575a f42209g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SoloApplicationFormData f42210h;

    /* renamed from: i */
    private final C16637h f42211i = this;

    /* renamed from: j */
    private final C16638i f42212j = this;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f42213k = new C1644x();

    /* renamed from: l */
    private final C1644x f42214l = new C1644x();

    /* renamed from: m */
    private final C1644x f42215m = new C1644x();

    /* renamed from: n */
    private final C1644x f42216n = new C1644x();

    /* renamed from: o */
    private final C1644x f42217o = new C1644x();

    /* renamed from: p */
    private final C1644x f42218p = new C1644x();

    /* renamed from: q */
    private List f42219q = new ArrayList();

    /* renamed from: r */
    private final C17455a f42220r = new C17455a((String) null, (String) null, (EmailUiModel) null, (C17713d) null, (List) null, (C17711b) null, 63, (DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$a */
    static final class C14440a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14439e f42221d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$a$a */
        /* synthetic */ class C14441a extends C41535k implements C43075l {
            C14441a(Object obj) {
                super(1, obj, C17575a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C17575a) this.receiver).mo45108b(list);
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$a$b */
        static final class C14442b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C14442b f42222d = new C14442b();

            C14442b() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C15548b bVar, List list) {
                C41536l.m120489i(bVar, "requiredFields");
                C41536l.m120489i(list, "packageList");
                return C41233s.m119492a(bVar, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14440a(C14439e eVar) {
            super(1);
            this.f42221d = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m53437d(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x T = C40762x.m118154T(C15389l.m55858b(this.f42221d.f42207e, this.f42221d.f42210h.mo40919f(), this.f42221d.f42210h.mo40932t(), false, 4, (Object) null), C15386k.m55854b(this.f42221d.f42208f, (String) null, false, 3, (Object) null).mo95062A(new C14437c(new C14441a(this.f42221d.f42209g))), new C14438d(C14442b.f42222d));
            C41536l.m120488h(T, "zip(\n                   …ageList\n                }");
            return C31270e.m92880i(T, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$b */
    static final class C14443b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14439e f42223d;

        /* renamed from: e */
        final /* synthetic */ C36734f f42224e;

        /* renamed from: f */
        final /* synthetic */ C36732d f42225f;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$b$a */
        static final class C14444a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14439e f42226d;

            /* renamed from: e */
            final /* synthetic */ C36734f f42227e;

            /* renamed from: f */
            final /* synthetic */ C36732d f42228f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14444a(C14439e eVar, C36734f fVar, C36732d dVar) {
                super(1);
                this.f42226d = eVar;
                this.f42227e = fVar;
                this.f42228f = dVar;
            }

            /* renamed from: a */
            public final void mo40620a(C41224m mVar) {
                this.f42226d.m53419vw(this.f42227e.mo89561a());
                this.f42226d.m53418uw(this.f42228f.mo89559a());
                C14439e eVar = this.f42226d;
                C41536l.m120488h(mVar, "data");
                eVar.m53420ww(mVar);
                this.f42226d.m53416sw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40620a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14443b(C14439e eVar, C36734f fVar, C36732d dVar) {
            super(1);
            this.f42223d = eVar;
            this.f42224e = fVar;
            this.f42225f = dVar;
        }

        /* renamed from: a */
        public final void mo40619a(C31128a aVar) {
            this.f42223d.f42213k.mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14444a(this.f42223d, this.f42224e, this.f42225f), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40619a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.firststage.e$c */
    public interface C14445c {
        /* renamed from: a */
        C14439e mo32793a(SoloApplicationFormData soloApplicationFormData);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14439e(C36734f fVar, C36732d dVar, C17572a aVar, C15389l lVar, C15386k kVar, C17575a aVar2, SoloApplicationFormData soloApplicationFormData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C36734f fVar2 = fVar;
        C36732d dVar2 = dVar;
        C17572a aVar3 = aVar;
        C15389l lVar2 = lVar;
        C15386k kVar2 = kVar;
        C17575a aVar4 = aVar2;
        SoloApplicationFormData soloApplicationFormData2 = soloApplicationFormData;
        C41536l.m120489i(fVar, "getPhones");
        C41536l.m120489i(dVar, "getEmails");
        C41536l.m120489i(aVar3, "mapper");
        C41536l.m120489i(lVar2, "getRequiredApplicationFields");
        C41536l.m120489i(kVar2, "getPackageServiceList");
        C41536l.m120489i(aVar4, "categoryMapper");
        C41536l.m120489i(soloApplicationFormData2, "formData");
        this.f42206d = aVar3;
        this.f42207e = lVar2;
        this.f42208f = kVar2;
        this.f42209g = aVar4;
        this.f42210h = soloApplicationFormData2;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C16639j(new C14440a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(it)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C16640k(new C14443b(this, fVar, dVar)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m53405fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m53406gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public final void m53416sw() {
        List a = C14456h.f42258a.mo40654a(this.f42220r);
        this.f42214l.mo4823o(a);
        this.f42219q = a;
    }

    /* renamed from: tw */
    private final SoloApplicationFormData m53417tw(C17455a aVar) {
        String str;
        C17712c cVar;
        String str2;
        C17712c cVar2;
        String str3;
        String str4;
        C17712c c;
        String f;
        C17712c c2;
        this.f42210h.mo40905B(aVar.mo44950c());
        SoloApplicationFormData soloApplicationFormData = this.f42210h;
        String e = aVar.mo44952e();
        String str5 = "";
        if (e == null) {
            e = str5;
        }
        soloApplicationFormData.mo40910G(e);
        SoloApplicationFormData soloApplicationFormData2 = this.f42210h;
        EmailUiModel a = aVar.mo44948a();
        if (a == null || (str = a.mo40655a()) == null) {
            str = str5;
        }
        soloApplicationFormData2.mo40904A(str);
        SoloApplicationFormData soloApplicationFormData3 = this.f42210h;
        C17713d b = aVar.mo44949b();
        Double d = null;
        if (b != null) {
            cVar = b.mo45293c();
        } else {
            cVar = null;
        }
        C17712c cVar3 = C17712c.ANNUAL;
        if (cVar == cVar3) {
            C17713d b2 = aVar.mo44949b();
            if (b2 == null || (c2 = b2.mo45293c()) == null) {
                str2 = null;
            } else {
                str2 = c2.mo45289e();
            }
            C41536l.m120486f(str2);
        } else {
            str2 = C17712c.MONTHLY.mo45289e();
        }
        soloApplicationFormData3.mo40939y(str2);
        SoloApplicationFormData soloApplicationFormData4 = this.f42210h;
        C17713d b3 = aVar.mo44949b();
        if (!(b3 == null || (c = b3.mo45293c()) == null || (f = c.mo45290f()) == null)) {
            str5 = f;
        }
        soloApplicationFormData4.mo40907D(str5);
        SoloApplicationFormData soloApplicationFormData5 = this.f42210h;
        C17713d b4 = aVar.mo44949b();
        if (b4 != null) {
            cVar2 = b4.mo45293c();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar3) {
            C17711b d2 = aVar.mo44951d();
            if (d2 != null) {
                d = d2.mo45280a();
            }
            C41536l.m120486f(d);
            double doubleValue = d.doubleValue();
            C17711b d3 = aVar.mo44951d();
            if (d3 == null || (str4 = d3.mo45281b()) == null) {
                str4 = "GEL";
            }
            str3 = C32343x.m95410Q(doubleValue, str4, false, 2, (Object) null);
        } else {
            str3 = this.f42210h.mo40926l();
        }
        soloApplicationFormData5.mo40906C(str3);
        return this.f42210h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: k51.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: uw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m53418uw(java.util.List r5) {
        /*
            r4 = this;
            java.util.Iterator r0 = r5.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            r3 = r1
            k51.a r3 = (k51.C36873a) r3
            boolean r3 = r3.mo89802d()
            if (r3 == 0) goto L_0x0004
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            k51.a r1 = (k51.C36873a) r1
            if (r1 != 0) goto L_0x0025
            java.lang.Object r5 = ie1.C41358y.m120009Y(r5)
            r1 = r5
            k51.a r1 = (k51.C36873a) r1
        L_0x0025:
            po.a r5 = r4.f42220r
            if (r1 == 0) goto L_0x002f
            qo.a r0 = r4.f42206d
            ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel r2 = r0.mo45105a(r1)
        L_0x002f:
            r5.mo44955g(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.C14439e.m53418uw(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m53419vw(List list) {
        String str;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C36874b) obj).mo89808c()) {
                break;
            }
        }
        C36874b bVar = (C36874b) obj;
        if (bVar != null) {
            str = bVar.mo89806a();
        }
        this.f42220r.mo44960k(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public final void m53420ww(C41224m mVar) {
        Object obj;
        this.f42220r.mo44961l(((C15548b) mVar.mo95675a()).mo42721a());
        C17455a aVar = this.f42220r;
        Iterator it = ((List) mVar.mo95676b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C17711b) obj).mo45282c(), this.f42210h.mo40932t())) {
                break;
            }
        }
        aVar.mo44959j((C17711b) obj);
    }

    /* renamed from: Gj */
    public void mo40602Gj() {
        String str;
        C1644x xVar = this.f42215m;
        EmailUiModel a = this.f42220r.mo44948a();
        if (a == null || (str = a.mo40656b()) == null) {
            str = "";
        }
        C37224b.m109965d(xVar, str);
    }

    /* renamed from: H2 */
    public LiveData mo40603H2() {
        return this.f42218p;
    }

    /* renamed from: I7 */
    public void mo40604I7(String str) {
        Object obj;
        C41536l.m120489i(str, "name");
        Iterator it = this.f42219q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C14446f) obj) instanceof C14446f.C14448b) {
                break;
            }
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.firststage.FirstStageViewType.JobName");
        ((C14446f.C14448b) obj).mo40628d(str);
        this.f42220r.mo44958i(str);
        this.f42214l.mo4823o(this.f42219q);
    }

    /* renamed from: L */
    public LiveData mo40605L() {
        return this.f42213k;
    }

    /* renamed from: Xc */
    public void mo40606Xc(C17713d dVar) {
        C41536l.m120489i(dVar, "fee");
        List<Object> list = this.f42219q;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object obj : list) {
            if (obj instanceof C14446f.C14450d) {
                obj = C14446f.C14450d.m53454d((C14446f.C14450d) obj, (List) null, dVar.mo45293c(), 1, (Object) null);
            }
            arrayList.add(obj);
        }
        this.f42219q = C41358y.m119991B0(arrayList);
        this.f42220r.mo44956h(dVar);
        this.f42214l.mo4823o(this.f42219q);
    }

    /* renamed from: ca */
    public void mo40607ca(EmailUiModel emailUiModel) {
        C41536l.m120489i(emailUiModel, "email");
        List<Object> list = this.f42219q;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object obj : list) {
            if (obj instanceof C14446f.C14447a) {
                obj = ((C14446f.C14447a) obj).mo40622c(emailUiModel.mo40655a());
            }
            arrayList.add(obj);
        }
        this.f42219q = C41358y.m119991B0(arrayList);
        this.f42220r.mo44955g(emailUiModel);
        this.f42214l.mo4823o(this.f42219q);
    }

    /* renamed from: g0 */
    public void mo40608g0() {
        SoloApplicationFormData tw = m53417tw(this.f42220r);
        if (C15549c.m56158d(this.f42220r.mo44954f())) {
            C37224b.m109965d(this.f42218p, tw);
        } else {
            C37224b.m109965d(this.f42217o, tw);
        }
        C32343x.m95501z0(this, "solo_packages", tw.mo40932t(), "approve_personal_info");
    }

    /* renamed from: op */
    public LiveData mo40609op() {
        return this.f42215m;
    }

    /* renamed from: q */
    public LiveData mo40610q() {
        return this.f42214l;
    }

    /* renamed from: qw */
    public final C16637h mo40611qw() {
        return this.f42211i;
    }

    /* renamed from: ro */
    public void mo40612ro() {
        C37224b.m109962a(this.f42216n);
    }

    /* renamed from: rw */
    public final C16638i mo40613rw() {
        return this.f42212j;
    }

    /* renamed from: v0 */
    public LiveData mo40614v0() {
        return this.f42217o;
    }

    /* renamed from: vh */
    public LiveData mo40615vh() {
        return this.f42216n;
    }
}
