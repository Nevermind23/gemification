package p341ge.bog.mobilebank.openbanking.presentation.details;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import hv0.C36239k;
import hv0.C36241l;
import iv0.C36554f;
import iv0.C36557i;
import iv0.C36559k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nv0.C37475g;
import nv0.C37476h;
import nv0.C37477i;
import nv0.C37478j;
import nv0.C37479k;
import nv0.C37480l;
import nv0.C37481m;
import nv0.C37482n;
import nv0.C37483o;
import o31.C37600h;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;
import qv0.C38251a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel */
public final class ProductDetailsViewModel$ViewModel extends C21481a implements C37600h.C37601a, C37475g, C37476h {

    /* renamed from: l */
    public static final C33409h f81570l = new C33409h((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36241l f81571d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38251a f81572e;

    /* renamed from: f */
    private final C37475g f81573f = this;

    /* renamed from: g */
    private final C37476h f81574g = this;

    /* renamed from: h */
    private final C40765a f81575h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f81576i;

    /* renamed from: j */
    private final LiveData f81577j;

    /* renamed from: k */
    private final C40767b f81578k;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$a */
    static final class C33400a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33400a f81579d = new C33400a();

        C33400a() {
            super(1);
        }

        /* renamed from: a */
        public final C41232r invoke(ProductUiModel productUiModel) {
            C41536l.m120489i(productUiModel, "it");
            return new C41232r(productUiModel, 1, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$b */
    static final class C33401b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C33401b f81580d = new C33401b();

        C33401b() {
            super(2);
        }

        /* renamed from: a */
        public final C41232r invoke(Integer num, ProductUiModel productUiModel) {
            C41536l.m120489i(num, "page");
            C41536l.m120489i(productUiModel, "product");
            return new C41232r(productUiModel, num, 3);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$c */
    static final class C33402c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C33402c f81581d = new C33402c();

        C33402c() {
            super(2);
        }

        /* renamed from: a */
        public final C41232r mo79219a(int i, ProductUiModel productUiModel) {
            C41536l.m120489i(productUiModel, "product");
            return new C41232r(productUiModel, 1, Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo79219a(((Number) obj).intValue(), (ProductUiModel) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$d */
    static final class C33403d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsViewModel$ViewModel f81582d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$d$a */
        static final class C33404a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ int f81583d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33404a(int i) {
                super(1);
                this.f81583d = i;
            }

            /* renamed from: a */
            public final C41224m invoke(C31128a aVar) {
                C41536l.m120489i(aVar, "it");
                return new C41224m(aVar, Integer.valueOf(this.f81583d));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33403d(ProductDetailsViewModel$ViewModel productDetailsViewModel$ViewModel) {
            super(1);
            this.f81582d = productDetailsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m98145c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41232r rVar) {
            C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
            ProductUiModel productUiModel = (ProductUiModel) rVar.mo95688a();
            int intValue = ((Number) rVar.mo95689b()).intValue();
            int intValue2 = ((Number) rVar.mo95690c()).intValue();
            C36241l rw = this.f81582d.f81571d;
            String e = productUiModel.mo79107e();
            String b = productUiModel.mo79105d().mo79092b();
            String f = productUiModel.mo79109f();
            C41536l.m120486f(f);
            C40749p O = rw.mo88981a(e, b, f, intValue).mo95075O();
            C41536l.m120488h(O, "getTransactions(\n       …          .toObservable()");
            return C31270e.m92879h(O, intValue2).mo95026k0(new C33435e(new C33404a(intValue)));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$e */
    static final class C33405e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsViewModel$ViewModel f81584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33405e(ProductDetailsViewModel$ViewModel productDetailsViewModel$ViewModel) {
            super(1);
            this.f81584d = productDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79222a(C41224m mVar) {
            List list;
            Object obj;
            C31128a.C31129a aVar;
            C31128a aVar2 = (C31128a) mVar.mo95675a();
            int intValue = ((Number) mVar.mo95676b()).intValue();
            C41536l.m120488h(aVar2, "result");
            C33441g gVar = null;
            C36559k kVar = (C36559k) C31132b.m92649k(aVar2, (Object) null);
            if (kVar != null) {
                list = this.f81584d.f81572e.mo91784b(kVar);
            } else {
                list = null;
            }
            if (list == null) {
                list = C41341q.m119907j();
            }
            try {
                if (aVar2 instanceof C31128a.C31131c) {
                    C36559k kVar2 = (C36559k) ((C31128a.C31131c) aVar2).mo71340a();
                    obj = new C31128a.C31131c(new C33411a(kVar2.mo89387b().isEmpty(), kVar2.mo89386a()), aVar2.mo71341b());
                } else if (aVar2 instanceof C31128a.C31129a) {
                    aVar = new C31128a.C31129a(((C31128a.C31129a) aVar2).mo71342c(), aVar2.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    obj = aVar;
                } else if (aVar2 instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar2.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar = new C31128a.C31129a(th, aVar2.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            C1644x uw = this.f81584d.f81576i;
            C33441g gVar2 = (C33441g) uw.mo4814f();
            if (gVar2 != null) {
                gVar = C33441g.m98189b(gVar2, (C33425d.C33434i) null, (C33425d.C33426a) null, new C41224m(Integer.valueOf(intValue), obj), C41358y.m120023m0(gVar2.mo79257e(), list), 3, (Object) null);
            }
            uw.mo4826r(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79222a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$f */
    static final class C33406f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36239k f81585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33406f(C36239k kVar) {
            super(1);
            this.f81585d = kVar;
        }

        /* renamed from: a */
        public final C40754t invoke(ProductUiModel productUiModel) {
            C41536l.m120489i(productUiModel, "product");
            C36239k kVar = this.f81585d;
            String e = productUiModel.mo79107e();
            C36557i g = productUiModel.mo79110g();
            String f = productUiModel.mo79109f();
            C41536l.m120486f(f);
            C40749p O = kVar.mo88979b(e, g, f).mo95075O();
            C41536l.m120488h(O, "getProductDetails(produc…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$g */
    static final class C33407g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDetailsViewModel$ViewModel f81586d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$g$a */
        static final class C33408a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductDetailsViewModel$ViewModel f81587d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33408a(ProductDetailsViewModel$ViewModel productDetailsViewModel$ViewModel) {
                super(1);
                this.f81587d = productDetailsViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo79225a(C36554f fVar) {
                C33441g gVar;
                C1644x uw = this.f81587d.f81576i;
                C33441g tw = this.f81587d.m98134xw();
                if (tw != null) {
                    C38251a sw = this.f81587d.f81572e;
                    C41536l.m120488h(fVar, "it");
                    gVar = C33441g.m98189b(tw, sw.mo91783a(fVar), this.f81587d.f81572e.mo91785c(fVar), (C41224m) null, (List) null, 12, (Object) null);
                } else {
                    gVar = null;
                }
                uw.mo4826r(gVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79225a((C36554f) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33407g(ProductDetailsViewModel$ViewModel productDetailsViewModel$ViewModel) {
            super(1);
            this.f81586d = productDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo79224a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33408a(this.f81586d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79224a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$h */
    public static final class C33409h {
        private C33409h() {
        }

        public /* synthetic */ C33409h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.ProductDetailsViewModel$ViewModel$i */
    static final class C33410i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33410i f81588d = new C33410i();

        C33410i() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C33441g gVar) {
            C41536l.m120488h(gVar, "it");
            return C33436f.m98186b(gVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$ViewModel(C36239k kVar, C36241l lVar, C38251a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "getProductDetails");
        C41536l.m120489i(lVar, "getTransactions");
        C41536l.m120489i(aVar, "mapper");
        this.f81571d = lVar;
        this.f81572e = aVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<ProductUiModel>()");
        this.f81575h = h1;
        C1644x xVar = new C1644x(new C33441g((C33425d.C33434i) null, (C33425d.C33426a) null, (C41224m) null, (List) null, 15, (DefaultConstructorMarker) null));
        this.f81576i = xVar;
        this.f81577j = C1607m0.m5655c(xVar, C33410i.f81588d);
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Int>()");
        this.f81578k = h12;
        C41205b F0 = C40749p.m118049m0(h1.mo95026k0(new C37477i(C33400a.f81579d)), h12.mo95014Y0(h1, new C37478j(C33401b.f81580d)), onRefresh().mo95014Y0(h1, new C37479k(C33402c.f81581d))).mo94989L0(new C37480l(new C33403d(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37481m(new C33405e(this)));
        C41536l.m120488h(F0, "merge(\n                p…      }\n                }");
        bindToLifecycle(F0);
        C41205b F02 = h1.mo94989L0(new C37482n(new C33406f(kVar))).mo95027o0(C40992a.m118827a()).mo94981F0(new C37483o(new C33407g(this)));
        C41536l.m120488h(F02, "productSubject.switchMap…      }\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C41232r m98123kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41232r) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C41232r m98124lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41232r) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C41232r m98125mw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41232r) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final C40754t m98126nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m98127ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final C40754t m98128pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m98129qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public final C33441g m98134xw() {
        return (C33441g) this.f81576i.mo4814f();
    }

    /* renamed from: C9 */
    public boolean mo60611C9() {
        C41224m d;
        C31128a aVar;
        C33411a aVar2;
        C33441g gVar = (C33441g) this.f81576i.mo4814f();
        if (gVar == null || (d = gVar.mo79256d()) == null || (aVar = (C31128a) d.mo95680f()) == null || (aVar2 = (C33411a) C31132b.m92649k(aVar, (Object) null)) == null) {
            return false;
        }
        return aVar2.mo79227a();
    }

    /* renamed from: j */
    public LiveData mo79212j() {
        return this.f81577j;
    }

    /* renamed from: n9 */
    public void mo79213n9(ProductUiModel productUiModel) {
        C41536l.m120489i(productUiModel, "selectedProduct");
        if (!C41536l.m120484d(productUiModel, this.f81575h.mo95100j1())) {
            this.f81575h.onNext(productUiModel);
        }
    }

    /* renamed from: o1 */
    public void mo79214o1() {
        C41224m d;
        C33441g gVar = (C33441g) this.f81576i.mo4814f();
        if (gVar != null && (d = gVar.mo79256d()) != null) {
            int intValue = ((Number) d.mo95675a()).intValue();
            C31128a aVar = (C31128a) d.mo95676b();
            if (aVar instanceof C31128a.C31131c) {
                this.f81578k.onNext(Integer.valueOf(intValue + 1));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f81578k.onNext(Integer.valueOf(intValue));
            }
        }
    }

    /* renamed from: vw */
    public final C37475g mo79215vw() {
        return this.f81573f;
    }

    /* renamed from: ww */
    public final C37476h mo79216ww() {
        return this.f81574g;
    }
}
