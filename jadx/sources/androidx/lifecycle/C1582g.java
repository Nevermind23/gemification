package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.g */
public abstract class C1582g implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C41536l.m120489i(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C41536l.m120489i(activity, "activity");
        C41536l.m120489i(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }
}
