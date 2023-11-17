package p341ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p776gy.C24837a;
import p815ky.C25786a;
import p815ky.C25787b;
import p815ky.C25788c;
import p815ky.C25789d;
import p815ky.C25790e;
import p815ky.C25791f;
import p951xz.C29881d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel */
public final class LeadApplicationActionSheetViewModel extends C21481a {

    /* renamed from: i */
    public static final C21115a f56676i = new C21115a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C24837a f56677d;

    /* renamed from: e */
    private final C29881d f56678e;

    /* renamed from: f */
    private OfferInfo f56679f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f56680g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f56681h = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$a */
    public static final class C21115a {
        private C21115a() {
        }

        public /* synthetic */ C21115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$b */
    static final class C21116b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationActionSheetViewModel f56682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21116b(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
            super(1);
            this.f56682d = leadApplicationActionSheetViewModel;
        }

        /* renamed from: a */
        public final void mo52374a(C41205b bVar) {
            C21484c.m69417i(this.f56682d.f56681h, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52374a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$c */
    static final class C21117c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationActionSheetViewModel f56683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21117c(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
            super(1);
            this.f56683d = leadApplicationActionSheetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C1644x jw = this.f56683d.f56681h;
            C41536l.m120488h(bool, "isAllowed");
            C21484c.m69418j(jw, bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$d */
    static final class C21118d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationActionSheetViewModel f56684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21118d(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
            super(1);
            this.f56684d = leadApplicationActionSheetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56684d.f56681h, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$e */
    static final class C21119e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationActionSheetViewModel f56685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21119e(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
            super(1);
            this.f56685d = leadApplicationActionSheetViewModel;
        }

        /* renamed from: a */
        public final void mo52377a(C41205b bVar) {
            C21484c.m69417i(this.f56685d.f56680g, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52377a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.leadapplication.presentation.viewmodel.LeadApplicationActionSheetViewModel$f */
    static final class C21120f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LeadApplicationActionSheetViewModel f56686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21120f(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
            super(1);
            this.f56686d = leadApplicationActionSheetViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56686d.f56680g, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadApplicationActionSheetViewModel(C24837a aVar, C29881d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "sendLeadApplication");
        C41536l.m120489i(dVar, "isNewAppAllowed");
        this.f56677d = aVar;
        this.f56678e = dVar;
    }

    /* renamed from: lw */
    private final C41224m m68332lw() {
        OfferInfo offerInfo = this.f56679f;
        if (offerInfo == null) {
            C41536l.m120506z("offerInfo");
            offerInfo = null;
        }
        OfferProductCode productCode = offerInfo.getProductCode();
        if (C41536l.m120484d(productCode, OfferProductCode.C21019ML.f56477f)) {
            return C41233s.m119492a("MRT", "MR1");
        }
        if (C41536l.m120484d(productCode, OfferProductCode.C21025SL.f56480f)) {
            return C41233s.m119492a("CNS", "NOP");
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m68333ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m68334pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m68335qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m68336sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m68337tw(LeadApplicationActionSheetViewModel leadApplicationActionSheetViewModel) {
        C41536l.m120489i(leadApplicationActionSheetViewModel, "this$0");
        C21484c.m69418j(leadApplicationActionSheetViewModel.f56680g, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m68338uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: k0 */
    public final void mo52370k0() {
        C41224m lw = m68332lw();
        if (lw != null) {
            String str = (String) lw.mo95675a();
            String str2 = (String) lw.mo95676b();
            C24837a aVar = this.f56677d;
            OfferInfo offerInfo = this.f56679f;
            OfferInfo offerInfo2 = null;
            if (offerInfo == null) {
                C41536l.m120506z("offerInfo");
                offerInfo = null;
            }
            String valueOf = String.valueOf(offerInfo.getOfferAmount());
            OfferInfo offerInfo3 = this.f56679f;
            if (offerInfo3 == null) {
                C41536l.m120506z("offerInfo");
            } else {
                offerInfo2 = offerInfo3;
            }
            C41205b G = aVar.mo63246a("CREDIT_LEAD", str, str2, valueOf, offerInfo2.getOfferCcy()).mo94906z(C40992a.m118827a()).mo94904r(new C25789d(new C21119e(this))).mo94888G(new C25790e(this), new C25791f(new C21120f(this)));
            C41536l.m120488h(G, "fun onContinueClick() {\n… .bindToLifecycle()\n    }");
            bindToLifecycle(G);
        }
    }

    /* renamed from: mw */
    public final LiveData mo52371mw() {
        return this.f56680g;
    }

    /* renamed from: nw */
    public final void mo52372nw(OfferInfo offerInfo) {
        C41536l.m120489i(offerInfo, "offerInfo");
        this.f56679f = offerInfo;
        C41205b I = this.f56678e.mo70152a("CREDIT_LEAD").mo95063B(C40992a.m118827a()).mo95083l(new C25786a(new C21116b(this))).mo95070I(new C25787b(new C21117c(this)), new C25788c(new C21118d(this)));
        C41536l.m120488h(I, "fun initialize(offerInfo…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: rw */
    public final LiveData mo52373rw() {
        return this.f56681h;
    }
}
