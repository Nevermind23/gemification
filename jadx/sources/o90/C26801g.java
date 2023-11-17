package o90;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g90.C20782d;
import g90.C20783e;
import g91.C32343x;
import h90.C24921b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n41.C37353c;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.OrganizationUiModel;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p855oy.C27094a;
import t80.C28325b;
import ue1.C43075l;

/* renamed from: o90.g */
public final class C26801g extends C21481a implements C26768a, C26781b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final FormData f67511d;

    /* renamed from: e */
    private final String f67512e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28325b f67513f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27094a f67514g;

    /* renamed from: h */
    private final PreferencesApiManager f67515h;

    /* renamed from: i */
    private final C26768a f67516i = this;

    /* renamed from: j */
    private final C26781b f67517j = this;

    /* renamed from: k */
    private final C1644x f67518k = new C1644x();

    /* renamed from: l */
    private final C1644x f67519l;

    /* renamed from: m */
    private final C1644x f67520m;

    /* renamed from: n */
    private final C1644x f67521n;

    /* renamed from: o */
    private final C1644x f67522o;

    /* renamed from: p */
    private final C1644x f67523p;

    /* renamed from: q */
    private final C1644x f67524q;

    /* renamed from: r */
    private final C1644x f67525r;

    /* renamed from: s */
    private final C1644x f67526s;

    /* renamed from: t */
    private final C1644x f67527t;

    /* renamed from: u */
    private final C1644x f67528u;

    /* renamed from: v */
    private OrganizationUiModel f67529v;

    /* renamed from: o90.g$a */
    static final class C26802a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26801g f67530d;

        /* renamed from: o90.g$a$a */
        /* synthetic */ class C26803a extends C41535k implements C43075l {
            C26803a(Object obj) {
                super(1, obj, C27094a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27094a) this.receiver).mo66388b(list);
            }
        }

        /* renamed from: o90.g$a$b */
        /* synthetic */ class C26804b extends C41535k implements C43075l {
            C26804b(Object obj) {
                super(1, obj, C26801g.class, "transformCurrencies", "transformCurrencies(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C26801g) this.receiver).m83385zw(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26802a(C26801g gVar) {
            super(1);
            this.f67530d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final List m83423d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f67530d.f67513f.mo67967a().mo95075O().mo95026k0(new C26793e(new C26803a(this.f67530d.f67514g))).mo95026k0(new C26797f(new C26804b(this.f67530d)));
            C41536l.m120488h(k0, "getCurrencyLookup().toOb…ap(::transformCurrencies)");
            return C31270e.m92879h(k0, 1);
        }
    }

    /* renamed from: o90.g$b */
    static final class C26805b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26801g f67531d;

        /* renamed from: o90.g$b$a */
        static final class C26806a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26801g f67532d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26806a(C26801g gVar) {
                super(1);
                this.f67532d = gVar;
            }

            /* renamed from: a */
            public final void mo66109a(List list) {
                Object obj;
                C41536l.m120488h(list, "currencies");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C20783e) obj).mo49354b()) {
                        break;
                    }
                }
                C20783e eVar = (C20783e) obj;
                if (eVar != null) {
                    C26801g gVar = this.f67532d;
                    gVar.f67511d.mo56102s(eVar.mo49353a().mo52393d());
                    gVar.m83375Aw();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo66109a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26805b(C26801g gVar) {
            super(1);
            this.f67531d = gVar;
        }

        /* renamed from: a */
        public final void mo66108a(C31128a aVar) {
            this.f67531d.mo66089z().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C26806a(this.f67531d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66108a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: o90.g$c */
    public interface C26807c {
        /* renamed from: a */
        C26801g mo32536a(FormData formData, String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r3 = r3.mo56113a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26801g(p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData r3, java.lang.String r4, t80.C28325b r5, p855oy.C27094a r6, p341ge.bog.mobilebank.rest.manager.PreferencesApiManager r7) {
        /*
            r2 = this;
            java.lang.String r0 = "formData"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "minAmount"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "getCurrencyLookup"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "lookupUiMapper"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.lang.String r0 = "preferencesApiManager"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            r2.f67511d = r3
            r2.f67512e = r4
            r2.f67513f = r5
            r2.f67514g = r6
            r2.f67515h = r7
            r2.f67516i = r2
            r2.f67517j = r2
            androidx.lifecycle.x r4 = new androidx.lifecycle.x
            r4.<init>()
            r2.f67518k = r4
            androidx.lifecycle.x r4 = new androidx.lifecycle.x
            ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType r3 = r3.mo56091g()
            if (r3 == 0) goto L_0x0041
            java.util.List r3 = r3.mo56113a()
            if (r3 != 0) goto L_0x0045
        L_0x0041:
            java.util.List r3 = ie1.C41341q.m119907j()
        L_0x0045:
            r4.<init>(r3)
            r2.f67519l = r4
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67520m = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67521n = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67522o = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67523p = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67524q = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67525r = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67526s = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r3.<init>()
            r2.f67527t = r3
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4)
            r2.f67528u = r3
            ed1.p r3 = r2.onInit()
            ed1.p r4 = r2.onRefresh()
            ed1.p r3 = ed1.C40749p.m118047l0(r3, r4)
            o90.g$a r4 = new o90.g$a
            r4.<init>(r2)
            o90.c r5 = new o90.c
            r5.<init>(r4)
            ed1.p r3 = r3.mo94989L0(r5)
            java.lang.String r4 = "merge(\n                o…le(RC_INIT)\n            }"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            ed1.p r3 = g91.C32343x.m95413R0(r3)
            o90.g$b r4 = new o90.g$b
            r4.<init>(r2)
            o90.d r5 = new o90.d
            r5.<init>(r4)
            hd1.b r3 = r3.mo94981F0(r5)
            java.lang.String r4 = "merge(\n                o…      }\n                }"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r2.bindToLifecycle((hd1.C41205b) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.C26801g.<init>(ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData, java.lang.String, t80.b, oy.a, ge.bog.mobilebank.rest.manager.PreferencesApiManager):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m83375Aw() {
        C20782d a = C24921b.m79667a(this.f67511d);
        if (a != null) {
            mo66088yf().mo4823o(Boolean.valueOf(a.mo49349m()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m83378fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m83379gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final List m83385zw(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LookupUiModel lookupUiModel = (LookupUiModel) it.next();
            String d = lookupUiModel.mo52393d();
            String e = this.f67511d.mo56088e();
            if (e == null) {
                e = "GEL";
            }
            arrayList.add(new C20783e(lookupUiModel, C41536l.m120484d(d, e)));
        }
        return arrayList;
    }

    /* renamed from: H7 */
    public Country mo66054H7() {
        return (Country) mo66085s8().mo4814f();
    }

    /* renamed from: Oh */
    public void mo66055Oh() {
        mo66098sw().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: Sd */
    public LookupUiModel mo66056Sd() {
        return (LookupUiModel) mo66086uk().mo4814f();
    }

    /* renamed from: b2 */
    public void mo66057b2(String str) {
        C41536l.m120489i(str, "amount");
        this.f67511d.mo56100q(str);
        m83375Aw();
    }

    /* renamed from: dt */
    public OrganizationUiModel mo66058dt() {
        return this.f67529v;
    }

    /* renamed from: l3 */
    public void mo66059l3(LookupUiModel lookupUiModel) {
        C41536l.m120489i(lookupUiModel, "position");
        this.f67511d.mo56103t(lookupUiModel);
        mo66086uk().mo4823o(lookupUiModel);
        m83375Aw();
    }

    /* renamed from: l7 */
    public void mo66060l7(String str) {
        C41536l.m120489i(str, "amount");
        String e = this.f67511d.mo56088e();
        if (!C40439w.m117118v(str) && e != null) {
            try {
                if (new BigDecimal(str).compareTo(new BigDecimal(this.f67512e)) < 0) {
                    mo66087x8().mo4823o(C32343x.m95466m(C41238w.f97225a));
                } else {
                    mo66082k7().mo4823o(C32343x.m95466m(this.f67511d));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: mw */
    public C1644x mo66088yf() {
        return this.f67528u;
    }

    /* renamed from: nw */
    public C1644x mo66085s8() {
        return this.f67522o;
    }

    /* renamed from: ow */
    public C1644x mo66089z() {
        return this.f67518k;
    }

    /* renamed from: pw */
    public C1644x mo66082k7() {
        return this.f67520m;
    }

    /* renamed from: qw */
    public final C26768a mo66096qw() {
        return this.f67516i;
    }

    /* renamed from: rw */
    public C1644x mo66083p9() {
        return this.f67521n;
    }

    /* renamed from: sw */
    public C1644x mo66098sw() {
        return this.f67525r;
    }

    /* renamed from: tw */
    public C1644x mo66084q5() {
        return this.f67523p;
    }

    /* renamed from: uu */
    public void mo66061uu(Country country) {
        C41536l.m120489i(country, "country");
        this.f67511d.mo56101r(country.mo55935a());
        mo66085s8().mo4823o(country);
        m83375Aw();
    }

    /* renamed from: uw */
    public C1644x mo66081cm() {
        return this.f67526s;
    }

    /* renamed from: vw */
    public final C26781b mo66101vw() {
        return this.f67517j;
    }

    /* renamed from: ww */
    public C1644x mo66086uk() {
        return this.f67524q;
    }

    /* renamed from: xg */
    public void mo66062xg() {
        mo66084q5().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }

    /* renamed from: xw */
    public C1644x mo66080Lm() {
        return this.f67519l;
    }

    /* renamed from: y */
    public void mo66063y(int i) {
        String str;
        List list;
        C20783e eVar;
        LookupUiModel a;
        FormData formData = this.f67511d;
        C31128a aVar = (C31128a) mo66089z().mo4814f();
        if (aVar == null || (list = (List) aVar.mo71340a()) == null || (eVar = (C20783e) list.get(i)) == null || (a = eVar.mo49353a()) == null) {
            str = null;
        } else {
            str = a.mo52393d();
        }
        formData.mo56102s(str);
        m83375Aw();
    }

    /* renamed from: yq */
    public void mo66064yq(OrganizationUiModel organizationUiModel) {
        C41224m mVar;
        C41536l.m120489i(organizationUiModel, "organization");
        if (this.f67515h.getLanguage() == C37353c.EN) {
            mVar = C41233s.m119492a(organizationUiModel.mo56161e(), organizationUiModel.mo56158b());
        } else {
            mVar = C41233s.m119492a(organizationUiModel.mo56159d(), organizationUiModel.mo56157a());
        }
        String str = (String) mVar.mo95675a();
        FormData formData = this.f67511d;
        formData.mo56107w(str);
        formData.mo56106v(organizationUiModel.mo56163f());
        formData.mo56105u((String) mVar.mo95676b());
        mo66081cm().mo4823o(str);
        this.f67529v = organizationUiModel;
        m83375Aw();
    }

    /* renamed from: yw */
    public C1644x mo66087x8() {
        return this.f67527t;
    }

    /* renamed from: z8 */
    public void mo66065z8() {
        mo66083p9().mo4823o(C32343x.m95466m(C41238w.f97225a));
    }
}
