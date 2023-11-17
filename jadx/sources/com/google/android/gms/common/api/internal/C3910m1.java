package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1612n;
import com.google.android.gms.common.C3846a;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p066e7.C6047k;
import p156l6.C6942g;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
public abstract class C3910m1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: e */
    protected volatile boolean f12486e;

    /* renamed from: f */
    protected final AtomicReference f12487f = new AtomicReference((Object) null);

    /* renamed from: g */
    private final Handler f12488g = new C6047k(Looper.getMainLooper());

    /* renamed from: h */
    protected final C3846a f12489h;

    C3910m1(C6942g gVar, C3846a aVar) {
        super(gVar);
        this.f12489h = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m14834l(ConnectionResult connectionResult, int i) {
        this.f12487f.set((Object) null);
        mo12088m(connectionResult, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m14835o() {
        this.f12487f.set((Object) null);
        mo12089n();
    }

    /* renamed from: p */
    private static final int m14836p(C3901j1 j1Var) {
        if (j1Var == null) {
            return -1;
        }
        return j1Var.mo12108a();
    }

    /* renamed from: e */
    public final void mo11984e(int i, int i2, Intent intent) {
        C3901j1 j1Var = (C3901j1) this.f12487f.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f12489h.mo11872i(mo11983b());
                if (i3 == 0) {
                    m14835o();
                    return;
                } else if (j1Var != null) {
                    if (j1Var.mo12109b().mo11858v() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m14835o();
            return;
        } else if (i2 == 0) {
            if (j1Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m14834l(new ConnectionResult(i4, (PendingIntent) null, j1Var.mo12109b().toString()), m14836p(j1Var));
                return;
            }
            return;
        }
        if (j1Var != null) {
            m14834l(j1Var.mo12109b(), j1Var.mo12108a());
        }
    }

    /* renamed from: f */
    public final void mo11985f(Bundle bundle) {
        C3901j1 j1Var;
        super.mo11985f(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f12487f;
            if (bundle.getBoolean("resolving_error", false)) {
                j1Var = new C3901j1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                j1Var = null;
            }
            atomicReference.set(j1Var);
        }
    }

    /* renamed from: i */
    public final void mo11988i(Bundle bundle) {
        super.mo11988i(bundle);
        C3901j1 j1Var = (C3901j1) this.f12487f.get();
        if (j1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", j1Var.mo12108a());
            bundle.putInt("failed_status", j1Var.mo12109b().mo11858v());
            bundle.putParcelable("failed_resolution", j1Var.mo12109b().mo11861x());
        }
    }

    /* renamed from: j */
    public void mo11989j() {
        super.mo11989j();
        this.f12486e = true;
    }

    /* renamed from: k */
    public void mo11990k() {
        super.mo11990k();
        this.f12486e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo12088m(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo12089n();

    public final void onCancel(DialogInterface dialogInterface) {
        m14834l(new ConnectionResult(13, (PendingIntent) null), m14836p((C3901j1) this.f12487f.get()));
    }

    /* renamed from: s */
    public final void mo12121s(ConnectionResult connectionResult, int i) {
        C3901j1 j1Var = new C3901j1(connectionResult, i);
        if (C1612n.m5659a(this.f12487f, (Object) null, j1Var)) {
            this.f12488g.post(new C3907l1(this, j1Var));
        }
    }
}
