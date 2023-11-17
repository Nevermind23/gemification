package nf1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: nf1.a */
public abstract class C41794a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private final Activity f98119d;

    C41794a(Activity activity) {
        this.f98119d = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo96608a();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.f98119d;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            mo96608a();
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
