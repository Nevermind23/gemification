package wi0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import ba1.C10145d;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import java.util.Set;
import kj0.C25740a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardFlowMode;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsActivity;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;
import p341ge.bog.mobilebank.giftcards.presentation.home.GiftCardsViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import th0.C28406j;
import ue1.C43064a;
import ue1.C43075l;
import wi0.C29435f;

/* renamed from: wi0.e */
public final class C29424e extends C35651n1 implements C21507e, C29435f.C29438c {

    /* renamed from: d */
    private C28406j f74512d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29435f f74513e = new C29435f(this);

    /* renamed from: f */
    private final C41217g f74514f;

    /* renamed from: wi0.e$a */
    static final class C29425a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29424e f74515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29425a(C29424e eVar) {
            super(1);
            this.f74515d = eVar;
        }

        /* renamed from: a */
        public final void mo69266a(C31128a aVar) {
            if (this.f74515d.m89519q1().f72072j.mo6147i() && !(aVar instanceof C31128a.C31130b)) {
                this.f74515d.m89519q1().f72072j.setRefreshing(false);
            }
            if (aVar instanceof C31128a.C31130b) {
                this.f74515d.m89519q1().f72071i.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f74515d.m89519q1().f72071i.mo53596d();
                this.f74515d.handleError(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31131c) {
                this.f74515d.f74513e.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
                this.f74515d.m89519q1().f72071i.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69266a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wi0.e$b */
    static final class C29426b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29424e f74516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29426b(C29424e eVar) {
            super(1);
            this.f74516d = eVar;
        }

        /* renamed from: a */
        public final void mo69267a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74516d.m89525x1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69267a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wi0.e$c */
    /* synthetic */ class C29427c extends C41535k implements C43075l {
        C29427c(Object obj) {
            super(1, obj, C29424e.class, "openFilteredCards", "openFilteredCards(J)V", 0);
        }

        /* renamed from: b */
        public final void mo69268b(long j) {
            ((C29424e) this.receiver).m89526y1(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69268b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: wi0.e$d */
    /* synthetic */ class C29428d extends C41535k implements C43075l {
        C29428d(Object obj) {
            super(1, obj, C29424e.class, "openAnimationsPage", "openAnimationsPage(Lge/bog/mobilebank/giftcards/presentation/chooseanimation/model/GiftCardsMerchantAnimationsModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo69269b(GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel) {
            C41536l.m120489i(giftCardsMerchantAnimationsModel, "p0");
            ((C29424e) this.receiver).m89524v1(giftCardsMerchantAnimationsModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69269b((GiftCardsMerchantAnimationsModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wi0.e$e */
    static final class C29429e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74517a;

        C29429e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74517a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74517a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74517a.invoke(obj);
        }
    }

    /* renamed from: wi0.e$f */
    public static final class C29430f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29430f(Fragment fragment) {
            super(0);
            this.f74518d = fragment;
        }

        public final Fragment invoke() {
            return this.f74518d;
        }
    }

    /* renamed from: wi0.e$g */
    public static final class C29431g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29431g(C43064a aVar) {
            super(0);
            this.f74519d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f74519d.invoke();
        }
    }

    /* renamed from: wi0.e$h */
    public static final class C29432h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f74520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29432h(C41217g gVar) {
            super(0);
            this.f74520d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f74520d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wi0.e$i */
    public static final class C29433i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74521d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29433i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f74521d = aVar;
            this.f74522e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74521d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f74522e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wi0.e$j */
    public static final class C29434j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74523d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74524e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29434j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f74523d = fragment;
            this.f74524e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f74524e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f74523d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C29424e() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29431g(new C29430f(this)));
        this.f74514f = C1514j0.m5374c(this, C41520a0.m120436b(GiftCardsViewModel$ViewModel.class), new C29432h(a), new C29433i((C43064a) null, a), new C29434j(this, a));
    }

    private final void observeData() {
        GiftCardsViewModel$ViewModel r1 = m89520r1();
        r1.mo61941iw().mo4819k(getViewLifecycleOwner(), new C29429e(new C29425a(this)));
        LiveData jw = r1.mo61942jw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(jw, viewLifecycleOwner, new C29426b(this));
        LiveData kw = r1.mo61943kw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(kw, viewLifecycleOwner2, new C29427c(this));
        LiveData lw = r1.mo61944lw();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(lw, viewLifecycleOwner3, new C29428d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C28406j m89519q1() {
        C28406j jVar = this.f74512d;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* renamed from: r1 */
    private final GiftCardsViewModel$ViewModel m89520r1() {
        return (GiftCardsViewModel$ViewModel) this.f74514f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m89521s1(C29424e eVar, View view, int i, int i2, int i3, int i4) {
        C41536l.m120489i(eVar, "this$0");
        if (eVar.m89519q1().f72068f.getScrollState() != 0) {
            Context requireContext = eVar.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C41536l.m120488h(view, "v");
            C10145d.m37091e(requireContext, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m89522t1(C29424e eVar) {
        C41536l.m120489i(eVar, "this$0");
        C21481a.onRefresh$default(eVar.m89520r1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m89523u1(C29424e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m89520r1().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m89524v1(GiftCardsMerchantAnimationsModel giftCardsMerchantAnimationsModel) {
        GiftCardsActivity.C24064a aVar = GiftCardsActivity.f62414H;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo61584a(requireContext, new GiftCardsFlow.Animations(false, giftCardsMerchantAnimationsModel, (GiftCardFlowMode) null, 5, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m89525x1() {
        GiftCardsActivity.C24064a aVar = GiftCardsActivity.f62414H;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo61584a(requireContext, new GiftCardsFlow.Filter(true, (Set) null, 2, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m89526y1(long j) {
        GiftCardsActivity.C24064a aVar = GiftCardsActivity.f62414H;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo61584a(requireContext, new GiftCardsFlow.FilteredOffers(true, C41355w0.m119981d(Long.valueOf(j))));
    }

    /* renamed from: G */
    public void mo69262G() {
        m89520r1().mo61940G();
    }

    /* renamed from: b3 */
    public void mo41971b3() {
    }

    /* renamed from: d3 */
    public void mo41972d3() {
    }

    /* renamed from: f */
    public void mo69263f(String str) {
        C41536l.m120489i(str, "query");
        m89520r1().mo61946nw(str);
    }

    /* renamed from: f0 */
    public void mo69264f0(long j) {
        m89520r1().mo61947ow(j);
    }

    /* renamed from: k */
    public void mo69265k(C25740a aVar) {
        C41536l.m120489i(aVar, "model");
        m89520r1().mo61945mw(aVar);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f74512d = C28406j.m87146d(layoutInflater, viewGroup, false);
        StateView c = m89519q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f74512d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C28406j q1 = m89519q1();
        super.onViewCreated(view, bundle);
        q1.f72068f.setAdapter(this.f74513e);
        q1.f72068f.setOnScrollChangeListener(new C29421b(this));
        q1.f72072j.setOnRefreshListener(new C29422c(this));
        q1.f72069g.setOnClickListener(new C29423d(this));
        observeData();
    }
}
