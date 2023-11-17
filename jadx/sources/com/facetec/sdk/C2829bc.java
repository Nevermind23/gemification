package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facetec.sdk.bc */
abstract class C2829bc extends Activity {

    /* renamed from: a */
    Handler f9081a;

    /* renamed from: b */
    C2888cg f9082b;

    /* renamed from: c */
    RelativeLayout f9083c;

    /* renamed from: d */
    View f9084d;

    /* renamed from: e */
    private final AtomicBoolean f9085e = new AtomicBoolean(false);

    /* renamed from: com.facetec.sdk.bc$b */
    enum C2830b {
        NOT_GRANTED,
        DENIED_ALWAYS,
        GRANTED
    }

    C2829bc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo8953w() {
        if (!hasWindowFocus()) {
            mo8776x();
        }
    }

    /* renamed from: x */
    private synchronized void mo8776x() {
        if (!mo8911b() && !isFinishing()) {
            mo8913d();
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo8910b(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo8911b() {
        return this.f9085e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C2830b mo8912c() {
        if (C0767a.m2891a(this, "android.permission.CAMERA") == 0) {
            return C2830b.GRANTED;
        }
        if (!C2840bg.m11376g(this).getBoolean("cameraPermissionsShown", false) || ActivityCompat.m2592x(this, "android.permission.CAMERA")) {
            return C2830b.NOT_GRANTED;
        }
        return C2830b.DENIED_ALWAYS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo8913d();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8914d(boolean z) {
        this.f9085e.set(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo8915e();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo8916e(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo8917f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo8918g();

    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    public Context getBaseContext() {
        return super.getBaseContext();
    }

    public Resources getResources() {
        return super.getResources();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo8919h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo8920i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo8921j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo8922k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract void mo8923l();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo8924m();

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract void mo8925n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo8926o();

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C2840bg.m11364c(configuration)) {
            mo8928p();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f9081a;
        if (handler != null) {
            handler.removeCallbacks((Runnable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        try {
            super.onResume();
            this.f9081a.postDelayed(new C3714z2(this), 1000);
        } catch (Throwable unused) {
            C3555s.m13898c((Context) this, C2867c.ON_RESUME_ERROR, "Error detected in onResume(). Ending the session.");
            mo8916e(C2790am.f8925v);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo8928p();

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract void mo8929q();

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract void mo8930r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo8931s();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8909a() {
        ActivityCompat.m2589u(this, new String[]{"android.permission.CAMERA"}, 0);
        mo8914d(true);
    }
}
