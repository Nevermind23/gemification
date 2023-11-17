package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30671l0;
import a81.C30684m0;
import a81.C30697n0;
import a81.C30710o0;
import a81.C30723p0;
import a81.C30736q0;
import a81.C30749r0;
import a81.C30762s0;
import a81.C30775t0;
import a81.C30788u0;
import a81.C30801v0;
import a81.C30814w0;
import a81.C30827x0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import androidx.appcompat.app.C0238h;
import e51.C31663a;
import j51.C36745q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p341ge.bog.mobilebank.shared2.environment.C34676e;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p420fh.C12910e;
import p90.C27254b0;
import q31.C38125h;
import x01.C39765a;

/* renamed from: ge.bog.mobilebank.ui.activities.DebugSettingsActivity */
public class DebugSettingsActivity extends C35475q {

    /* renamed from: G */
    private C27254b0 f84836G;

    /* renamed from: H */
    C36745q f84837H;

    /* renamed from: I */
    protected PreferencesApiManager f84838I;

    /* renamed from: J */
    protected C34676e f84839J;

    /* renamed from: K */
    protected TargetEnvironment f84840K;

    /* renamed from: L */
    protected C31663a f84841L;

    /* renamed from: M */
    protected C39765a f84842M;

    /* renamed from: N */
    private int f84843N;

    /* renamed from: O */
    private boolean f84844O;

    /* renamed from: P */
    private boolean f84845P;

    /* renamed from: ge.bog.mobilebank.ui.activities.DebugSettingsActivity$a */
    static /* synthetic */ class C35185a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84846a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ge.bog.mobilebank.rest.model.DarkModeType[] r0 = p341ge.bog.mobilebank.rest.model.DarkModeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84846a = r0
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84846a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f84846a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.rest.model.DarkModeType r1 = p341ge.bog.mobilebank.rest.model.DarkModeType.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.DebugSettingsActivity.C35185a.<clinit>():void");
        }
    }

    /* renamed from: P2 */
    private EnvironmentType m103511P2() {
        return EnvironmentType.valueOf(this.f84836G.f68360v.getSelectedItem().toString());
    }

    /* renamed from: Q2 */
    private String m103512Q2() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            return packageInfo.versionName + " (" + packageInfo.versionCode + ")";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m103513R2(View view) {
        if (this.f84843N != this.f84836G.f68360v.getSelectedItemPosition()) {
            this.f84837H.mo89569a();
            this.f84838I.resetUserRelatedData();
        }
        this.f84841L.mo72087b(m103511P2());
        this.f84838I.setHttpRequestLoggingEnabled(this.f84836G.f68356r.isChecked());
        this.f84838I.setAnalyticLoggingEnabled(this.f84836G.f68343e.isChecked());
        mo86430Z1();
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m103514S2(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m103515T2(C13310d dVar, int i, Button button) {
        m103527h3();
        C12910e.m48795m(dVar, "პრეფერენსები წაშლილია. აპლიკაცია გაითიშება " + i + " წამში");
        new Handler(Looper.getMainLooper()).postDelayed(new C35418i(this), ((long) i) * 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void m103517V2(View view) {
        mo86115O2();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m103518W2(View view) {
        mo86117f3();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m103519X2(View view) {
        mo86116e3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m103520Y2(View view) {
        m103526g3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m103521Z2(View view) {
        m103528i3();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m103522a3(View view) {
        m103533n3();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m103523b3(CompoundButton compoundButton, boolean z) {
        if (z) {
            m103529j3(DarkModeType.NONE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m103524c3(CompoundButton compoundButton, boolean z) {
        if (z) {
            m103529j3(DarkModeType.DARK);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m103525d3(CompoundButton compoundButton, boolean z) {
        if (z) {
            m103529j3(DarkModeType.AUTO);
        }
    }

    /* renamed from: g3 */
    private void m103526g3() {
        this.f84838I.clearHttpLogging();
        this.f84841L.mo72087b((EnvironmentType) null);
        m103532m3();
    }

    /* renamed from: h3 */
    private void m103527h3() {
        this.f84838I.clearAllData();
        this.f84838I.setTermsAccepted(true);
        this.f84841L.mo72087b(m103511P2());
        this.f84838I.setHttpRequestLoggingEnabled(this.f84836G.f68356r.isChecked());
        this.f84838I.setAnalyticLoggingEnabled(this.f84836G.f68343e.isChecked());
    }

    /* renamed from: i3 */
    private void m103528i3() {
        this.f84842M.mo93506a("6.3.9");
    }

    /* renamed from: j3 */
    private void m103529j3(DarkModeType darkModeType) {
        this.f84838I.setDarkModeType(darkModeType);
        C0238h.m789O(darkModeType.getValue());
    }

    /* renamed from: k3 */
    private void m103530k3() {
        this.f84836G.f68355q.setOnClickListener(new C30736q0(this));
        this.f84836G.f68344f.setOnClickListener(new C30749r0(this));
        this.f84836G.f68358t.setOnClickListener(new C30762s0(this));
        this.f84836G.f68357s.setOnClickListener(new C30775t0(this));
        this.f84836G.f68359u.setOnClickListener(new C30788u0(this));
        this.f84836G.f68361w.setOnClickListener(new C30801v0(this));
    }

    /* renamed from: l3 */
    private void m103531l3() {
        int i = C35185a.f84846a[this.f84838I.getDarkModeType().ordinal()];
        if (i == 1) {
            this.f84836G.f68351m.setChecked(true);
        } else if (i == 2) {
            this.f84836G.f68350l.setChecked(true);
        } else if (i == 3) {
            this.f84836G.f68353o.setChecked(true);
        }
        this.f84836G.f68351m.setOnCheckedChangeListener(new C30814w0(this));
        this.f84836G.f68350l.setOnCheckedChangeListener(new C30827x0(this));
        this.f84836G.f68353o.setOnCheckedChangeListener(new C30684m0(this));
    }

    /* renamed from: m3 */
    private void m103532m3() {
        List asList = Arrays.asList(this.f84839J.mo84672h());
        Collections.sort(asList);
        this.f84836G.f68360v.setAdapter(new ArrayAdapter(this, 17367049, asList));
        int indexOf = asList.indexOf(this.f84840K.getType().name());
        if (indexOf == -1) {
            indexOf = 0;
        }
        this.f84836G.f68360v.setSelection(indexOf);
        this.f84836G.f68356r.setChecked(this.f84838I.isHttpRequestsLoggingEnabled());
        this.f84836G.f68343e.setChecked(this.f84838I.isAnalyticLoggingEnabled());
        this.f84836G.f68345g.setText("release");
        this.f84836G.f68362x.setText(m103512Q2());
        m103531l3();
    }

    /* renamed from: n3 */
    private void m103533n3() {
        this.f84838I.clearHiddenOffers();
    }

    /* renamed from: o3 */
    public static void m103534o3(Context context) {
        context.startActivity(new Intent(context, DebugSettingsActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27254b0 d = C27254b0.m84314d(getLayoutInflater());
        this.f84836G = d;
        setContentView((View) d.mo3946b());
        setSupportActionBar(this.f84836G.f68354p);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo565s(true);
        }
        m103530k3();
        m103532m3();
        this.f84843N = this.f84836G.f68360v.getSelectedItemPosition();
        this.f84844O = this.f84836G.f68356r.isChecked();
        this.f84845P = this.f84836G.f68343e.isChecked();
        if (this.f84838I.isDebugThemeSet()) {
            int debugTheme = this.f84838I.getDebugTheme();
            if (debugTheme == 1) {
                this.f84836G.f68348j.setChecked(true);
            } else if (debugTheme != 2) {
                this.f84836G.f68347i.setChecked(true);
            } else {
                this.f84836G.f68349k.setChecked(true);
            }
        } else {
            this.f84836G.f68346h.setChecked(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O2 */
    public void mo86115O2() {
        C38125h.m112238c(this).mo91581V0().mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e3 */
    public void mo86116e3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2("პრეფერენსების გასუფთავება");
        dVar.mo35646Z1("გასუფთავება");
        dVar.mo35642U1("დახურვა");
        dVar.mo35645Y1(new C30697n0(this, dVar, 1));
        dVar.mo35641T1(new C30710o0(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f3 */
    public void mo86117f3() {
        if (this.f84836G.f68347i.isChecked()) {
            this.f84838I.setDebugTheme(0);
        } else if (this.f84836G.f68348j.isChecked()) {
            this.f84838I.setDebugTheme(1);
        } else if (this.f84836G.f68349k.isChecked()) {
            this.f84838I.setDebugTheme(2);
        } else {
            this.f84838I.removeDebugThemeMode();
        }
        mo86430Z1();
    }

    public void onBackPressed() {
        if (this.f84843N == this.f84836G.f68360v.getSelectedItemPosition() && this.f84844O == this.f84836G.f68356r.isChecked() && this.f84845P == this.f84836G.f68343e.isChecked()) {
            super.onBackPressed();
            return;
        }
        mo86437j2("პარამეტრების ცვლილება", "ცვლილებების შესანახად აპლიკაცია უნდა გადაიტვითოს", "SAVE", "CANCEL", new C30671l0(this), new C30723p0(this), true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
