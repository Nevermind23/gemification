package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.ArrayList;

class MedalliaWebView extends WebView implements C10996m2 {
    protected static final int DEFAULT_FORM_FONT_ZOOM = 100;
    protected static final String JS_COMMUNICATOR_NAME = "NebulaAndroid";
    private boolean blockNetworkInForm = true;
    private BaseFormCommunicator formCommunicator;
    private C10996m2 formCommunicatorListener;
    /* access modifiers changed from: private */
    public C11013n2 formData;
    private String formJsonFileLocalUrl;
    private String formJsonQueryParams;
    private C11085s2 formPreviewData;
    private boolean isFeedbackSubmitIndicatorEnabled;
    private boolean isNewLiveFormEnable = false;
    private boolean isPinchGestureEnabled = false;
    /* access modifiers changed from: private */
    public boolean isPreviewApp;
    /* access modifiers changed from: private */
    public boolean isRenderFinished = false;
    /* access modifiers changed from: private */
    public C10704e listener;
    /* access modifiers changed from: private */
    public long loadingTime;
    private C11238z3 localizationContract;
    private int maxFontSize;
    private C11099t4 mediaCaptureConfiguration;
    private int minFontSize;
    private String preloadFormJsonFileLocalUrl;
    private ArrayList<String> redirectLinks = new ArrayList<>();
    /* access modifiers changed from: private */
    public int reloadingNumber = 1;
    private C10705f type;
    private final long webViewId;

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$a */
    class C10700a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f30581a;

        C10700a(String str) {
            this.f30581a = str;
        }

        public void run() {
            MedalliaWebView.this.loadUrl(this.f30581a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$b */
    class C10701b extends C11067q4 {
        C10701b(C11013n2 n2Var, boolean z, ArrayList arrayList) {
            super(n2Var, z, arrayList);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null) {
                try {
                    if (!str.equals("about:blank")) {
                        if (MedalliaWebView.this.listener != null) {
                            MedalliaWebView.this.listener.mo27923b();
                        }
                        MedalliaWebView.this.setVisibility(0);
                        boolean unused = MedalliaWebView.this.isRenderFinished = true;
                        long unused2 = MedalliaWebView.this.loadingTime = System.currentTimeMillis() - MedalliaWebView.this.loadingTime;
                        if (!MedalliaWebView.this.isPreviewApp) {
                            AnalyticsBridge.getInstance().reportFormLoadedEvent(MedalliaWebView.this.formData.getFormId(), MedalliaWebView.this.formData.getFormType(), MedalliaWebView.this.loadingTime, MedalliaWebView.this.formData.getFormViewType(), MedalliaWebView.this.isPreload(), MedalliaWebView.this.reloadingNumber);
                        }
                        MedalliaWebView.access$508(MedalliaWebView.this);
                    }
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$c */
    class C10702c extends WebChromeClient {
        C10702c() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$d */
    class C10703d extends C11033o4 {
        C10703d() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (MedalliaWebView.this.formData != null) {
                MedalliaWebView.this.evaluateJavascript("(function(){NebulaForm.show({\"triggerType\": \"" + MedalliaWebView.this.formData.getFormType() + "\"}); })();", (ValueCallback) null);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$e */
    protected interface C10704e {
        /* renamed from: a */
        void mo27922a();

        /* renamed from: b */
        void mo27923b();
    }

    /* renamed from: com.medallia.digital.mobilesdk.MedalliaWebView$f */
    enum C10705f {
        showForm,
        invitationProducer,
        preload,
        preview
    }

    protected MedalliaWebView(Context context, C10705f fVar, C11013n2 n2Var, long j) {
        super(context);
        this.type = fVar;
        this.webViewId = j;
        this.formData = n2Var;
        this.blockNetworkInForm = n2Var.mo28823k();
        this.redirectLinks = n2Var.mo28801e();
    }

    static /* synthetic */ int access$508(MedalliaWebView medalliaWebView) {
        int i = medalliaWebView.reloadingNumber;
        medalliaWebView.reloadingNumber = i + 1;
        return i;
    }

    private String appendQueryParams(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.contains("?")) {
            try {
                sb.append(str2);
                sb.append("=");
                sb.append(URLEncoder.encode("../" + str3, "UTF-8"));
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        } else {
            sb.append("?");
            sb.append(str2);
            sb.append("=");
            sb.append(URLEncoder.encode("../" + str3, "UTF-8"));
        }
        return sb.toString();
    }

    private void invokeFormShow() {
        C10703d dVar = new C10703d();
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(dVar);
        } catch (Exception e) {
            C10735b4.m39111c("FormId: " + this.formData.getFormId() + " failed to showForm " + e.getMessage());
            new Handler(Looper.getMainLooper()).post(dVar);
        }
    }

    public void clearAndDestroy() {
        removeJavascriptInterface(JS_COMMUNICATOR_NAME);
        loadUrl("about:blank");
        stopLoading();
        clearHistory();
        removeAllViews();
        destroyDrawingCache();
        destroy();
    }

    public BaseFormCommunicator getFormCommunicator() {
        return this.formCommunicator;
    }

    /* access modifiers changed from: protected */
    public C11013n2 getFormData() {
        return this.formData;
    }

    /* access modifiers changed from: protected */
    public String getLoadedFormId() {
        C11013n2 n2Var = this.formData;
        if (n2Var == null) {
            return null;
        }
        return n2Var.getFormId();
    }

    /* access modifiers changed from: protected */
    public long getLoadingTime() {
        return this.loadingTime;
    }

    /* access modifiers changed from: protected */
    public int getTextZoomFontSize() {
        int i;
        int i2;
        if (!this.isNewLiveFormEnable || (i = this.minFontSize) <= 0 || (i2 = this.maxFontSize) <= 0) {
            return 100;
        }
        return Math.max(i, Math.min(i2, getSettings().getTextZoom()));
    }

    /* access modifiers changed from: protected */
    public long getWebViewId() {
        return this.webViewId;
    }

    /* access modifiers changed from: protected */
    public C10705f getWebViewType() {
        return this.type;
    }

    /* access modifiers changed from: protected */
    public boolean isPreload() {
        C11013n2 n2Var = this.formData;
        return n2Var != null && n2Var.mo28824l();
    }

    /* access modifiers changed from: protected */
    public boolean isRenderFinished() {
        return this.isRenderFinished;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.medallia.digital.mobilesdk.BaseFormCommunicator] */
    /* JADX WARNING: type inference failed for: r0v35, types: [com.medallia.digital.mobilesdk.FormCommunicator] */
    /* JADX WARNING: type inference failed for: r0v36, types: [com.medallia.digital.mobilesdk.FormCommunicatorPreviews] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load(com.medallia.digital.mobilesdk.MedalliaWebView.C10704e r11) {
        /*
            r10 = this;
            r10.listener = r11
            com.medallia.digital.mobilesdk.n2 r0 = r10.formData
            if (r0 == 0) goto L_0x0115
            r7 = 0
            r10.isRenderFinished = r7
            r0 = 8
            r10.setVisibility(r0)
            r10.clearCache(r7)
            android.webkit.WebChromeClient r0 = new android.webkit.WebChromeClient
            r0.<init>()
            r10.setWebChromeClient(r0)
            android.webkit.WebSettings r0 = r10.getSettings()
            r8 = 1
            r0.setJavaScriptEnabled(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setNeedInitialFocus(r7)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setAppCacheEnabled(r7)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setAllowFileAccess(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r1 = 2
            r0.setCacheMode(r1)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setDomStorageEnabled(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setSupportZoom(r7)
            android.webkit.WebSettings r0 = r10.getSettings()
            int r1 = r10.getTextZoomFontSize()
            r0.setTextZoom(r1)
            boolean r0 = r10.isPinchGestureEnabled
            if (r0 == 0) goto L_0x0070
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setSupportZoom(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setBuiltInZoomControls(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setDisplayZoomControls(r7)
        L_0x0070:
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setJavaScriptCanOpenWindowsAutomatically(r8)
            android.webkit.WebSettings r0 = r10.getSettings()
            r0.setAllowUniversalAccessFromFileURLs(r8)
            com.medallia.digital.mobilesdk.MedalliaWebView$b r0 = new com.medallia.digital.mobilesdk.MedalliaWebView$b
            com.medallia.digital.mobilesdk.n2 r1 = r10.formData
            boolean r2 = r10.blockNetworkInForm
            java.util.ArrayList<java.lang.String> r3 = r10.redirectLinks
            r0.<init>(r1, r2, r3)
            r10.setWebViewClient(r0)
            com.medallia.digital.mobilesdk.MedalliaWebView$c r0 = new com.medallia.digital.mobilesdk.MedalliaWebView$c
            r0.<init>()
            r10.setWebChromeClient(r0)
            boolean r0 = r10.isPreviewApp
            if (r0 == 0) goto L_0x00a9
            com.medallia.digital.mobilesdk.FormCommunicatorPreviews r9 = new com.medallia.digital.mobilesdk.FormCommunicatorPreviews
            com.medallia.digital.mobilesdk.n2 r1 = r10.formData
            com.medallia.digital.mobilesdk.s2 r3 = r10.formPreviewData
            com.medallia.digital.mobilesdk.t4 r5 = r10.mediaCaptureConfiguration
            boolean r6 = r10.isFeedbackSubmitIndicatorEnabled
            r2 = 0
            r0 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x00d8
        L_0x00a9:
            com.medallia.digital.mobilesdk.FormCommunicator r9 = new com.medallia.digital.mobilesdk.FormCommunicator
            com.medallia.digital.mobilesdk.n2 r0 = r10.formData
            java.lang.String r1 = r0.getFormId()
            com.medallia.digital.mobilesdk.n2 r0 = r10.formData
            com.medallia.digital.mobilesdk.FormTriggerType r3 = r0.getFormType()
            com.medallia.digital.mobilesdk.n2 r0 = r10.formData
            com.medallia.digital.mobilesdk.FormViewType r4 = r0.getFormViewType()
            com.medallia.digital.mobilesdk.z3 r5 = r10.localizationContract
            com.medallia.digital.mobilesdk.y0 r0 = com.medallia.digital.mobilesdk.C11208y0.m41106c()
            com.medallia.digital.mobilesdk.ConfigurationContract r0 = r0.mo29204a()
            com.medallia.digital.mobilesdk.SDKConfigurationContract r0 = r0.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r0 = r0.getMedalliaDigitalBrain()
            boolean r6 = r0.isFeedbackSubmitIndicatorEnabled()
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x00d8:
            r10.formCommunicator = r9
            com.medallia.digital.mobilesdk.BaseFormCommunicator r0 = r10.formCommunicator
            java.lang.String r1 = "NebulaAndroid"
            r10.addJavascriptInterface(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.medallia.digital.mobilesdk.n2 r1 = r10.formData
            java.lang.String r1 = r1.mo28805g()
            r0[r7] = r1
            java.lang.String r1 = "file:///%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = r10.formJsonQueryParams
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x010c
            java.lang.String r1 = r10.formJsonQueryParams
            com.medallia.digital.mobilesdk.n2 r2 = r10.formData
            boolean r2 = r2.mo28824l()
            if (r2 == 0) goto L_0x0106
            java.lang.String r2 = r10.preloadFormJsonFileLocalUrl
            goto L_0x0108
        L_0x0106:
            java.lang.String r2 = r10.formJsonFileLocalUrl
        L_0x0108:
            java.lang.String r0 = r10.appendQueryParams(r0, r1, r2)
        L_0x010c:
            r10.loadUrl(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r10.loadingTime = r0
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.MedalliaWebView.load(com.medallia.digital.mobilesdk.MedalliaWebView$e):void");
    }

    public void mediaCaptureResult(String str) {
        C10735b4.m39113e("Response from SDK to LiveForm " + str);
        post(new C10700a(str));
    }

    public void onClose() {
        if (!isPreload()) {
            this.formData = null;
        }
        C10996m2 m2Var = this.formCommunicatorListener;
        if (m2Var != null) {
            m2Var.onClose();
        }
    }

    public void onReady() {
        invokeFormShow();
        C10996m2 m2Var = this.formCommunicatorListener;
        if (m2Var != null) {
            m2Var.onReady();
        }
        C10704e eVar = this.listener;
        if (eVar != null) {
            eVar.mo27922a();
        }
    }

    /* access modifiers changed from: protected */
    public void reloadWebView() {
        if (isPreload()) {
            this.loadingTime = System.currentTimeMillis();
            setVisibility(8);
            clearCache(false);
            reload();
        }
    }

    /* access modifiers changed from: protected */
    public void setConfiguration(ConfigurationContract configurationContract) {
        if (configurationContract != null && configurationContract.getPropertyConfiguration() != null && configurationContract.getSdkConfiguration() != null) {
            this.formJsonQueryParams = configurationContract.getPropertyConfiguration().getFormFileLocationQueryParam();
            this.preloadFormJsonFileLocalUrl = configurationContract.getPropertyConfiguration().getPreloadFormJsonFileLocalUrl();
            this.formJsonFileLocalUrl = configurationContract.getPropertyConfiguration().getFormJsonFileLocalUrl();
            this.localizationContract = configurationContract.getLocalization();
            this.isNewLiveFormEnable = configurationContract.getPropertyConfiguration().isNewLiveFormEnable();
            FormConfigurations formConfigurations = configurationContract.getSdkConfiguration().getFormConfigurations();
            if (formConfigurations != null) {
                if (formConfigurations.getRedirectLinks() != null) {
                    this.redirectLinks = formConfigurations.getRedirectLinks();
                }
                this.isPinchGestureEnabled = formConfigurations.isPinchGestureEnabled();
                this.minFontSize = formConfigurations.getMinFontSize();
                this.maxFontSize = formConfigurations.getMaxFontSize();
            }
            MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig();
            if (medalliaDigitalClientConfig != null && medalliaDigitalClientConfig.getBlockNetworkInForm() != null) {
                this.blockNetworkInForm = medalliaDigitalClientConfig.getBlockNetworkInForm().booleanValue();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setFormCommunicatorListener(C10996m2 m2Var) {
        this.formCommunicatorListener = m2Var;
    }

    /* access modifiers changed from: protected */
    public void setLoadingListener(C10704e eVar) {
        this.listener = eVar;
    }

    public void setType(C10705f fVar) {
        this.type = fVar;
    }

    protected MedalliaWebView(Context context, boolean z, C11085s2 s2Var, C10705f fVar, C11013n2 n2Var, long j, C11099t4 t4Var, boolean z2, boolean z3, int i, int i2, boolean z4) {
        super(context);
        this.type = fVar;
        this.webViewId = j;
        this.formData = n2Var;
        this.isPreviewApp = z;
        this.formPreviewData = s2Var;
        this.blockNetworkInForm = n2Var.mo28823k();
        this.redirectLinks = n2Var.mo28801e();
        this.mediaCaptureConfiguration = t4Var;
        this.isPinchGestureEnabled = z2;
        this.isNewLiveFormEnable = z3;
        this.minFontSize = i;
        this.maxFontSize = i2;
        this.isFeedbackSubmitIndicatorEnabled = z4;
    }
}
