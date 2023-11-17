package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel;

import a30.C19151a;
import a30.C19160e;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import ed1.C40754t;
import ee1.C40765a;
import gd1.C40992a;
import h30.C24853a;
import h30.C24854b;
import h30.C24855c;
import h30.C24856d;
import h30.C24857e;
import h30.C24858f;
import h30.C24859g;
import h30.C24860h;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41212c;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p20.C27143e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p380ck.C10468i;
import p773gv.C24794e;
import p773gv.C24803h;
import p773gv.C24809j0;
import p773gv.C24817l;
import p773gv.C24819m;
import p773gv.C24825r;
import p773gv.C24829v;
import p793iw.C25263b;
import ue1.C43075l;
import z20.C30140a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel */
public final class BillSplitSelectOperationsViewModel extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C24809j0 f58388d;

    /* renamed from: e */
    private final C24803h f58389e;

    /* renamed from: f */
    private final C24829v f58390f;

    /* renamed from: g */
    private final C24817l f58391g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C30140a f58392h;

    /* renamed from: i */
    private final C24819m f58393i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C24794e f58394j;

    /* renamed from: k */
    private boolean f58395k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f58396l;

    /* renamed from: m */
    private final LiveData f58397m;

    /* renamed from: n */
    private final C40765a f58398n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f58399o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f58400p;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$a */
    static final class C21928a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f58401d;

        /* renamed from: e */
        final /* synthetic */ BillSplitSelectOperationsViewModel f58402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21928a(C1639v vVar, BillSplitSelectOperationsViewModel billSplitSelectOperationsViewModel) {
            super(1);
            this.f58401d = vVar;
            this.f58402e = billSplitSelectOperationsViewModel;
        }

        /* renamed from: a */
        public final void mo54561a(List list) {
            List list2;
            C1639v vVar = this.f58401d;
            C41536l.m120488h(list, "it");
            if (!list.isEmpty()) {
                list2 = C41358y.m120023m0(C41339p.m119900e(C27143e.C27144a.f68139a), list);
            } else {
                list2 = C41341q.m119907j();
            }
            vVar.mo4826r(list2);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            for (Object next : list) {
                C41536l.m120488h(bigDecimal, "sum");
                bigDecimal = bigDecimal.add(new BigDecimal(String.valueOf(((C19151a) next).mo47355a())));
                C41536l.m120488h(bigDecimal, "this.add(other)");
            }
            C41536l.m120488h(bigDecimal, "sum");
            this.f58402e.f58400p.mo4826r(new C41224m(Double.valueOf(bigDecimal.doubleValue()), "GEL"));
            this.f58402e.mo54554Dw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54561a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$b */
    static final class C21929b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsViewModel f58403d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$b$a */
        static final class C21930a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f58404d;

            /* renamed from: e */
            final /* synthetic */ BillSplitSelectOperationsViewModel f58405e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21930a(String str, BillSplitSelectOperationsViewModel billSplitSelectOperationsViewModel) {
                super(1);
                this.f58404d = str;
                this.f58405e = billSplitSelectOperationsViewModel;
            }

            /* renamed from: a */
            public final C19160e invoke(List list) {
                boolean z;
                C41536l.m120489i(list, "operations");
                if (!list.isEmpty()) {
                    return new C19160e.C19165e(this.f58405e.f58394j.mo63212c(list));
                }
                String str = this.f58404d;
                C41536l.m120488h(str, "search");
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return C19160e.C19163c.f53361a;
                }
                return C19160e.C19164d.f53362a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21929b(BillSplitSelectOperationsViewModel billSplitSelectOperationsViewModel) {
            super(1);
            this.f58403d = billSplitSelectOperationsViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C19160e m71012c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C19160e) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "search");
            return this.f58403d.f58388d.mo63221g(str).mo95075O().mo95026k0(new C21951a(new C21930a(str, this.f58403d))).mo95037u0(C19160e.C19161a.f53359a).mo94977D0(C19160e.C19162b.f53360a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$c */
    static final class C21931c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsViewModel f58406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21931c(BillSplitSelectOperationsViewModel billSplitSelectOperationsViewModel) {
            super(1);
            this.f58406d = billSplitSelectOperationsViewModel;
        }

        /* renamed from: a */
        public final void mo54564a(C19160e eVar) {
            this.f58406d.f58399o.mo4826r(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54564a((C19160e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$d */
    static final class C21932d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21932d f58407d = new C21932d();

        C21932d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C10468i.m38038b(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$e */
    static final class C21933e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsViewModel f58408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21933e(BillSplitSelectOperationsViewModel billSplitSelectOperationsViewModel) {
            super(1);
            this.f58408d = billSplitSelectOperationsViewModel;
        }

        /* renamed from: a */
        public final void mo54566a(List list) {
            C1644x tw = this.f58408d.f58396l;
            C30140a qw = this.f58408d.f58392h;
            C41536l.m120488h(list, "it");
            tw.mo4826r(qw.mo70492d(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54566a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$f */
    static final class C21934f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21934f f58409d = new C21934f();

        C21934f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C10468i.m38038b(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$g */
    static final class C21935g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21935g f58410d = new C21935g();

        C21935g() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel$h */
    static final class C21936h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58411a;

        C21936h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58411a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58411a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58411a.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillSplitSelectOperationsViewModel(C24809j0 j0Var, C24803h hVar, C24829v vVar, C24817l lVar, C24825r rVar, C30140a aVar, C24819m mVar, C24794e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(j0Var, "searchOperations");
        C41536l.m120489i(hVar, "addOperation");
        C41536l.m120489i(vVar, "removeOperation");
        C41536l.m120489i(lVar, "clearOperations");
        C41536l.m120489i(rVar, "getOperationsUseCase");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(mVar, "clearMoneyRequestReceivers");
        C41536l.m120489i(eVar, "addHeadersToOperationsUseCase");
        this.f58388d = j0Var;
        this.f58389e = hVar;
        this.f58390f = vVar;
        this.f58391g = lVar;
        this.f58392h = aVar;
        this.f58393i = mVar;
        this.f58394j = eVar;
        C1644x xVar = new C1644x(C41341q.m119907j());
        this.f58396l = xVar;
        C40765a i1 = C40765a.m118199i1("");
        C41536l.m120488h(i1, "createDefault(\"\")");
        this.f58398n = i1;
        this.f58399o = new C1644x();
        this.f58400p = new C1644x();
        C1639v vVar2 = new C1639v();
        vVar2.mo4956s(xVar, new C21936h(new C21928a(vVar2, this)));
        this.f58397m = vVar2;
        C41205b G0 = i1.mo94989L0(new C24853a(new C21929b(this))).mo95027o0(C40992a.m118827a()).mo94983G0(new C24854b(new C21931c(this)), new C24855c(C21932d.f58407d));
        C41536l.m120488h(G0, "searchSubject.switchMap …ash.report(it)\n        })");
        bindToLifecycle(G0);
        C41205b G02 = rVar.mo63236a().mo95027o0(C40992a.m118827a()).mo94983G0(new C24856d(new C21933e(this)), new C24857e(C21934f.f58409d));
        C41536l.m120488h(G02, "getOperationsUseCase()\n …report(it)\n            })");
        bindToLifecycle(G02);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m70981Bw() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m70982Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m70991lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m70992mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m70993nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m70994ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m71001ww() {
    }

    /* renamed from: Aw */
    public final void mo54553Aw(C19151a aVar) {
        C41536l.m120489i(aVar, "operation");
        C41205b G = this.f58390f.mo63240a(aVar.mo47359e()).mo94888G(new C24859g(), new C24860h(C21935g.f58410d));
        C41536l.m120488h(G, "removeOperation.invoke(o…bscribe({\n\n        }, {})");
        bindToLifecycle(G);
    }

    /* renamed from: Dw */
    public final void mo54554Dw() {
        C40765a aVar = this.f58398n;
        String str = (String) aVar.mo95100j1();
        if (str == null) {
            str = "";
        }
        aVar.onNext(str);
    }

    /* renamed from: Ew */
    public final void mo54555Ew(boolean z) {
        this.f58395k = z;
    }

    /* renamed from: Y2 */
    public final void mo54556Y2(String str) {
        C41536l.m120489i(str, "searchWord");
        this.f58398n.onNext(str);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        if (this.f58395k) {
            this.f58391g.mo63228a();
            this.f58393i.mo63230a();
        }
    }

    /* renamed from: vw */
    public final void mo54557vw(C25263b bVar) {
        C41536l.m120489i(bVar, "transaction");
        C41205b F = this.f58389e.mo63217a(bVar).mo94906z(C40992a.m118827a()).mo94887F(new C24858f());
        C41536l.m120488h(F, "addOperation(transaction…            .subscribe {}");
        addDisposable(F);
    }

    /* renamed from: xw */
    public final LiveData mo54558xw() {
        return this.f58399o;
    }

    /* renamed from: yw */
    public final LiveData mo54559yw() {
        return this.f58397m;
    }

    /* renamed from: zw */
    public final LiveData mo54560zw() {
        return this.f58400p;
    }
}
