package yz0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b41.C31128a;
import b41.C31132b;
import g81.C32254m;
import g91.C32343x;
import h21.C36143a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hy0.C36270d;
import hy0.C36274h;
import iu0.C36546y;
import iy0.C36635t;
import java.util.ArrayList;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.eventbus.events.DeleteSavedCardEvent;
import p341ge.bog.mobilebank.eventbus.events.PaymentCardsEvent;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35673u0;
import p341ge.bog.mobilebank.products.presentation.managecardsandaccounts.viewmodel.ManageCardsViewModel$ViewModel;
import p366bk.C10318g;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: yz0.d */
public final class C40124d extends C35673u0 implements C32254m.C32260f {

    /* renamed from: j */
    public static final C40125a f95365j = new C40125a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C36635t f95366d;

    /* renamed from: e */
    private final C41217g f95367e;

    /* renamed from: f */
    private C32254m f95368f;

    /* renamed from: g */
    private PaymentCardsEvent f95369g;

    /* renamed from: h */
    private ArrayList f95370h;

    /* renamed from: i */
    private DeleteSavedCardEvent f95371i;

    /* renamed from: yz0.d$a */
    public static final class C40125a {
        private C40125a() {
        }

        public /* synthetic */ C40125a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: yz0.d$b */
    static final class C40126b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40124d f95372d;

        /* renamed from: yz0.d$b$a */
        static final class C40127a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40124d f95373d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C40127a(C40124d dVar) {
                super(1);
                this.f95373d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                LoadingView loadingView = this.f95373d.m116254p1().f88426e;
                C41536l.m120488h(loadingView, "binding.bannerLoader");
                C32343x.m95447f1(loadingView);
                BannerCard bannerCard = this.f95373d.m116254p1().f88428g;
                C41536l.m120488h(bannerCard, "binding.insuranceBanner");
                C32343x.m95455i0(bannerCard);
            }
        }

        /* renamed from: yz0.d$b$b */
        static final class C40128b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40124d f95374d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C40128b(C40124d dVar) {
                super(1);
                this.f95374d = dVar;
            }

            /* renamed from: a */
            public final void mo94065a(boolean z) {
                LoadingView loadingView = this.f95374d.m116254p1().f88426e;
                C41536l.m120488h(loadingView, "binding.bannerLoader");
                C32343x.m95455i0(loadingView);
                BannerCard bannerCard = this.f95374d.m116254p1().f88428g;
                C41536l.m120488h(bannerCard, "binding.insuranceBanner");
                C32343x.m95483r1(bannerCard, z, false, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo94065a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: yz0.d$b$c */
        static final class C40129c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40124d f95375d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C40129c(C40124d dVar) {
                super(1);
                this.f95375d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                LoadingView loadingView = this.f95375d.m116254p1().f88426e;
                C41536l.m120488h(loadingView, "binding.bannerLoader");
                C32343x.m95455i0(loadingView);
                BannerCard bannerCard = this.f95375d.m116254p1().f88428g;
                C41536l.m120488h(bannerCard, "binding.insuranceBanner");
                C32343x.m95455i0(bannerCard);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40126b(C40124d dVar) {
            super(1);
            this.f95372d = dVar;
        }

        /* renamed from: a */
        public final void mo94063a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C40127a(this.f95372d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C40128b(this.f95372d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C40129c(this.f95372d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94063a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yz0.d$c */
    static final class C40130c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f95376a;

        C40130c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f95376a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f95376a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f95376a.invoke(obj);
        }
    }

    /* renamed from: yz0.d$d */
    public static final class C40131d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f95377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40131d(Fragment fragment) {
            super(0);
            this.f95377d = fragment;
        }

        public final Fragment invoke() {
            return this.f95377d;
        }
    }

    /* renamed from: yz0.d$e */
    public static final class C40132e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f95378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40132e(C43064a aVar) {
            super(0);
            this.f95378d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f95378d.invoke();
        }
    }

    /* renamed from: yz0.d$f */
    public static final class C40133f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f95379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40133f(C41217g gVar) {
            super(0);
            this.f95379d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f95379d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: yz0.d$g */
    public static final class C40134g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f95380d;

        /* renamed from: e */
        final /* synthetic */ C41217g f95381e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40134g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f95380d = aVar;
            this.f95381e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f95380d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f95381e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: yz0.d$h */
    public static final class C40135h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f95382d;

        /* renamed from: e */
        final /* synthetic */ C41217g f95383e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40135h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f95382d = fragment;
            this.f95383e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f95383e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f95382d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C40124d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C40132e(new C40131d(this)));
        this.f95367e = C1514j0.m5374c(this, C41520a0.m120436b(ManageCardsViewModel$ViewModel.class), new C40133f(a), new C40134g((C43064a) null, a), new C40135h(this, a));
    }

    /* renamed from: n1 */
    private final ManageAccountsAndCardsActivity m116253n1() {
        return (ManageAccountsAndCardsActivity) getActivity();
    }

    private final void observeData() {
        m116255q1().mo82660fw().mo82661sf().mo4819k(getViewLifecycleOwner(), new C40130c(new C40126b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C36635t m116254p1() {
        C36635t tVar = this.f95366d;
        C41536l.m120486f(tVar);
        return tVar;
    }

    /* renamed from: q1 */
    private final ManageCardsViewModel$ViewModel m116255q1() {
        return (ManageCardsViewModel$ViewModel) this.f95367e.getValue();
    }

    /* renamed from: r1 */
    private final void m116256r1() {
        List list;
        this.f95368f = new C32254m(getActivity(), this);
        m116254p1().f88429h.setLayoutManager(new LinearLayoutManager(getActivity()));
        C32254m mVar = this.f95368f;
        if (mVar != null) {
            ManageAccountsAndCardsActivity n1 = m116253n1();
            if (n1 != null) {
                list = n1.mo86247W2();
            } else {
                list = null;
            }
            mVar.mo72768m(list);
        }
        m116254p1().f88429h.setAdapter(this.f95368f);
        PaymentCardsEvent paymentCardsEvent = this.f95369g;
        if (paymentCardsEvent != null) {
            setUpPaymentCardsFromEvent(paymentCardsEvent);
        }
        m116257s1();
    }

    /* renamed from: s1 */
    private final void m116257s1() {
        List list;
        boolean z;
        C32254m mVar = this.f95368f;
        if (mVar != null) {
            list = mVar.mo72767j();
        } else {
            list = null;
        }
        if (list == null) {
            LinearLayout c = m116254p1().f88427f.mo3946b();
            C41536l.m120488h(c, "binding.fullProgressBarrr.root");
            C32343x.m95447f1(c);
            return;
        }
        DeleteSavedCardEvent deleteSavedCardEvent = this.f95371i;
        boolean z2 = true;
        if (deleteSavedCardEvent == null || deleteSavedCardEvent.getState() != 10) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LinearLayout c2 = m116254p1().f88427f.mo3946b();
            C41536l.m120488h(c2, "binding.fullProgressBarrr.root");
            C32343x.m95447f1(c2);
            return;
        }
        PaymentCardsEvent paymentCardsEvent = this.f95369g;
        if (paymentCardsEvent == null || paymentCardsEvent.getState() != 10) {
            z2 = false;
        }
        if (z2) {
            LinearLayout c3 = m116254p1().f88427f.mo3946b();
            C41536l.m120488h(c3, "binding.fullProgressBarrr.root");
            C32343x.m95447f1(c3);
            return;
        }
        LinearLayout c4 = m116254p1().f88427f.mo3946b();
        C41536l.m120488h(c4, "binding.fullProgressBarrr.root");
        C32343x.m95455i0(c4);
    }

    /* renamed from: t1 */
    private final void m116258t1() {
        BannerCard bannerCard = m116254p1().f88428g;
        bannerCard.setInfoText(C32343x.m95388F("rb.card.protection.desc", new Object[0]));
        bannerCard.setShowMoreText(C32343x.m95388F("rb.card.protection.title", new Object[0]));
        bannerCard.setButtonVisible(true);
        bannerCard.setBannerImage(new Image.Resource(C36270d.icons_48_general_insurance_fill, (Boolean) null, 2, (DefaultConstructorMarker) null));
        bannerCard.setTintColor(Integer.valueOf(C10318g.f28640b1));
        bannerCard.setOnClickListener(new C40121a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m116259u1(C40124d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        Context requireContext = dVar.requireContext();
        C36143a.C36145b bVar = C36143a.C36145b.f87335d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo88899c(F);
        C41536l.m120488h(requireContext, "setupViews$lambda$3$lambda$2$lambda$1");
        C38125h.m112238c(requireContext).mo91618n(requireContext);
    }

    /* renamed from: v1 */
    private final void m116260v1(long j) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(getString(C36274h.f87569g));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(getString(C36274h.f87574n));
        dVar.mo35646Z1(getString(C36274h.f87565e));
        dVar.mo35645Y1(new C40122b(this, j, dVar));
        dVar.mo35642U1(getString(C36274h.f87571h));
        dVar.mo35641T1(new C40123c(dVar));
        dVar.mo4576A1(getChildFragmentManager(), "Alert");
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m116261x1(C40124d dVar, long j, C13310d dVar2, Button button) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(dVar2, "$this_with");
        C41536l.m120489i(button, "it");
        LinearLayout c = dVar.m116254p1().f88427f.mo3946b();
        C41536l.m120488h(c, "binding.fullProgressBarrr.root");
        C32343x.m95447f1(c);
        dVar.mBankApiManager.deleteSavedCard(j);
        dVar2.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m116262y1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: i1 */
    public void mo86769i1() {
        m116256r1();
    }

    /* renamed from: o1 */
    public final void mo94060o1(long j) {
        m116260v1(j);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f95366d = C36635t.m108676d(layoutInflater, viewGroup, false);
        FrameLayout c = m116254p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    @C41452l
    public final void onDeleteSavedCardEvent(DeleteSavedCardEvent deleteSavedCardEvent) {
        C41536l.m120489i(deleteSavedCardEvent, "event");
        this.f95371i = deleteSavedCardEvent;
        int state = deleteSavedCardEvent.getState();
        if (state == 20) {
            C32254m mVar = this.f95368f;
            if (mVar != null) {
                mVar.notifyDataSetChanged();
            }
        } else if (state == 40) {
            C1505h requireActivity = requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            C12910e.m48790h(requireActivity, C32343x.m95388F(deleteSavedCardEvent.getErrorKey(), new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
        }
        m116257s1();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f95366d = null;
    }

    public void onStart() {
        super.onStart();
        C41438c cVar = this.mEventBus;
        C41536l.m120488h(cVar, "mEventBus");
        C32343x.m95423W0(cVar, this);
        this.mClient.requestPaymentCards((String) null, false);
    }

    public void onStop() {
        super.onStop();
        C41438c cVar = this.mEventBus;
        C41536l.m120488h(cVar, "mEventBus");
        C32343x.m95489t1(cVar, this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m116258t1();
        m116256r1();
        observeData();
    }

    /* renamed from: q */
    public void mo72772q(boolean z, int i) {
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        PaymentsCard paymentsCard;
        if (!z && (arrayList = this.f95370h) != null) {
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            if (i2 > i && (arrayList2 = this.f95370h) != null && (paymentsCard = (PaymentsCard) C41358y.m120010Z(arrayList2, i)) != null) {
                mo94060o1(paymentsCard.getCardId());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    @jg1.C41452l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUpPaymentCardsFromEvent(p341ge.bog.mobilebank.eventbus.events.PaymentCardsEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            r8.f95369g = r9
            int r9 = r9.getState()
            r0 = 20
            r1 = 0
            if (r9 == r0) goto L_0x0035
            r0 = 40
            if (r9 == r0) goto L_0x0015
            goto L_0x0046
        L_0x0015:
            androidx.fragment.app.h r2 = r8.requireActivity()
            java.lang.String r9 = "requireActivity()"
            kotlin.jvm.internal.C41536l.m120488h(r2, r9)
            ge.bog.mobilebank.eventbus.events.PaymentCardsEvent r9 = r8.f95369g
            if (r9 == 0) goto L_0x0026
            java.lang.String r1 = r9.getErrorKey()
        L_0x0026:
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r3 = g91.C32343x.m95388F(r1, r9)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            p420fh.C12910e.m48790h(r2, r3, r4, r5, r6, r7)
            goto L_0x0046
        L_0x0035:
            ge.bog.mobilebank.eventbus.events.PaymentCardsEvent r9 = r8.f95369g
            if (r9 == 0) goto L_0x003d
            java.util.ArrayList r1 = r9.getSavedCards()
        L_0x003d:
            r8.f95370h = r1
            g81.m r9 = r8.f95368f
            if (r9 == 0) goto L_0x0046
            r9.mo72769n(r1)
        L_0x0046:
            r8.m116257s1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz0.C40124d.setUpPaymentCardsFromEvent(ge.bog.mobilebank.eventbus.events.PaymentCardsEvent):void");
    }
}
