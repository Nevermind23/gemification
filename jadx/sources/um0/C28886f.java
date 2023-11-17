package um0;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import om0.C27050a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.junior.data.model.ApproveJuniorParams;
import p341ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel;
import ue1.C43064a;
import ue1.C43075l;
import zm0.C30351a;
import zm0.C30353c;
import zm0.C30357g;

/* renamed from: um0.f */
public final class C28886f extends C28881a implements C41185v.C41186a {

    /* renamed from: N */
    public static final C28887a f73740N = new C28887a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C30351a f73741K;

    /* renamed from: L */
    private final C41217g f73742L;

    /* renamed from: M */
    private C27050a f73743M;

    /* renamed from: um0.f$a */
    public static final class C28887a {
        private C28887a() {
        }

        public /* synthetic */ C28887a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28886f mo68651a(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            C41536l.m120489i(juniorRequestDataUiModel, "juniorData");
            C28886f fVar = new C28886f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("REQUEST_DATA", juniorRequestDataUiModel);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: um0.f$b */
    static final class C28888b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28888b(C28886f fVar) {
            super(1);
            this.f73744d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f73744d.m88511p2().f67923h;
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: um0.f$c */
    /* synthetic */ class C28889c extends C41535k implements C43075l {
        C28889c(Object obj) {
            super(1, obj, C28886f.class, "openSca", "openSca(Lge/bog/mobilebank/junior/data/model/ApproveJuniorParams;)V", 0);
        }

        /* renamed from: b */
        public final void mo68653b(ApproveJuniorParams approveJuniorParams) {
            C41536l.m120489i(approveJuniorParams, "p0");
            ((C28886f) this.receiver).m88516v2(approveJuniorParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68653b((ApproveJuniorParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$d */
    /* synthetic */ class C28890d extends C41535k implements C43075l {
        C28890d(Object obj) {
            super(1, obj, C28886f.class, "onApproveResult", "onApproveResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo68654b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C28886f) this.receiver).m88514t2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68654b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$e */
    /* synthetic */ class C28891e extends C41535k implements C43075l {
        C28891e(Object obj) {
            super(1, obj, C28886f.class, "onConfirmationResult", "onConfirmationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo68655b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C28886f) this.receiver).m88515u2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68655b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$f */
    static final class C28892f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28892f(C28886f fVar) {
            super(1);
            this.f73745d = fVar;
        }

        /* renamed from: a */
        public final void mo68656a(ChildRequestApproveUiModel childRequestApproveUiModel) {
            this.f73745d.m88511p2().f67923h.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68656a((ChildRequestApproveUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$g */
    static final class C28893g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28893g(C28886f fVar) {
            super(1);
            this.f73746d = fVar;
        }

        /* renamed from: a */
        public final void mo68657a(ChildRequestApproveUiModel childRequestApproveUiModel) {
            C41536l.m120489i(childRequestApproveUiModel, "it");
            C1533o.m5445b(this.f73746d, "REQUEST_KEY_CHILD_APPROVED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_APPROVE_RESULT", childRequestApproveUiModel)));
            this.f73746d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68657a((ChildRequestApproveUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$h */
    static final class C28894h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28894h(C28886f fVar) {
            super(1);
            this.f73747d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f73747d.handleError(th);
            this.f73747d.m88511p2().f67923h.setLoading(false);
        }
    }

    /* renamed from: um0.f$i */
    static final class C28895i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28895i(C28886f fVar) {
            super(1);
            this.f73748d = fVar;
        }

        /* renamed from: a */
        public final void mo68659a(C41238w wVar) {
            this.f73748d.m88511p2().f67923h.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68659a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um0.f$j */
    static final class C28896j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28886f f73749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28896j(C28886f fVar) {
            super(1);
            this.f73749d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f73749d.handleError(th);
            this.f73749d.m88511p2().f67923h.setLoading(false);
        }
    }

    /* renamed from: um0.f$k */
    static final class C28897k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f73750a;

        C28897k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f73750a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f73750a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f73750a.invoke(obj);
        }
    }

    /* renamed from: um0.f$l */
    public static final class C28898l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f73751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28898l(Fragment fragment) {
            super(0);
            this.f73751d = fragment;
        }

        public final Fragment invoke() {
            return this.f73751d;
        }
    }

    /* renamed from: um0.f$m */
    public static final class C28899m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f73752d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28899m(C43064a aVar) {
            super(0);
            this.f73752d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f73752d.invoke();
        }
    }

    /* renamed from: um0.f$n */
    public static final class C28900n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f73753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28900n(C41217g gVar) {
            super(0);
            this.f73753d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f73753d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: um0.f$o */
    public static final class C28901o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f73754d;

        /* renamed from: e */
        final /* synthetic */ C41217g f73755e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28901o(C43064a aVar, C41217g gVar) {
            super(0);
            this.f73754d = aVar;
            this.f73755e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f73754d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f73755e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: um0.f$p */
    static final class C28902p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28886f f73756d;

        /* renamed from: um0.f$p$a */
        static final class C28903a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C28886f f73757d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C28903a(C28886f fVar) {
                super(0);
                this.f73757d = fVar;
            }

            /* renamed from: b */
            public final C30357g invoke() {
                C30351a q2 = this.f73757d.mo68650q2();
                Parcelable parcelable = this.f73757d.requireArguments().getParcelable("REQUEST_DATA");
                C41536l.m120486f(parcelable);
                return q2.mo32788a((JuniorRequestDataUiModel) parcelable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28902p(C28886f fVar) {
            super(0);
            this.f73756d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C28903a(this.f73756d));
        }
    }

    public C28886f() {
        C28902p pVar = new C28902p(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C28899m(new C28898l(this)));
        this.f73742L = C1514j0.m5374c(this, C41520a0.m120436b(C30357g.class), new C28900n(a), new C28901o((C43064a) null, a), pVar);
    }

    /* renamed from: A2 */
    private final void m88498A2() {
        mo26370a2(C32343x.m95388F("text.junior.activation.page.agree.terms.title", new Object[0]));
        m88511p2().f67928m.setText(C32343x.m95388F("text.junior.activation.page.agree.terms.text", new Object[0]));
        m88511p2().f67921f.setText(C32343x.m95388F("text.junior.activation.page.agree.ssgs", new Object[0]));
        m88511p2().f67922g.setText(C32343x.m95388F("text.junior.activation.page.agree.terms", new Object[0]));
        m88511p2().f67920e.setText(C32343x.m95388F("text.junior.activation.page.agree.terms.link", new Object[0]));
        m88511p2().f67923h.setButtonText(C32343x.m95388F("text.junior.activation.page.agree.terms.button", new Object[0]));
    }

    /* renamed from: W1 */
    private final void m88499W1() {
        m88510o2();
        m88511p2().f67921f.setOnCheckedStateChangeListener(new C28882b(this));
        m88511p2().f67922g.setOnCheckedStateChangeListener(new C28883c(this));
        m88511p2().f67920e.setOnClickListener(new C28884d(this));
        m88511p2().f67923h.setOnClickListener(new C28885e(this));
    }

    /* renamed from: m2 */
    private final void m88508m2() {
        C30353c mw = m88512r2().mo70684mw();
        mw.mo70678gt().mo4819k(getViewLifecycleOwner(), new C28897k(new C28888b(this)));
        LiveData t = mw.mo70680t();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(t, viewLifecycleOwner, new C28889c(this));
        mw.mo70677d5().mo4819k(getViewLifecycleOwner(), new C28897k(new C28890d(this)));
        mw.mo70679i0().mo4819k(getViewLifecycleOwner(), new C28897k(new C28891e(this)));
    }

    /* renamed from: n2 */
    private final void m88509n2() {
        m88512r2().mo70685ow();
    }

    /* renamed from: o2 */
    private final void m88510o2() {
        m88512r2().mo70681jw(m88511p2().f67921f.isChecked(), m88511p2().f67922g.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C27050a m88511p2() {
        C27050a aVar = this.f73743M;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: r2 */
    private final C30357g m88512r2() {
        return (C30357g) this.f73742L.getValue();
    }

    /* renamed from: s2 */
    private final void m88513s2(String str) {
        C32303f.m95184D(str, requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m88514t2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C28892f(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C28893g(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C28894h(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m88515u2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C28895i(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C28896j(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m88516v2(ApproveJuniorParams approveJuniorParams) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, approveJuniorParams.getServiceId(), m88512r2().mo70683lw(approveJuniorParams), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m88517w2(C28886f fVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        fVar.m88510o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m88518x2(C28886f fVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        fVar.m88510o2();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m88519y2(C28886f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m88513s2(C32343x.m95388F("text.junior.activation.page.agree.terms.url", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m88520z2(C28886f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m88509n2();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        m88512r2().mo70682kw().mo70676iu(str, str2, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f73743M = C27050a.m83872d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m88498A2();
        m88499W1();
        m88508m2();
    }

    /* renamed from: q2 */
    public final C30351a mo68650q2() {
        C30351a aVar = this.f73741K;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
