package of0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ie0.C25190j;
import if0.C25192a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineSmallTextItem;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTBalanceViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import ue0.C28726g;
import ue1.C43064a;
import ue1.C43075l;
import xe0.C29746d;

/* renamed from: of0.l */
public final class C26967l extends C26961g0 {

    /* renamed from: I */
    public static final C26968a f67747I = new C26968a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28726g f67748G;

    /* renamed from: H */
    private final C41217g f67749H;

    /* renamed from: of0.l$a */
    public static final class C26968a {
        private C26968a() {
        }

        public /* synthetic */ C26968a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26967l mo66243a() {
            return new C26967l();
        }
    }

    /* renamed from: of0.l$b */
    static final class C26969b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26967l f67750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26969b(C26967l lVar) {
            super(1);
            this.f67750d = lVar;
        }

        /* renamed from: a */
        public final void mo66244a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                C1505h requireActivity = this.f67750d.requireActivity();
                C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
                ((C35388f2) requireActivity).mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f67750d.mo4577k1();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f67750d.m83797i2().mo3946b().mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                this.f67750d.m83797i2().f73241h.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69771c(), "USD"));
                this.f67750d.m83797i2().f73246m.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69770b(), "USD"));
                this.f67750d.m83797i2().f73255v.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69772d(), "USD"));
                this.f67750d.m83797i2().f73249p.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69769a(), "USD"));
                this.f67750d.m83797i2().mo3946b().mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66244a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: of0.l$c */
    static final class C26970c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26967l f67751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26970c(C26967l lVar) {
            super(1);
            this.f67751d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            SingleLineSmallTextItem singleLineSmallTextItem = this.f67751d.m83797i2().f73255v;
            C41536l.m120488h(singleLineSmallTextItem, "binding.pendingWithdrawal");
            C41536l.m120488h(bool, "isEnabled");
            C32343x.m95483r1(singleLineSmallTextItem, bool.booleanValue(), false, 2, (Object) null);
            this.f67751d.m83796h2();
        }
    }

    /* renamed from: of0.l$d */
    static final class C26971d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26967l f67752d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26971d(C26967l lVar) {
            super(1);
            this.f67752d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            ListItem listItem = this.f67752d.m83797i2().f73247n;
            C41536l.m120488h(listItem, "binding.commissionFee");
            C41536l.m120488h(bool, "isEnabled");
            C32343x.m95483r1(listItem, bool.booleanValue(), false, 2, (Object) null);
            this.f67752d.m83796h2();
        }
    }

    /* renamed from: of0.l$e */
    static final class C26972e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26967l f67753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26972e(C26967l lVar) {
            super(1);
            this.f67753d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f67753d.m83797i2().f73243j;
            C41536l.m120488h(bool, "enabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: of0.l$f */
    static final class C26973f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f67754a;

        C26973f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f67754a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f67754a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f67754a.invoke(obj);
        }
    }

    /* renamed from: of0.l$g */
    public static final class C26974g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f67755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26974g(Fragment fragment) {
            super(0);
            this.f67755d = fragment;
        }

        public final Fragment invoke() {
            return this.f67755d;
        }
    }

    /* renamed from: of0.l$h */
    public static final class C26975h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f67756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26975h(C43064a aVar) {
            super(0);
            this.f67756d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f67756d.invoke();
        }
    }

    /* renamed from: of0.l$i */
    public static final class C26976i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f67757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26976i(C41217g gVar) {
            super(0);
            this.f67757d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f67757d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: of0.l$j */
    public static final class C26977j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f67758d;

        /* renamed from: e */
        final /* synthetic */ C41217g f67759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26977j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f67758d = aVar;
            this.f67759e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f67758d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f67759e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: of0.l$k */
    public static final class C26978k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f67760d;

        /* renamed from: e */
        final /* synthetic */ C41217g f67761e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26978k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f67760d = fragment;
            this.f67761e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f67761e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f67760d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C26967l() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C26975h(new C26974g(this)));
        this.f67749H = C1514j0.m5374c(this, C41520a0.m120436b(GTBalanceViewModel$ViewModel.class), new C26976i(a), new C26977j((C43064a) null, a), new C26978k(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m83796h2() {
        boolean z;
        boolean z2;
        View view = m83797i2().f73239f;
        C41536l.m120488h(view, "binding.availableDivider");
        ListItem listItem = m83797i2().f73247n;
        C41536l.m120488h(listItem, "binding.commissionFee");
        boolean z3 = true;
        if (listItem.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            SingleLineSmallTextItem singleLineSmallTextItem = m83797i2().f73255v;
            C41536l.m120488h(singleLineSmallTextItem, "binding.pendingWithdrawal");
            if (singleLineSmallTextItem.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        C32343x.m95483r1(view, z3, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final C28726g m83797i2() {
        C28726g gVar = this.f67748G;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: j2 */
    private final GTBalanceViewModel$ViewModel m83798j2() {
        return (GTBalanceViewModel$ViewModel) this.f67749H.getValue();
    }

    /* renamed from: k2 */
    private final void m83799k2() {
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.gt_title_my_balance));
        m83797i2().f73240g.setText(getString(C25190j.gt_balance_sheet_title_available));
        m83797i2().f73245l.setText(C32343x.m95388F("text.gt.buying.power", new Object[0]));
        m83797i2().f73245l.setTitle(C32343x.m95388F("gt.balance.investment.amt.description", new Object[0]));
        m83797i2().f73240g.setTitle(C32343x.m95388F("gt.balance.available.amt.description", new Object[0]));
        m83797i2().f73255v.setTitle(getString(C25190j.gt_balance_sheet_title_pending_withdrawal));
        m83797i2().f73248o.setText(getString(C25190j.gt_balance_sheet_title_commission_fee));
        m83797i2().f73242i.setOnClickListener(new C26965j(this));
        m83797i2().f73243j.setOnClickListener(new C26966k(this));
        m83797i2().mo3946b().mo53597e();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m83800l2(C26967l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        GTMoneyExchangeActivity.f61255L.mo60241b(C25192a.DEPOSIT_MONEY, lVar);
        lVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m83801m2(C26967l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        GTMoneyExchangeActivity.f61255L.mo60241b(C25192a.GET_MONEY, lVar);
        lVar.mo4577k1();
    }

    private final void observeData() {
        m83798j2().mo60292mw().mo60285Ut().mo4819k(getViewLifecycleOwner(), new C26973f(new C26969b(this)));
        m83798j2().mo60292mw().mo60287h7().mo4819k(getViewLifecycleOwner(), new C26973f(new C26970c(this)));
        m83798j2().mo60292mw().mo60284Ic().mo4819k(getViewLifecycleOwner(), new C26973f(new C26971d(this)));
        m83798j2().mo60292mw().mo60286fr().mo4819k(getViewLifecycleOwner(), new C26973f(new C26972e(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f67748G = C28726g.m88025d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m83799k2();
        observeData();
    }
}
