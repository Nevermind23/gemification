package p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.HashMap;
import k50.C25655a;
import k50.C25656b;
import k50.C25657c;
import k50.C25658d;
import k50.C25659e;
import k50.C25660f;
import k50.C25661g;
import k50.C25662h;
import k50.C25663i;
import k50.C25664j;
import k50.C25665k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p729cv.C19803e;
import p729cv.C19804f;
import p803jw.C25509a;
import p803jw.C25510b;
import p842nv.C26617h;
import p843nw.C26628j;
import p863pw.C27633k;
import p897tp.C28474a;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel */
public final class ProductConfirmationViewModel extends C21481a {

    /* renamed from: d */
    private final C25509a f59114d;

    /* renamed from: e */
    private final C25510b f59115e;

    /* renamed from: f */
    private final C19804f f59116f;

    /* renamed from: g */
    private final C26628j f59117g;

    /* renamed from: h */
    private final C19803e f59118h;

    /* renamed from: i */
    private final C26617h f59119i;

    /* renamed from: j */
    private C28474a f59120j;

    /* renamed from: k */
    private final C27494a f59121k;

    /* renamed from: l */
    public PendingProductConfirmationData f59122l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f59123m;

    /* renamed from: n */
    private final LiveData f59124n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f59125o;

    /* renamed from: p */
    private final LiveData f59126p;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$a */
    public enum C22280a {
        ACCEPT(true),
        DECLINE(false);
        

        /* renamed from: d */
        private final boolean f59130d;

        private C22280a(boolean z) {
            this.f59130d = z;
        }

        /* renamed from: b */
        public final boolean mo55189b() {
            return this.f59130d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$b */
    static final class C22281b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22281b(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59131d = productConfirmationViewModel;
        }

        /* renamed from: a */
        public final void mo55190a(C41205b bVar) {
            C21484c.m69417i(this.f59131d.f59125o, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55190a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$c */
    static final class C22282c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22282c(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59132d = productConfirmationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59132d.f59125o, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$d */
    static final class C22283d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22283d(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59133d = productConfirmationViewModel;
        }

        /* renamed from: a */
        public final void mo55192a(C41205b bVar) {
            C21484c.m69417i(this.f59133d.f59125o, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55192a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$e */
    static final class C22284e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22284e(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59134d = productConfirmationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59134d.f59125o, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$f */
    static final class C22285f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22285f(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59135d = productConfirmationViewModel;
        }

        /* renamed from: a */
        public final void mo55194a(C41205b bVar) {
            C21484c.m69417i(this.f59135d.f59123m, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55194a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$g */
    static final class C22286g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22286g(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59136d = productConfirmationViewModel;
        }

        /* renamed from: a */
        public final void mo55195a(String str) {
            C1644x tw = this.f59136d.f59123m;
            C41536l.m120488h(str, "it");
            C21484c.m69418j(tw, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55195a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$h */
    static final class C22287h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationViewModel f59137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22287h(ProductConfirmationViewModel productConfirmationViewModel) {
            super(1);
            this.f59137d = productConfirmationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59137d.f59123m, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$i */
    static final class C22288i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22288i f59138d = new C22288i();

        C22288i() {
            super(1);
        }

        /* renamed from: a */
        public final void mo55197a(C27633k kVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55197a((C27633k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$j */
    static final class C22289j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22289j f59139d = new C22289j();

        C22289j() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductConfirmationViewModel(C25509a aVar, C25510b bVar, C19804f fVar, C26628j jVar, C19803e eVar, C26617h hVar, C28474a aVar2, C27494a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "confirmPendingProductUseCase");
        C41536l.m120489i(bVar, "getPendingProductContractUseCase");
        C41536l.m120489i(fVar, "refreshProductTypeList");
        C41536l.m120489i(jVar, "getAccountsWithCardsUseCase");
        C41536l.m120489i(eVar, "refreshAssetLiability");
        C41536l.m120489i(hVar, "refreshOffersInfoUseCase");
        C41536l.m120489i(aVar2, "applicationEventPoster");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        this.f59114d = aVar;
        this.f59115e = bVar;
        this.f59116f = fVar;
        this.f59117g = jVar;
        this.f59118h = eVar;
        this.f59119i = hVar;
        this.f59120j = aVar2;
        this.f59121k = aVar3;
        C1644x xVar = new C1644x();
        this.f59123m = xVar;
        this.f59124n = xVar;
        C1644x xVar2 = new C1644x();
        this.f59125o = xVar2;
        this.f59126p = xVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m72187Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m72188Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final void m72189Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final void m72190Gw(C22280a aVar) {
        this.f59116f.mo48092a();
        this.f59118h.mo48091a();
        this.f59119i.mo65871a();
        C41205b G0 = this.f59117g.mo65882c(true).mo94987J0(C40992a.m118827a()).mo94983G0(new C25665k(C22288i.f59138d), new C25656b(C22289j.f59139d));
        C41536l.m120488h(G0, "getAccountsWithCardsUseC…read()).subscribe({}, {})");
        bindToLifecycle(G0);
        C21484c.m69418j(this.f59125o, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m72191Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m72192Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m72204pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m72205qw(ProductConfirmationViewModel productConfirmationViewModel) {
        C41536l.m120489i(productConfirmationViewModel, "this$0");
        productConfirmationViewModel.m72190Gw(C22280a.ACCEPT);
        productConfirmationViewModel.f59120j.mo68096b();
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m72206rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m72209vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m72210ww(ProductConfirmationViewModel productConfirmationViewModel) {
        C41536l.m120489i(productConfirmationViewModel, "this$0");
        productConfirmationViewModel.m72190Gw(C22280a.DECLINE);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m72211xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public final PendingProductConfirmationData mo55181Aw() {
        PendingProductConfirmationData pendingProductConfirmationData = this.f59122l;
        if (pendingProductConfirmationData != null) {
            return pendingProductConfirmationData;
        }
        C41536l.m120506z("data");
        return null;
    }

    /* renamed from: Bw */
    public final HashMap mo55182Bw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f59121k.mo66809a(otpParams);
    }

    /* renamed from: Cw */
    public final void mo55183Cw() {
        C41205b I = this.f59115e.mo64060a(mo55181Aw().mo55155d()).mo95063B(C40992a.m118827a()).mo95083l(new C25662h(new C22285f(this))).mo95070I(new C25663i(new C22286g(this)), new C25664j(new C22287h(this)));
        C41536l.m120488h(I, "fun requestHtml() {\n    …       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Jw */
    public final void mo55184Jw(PendingProductConfirmationData pendingProductConfirmationData) {
        C41536l.m120489i(pendingProductConfirmationData, "<set-?>");
        this.f59122l = pendingProductConfirmationData;
    }

    /* renamed from: ow */
    public final void mo55185ow(long j, String str, String str2, String str3, String str4) {
        String str5 = str;
        C41536l.m120489i(str5, "responseKey");
        String str6 = str2;
        C41536l.m120489i(str6, "operationId");
        String str7 = str3;
        C41536l.m120489i(str7, "operationReference");
        String str8 = str4;
        C41536l.m120489i(str8, "scaAuthCode");
        C41205b G = this.f59114d.mo64059a(new PendingProductConfirmationParams(j, str5, true, (String) null, str6, str7, str8, 8, (DefaultConstructorMarker) null)).mo94906z(C40992a.m118827a()).mo94904r(new C25659e(new C22281b(this))).mo94888G(new C25660f(this), new C25661g(new C22282c(this)));
        C41536l.m120488h(G, "fun acceptOffer(\n       …       })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: uw */
    public final void mo55186uw(long j, String str, String str2, String str3, String str4) {
        String str5 = str;
        C41536l.m120489i(str5, "responseKey");
        String str6 = str2;
        C41536l.m120489i(str6, "operationId");
        String str7 = str3;
        C41536l.m120489i(str7, "operationReference");
        String str8 = str4;
        C41536l.m120489i(str8, "scaAuthCode");
        C41205b G = this.f59114d.mo64059a(new PendingProductConfirmationParams(j, str5, false, (String) null, str6, str7, str8, 8, (DefaultConstructorMarker) null)).mo94906z(C40992a.m118827a()).mo94904r(new C25655a(new C22283d(this))).mo94888G(new C25657c(this), new C25658d(new C22284e(this)));
        C41536l.m120488h(G, "fun declineOffer(\n      …or(it) })\n        )\n    }");
        addDisposable(G);
    }

    /* renamed from: yw */
    public final LiveData mo55187yw() {
        return this.f59126p;
    }

    /* renamed from: zw */
    public final LiveData mo55188zw() {
        return this.f59124n;
    }
}
