package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.t2 */
final class C4412t2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    final /* synthetic */ C4429u2 f13683d;

    C4412t2(C4429u2 u2Var) {
        this.f13683d = u2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f13683d.m16794l(new C4276l2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f13683d.m16794l(new C4395s2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f13683d.m16794l(new C4344p2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f13683d.m16794l(new C4310n2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C4105b1 b1Var = new C4105b1();
        this.f13683d.m16794l(new C4378r2(this, activity, b1Var));
        Bundle x = b1Var.mo12893x(50);
        if (x != null) {
            bundle.putAll(x);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f13683d.m16794l(new C4293m2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f13683d.m16794l(new C4361q2(this, activity));
    }
}
