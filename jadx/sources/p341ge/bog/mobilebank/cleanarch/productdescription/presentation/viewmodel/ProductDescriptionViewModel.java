package p341ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n60.C26373a;
import o60.C26761b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionUiModel;
import r60.C27945a;
import s60.C28152a;
import s60.C28153b;
import s60.C28154c;
import s60.C28155d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel */
public final class ProductDescriptionViewModel extends C21481a {

    /* renamed from: d */
    private final C26373a f59510d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27945a f59511e;

    /* renamed from: f */
    private String f59512f;

    /* renamed from: g */
    private String f59513g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f59514h = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel$a */
    static final class C22500a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDescriptionViewModel f59515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22500a(ProductDescriptionViewModel productDescriptionViewModel) {
            super(1);
            this.f59515d = productDescriptionViewModel;
        }

        /* renamed from: a */
        public final ProductDescriptionUiModel invoke(C26761b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f59515d.f59511e.mo67513b(bVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel$b */
    static final class C22501b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDescriptionViewModel f59516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22501b(ProductDescriptionViewModel productDescriptionViewModel) {
            super(1);
            this.f59516d = productDescriptionViewModel;
        }

        /* renamed from: a */
        public final void mo55567a(C41205b bVar) {
            C21484c.m69417i(this.f59516d.f59514h, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55567a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel$c */
    static final class C22502c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDescriptionViewModel f59517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22502c(ProductDescriptionViewModel productDescriptionViewModel) {
            super(1);
            this.f59517d = productDescriptionViewModel;
        }

        /* renamed from: a */
        public final void mo55568a(ProductDescriptionUiModel productDescriptionUiModel) {
            this.f59517d.mo55565sw(productDescriptionUiModel.mo55546a());
            this.f59517d.mo55564rw(productDescriptionUiModel.mo55547b());
            C1644x iw = this.f59517d.f59514h;
            C41536l.m120488h(productDescriptionUiModel, "data");
            C21484c.m69418j(iw, productDescriptionUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55568a((ProductDescriptionUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.viewmodel.ProductDescriptionViewModel$d */
    static final class C22503d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductDescriptionViewModel f59518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22503d(ProductDescriptionViewModel productDescriptionViewModel) {
            super(1);
            this.f59518d = productDescriptionViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59518d.f59514h, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDescriptionViewModel(C26373a aVar, C27945a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "productDescriptionTextUseCase");
        C41536l.m120489i(aVar2, "productDescriptionTextUiUiMapper");
        this.f59510d = aVar;
        this.f59511e = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final ProductDescriptionUiModel m72945mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (ProductDescriptionUiModel) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m72946nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m72947ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m72948pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: jw */
    public final String mo55560jw() {
        return this.f59513g;
    }

    /* renamed from: kw */
    public final String mo55561kw() {
        return this.f59512f;
    }

    /* renamed from: lw */
    public final void mo55562lw(String str) {
        C41536l.m120489i(str, "lookUpName");
        C41205b I = this.f59510d.mo65577a(str).mo95063B(C40992a.m118827a()).mo95062A(new C28152a(new C22500a(this))).mo95083l(new C28153b(new C22501b(this))).mo95070I(new C28154c(new C22502c(this)), new C28155d(new C22503d(this)));
        C41536l.m120488h(I, "fun getProductDetailsTex…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: qw */
    public final LiveData mo55563qw() {
        return this.f59514h;
    }

    /* renamed from: rw */
    public final void mo55564rw(String str) {
        this.f59513g = str;
    }

    /* renamed from: sw */
    public final void mo55565sw(String str) {
        this.f59512f = str;
    }
}
