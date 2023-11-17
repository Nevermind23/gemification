package l40;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import g91.C32335t0;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.compoundview.BarChartView;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.cashflow.viewmodel.CashFlowViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import r40.C27917c;
import t40.C28304a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: l40.c */
public final class C25806c extends C35651n1 implements C21507e {

    /* renamed from: k */
    public static final C25807a f65636k = new C25807a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f65637d = C41219i.m119470b(new C25808b(this));

    /* renamed from: e */
    private final C41217g f65638e = C41219i.m119470b(new C25809c(this));

    /* renamed from: f */
    private final C41217g f65639f = C41219i.m119470b(new C25815i(this));

    /* renamed from: g */
    private final C41217g f65640g = C41219i.m119470b(new C25811e(this));

    /* renamed from: h */
    private final C41217g f65641h = C41219i.m119470b(new C25810d(this));

    /* renamed from: i */
    private boolean f65642i;

    /* renamed from: j */
    private final C41217g f65643j;

    /* renamed from: l40.c$a */
    public static final class C25807a {
        private C25807a() {
        }

        public /* synthetic */ C25807a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25806c mo64447a() {
            return new C25806c();
        }
    }

    /* renamed from: l40.c$b */
    static final class C25808b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25806c f65644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25808b(C25806c cVar) {
            super(0);
            this.f65644d = cVar;
        }

        /* renamed from: b */
        public final BarChartView invoke() {
            return (BarChartView) this.f65644d.findView(C10322k.bcvChartView);
        }
    }

    /* renamed from: l40.c$c */
    static final class C25809c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25806c f65645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25809c(C25806c cVar) {
            super(0);
            this.f65645d = cVar;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f65645d.findView(C10322k.layoutPfmDataError);
        }
    }

    /* renamed from: l40.c$d */
    static final class C25810d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25806c f65646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25810d(C25806c cVar) {
            super(0);
            this.f65646d = cVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f65646d.findView(C10322k.faqTxt);
        }
    }

    /* renamed from: l40.c$e */
    static final class C25811e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25806c f65647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25811e(C25806c cVar) {
            super(0);
            this.f65647d = cVar;
        }

        /* renamed from: b */
        public final BogImageView invoke() {
            return (BogImageView) this.f65647d.findView(C10322k.faqImg);
        }
    }

    /* renamed from: l40.c$f */
    /* synthetic */ class C25812f extends C41535k implements C43075l {
        C25812f(Object obj) {
            super(1, obj, C25806c.class, "onCashFlowResponse", "onCashFlowResponse(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo64452b(List list) {
            C41536l.m120489i(list, "p0");
            ((C25806c) this.receiver).m81122q1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64452b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: l40.c$g */
    /* synthetic */ class C25813g extends C41535k implements C43075l {
        C25813g(Object obj) {
            super(1, obj, C25806c.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo64453b(boolean z) {
            ((C25806c) this.receiver).m81123t1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64453b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: l40.c$h */
    /* synthetic */ class C25814h extends C41535k implements C43075l {
        C25814h(Object obj) {
            super(1, obj, C25806c.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo64454b(C21503d.C21504a aVar) {
            ((C25806c) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64454b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: l40.c$i */
    static final class C25815i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25806c f65648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25815i(C25806c cVar) {
            super(0);
            this.f65648d = cVar;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f65648d.findView(C10322k.f28784Qe);
        }
    }

    /* renamed from: l40.c$j */
    public static final class C25816j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25816j(Fragment fragment) {
            super(0);
            this.f65649d = fragment;
        }

        public final Fragment invoke() {
            return this.f65649d;
        }
    }

    /* renamed from: l40.c$k */
    public static final class C25817k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25817k(C43064a aVar) {
            super(0);
            this.f65650d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f65650d.invoke();
        }
    }

    /* renamed from: l40.c$l */
    public static final class C25818l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f65651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25818l(C41217g gVar) {
            super(0);
            this.f65651d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f65651d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: l40.c$m */
    public static final class C25819m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f65652d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65653e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25819m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f65652d = aVar;
            this.f65653e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f65652d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f65653e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: l40.c$n */
    public static final class C25820n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f65654d;

        /* renamed from: e */
        final /* synthetic */ C41217g f65655e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25820n(Fragment fragment, C41217g gVar) {
            super(0);
            this.f65654d = fragment;
            this.f65655e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f65655e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f65654d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C25806c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C25817k(new C25816j(this)));
        this.f65643j = C1514j0.m5374c(this, C41520a0.m120436b(CashFlowViewModel.class), new C25818l(a), new C25819m((C43064a) null, a), new C25820n(this, a));
    }

    /* renamed from: l1 */
    private final BarChartView m81117l1() {
        Object value = this.f65637d.getValue();
        C41536l.m120488h(value, "<get-barChartView>(...)");
        return (BarChartView) value;
    }

    /* renamed from: m1 */
    private final CashFlowViewModel m81118m1() {
        return (CashFlowViewModel) this.f65643j.getValue();
    }

    /* renamed from: n1 */
    private final LinearLayout m81119n1() {
        Object value = this.f65638e.getValue();
        C41536l.m120488h(value, "<get-errorView>(...)");
        return (LinearLayout) value;
    }

    /* renamed from: o1 */
    private final BogTextView m81120o1() {
        Object value = this.f65641h.getValue();
        C41536l.m120488h(value, "<get-faqButtonText>(...)");
        return (BogTextView) value;
    }

    /* renamed from: p1 */
    private final BogImageView m81121p1() {
        Object value = this.f65640g.getValue();
        C41536l.m120488h(value, "<get-faqIv>(...)");
        return (BogImageView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final void m81122q1(List list) {
        m81118m1().mo54963Bw();
        m81117l1().mo54955e();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m81123t1(boolean z) {
        m81117l1().setLoading(z);
        m81119n1().setVisibility(8);
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        m81117l1().setViewModel(m81118m1());
        C21484c.m69411c(m81118m1().mo54964mw(), this, new C25812f(this), new C25813g(this), new C25814h(this));
        m81118m1().mo54971zw();
        m81117l1().mo54956h();
    }

    /* renamed from: d3 */
    public void mo41972d3() {
    }

    public void handleError(C21503d.C21504a aVar) {
        super.handleError(aVar);
        m81119n1().setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_cash_flow;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m81120o1().setTextColor(C32335t0.m95358c(getContext()));
        if (C32335t0.m95361f() == 1) {
            m81121p1().setColorFilter(C0767a.m2893c(requireContext(), C10318g.color_accent_solo));
        } else if (C32335t0.m95361f() == 1) {
            m81121p1().setColorFilter(C0767a.m2893c(requireContext(), C10318g.color_accent_wealth));
        }
        findView(C10322k.faqBtn).setOnClickListener(new C25804a(this));
        findView(C10322k.btnReloadPfm).setOnClickListener(new C25805b(this));
    }

    /* renamed from: r1 */
    public final void mo64445r1(View view) {
        C41536l.m120489i(view, "v");
        C28304a aVar = C28304a.f71822a;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        aVar.mo67958a(requireActivity, C27917c.CASH_FLOW);
    }

    /* renamed from: s1 */
    public final void mo64446s1(View view) {
        C41536l.m120489i(view, "v");
        CashFlowViewModel.m71765ow(m81118m1(), true, 0, 2, (Object) null);
        this.f65642i = true;
    }
}
