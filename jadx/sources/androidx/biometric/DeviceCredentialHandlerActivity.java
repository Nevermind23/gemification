package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.C0218d;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.C1505h;

@SuppressLint({"SyntheticAccessor"})
public class DeviceCredentialHandlerActivity extends C0218d {

    /* renamed from: n */
    private boolean f2347n;

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo2430O0(int i) {
        C0579x f = C0579x.m2205f();
        if (f == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i == -1) {
            f.mo2465n(1);
            f.mo2464m(false);
            f.mo2467p();
        } else {
            f.mo2465n(2);
            f.mo2464m(false);
            f.mo2467p();
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo2430O0(i2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0579x e = C0579x.m2204e();
        boolean z = true;
        if (e.mo2455b() != 0) {
            setTheme(e.mo2455b());
            getTheme().applyStyle(C0552g0.TransparentStyle, true);
        }
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("did_change_configuration", false)) {
            z = false;
        }
        this.f2347n = z;
        if (!z) {
            e.mo2468q();
        } else {
            this.f2347n = false;
        }
        setTitle((CharSequence) null);
        setContentView(C0548e0.device_credential_handler_activity);
        if (e.mo2457d() == null || e.mo2454a() == null) {
            Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
            finish();
            return;
        }
        new BiometricPrompt((C1505h) this, e.mo2457d(), e.mo2454a()).mo2410s(new BiometricPrompt.C0537e(getIntent().getBundleExtra("prompt_info_bundle")));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C0579x f = C0579x.m2205f();
        if (isChangingConfigurations() && f != null) {
            f.mo2458g();
            this.f2347n = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.f2347n);
    }
}
