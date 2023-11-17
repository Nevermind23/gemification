package com.medallia.digital.mobilesdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.C0218d;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.g0 */
abstract class C10820g0 extends C0218d implements C10996m2, MedalliaWebView.C10704e {

    /* renamed from: a */
    protected C11013n2 f30976a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f30977b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f30978c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f30979d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MedalliaWebView f30980e;

    /* renamed from: f */
    private long f30981f;

    /* renamed from: g */
    boolean f30982g;

    /* renamed from: h */
    C10984l5 f30983h;

    /* renamed from: i */
    private BaseFormCommunicator f30984i;

    /* renamed from: j */
    private Handler f30985j = new Handler();

    /* renamed from: k */
    private C11033o4 f30986k = new C10821a();

    /* renamed from: com.medallia.digital.mobilesdk.g0$a */
    class C10821a extends C11033o4 {
        C10821a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (!C10820g0.this.f30980e.isRenderFinished() && !C10820g0.this.isFinishing()) {
                if (!C10820g0.this.f30982g) {
                    AnalyticsBridge.getInstance().reportFormLoadSpinnerEvent(C10820g0.this.f30976a.getFormId(), Long.valueOf(C10820g0.this.f30979d), C10820g0.this.f30976a.getFormViewType(), C10820g0.this.f30976a.getFormType());
                }
                C10820g0.this.m39471a(true);
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g0$b */
    class C10822b extends C11033o4 {
        C10822b() {
        }

        /* renamed from: a */
        public void mo27617a() {
            boolean unused = C10820g0.this.f30977b = false;
            C10820g0.this.mo28326e();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g0$c */
    class C10823c extends C11033o4 {
        C10823c() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10820g0.this.m39471a(false);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g0$d */
    class C10824d extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ C10820g0 f30990a;

        C10824d(C10820g0 g0Var) {
            this.f30990a = g0Var;
        }

        /* renamed from: a */
        public void mo27617a() {
            C10820g0.this.f30980e.setFormCommunicatorListener(this.f30990a);
            C10820g0.this.f30980e.setLoadingListener(this.f30990a);
            if (C10820g0.this.f30980e.isRenderFinished()) {
                C10820g0.this.m39471a(false);
            }
            C10820g0.this.f30980e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            if (C10820g0.this.f30980e.getParent() != null) {
                ((ViewGroup) C10820g0.this.f30980e.getParent()).removeView(C10820g0.this.f30980e);
            }
            ((RelativeLayout) C10820g0.this.findViewById(C10706R.C10708id.medallia_form_webview_layout)).addView(C10820g0.this.f30980e);
            if (C10820g0.this.f30980e.isRenderFinished()) {
                boolean unused = C10820g0.this.f30978c = true;
                C10820g0 g0Var = C10820g0.this;
                if (!g0Var.f30982g) {
                    g0Var.m39478g();
                }
            }
        }
    }

    C10820g0() {
    }

    /* renamed from: a */
    private MedalliaWebView.C10705f m39468a(C11013n2 n2Var, boolean z) {
        return n2Var.mo28824l() ? MedalliaWebView.C10705f.preload : z ? MedalliaWebView.C10705f.showForm : MedalliaWebView.C10705f.invitationProducer;
    }

    /* renamed from: c */
    private void m39474c() {
        runOnUiThread(new C10824d(this));
    }

    /* renamed from: d */
    private void m39477d() {
        if (this.f30976a != null) {
            C10735b4.m39113e("FormId: " + this.f30976a.getFormId() + " close was called");
            if (this.f30980e != null) {
                ((RelativeLayout) findViewById(C10706R.C10708id.medallia_form_webview_layout)).removeView(this.f30980e);
                if (this.f30980e.getParent() != null) {
                    ((ViewGroup) this.f30980e.getParent()).removeView(this.f30980e);
                }
                C11007m8.m40311b().mo28770a(this.f30980e);
            }
            if (!this.f30982g) {
                if (!this.f30978c) {
                    m39478g();
                }
                if (this.f30977b) {
                    Broadcasts.C10688d.m38941a(Broadcasts.C10688d.C10689a.formDismissed, this.f30976a.getFormId(), this.f30976a.getFormType(), this.f30976a.getFormViewType(), 0, C11221y3.m41127d().mo29215b(), this.f30976a.getFormLanguage(), (MDAppearanceMode) null, (MDAppearanceMode) null);
                } else if (this.f30976a.mo28819i().mo28377r()) {
                    return;
                }
                mo28327h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m39478g() {
        if (this.f30976a.isDarkModeEnabled()) {
            Broadcasts.C10688d.m38941a(Broadcasts.C10688d.C10689a.formDisplayed, this.f30976a.getFormId(), this.f30976a.getFormType(), this.f30976a.getFormViewType(), System.currentTimeMillis() - this.f30981f, C11221y3.m41127d().mo29215b(), this.f30976a.getFormLanguage(), C10986l7.m40219c().mo28706b(), C10986l7.m40219c().mo28703a());
        } else {
            Broadcasts.C10688d.m38941a(Broadcasts.C10688d.C10689a.formDisplayed, this.f30976a.getFormId(), this.f30976a.getFormType(), this.f30976a.getFormViewType(), System.currentTimeMillis() - this.f30981f, C11221y3.m41127d().mo29215b(), this.f30976a.getFormLanguage(), MDAppearanceMode.unknown, MDAppearanceMode.light);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28326e() {
        C11033o4 o4Var;
        Handler handler = this.f30985j;
        if (!(handler == null || (o4Var = this.f30986k) == null)) {
            handler.removeCallbacks(o4Var);
            this.f30985j.removeCallbacksAndMessages((Object) null);
            this.f30985j = null;
            this.f30986k = null;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo27924f();

    public void finish() {
        super.finish();
        C11097t2 b = C11091s7.m40686b(this.f30976a.mo28822j());
        overridePendingTransition(b.mo29001a(), b.mo29002b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo28327h() {
        Broadcasts.C10688d.m38941a(Broadcasts.C10688d.C10689a.formClosed, this.f30976a.getFormId(), this.f30976a.getFormType(), this.f30976a.getFormViewType(), -1, C11221y3.m41127d().mo29215b(), this.f30976a.getFormLanguage(), (MDAppearanceMode) null, (MDAppearanceMode) null);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            try {
                this.f30984i.handleVideoMediaCapture(intent);
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo28326e();
    }

    public void onClose() {
        runOnUiThread(new C10822b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C10984l5 l5Var;
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.medallia.digital.mobilesdk.form_data")) {
            mo28326e();
            return;
        }
        this.f30981f = System.currentTimeMillis();
        this.f30976a = (C11013n2) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_data");
        boolean booleanExtra = intent.getBooleanExtra("com.medallia.digital.mobilesdk.is_show_form", false);
        boolean booleanExtra2 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.form_is_preview_app", false);
        this.f30982g = booleanExtra2;
        if (booleanExtra2) {
            this.f30980e = C11007m8.m40311b().mo28774c(MedalliaWebView.C10705f.preview);
            l5Var = (C10984l5) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_header_palette");
        } else {
            this.f30980e = C11007m8.m40311b().mo28774c(m39468a(this.f30976a, booleanExtra));
            l5Var = C10986l7.m40219c().mo28704a(this.f30976a.getHeaderThemeName());
        }
        this.f30983h = l5Var;
        MedalliaWebView medalliaWebView = this.f30980e;
        if (medalliaWebView != null) {
            this.f30984i = medalliaWebView.getFormCommunicator();
        }
        boolean booleanExtra3 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.vuln_enabled", true);
        long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.spinner_delay", C10886i6.f31249d.longValue());
        this.f30979d = longExtra;
        if (booleanExtra) {
            this.f30985j.postDelayed(this.f30986k, longExtra);
        }
        setRequestedOrientation(intent.getBooleanExtra("com.medallia.digital.mobilesdk.inherit_orientation", false) ? 3 : 10);
        if (!this.f30982g && booleanExtra3 && getWindow() != null) {
            getWindow().addFlags(8192);
        }
        C11097t2 a = C11091s7.m40685a(this.f30976a.mo28822j());
        overridePendingTransition(a.mo29001a(), a.mo29002b());
        super.onCreate(bundle);
        mo27924f();
        m39474c();
    }

    public void onDestroy() {
        super.onDestroy();
        BaseFormCommunicator baseFormCommunicator = this.f30984i;
        if (!(baseFormCommunicator == null || baseFormCommunicator.getHasMediaData() || this.f30984i.getMediaData() == null)) {
            C10930k2.m39983c(this.f30984i.getMediaData().mo29139e());
        }
        if (isFinishing()) {
            m39477d();
            MedalliaWebView medalliaWebView = this.f30980e;
            if (medalliaWebView != null && medalliaWebView.isPreload()) {
                this.f30980e.reloadWebView();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaWebView medalliaWebView = this.f30980e;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener((C10996m2) null);
            this.f30980e.setLoadingListener((MedalliaWebView.C10704e) null);
        }
    }

    public void onReady() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            }
        }
        BaseFormCommunicator baseFormCommunicator = this.f30984i;
        if (baseFormCommunicator != null) {
            baseFormCommunicator.checkWhichPermissionsGranted(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaWebView medalliaWebView = this.f30980e;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener(this);
            this.f30980e.setLoadingListener(this);
        }
    }

    /* renamed from: b */
    public void mo27923b() {
        if (!this.f30978c) {
            this.f30978c = true;
            if (!this.f30982g) {
                m39478g();
            }
        }
    }

    /* renamed from: a */
    public void mo27922a() {
        runOnUiThread(new C10823c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39471a(boolean z) {
        findViewById(C10706R.C10708id.medallia_progress_bar).setVisibility(z ? 0 : 8);
    }
}
