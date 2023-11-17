package p341ge.bog.mobilebank.cleanarch.presentation.p766zk.iframe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.google.gson.Gson;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import j60.C25334a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p794ix.C25265a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity */
public final class ZkIFrameActivity extends C35388f2 {

    /* renamed from: K */
    public static final C22482b f59471K = new C22482b((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59472F = C41219i.m119470b(new C22489i(this));

    /* renamed from: G */
    private final C41217g f59473G = C41219i.m119470b(new C22485e(this));

    /* renamed from: H */
    private final C41217g f59474H = C41219i.m119470b(new C22490j(this));

    /* renamed from: I */
    private C25265a f59475I;

    /* renamed from: J */
    private final C41217g f59476J = new C1617p0(C41520a0.m120436b(ZkIFrameViewModel.class), new C22487g(this), new C22486f(this), new C22488h((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$a */
    private static final class C22481a extends WebViewClient {

        /* renamed from: a */
        private C43064a f59477a;

        /* renamed from: b */
        private C43064a f59478b;

        /* renamed from: a */
        public final void mo55483a(C43064a aVar) {
            this.f59478b = aVar;
        }

        /* renamed from: b */
        public final void mo55484b(C43064a aVar) {
            this.f59477a = aVar;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C43064a aVar = this.f59478b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C43064a aVar = this.f59477a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$b */
    public static final class C22482b {
        private C22482b() {
        }

        public /* synthetic */ C22482b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55487a(Context context, C25265a aVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(aVar, "card");
            Intent intent = new Intent(context, ZkIFrameActivity.class);
            intent.putExtra("UMTS_CARD", C32343x.m95471n1(aVar));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$c */
    static final class C22483c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkIFrameActivity f59479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22483c(ZkIFrameActivity zkIFrameActivity) {
            super(0);
            this.f59479d = zkIFrameActivity;
        }

        public final void invoke() {
            C32343x.m95401L0(this.f59479d.m72889D2());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$d */
    static final class C22484d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkIFrameActivity f59480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22484d(ZkIFrameActivity zkIFrameActivity) {
            super(0);
            this.f59480d = zkIFrameActivity;
        }

        public final void invoke() {
            C32343x.m95407O0(this.f59480d.m72889D2());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$e */
    static final class C22485e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkIFrameActivity f59481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22485e(ZkIFrameActivity zkIFrameActivity) {
            super(0);
            this.f59481d = zkIFrameActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59481d.findViewById(C10322k.f28752Iq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$f */
    public static final class C22486f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22486f(ComponentActivity componentActivity) {
            super(0);
            this.f59482d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59482d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$g */
    public static final class C22487g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59483d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22487g(ComponentActivity componentActivity) {
            super(0);
            this.f59483d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59483d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$h */
    public static final class C22488h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59484d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59485e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22488h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59484d = aVar;
            this.f59485e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59484d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59485e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$i */
    static final class C22489i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkIFrameActivity f59486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22489i(ZkIFrameActivity zkIFrameActivity) {
            super(0);
            this.f59486d = zkIFrameActivity;
        }

        /* renamed from: b */
        public final WebView invoke() {
            return (WebView) this.f59486d.findViewById(C10322k.f28884qB);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameActivity$j */
    static final class C22490j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ZkIFrameActivity f59487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22490j(ZkIFrameActivity zkIFrameActivity) {
            super(0);
            this.f59487d = zkIFrameActivity;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f59487d.findViewById(C10322k.webViewContainer);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public final View m72889D2() {
        Object value = this.f59473G.getValue();
        C41536l.m120488h(value, "<get-progressView>(...)");
        return (View) value;
    }

    /* renamed from: E2 */
    private final ZkIFrameViewModel m72890E2() {
        return (ZkIFrameViewModel) this.f59476J.getValue();
    }

    /* renamed from: F2 */
    private final WebView m72891F2() {
        Object value = this.f59472F.getValue();
        C41536l.m120488h(value, "<get-webView>(...)");
        return (WebView) value;
    }

    /* renamed from: G2 */
    private final FrameLayout m72892G2() {
        Object value = this.f59474H.getValue();
        C41536l.m120488h(value, "<get-webViewContainer>(...)");
        return (FrameLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m72893H2(ZkIFrameActivity zkIFrameActivity, View view) {
        C41536l.m120489i(zkIFrameActivity, "this$0");
        zkIFrameActivity.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_zk_iframe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C25265a aVar;
        Object obj;
        super.mo37451O1(bundle);
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationIcon(C10320i.f28658Aa);
        }
        ToolbarView toolbarView2 = this.f85671t;
        if (toolbarView2 != null) {
            toolbarView2.setNavigationOnClickListener(new C25334a(this));
        }
        String stringExtra = getIntent().getStringExtra("UMTS_CARD");
        if (stringExtra != null) {
            try {
                obj = new Gson().mo18170l(stringExtra, C25265a.class);
            } catch (Exception unused) {
                obj = null;
            }
            aVar = (C25265a) obj;
        } else {
            aVar = null;
        }
        this.f59475I = aVar;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        float f2 = (float) i;
        float f3 = f2 / f;
        C41224m fw = m72890E2().mo55493fw();
        if (f3 > ((float) ((Number) fw.mo95678e()).intValue()) && f3 < ((float) ((Number) fw.mo95680f()).intValue())) {
            int floatValue = (int) ((f2 - (((Number) fw.mo95678e()).floatValue() - (((float) 1) * f))) / ((float) 2));
            m72892G2().setPadding(floatValue, 0, floatValue, 0);
        }
        m72891F2().setWebChromeClient(new WebChromeClient());
        WebView F2 = m72891F2();
        C22481a aVar2 = new C22481a();
        aVar2.mo55483a(new C22483c(this));
        aVar2.mo55484b(new C22484d(this));
        F2.setWebViewClient(aVar2);
        m72891F2().setLayerType(2, (Paint) null);
        m72891F2().getSettings().setJavaScriptEnabled(true);
        C25265a aVar3 = this.f59475I;
        if (aVar3 != null) {
            m72891F2().loadUrl(m72890E2().mo55492ew(aVar3), m72890E2().mo55491dw());
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.main_activity_burger_menu_receive_transfers);
        C41536l.m120488h(string, "getString(R.string.main_…r_menu_receive_transfers)");
        return string;
    }
}
