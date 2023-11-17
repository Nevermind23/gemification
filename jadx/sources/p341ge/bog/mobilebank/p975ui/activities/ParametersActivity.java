package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30527a8;
import a81.C30541b8;
import a81.C30555c8;
import a81.C30569d8;
import a81.C30583e8;
import a81.C30597f8;
import a81.C30611g8;
import a81.C30625h8;
import a81.C30639i8;
import a81.C30653j8;
import a81.C30666k8;
import a81.C30679l8;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32303f;
import gd1.C40992a;
import iu0.C36546y;
import java.util.Timer;
import java.util.TimerTask;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10328q;
import p872qv.C27866a;
import p90.C27305g1;
import q31.C38125h;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.ParametersActivity */
public class ParametersActivity extends C35348b0 {

    /* renamed from: G */
    private C27305g1 f85240G;

    /* renamed from: H */
    private int f85241H;

    /* renamed from: I */
    private Timer f85242I;

    /* renamed from: J */
    C27866a f85243J;

    /* renamed from: K */
    protected RootBankApiManager f85244K;

    /* renamed from: L */
    protected Client f85245L;

    /* renamed from: M */
    protected PreferencesApiManager f85246M;

    /* renamed from: ge.bog.mobilebank.ui.activities.ParametersActivity$a */
    class C35287a extends TimerTask {
        C35287a() {
        }

        public void run() {
            ParametersActivity.this.m104491R2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public void m104491R2() {
        Timer timer = this.f85242I;
        if (timer != null) {
            timer.cancel();
            this.f85242I = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m104492T2(View view) {
        mo86309l3();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public /* synthetic */ void m104493U2(View view) {
        mo86310m3();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void m104494V2(View view) {
        mo86304g3();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m104495W2(View view) {
        mo86302S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m104496X2(View view) {
        mo86311n3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m104497Y2(View view) {
        mo86303f3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m104498Z2(View view) {
        mo86307j3();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m104499a3(View view) {
        mo86308k3();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m104500b3(View view) {
        mo86306i3();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m104501c3(View view) {
        mo86305h3();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m104502d3(String str) {
        if (str.equals(ProductType.PRODUCT_STATUS_APPROVED)) {
            this.f85240G.f68769p.mo53595c();
        } else {
            this.f85240G.f68769p.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public /* synthetic */ void m104503e3(Throwable th) {
        this.f85240G.f68769p.setVisibility(8);
        mo74709H1(th);
    }

    /* renamed from: o3 */
    private void m104504o3() {
        this.f85240G.f68760g.setOnClickListener(new C30583e8(this));
        this.f85240G.f68766m.setOnClickListener(new C30597f8(this));
        this.f85240G.f68778y.setOnClickListener(new C30611g8(this));
        this.f85240G.f68759f.setOnClickListener(new C30625h8(this));
        this.f85240G.f68753C.setOnClickListener(new C30639i8(this));
        this.f85240G.f68755E.setOnClickListener(new C30653j8(this));
        this.f85240G.f68776w.setOnClickListener(new C30666k8(this));
        this.f85240G.f68770q.setOnClickListener(new C30679l8(this));
        this.f85240G.f68773t.setOnClickListener(new C30541b8(this));
        this.f85240G.f68758e.setOnClickListener(new C30555c8(this));
    }

    /* renamed from: p3 */
    private void m104505p3() {
        this.f85240G.f68769p.mo53597e();
        mo86438k1(this.f85243J.mo67399a().mo95075O().mo95027o0(C40992a.m118827a()).mo94983G0(new C30527a8(this), new C30569d8(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27305g1 d = C27305g1.m84525d(getLayoutInflater());
        this.f85240G = d;
        super.mo70996D2(bundle, d);
        this.f85240G.f68751A.setVisibility(8);
        this.f85240G.f68772s.setText(this.f85246M.getLanguage().mo90433b());
        this.f85240G.f68774u.setText(C27950a.m86284a("text.georgian.pension.funds.settings.title"));
        m104504o3();
        if (!this.f85245L.isAuthorized()) {
            this.f85240G.f68766m.setVisibility(0);
            this.f85240G.f68753C.setVisibility(0);
            this.f85240G.f68752B.setVisibility(8);
            this.f85240G.f68760g.setVisibility(8);
            this.f85240G.f68759f.setVisibility(8);
            this.f85240G.f68755E.setVisibility(8);
            this.f85240G.f68776w.setVisibility(8);
            this.f85240G.f68769p.setVisibility(8);
            return;
        }
        this.f85240G.f68760g.setVisibility(0);
        this.f85240G.f68766m.setVisibility(0);
        this.f85240G.f68776w.setVisibility(0);
        this.f85240G.f68759f.setVisibility(0);
        this.f85240G.f68753C.setVisibility(8);
        this.f85240G.f68752B.setVisibility(0);
        this.f85240G.f68755E.setVisibility(0);
        m104505p3();
    }

    /* renamed from: S2 */
    public void mo86302S2() {
        C36546y.m108282F().mo27152s("settings", "change_language", "open_page");
        C38125h.m112238c(this).mo91573R0(this);
    }

    /* renamed from: f3 */
    public void mo86303f3() {
        if (this.f85245L.isAuthorized()) {
            C36546y.m108282F().mo27152s("settings", "account_mngmt", "open_page");
            startActivity(new Intent(this, ManageAccountsAndCardsActivity.class));
        }
    }

    /* renamed from: g3 */
    public void mo86304g3() {
        if (this.f85245L.isAuthorized()) {
            C36546y.m108282F().mo27152s("settings", "security_settings", "open_page");
            SecuritySettingsActivity.m73086F2(this, (String) null);
        }
    }

    /* renamed from: h3 */
    public void mo86305h3() {
        if (this.f85245L.isAuthorized()) {
            C36546y.m108282F().mo27152s("settings", "investment_account_mngmt", "open_page");
            C36546y.m108282F().mo27152s("GT", "management", "click");
            C38125h.m112238c(this).mo91638x(this);
        }
    }

    /* renamed from: i3 */
    public void mo86306i3() {
        if (this.f85245L.isAuthorized()) {
            C36546y.m108282F().mo27152s("settings", "pension_funds", "open_page");
            startActivity(new Intent(this, ManagePensionFundsActivity.class));
        }
    }

    /* renamed from: j3 */
    public void mo86307j3() {
        if (this.f85245L.isAuthorized()) {
            mo86303f3();
            return;
        }
        C36546y.m108282F().mo27152s("settings", "saved_cards", "open_page");
        startActivity(new Intent(this, SavedCardsActivity.class));
    }

    /* renamed from: k3 */
    public void mo86308k3() {
        C36546y.m108282F().mo27152s("settings", "sms_and_push_settings", "open_page");
        startActivity(new Intent(this, SmsNotifManagerActivity.class));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l3 */
    public void mo86309l3() {
        if (this.f85242I == null) {
            this.f85241H = 0;
            Timer timer = new Timer();
            this.f85242I = timer;
            timer.schedule(new C35287a(), 8000);
        } else if (this.f85241H >= 5) {
            m104491R2();
            return;
        }
        this.f85241H++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m3 */
    public void mo86310m3() {
        if (this.f85242I != null) {
            int i = this.f85241H;
            if (i < 5 || i >= 8) {
                m104491R2();
                return;
            }
            int i2 = i + 1;
            this.f85241H = i2;
            if (i2 == 8) {
                mo86447x2(DebugSettingsActivity.class);
                m104491R2();
            }
        }
    }

    /* renamed from: n3 */
    public void mo86311n3() {
        C36546y.m108282F().mo27152s("settings", "privacy_policy", "open_page");
        C32303f.m95183C(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.f28960k5);
    }
}
