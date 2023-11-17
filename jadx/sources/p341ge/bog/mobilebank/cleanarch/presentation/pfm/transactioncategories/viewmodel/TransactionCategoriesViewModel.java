package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel;

import androidx.lifecycle.C1644x;
import d50.C19907a;
import e50.C20160a;
import e50.C20161b;
import e50.C20162c;
import e50.C20163d;
import e50.C20164e;
import e50.C20165f;
import e50.C20166g;
import e50.C20167h;
import e50.C20168i;
import e50.C20169j;
import e50.C20170k;
import e50.C20171l;
import e50.C20172m;
import e50.C20173n;
import e50.C20174o;
import e50.C20175p;
import e50.C20176q;
import e50.C20177r;
import g91.C32306g0;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p750ew.C20298a;
import p750ew.C20299b;
import p750ew.C20300c;
import p750ew.C20301d;
import p750ew.C20302e;
import p760fw.C20575a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel */
public final class TransactionCategoriesViewModel extends C21481a {

    /* renamed from: d */
    private final C20300c f59044d;

    /* renamed from: e */
    private final C20298a f59045e;

    /* renamed from: f */
    private final C20301d f59046f;

    /* renamed from: g */
    private final C20299b f59047g;

    /* renamed from: h */
    private final C20302e f59048h;

    /* renamed from: i */
    private final C1644x f59049i = new C1644x();

    /* renamed from: j */
    private final C1644x f59050j = new C1644x();

    /* renamed from: k */
    private final C1644x f59051k = new C1644x();

    /* renamed from: l */
    private final C1644x f59052l = new C1644x();

    /* renamed from: m */
    private final C1644x f59053m = new C1644x();

    /* renamed from: n */
    private final C1644x f59054n = new C1644x();

    /* renamed from: o */
    private final C1644x f59055o = new C1644x();

    /* renamed from: p */
    private final C1644x f59056p = new C1644x();

    /* renamed from: q */
    private final C1644x f59057q = new C1644x();

    /* renamed from: r */
    private long f59058r = -1;

    /* renamed from: s */
    private long f59059s = -1;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$a */
    static final class C22243a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22243a f59060d = new C22243a();

        C22243a() {
            super(1);
        }

        /* renamed from: a */
        public final TransactionCategoryModel invoke(C20575a aVar) {
            C41536l.m120489i(aVar, "it");
            return C19907a.m65797a(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$b */
    static final class C22244b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22244b(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59061d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55114a(C41205b bVar) {
            C21484c.m69417i(this.f59061d.mo55095Iw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55114a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$c */
    static final class C22245c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22245c(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59062d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55115a(TransactionCategoryModel transactionCategoryModel) {
            C1644x Iw = this.f59062d.mo55095Iw();
            C41536l.m120488h(transactionCategoryModel, "it");
            C21484c.m69418j(Iw, transactionCategoryModel);
            C32306g0.m95220a("pfm_subcategory_created");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55115a((TransactionCategoryModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$d */
    static final class C22246d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22246d(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59063d = transactionCategoriesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59063d.mo55095Iw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$e */
    static final class C22247e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22247e f59064d = new C22247e();

        C22247e() {
            super(1);
        }

        /* renamed from: a */
        public final TransactionCategoryModel invoke(C20575a aVar) {
            C41536l.m120489i(aVar, "it");
            return C19907a.m65797a(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$f */
    static final class C22248f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22248f(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59065d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55118a(C41205b bVar) {
            C21484c.m69417i(this.f59065d.mo55098Lw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55118a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$g */
    static final class C22249g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22249g(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59066d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55119a(TransactionCategoryModel transactionCategoryModel) {
            C1644x Lw = this.f59066d.mo55098Lw();
            C41536l.m120488h(transactionCategoryModel, "it");
            C21484c.m69418j(Lw, transactionCategoryModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55119a((TransactionCategoryModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$h */
    static final class C22250h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59067d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22250h(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59067d = transactionCategoriesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59067d.mo55098Lw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$i */
    static final class C22251i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22251i f59068d = new C22251i();

        C22251i() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return C19907a.m65798b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$j */
    static final class C22252j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59069d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22252j(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59069d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55122a(C41205b bVar) {
            C21484c.m69417i(this.f59069d.mo55103Qw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55122a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$k */
    static final class C22253k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22253k(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59070d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55123a(List list) {
            C1644x Qw = this.f59070d.mo55103Qw();
            C41536l.m120488h(list, "it");
            C21484c.m69418j(Qw, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55123a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$l */
    static final class C22254l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22254l(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59071d = transactionCategoriesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59071d.mo55103Qw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$m */
    static final class C22255m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22255m(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59072d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55125a(C41205b bVar) {
            C21484c.m69417i(this.f59072d.mo55101Ow(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55125a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$n */
    static final class C22256n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22256n(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59073d = transactionCategoriesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59073d.mo55101Ow(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$o */
    static final class C22257o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22257o(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59074d = transactionCategoriesViewModel;
        }

        /* renamed from: a */
        public final void mo55127a(C41205b bVar) {
            C21484c.m69417i(this.f59074d.mo55104Rw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55127a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel$p */
    static final class C22258p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesViewModel f59075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22258p(TransactionCategoriesViewModel transactionCategoriesViewModel) {
            super(1);
            this.f59075d = transactionCategoriesViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59075d.mo55104Rw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionCategoriesViewModel(C20300c cVar, C20298a aVar, C20301d dVar, C20299b bVar, C20302e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getTransactionCategoriesUseCase");
        C41536l.m120489i(aVar, "addTransactionCategoryUseCase");
        C41536l.m120489i(dVar, "removeTransactionCategoryUseCase");
        C41536l.m120489i(bVar, "editTransactionCategoryUseCase");
        C41536l.m120489i(eVar, "saveTransactionCategoryUseCase");
        this.f59044d = cVar;
        this.f59045e = aVar;
        this.f59046f = dVar;
        this.f59047g = bVar;
        this.f59048h = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m72052Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m72053Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m72054Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m72055Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final TransactionCategoryModel m72056Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (TransactionCategoryModel) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final List m72057Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m72058Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public static final void m72059Vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m72060Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m72061Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m72062ax(TransactionCategoriesViewModel transactionCategoriesViewModel) {
        C41536l.m120489i(transactionCategoriesViewModel, "this$0");
        C21484c.m69418j(transactionCategoriesViewModel.f59052l, C41238w.f97225a);
        C32306g0.m95220a("pfm_subcategory_deleted");
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m72063bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public static final void m72065dx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m72067ex(TransactionCategoriesViewModel transactionCategoriesViewModel) {
        C41536l.m120489i(transactionCategoriesViewModel, "this$0");
        C21484c.m69418j(transactionCategoriesViewModel.f59053m, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m72069fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final TransactionCategoryModel m72085xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (TransactionCategoryModel) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m72086yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m72087zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    public final void mo55092Bw(TransactionCategoryModel transactionCategoryModel) {
        C41536l.m120489i(transactionCategoryModel, "category");
        if (transactionCategoryModel.mo55076b()) {
            this.f59054n.mo4826r(new C37223a(transactionCategoryModel));
        }
    }

    /* renamed from: Cw */
    public final void mo55093Cw(String str) {
        TransactionCategoryModel transactionCategoryModel;
        Long h;
        C41536l.m120489i(str, "name");
        C37223a aVar = (C37223a) this.f59054n.mo4814f();
        if (aVar != null && (transactionCategoryModel = (TransactionCategoryModel) aVar.mo90299d()) != null && (h = transactionCategoryModel.mo55083h()) != null) {
            h.longValue();
            Object f = this.f59054n.mo4814f();
            C41536l.m120486f(f);
            Object d = ((C37223a) f).mo90299d();
            C41536l.m120486f(d);
            long a = ((TransactionCategoryModel) d).mo55075a();
            Object f2 = this.f59054n.mo4814f();
            C41536l.m120486f(f2);
            Object d2 = ((C37223a) f2).mo90299d();
            C41536l.m120486f(d2);
            Long h2 = ((TransactionCategoryModel) d2).mo55083h();
            C41536l.m120486f(h2);
            C41205b I = this.f59047g.mo48783a(a, h2.longValue(), str).mo95062A(new C20175p(C22247e.f59064d)).mo95083l(new C20176q(new C22248f(this))).mo95070I(new C20177r(new C22249g(this)), new C20161b(new C22250h(this)));
            C41536l.m120488h(I, "fun editTransactionCateg…       )\n        }\n\n    }");
            addDisposable(I);
        }
    }

    /* renamed from: Hw */
    public final C1644x mo55094Hw() {
        return this.f59057q;
    }

    /* renamed from: Iw */
    public final C1644x mo55095Iw() {
        return this.f59050j;
    }

    /* renamed from: Jw */
    public final C1644x mo55096Jw() {
        return this.f59055o;
    }

    /* renamed from: Kw */
    public final long mo55097Kw() {
        return this.f59058r;
    }

    /* renamed from: Lw */
    public final C1644x mo55098Lw() {
        return this.f59051k;
    }

    /* renamed from: Mw */
    public final C1644x mo55099Mw() {
        return this.f59054n;
    }

    /* renamed from: Nw */
    public final long mo55100Nw() {
        return this.f59059s;
    }

    /* renamed from: Ow */
    public final C1644x mo55101Ow() {
        return this.f59052l;
    }

    /* renamed from: Pw */
    public final C1644x mo55102Pw() {
        return this.f59056p;
    }

    /* renamed from: Qw */
    public final C1644x mo55103Qw() {
        return this.f59049i;
    }

    /* renamed from: Rw */
    public final C1644x mo55104Rw() {
        return this.f59053m;
    }

    /* renamed from: Sw */
    public final void mo55105Sw() {
        C41205b I = this.f59044d.mo48784a().mo95062A(new C20165f(C22251i.f59068d)).mo95083l(new C20166g(new C22252j(this))).mo95070I(new C20167h(new C22253k(this)), new C20168i(new C22254l(this)));
        C41536l.m120488h(I, "fun getTransactionCatego…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Xw */
    public final void mo55106Xw(long j) {
        C41205b G = this.f59046f.mo48785a(j).mo94904r(new C20162c(new C22255m(this))).mo94888G(new C20163d(this), new C20164e(new C22256n(this)));
        C41536l.m120488h(G, "fun removeTransactionCat…or(it) })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: Yw */
    public final void mo55107Yw(TransactionCategoryModel transactionCategoryModel) {
        C41536l.m120489i(transactionCategoryModel, "category");
        if (transactionCategoryModel.mo55076b()) {
            this.f59056p.mo4826r(new C37223a(transactionCategoryModel));
        }
    }

    /* renamed from: cx */
    public final void mo55108cx(long j, long j2, Long l) {
        C41205b G = this.f59048h.mo48786a(j, j2, l).mo94904r(new C20172m(new C22257o(this))).mo94888G(new C20173n(this), new C20174o(new C22258p(this)));
        C41536l.m120488h(G, "fun saveTransactionCateg…or(it) })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: gx */
    public final void mo55109gx(long j) {
        boolean z;
        this.f59058r = j;
        C1644x xVar = this.f59057q;
        if (this.f59059s != j) {
            z = true;
        } else {
            z = false;
        }
        xVar.mo4826r(Boolean.valueOf(z));
    }

    /* renamed from: hx */
    public final void mo55110hx(long j) {
        boolean z;
        this.f59059s = j;
        C1644x xVar = this.f59057q;
        if (j != this.f59058r) {
            z = true;
        } else {
            z = false;
        }
        xVar.mo4826r(Boolean.valueOf(z));
    }

    /* renamed from: vw */
    public final void mo55111vw(TransactionCategoryModel transactionCategoryModel) {
        C41536l.m120489i(transactionCategoryModel, "category");
        this.f59055o.mo4826r(new C37223a(transactionCategoryModel));
    }

    /* renamed from: ww */
    public final void mo55112ww(String str) {
        C41536l.m120489i(str, "name");
        C37223a aVar = (C37223a) this.f59055o.mo4814f();
        if (aVar != null && ((TransactionCategoryModel) aVar.mo90299d()) != null) {
            C20298a aVar2 = this.f59045e;
            Object f = this.f59055o.mo4814f();
            C41536l.m120486f(f);
            Object d = ((C37223a) f).mo90299d();
            C41536l.m120486f(d);
            C41205b I = aVar2.mo48782a(str, ((TransactionCategoryModel) d).mo55075a()).mo95062A(new C20160a(C22243a.f59060d)).mo95083l(new C20169j(new C22244b(this))).mo95070I(new C20170k(new C22245c(this)), new C20171l(new C22246d(this)));
            C41536l.m120488h(I, "fun addTransactionCatego…        )\n        }\n    }");
            addDisposable(I);
        }
    }
}
