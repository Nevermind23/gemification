package p920vq;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.p016os.C0908e;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32297d;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.HashMap;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.cardactivation.presentation.C20871a;
import p341ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.rest.BankApi;
import p90.C27373n2;
import ue1.C43064a;
import ue1.C43075l;
import x11.C39775h;

/* renamed from: vq.c */
public final class C29133c extends C20871a implements C41185v.C41186a {

    /* renamed from: P */
    public static final C29134a f74150P = new C29134a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27373n2 f74151K;

    /* renamed from: L */
    private final C41217g f74152L;

    /* renamed from: M */
    private final Handler f74153M = new Handler(Looper.getMainLooper());

    /* renamed from: N */
    private String f74154N = C32343x.m95388F("card.activation.action.sheet.header", new Object[0]);

    /* renamed from: O */
    private final C41217g f74155O = C41219i.m119470b(new C29135b(this));

    /* renamed from: vq.c$a */
    public static final class C29134a {
        private C29134a() {
        }

        public /* synthetic */ C29134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29133c mo68988a(String str, long j) {
            C41536l.m120489i(str, "cardPan");
            C29133c cVar = new C29133c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("CARD_PAN", str), C41233s.m119492a("CARD_ID", Long.valueOf(j))));
            return cVar;
        }
    }

    /* renamed from: vq.c$b */
    static final class C29135b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29133c f74156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29135b(C29133c cVar) {
            super(0);
            this.f74156d = cVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f74156d.getArguments();
            return Long.valueOf(arguments != null ? arguments.getLong("CARD_ID") : -1);
        }
    }

    /* renamed from: vq.c$c */
    static final class C29136c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29136c(C29133c cVar) {
            super(1);
            this.f74157d = cVar;
        }

        /* renamed from: a */
        public final void mo68990a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                C29133c cVar = this.f74157d;
                cVar.m89053l2().f69364e.setEnabled(bool.booleanValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68990a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$d */
    static final class C29137d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29137d(C29133c cVar) {
            super(1);
            this.f74158d = cVar;
        }

        /* renamed from: a */
        public final void mo68991a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                C29133c cVar = this.f74158d;
                if (!bool.booleanValue()) {
                    C32297d.m95154b(cVar.requireActivity(), C32343x.m95388F("card.activation.field.validation.invalid.symbols.entered", new Object[0]));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68991a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$e */
    static final class C29138e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29138e(C29133c cVar) {
            super(1);
            this.f74159d = cVar;
        }

        /* renamed from: a */
        public final void mo68992a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74159d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68992a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$f */
    /* synthetic */ class C29139f extends C41535k implements C43075l {
        C29139f(Object obj) {
            super(1, obj, C29133c.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo68993b(boolean z) {
            ((C29133c) this.receiver).m89059r2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68993b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$g */
    static final class C29140g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29140g(C29133c cVar) {
            super(1);
            this.f74160d = cVar;
        }

        /* renamed from: a */
        public final void mo68994a(HashMap hashMap) {
            C41536l.m120489i(hashMap, "it");
            this.f74160d.m89060s2(hashMap);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68994a((HashMap) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$h */
    static final class C29141h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29141h(C29133c cVar) {
            super(1);
            this.f74161d = cVar;
        }

        /* renamed from: a */
        public final void mo68995a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f74161d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68995a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$i */
    /* synthetic */ class C29142i extends C41535k implements C43075l {
        C29142i(Object obj) {
            super(1, obj, C29133c.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo68996b(boolean z) {
            ((C29133c) this.receiver).m89059r2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68996b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$j */
    static final class C29143j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29143j(C29133c cVar) {
            super(1);
            this.f74162d = cVar;
        }

        /* renamed from: a */
        public final void mo68997a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f74162d.m89058q2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68997a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$k */
    static final class C29144k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29133c f74163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29144k(C29133c cVar) {
            super(1);
            this.f74163d = cVar;
        }

        /* renamed from: a */
        public final void mo68998a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f74163d.handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68998a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vq.c$l */
    static final class C29145l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74164a;

        C29145l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74164a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74164a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74164a.invoke(obj);
        }
    }

    /* renamed from: vq.c$m */
    public static final class C29146m implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CardActivationViewModel f74165d;

        public C29146m(CardActivationViewModel cardActivationViewModel) {
            this.f74165d = cardActivationViewModel;
        }

        public void afterTextChanged(Editable editable) {
            this.f74165d.mo49672qw(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: vq.c$n */
    public static final class C29147n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29147n(Fragment fragment) {
            super(0);
            this.f74166d = fragment;
        }

        public final Fragment invoke() {
            return this.f74166d;
        }
    }

    /* renamed from: vq.c$o */
    public static final class C29148o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29148o(C43064a aVar) {
            super(0);
            this.f74167d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f74167d.invoke();
        }
    }

    /* renamed from: vq.c$p */
    public static final class C29149p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f74168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29149p(C41217g gVar) {
            super(0);
            this.f74168d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f74168d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vq.c$q */
    public static final class C29150q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74169d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74170e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29150q(C43064a aVar, C41217g gVar) {
            super(0);
            this.f74169d = aVar;
            this.f74170e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74169d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f74170e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vq.c$r */
    public static final class C29151r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74171d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74172e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29151r(Fragment fragment, C41217g gVar) {
            super(0);
            this.f74171d = fragment;
            this.f74172e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f74172e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f74171d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C29133c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29148o(new C29147n(this)));
        this.f74152L = C1514j0.m5374c(this, C41520a0.m120436b(CardActivationViewModel.class), new C29149p(a), new C29150q((C43064a) null, a), new C29151r(this, a));
    }

    /* renamed from: k2 */
    private final void m89052k2(Context context, View view) {
        view.requestFocus();
        Object systemService = context.getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C27373n2 m89053l2() {
        C27373n2 n2Var = this.f74151K;
        C41536l.m120486f(n2Var);
        return n2Var;
    }

    /* renamed from: m2 */
    private final C41185v m89054m2() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: n2 */
    private final CardActivationViewModel m89055n2() {
        return (CardActivationViewModel) this.f74152L.getValue();
    }

    /* renamed from: o2 */
    private final void m89056o2() {
        IBinder iBinder;
        Object systemService = requireContext().getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    private final void observeData() {
        CardActivationViewModel n2 = m89055n2();
        n2.mo49668m().mo4819k(this, new C29145l(new C29136c(this)));
        n2.mo49667lw().mo4819k(this, new C29145l(new C29137d(this)));
        C37224b.m109963b(n2.mo49666kw(), this, new C29138e(this));
        C21484c.m69411c(n2.mo49670ow(), this, new C29140g(this), new C29139f(this), new C29141h(this));
        C21484c.m69411c(n2.mo49665jw(), this, new C29143j(this), new C29142i(this), new C29144k(this));
    }

    /* renamed from: p2 */
    public static final C29133c m89057p2(String str, long j) {
        return f74150P.mo68988a(str, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m89058q2() {
        m89056o2();
        C27373n2 l2 = m89053l2();
        l2.f69368i.setVisibility(8);
        l2.f69369j.setVisibility(0);
        l2.f69364e.setButtonText(C32343x.m95388F("text.common.close.button", new Object[0]));
        C1533o.m5445b(this, "REQUEST_KEY_CARD_ACTIVATED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CARD_ACTIVATED", Boolean.TRUE)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m89059r2(boolean z) {
        m89053l2().f69364e.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m89060s2(HashMap hashMap) {
        m89056o2();
        this.f74153M.postDelayed(new C29131a(hashMap, this), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m89061t2(HashMap hashMap, C29133c cVar) {
        C41536l.m120489i(hashMap, "$operationData");
        C41536l.m120489i(cVar, "this$0");
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, BankApi.CARDS_ACTIVATE_CARD, hashMap, (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = cVar.getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* renamed from: u2 */
    private final void m89062u2() {
        Window window;
        View decorView;
        Dialog n1 = mo4579n1();
        if (n1 != null && (window = n1.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewCompat.m3550F0(decorView, new C39775h());
        }
    }

    /* renamed from: v2 */
    private final void m89063v2() {
        C27373n2 l2 = m89053l2();
        l2.f69364e.setButtonText(C32343x.m95388F("card.activation.action.sheet.button", new Object[0]));
        l2.f69369j.setTitleText(C32343x.m95388F("card.activation.completed.successfully", new Object[0]));
        l2.f69367h.setHintText((CharSequence) C32343x.m95388F("card.activation.field.header.enter.last.4", new Object[0]));
        l2.f69366g.setTitleText(C32343x.m95388F("card.activation.action.sheet.info.text", new Object[0]));
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        Input input = m89053l2().f69367h;
        C41536l.m120488h(input, "binding.cardDigits");
        m89052k2(requireContext, input);
        l2.f69367h.getTextInput().addTextChangedListener(new C29146m(m89055n2()));
        l2.f69367h.getTextInput().setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4)});
        l2.f69364e.setOnClickListener(new C29132b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m89064w2(C29133c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m89055n2().mo49675tw();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v m2 = m89054m2();
        if (m2 != null) {
            m2.mo4577k1();
        }
        m89055n2().mo49664iw(str, str2, str3);
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f74154N;
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C32297d.m95156d(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m89059r2(z);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74151K = C27373n2.m84800d(layoutInflater, viewGroup, true);
        CardActivationViewModel n2 = m89055n2();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("CARD_PAN")) == null) {
            str = "";
        }
        n2.mo49673rw(str);
        observeData();
        m89063v2();
        m89062u2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f74151K = null;
        this.f74153M.removeCallbacksAndMessages((Object) null);
    }
}
