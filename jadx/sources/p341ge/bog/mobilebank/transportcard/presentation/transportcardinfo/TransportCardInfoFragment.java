package p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31287g;
import g71.C32118k;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import o31.C37588a0;
import o31.C37621w;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.transportcard.presentation.TransportCardActivity;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35129a;
import p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo.C35135d;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import v71.C39246d;
import v71.C39248f;
import v71.C39249g;
import v71.C39250h;
import v71.C39251i;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment */
public final class TransportCardInfoFragment extends C35133b {

    /* renamed from: g */
    public C35135d.C35137b f84663g;

    /* renamed from: h */
    private C32118k f84664h;

    /* renamed from: i */
    private final C41217g f84665i;

    /* renamed from: j */
    private final C41217g f84666j = C41219i.m119470b(new C35116a(this));

    /* renamed from: k */
    private final C37621w f84667k = new C37621w(C32343x.m95394I(12), C32343x.m95394I(12), 1);

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$a */
    static final class C35116a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84668d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$a$a */
        static final class C35117a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ TransportCardInfoFragment f84669d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35117a(TransportCardInfoFragment transportCardInfoFragment) {
                super(1);
                this.f84669d = transportCardInfoFragment;
            }

            /* renamed from: a */
            public final void mo86005a(int i) {
                this.f84669d.m103192s1().mo86028nw().mo86034sd(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo86005a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35116a(TransportCardInfoFragment transportCardInfoFragment) {
            super(0);
            this.f84668d = transportCardInfoFragment;
        }

        /* renamed from: b */
        public final C39246d invoke() {
            return new C39246d(new C35117a(this.f84668d));
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$b */
    static final class C35118b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35118b(TransportCardInfoFragment transportCardInfoFragment) {
            super(1);
            this.f84670d = transportCardInfoFragment;
        }

        /* renamed from: a */
        public final void mo86006a(String str) {
            C41536l.m120489i(str, "it");
            C8034d.m30522a(this.f84670d).mo22118M(C31284d.action_transportCardInfoFragment_to_selectTransportCardPassTypeDialogFragment, C0908e.m3336b(C41233s.m119492a("OPENED_FROM_TRANSPORT_INFO_PAGE", Boolean.TRUE), C41233s.m119492a("PASS_TYPE_KEY", str)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86006a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$c */
    static final class C35119c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35119c(TransportCardInfoFragment transportCardInfoFragment) {
            super(1);
            this.f84671d = transportCardInfoFragment;
        }

        /* renamed from: a */
        public final void mo86007a(C35129a aVar) {
            if (aVar instanceof C35129a.C35131b) {
                if (((C35129a.C35131b) aVar).mo86013a() != 2) {
                    this.f84671d.m103191q1().mo3946b().mo53597e();
                }
            } else if (aVar instanceof C35129a.C35130a) {
                this.f84671d.m103191q1().f79028j.setRefreshing(false);
                this.f84671d.m103191q1().mo3946b().mo53596d();
            } else if (aVar instanceof C35129a.C35132c) {
                this.f84671d.m103191q1().f79028j.setRefreshing(false);
                C35129a.C35132c cVar = (C35129a.C35132c) aVar;
                this.f84671d.m103190p1().mo6029i(cVar.mo86017a());
                if (cVar.mo86017a().isEmpty()) {
                    TransportCardInfoFragment transportCardInfoFragment = this.f84671d;
                    transportCardInfoFragment.refreshHeaderText(transportCardInfoFragment.getString(C31287g.tc_travel_card));
                    this.f84671d.m103191q1().mo3946b().mo53598f();
                    return;
                }
                this.f84671d.m103191q1().mo3946b().mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86007a((C35129a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$d */
    static final class C35120d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35120d(TransportCardInfoFragment transportCardInfoFragment) {
            super(1);
            this.f84672d = transportCardInfoFragment;
        }

        /* renamed from: a */
        public final void mo86008a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f84672d).mo22117L(C31284d.action_transportCardInfoFragment_to_passMigrateActionSheet);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86008a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$e */
    static final class C35121e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84673d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35121e(TransportCardInfoFragment transportCardInfoFragment) {
            super(1);
            this.f84673d = transportCardInfoFragment;
        }

        /* renamed from: a */
        public final void mo86009a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            Context requireContext = this.f84673d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            C1505h requireActivity = this.f84673d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            c.mo91597c0(requireActivity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86009a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$f */
    static final class C35122f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84674a;

        C35122f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84674a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84674a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84674a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$g */
    public static final class C35123g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35123g(Fragment fragment) {
            super(0);
            this.f84675d = fragment;
        }

        public final Fragment invoke() {
            return this.f84675d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$h */
    public static final class C35124h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35124h(C43064a aVar) {
            super(0);
            this.f84676d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84676d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$i */
    public static final class C35125i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35125i(C41217g gVar) {
            super(0);
            this.f84677d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84677d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$j */
    public static final class C35126j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84678d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84679e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35126j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84678d = aVar;
            this.f84679e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84678d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84679e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$k */
    static final class C35127k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransportCardInfoFragment f84680d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.TransportCardInfoFragment$k$a */
        static final class C35128a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ TransportCardInfoFragment f84681d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35128a(TransportCardInfoFragment transportCardInfoFragment) {
                super(0);
                this.f84681d = transportCardInfoFragment;
            }

            /* renamed from: b */
            public final C35135d invoke() {
                C35135d.C35137b r1 = this.f84681d.mo86003r1();
                Bundle arguments = this.f84681d.getArguments();
                String str = "";
                String string = arguments != null ? arguments.getString("PASS_TYPE_KEY", str) : null;
                if (string != null) {
                    str = string;
                }
                return r1.mo32824a(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35127k(TransportCardInfoFragment transportCardInfoFragment) {
            super(0);
            this.f84680d = transportCardInfoFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C35128a(this.f84680d));
        }
    }

    public TransportCardInfoFragment() {
        C35127k kVar = new C35127k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35124h(new C35123g(this)));
        this.f84665i = C1514j0.m5374c(this, C41520a0.m120436b(C35135d.class), new C35125i(a), new C35126j((C43064a) null, a), kVar);
    }

    private final void observeData() {
        LiveData Om = m103192s1().mo86030pw().mo86022Om();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Om, viewLifecycleOwner, new C35118b(this));
        m103192s1().mo86030pw().mo86025b().mo4819k(getViewLifecycleOwner(), new C35122f(new C35119c(this)));
        LiveData Te = m103192s1().mo86030pw().mo86023Te();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Te, viewLifecycleOwner2, new C35120d(this));
        LiveData ib = m103192s1().mo86030pw().mo86026ib();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(ib, viewLifecycleOwner3, new C35121e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C39246d m103190p1() {
        return (C39246d) this.f84666j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C32118k m103191q1() {
        C32118k kVar = this.f84664h;
        C41536l.m120486f(kVar);
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C35135d m103192s1() {
        return (C35135d) this.f84665i.getValue();
    }

    /* renamed from: t1 */
    private final void m103193t1() {
        m103191q1().f79028j.setOnRefreshListener(new C39248f(this));
        m103191q1().f79030l.setOnClickListener(new C39249g(this));
        m103191q1().f79042x.setOnClickListener(new C39250h(this));
        m103191q1().f79029k.setOnClickListener(new C39251i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m103194u1(TransportCardInfoFragment transportCardInfoFragment) {
        C41536l.m120489i(transportCardInfoFragment, "this$0");
        C21481a.onRefresh$default(transportCardInfoFragment.m103192s1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m103195v1(TransportCardInfoFragment transportCardInfoFragment, View view) {
        C41536l.m120489i(transportCardInfoFragment, "this$0");
        C36546y.m108282F().mo27152s("travel_card", "payments_category/more_menu", "intro_page_next_button_click");
        transportCardInfoFragment.m103192s1().mo86028nw().mo86024ac();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m103196x1(TransportCardInfoFragment transportCardInfoFragment, View view) {
        C41536l.m120489i(transportCardInfoFragment, "this$0");
        transportCardInfoFragment.m103192s1().onRefresh(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m103197y1(TransportCardInfoFragment transportCardInfoFragment, View view) {
        C41536l.m120489i(transportCardInfoFragment, "this$0");
        C36546y.m108282F().mo27152s("travel_card", "payments_category/more_menu/my_payments", "buy_new_card_button_click");
        transportCardInfoFragment.m103192s1().mo86028nw().mo86024ac();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f84664h = C32118k.m94606d(layoutInflater, viewGroup, false);
        StateView c = m103191q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84664h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C1505h requireActivity = requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.transportcard.presentation.TransportCardActivity");
        ToolbarView toolbarView = ((TransportCardActivity) requireActivity).f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationEnabled(true);
        }
        RecyclerView recyclerView = m103191q1().f79023e;
        recyclerView.setAdapter(m103190p1());
        recyclerView.mo5351j(this.f84667k);
        PageDescriptionView pageDescriptionView = m103191q1().f79035q;
        pageDescriptionView.setTitle(C32343x.m95388F("tcc.permit.info.page.second.title", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("tcc.permit.info.page.text", new Object[0]));
        m103191q1().f79036r.setTitleText(getString(C31287g.tc_info_terms));
        m103193t1();
        observeData();
    }

    /* renamed from: r1 */
    public final C35135d.C35137b mo86003r1() {
        C35135d.C35137b bVar = this.f84663g;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
