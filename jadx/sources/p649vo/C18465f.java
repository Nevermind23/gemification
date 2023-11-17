package p649vo;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import b41.C31128a;
import fd0.C20463a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel;
import p413eo.C12756m;
import p649vo.C18484l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: vo.f */
public final class C18465f extends C18460a {

    /* renamed from: m */
    public static final C18466a f51934m = new C18466a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12756m f51935i;

    /* renamed from: j */
    public C18484l.C18487c f51936j;

    /* renamed from: k */
    private final C41217g f51937k = C41219i.m119470b(new C18467b(this));

    /* renamed from: l */
    private final C41217g f51938l;

    /* renamed from: vo.f$a */
    public static final class C18466a {
        private C18466a() {
        }

        public /* synthetic */ C18466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18465f mo46252a(FinancialInfoLookupUiModel financialInfoLookupUiModel) {
            C41536l.m120489i(financialInfoLookupUiModel, "infoLookup");
            C18465f fVar = new C18465f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_INCOME_LOOK_UP", financialInfoLookupUiModel)));
            return fVar;
        }
    }

    /* renamed from: vo.f$b */
    static final class C18467b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18465f f51939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18467b(C18465f fVar) {
            super(0);
            this.f51939d = fVar;
        }

        /* renamed from: b */
        public final FinancialInfoLookupUiModel invoke() {
            Bundle arguments = this.f51939d.getArguments();
            FinancialInfoLookupUiModel financialInfoLookupUiModel = arguments != null ? (FinancialInfoLookupUiModel) arguments.getParcelable("EXTRA_INCOME_LOOK_UP") : null;
            C41536l.m120486f(financialInfoLookupUiModel);
            return financialInfoLookupUiModel;
        }
    }

    /* renamed from: vo.f$c */
    /* synthetic */ class C18468c extends C41535k implements C43075l {
        C18468c(Object obj) {
            super(1, obj, C18465f.class, "onCurrencyResult", "onCurrencyResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo46254b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18465f) this.receiver).m62922t1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46254b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vo.f$d */
    /* synthetic */ class C18469d extends C41535k implements C43075l {
        C18469d(Object obj) {
            super(1, obj, C18465f.class, "toggleButton", "toggleButton(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo46255b(boolean z) {
            ((C18465f) this.receiver).m62910C1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46255b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: vo.f$e */
    /* synthetic */ class C18470e extends C41535k implements C43075l {
        C18470e(Object obj) {
            super(1, obj, C18465f.class, "postInfo", "postInfo(Lge/bog/mobilebank/categorypackages/presentation/application/secondstage/model/FinancialInfoUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo46256b(FinancialInfoUiModel financialInfoUiModel) {
            C41536l.m120489i(financialInfoUiModel, "p0");
            ((C18465f) this.receiver).m62924v1(financialInfoUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46256b((FinancialInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vo.f$f */
    static final class C18471f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51940a;

        C18471f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51940a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51940a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51940a.invoke(obj);
        }
    }

    /* renamed from: vo.f$g */
    /* synthetic */ class C18472g extends C41535k implements C43075l {
        C18472g(Object obj) {
            super(1, obj, C18481i.class, "onAmountInput", "onAmountInput(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo46259b(String str) {
            C41536l.m120489i(str, "p0");
            ((C18481i) this.receiver).mo46263d(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46259b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vo.f$h */
    public static final class C18473h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18473h(Fragment fragment) {
            super(0);
            this.f51941d = fragment;
        }

        public final Fragment invoke() {
            return this.f51941d;
        }
    }

    /* renamed from: vo.f$i */
    public static final class C18474i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18474i(C43064a aVar) {
            super(0);
            this.f51942d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f51942d.invoke();
        }
    }

    /* renamed from: vo.f$j */
    public static final class C18475j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f51943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18475j(C41217g gVar) {
            super(0);
            this.f51943d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f51943d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vo.f$k */
    public static final class C18476k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51944d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51945e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18476k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f51944d = aVar;
            this.f51945e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51944d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f51945e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vo.f$l */
    static final class C18477l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18465f f51946d;

        /* renamed from: vo.f$l$a */
        static final class C18478a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C18465f f51947d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18478a(C18465f fVar) {
                super(0);
                this.f51947d = fVar;
            }

            /* renamed from: b */
            public final C18484l invoke() {
                return this.f51947d.mo46251q1().mo32827a(this.f51947d.m62920r1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18477l(C18465f fVar) {
            super(0);
            this.f51946d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C18478a(this.f51946d));
        }
    }

    public C18465f() {
        C18477l lVar = new C18477l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C18474i(new C18473h(this)));
        this.f51938l = C1514j0.m5374c(this, C41520a0.m120436b(C18484l.class), new C18475j(a), new C18476k((C43064a) null, a), lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m62908A1(C18465f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m62921s1().mo46267fw().mo46261Hv();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m62909B1(C18465f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m62921s1().onRefresh(6);
        CardView cardView = fVar.m62919p1().f37790m;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m62910C1(boolean z) {
        m62919p1().f37782e.setEnabled(z);
    }

    private final void observeData() {
        C18482j gw = m62921s1().mo46268gw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        gw.mo46264Qm().mo4819k(viewLifecycleOwner, new C18471f(new C18468c(this)));
        gw.mo46265m().mo4819k(viewLifecycleOwner, new C18471f(new C18469d(this)));
        C37224b.m109963b(gw.mo46266ue(), viewLifecycleOwner, new C18470e(this));
    }

    /* renamed from: p1 */
    private final C12756m m62919p1() {
        C12756m mVar = this.f51935i;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final FinancialInfoLookupUiModel m62920r1() {
        return (FinancialInfoLookupUiModel) this.f51937k.getValue();
    }

    /* renamed from: s1 */
    private final C18484l m62921s1() {
        return (C18484l) this.f51938l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m62922t1(C31128a aVar) {
        if (aVar instanceof C31128a.C31131c) {
            FrameLayout frameLayout = m62919p1().f37788k;
            C41536l.m120488h(frameLayout, "binding.progressBar");
            C32343x.m95455i0(frameLayout);
            m62919p1().f37783f.mo35190t();
            for (C20463a c : (Iterable) ((C31128a.C31131c) aVar).mo71340a()) {
                ChipGroup chipGroup = m62919p1().f37783f;
                Context requireContext = requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chip.setChipTitle(c.mo49003c());
                chipGroup.mo35183o(chip);
            }
            m62919p1().f37783f.setOnChipActivatedChangedListener(new C18462c(this, aVar));
        } else if (aVar instanceof C31128a.C31130b) {
            FrameLayout frameLayout2 = m62919p1().f37788k;
            C41536l.m120488h(frameLayout2, "binding.progressBar");
            C32343x.m95447f1(frameLayout2);
        } else if (aVar instanceof C31128a.C31129a) {
            FrameLayout frameLayout3 = m62919p1().f37788k;
            C41536l.m120488h(frameLayout3, "binding.progressBar");
            C32343x.m95455i0(frameLayout3);
            CardView cardView = m62919p1().f37790m;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m62923u1(C18465f fVar, C31128a aVar, Chip chip, int i) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(aVar, "$result");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        fVar.m62921s1().mo46267fw().mo46262Qh(((C20463a) ((List) ((C31128a.C31131c) aVar).mo71340a()).get(i)).mo49003c());
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m62924v1(FinancialInfoUiModel financialInfoUiModel) {
        C1533o.m5445b(this, "REQUEST_KEY_ADD_FINANCIAL_INFO", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_FINANCIAL_INFO", financialInfoUiModel)));
    }

    /* renamed from: x1 */
    private final void m62925x1() {
        m62919p1().f37782e.setOnClickListener(new C18461b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m62926y1(C18465f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m62921s1().mo46267fw().mo46261Hv();
    }

    /* renamed from: z1 */
    private final void m62927z1() {
        m62919p1().f37784g.setText(C32343x.m95388F("packages.application.II.financial.info.amount.Asheet.explanatory", new Object[0]));
        m62919p1().f37787j.setHintText((CharSequence) C32343x.m95388F(m62920r1().mo40836a(), new Object[0]));
        m62919p1().f37787j.getTextInput().requestFocus();
        C32343x.m95457j(m62919p1().f37787j.getTextInput(), new C18472g(m62921s1().mo46267fw()));
        Button button = m62919p1().f37782e;
        button.setButtonText(C32343x.m95388F("packages.application.II.financial.info.amount.Asheet.button.label", new Object[0]));
        button.setEnabled(false);
        button.setOnClickListener(new C18463d(this));
        m62919p1().f37789l.mo3946b().setOnClickListener(new C18464e(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f51935i = C12756m.m48419d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m62919p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f51935i = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m62927z1();
        observeData();
        m62925x1();
    }

    /* renamed from: q1 */
    public final C18484l.C18487c mo46251q1() {
        C18484l.C18487c cVar = this.f51936j;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
