package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.LoyaltyListAction;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.model.Client;
import p729cv.C19799c;
import p895sy.C28290a;
import p906ty.C28530h;
import p950xy.C29870a;
import p950xy.C29875b;
import p961yy.C30123a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel */
public final class LoyaltyListViewModel extends C21481a {

    /* renamed from: d */
    private final C19799c f56816d;

    /* renamed from: e */
    private final C28290a f56817e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C30123a f56818f;

    /* renamed from: g */
    private final Client f56819g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BonusWrapperUiModel f56820h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f56821i = new C1644x();

    /* renamed from: j */
    private final C1644x f56822j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f56823k = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$a */
    static final class C21150a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListViewModel f56824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21150a(LoyaltyListViewModel loyaltyListViewModel) {
            super(0);
            this.f56824d = loyaltyListViewModel;
        }

        public final void invoke() {
            this.f56824d.f56823k.mo4823o(this.f56824d.m68478qw());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$b */
    static final class C21151b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListViewModel f56825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21151b(LoyaltyListViewModel loyaltyListViewModel) {
            super(1);
            this.f56825d = loyaltyListViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f56825d.f56821i, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$c */
    static final class C21152c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListViewModel f56826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21152c(LoyaltyListViewModel loyaltyListViewModel) {
            super(1);
            this.f56826d = loyaltyListViewModel;
        }

        /* renamed from: a */
        public final void mo52878a(C28530h hVar) {
            C41536l.m120489i(hVar, "it");
            BonusWrapperUiModel h = this.f56826d.f56818f.mo70417h(hVar);
            this.f56826d.f56820h = h;
            C21484c.m69418j(this.f56826d.f56821i, h);
            C1644x iw = this.f56826d.f56823k;
            LoyaltyListViewModel loyaltyListViewModel = this.f56826d;
            iw.mo4823o(loyaltyListViewModel.m68477mw(h, loyaltyListViewModel.m68476lw()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52878a((C28530h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$d */
    static final class C21153d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListViewModel f56827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21153d(LoyaltyListViewModel loyaltyListViewModel) {
            super(0);
            this.f56827d = loyaltyListViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f56827d.f56821i, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$e */
    static final class C21154e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoyaltyListViewModel f56828d;

        /* renamed from: e */
        final /* synthetic */ boolean f56829e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21154e(LoyaltyListViewModel loyaltyListViewModel, boolean z) {
            super(1);
            this.f56828d = loyaltyListViewModel;
            this.f56829e = z;
        }

        /* renamed from: a */
        public final void mo52879a(List list) {
            this.f56828d.f56823k.mo4823o(this.f56828d.m68478qw());
            this.f56828d.m68479sw(this.f56829e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52879a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.viewmodel.LoyaltyListViewModel$f */
    /* synthetic */ class C21155f extends C41519a implements C43075l {
        C21155f(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo52880b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52880b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyListViewModel(C19799c cVar, C28290a aVar, C30123a aVar2, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getProductTypes");
        C41536l.m120489i(aVar, "getBonuses");
        C41536l.m120489i(aVar2, "bonusesUiMapper");
        C41536l.m120489i(client, "client");
        this.f56816d = cVar;
        this.f56817e = aVar;
        this.f56818f = aVar2;
        this.f56819g = client;
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public final C29875b m68476lw() {
        return new C29875b(this.f56819g.hasProduct("AMEX"), this.f56819g.hasProduct(ProductType.BONUS_PROD_TYPE_CASHBACK), this.f56819g.hasProduct("SCOOLA"), this.f56819g.hasProduct("PLUS"));
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public final List m68477mw(BonusWrapperUiModel bonusWrapperUiModel, C29875b bVar) {
        List h;
        List<BonusCashBackUiModel> f;
        BonusAmexUiModel a;
        BonusPlusUiModel g;
        ArrayList arrayList = new ArrayList();
        if (bVar.mo70144c() && (g = bonusWrapperUiModel.mo52796g()) != null) {
            arrayList.add(new C29870a.C29873c(g, false, 2, (DefaultConstructorMarker) null));
        }
        if (bVar.mo70142a() && (a = bonusWrapperUiModel.mo52790a()) != null) {
            arrayList.add(new C29870a.C29871a(a, false, 2, (DefaultConstructorMarker) null));
        }
        if (bVar.mo70143b() && (f = bonusWrapperUiModel.mo52795f()) != null) {
            for (BonusCashBackUiModel bVar2 : f) {
                arrayList.add(new C29870a.C29872b(bVar2, false, 2, (DefaultConstructorMarker) null));
            }
        }
        if (bVar.mo70145d() && (h = bonusWrapperUiModel.mo52797h()) != null) {
            arrayList.add(new C29870a.C29874d(h, bonusWrapperUiModel.mo52799j(), false, 4, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final List m68478qw() {
        C29875b lw = m68476lw();
        ArrayList arrayList = new ArrayList();
        if (lw.mo70144c()) {
            arrayList.add(new C29870a.C29873c((BonusPlusUiModel) null, true));
        }
        if (lw.mo70142a()) {
            arrayList.add(new C29870a.C29871a((BonusAmexUiModel) null, true));
        }
        if (lw.mo70143b()) {
            arrayList.add(new C29870a.C29872b((BonusCashBackUiModel) null, true));
        }
        if (lw.mo70145d()) {
            arrayList.add(new C29870a.C29874d((List) null, 0, true));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public final void m68479sw(boolean z) {
        bindToLifecycle(C32343x.m95481r(this.f56817e.mo67918a(z), new C21150a(this), new C21151b(this), new C21152c(this)));
    }

    /* renamed from: uw */
    public static /* synthetic */ void m68480uw(LoyaltyListViewModel loyaltyListViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        loyaltyListViewModel.mo52876tw(z);
    }

    /* renamed from: nw */
    public final LiveData mo52872nw() {
        return this.f56821i;
    }

    /* renamed from: ow */
    public final LiveData mo52873ow() {
        return this.f56823k;
    }

    /* renamed from: pw */
    public final LiveData mo52874pw() {
        return this.f56822j;
    }

    /* renamed from: rw */
    public final void mo52875rw(int i, String str) {
        Object obj;
        Object obj2;
        if (i == 8) {
            if (this.f56819g.hasProduct("AMEX")) {
                obj = new LoyaltyListAction.OpenProduct(i, str);
            } else {
                obj = LoyaltyListAction.Finish.f56803d;
            }
            this.f56822j.mo4823o(C32343x.m95466m(obj));
        } else if (i != 16) {
            this.f56822j.mo4823o(C32343x.m95466m(LoyaltyListAction.Finish.f56803d));
        } else {
            if (this.f56819g.hasProduct("PLUS")) {
                obj2 = new LoyaltyListAction.OpenProduct(i, str);
            } else {
                obj2 = LoyaltyListAction.Finish.f56803d;
            }
            this.f56822j.mo4823o(C32343x.m95466m(obj2));
        }
    }

    /* renamed from: tw */
    public final void mo52876tw(boolean z) {
        C40762x P = C19799c.m65565e(this.f56816d, false, 1, (Object) null).mo94996P();
        C41536l.m120488h(P, "getProductTypes().firstOrError()");
        bindToLifecycle(C32343x.m95484s(P, new C21153d(this), new C21154e(this, z), new C21155f(this.f56821i)));
    }
}
