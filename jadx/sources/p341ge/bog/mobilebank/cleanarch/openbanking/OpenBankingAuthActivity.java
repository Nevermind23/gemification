package p341ge.bog.mobilebank.cleanarch.openbanking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentManager;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import j00.C25284b;
import j51.C36736h;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p112i1.C6507b;
import p112i1.C6509d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27255b1;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity */
public final class OpenBankingAuthActivity extends C21427a implements C41185v.C41186a {

    /* renamed from: K */
    public static final C21422a f57284K = new C21422a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f57285G = C41219i.m119470b(new C21423b(this));

    /* renamed from: H */
    private final C41217g f57286H = C41219i.m119470b(new C21426e(this));

    /* renamed from: I */
    private final C41217g f57287I = C41219i.m119470b(new C21424c(this));

    /* renamed from: J */
    public C36736h f57288J;

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity$a */
    public static final class C21422a {
        private C21422a() {
        }

        public /* synthetic */ C21422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53479a(Activity activity, String str) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(str, "uri");
            Intent intent = new Intent(activity, OpenBankingAuthActivity.class);
            intent.putExtra("URI_PARAM_KEY", str);
            activity.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity$b */
    static final class C21423b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankingAuthActivity f57289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21423b(OpenBankingAuthActivity openBankingAuthActivity) {
            super(0);
            this.f57289d = openBankingAuthActivity;
        }

        /* renamed from: b */
        public final C27255b1 invoke() {
            return C27255b1.m84319d(this.f57289d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity$c */
    static final class C21424c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankingAuthActivity f57290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21424c(OpenBankingAuthActivity openBankingAuthActivity) {
            super(0);
            this.f57290d = openBankingAuthActivity;
        }

        public final String invoke() {
            String queryParameter = this.f57290d.mo53478J2().getQueryParameter("redirect_uri");
            C41536l.m120486f(queryParameter);
            return queryParameter;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity$e */
    static final class C21426e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankingAuthActivity f57292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21426e(OpenBankingAuthActivity openBankingAuthActivity) {
            super(0);
            this.f57292d = openBankingAuthActivity;
        }

        /* renamed from: b */
        public final Uri invoke() {
            String stringExtra = this.f57292d.getIntent().getStringExtra("URI_PARAM_KEY");
            C41536l.m120486f(stringExtra);
            return Uri.parse(stringExtra);
        }
    }

    /* renamed from: I2 */
    private final C41185v m69238I2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: K2 */
    private final void m69239K2() {
        C41185v c = C41185v.f97155C.mo95638c("OPENBANKING_REDIRECT_FROM_OTHER_BANK", new HashMap(), C41143c.STRICT_AUTH);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: L2 */
    private final void m69240L2() {
        PageDescriptionView pageDescriptionView = mo53475F2().f68365f;
        pageDescriptionView.setTitle(C32343x.m95388F("text.open.banking.verification.page.name", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("text.open.banking.verification.page.description", new Object[0]));
        mo53475F2().f68364e.setOnClickListener(new C25284b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m69241M2(OpenBankingAuthActivity openBankingAuthActivity, View view) {
        C41536l.m120489i(openBankingAuthActivity, "this$0");
        openBankingAuthActivity.m69239K2();
    }

    /* renamed from: N2 */
    private final void m69242N2() {
        WebView webView = mo53475F2().f68367h;
        webView.clearCache(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        int i = 0;
        settings.setLoadWithOverviewMode(false);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(true);
        mo53475F2().f68367h.setWebViewClient(new C21425d(this));
        if (C6509d.m25695a("ALGORITHMIC_DARKENING")) {
            C6507b.m25691b(mo53475F2().f68367h.getSettings(), true);
        } else if (C6509d.m25695a("FORCE_DARK")) {
            WebSettings settings2 = mo53475F2().f68367h.getSettings();
            if (C32343x.m95476p0(this)) {
                i = 2;
            }
            C6507b.m25692c(settings2, i);
        }
    }

    /* renamed from: F2 */
    public final C27255b1 mo53475F2() {
        return (C27255b1) this.f57285G.getValue();
    }

    /* renamed from: G2 */
    public final C36736h mo53476G2() {
        C36736h hVar = this.f57288J;
        if (hVar != null) {
            return hVar;
        }
        C41536l.m120506z("getTokenUseCase");
        return null;
    }

    /* renamed from: H2 */
    public final String mo53477H2() {
        return (String) this.f57287I.getValue();
    }

    /* renamed from: J2 */
    public final Uri mo53478J2() {
        Object value = this.f57286H.getValue();
        C41536l.m120488h(value, "<get-uri>(...)");
        return (Uri) value;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        Button button = mo53475F2().f68364e;
        C41536l.m120488h(button, "binding.button");
        C32343x.m95455i0(button);
        PageDescriptionView pageDescriptionView = mo53475F2().f68365f;
        C41536l.m120488h(pageDescriptionView, "binding.pageDescription");
        C32343x.m95455i0(pageDescriptionView);
        WebView webView = mo53475F2().f68367h;
        C41536l.m120488h(webView, "binding.webView");
        C32343x.m95447f1(webView);
        C41185v I2 = m69238I2();
        if (I2 != null) {
            I2.mo4577k1();
        }
        mo53475F2().f68367h.loadUrl(mo53478J2().buildUpon().appendQueryParameter("accessTokenHint", mo53476G2().invoke()).toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        setContentView((View) mo53475F2().mo3946b());
        m69242N2();
        m69240L2();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C41185v I2 = m69238I2();
        if (I2 != null) {
            I2.mo95634K2(str);
        }
        mo53475F2().f68364e.setLoading(false);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        mo53475F2().f68364e.setLoading(z);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        mo53475F2().f68367h.destroy();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        mo53475F2().f68367h.onPause();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo53475F2().f68367h.onResume();
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity$d */
    public static final class C21425d extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ OpenBankingAuthActivity f57291a;

        C21425d(OpenBankingAuthActivity openBankingAuthActivity) {
            this.f57291a = openBankingAuthActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r5, java.lang.String r6) {
            /*
                r4 = this;
                r5 = 1
                r0 = 0
                if (r6 == 0) goto L_0x0019
                ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity r1 = r4.f57291a
                java.lang.String r1 = r1.mo53477H2()
                java.lang.String r2 = "redirectUri"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 2
                r3 = 0
                boolean r1 = cf1.C40439w.m117109H(r6, r1, r0, r2, r3)
                if (r1 != r5) goto L_0x0019
                r1 = r5
                goto L_0x001a
            L_0x0019:
                r1 = r0
            L_0x001a:
                if (r1 != 0) goto L_0x001d
                return r0
            L_0x001d:
                j00.a r0 = j00.C25283a.f64955a
                ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity r1 = r4.f57291a
                android.net.Uri r6 = android.net.Uri.parse(r6)
                java.lang.String r2 = "parse(url)"
                kotlin.jvm.internal.C41536l.m120488h(r6, r2)
                r0.mo63861e(r1, r6)
                ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity r6 = r4.f57291a
                r6.finish()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity.C21425d.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r2.getUrl();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r1, android.webkit.WebResourceRequest r2) {
            /*
                r0 = this;
                if (r2 == 0) goto L_0x000d
                android.net.Uri r2 = r2.getUrl()
                if (r2 == 0) goto L_0x000d
                java.lang.String r2 = r2.toString()
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                boolean r1 = r0.shouldOverrideUrlLoading((android.webkit.WebView) r1, (java.lang.String) r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity.C21425d.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
        }
    }
}
