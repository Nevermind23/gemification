package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C1505h;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p091g6.C6241n;
import p091g6.C6249v;

@KeepName
public class SignInHubActivity extends C1505h {

    /* renamed from: s */
    private static boolean f12196s = false;

    /* renamed from: n */
    private boolean f12197n = false;

    /* renamed from: o */
    private SignInConfiguration f12198o;

    /* renamed from: p */
    private boolean f12199p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f12200q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Intent f12201r;

    /* renamed from: O0 */
    private final void m14428O0() {
        getSupportLoaderManager().mo4962c(0, (Bundle) null, new C3829b(this, (C6249v) null));
        f12196s = false;
    }

    /* renamed from: P0 */
    private final void m14429P0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f12196s = false;
    }

    /* renamed from: Q0 */
    private final void m14430Q0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f12198o);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f12197n = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m14429P0(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f12197n) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo11793v() != null) {
                        GoogleSignInAccount v = signInAccount.mo11793v();
                        C6241n a = C6241n.m24801a(this);
                        GoogleSignInOptions v2 = this.f12198o.mo11809v();
                        v.getClass();
                        a.mo19855c(v2, v);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", v);
                        this.f12199p = true;
                        this.f12200q = i2;
                        this.f12201r = intent;
                        m14428O0();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m14429P0(intExtra);
                        return;
                    }
                }
                m14429P0(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m14429P0(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f12198o = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f12199p = z;
                if (z) {
                    this.f12200q = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.f12201r = intent2;
                    m14428O0();
                }
            } else if (f12196s) {
                setResult(0);
                m14429P0(12502);
            } else {
                f12196s = true;
                m14430Q0(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f12196s = false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f12199p);
        if (this.f12199p) {
            bundle.putInt("signInResultCode", this.f12200q);
            bundle.putParcelable("signInResultData", this.f12201r);
        }
    }
}
