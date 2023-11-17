package p156l6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: l6.r0 */
final class C6965r0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ LifecycleCallback f20837d;

    /* renamed from: e */
    final /* synthetic */ String f20838e;

    /* renamed from: f */
    final /* synthetic */ C6967s0 f20839f;

    C6965r0(C6967s0 s0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f20839f = s0Var;
        this.f20837d = lifecycleCallback;
        this.f20838e = str;
    }

    public final void run() {
        Bundle bundle;
        C6967s0 s0Var = this.f20839f;
        if (s0Var.f20843e > 0) {
            LifecycleCallback lifecycleCallback = this.f20837d;
            if (s0Var.f20844f != null) {
                bundle = s0Var.f20844f.getBundle(this.f20838e);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo11985f(bundle);
        }
        if (this.f20839f.f20843e >= 2) {
            this.f20837d.mo11989j();
        }
        if (this.f20839f.f20843e >= 3) {
            this.f20837d.mo11987h();
        }
        if (this.f20839f.f20843e >= 4) {
            this.f20837d.mo11990k();
        }
        if (this.f20839f.f20843e >= 5) {
            this.f20837d.mo11986g();
        }
    }
}
