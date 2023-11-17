package p156l6;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: l6.p0 */
final class C6961p0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ LifecycleCallback f20830d;

    /* renamed from: e */
    final /* synthetic */ String f20831e;

    /* renamed from: f */
    final /* synthetic */ C6963q0 f20832f;

    C6961p0(C6963q0 q0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f20832f = q0Var;
        this.f20830d = lifecycleCallback;
        this.f20831e = str;
    }

    public final void run() {
        Bundle bundle;
        C6963q0 q0Var = this.f20832f;
        if (q0Var.f20835e > 0) {
            LifecycleCallback lifecycleCallback = this.f20830d;
            if (q0Var.f20836f != null) {
                bundle = q0Var.f20836f.getBundle(this.f20831e);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo11985f(bundle);
        }
        if (this.f20832f.f20835e >= 2) {
            this.f20830d.mo11989j();
        }
        if (this.f20832f.f20835e >= 3) {
            this.f20830d.mo11987h();
        }
        if (this.f20832f.f20835e >= 4) {
            this.f20830d.mo11990k();
        }
        if (this.f20832f.f20835e >= 5) {
            this.f20830d.mo11986g();
        }
    }
}
