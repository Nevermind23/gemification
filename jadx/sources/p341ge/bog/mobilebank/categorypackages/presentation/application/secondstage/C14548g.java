package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41232r;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14557h;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p441go.C15386k;
import p441go.C15389l;
import p455ho.C15548b;
import p582qp.C17575a;
import p596rp.C17711b;
import p623to.C18067j;
import p623to.C18068k;
import p623to.C18069l;
import p623to.C18070m;
import p676xo.C18868a;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g */
public final class C14548g extends C21481a implements C18067j, C18068k {

    /* renamed from: s */
    public static final C14555c f42392s = new C14555c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15389l f42393d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C15386k f42394e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C17575a f42395f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C20217b f42396g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SoloApplicationFormData f42397h;

    /* renamed from: i */
    private final C18067j f42398i = this;

    /* renamed from: j */
    private final C18068k f42399j = this;

    /* renamed from: k */
    private final C18868a f42400k = new C18868a((List) null, (SelectedLoungeData) null, (List) null, (C17711b) null, (List) null, 31, (DefaultConstructorMarker) null);

    /* renamed from: l */
    private List f42401l = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f42402m = new C1644x();

    /* renamed from: n */
    private final C1644x f42403n = new C1644x();

    /* renamed from: o */
    private final C1644x f42404o = new C1644x();

    /* renamed from: p */
    private final C1644x f42405p = new C1644x();

    /* renamed from: q */
    private final C1644x f42406q = new C1644x();

    /* renamed from: r */
    private final C1644x f42407r = new C1644x();

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$a */
    static final class C14549a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14548g f42408d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$a$a */
        /* synthetic */ class C14550a extends C41535k implements C43075l {
            C14550a(Object obj) {
                super(1, obj, C17575a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C17575a) this.receiver).mo45108b(list);
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$a$b */
        /* synthetic */ class C14551b extends C41535k implements C43075l {
            C14551b(Object obj) {
                super(1, obj, C17575a.class, "transform", "transformFinancialInfoLookups(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C17575a) this.receiver).mo45109e(list);
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$a$c */
        static final class C14552c extends C41537m implements C43080q {

            /* renamed from: d */
            public static final C14552c f42409d = new C14552c();

            C14552c() {
                super(3);
            }

            /* renamed from: a */
            public final C41232r invoke(C15548b bVar, List list, List list2) {
                C41536l.m120489i(bVar, "requiredFields");
                C41536l.m120489i(list, "packageItems");
                C41536l.m120489i(list2, "infoLookUp");
                return new C41232r(bVar, list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14549a(C14548g gVar) {
            super(1);
            this.f42408d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final List m53727e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final C41232r m53728f(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (C41232r) qVar.invoke(obj, obj2, obj3);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x S = C40762x.m118153S(C15389l.m55858b(this.f42408d.f42393d, this.f42408d.f42397h.mo40919f(), this.f42408d.f42397h.mo40932t(), false, 4, (Object) null), C15386k.m55854b(this.f42408d.f42394e, this.f42408d.f42397h.mo40935v(), false, 2, (Object) null).mo95062A(new C14545d(new C14550a(this.f42408d.f42395f))), this.f42408d.f42396g.mo48650b("PACKAGE_APP_FINANCIAL_INFO_TYPES").mo95062A(new C14546e(new C14551b(this.f42408d.f42395f))), new C14547f(C14552c.f42409d));
            C41536l.m120488h(S, "zip(\n                   …LookUp)\n                }");
            return C31270e.m92880i(S, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$b */
    static final class C14553b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14548g f42410d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$b$a */
        static final class C14554a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C14548g f42411d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14554a(C14548g gVar) {
                super(1);
                this.f42411d = gVar;
            }

            /* renamed from: a */
            public final void mo40817a(C41232r rVar) {
                C14548g gVar = this.f42411d;
                C41536l.m120488h(rVar, "data");
                gVar.m53708uw(rVar);
                this.f42411d.m53705rw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40817a((C41232r) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14553b(C14548g gVar) {
            super(1);
            this.f42410d = gVar;
        }

        /* renamed from: a */
        public final void mo40816a(C31128a aVar) {
            this.f42410d.f42402m.mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14554a(this.f42410d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40816a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$c */
    public static final class C14555c {
        private C14555c() {
        }

        public /* synthetic */ C14555c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.g$d */
    public interface C14556d {
        /* renamed from: a */
        C14548g mo32815a(SoloApplicationFormData soloApplicationFormData);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14548g(C15389l lVar, C15386k kVar, C17575a aVar, C20217b bVar, SoloApplicationFormData soloApplicationFormData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(lVar, "getRequiredApplicationFields");
        C41536l.m120489i(kVar, "getPackageServiceList");
        C41536l.m120489i(aVar, "categoryMapper");
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(soloApplicationFormData, "formData");
        this.f42393d = lVar;
        this.f42394e = kVar;
        this.f42395f = aVar;
        this.f42396g = bVar;
        this.f42397h = soloApplicationFormData;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C18069l(new C14549a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(it)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C18070m(new C14553b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m53695fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m53696gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final void m53705rw() {
        List a = C14562i.f42424a.mo40835a(this.f42400k);
        this.f42403n.mo4823o(a);
        this.f42401l = a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: sw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData m53706sw(p676xo.C18868a r8) {
        /*
            r7 = this;
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r0 = r7.f42397h
            java.util.List r1 = r8.mo46828a()
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()
            r4 = r2
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r4 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r4
            java.lang.String r4 = r4.mo40851e()
            java.lang.String r5 = "INCOME"
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x000a
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r2 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r2
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.mo40847a()
            if (r2 != 0) goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            r0.mo40908E(r2)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r0 = r7.f42397h
            java.util.List r2 = r8.mo46828a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()
            r5 = r4
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r5 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r5
            java.lang.String r5 = r5.mo40851e()
            java.lang.String r6 = "DEPOSIT"
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x0040
            goto L_0x005b
        L_0x005a:
            r4 = r3
        L_0x005b:
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r4 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r4
            if (r4 == 0) goto L_0x0065
            java.lang.String r2 = r4.mo40847a()
            if (r2 != 0) goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            r0.mo40940z(r2)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r0 = r7.f42397h
            java.util.List r2 = r8.mo46828a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r2.next()
            r5 = r4
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r5 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r5
            java.lang.String r5 = r5.mo40851e()
            java.lang.String r6 = "LOAN"
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x0073
            r3 = r4
        L_0x008d:
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel r3 = (p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel) r3
            if (r3 == 0) goto L_0x0097
            java.lang.String r2 = r3.mo40847a()
            if (r2 != 0) goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            r0.mo40909F(r2)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r0 = r7.f42397h
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData r2 = r8.mo46831d()
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem r2 = r2.mo40862d()
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = r2.mo40892b()
            if (r2 != 0) goto L_0x00ae
        L_0x00ad:
            r2 = r1
        L_0x00ae:
            r0.mo40912I(r2)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r0 = r7.f42397h
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData r8 = r8.mo46831d()
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem r8 = r8.mo40862d()
            if (r8 == 0) goto L_0x00c5
            java.lang.String r8 = r8.mo40891a()
            if (r8 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r8
        L_0x00c5:
            r0.mo40911H(r1)
            ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData r8 = r7.f42397h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14548g.m53706sw(xo.a):ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData");
    }

    /* renamed from: tw */
    private final void m53707tw() {
        boolean z;
        List<Object> list = this.f42401l;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object obj : list) {
            if (obj instanceof C14557h.C14558a) {
                C14557h.C14558a aVar = (C14557h.C14558a) obj;
                List z0 = C41358y.m120036z0(this.f42400k.mo46828a());
                if (this.f42400k.mo46828a().size() == this.f42400k.mo46829b().size()) {
                    z = true;
                } else {
                    z = false;
                }
                obj = aVar.mo40819c(z0, z);
            }
            arrayList.add(obj);
        }
        List B0 = C41358y.m119991B0(arrayList);
        this.f42401l = B0;
        this.f42403n.mo4823o(B0);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public final void m53708uw(C41232r rVar) {
        this.f42400k.mo46835g(((C15548b) rVar.mo95688a()).mo42721a());
        this.f42400k.mo46834f((C17711b) C41358y.m120009Y((List) rVar.mo95689b()));
        this.f42400k.mo46832e((List) rVar.mo95690c());
    }

    /* renamed from: Cl */
    public void mo40797Cl(SelectedLoungeData selectedLoungeData) {
        String str;
        C41536l.m120489i(selectedLoungeData, "soloLounge");
        this.f42400k.mo46836h(selectedLoungeData);
        List<Object> list = this.f42401l;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Object obj : list) {
            if (obj instanceof C14557h.C14560c) {
                C14557h.C14560c cVar = (C14557h.C14560c) obj;
                SoloLoungeItem d = selectedLoungeData.mo40862d();
                if (d != null) {
                    str = d.mo40895e();
                } else {
                    str = null;
                }
                C41536l.m120486f(str);
                obj = cVar.mo40830c(str);
            }
            arrayList.add(obj);
        }
        List B0 = C41358y.m119991B0(arrayList);
        this.f42401l = B0;
        this.f42403n.mo4823o(B0);
    }

    /* renamed from: Hj */
    public void mo40798Hj(FinancialInfoUiModel financialInfoUiModel) {
        Object obj;
        C41536l.m120489i(financialInfoUiModel, "info");
        Iterator it = this.f42400k.mo46828a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((FinancialInfoUiModel) obj).mo40851e(), financialInfoUiModel.mo40851e())) {
                break;
            }
        }
        FinancialInfoUiModel financialInfoUiModel2 = (FinancialInfoUiModel) obj;
        if (financialInfoUiModel2 != null) {
            this.f42400k.mo46828a().remove(financialInfoUiModel2);
        }
        m53707tw();
    }

    /* renamed from: L */
    public LiveData mo40799L() {
        return this.f42402m;
    }

    /* renamed from: On */
    public void mo40800On() {
        C37224b.m109965d(this.f42406q, this.f42400k.mo46831d());
    }

    /* renamed from: Wu */
    public void mo40801Wu(FinancialInfoUiModel financialInfoUiModel) {
        C41536l.m120489i(financialInfoUiModel, "info");
        this.f42400k.mo46828a().add(financialInfoUiModel);
        m53707tw();
    }

    /* renamed from: cf */
    public LiveData mo40802cf() {
        return this.f42406q;
    }

    /* renamed from: ci */
    public LiveData mo40803ci() {
        return this.f42404o;
    }

    /* renamed from: dk */
    public void mo40804dk(FinancialInfoUiModel financialInfoUiModel) {
        C41536l.m120489i(financialInfoUiModel, "info");
        C37224b.m109965d(this.f42405p, financialInfoUiModel);
    }

    /* renamed from: ds */
    public LiveData mo40805ds() {
        return this.f42405p;
    }

    /* renamed from: om */
    public void mo40806om() {
        C1644x xVar = this.f42404o;
        List b = this.f42400k.mo46829b();
        ArrayList arrayList = new ArrayList();
        for (Object next : b) {
            FinancialInfoLookupUiModel financialInfoLookupUiModel = (FinancialInfoLookupUiModel) next;
            List<FinancialInfoUiModel> a = this.f42400k.mo46828a();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
            for (FinancialInfoUiModel e : a) {
                arrayList2.add(e.mo40851e());
            }
            if (!arrayList2.contains(financialInfoLookupUiModel.mo40837b())) {
                arrayList.add(next);
            }
        }
        C37224b.m109965d(xVar, arrayList);
    }

    /* renamed from: pw */
    public final C18067j mo40807pw() {
        return this.f42398i;
    }

    /* renamed from: q */
    public LiveData mo40808q() {
        return this.f42403n;
    }

    /* renamed from: qw */
    public final C18068k mo40809qw() {
        return this.f42399j;
    }

    /* renamed from: s0 */
    public void mo40810s0() {
        C37224b.m109965d(this.f42407r, m53706sw(this.f42400k));
        C32343x.m95501z0(this, "solo_packages", this.f42397h.mo40932t(), "solo_lounge_choose");
    }

    /* renamed from: v0 */
    public LiveData mo40811v0() {
        return this.f42407r;
    }
}
