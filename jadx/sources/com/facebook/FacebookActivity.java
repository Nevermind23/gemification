package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.login.C2675e;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p090g5.C6227b;
import p258t4.C8365b;
import p258t4.C8366c;
import p271u4.C8570b;
import p297w4.C8769a0;
import p297w4.C8798g;
import p297w4.C8832s;
import p334z4.C9207a;

public class FacebookActivity extends C1505h {

    /* renamed from: o */
    public static String f8111o = "PassThrough";

    /* renamed from: p */
    private static String f8112p = "SingleFragment";

    /* renamed from: q */
    private static final String f8113q = "com.facebook.FacebookActivity";

    /* renamed from: n */
    private Fragment f8114n;

    /* renamed from: O0 */
    private void m9988O0() {
        setResult(0, C8832s.m32889m(getIntent(), (Bundle) null, C8832s.m32893q(C8832s.m32897u(getIntent()))));
        finish();
    }

    /* renamed from: M0 */
    public Fragment mo8154M0() {
        return this.f8114n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public Fragment mo8155N0() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment k0 = supportFragmentManager.mo4418k0(f8112p);
        if (k0 != null) {
            return k0;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C8798g gVar = new C8798g();
            gVar.setRetainInstance(true);
            gVar.mo4576A1(supportFragmentManager, f8112p);
            return gVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.setRetainInstance(true);
            deviceShareDialogFragment.mo8471K1((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.mo4576A1(supportFragmentManager, f8112p);
            return deviceShareDialogFragment;
        } else if ("ReferralFragment".equals(intent.getAction())) {
            C6227b bVar = new C6227b();
            bVar.setRetainInstance(true);
            supportFragmentManager.mo4428p().mo4632c(C8365b.com_facebook_fragment_container, bVar, f8112p).mo4515i();
            return bVar;
        } else {
            C2675e eVar = new C2675e();
            eVar.setRetainInstance(true);
            supportFragmentManager.mo4428p().mo4632c(C8365b.com_facebook_fragment_container, eVar, f8112p).mo4515i();
            return eVar;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!C9207a.m34024c(this)) {
            try {
                if (!C8570b.m32049j(str, printWriter, strArr)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f8114n;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C2626d.m10152w()) {
            C8769a0.m32649V(f8113q, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C2626d.m10125C(getApplicationContext());
        }
        setContentView(C8366c.com_facebook_activity_layout);
        if (f8111o.equals(intent.getAction())) {
            m9988O0();
        } else {
            this.f8114n = mo8155N0();
        }
    }
}
