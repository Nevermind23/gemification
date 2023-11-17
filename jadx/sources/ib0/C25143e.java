package ib0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import g91.C32286a1;
import g91.C32314k;
import g91.C32343x;
import ha0.C24925b;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb0.C25891i;
import lb0.C25895m;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.carousel.daycarousel.DayCarouselView;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.C22978a;
import p561pi.C17367b;
import p615tg.C17959a;
import ta0.C28345h;
import ue1.C43064a;
import ue1.C43075l;
import y11.C39992d;
import ze1.C43420e;

/* renamed from: ib0.e */
public final class C25143e extends C22978a implements C39992d.C39993a {

    /* renamed from: O */
    public static final C25144a f64597O = new C25144a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C24925b f64598K;

    /* renamed from: L */
    private final C41217g f64599L = C41219i.m119470b(new C25145b(this));

    /* renamed from: M */
    public C25895m.C25897b f64600M;

    /* renamed from: N */
    private final C41217g f64601N;

    /* renamed from: ib0.e$a */
    public static final class C25144a {
        private C25144a() {
        }

        public /* synthetic */ C25144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25143e mo63693a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "args");
            C25143e eVar = new C25143e();
            eVar.setArguments(C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.ARGS_KEY", accumulateOnSpecificDateModel)));
            return eVar;
        }
    }

    /* renamed from: ib0.e$b */
    static final class C25145b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25143e f64602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25145b(C25143e eVar) {
            super(0);
            this.f64602d = eVar;
        }

        /* renamed from: b */
        public final AccumulateOnSpecificDateModel invoke() {
            AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = (AccumulateOnSpecificDateModel) this.f64602d.requireArguments().getParcelable("ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.ARGS_KEY");
            if (accumulateOnSpecificDateModel != null) {
                return accumulateOnSpecificDateModel;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: ib0.e$c */
    /* synthetic */ class C25146c extends C41535k implements C43075l {
        C25146c(Object obj) {
            super(1, obj, C25143e.class, "handleCardPickerClick", "handleCardPickerClick(Lge/bog/mobilebank/depositapplication/presentation/depositsubmission/viewmodel/AccumulateOnSpecificDateViewModel$ViewModel$CardSelectorModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo63695b(C25895m.C25896a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C25143e) this.receiver).m80207r2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63695b((C25895m.C25896a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib0.e$d */
    /* synthetic */ class C25147d extends C41535k implements C43075l {
        C25147d(Object obj) {
            super(1, obj, C25143e.class, "handleViews", "handleViews(Lge/bog/mobilebank/depositapplication/presentation/depositsubmission/fragment/onspecificdate/AccumulateOnSpecificDateModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo63696b(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "p0");
            ((C25143e) this.receiver).m80208s2(accumulateOnSpecificDateModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63696b((AccumulateOnSpecificDateModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib0.e$e */
    /* synthetic */ class C25148e extends C41535k implements C43075l {
        C25148e(Object obj) {
            super(1, obj, C25143e.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo63697b(boolean z) {
            ((C25143e) this.receiver).m80209t2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63697b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib0.e$f */
    static final class C25149f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25143e f64603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25149f(C25143e eVar) {
            super(1);
            this.f64603d = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C24925b j2 = this.f64603d.f64598K;
            if (j2 == null) {
                C41536l.m120506z("binding");
                j2 = null;
            }
            Button mainButton = j2.f64094e.getMainButton();
            C41536l.m120488h(bool, "it");
            mainButton.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ib0.e$g */
    static final class C25150g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25143e f64604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25150g(C25143e eVar) {
            super(1);
            this.f64604d = eVar;
        }

        /* renamed from: a */
        public final void mo63699a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "it");
            C1533o.m5445b(this.f64604d, "AccumulateONSpecificDateActionSheet.REQUEST", C0908e.m3336b(C41233s.m119492a("AccumulateOnSpecificDateActionSheet.STO_DATA", accumulateOnSpecificDateModel)));
            this.f64604d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63699a((AccumulateOnSpecificDateModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ib0.e$h */
    static final class C25151h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f64605a;

        C25151h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f64605a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f64605a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f64605a.invoke(obj);
        }
    }

    /* renamed from: ib0.e$i */
    static final class C25152i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25143e f64606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25152i(C25143e eVar) {
            super(0);
            this.f64606d = eVar;
        }

        public final void invoke() {
            this.f64606d.m80206p2().mo64710rw().mo64702P0();
        }
    }

    /* renamed from: ib0.e$j */
    public static final class C25153j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f64607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25153j(Fragment fragment) {
            super(0);
            this.f64607d = fragment;
        }

        public final Fragment invoke() {
            return this.f64607d;
        }
    }

    /* renamed from: ib0.e$k */
    public static final class C25154k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25154k(C43064a aVar) {
            super(0);
            this.f64608d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f64608d.invoke();
        }
    }

    /* renamed from: ib0.e$l */
    public static final class C25155l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f64609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25155l(C41217g gVar) {
            super(0);
            this.f64609d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f64609d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ib0.e$m */
    public static final class C25156m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64610d;

        /* renamed from: e */
        final /* synthetic */ C41217g f64611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25156m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f64610d = aVar;
            this.f64611e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f64610d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f64611e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ib0.e$n */
    static final class C25157n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C25143e f64612d;

        /* renamed from: ib0.e$n$a */
        static final class C25158a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C25143e f64613d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25158a(C25143e eVar) {
                super(0);
                this.f64613d = eVar;
            }

            /* renamed from: b */
            public final C25895m invoke() {
                return this.f64613d.mo63692q2().mo32813a(this.f64613d.m80205o2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25157n(C25143e eVar) {
            super(0);
            this.f64612d = eVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C25158a(this.f64612d));
        }
    }

    public C25143e() {
        C25157n nVar = new C25157n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C25154k(new C25153j(this)));
        this.f64601N = C1514j0.m5374c(this, C41520a0.m120436b(C25895m.class), new C25155l(a), new C25156m((C43064a) null, a), nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final AccumulateOnSpecificDateModel m80205o2() {
        return (AccumulateOnSpecificDateModel) this.f64599L.getValue();
    }

    private final void observeData() {
        C25891i sw = m80206p2().mo64711sw();
        LiveData f3 = sw.mo64706f3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(f3, viewLifecycleOwner, new C25146c(this));
        sw.mo64707k8().mo4819k(getViewLifecycleOwner(), new C25151h(new C25147d(this)));
        sw.mo64705e().mo4819k(getViewLifecycleOwner(), new C25151h(new C25148e(this)));
        sw.mo64708m().mo4819k(getViewLifecycleOwner(), new C25151h(new C25149f(this)));
        LiveData Dr = sw.mo64704Dr();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Dr, viewLifecycleOwner2, new C25150g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C25895m m80206p2() {
        return (C25895m) this.f64601N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m80207r2(C25895m.C25896a aVar) {
        C39992d.f94982Q.mo93826a(aVar.mo64714b(), aVar.mo64715c(), aVar.mo64716d(), aVar.mo64713a()).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m80208s2(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        C24925b bVar = this.f64598K;
        Integer num = null;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        if (accumulateOnSpecificDateModel.mo57143i() != null) {
            CreditCardSmallPickerView picker = bVar.f64094e.getPicker();
            String k = accumulateOnSpecificDateModel.mo57145k();
            if (k != null) {
                num = C40438v.m117098j(k);
            }
            Integer num2 = num;
            String m = accumulateOnSpecificDateModel.mo57147m();
            if (m == null) {
                m = accumulateOnSpecificDateModel.mo57144j();
            }
            picker.setCreditCard(new CreditCardSmallPickerView.C13279b.C13281b((String) null, num2, m, accumulateOnSpecificDateModel.mo57146l(), (String) null));
            return;
        }
        bVar.f64094e.getPicker().setCreditCard(CreditCardSmallPickerView.C13279b.C13280a.f39265a);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m80209t2(boolean z) {
        C24925b bVar = this.f64598K;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        FrameLayout frameLayout = bVar.f64100k;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: u2 */
    private final void m80210u2() {
        C24925b bVar = this.f64598K;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        bVar.f64094e.getMainButton().setEnabled(false);
        mo26370a2(C32343x.m95388F("applications.deposits.STO.action.sheet.header", new Object[0]));
        bVar.f64097h.setText(C32343x.m95388F("applications.deposits.STO.action.sheet.transfer.date", new Object[0]));
        bVar.f64096g.setButtonText(C32343x.m95388F("applications.deposits.bundle.accumulate.STO.sheet.cancel.button", new Object[0]));
        BigInputView bigInputView = bVar.f64098i;
        bigInputView.setInfoText(C32343x.m95388F("applications.deposits.STO.action.sheet.amount.text", new Object[0]));
        bigInputView.setHint("0.00");
        String e = m80205o2().mo57137e();
        if (e == null) {
            e = "GEL";
        }
        String a = C32314k.m95245a(e);
        C41536l.m120488h(a, "getCurrencySym(args.ccy ?: Consts.GEL)");
        bigInputView.setSuffix(a);
        BigDecimal d = m80205o2().mo57135d();
        if (d != null) {
            C17367b b = C17959a.m61878b();
            String bigDecimal = d.toString();
            C41536l.m120488h(bigDecimal, "it.toString()");
            bigInputView.setText(b.mo44804d(bigDecimal));
        }
        bigInputView.setTextChangeListener(new C25139a(this));
        CreditCardSmallPickerView picker = bVar.f64094e.getPicker();
        picker.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("applications.deposits.STO.action.sheet.acc.header", new Object[0]), C32343x.m95388F("applications.deposits.STO.action.sheet.acc.from", new Object[0])));
        C28345h.m86979b(picker, 0, new C25152i(this), 1, (Object) null);
        Button mainButton = bVar.f64094e.getMainButton();
        mainButton.setButtonText(C32343x.m95388F("applications.deposits.money.STO.sheet.main.button", new Object[0]));
        mainButton.setOnClickListener(new C25140b(this));
        DayCarouselView dayCarouselView = bVar.f64095f;
        dayCarouselView.mo44794h(new C43420e(1, 28), m80205o2().mo57139f());
        dayCarouselView.setPeriodSelectionListener(new C25141c(this));
        Button button = bVar.f64096g;
        C41536l.m120488h(button, "setupViews$lambda$12$lambda$11");
        C32343x.m95483r1(button, m80205o2().mo57149q(), false, 2, (Object) null);
        button.setOnClickListener(new C25142d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m80211v2(C25143e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m80206p2().mo64712xw();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m80212w2(C25143e eVar, String str) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m80206p2().mo64710rw().mo64703d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m80213x2(C25143e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m80206p2().mo64710rw().mo64699F1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m80214y2(C25143e eVar, int i) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m80206p2().mo64710rw().mo64700M3(i);
    }

    /* renamed from: P */
    public void mo57031P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        m80206p2().mo64710rw().mo64701P(transferAccountItem);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C24925b d = C24925b.m79678d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f64598K = d;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m80210u2();
        observeData();
    }

    /* renamed from: q2 */
    public final C25895m.C25897b mo63692q2() {
        C25895m.C25897b bVar = this.f64600M;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}
