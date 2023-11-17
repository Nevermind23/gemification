package p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b40.C19331a;
import d50.C19909b;
import e40.C20147g;
import e40.C20148h;
import e40.C20149i;
import e40.C20150j;
import e40.C20151k;
import e40.C20152l;
import e40.C20153m;
import e40.C20154n;
import e40.C20155o;
import e40.C20156p;
import e40.C20157q;
import g91.C32303f;
import g91.C32314k;
import g91.C32319m;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25822b;
import l50.C25824d;
import l50.C25825e;
import m50.C26143a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.AccountFilterItemModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p737dt.C20100q;
import p843nw.C26625h;
import p863pw.C27631i;
import p892sv.C28277b;
import p903tv.C28517a;
import p925vv.C29167c;
import p936wv.C29581g;
import ue1.C43075l;
import x30.C29644a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel */
public final class AnalysisViewModel extends C21481a {

    /* renamed from: d */
    private final C28277b f58669d;

    /* renamed from: e */
    private final C29167c f58670e;

    /* renamed from: f */
    private final C26625h f58671f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19331a f58672g;

    /* renamed from: h */
    private final C29644a f58673h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C26143a f58674i;

    /* renamed from: j */
    private final C1644x f58675j = new C1644x();

    /* renamed from: k */
    private final C1644x f58676k = new C1644x();

    /* renamed from: l */
    private final C1644x f58677l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f58678m = new C1644x();

    /* renamed from: n */
    private ArrayList f58679n = new ArrayList();

    /* renamed from: o */
    private FilterValue.Calendar f58680o = mo54805Lw();

    /* renamed from: p */
    private FilterValue.MultiSelect f58681p;

    /* renamed from: q */
    private FilterValue.MultiSelect f58682q;

    /* renamed from: r */
    private FilterValue.SingleSelect f58683r;

    /* renamed from: s */
    private boolean f58684s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f58685t;

    /* renamed from: u */
    private boolean f58686u;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$a */
    static final class C22047a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22047a(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58687d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54826a(C19909b bVar) {
            this.f58687d.mo54807Nw().mo4826r(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54826a((C19909b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$b */
    static final class C22048b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22048b(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58688d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54827a(C19909b bVar) {
            this.f58688d.mo54802Ew().mo4826r(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54827a((C19909b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$c */
    static final class C22049c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22049c(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58689d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54828a(C27631i iVar) {
            this.f58689d.mo54813Tw(new ArrayList(this.f58689d.f58674i.mo65054a(iVar.mo67075a().mo67081a())));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54828a((C27631i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$d */
    static final class C22050d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22050d f58690d = new C22050d();

        C22050d() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$e */
    static final class C22051e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22051e(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58691d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54830a(C41205b bVar) {
            C21484c.m69417i(this.f58691d.mo54801Dw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54830a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$f */
    static final class C22052f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22052f(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58692d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54831a(C28517a aVar) {
            if (this.f58692d.f58685t) {
                AnalysisViewModel analysisViewModel = this.f58692d;
                boolean z = true;
                if (!(!aVar.mo68115c().mo68129c().isEmpty()) && !(!aVar.mo68116d().mo68129c().isEmpty())) {
                    z = false;
                }
                analysisViewModel.mo54817Xw(z);
                this.f58692d.f58685t = false;
            }
            C1644x Dw = this.f58692d.mo54801Dw();
            C19331a qw = this.f58692d.f58672g;
            C41536l.m120488h(aVar, "it");
            C21484c.m69418j(Dw, qw.mo47534b(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54831a((C28517a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$g */
    static final class C22053g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22053g(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58693d = analysisViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58693d.mo54801Dw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$h */
    static final class C22054h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22054h f58694d = new C22054h();

        C22054h() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C29581g gVar) {
            int i;
            C41536l.m120489i(gVar, "budgetingResult");
            if (!gVar.mo69470a().mo69441a().isEmpty()) {
                BigDecimal divide = gVar.mo69470a().mo69447f().divide(gVar.mo69470a().mo69448g(), 2, RoundingMode.HALF_UP);
                C41536l.m120488h(divide, "budgetingResult.pfmData.…_UP\n                    )");
                BigDecimal valueOf = BigDecimal.valueOf((long) 100);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                BigDecimal multiply = divide.multiply(valueOf);
                C41536l.m120488h(multiply, "this.multiply(other)");
                i = multiply.setScale(0).intValue();
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$i */
    static final class C22055i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22055i f58695d = new C22055i();

        C22055i() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54834a(C41205b bVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54834a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$j */
    static final class C22056j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22056j(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58696d = analysisViewModel;
        }

        /* renamed from: a */
        public final void mo54835a(Integer num) {
            C1644x rw = this.f58696d.f58678m;
            C41536l.m120488h(num, "percentage");
            C21484c.m69418j(rw, num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54835a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisViewModel$k */
    static final class C22057k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisViewModel f58697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22057k(AnalysisViewModel analysisViewModel) {
            super(1);
            this.f58697d = analysisViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58697d.f58678m, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalysisViewModel(C28277b bVar, C29167c cVar, C26625h hVar, C19331a aVar, C29644a aVar2, C26143a aVar3, C20100q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "analysisUseCase");
        C41536l.m120489i(cVar, "budgetingUseCase");
        C41536l.m120489i(hVar, "getAccountsAndDetailsUseCase");
        C41536l.m120489i(aVar, "analysisMapper");
        C41536l.m120489i(aVar2, "initialDateSettings");
        C41536l.m120489i(aVar3, "accountsUIModelDataMapper");
        C41536l.m120489i(qVar, "transactionsEvent");
        this.f58669d = bVar;
        this.f58670e = cVar;
        this.f58671f = hVar;
        this.f58672g = aVar;
        this.f58673h = aVar2;
        this.f58674i = aVar3;
        FilterValue.MultiSelect multiSelect = new FilterValue.MultiSelect(new HashSet());
        this.f58681p = multiSelect;
        this.f58682q = multiSelect;
        this.f58685t = true;
        C41205b F0 = qVar.mo48494a().mo95027o0(C40992a.m118827a()).mo94981F0(new C20157q(new C22047a(this)));
        C41536l.m120488h(F0, "transactionsEvent\n      ….value = it\n            }");
        addDisposable(F0);
        C41205b F02 = qVar.mo48494a().mo95027o0(C40992a.m118827a()).mo94981F0(new C20148h(new C22048b(this)));
        C41536l.m120488h(F02, "transactionsEvent\n      ….value = it\n            }");
        addDisposable(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m71431Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m71432Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m71433Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final Integer m71434Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m71435Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m71436Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m71437Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m71449ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m71455vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m71456ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Dw */
    public final C1644x mo54801Dw() {
        return this.f58675j;
    }

    /* renamed from: Ew */
    public final C1644x mo54802Ew() {
        return this.f58677l;
    }

    /* renamed from: Fw */
    public final void mo54803Fw() {
        C41205b G0 = this.f58670e.mo69008d().mo95026k0(new C20153m(C22054h.f58694d)).mo94980F(new C20154n(C22055i.f58695d)).mo94983G0(new C20155o(new C22056j(this)), new C20156p(new C22057k(this)));
        C41536l.m120488h(G0, "fun getBudgetingPercenta…or(it) })\n        )\n    }");
        addDisposable(G0);
    }

    /* renamed from: Kw */
    public final LiveData mo54804Kw() {
        return this.f58678m;
    }

    /* renamed from: Lw */
    public final FilterValue.Calendar mo54805Lw() {
        return new FilterValue.Calendar(this.f58673h.mo69562d(), Long.valueOf(this.f58673h.mo69560b()), Long.valueOf(this.f58673h.mo69563e()), Long.valueOf(this.f58673h.mo69561c()));
    }

    /* renamed from: Mw */
    public final FilterValue.Calendar mo54806Mw() {
        return this.f58680o;
    }

    /* renamed from: Nw */
    public final C1644x mo54807Nw() {
        return this.f58676k;
    }

    /* renamed from: Ow */
    public final FilterValue.SingleSelect mo54808Ow() {
        return this.f58683r;
    }

    /* renamed from: Pw */
    public final boolean mo54809Pw() {
        return this.f58684s;
    }

    /* renamed from: Qw */
    public final boolean mo54810Qw() {
        return this.f58686u;
    }

    /* renamed from: Rw */
    public final boolean mo54811Rw() {
        return !C41536l.m120484d(this.f58680o, mo54805Lw()) || !C41536l.m120484d(this.f58681p, this.f58682q);
    }

    /* renamed from: Sw */
    public final void mo54812Sw() {
        this.f58680o = mo54805Lw();
        this.f58682q = FilterValue.MultiSelect.m69651b(this.f58681p, (HashSet) null, 1, (Object) null);
        mo54825zw(true);
    }

    /* renamed from: Tw */
    public final void mo54813Tw(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "<set-?>");
        this.f58679n = arrayList;
    }

    /* renamed from: Uw */
    public final void mo54814Uw(FilterValue.MultiSelect multiSelect) {
        C41536l.m120489i(multiSelect, "<set-?>");
        this.f58682q = multiSelect;
    }

    /* renamed from: Vw */
    public final void mo54815Vw(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, "<set-?>");
        this.f58680o = calendar;
    }

    /* renamed from: Ww */
    public final void mo54816Ww(FilterValue.SingleSelect singleSelect) {
        this.f58683r = singleSelect;
    }

    /* renamed from: Xw */
    public final void mo54817Xw(boolean z) {
        this.f58684s = z;
    }

    /* renamed from: Yw */
    public final void mo54818Yw(boolean z) {
        this.f58686u = z;
    }

    /* renamed from: Zw */
    public final ArrayList mo54819Zw() {
        ArrayList<Long> arrayList;
        List<C25824d> a;
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : this.f58682q.mo53826d()) {
            int intValue2 = intValue.intValue();
            Long f = ((C25825e) this.f58679n.get(intValue2)).mo64477f();
            if (f != null) {
                arrayList2.add(Long.valueOf(f.longValue()));
            }
            C25822b a2 = ((C25825e) this.f58679n.get(intValue2)).mo64471a();
            if (a2 == null || (a = a2.mo64459a()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(C41343r.m119925u(a, 10));
                for (C25824d b : a) {
                    arrayList.add(b.mo64467b());
                }
            }
            if (arrayList != null) {
                for (Long l : arrayList) {
                    C41536l.m120486f(l);
                    arrayList2.add(l);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: ax */
    public final ArrayList mo54820ax() {
        ArrayList<Number> arrayList;
        List<C25824d> a;
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : this.f58682q.mo53826d()) {
            int intValue2 = intValue.intValue();
            arrayList2.add(Long.valueOf(((C25825e) this.f58679n.get(intValue2)).mo64473c()));
            C25822b a2 = ((C25825e) this.f58679n.get(intValue2)).mo64471a();
            if (a2 == null || (a = a2.mo64459a()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(C41343r.m119925u(a, 10));
                for (C25824d a3 : a) {
                    arrayList.add(Long.valueOf(a3.mo64466a()));
                }
            }
            if (arrayList != null) {
                for (Number longValue : arrayList) {
                    arrayList2.add(Long.valueOf(longValue.longValue()));
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: bx */
    public final ArrayList mo54821bx() {
        ArrayList<C25825e> arrayList = this.f58679n;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C25825e eVar : arrayList) {
            String b = eVar.mo64472b();
            String g = eVar.mo64478g();
            C41524c0 c0Var = C41524c0.f97701a;
            String format = String.format("%s%s", Arrays.copyOf(new Object[]{C32303f.m95204o(eVar.mo64474d()), C32314k.m95245a(eVar.mo64475e())}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            arrayList2.add(new AccountFilterItemModel(b, g, format));
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f58670e.mo69007c();
    }

    /* renamed from: uw */
    public final void mo54822uw() {
        C41205b G0 = C26625h.m83089d(this.f58671f, false, 1, (Object) null).mo94983G0(new C20151k(new C22049c(this)), new C20152l(C22050d.f58690d));
        C41536l.m120488h(G0, "fun getAccount() {\n     …       })\n        )\n    }");
        addDisposable(G0);
    }

    /* renamed from: xw */
    public final FilterValue.MultiSelect mo54823xw() {
        return this.f58681p;
    }

    /* renamed from: yw */
    public final FilterValue.MultiSelect mo54824yw() {
        return this.f58682q;
    }

    /* renamed from: zw */
    public final void mo54825zw(boolean z) {
        if (z || !C21484c.m69410b(this.f58675j)) {
            String d = C32319m.m95297d(this.f58680o.mo53804d(), "yyyy-MM-dd");
            Long a = this.f58680o.mo53802a();
            C41536l.m120486f(a);
            String d2 = C32319m.m95297d(a.longValue(), "yyyy-MM-dd");
            ArrayList Zw = mo54819Zw();
            C28277b bVar = this.f58669d;
            C41536l.m120488h(d, "startDate");
            C41536l.m120488h(d2, "endDate");
            C41205b I = bVar.mo67897b(d, d2, Zw).mo95083l(new C20147g(new C22051e(this))).mo95070I(new C20149i(new C22052f(this)), new C20150j(new C22053g(this)));
            C41536l.m120488h(I, "fun getAnalysis(refresh:…or(it) })\n        )\n    }");
            addDisposable(I);
        }
    }
}
