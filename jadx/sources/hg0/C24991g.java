package hg0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.charts.LineChart;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25187g;
import if0.C25192a;
import java.math.BigDecimal;
import java.util.List;
import kg0.C25729e;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of0.C26967l;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.balancewidget.BalanceWidgetView;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.GTMyInvestmentsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.shared.GTPortfolioViewModel$ViewModel;
import p601sg.C17780e;
import ue0.C28739m0;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28775a;
import ug0.C28794g;
import xe0.C29751i;

/* renamed from: hg0.g */
public final class C24991g extends C25005i implements C28775a {

    /* renamed from: j */
    public static final C24992a f64316j = new C24992a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28739m0 f64317g;

    /* renamed from: h */
    private final C41217g f64318h = C1514j0.m5374c(this, C41520a0.m120436b(GTPortfolioViewModel$ViewModel.class), new C25001g(this), new C25002h((C43064a) null, this), new C25003i(this));

    /* renamed from: i */
    private final C28775a.C28776a f64319i = new C28775a.C28776a((List) null, (List) null, (List) null, false, (Context) null, (LineChart) null, (String) null, C11051p3.f31760d, (DefaultConstructorMarker) null);

    /* renamed from: hg0.g$a */
    public static final class C24992a {
        private C24992a() {
        }

        public /* synthetic */ C24992a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24991g mo63402a() {
            return new C24991g();
        }
    }

    /* renamed from: hg0.g$b */
    static final class C24993b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24991g f64320d;

        /* renamed from: hg0.g$b$a */
        static final class C24994a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24991g f64321d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24994a(C24991g gVar) {
                super(1);
                this.f64321d = gVar;
            }

            /* renamed from: a */
            public final void mo63404a(boolean z) {
                InlineFeedback inlineFeedback = this.f64321d.m79900r1().f73382j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95483r1(inlineFeedback, !z, false, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo63404a(((Boolean) obj).booleanValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: hg0.g$b$b */
        static final class C24995b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24991g f64322d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24995b(C24991g gVar) {
                super(1);
                this.f64322d = gVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                InlineFeedback inlineFeedback = this.f64322d.m79900r1().f73382j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95455i0(inlineFeedback);
            }
        }

        /* renamed from: hg0.g$b$c */
        static final class C24996c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24991g f64323d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24996c(C24991g gVar) {
                super(1);
                this.f64323d = gVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                InlineFeedback inlineFeedback = this.f64323d.m79900r1().f73382j;
                C41536l.m120488h(inlineFeedback, "binding.infoClosedMarket");
                C32343x.m95455i0(inlineFeedback);
                this.f64323d.handleError(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24993b(C24991g gVar) {
            super(1);
            this.f64320d = gVar;
        }

        /* renamed from: a */
        public final void mo63403a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C24994a(this.f64320d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C24995b(this.f64320d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24996c(this.f64320d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63403a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hg0.g$c */
    static final class C24997c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24991g f64324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24997c(C24991g gVar) {
            super(1);
            this.f64324d = gVar;
        }

        /* renamed from: a */
        public final void mo63407a(C31128a aVar) {
            C24991g gVar = this.f64324d;
            C41536l.m120488h(aVar, "res");
            gVar.m79904x1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63407a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hg0.g$d */
    static final class C24998d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24991g f64325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24998d(C24991g gVar) {
            super(1);
            this.f64325d = gVar;
        }

        /* renamed from: a */
        public final void mo63408a(C31128a aVar) {
            C24991g gVar = this.f64325d;
            C41536l.m120488h(aVar, "list");
            gVar.m79906z1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63408a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hg0.g$e */
    static final class C24999e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f64326a;

        C24999e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f64326a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f64326a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f64326a.invoke(obj);
        }
    }

    /* renamed from: hg0.g$f */
    static final class C25000f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24991g f64327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25000f(C24991g gVar) {
            super(0);
            this.f64327d = gVar;
        }

        public final void invoke() {
            GTMoneyExchangeActivity.C23418a aVar = GTMoneyExchangeActivity.f61255L;
            C25192a aVar2 = C25192a.DEPOSIT_MONEY;
            Context requireContext = this.f64327d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo60240a(aVar2, requireContext);
        }
    }

    /* renamed from: hg0.g$g */
    public static final class C25001g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f64328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25001g(Fragment fragment) {
            super(0);
            this.f64328d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f64328d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: hg0.g$h */
    public static final class C25002h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64329d;

        /* renamed from: e */
        final /* synthetic */ Fragment f64330e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25002h(C43064a aVar, Fragment fragment) {
            super(0);
            this.f64329d = aVar;
            this.f64330e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f64329d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f64330e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: hg0.g$i */
    public static final class C25003i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f64331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25003i(Fragment fragment) {
            super(0);
            this.f64331d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f64331d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: B1 */
    private final void m79884B1() {
        C28739m0 r1 = m79900r1();
        r1.f73382j.setTitleText(C32343x.m95388F("text.gt.working.hours.banner", new Object[0]));
        r1.f73381i.f73125k.setOnChipActivatedChangedListener(new C24986b(this));
        ListItem listItem = r1.f73377e;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        SingleLineTextItem singleLineTextItem = new SingleLineTextItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        singleLineTextItem.setText(C32343x.m95388F("text.gt.buying.power", new Object[0]));
        listItem.setMiddleItemView(singleLineTextItem);
        r1.f73377e.setOnClickListener(new C24987c(this));
        r1.f73380h.setOnClickListener(new C24988d(this));
        r1.f73380h.setOnButtonClicked(new C25000f(this));
        ButtonListView buttonListView = r1.f73380h;
        C41536l.m120488h(buttonListView, "buyingPowerZero");
        ButtonListView.m49639n(buttonListView, Integer.valueOf(C17780e.icons_24_gt_buying_power), (Drawable) null, (String) null, 6, (Object) null);
        r1.f73380h.setTopText(C32343x.m95388F("text.gt.buying.power", new Object[0]));
        LineChart lineChart = m79900r1().f73381i.f73120f;
        C41536l.m120488h(lineChart, "binding.chartContainer.chartView");
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        mo63401v1(true, lineChart, requireContext2);
        m79900r1().f73387o.setOnRefreshListener(new C24989e(this));
        r1.f73385m.setOnClickListener(new C24990f(this));
        BalanceWidgetView balanceWidgetView = m79900r1().f73385m;
        balanceWidgetView.setTitle(C32343x.m95388F("text.gt.my.assets", new Object[0]));
        BigDecimal valueOf = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
        balanceWidgetView.setText(new Amount(valueOf, "USD").toString());
        FrameLayout frameLayout = m79900r1().f73381i.f73121g;
        C41536l.m120488h(frameLayout, "binding.chartContainer.loaderView");
        C32343x.m95447f1(frameLayout);
        m79900r1().f73379g.mo53597e();
        m79900r1().f73386n.mo53597e();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m79885C1(C24991g gVar, Chip chip, int i) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(chip, "chip");
        Object tag = chip.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
        gVar.m79901s1((String) tag, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m79886D1(C24991g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m79890H1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m79887E1(C24991g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m79890H1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m79888F1(C24991g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m79903u1().onRefresh(2);
        gVar.m79901s1(gVar.mo60603H0().mo68507f(), 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m79889G1(C24991g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        GTMyInvestmentsActivity.C23680a aVar = GTMyInvestmentsActivity.f61719J;
        Context requireContext = gVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo60566a(requireContext);
    }

    /* renamed from: H1 */
    private final void m79890H1() {
        C26967l.f67747I.mo66243a().mo4576A1(requireActivity().getSupportFragmentManager(), "BALANCE_SHEET");
    }

    private final void observeData() {
        m79903u1().mo60692ow().mo60695u().mo4819k(getViewLifecycleOwner(), new C24999e(new C24993b(this)));
        m79903u1().mo60692ow().getPortfolioOverview().mo4819k(getViewLifecycleOwner(), new C24999e(new C24997c(this)));
        m79903u1().mo60692ow().mo60688Ld().mo4819k(getViewLifecycleOwner(), new C24999e(new C24998d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C28739m0 m79900r1() {
        C28739m0 m0Var = this.f64317g;
        C41536l.m120486f(m0Var);
        return m0Var;
    }

    /* renamed from: s1 */
    private final void m79901s1(String str, int i) {
        mo60603H0().mo68512k(str);
        C25729e mw = m79903u1().mo60690mw();
        if (str == null) {
            str = "";
        }
        mw.mo60687H6(str, i);
    }

    /* renamed from: t1 */
    private final BalanceWidgetView.C13160a m79902t1(BigDecimal bigDecimal) {
        BigDecimal valueOf = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf, "valueOf(this.toLong())");
        if (bigDecimal.compareTo(valueOf) > 0) {
            return BalanceWidgetView.C13160a.POSITIVE;
        }
        BigDecimal valueOf2 = BigDecimal.valueOf(0);
        C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
        if (bigDecimal.compareTo(valueOf2) < 0) {
            return BalanceWidgetView.C13160a.NEGATIVE;
        }
        return BalanceWidgetView.C13160a.NEUTRAL;
    }

    /* renamed from: u1 */
    private final GTPortfolioViewModel$ViewModel m79903u1() {
        return (GTPortfolioViewModel$ViewModel) this.f64318h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m79904x1(C31128a aVar) {
        TextView textView;
        if (aVar instanceof C31128a.C31130b) {
            if (aVar.mo71341b() == 2) {
                m79900r1().f73387o.setRefreshing(true);
                return;
            }
            m79900r1().f73379g.mo53597e();
            m79900r1().f73386n.mo53597e();
        } else if (aVar instanceof C31128a.C31131c) {
            C29751i iVar = (C29751i) ((C31128a.C31131c) aVar).mo71340a();
            BalanceWidgetView balanceWidgetView = m79900r1().f73385m;
            balanceWidgetView.setText(new Amount(iVar.mo69805e(), "USD").toString());
            balanceWidgetView.setLeftText(C28794g.m88258a(iVar.mo69802b(), iVar.mo69803c()));
            balanceWidgetView.setLeftBlockColor(m79902t1(iVar.mo69802b()));
            balanceWidgetView.setRightText(C28794g.m88258a(iVar.mo69808g(), iVar.mo69809h()));
            balanceWidgetView.setRightBlockColor(m79902t1(iVar.mo69808g()));
            if (C41536l.m120484d(iVar.mo69801a(), new BigDecimal(0))) {
                ButtonListView buttonListView = m79900r1().f73380h;
                C41536l.m120488h(buttonListView, "binding.buyingPowerZero");
                C32343x.m95447f1(buttonListView);
                ListItem listItem = m79900r1().f73377e;
                C41536l.m120488h(listItem, "binding.buyingPower");
                C32343x.m95455i0(listItem);
            } else {
                View rightItemView = m79900r1().f73377e.getRightItemView();
                if (rightItemView != null) {
                    textView = (TextView) rightItemView.findViewById(C25187g.f64708l4);
                } else {
                    textView = null;
                }
                C41536l.m120487g(textView, "null cannot be cast to non-null type android.widget.TextView");
                textView.setText(C32343x.m95408P(iVar.mo69801a(), "$"));
                ButtonListView buttonListView2 = m79900r1().f73380h;
                C41536l.m120488h(buttonListView2, "binding.buyingPowerZero");
                C32343x.m95455i0(buttonListView2);
                ListItem listItem2 = m79900r1().f73377e;
                C41536l.m120488h(listItem2, "binding.buyingPower");
                C32343x.m95447f1(listItem2);
            }
            m79900r1().f73379g.mo53595c();
            m79900r1().f73386n.mo53595c();
            m79900r1().f73387o.setRefreshing(false);
        } else if (aVar instanceof C31128a.C31129a) {
            handleError(((C31128a.C31129a) aVar).mo71342c());
            m79900r1().f73379g.mo53595c();
            m79900r1().f73386n.mo53596d();
            m79900r1().f73387o.setRefreshing(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m79905y1(C24991g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m79900r1().f73381i.f73125k.mo35182m(2, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m79906z1(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            FrameLayout frameLayout = m79900r1().f73381i.f73121g;
            C41536l.m120488h(frameLayout, "binding.chartContainer.loaderView");
            C32343x.m95447f1(frameLayout);
        } else if (aVar instanceof C31128a.C31131c) {
            FrameLayout frameLayout2 = m79900r1().f73381i.f73121g;
            C41536l.m120488h(frameLayout2, "binding.chartContainer.loaderView");
            C32343x.m95455i0(frameLayout2);
            C31128a.C31131c cVar = (C31128a.C31131c) aVar;
            if (((List) cVar.mo71340a()).isEmpty()) {
                LinearLayout linearLayout = m79900r1().f73381i.f73119e;
                C41536l.m120488h(linearLayout, "binding.chartContainer.chartContainer");
                C32343x.m95455i0(linearLayout);
                return;
            }
            LinearLayout linearLayout2 = m79900r1().f73381i.f73119e;
            C41536l.m120488h(linearLayout2, "binding.chartContainer.chartContainer");
            C32343x.m95447f1(linearLayout2);
            mo63400A1((List) cVar.mo71340a());
        } else if (aVar instanceof C31128a.C31129a) {
            handleError(((C31128a.C31129a) aVar).mo71342c());
            FrameLayout frameLayout3 = m79900r1().f73381i.f73121g;
            C41536l.m120488h(frameLayout3, "binding.chartContainer.loaderView");
            C32343x.m95455i0(frameLayout3);
        }
    }

    /* renamed from: A1 */
    public void mo63400A1(List list) {
        C28775a.C28778c.m88239d(this, list);
    }

    /* renamed from: H0 */
    public C28775a.C28776a mo60603H0() {
        return this.f64319i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f64317g = C28739m0.m88082d(layoutInflater, viewGroup, false);
        SwipeRefreshLayout c = m79900r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f64317g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m79884B1();
        observeData();
        m79900r1().f73381i.f73125k.postDelayed(new C24985a(this), 100);
    }

    /* renamed from: v1 */
    public void mo63401v1(boolean z, LineChart lineChart, Context context) {
        C28775a.C28778c.m88238c(this, z, lineChart, context);
    }
}
