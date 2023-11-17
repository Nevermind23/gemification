package p341ge.bog.mobilebank.p2p.presentation.topup_webview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import androidx.activity.C0152h;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import bw0.C31211d;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37588a0;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.p2p.presentation.P2PActivity;
import p341ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState;
import p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c;
import p366bk.C10320i;
import p420fh.C12902d;
import p420fh.C12910e;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import yv0.C40080e;

/* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment */
public final class P2PTopUpWebViewFragment extends C33591a {

    /* renamed from: j */
    public static final C33576a f81870j = new C33576a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40080e f81871g;

    /* renamed from: h */
    public C33593c.C33596c f81872h;

    /* renamed from: i */
    private final C41217g f81873i;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$a */
    public static final class C33576a {
        private C33576a() {
        }

        public /* synthetic */ C33576a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$b */
    public static final class C33577b extends C0152h {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpWebViewFragment f81874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33577b(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            super(true);
            this.f81874d = p2PTopUpWebViewFragment;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f81874d.m98553l1().mo79594iw().mo79592et();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$c */
    static final class C33578c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81875a;

        C33578c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81875a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81875a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81875a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$d */
    static final class C33579d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpWebViewFragment f81876d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$d$a */
        static final class C33580a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpWebViewFragment f81877d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33580a(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
                super(1);
                this.f81877d = p2PTopUpWebViewFragment;
            }

            /* renamed from: a */
            public final void mo79585a(C31211d dVar) {
                C41536l.m120489i(dVar, "it");
                this.f81877d.m98552k1().f95283f.loadUrl(dVar.mo71452a());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo79585a((C31211d) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$d$b */
        static final class C33581b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpWebViewFragment f81878d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33581b(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
                super(1);
                this.f81878d = p2PTopUpWebViewFragment;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1505h requireActivity = this.f81878d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, String.valueOf(th.getMessage()), (C12902d.C12905b) null, false, 6, (Object) null);
                C8034d.m30522a(this.f81878d).mo22123U();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33579d(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            super(1);
            this.f81876d = p2PTopUpWebViewFragment;
        }

        /* renamed from: a */
        public final void mo79584a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C33580a(this.f81876d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C33581b(this.f81876d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79584a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$e */
    static final class C33582e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpWebViewFragment f81879d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$e$a */
        public /* synthetic */ class C33583a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f81880a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ge.bog.mobilebank.p2p.presentation.topup_webview.c$d[] r0 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.p2p.presentation.topup_webview.c$d r1 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.NAVIGATE_TO_PREVIOUS_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.p2p.presentation.topup_webview.c$d r1 = p341ge.bog.mobilebank.p2p.presentation.topup_webview.C33593c.C33597d.NAVIGATE_TO_HOME_PAGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f81880a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment.C33582e.C33583a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33582e(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            super(1);
            this.f81879d = p2PTopUpWebViewFragment;
        }

        /* renamed from: a */
        public final void mo79587a(C33593c.C33597d dVar) {
            C41536l.m120486f(dVar);
            int i = C33583a.f81880a[dVar.ordinal()];
            if (i == 1) {
                C8034d.m30522a(this.f81879d).mo22123U();
            } else if (i == 2) {
                C1505h requireActivity = this.f81879d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C38122f c = C38125h.m112238c(requireActivity);
                Context requireContext = this.f81879d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                C38122f.C38123a.m112215k(c, requireContext, (String) null, (Bundle) null, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79587a((C33593c.C33597d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$f */
    public static final class C33584f extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ P2PTopUpWebViewFragment f81881a;

        C33584f(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            this.f81881a = p2PTopUpWebViewFragment;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            this.f81881a.m98553l1().mo79597lw(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return false;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$g */
    public static final class C33585g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33585g(Fragment fragment) {
            super(0);
            this.f81882d = fragment;
        }

        public final Fragment invoke() {
            return this.f81882d;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$h */
    public static final class C33586h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33586h(C43064a aVar) {
            super(0);
            this.f81883d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81883d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$i */
    public static final class C33587i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33587i(C41217g gVar) {
            super(0);
            this.f81884d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81884d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$j */
    public static final class C33588j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81885d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81886e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33588j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81885d = aVar;
            this.f81886e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81885d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81886e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$k */
    static final class C33589k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PTopUpWebViewFragment f81887d;

        /* renamed from: ge.bog.mobilebank.p2p.presentation.topup_webview.P2PTopUpWebViewFragment$k$a */
        static final class C33590a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ P2PTopUpWebViewFragment f81888d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33590a(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
                super(0);
                this.f81888d = p2PTopUpWebViewFragment;
            }

            /* renamed from: b */
            public final C33593c invoke() {
                P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState;
                C33593c.C33596c m1 = this.f81888d.mo79581m1();
                Bundle arguments = this.f81888d.getArguments();
                if (arguments != null) {
                    p2PTopUpViewModel$TopUpState = (P2PTopUpViewModel$TopUpState) arguments.getParcelable("TOP_UP_STATE");
                } else {
                    p2PTopUpViewModel$TopUpState = null;
                }
                C41536l.m120486f(p2PTopUpViewModel$TopUpState);
                return m1.mo32844a(p2PTopUpViewModel$TopUpState);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33589k(P2PTopUpWebViewFragment p2PTopUpWebViewFragment) {
            super(0);
            this.f81887d = p2PTopUpWebViewFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33590a(this.f81887d));
        }
    }

    public P2PTopUpWebViewFragment() {
        C33589k kVar = new C33589k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33586h(new C33585g(this)));
        this.f81873i = C1514j0.m5374c(this, C41520a0.m120436b(C33593c.class), new C33587i(a), new C33588j((C43064a) null, a), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C40080e m98552k1() {
        C40080e eVar = this.f81871g;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C33593c m98553l1() {
        return (C33593c) this.f81873i.getValue();
    }

    /* renamed from: n1 */
    private final void m98554n1() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C33577b(this));
    }

    /* renamed from: o1 */
    private final void m98555o1() {
        m98553l1().mo79596kw().mo79591Z8().mo4819k(getViewLifecycleOwner(), new C33578c(new C33579d(this)));
        m98553l1().mo79596kw().mo79590G8().mo4819k(getViewLifecycleOwner(), new C33578c(new C33582e(this)));
    }

    /* renamed from: p1 */
    private final void m98556p1() {
        m98552k1().f95283f.getSettings().setJavaScriptEnabled(true);
        m98552k1().f95283f.getSettings().setDomStorageEnabled(true);
        m98552k1().f95283f.getSettings().setLoadWithOverviewMode(false);
        m98552k1().f95283f.getSettings().setUseWideViewPort(false);
        m98552k1().f95283f.getSettings().setBuiltInZoomControls(true);
        m98552k1().f95283f.setWebViewClient(new C33584f(this));
    }

    /* renamed from: m1 */
    public final C33593c.C33596c mo79581m1() {
        C33593c.C33596c cVar = this.f81872h;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81871g = C40080e.m116126d(layoutInflater, viewGroup, false);
        LinearLayout c = m98552k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f81871g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        P2PActivity p2PActivity;
        ToolbarView toolbarView;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.p2p.payment.topup.title", new Object[0]));
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof P2PActivity) {
            p2PActivity = (P2PActivity) requireActivity;
        } else {
            p2PActivity = null;
        }
        if (!(p2PActivity == null || (toolbarView = p2PActivity.f85671t) == null)) {
            toolbarView.setNavigationIcon(C10320i.f28658Aa);
        }
        m98554n1();
        m98555o1();
        m98556p1();
    }
}
