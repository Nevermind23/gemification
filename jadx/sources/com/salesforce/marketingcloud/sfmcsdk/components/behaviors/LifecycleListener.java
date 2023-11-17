package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LifecycleListener implements C1616p, Application.ActivityLifecycleCallbacks {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "~$LifecycleListener";
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    public static LifecycleListener instance;
    private Context context;
    private AtomicBoolean inForeground;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleListener getInstance(Context context) {
            C41536l.m120489i(context, "context");
            if (getInstance$sfmcsdk_release() == null) {
                setInstance$sfmcsdk_release(new LifecycleListener(context, (DefaultConstructorMarker) null));
            }
            LifecycleListener instance$sfmcsdk_release = getInstance$sfmcsdk_release();
            if (instance$sfmcsdk_release != null) {
                return instance$sfmcsdk_release;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.salesforce.marketingcloud.sfmcsdk.components.behaviors.LifecycleListener");
        }

        public final LifecycleListener getInstance$sfmcsdk_release() {
            return LifecycleListener.instance;
        }

        public final void setInstance$sfmcsdk_release(LifecycleListener lifecycleListener) {
            LifecycleListener.instance = lifecycleListener;
        }
    }

    public /* synthetic */ LifecycleListener(Context context2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2);
    }

    public final AtomicBoolean getInForeground() {
        return this.inForeground;
    }

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
        BehaviorManagerImpl.Companion companion = BehaviorManagerImpl.Companion;
        Context context2 = this.context;
        BehaviorType behaviorType = BehaviorType.SCREEN_ENTRY;
        Bundle bundle = new Bundle();
        bundle.putString(Behavior.ScreenEntry.KEY_NAME, C41520a0.m120436b(activity.getClass()).mo94325c());
        C41238w wVar = C41238w.f97225a;
        companion.notifyBehavior$sfmcsdk_release(context2, behaviorType, bundle);
    }

    public void onActivityStopped(Activity activity) {
        C41536l.m120489i(activity, "activity");
    }

    @C1646z(C1593j.C1594a.ON_STOP)
    public final void onApplicationBackgrounded() {
        if (this.inForeground.getAndSet(false)) {
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, LifecycleListener$onApplicationBackgrounded$1.INSTANCE);
            BehaviorManagerImpl.Companion.notifyBehavior$sfmcsdk_release(this.context, BehaviorType.APPLICATION_BACKGROUNDED, new Bundle());
        }
    }

    @C1646z(C1593j.C1594a.ON_START)
    public final void onApplicationForegrounded() {
        if (!this.inForeground.getAndSet(true)) {
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, LifecycleListener$onApplicationForegrounded$1.INSTANCE);
            BehaviorManagerImpl.Companion.notifyBehavior$sfmcsdk_release(this.context, BehaviorType.APPLICATION_FOREGROUNDED, new Bundle());
        }
    }

    public final void setInForeground(AtomicBoolean atomicBoolean) {
        C41536l.m120489i(atomicBoolean, "<set-?>");
        this.inForeground = atomicBoolean;
    }

    private LifecycleListener(Context context2) {
        this.context = context2;
        this.inForeground = new AtomicBoolean(false);
    }
}
