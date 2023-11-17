package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.medallia.digital.mobilesdk.C11020n7;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11164w3;
import com.medallia.digital.mobilesdk.C11209y1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.b7 */
class C10740b7 implements C11164w3.C11172h, C10769c8, C11020n7.C11023b<C11209y1.C11211b>, C11229y6 {

    /* renamed from: q */
    protected static final String f30700q = "2.0.0";

    /* renamed from: r */
    private static final String f30701r = "targetRuleEngine/tre-%s.js";

    /* renamed from: s */
    private static final String f30702s = "targetRuleEngine/index.html";

    /* renamed from: t */
    private static final String f30703t = "targetRuleEngine";

    /* renamed from: u */
    private static final String f30704u = "getFormToTrigger";

    /* renamed from: v */
    private static final String f30705v = "getFormToTriggerWithPath";

    /* renamed from: w */
    private static final String f30706w = "<html lang=\"en\"><body><script src=\"TRE_NAME_TEMP\"></script></body></html>";

    /* renamed from: x */
    private static final String f30707x = "TRE_NAME_TEMP";

    /* renamed from: y */
    private static final int f30708y = 2;

    /* renamed from: a */
    private long f30709a;

    /* renamed from: b */
    protected C11020n7 f30710b = new C11020n7(500, this);

    /* renamed from: c */
    protected boolean f30711c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f30712d;

    /* renamed from: e */
    private Long f30713e;

    /* renamed from: f */
    protected String f30714f;

    /* renamed from: g */
    protected File f30715g;

    /* renamed from: h */
    private final ArrayList<C11199x1> f30716h = new ArrayList<>();

    /* renamed from: i */
    protected boolean f30717i = true;

    /* renamed from: j */
    private C11209y1.C11211b f30718j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WebView f30719k;

    /* renamed from: l */
    protected boolean f30720l = C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false);

    /* renamed from: m */
    protected boolean f30721m;

    /* renamed from: n */
    private boolean f30722n;

    /* renamed from: o */
    private final Handler f30723o = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    private final C11033o4 f30724p = new C10741a();

    /* renamed from: com.medallia.digital.mobilesdk.b7$a */
    class C10741a extends C11033o4 {

        /* renamed from: com.medallia.digital.mobilesdk.b7$a$a */
        class C10742a extends C11033o4 {
            C10742a() {
            }

            /* renamed from: a */
            public void mo27617a() {
                C10740b7.this.mo28130a(C11209y1.C11211b.evaluationTimer);
            }
        }

        C10741a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C11004m7.m40304b().mo28763a().execute(new C10742a());
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.b7$b */
    class C10743b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ File f30727a;

        /* renamed from: com.medallia.digital.mobilesdk.b7$b$a */
        class C10744a extends WebViewClient {

            /* renamed from: com.medallia.digital.mobilesdk.b7$b$a$a */
            class C10745a implements ValueCallback<String> {

                /* renamed from: com.medallia.digital.mobilesdk.b7$b$a$a$a */
                class C10746a extends C11033o4 {

                    /* renamed from: a */
                    final /* synthetic */ String f30731a;

                    C10746a(String str) {
                        this.f30731a = str;
                    }

                    /* renamed from: a */
                    public void mo27617a() {
                        C10740b7.this.m39131a(this.f30731a);
                    }
                }

                C10745a() {
                }

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C11004m7.m40304b().mo28763a().execute(new C10746a(str));
                }
            }

            C10744a() {
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (C10740b7.this.f30719k == null && webView != null) {
                    WebView unused = C10740b7.this.f30719k = webView;
                }
                if (C10740b7.this.f30719k != null) {
                    C10740b7.this.f30719k.evaluateJavascript(C10740b7.this.f30712d, new C10745a());
                    String unused2 = C10740b7.this.f30712d = null;
                    return;
                }
                C10735b4.m39111c("targetEngineWebView is null");
            }
        }

        C10743b(File file) {
            this.f30727a = file;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10740b7 b7Var = C10740b7.this;
            WebView unused = b7Var.f30719k = b7Var.m39139f();
            if (this.f30727a != null) {
                C10740b7.this.f30719k.loadUrl(String.format("file://%s", new Object[]{this.f30727a.getPath()}));
                C10740b7.this.f30719k.setWebViewClient(new C10744a());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.b7$c */
    class C10747c extends C11033o4 {
        C10747c() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C10740b7.this.f30719k != null) {
                C10740b7.this.f30719k.setWebChromeClient((WebChromeClient) null);
                C10740b7.this.f30719k.setWebViewClient((WebViewClient) null);
                C10740b7.this.f30719k.stopLoading();
                C10740b7.this.f30719k.clearHistory();
                C10740b7.this.f30719k.removeAllViews();
                C10740b7.this.f30719k.destroyDrawingCache();
                C10740b7.this.f30719k.destroy();
                WebView unused = C10740b7.this.f30719k = null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.b7$d */
    class C10748d implements C10796e6<File> {

        /* renamed from: a */
        final /* synthetic */ TargetRuleEngineContract f30734a;

        C10748d(TargetRuleEngineContract targetRuleEngineContract) {
            this.f30734a = targetRuleEngineContract;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("Failed to download and store target engine " + h4Var.getMessage());
            if (C10930k2.m39986d(C10740b7.this.f30715g)) {
                C10735b4.m39114f("Using previous TRE " + C10740b7.this.f30715g.getName());
                C10740b7.this.mo28130a(C11209y1.C11211b.sdkInit);
            }
        }

        /* renamed from: a */
        public void mo27797a(File file) {
            C10735b4.m39109b("TRE download completed successfully");
            C10740b7.this.m39130a(file);
            C10740b7 b7Var = C10740b7.this;
            b7Var.f30715g = file;
            b7Var.mo28130a(C11209y1.C11211b.sdkInit);
            C10740b7 b7Var2 = C10740b7.this;
            b7Var2.mo28131a(b7Var2.f30715g, this.f30734a);
            C10740b7.this.m39138e();
        }
    }

    /* renamed from: d */
    private void m39136d() {
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10747c());
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m39138e() {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public WebView m39139f() {
        WebView webView = new WebView(C10884i4.m39721c().mo28481a().getApplicationContext());
        webView.setWillNotDraw(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBlockNetworkLoads(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAppCacheEnabled(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.getSettings().setCacheMode(2);
        return webView;
    }

    /* renamed from: h */
    private TargetRuleEngineContract m39140h() {
        String a = C11089s6.m40668b().mo28975a(C11089s6.C11090a.TARGET_ENGINE, (String) null);
        if (a == null) {
            return null;
        }
        return ModelFactory.getInstance().createTargetRuleEngine(a);
    }

    /* renamed from: j */
    private void m39141j() {
        m39143l();
        m39142k();
    }

    /* renamed from: k */
    private void m39142k() {
        Long l = this.f30713e;
        if (l != null) {
            this.f30723o.postDelayed(this.f30724p, l.longValue());
        }
    }

    /* renamed from: l */
    private void m39143l() {
        C10735b4.m39109b("Evaluation timer stopped");
        this.f30723o.removeCallbacks(this.f30724p);
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a("TargetEvaluator");
        m39143l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo28142g() {
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public File mo28143i() {
        TargetRuleEngineContract h = m39140h();
        if (h != null) {
            return C10930k2.m39984d(mo28135b(h));
        }
        return null;
    }

    public void onBackground() {
        m39143l();
    }

    public void onForeground() {
        if (this.f30713e != null) {
            this.f30713e = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.f30713e.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000 : this.f30713e.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        m39141j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28135b(TargetRuleEngineContract targetRuleEngineContract) {
        return String.format(f30701r, new Object[]{targetRuleEngineContract.getVersion()});
    }

    /* renamed from: c */
    public boolean mo28140c() {
        return this.f30717i;
    }

    /* renamed from: a */
    public C11205x6 mo28127a() {
        return C11205x6.V1;
    }

    /* renamed from: b */
    public ArrayList<C11199x1> mo28136b() {
        return this.f30716h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28141c(TargetRuleEngineContract targetRuleEngineContract) {
        TargetRuleEngineContract h;
        if (!C10930k2.m39986d(this.f30715g) || (h = m39140h()) == null || h.getVersion() == null) {
            return false;
        }
        return h.getVersion().equals(targetRuleEngineContract.getVersion());
    }

    /* renamed from: a */
    private String m39128a(String str, String str2) {
        return String.format("%s.%s(%s,%s,%s)", new Object[]{f30703t, str, C10870h8.m39667g().mo28440b(), str2, Long.valueOf(System.currentTimeMillis())});
    }

    /* renamed from: b */
    public void mo28132a(C11209y1.C11211b bVar) {
        String str;
        String str2;
        if (this.f30720l) {
            C10735b4.m39113e("Evaluate can’t be trigger because of stop sdk");
        } else if (this.f30717i) {
            this.f30718j = bVar;
            C10870h8.m39667g().mo28436a(CollectorsInfrastructure.getInstance().timeInForegroundCollector.mo28917o());
            this.f30709a = System.currentTimeMillis();
            C10735b4.m39113e("Evaluate with TRE " + this.f30715g.getName());
            File a = C10930k2.m39971a(f30702s, f30706w.replace(f30707x, this.f30715g.getName()));
            this.f30712d = "";
            if (this.f30722n) {
                File c = C10714a1.m39028c();
                if (c == null) {
                    C10735b4.m39111c("Can't evaluate with TE configuration file is null");
                    return;
                } else {
                    str2 = C11051p3.m40518c(c.getPath());
                    str = f30705v;
                }
            } else {
                str2 = this.f30714f;
                str = f30704u;
            }
            this.f30712d = m39128a(str, str2);
            try {
                ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10743b(a));
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo28128a(ConfigurationContract configurationContract) {
        if (configurationContract != null && configurationContract.getTargetRuleEngine() != null) {
            if (configurationContract.getTargetRuleEngine().getUrl() != null || configurationContract.getTargetRuleEngine().getVersion() != null) {
                this.f30711c = false;
                if (!(configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null)) {
                    this.f30721m = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
                    this.f30722n = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isEvaluateWithConfigurationFile();
                }
                if (!this.f30722n) {
                    this.f30714f = configurationContract.toJsonString();
                }
                if (mo28141c(configurationContract.getTargetRuleEngine())) {
                    mo28130a(C11209y1.C11211b.updateConfiguration);
                    m39138e();
                    return;
                }
                this.f30715g = mo28143i();
                if (!mo28141c(configurationContract.getTargetRuleEngine())) {
                    mo28129a(configurationContract.getTargetRuleEngine());
                    return;
                }
                m39138e();
                mo28130a(C11209y1.C11211b.updateConfiguration);
            }
        }
    }

    /* renamed from: b */
    public void mo28138b(boolean z) {
        mo28139b(z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28129a(TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract != null) {
            C10998m4.m40266h().mo28744a(true, targetRuleEngineContract.getUrl(), mo28135b(targetRuleEngineContract), (C10796e6<File>) new C10748d(targetRuleEngineContract));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28139b(boolean z, boolean z2) {
        boolean z3 = this.f30717i;
        this.f30717i = z;
        if (!z2) {
            return;
        }
        if (!z3 || z) {
            mo28130a(C11209y1.C11211b.enableIntercept);
        } else {
            m39143l();
        }
    }

    /* renamed from: a */
    public synchronized void mo28130a(C11209y1.C11211b bVar) {
        if (!this.f30717i) {
            C10735b4.m39109b("Intercept is not enabled, evaluate won't run");
        } else if (this.f30721m && this.f30711c) {
            C10735b4.m39109b("Skip evaluation intercept was already shown in session");
        } else if (!C10930k2.m39986d(this.f30715g)) {
            C10735b4.m39111c("Target engine is missing");
        } else {
            C11020n7 n7Var = this.f30710b;
            if (n7Var == null) {
                C10735b4.m39111c("Throttle is null");
            } else {
                n7Var.mo28841a(bVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39130a(File file) {
        ArrayList<Pair<String, Boolean>> a = C10930k2.m39975a(f30703t, file);
        if (a != null) {
            Iterator<Pair<String, Boolean>> it = a.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                if (next != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                }
            }
        }
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.TARGET_ENGINE, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28131a(File file, TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract != null && C10930k2.m39986d(file)) {
            C11089s6.m40668b().mo28984b(C11089s6.C11090a.TARGET_ENGINE, targetRuleEngineContract.toJsonString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39131a(String str) {
        C10735b4.m39109b(str);
        C11199x1 x1Var = new C11199x1(Long.valueOf(System.currentTimeMillis()), new Throwable().getStackTrace()[2].getMethodName());
        try {
            EvaluationResult createEvaluationResult = ModelFactory.getInstance().createEvaluationResult(str);
            if (createEvaluationResult != null) {
                x1Var.f32230b = System.currentTimeMillis();
                x1Var.f32232d = str;
                this.f30713e = createEvaluationResult.getNextEvaluationTime();
                if (createEvaluationResult.getEngagementId() != null) {
                    Locale locale = Locale.US;
                    C10735b4.m39109b(String.format(locale, "[%d] - [%d] success: Calling InterceptProducer - with engagement id: %s", new Object[]{Long.valueOf(x1Var.f32229a), Long.valueOf(x1Var.f32230b), createEvaluationResult.getEngagementId()}));
                    this.f30711c = true;
                    C10827g3.m39512d().mo28345b(createEvaluationResult.getEngagementId(), createEvaluationResult.getEngagementType(), System.currentTimeMillis());
                } else if (this.f30713e != null) {
                    Locale locale2 = Locale.US;
                    C10735b4.m39109b(String.format(locale2, "[%d] - [%d] success: Calling evaluate with timestamp %d", new Object[]{Long.valueOf(x1Var.f32229a), Long.valueOf(x1Var.f32230b), this.f30713e}));
                    m39141j();
                }
                m39132a(createEvaluationResult.getEngagementId(), str, this.f30718j);
                this.f30716h.add(x1Var);
                m39136d();
                return;
            }
            throw new Exception("Parsing result failed");
        } catch (Exception e) {
            x1Var.f32230b = System.currentTimeMillis();
            x1Var.f32232d = e.getMessage();
            Locale locale3 = Locale.US;
            C10735b4.m39111c(String.format(locale3, "[%d] - [%d] failure: Evaluate crashed with exception. Message : %s", new Object[]{Long.valueOf(x1Var.f32229a), Long.valueOf(x1Var.f32230b), x1Var.f32232d}));
        } catch (Throwable th) {
            this.f30716h.add(x1Var);
            m39136d();
            throw th;
        }
    }

    /* renamed from: a */
    private void m39132a(String str, String str2, C11209y1.C11211b bVar) {
        C11013n2 c = C11138v2.m40821f().mo29070c(str);
        AnalyticsBridge instance = AnalyticsBridge.getInstance();
        long j = this.f30709a;
        long currentTimeMillis = System.currentTimeMillis();
        if (c == null) {
            str = null;
        }
        instance.reportTargetEvaluatorEvent(j, currentTimeMillis, str, c != null ? c.mo28796c() : null, str2, bVar.name());
    }

    /* renamed from: a */
    public void mo28133a(boolean z) {
        this.f30720l = z;
    }

    /* renamed from: a */
    public void mo28134a(boolean z, boolean z2) {
        this.f30717i = z;
        this.f30720l = z2;
    }
}
