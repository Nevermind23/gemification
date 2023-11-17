package q00;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import ba1.C10146d0;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25838r;
import m51.C37228a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.carddetails.viewmodel.CardDetailsViewModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.activities.ThreeDSecurityActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p366bk.C10322k;
import p366bk.C10328q;
import p90.C27347k3;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import y60.C29932d;

/* renamed from: q00.j */
public final class C27665j extends C35651n1 {

    /* renamed from: h */
    public static final C27666a f70754h = new C27666a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27347k3 f70755d;

    /* renamed from: e */
    private C25838r f70756e;

    /* renamed from: f */
    private final C41217g f70757f;

    /* renamed from: g */
    public TargetEnvironment f70758g;

    /* renamed from: q00.j$a */
    public static final class C27666a {
        private C27666a() {
        }

        public /* synthetic */ C27666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo67208a(View view, C25838r rVar) {
            int i;
            C41536l.m120489i(view, "view");
            if (rVar == null || !rVar.mo64575b()) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: q00.j$b */
    public static final class C27667b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27667b(Fragment fragment) {
            super(0);
            this.f70759d = fragment;
        }

        public final Fragment invoke() {
            return this.f70759d;
        }
    }

    /* renamed from: q00.j$c */
    public static final class C27668c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f70760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27668c(C43064a aVar) {
            super(0);
            this.f70760d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f70760d.invoke();
        }
    }

    /* renamed from: q00.j$d */
    public static final class C27669d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f70761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27669d(C41217g gVar) {
            super(0);
            this.f70761d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f70761d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: q00.j$e */
    public static final class C27670e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f70762d;

        /* renamed from: e */
        final /* synthetic */ C41217g f70763e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27670e(C43064a aVar, C41217g gVar) {
            super(0);
            this.f70762d = aVar;
            this.f70763e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f70762d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f70763e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: q00.j$f */
    public static final class C27671f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70764d;

        /* renamed from: e */
        final /* synthetic */ C41217g f70765e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27671f(Fragment fragment, C41217g gVar) {
            super(0);
            this.f70764d = fragment;
            this.f70765e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f70765e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f70764d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C27665j() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C27668c(new C27667b(this)));
        this.f70757f = C1514j0.m5374c(this, C41520a0.m120436b(CardDetailsViewModel.class), new C27669d(a), new C27670e((C43064a) null, a), new C27671f(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m85652A1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C36546y.m108282F().mo27152s("cards", "card_insurance", "click");
        Context requireContext = jVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        C25838r rVar = jVar.f70756e;
        if (rVar != null) {
            long h = rVar.mo64582h();
            Context requireContext2 = jVar.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91624q(h, requireContext2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m85653B1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C29932d.C29933a aVar = C29932d.f75725P;
        C25838r rVar = jVar.f70756e;
        if (rVar != null) {
            C29932d.C29933a.m90820b(aVar, rVar.mo64582h(), false, 2, (Object) null).mo4576A1(jVar.getChildFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m85654C1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        Context requireContext = jVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        C25838r rVar = jVar.f70756e;
        if (rVar != null) {
            long h = rVar.mo64582h();
            FragmentManager childFragmentManager = jVar.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            c.mo91554I(h, childFragmentManager);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m85655D1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C36546y.m108282F().mo27152s("cards", "edit_name", "click");
        C25838r rVar = jVar.f70756e;
        if (rVar != null) {
            RenameAccountActivity.m104745K2(jVar, rVar.mo64584i(), "", 6, rVar.mo64582h(), C10328q.common_text_card_name);
        }
    }

    /* renamed from: E1 */
    public static final void m85656E1(View view, C25838r rVar) {
        f70754h.mo67208a(view, rVar);
    }

    /* renamed from: F1 */
    private final void m85657F1() {
        C27347k3 k3Var = this.f70755d;
        C27347k3 k3Var2 = null;
        if (k3Var == null) {
            C41536l.m120506z("binding");
            k3Var = null;
        }
        k3Var.f69148L.setText(C32343x.m95420V("text.cards.mcc.control.title", C32343x.m95452h0(C10328q.payments_control, new Object[0]), new Object[0]));
        C27347k3 k3Var3 = this.f70755d;
        if (k3Var3 == null) {
            C41536l.m120506z("binding");
            k3Var3 = null;
        }
        k3Var3.f69142F.setText(C32343x.m95388F("card.details.card.security", new Object[0]));
        C27347k3 k3Var4 = this.f70755d;
        if (k3Var4 == null) {
            C41536l.m120506z("binding");
            k3Var4 = null;
        }
        k3Var4.mo66640D(this.f70756e);
        C27347k3 k3Var5 = this.f70755d;
        if (k3Var5 == null) {
            C41536l.m120506z("binding");
            k3Var5 = null;
        }
        k3Var5.mo66641E(getContext());
        ((BogTextView) findView(C10322k.pin_reset_header)).setText(C32343x.m95388F("card.details.change.pin", new Object[0]));
        C27347k3 k3Var6 = this.f70755d;
        if (k3Var6 == null) {
            C41536l.m120506z("binding");
            k3Var6 = null;
        }
        k3Var6.f69147K.setText(C32343x.m95388F("card.details.additional.functions", new Object[0]));
        C27347k3 k3Var7 = this.f70755d;
        if (k3Var7 == null) {
            C41536l.m120506z("binding");
            k3Var7 = null;
        }
        k3Var7.f69144H.setText(C32343x.m95388F("card.details.card.close", new Object[0]));
        C27347k3 k3Var8 = this.f70755d;
        if (k3Var8 == null) {
            C41536l.m120506z("binding");
            k3Var8 = null;
        }
        k3Var8.f69143G.setOnClickListener(new C27661f(this));
        C27347k3 k3Var9 = this.f70755d;
        if (k3Var9 == null) {
            C41536l.m120506z("binding");
            k3Var9 = null;
        }
        k3Var9.f69146J.setText(C32343x.m95388F("creditcard.details.agreement", new Object[0]));
        C27347k3 k3Var10 = this.f70755d;
        if (k3Var10 == null) {
            C41536l.m120506z("binding");
        } else {
            k3Var2 = k3Var10;
        }
        k3Var2.f69146J.setOnClickListener(new C27662g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m85658G1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C25838r rVar = jVar.f70756e;
        if (rVar != null) {
            jVar.m85673u1(rVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m85659H1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        String x1 = jVar.m85674x1();
        C1505h requireActivity = jVar.requireActivity();
        long currentTimeMillis = System.currentTimeMillis();
        C32303f.m95195f(x1, requireActivity, currentTimeMillis + ".pdf", "application/pdf");
    }

    /* renamed from: I1 */
    private final void m85660I1() {
        C32297d.m95160h(requireActivity(), C32343x.m95420V("card.mcc.opearation.completed.successfully", C32343x.m95452h0(C10328q.f28939S8, new Object[0]), new Object[0]));
    }

    /* renamed from: r1 */
    private final void m85670r1() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_MCC_UPDATED", getViewLifecycleOwner(), new C27663h(this));
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CLOSE_CARD", getViewLifecycleOwner(), new C27664i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m85671s1(C27665j jVar, String str, Bundle bundle) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        if (bundle.getBoolean("RESULT_KEY_MCC_UPDATED", false)) {
            jVar.m85660I1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m85672t1(C27665j jVar, String str, Bundle bundle) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        C1533o.m5445b(jVar, "REQUEST_KEY_CARD_DETAILS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CARD_WAS_CLOSED", Boolean.valueOf(bundle.getBoolean("RESULT_KEY_CLOSE_CARD", false)))));
    }

    /* renamed from: u1 */
    private final void m85673u1(C25838r rVar) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        long h = rVar.mo64582h();
        String r = rVar.mo64593r();
        if (r == null) {
            r = "";
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        c.mo91559K0(h, r, childFragmentManager);
    }

    /* renamed from: x1 */
    private final String m85674x1() {
        String str;
        C37228a loginInfo;
        String rbMiddleware = mo67207v1().getRbMiddleware();
        C25838r rVar = this.f70756e;
        Long l = null;
        if (rVar != null) {
            str = rVar.mo64586k();
        } else {
            str = null;
        }
        Client client = this.mClient;
        if (!(client == null || (loginInfo = client.getLoginInfo()) == null)) {
            l = Long.valueOf(loginInfo.mo90305b());
        }
        return rbMiddleware + "?" + str + "&customerId=" + l + "&noses=1&channel=MOBILE&keycloakSessionToken=" + C10146d0.C10159c.m37143b().getToken() + "&langCode=" + this.mPreferencesApiManager.getLanguage().mo90433b();
    }

    /* renamed from: y1 */
    private final void m85675y1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m85676z1(C27665j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C36546y.m108282F().mo27152s("cards", "card_3d_security", "click");
        C1505h activity = jVar.getActivity();
        C25838r rVar = jVar.f70756e;
        C41536l.m120486f(rVar);
        ThreeDSecurityActivity.m104877T2(activity, rVar.mo64592q());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.mClient.refreshCreditCardsEvent();
            this.mClient.refreshDepositsEvent();
            if (this.mClient.hasProduct("DEPOSIT")) {
                this.mClient.requestDepositBonds(false);
            }
            if (this.mClient.hasProduct("CREDITCARDACCOUNT")) {
                this.mClient.requestCreditCards(false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C27347k3 B = C27347k3.m84696B(layoutInflater, viewGroup, false);
        C41536l.m120488h(B, "inflate(inflater, container, false)");
        this.f70755d = B;
        if (B == null) {
            C41536l.m120506z("binding");
            B = null;
        }
        this.rootView = B.mo3946b();
        if (this.f70756e != null) {
            m85657F1();
        }
        this.rootView.findViewById(C10322k.three_d_security_item).setOnClickListener(new C27656a(this));
        this.rootView.findViewById(C10322k.card_insurance_item).setOnClickListener(new C27657b(this));
        this.rootView.findViewById(C10322k.mcc_item).setOnClickListener(new C27658c(this));
        this.rootView.findViewById(C10322k.pin_reset_item).setOnClickListener(new C27659d(this));
        m85670r1();
        return this.rootView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m85675y1();
        C27347k3 k3Var = this.f70755d;
        if (k3Var == null) {
            C41536l.m120506z("binding");
            k3Var = null;
        }
        k3Var.f69145I.setOnClickListener(new C27660e(this));
    }

    /* renamed from: v1 */
    public final TargetEnvironment mo67207v1() {
        TargetEnvironment targetEnvironment = this.f70758g;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }
}
