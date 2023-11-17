package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel;

import a20.C19150a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b20.C19309a;
import b20.C19310b;
import b20.C19311c;
import b20.C19312d;
import b20.C19313e;
import b20.C19314f;
import b20.C19315g;
import b20.C19316h;
import b20.C19317i;
import b20.C19318j;
import b20.C19319k;
import b20.C19320l;
import b20.C19321m;
import b20.C19322n;
import b20.C19323o;
import b20.C19324p;
import b20.C19325q;
import b20.C19326r;
import b60.C19337a;
import ba1.C10146d0;
import cf1.C40407d;
import e41.C31658b;
import ed0.C20217b;
import ed1.C40735b0;
import ed1.C40762x;
import fd0.C20463a;
import g91.C32306g0;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.eventbus.events.PreContractEvent;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10464h;
import p729cv.C19804f;
import p842nv.C26617h;
import p897tp.C28474a;
import p902tu.C28510a;
import p902tu.C28512c;
import p902tu.C28514d;
import p902tu.C28515e;
import p902tu.C28516f;
import p913uu.C28935a;
import p913uu.C28938d;
import p913uu.C28940f;
import p913uu.C28942h;
import p913uu.C28944i;
import p959yw.C30120b;
import p970zw.C30412a;
import pc0.C27494a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import z10.C30132a;
import z10.C30135b;
import z10.C30136c;
import z10.C30137d;
import z10.C30138e;
import z10.C30139f;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel */
public final class CreditApplicationViewModel extends C21481a {

    /* renamed from: f0 */
    public static final C21690a f57910f0 = new C21690a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f57911A;

    /* renamed from: B */
    private final LiveData f57912B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C1644x f57913C;

    /* renamed from: D */
    private final LiveData f57914D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1644x f57915E;

    /* renamed from: F */
    private final LiveData f57916F;

    /* renamed from: G */
    private final C1644x f57917G;

    /* renamed from: H */
    private final LiveData f57918H;

    /* renamed from: I */
    private final C1644x f57919I;

    /* renamed from: J */
    private final LiveData f57920J;

    /* renamed from: K */
    private final C1644x f57921K;

    /* renamed from: L */
    private final LiveData f57922L;

    /* renamed from: M */
    private final C1644x f57923M;

    /* renamed from: N */
    private final LiveData f57924N;

    /* renamed from: O */
    private final C1644x f57925O;

    /* renamed from: P */
    private final LiveData f57926P;

    /* renamed from: Q */
    private final C1644x f57927Q;

    /* renamed from: R */
    private final LiveData f57928R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C1644x f57929S;

    /* renamed from: T */
    private final LiveData f57930T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C1644x f57931U;

    /* renamed from: V */
    private final LiveData f57932V;

    /* renamed from: W */
    private final C1644x f57933W;

    /* renamed from: X */
    private final LiveData f57934X;

    /* renamed from: Y */
    private final C1644x f57935Y;

    /* renamed from: Z */
    private final LiveData f57936Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public C30137d f57937a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public CreditOfferDecisionUiModel f57938b0;

    /* renamed from: c0 */
    private CreditOfferDecisionUiModel f57939c0;

    /* renamed from: d */
    private final C28512c f57940d;

    /* renamed from: d0 */
    private List f57941d0;

    /* renamed from: e */
    private final C28510a f57942e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C30135b f57943e0;

    /* renamed from: f */
    private final C28515e f57944f;

    /* renamed from: g */
    private final C28514d f57945g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C20217b f57946h;

    /* renamed from: i */
    private final C30120b f57947i;

    /* renamed from: j */
    private final C28516f f57948j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C19150a f57949k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C19337a f57950l;

    /* renamed from: m */
    private final C19804f f57951m;

    /* renamed from: n */
    private final C26617h f57952n;

    /* renamed from: o */
    private final C28474a f57953o;

    /* renamed from: p */
    private final C31658b f57954p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C41438c f57955q;

    /* renamed from: r */
    private final C27494a f57956r;

    /* renamed from: s */
    private final C1644x f57957s;

    /* renamed from: t */
    private final LiveData f57958t;

    /* renamed from: u */
    private final C1644x f57959u;

    /* renamed from: v */
    private final LiveData f57960v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f57961w;

    /* renamed from: x */
    private final LiveData f57962x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f57963y;

    /* renamed from: z */
    private final LiveData f57964z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$a */
    public static final class C21690a {
        private C21690a() {
        }

        public /* synthetic */ C21690a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$b */
    static final class C21691b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21691b(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57965d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54164a(C41205b bVar) {
            C21484c.m69417i(this.f57965d.f57963y, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54164a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$c */
    static final class C21692c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30132a f57966d;

        /* renamed from: e */
        final /* synthetic */ CreditApplicationViewModel f57967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21692c(C30132a aVar, CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57966d = aVar;
            this.f57967e = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54165a(C28935a aVar) {
            CreditOfferDecisionUiModel f = this.f57966d.mo70440f();
            C41536l.m120486f(f);
            CreditApplicationViewModel creditApplicationViewModel = this.f57967e;
            C41536l.m120488h(aVar, "it");
            f.mo54067g(creditApplicationViewModel.m70200Gx(aVar));
            CreditApplicationViewModel creditApplicationViewModel2 = this.f57967e;
            CreditOfferDecisionUiModel f2 = this.f57966d.mo70440f();
            C41536l.m120486f(f2);
            creditApplicationViewModel2.f57938b0 = CreditOfferDecisionUiModel.m70140b(f2, (CreditOfferUiModel) null, (ArrayList) null, (CreditCardOfferDetailsUiModel) null, (Integer) null, 15, (Object) null);
            this.f57967e.m70260ux();
            C21484c.m69418j(this.f57967e.f57963y, C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54165a((C28935a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$d */
    static final class C21693d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21693d(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57968d = creditApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getKey(), "text.offers.pop.up.return.to.initial.parameters.cc")) {
                C21484c.m69415g(this.f57968d.f57963y, th, (Object) null, 2, (Object) null);
            } else {
                this.f57968d.f57931U.mo4823o(C32343x.m95466m(C41238w.f97225a));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$e */
    static final class C21694e extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57969d;

        /* renamed from: e */
        final /* synthetic */ C30132a f57970e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21694e(CreditApplicationViewModel creditApplicationViewModel, C30132a aVar) {
            super(2);
            this.f57969d = creditApplicationViewModel;
            this.f57970e = aVar;
        }

        /* renamed from: a */
        public final C41224m invoke(C28940f fVar, C30412a aVar) {
            C41536l.m120489i(fVar, "offerDecision");
            C41536l.m120489i(aVar, "serviceCenter");
            return new C41224m(this.f57969d.f57949k.mo47352c(fVar, this.f57970e.mo70442h(), this.f57970e.mo70438e()), this.f57969d.f57950l.mo47538a(aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$f */
    static final class C21695f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57971d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$f$a */
        static final class C21696a extends C41537m implements C43080q {

            /* renamed from: d */
            public static final C21696a f57972d = new C21696a();

            C21696a() {
                super(3);
            }

            /* renamed from: a */
            public final C41232r invoke(CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list) {
                C41536l.m120489i(creditOfferDecisionUiModel, "creditDecision");
                C41536l.m120489i(serviceCenterUiModel, "serviceCenters");
                C41536l.m120489i(list, "lookUps");
                return new C41232r(creditOfferDecisionUiModel, serviceCenterUiModel, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21695f(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57971d = creditApplicationViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41232r m70299c(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (C41232r) qVar.invoke(obj, obj2, obj3);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "data");
            C40762x z = C40762x.m118162z(mVar.mo95678e());
            C40762x z2 = C40762x.m118162z(mVar.mo95680f());
            C20217b zw = this.f57971d.f57946h;
            String g = ((CreditOfferDecisionUiModel) mVar.mo95678e()).mo54064e().mo54046g();
            return C40762x.m118153S(z, z2, zw.mo48650b("CREDIT_CARD_OFFER_PRODUCTS_" + g), new C21711a(C21696a.f57972d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$g */
    static final class C21697g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21697g(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57973d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54170a(C41205b bVar) {
            C21484c.m69417i(this.f57973d.f57961w, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54170a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$h */
    static final class C21698h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21698h(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57974d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54171a(C41232r rVar) {
            CreditOfferDecisionUiModel creditOfferDecisionUiModel = (CreditOfferDecisionUiModel) rVar.mo95688a();
            List list = (List) rVar.mo95690c();
            CreditApplicationViewModel creditApplicationViewModel = this.f57974d;
            C41536l.m120488h(creditOfferDecisionUiModel, "decision");
            C41536l.m120488h(list, "lookUps");
            CreditApplicationViewModel.m70205Jx(creditApplicationViewModel, creditOfferDecisionUiModel, (ServiceCenterUiModel) rVar.mo95689b(), list, false, 8, (Object) null);
            C21484c.m69418j(this.f57974d.f57961w, C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54171a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$i */
    static final class C21699i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21699i(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57975d = creditApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57975d.f57961w, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$j */
    static final class C21700j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21700j(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57976d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final C30137d invoke(C25950a aVar) {
            C41536l.m120489i(aVar, "preContract");
            C30135b ww = this.f57976d.f57943e0;
            if (ww == null) {
                C41536l.m120506z("creditApplicationFormData");
                ww = null;
            }
            return new C30137d(aVar, C32343x.m95452h0(ww.mo70451b().mo70444i(), new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$k */
    static final class C21701k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21701k(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57977d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54174a(C41205b bVar) {
            C21484c.m69417i(this.f57977d.f57915E, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54174a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$l */
    static final class C21702l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21702l(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57978d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54175a(C30137d dVar) {
            this.f57978d.f57937a0 = dVar;
            CreditApplicationViewModel creditApplicationViewModel = this.f57978d;
            C41536l.m120488h(dVar, "preContract");
            creditApplicationViewModel.m70207Kx(dVar);
            C21484c.m69418j(this.f57978d.f57915E, dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54175a((C30137d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$m */
    static final class C21703m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21703m(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57979d = creditApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57979d.f57915E, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$n */
    static final class C21704n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57980d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21704n(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57980d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54177a(C41205b bVar) {
            C21484c.m69417i(this.f57980d.f57911A, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54177a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$o */
    static final class C21705o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21705o(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57981d = creditApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f57981d.f57911A, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$p */
    static final class C21706p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21706p(CreditApplicationViewModel creditApplicationViewModel) {
            super(0);
            this.f57982d = creditApplicationViewModel;
        }

        public final void invoke() {
            this.f57982d.m70211Ow();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$q */
    static final class C21707q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21707q(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57983d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54179a(C41205b bVar) {
            C21484c.m69417i(this.f57983d.f57913C, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54179a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$r */
    static final class C21708r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21708r(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57984d = creditApplicationViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            BankApiResponse a;
            ApiError apiError = th instanceof ApiError ? (ApiError) th : null;
            this.f57984d.f57955q.mo96184m(new PreContractEvent((Integer) null, (apiError == null || (a = apiError.mo84685a()) == null) ? null : a.getKey()));
            C21484c.m69415g(this.f57984d.f57913C, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$s */
    static final class C21709s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21709s(CreditApplicationViewModel creditApplicationViewModel) {
            super(1);
            this.f57985d = creditApplicationViewModel;
        }

        /* renamed from: a */
        public final void mo54181a(String str) {
            C41536l.m120489i(str, "creditLimit");
            try {
                BigDecimal bigDecimal = new BigDecimal(str);
                C30135b ww = this.f57985d.f57943e0;
                C30135b bVar = null;
                if (ww == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    ww = null;
                }
                if (ww.mo70451b().mo70448m(bigDecimal)) {
                    C30135b ww2 = this.f57985d.f57943e0;
                    if (ww2 == null) {
                        C41536l.m120506z("creditApplicationFormData");
                        ww2 = null;
                    }
                    BigDecimal h = ww2.mo70458h();
                    if (h == null) {
                        h = BigDecimal.ZERO;
                    }
                    if (h.compareTo(bigDecimal) > 0) {
                        this.f57985d.f57929S.mo4823o(C32343x.m95466m(C32343x.m95388F("text.offers.ref.amout.should.be.less.then.loan.amount", new Object[0])));
                        return;
                    }
                    C30135b ww3 = this.f57985d.f57943e0;
                    if (ww3 == null) {
                        C41536l.m120506z("creditApplicationFormData");
                        ww3 = null;
                    }
                    ww3.mo70464m(bigDecimal);
                    C30135b ww4 = this.f57985d.f57943e0;
                    if (ww4 == null) {
                        C41536l.m120506z("creditApplicationFormData");
                    } else {
                        bVar = ww4;
                    }
                    bVar.mo70465n(true);
                    this.f57985d.m70217Rx();
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54181a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel$t */
    static final class C21710t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationViewModel f57986d;

        /* renamed from: e */
        final /* synthetic */ Intent f57987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21710t(CreditApplicationViewModel creditApplicationViewModel, Intent intent) {
            super(1);
            this.f57986d = creditApplicationViewModel;
            this.f57987e = intent;
        }

        /* renamed from: a */
        public final void mo54182a(String str) {
            C41536l.m120489i(str, "serviceCenterId");
            C30135b ww = this.f57986d.f57943e0;
            C30135b bVar = null;
            if (ww == null) {
                C41536l.m120506z("creditApplicationFormData");
                ww = null;
            }
            ServiceCenterUiModel j = ww.mo70451b().mo70445j();
            C41536l.m120486f(j);
            List g = j.mo55429g();
            C41536l.m120486f(g);
            String stringExtra = this.f57987e.getStringExtra("CITY_WIZARD_ID");
            C41536l.m120486f(stringExtra);
            int parseInt = Integer.parseInt(stringExtra);
            String stringExtra2 = this.f57987e.getStringExtra("REGION_WIZARD_ID");
            C41536l.m120486f(stringExtra2);
            int parseInt2 = Integer.parseInt(stringExtra2);
            int parseInt3 = Integer.parseInt(str);
            if (parseInt != -1 && parseInt2 != -1 && parseInt3 != -1) {
                C30135b ww2 = this.f57986d.f57943e0;
                if (ww2 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    ww2 = null;
                }
                ww2.mo70462k((ServiceCenterUiModel) g.get(parseInt));
                C30135b ww3 = this.f57986d.f57943e0;
                if (ww3 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    ww3 = null;
                }
                C30135b ww4 = this.f57986d.f57943e0;
                if (ww4 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    ww4 = null;
                }
                ServiceCenterUiModel a = ww4.mo70450a();
                C41536l.m120486f(a);
                List g2 = a.mo55429g();
                C41536l.m120486f(g2);
                ww3.mo70467p((ServiceCenterUiModel) g2.get(parseInt2));
                C30135b ww5 = this.f57986d.f57943e0;
                if (ww5 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    ww5 = null;
                }
                C30135b ww6 = this.f57986d.f57943e0;
                if (ww6 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                } else {
                    bVar = ww6;
                }
                ServiceCenterUiModel f = bVar.mo70456f();
                C41536l.m120486f(f);
                List g3 = f.mo55429g();
                C41536l.m120486f(g3);
                ww5.mo70468q((ServiceCenterUiModel) g3.get(parseInt3));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54182a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditApplicationViewModel(C28512c cVar, C28510a aVar, C28515e eVar, C28514d dVar, C20217b bVar, C30120b bVar2, C28516f fVar, C19150a aVar2, C19337a aVar3, C19804f fVar2, C26617h hVar, C28474a aVar4, C31658b bVar3, C41438c cVar2, C27494a aVar5) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C28512c cVar3 = cVar;
        C28510a aVar6 = aVar;
        C28515e eVar2 = eVar;
        C28514d dVar2 = dVar;
        C20217b bVar4 = bVar;
        C30120b bVar5 = bVar2;
        C28516f fVar3 = fVar;
        C19150a aVar7 = aVar2;
        C19337a aVar8 = aVar3;
        C19804f fVar4 = fVar2;
        C26617h hVar2 = hVar;
        C28474a aVar9 = aVar4;
        C31658b bVar6 = bVar3;
        C41536l.m120489i(cVar3, "getCreditAppDecision");
        C41536l.m120489i(aVar6, "checkCreditAppDecision");
        C41536l.m120489i(eVar2, "identifyCreditor");
        C41536l.m120489i(dVar2, "preContractUseCaseGet");
        C41536l.m120489i(bVar4, "getLookUp");
        C41536l.m120489i(bVar5, "getServiceCenters");
        C41536l.m120489i(fVar3, "registerCredit");
        C41536l.m120489i(aVar7, "creditOfferMapper");
        C41536l.m120489i(aVar8, "serviceCentersMapper");
        C41536l.m120489i(fVar4, "refreshProductTypeList");
        C41536l.m120489i(hVar2, "refreshOffers");
        C41536l.m120489i(aVar9, "applicationEventPoster");
        C41536l.m120489i(bVar6, "startTMXProfilingUseCase");
        C41536l.m120489i(cVar2, "eventBus");
        C41536l.m120489i(aVar5, "otpParamsMapBuilder");
        this.f57940d = cVar3;
        this.f57942e = aVar6;
        this.f57944f = eVar2;
        this.f57945g = dVar2;
        this.f57946h = bVar4;
        this.f57947i = bVar5;
        this.f57948j = fVar3;
        this.f57949k = aVar7;
        this.f57950l = aVar8;
        this.f57951m = fVar4;
        this.f57952n = hVar2;
        this.f57953o = aVar9;
        this.f57954p = bVar6;
        this.f57955q = cVar2;
        this.f57956r = aVar5;
        C1644x xVar = new C1644x();
        this.f57957s = xVar;
        this.f57958t = xVar;
        C1644x xVar2 = new C1644x();
        this.f57959u = xVar2;
        this.f57960v = xVar2;
        C1644x xVar3 = new C1644x();
        this.f57961w = xVar3;
        this.f57962x = xVar3;
        C1644x xVar4 = new C1644x();
        this.f57963y = xVar4;
        this.f57964z = xVar4;
        C1644x xVar5 = new C1644x();
        this.f57911A = xVar5;
        this.f57912B = xVar5;
        C1644x xVar6 = new C1644x();
        this.f57913C = xVar6;
        this.f57914D = xVar6;
        C1644x xVar7 = new C1644x();
        this.f57915E = xVar7;
        this.f57916F = xVar7;
        C1644x xVar8 = new C1644x();
        this.f57917G = xVar8;
        this.f57918H = xVar8;
        C1644x xVar9 = new C1644x();
        this.f57919I = xVar9;
        this.f57920J = xVar9;
        C1644x xVar10 = new C1644x();
        this.f57921K = xVar10;
        this.f57922L = xVar10;
        C1644x xVar11 = new C1644x();
        this.f57923M = xVar11;
        this.f57924N = xVar11;
        C1644x xVar12 = new C1644x();
        this.f57925O = xVar12;
        this.f57926P = xVar12;
        C1644x xVar13 = new C1644x();
        this.f57927Q = xVar13;
        this.f57928R = xVar13;
        C1644x xVar14 = new C1644x();
        this.f57929S = xVar14;
        this.f57930T = xVar14;
        C1644x xVar15 = new C1644x();
        this.f57931U = xVar15;
        this.f57932V = xVar15;
        C1644x xVar16 = new C1644x();
        this.f57933W = xVar16;
        this.f57934X = xVar16;
        C1644x xVar17 = new C1644x();
        this.f57935Y = xVar17;
        this.f57936Z = xVar17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0195, code lost:
        if (r5 == null) goto L_0x0197;
     */
    /* renamed from: Ax */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList m70189Ax() {
        /*
            r15 = this;
            z10.b r0 = r15.f57943e0
            r1 = 0
            java.lang.String r2 = "creditApplicationFormData"
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r0 = r1
        L_0x000b:
            z10.b r3 = r15.f57943e0
            if (r3 != 0) goto L_0x0013
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r3 = r1
        L_0x0013:
            z10.a r3 = r3.mo70451b()
            ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferDecisionUiModel r3 = r3.mo70440f()
            kotlin.jvm.internal.C41536l.m120486f(r3)
            ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel r3 = r3.mo54062d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = new ge.bog.mobilebank.ui.wizard.model.WizardObject
            r5.<init>()
            r6 = 1
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setInputStyle(r6)
            r7 = 302(0x12e, float:4.23E-43)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setInputType(r7)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setAmountObject(r6)
            int r7 = p366bk.C10328q.offer_details_credit_card_limit_range
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.math.BigDecimal r9 = r3.mo54107d()
            r10 = 0
            r8[r10] = r9
            java.math.BigDecimal r9 = r3.mo54106b()
            r8[r6] = r9
            java.lang.String r7 = g91.C32343x.m95452h0(r7, r8)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setInputTitle(r7)
            java.lang.String r7 = r3.mo54105a()
            java.lang.String r7 = g91.C32303f.m95197h(r7)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setNonSelectableString(r7)
            java.math.BigDecimal r7 = r3.mo54107d()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = r5.setMinAmount(r7)
            java.math.BigDecimal r3 = r3.mo54106b()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r5.setMaxAmount(r3)
            java.lang.String r5 = "LIMIT_WIZARD_ID"
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r3.setId(r5)
            java.math.BigDecimal r5 = r0.mo70452c()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r3.setValue(r5)
            r4.add(r3)
            z10.b r3 = r15.f57943e0
            if (r3 != 0) goto L_0x008e
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r3 = r1
        L_0x008e:
            z10.a r3 = r3.mo70451b()
            boolean r3 = r3.mo70446k()
            if (r3 == 0) goto L_0x0212
            z10.b r3 = r15.f57943e0
            if (r3 != 0) goto L_0x00a0
            kotlin.jvm.internal.C41536l.m120506z(r2)
            goto L_0x00a1
        L_0x00a0:
            r1 = r3
        L_0x00a1:
            z10.a r1 = r1.mo70451b()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r1 = r1.mo70445j()
            if (r1 == 0) goto L_0x00b1
            java.util.List r1 = r1.mo55429g()
            if (r1 != 0) goto L_0x00b5
        L_0x00b1:
            java.util.List r1 = ie1.C41341q.m119907j()
        L_0x00b5:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = new ge.bog.mobilebank.ui.wizard.model.WizardObject
            r2.<init>()
            r3 = 5
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setInputStyle(r3)
            int r5 = p366bk.C10328q.select_city
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r5 = g91.C32343x.m95452h0(r5, r7)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setInputTitle(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = ie1.C41343r.m119925u(r1, r7)
            r5.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L_0x00da:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r7.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r8 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r8
            java.lang.String r8 = r8.mo55424d()
            r5.add(r8)
            goto L_0x00da
        L_0x00ee:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setSelectorOptionPreviews(r5)
            java.lang.String r5 = "CITY_WIZARD_ID"
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setId(r5)
            java.util.Iterator r1 = r1.iterator()
            r5 = r10
        L_0x00fd:
            boolean r7 = r1.hasNext()
            r8 = -1
            if (r7 == 0) goto L_0x0125
            java.lang.Object r7 = r1.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r7 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r7
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r9 = r0.mo70450a()
            if (r9 == 0) goto L_0x011e
            long r11 = r7.mo55422a()
            long r13 = r9.mo55422a()
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x011e
            r7 = r6
            goto L_0x011f
        L_0x011e:
            r7 = r10
        L_0x011f:
            if (r7 == 0) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            int r5 = r5 + 1
            goto L_0x00fd
        L_0x0125:
            r5 = r8
        L_0x0126:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r1 = r2.setValue(r1)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = new ge.bog.mobilebank.ui.wizard.model.WizardObject
            r2.<init>()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setInputStyle(r3)
            int r5 = p366bk.C10328q.select_region
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r5 = g91.C32343x.m95452h0(r5, r7)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setInputTitle(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setSelectorOptionPreviews(r5)
            java.lang.String r5 = "REGION_WIZARD_ID"
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setId(r5)
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r5 = r0.mo70450a()
            java.lang.String r7 = "-1"
            if (r5 == 0) goto L_0x0197
            java.util.List r5 = r5.mo55429g()
            if (r5 == 0) goto L_0x0197
            java.util.Iterator r5 = r5.iterator()
            r9 = r10
        L_0x0165:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x018c
            java.lang.Object r11 = r5.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r11 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r11
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r12 = r0.mo70456f()
            if (r12 == 0) goto L_0x0185
            long r13 = r11.mo55422a()
            long r11 = r12.mo55422a()
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0185
            r11 = r6
            goto L_0x0186
        L_0x0185:
            r11 = r10
        L_0x0186:
            if (r11 == 0) goto L_0x0189
            goto L_0x018d
        L_0x0189:
            int r9 = r9 + 1
            goto L_0x0165
        L_0x018c:
            r9 = r8
        L_0x018d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0198
        L_0x0197:
            r5 = r7
        L_0x0198:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r2.setValue(r5)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r5 = new ge.bog.mobilebank.ui.wizard.model.WizardObject
            r5.<init>()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r5.setInputStyle(r3)
            int r5 = p366bk.C10328q.select_service_center
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.String r5 = g91.C32343x.m95452h0(r5, r9)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r3.setInputTitle(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r3.setSelectorOptionPreviews(r5)
            java.lang.String r5 = "SERVICE_CENTER_WIZARD_ID"
            ge.bog.mobilebank.ui.wizard.model.WizardObject r3 = r3.setId(r5)
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r5 = r0.mo70456f()
            if (r5 == 0) goto L_0x0205
            java.util.List r5 = r5.mo55429g()
            if (r5 == 0) goto L_0x0205
            java.util.Iterator r5 = r5.iterator()
            r9 = r10
        L_0x01d1:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x01f9
            java.lang.Object r11 = r5.next()
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r11 = (p341ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel) r11
            ge.bog.mobilebank.cleanarch.presentation.servicecenter.model.ServiceCenterUiModel r12 = r0.mo70457g()
            if (r12 == 0) goto L_0x01f1
            long r13 = r11.mo55422a()
            long r11 = r12.mo55422a()
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x01f1
            r11 = r6
            goto L_0x01f2
        L_0x01f1:
            r11 = r10
        L_0x01f2:
            if (r11 == 0) goto L_0x01f6
            r8 = r9
            goto L_0x01f9
        L_0x01f6:
            int r9 = r9 + 1
            goto L_0x01d1
        L_0x01f9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r7 = r0
        L_0x0205:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r0 = r3.setValue(r7)
            r4.add(r1)
            r4.add(r2)
            r4.add(r0)
        L_0x0212:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.viewmodel.CreditApplicationViewModel.m70189Ax():java.util.ArrayList");
    }

    /* renamed from: Bx */
    private final void m70191Bx(C43064a aVar) {
        C41205b G = this.f57944f.mo68112a().mo94906z(C40992a.m118827a()).mo94904r(new C19321m(new C21704n(this))).mo94888G(new C19322n(aVar, this), new C19323o(new C21705o(this)));
        C41536l.m120488h(G, "private fun identifyCred…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cx */
    public static final void m70193Cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dx */
    public static final void m70195Dx(C43064a aVar, CreditApplicationViewModel creditApplicationViewModel) {
        C41536l.m120489i(aVar, "$onSuccess");
        C41536l.m120489i(creditApplicationViewModel, "this$0");
        aVar.invoke();
        C21484c.m69418j(creditApplicationViewModel.f57911A, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ex */
    public static final void m70197Ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gx */
    public final CreditCardOfferDetailsUiModel m70200Gx(C28935a aVar) {
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        return CreditCardOfferDetailsUiModel.m70125b(f.mo54064e(), (String) null, (String) null, (Double) null, (String) null, (Double) null, (String) null, (Double) null, (BigDecimal) null, 0, (String) null, (String) null, (String) null, aVar.mo68689a().mo68694b(), (Double) null, (Double) null, (String) null, aVar.mo68689a().mo68693a(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, aVar.mo68689a().mo68695c(), aVar.mo68689a().mo68696d(), (String) null, (String) null, (String) null, (String) null, -805376001, 3, (Object) null);
    }

    /* renamed from: Ix */
    private final void m70203Ix(CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list, boolean z) {
        List list2;
        List list3 = list;
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar3 = null;
        }
        bVar.mo70463l(C30132a.m91133b(bVar3.mo70451b(), (String) null, (C28942h) null, (OfferProductCode) null, creditOfferDecisionUiModel, serviceCenterUiModel, m70220Tw(list3), 7, (Object) null));
        this.f57939c0 = CreditOfferDecisionUiModel.m70140b(creditOfferDecisionUiModel, (CreditOfferUiModel) null, CreditOfferDecisionUiModel.m70140b(creditOfferDecisionUiModel, (CreditOfferUiModel) null, (ArrayList) null, (CreditCardOfferDetailsUiModel) null, (Integer) null, 15, (Object) null).mo54066f(), (CreditCardOfferDetailsUiModel) null, (Integer) null, 13, (Object) null);
        this.f57941d0 = list3;
        C30135b bVar4 = this.f57943e0;
        if (bVar4 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar4 = null;
        }
        bVar4.mo70464m(creditOfferDecisionUiModel.mo54062d().mo54106b());
        C30135b bVar5 = this.f57943e0;
        if (bVar5 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar5 = null;
        }
        ArrayList<CreditOfferRefinanceUiModel> f = creditOfferDecisionUiModel.mo54066f();
        if (f != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
            for (CreditOfferRefinanceUiModel b : f) {
                arrayList.add(CreditOfferRefinanceUiModel.m70148b(b, (C28944i) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C24978b) null, (String) null, (String) null, (String) null, (String) null, false, false, false, 524287, (Object) null));
            }
            list2 = C41358y.m120036z0(arrayList);
        } else {
            list2 = null;
        }
        bVar5.mo70466o(list2);
        if (!z) {
            m70224Xx();
        }
        m70213Px();
        m70215Qx();
        m70217Rx();
        m70218Sw();
        C1644x xVar = this.f57923M;
        C30135b bVar6 = this.f57943e0;
        if (bVar6 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar6;
        }
        xVar.mo4823o(new C37223a(bVar2.mo70451b().mo70436c()));
    }

    /* renamed from: Jx */
    static /* synthetic */ void m70205Jx(CreditApplicationViewModel creditApplicationViewModel, CreditOfferDecisionUiModel creditOfferDecisionUiModel, ServiceCenterUiModel serviceCenterUiModel, List list, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        creditApplicationViewModel.m70203Ix(creditOfferDecisionUiModel, serviceCenterUiModel, list, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kx */
    public final void m70207Kx(C30137d dVar) {
        m70226Zx();
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        BigDecimal k = f.mo54064e().mo54051k();
        if (k != null) {
            C30135b bVar3 = this.f57943e0;
            if (bVar3 == null) {
                C41536l.m120506z("creditApplicationFormData");
                bVar3 = null;
            }
            CreditOfferDecisionUiModel f2 = bVar3.mo70451b().mo70440f();
            C41536l.m120486f(f2);
            if (k.compareTo(f2.mo54064e().mo54045f()) < 0) {
                C1644x xVar = this.f57919I;
                C30135b bVar4 = this.f57943e0;
                if (bVar4 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                } else {
                    bVar2 = bVar4;
                }
                CreditOfferDecisionUiModel f3 = bVar2.mo70451b().mo70440f();
                C41536l.m120486f(f3);
                xVar.mo4823o(new C37223a(f3));
                return;
            }
        }
        this.f57917G.mo4823o(new C37223a(dVar));
        this.f57937a0 = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public final void m70211Ow() {
        ArrayList arrayList;
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        C30132a b = bVar.mo70451b();
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar3 = null;
        }
        List e = bVar3.mo70454e();
        if (e != null) {
            ArrayList<CreditOfferRefinanceUiModel> arrayList2 = new ArrayList<>();
            for (Object next : e) {
                if (((CreditOfferRefinanceUiModel) next).mo54096v()) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (CreditOfferRefinanceUiModel a : arrayList2) {
                arrayList3.add(this.f57949k.mo47350a(a));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        C28510a aVar = this.f57942e;
        C28942h h = b.mo70442h();
        CreditOfferDecisionUiModel f = b.mo70440f();
        C41536l.m120486f(f);
        String valueOf = String.valueOf(f.mo54064e().mo54049i());
        CreditOfferDecisionUiModel f2 = b.mo70440f();
        C41536l.m120486f(f2);
        String j = f2.mo54064e().mo54050j();
        C30135b bVar4 = this.f57943e0;
        if (bVar4 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar4;
        }
        BigDecimal c = bVar2.mo70452c();
        C41536l.m120486f(c);
        String bigDecimal = c.toString();
        C41536l.m120488h(bigDecimal, "creditApplicationFormData.creditLimit!!.toString()");
        CreditOfferDecisionUiModel f3 = b.mo70440f();
        C41536l.m120486f(f3);
        C41205b I = aVar.mo68108a(h, valueOf, j, bigDecimal, arrayList, f3.mo54062d().mo54109e()).mo95063B(C40992a.m118827a()).mo95083l(new C19324p(new C21691b(this))).mo95070I(new C19325q(new C21692c(b, this)), new C19326r(new C21693d(this)));
        C41536l.m120488h(I, "private fun checkCreditD…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final void m70212Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Px */
    private final void m70213Px() {
        C1644x xVar = this.f57957s;
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        xVar.mo4823o(new C37223a(bVar.mo70451b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m70214Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Qx */
    private final void m70215Qx() {
        C1644x xVar = this.f57959u;
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        xVar.mo4823o(new C37223a(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m70216Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public final void m70217Rx() {
        C1644x xVar = this.f57927Q;
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        xVar.mo4823o(new C37223a(Boolean.valueOf(bVar.mo70453d())));
    }

    /* renamed from: Sw */
    private final void m70218Sw() {
        boolean z;
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        List e = bVar.mo70454e();
        if (e != null) {
            boolean z2 = false;
            if (!e.isEmpty()) {
                Iterator it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CreditOfferRefinanceUiModel creditOfferRefinanceUiModel = (CreditOfferRefinanceUiModel) it.next();
                    if (!creditOfferRefinanceUiModel.mo54096v() || creditOfferRefinanceUiModel.mo54093t() != C28944i.CRI) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            this.f57925O.mo4823o(new C37223a(new C30138e(z2, true)));
        }
    }

    /* renamed from: Sx */
    private final void m70219Sx() {
        this.f57951m.mo48092a();
        this.f57952n.mo65871a();
        this.f57953o.mo68096b();
    }

    /* renamed from: Tw */
    private final List m70220Tw(List list) {
        List<List> N = C41358y.m119998N(list, 2);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(N, 10));
        for (List list2 : N) {
            arrayList.add(new C30136c(((C20463a) list2.get(0)).mo49001a(), ((C20463a) list2.get(1)).mo49001a()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final void m70221Ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vx */
    public static final void m70222Vx(CreditApplicationViewModel creditApplicationViewModel, CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel) {
        C41536l.m120489i(creditApplicationViewModel, "this$0");
        C41536l.m120489i(creditCardOfferDetailsUiModel, "$details");
        creditApplicationViewModel.m70225Yx(creditCardOfferDetailsUiModel);
        C30135b bVar = null;
        creditApplicationViewModel.f57955q.mo96184m(new PreContractEvent(-1, (String) null));
        C21484c.m69418j(creditApplicationViewModel.f57913C, C41238w.f97225a);
        C1644x xVar = creditApplicationViewModel.f57935Y;
        C30135b bVar2 = creditApplicationViewModel.f57943e0;
        if (bVar2 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar = bVar2;
        }
        xVar.mo4823o(C32343x.m95466m(bVar));
        creditApplicationViewModel.m70219Sx();
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final void m70223Wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Xx */
    private final void m70224Xx() {
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        if (f.mo54064e().mo54054p()) {
            C36546y.m108282F().mo27137H("open_amex_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            return;
        }
        C36546y.m108282F().mo27137H("open_express_credit_card_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C36546y.m108282F().mo27148o("open_express_credit_card_offer");
    }

    /* renamed from: Yx */
    private final void m70225Yx(CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel) {
        C41524c0 c0Var = C41524c0.f97701a;
        Object[] objArr = new Object[2];
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        objArr[0] = bVar.mo70451b().mo70438e().toString();
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar3;
        }
        objArr[1] = bVar2.mo70451b().mo70442h().mo68796b();
        String format = String.format("%s_%s", Arrays.copyOf(objArr, 2));
        C41536l.m120488h(format, "format(format, *args)");
        if (creditCardOfferDetailsUiModel.mo54054p()) {
            C36546y.m108282F().mo27137H("activate_amex_offer", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        } else {
            C36546y.m108282F().mo27152s("offers", format, "activate_offer");
        }
        C32306g0.m95221b("credit_card_offer_activated", creditCardOfferDetailsUiModel.mo54046g());
    }

    /* renamed from: Zx */
    private final void m70226Zx() {
        C41524c0 c0Var = C41524c0.f97701a;
        Object[] objArr = new Object[2];
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        objArr[0] = bVar.mo70451b().mo70438e().toString();
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar3;
        }
        objArr[1] = bVar2.mo70451b().mo70442h().mo68796b();
        String format = String.format("%s_%s", Arrays.copyOf(objArr, 2));
        C41536l.m120488h(format, "format(format, *args)");
        C36546y.m108282F().mo27152s("offers", format, "open_offer_precontract");
    }

    /* renamed from: ax */
    public static /* synthetic */ CreditOfferRepositoryImpl.CreditApplicationParams m70227ax(CreditApplicationViewModel creditApplicationViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return creditApplicationViewModel.mo54148Zw(str, str2, str3);
    }

    /* renamed from: ay */
    private final void m70228ay() {
        C1644x xVar = this.f57921K;
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        xVar.mo4823o(C32343x.m95466m(Boolean.valueOf(bVar.mo70451b().mo70446k())));
        C1644x xVar2 = this.f57923M;
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar3;
        }
        xVar2.mo4823o(C32343x.m95466m(bVar2.mo70451b().mo70436c()));
    }

    /* renamed from: cx */
    private final void m70229cx() {
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        C30132a b = bVar.mo70451b();
        C40762x r = C40762x.m118154T(this.f57940d.mo68109b(b.mo70441g(), b.mo70442h().mo68796b()), C30120b.m91112c(this.f57947i, (String) null, 1, (Object) null), new C19310b(new C21694e(this, b))).mo95087r(new C19311c(new C21695f(this)));
        C41536l.m120488h(r, "private fun getCreditDec…).bindToLifecycle()\n    }");
        C41205b I = C32343x.m95415S0(r).mo95083l(new C19312d(new C21697g(this))).mo95070I(new C19313e(new C21698h(this)), new C19314f(new C21699i(this)));
        C41536l.m120488h(I, "private fun getCreditDec…).bindToLifecycle()\n    }");
        bindToLifecycle(I);
    }

    /* renamed from: cy */
    private final void m70230cy(Intent intent) {
        C32343x.m95461k0(intent, "LIMIT_WIZARD_ID", new C21709s(this));
        C32343x.m95461k0(intent, "SERVICE_CENTER_WIZARD_ID", new C21710t(this, intent));
        m70215Qx();
    }

    /* access modifiers changed from: private */
    /* renamed from: dx */
    public static final C41224m m70232dx(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final C40735b0 m70234ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m70236fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m70238gx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public static final void m70240hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: kx */
    private final String m70244kx() {
        String str;
        C30137d dVar;
        C25950a a;
        C37223a aVar = (C37223a) this.f57917G.mo4814f();
        if (aVar == null || (dVar = (C30137d) aVar.mo90299d()) == null || (a = dVar.mo70475a()) == null) {
            str = null;
        } else {
            str = a.mo64864a();
        }
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* renamed from: px */
    private final void m70250px() {
        List list;
        if (this.f57938b0 != null) {
            C30135b bVar = this.f57943e0;
            C30135b bVar2 = null;
            if (bVar == null) {
                C41536l.m120506z("creditApplicationFormData");
                bVar = null;
            }
            if (bVar.mo70460i()) {
                CreditOfferDecisionUiModel creditOfferDecisionUiModel = this.f57938b0;
                C41536l.m120486f(creditOfferDecisionUiModel);
                CreditCardOfferDetailsUiModel e = creditOfferDecisionUiModel.mo54064e();
                C30135b bVar3 = this.f57943e0;
                if (bVar3 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    bVar3 = null;
                }
                OfferProductCode e2 = bVar3.mo70451b().mo70438e();
                long i = e.mo54049i();
                String j = e.mo54050j();
                C30135b bVar4 = this.f57943e0;
                if (bVar4 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    bVar4 = null;
                }
                String b = bVar4.mo70451b().mo70442h().mo68796b();
                C30135b bVar5 = this.f57943e0;
                if (bVar5 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                    bVar5 = null;
                }
                BigDecimal c = bVar5.mo70452c();
                C41536l.m120486f(c);
                String bigDecimal = c.toString();
                C41536l.m120488h(bigDecimal, "creditApplicationFormData.creditLimit!!.toString()");
                String m = e.mo54053m();
                String e3 = e.mo54043e();
                C30135b bVar6 = this.f57943e0;
                if (bVar6 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                } else {
                    bVar2 = bVar6;
                }
                List e4 = bVar2.mo70454e();
                if (e4 != null) {
                    ArrayList<CreditOfferRefinanceUiModel> arrayList = new ArrayList<>();
                    for (Object next : e4) {
                        if (((CreditOfferRefinanceUiModel) next).mo54096v()) {
                            arrayList.add(next);
                        }
                    }
                    list = new ArrayList(C41343r.m119925u(arrayList, 10));
                    for (CreditOfferRefinanceUiModel a : arrayList) {
                        list.add(this.f57949k.mo47350a(a));
                    }
                } else {
                    list = C41341q.m119907j();
                }
                C41205b I = this.f57945g.mo68111a(new C28938d(e2, i, j, b, bigDecimal, m, e3, list, "CC_OFFER_EC_AC")).mo95063B(C40992a.m118827a()).mo95062A(new C19309a(new C21700j(this))).mo95083l(new C19318j(new C21701k(this))).mo95070I(new C19319k(new C21702l(this)), new C19320l(new C21703m(this)));
                C41536l.m120488h(I, "private fun getPreContra…       })\n        )\n    }");
                addDisposable(I);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: qx */
    public static final C30137d m70252qx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C30137d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rx */
    public static final void m70254rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sx */
    public static final void m70256sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tx */
    public static final void m70258tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public final void m70260ux() {
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        if (bVar.mo70451b().mo70436c() == C30132a.C30133a.FULL) {
            m70250px();
        }
    }

    /* renamed from: Fx */
    public final void mo54135Fx(CreditOfferLimitUiModel creditOfferLimitUiModel, String str) {
        C41536l.m120489i(creditOfferLimitUiModel, "creditOfferLimit");
        C41536l.m120489i(str, "offerNo");
        this.f57943e0 = new C30135b(new C30132a(str, creditOfferLimitUiModel.mo54632e(), creditOfferLimitUiModel.mo54630d(), (CreditOfferDecisionUiModel) null, (ServiceCenterUiModel) null, (List) null, 56, (DefaultConstructorMarker) null), (BigDecimal) null, (List) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, (ServiceCenterUiModel) null, false, 126, (DefaultConstructorMarker) null);
        m70228ay();
        mo54151ix();
    }

    /* renamed from: Hx */
    public final void mo54136Hx(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10001 && intent != null) {
            m70230cy(intent);
        }
    }

    /* renamed from: Lx */
    public final boolean mo54137Lx(int i, boolean z) {
        boolean z2;
        BigDecimal bigDecimal;
        CreditOfferRefinanceUiModel creditOfferRefinanceUiModel;
        boolean z3;
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        List e = bVar.mo70454e();
        C41536l.m120486f(e);
        CreditOfferRefinanceUiModel creditOfferRefinanceUiModel2 = (CreditOfferRefinanceUiModel) e.get(i);
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar3 = null;
        }
        BigDecimal h = bVar3.mo70458h();
        if (h == null) {
            return false;
        }
        C30135b bVar4 = this.f57943e0;
        if (bVar4 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar4 = null;
        }
        List e2 = bVar4.mo70454e();
        C41536l.m120486f(e2);
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CreditOfferRefinanceUiModel creditOfferRefinanceUiModel3 = (CreditOfferRefinanceUiModel) it.next();
                if (!C41536l.m120484d(creditOfferRefinanceUiModel3, creditOfferRefinanceUiModel2) || creditOfferRefinanceUiModel3.mo54096v() != z) {
                    z3 = false;
                    continue;
                } else {
                    z3 = true;
                    continue;
                }
                if (z3) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            bigDecimal = BigDecimal.ZERO;
        } else if (z) {
            bigDecimal = h.add(new BigDecimal(creditOfferRefinanceUiModel2.mo54080f()));
            C41536l.m120488h(bigDecimal, "this.add(other)");
        } else {
            bigDecimal = h.subtract(new BigDecimal(creditOfferRefinanceUiModel2.mo54080f()));
            C41536l.m120488h(bigDecimal, "this.subtract(other)");
        }
        C30135b bVar5 = this.f57943e0;
        if (bVar5 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar5 = null;
        }
        BigDecimal c = bVar5.mo70452c();
        if (c == null) {
            c = BigDecimal.ZERO;
        }
        if (bigDecimal.compareTo(c) > 0) {
            this.f57929S.mo4823o(new C37223a(C32343x.m95388F("text.offers.ref.amout.should.be.less.then.loan.amount", new Object[0])));
            return false;
        }
        C30135b bVar6 = this.f57943e0;
        if (bVar6 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar6 = null;
        }
        List e3 = bVar6.mo70454e();
        if (e3 != null) {
            creditOfferRefinanceUiModel = (CreditOfferRefinanceUiModel) e3.get(i);
        } else {
            creditOfferRefinanceUiModel = null;
        }
        if (creditOfferRefinanceUiModel != null) {
            creditOfferRefinanceUiModel.mo54100y(z);
        }
        C30135b bVar7 = this.f57943e0;
        if (bVar7 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar7;
        }
        bVar2.mo70465n(true);
        m70217Rx();
        m70218Sw();
        return true;
    }

    /* renamed from: Mx */
    public final void mo54138Mx() {
        CreditOfferDecisionUiModel creditOfferDecisionUiModel;
        List list;
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        this.f57943e0 = bVar.mo70461j();
        CreditOfferDecisionUiModel creditOfferDecisionUiModel2 = this.f57939c0;
        if (creditOfferDecisionUiModel2 == null) {
            C41536l.m120506z("decisionDefaultParams");
            creditOfferDecisionUiModel = null;
        } else {
            creditOfferDecisionUiModel = creditOfferDecisionUiModel2;
        }
        C30135b bVar2 = this.f57943e0;
        if (bVar2 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar2 = null;
        }
        ServiceCenterUiModel j = bVar2.mo70451b().mo70445j();
        List list2 = this.f57941d0;
        if (list2 == null) {
            C41536l.m120506z("lookUps");
            list = null;
        } else {
            list = list2;
        }
        m70205Jx(this, creditOfferDecisionUiModel, j, list, false, 8, (Object) null);
    }

    /* renamed from: Nx */
    public final void mo54139Nx() {
        C30137d dVar = this.f57937a0;
        if (dVar != null) {
            this.f57917G.mo4823o(C32343x.m95466m(dVar));
            this.f57937a0 = null;
        }
    }

    /* renamed from: Ox */
    public final void mo54140Ox(int i, View view) {
        List list;
        C41536l.m120489i(view, "view");
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        ServiceCenterUiModel j = bVar.mo70451b().mo70445j();
        if (j == null || (list = j.mo55429g()) == null) {
            list = C41341q.m119907j();
        }
        this.f57933W.mo4823o(C32343x.m95466m(new C30139f(i, view, list, m70189Ax())));
    }

    /* renamed from: Tx */
    public final void mo54141Tx(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C30135b bVar = this.f57943e0;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        CreditCardOfferDetailsUiModel e = f.mo54064e();
        this.f57955q.mo96184m(new PreContractEvent(true));
        C41205b G = this.f57948j.mo68113a(mo54157ox(mo54148Zw(str, str2, str3))).mo94906z(C40992a.m118827a()).mo94904r(new C19315g(new C21707q(this))).mo94888G(new C19316h(this, e), new C19317i(new C21708r(this)));
        C41536l.m120488h(G, "fun registerCredit(opera…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: U1 */
    public final LiveData mo54142U1() {
        return this.f57916F;
    }

    /* renamed from: Uw */
    public final LiveData mo54143Uw() {
        return this.f57960v;
    }

    /* renamed from: Vw */
    public final LiveData mo54144Vw() {
        return this.f57958t;
    }

    /* renamed from: Ww */
    public final LiveData mo54145Ww() {
        return this.f57924N;
    }

    /* renamed from: Xw */
    public final LiveData mo54146Xw() {
        return this.f57928R;
    }

    /* renamed from: Yw */
    public final LiveData mo54147Yw() {
        return this.f57964z;
    }

    /* renamed from: Zw */
    public final CreditOfferRepositoryImpl.CreditApplicationParams mo54148Zw(String str, String str2, String str3) {
        String str4;
        List g;
        ServiceCenterUiModel serviceCenterUiModel;
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        CreditOfferDecisionUiModel f = bVar.mo70451b().mo70440f();
        C41536l.m120486f(f);
        CreditCardOfferDetailsUiModel e = f.mo54064e();
        C30135b bVar3 = this.f57943e0;
        if (bVar3 == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar3 = null;
        }
        ServiceCenterUiModel g2 = bVar3.mo70457g();
        if (g2 == null || (g = g2.mo55429g()) == null || (serviceCenterUiModel = (ServiceCenterUiModel) g.get(0)) == null) {
            str4 = null;
        } else {
            str4 = serviceCenterUiModel.mo55428f();
        }
        C30135b bVar4 = this.f57943e0;
        if (bVar4 == null) {
            C41536l.m120506z("creditApplicationFormData");
        } else {
            bVar2 = bVar4;
        }
        String g3 = bVar2.mo70451b().mo70441g();
        String valueOf = String.valueOf(e.mo54049i());
        String j = e.mo54050j();
        if (str4 == null) {
            str4 = "";
        }
        return new CreditOfferRepositoryImpl.CreditApplicationParams(g3, valueOf, j, "", str4, C10146d0.C10177h.m37232a(), m70244kx(), BankApi.OFFERS_PROCESS_CARD_REGISTRATION, str, str2, str3);
    }

    /* renamed from: bv */
    public final void mo54149bv(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        mo54141Tx(str, str2, str3);
    }

    /* renamed from: bx */
    public final LiveData mo54150bx() {
        return this.f57962x;
    }

    /* renamed from: ix */
    public final void mo54151ix() {
        C21484c.m69417i(this.f57961w, (Object) null, 1, (Object) null);
        bindToLifecycle(this.f57954p.mo72084b(TMXFlags.TMX_FLAG_CARD_APPLICATION_KEY));
        m70229cx();
    }

    /* renamed from: jx */
    public final LiveData mo54152jx() {
        return this.f57922L;
    }

    /* renamed from: k0 */
    public final void mo54153k0() {
        C30135b bVar = this.f57943e0;
        C30135b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("creditApplicationFormData");
            bVar = null;
        }
        if (bVar.mo70451b().mo70436c() == C30132a.C30133a.FULL) {
            C30135b bVar3 = this.f57943e0;
            if (bVar3 == null) {
                C41536l.m120506z("creditApplicationFormData");
                bVar3 = null;
            }
            if (bVar3.mo70453d()) {
                C30135b bVar4 = this.f57943e0;
                if (bVar4 == null) {
                    C41536l.m120506z("creditApplicationFormData");
                } else {
                    bVar2 = bVar4;
                }
                CreditOfferDecisionUiModel f = bVar2.mo70451b().mo70440f();
                C41536l.m120486f(f);
                ArrayList f2 = f.mo54066f();
                boolean z = false;
                if (f2 != null && !f2.isEmpty()) {
                    Iterator it = f2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((CreditOfferRefinanceUiModel) it.next()).mo54097w()) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    m70191Bx(new C21706p(this));
                } else {
                    m70211Ow();
                }
            } else {
                m70250px();
            }
        } else {
            C30135b bVar5 = this.f57943e0;
            if (bVar5 == null) {
                C41536l.m120506z("creditApplicationFormData");
            } else {
                bVar2 = bVar5;
            }
            if (bVar2.mo70451b().mo70436c() == C30132a.C30133a.CALCULATION) {
                m70211Ow();
            }
        }
    }

    /* renamed from: lx */
    public final LiveData mo54154lx() {
        return this.f57912B;
    }

    /* renamed from: mx */
    public final LiveData mo54155mx() {
        return this.f57932V;
    }

    /* renamed from: nx */
    public final LiveData mo54156nx() {
        return this.f57936Z;
    }

    /* renamed from: ox */
    public final HashMap mo54157ox(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f57956r.mo66809a(otpParams);
    }

    /* renamed from: vx */
    public final LiveData mo54158vx() {
        return this.f57926P;
    }

    /* renamed from: wx */
    public final LiveData mo54159wx() {
        return this.f57914D;
    }

    /* renamed from: x0 */
    public final LiveData mo54160x0() {
        return this.f57930T;
    }

    /* renamed from: xx */
    public final LiveData mo54161xx() {
        return this.f57920J;
    }

    /* renamed from: yx */
    public final LiveData mo54162yx() {
        return this.f57918H;
    }

    /* renamed from: zx */
    public final LiveData mo54163zx() {
        return this.f57934X;
    }
}
