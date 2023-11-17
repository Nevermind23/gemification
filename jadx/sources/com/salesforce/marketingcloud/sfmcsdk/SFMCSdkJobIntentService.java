package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0720n;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SFMCSdkJobIntentService extends C0720n {
    private static final String ACTION_SYSTEM_BEHAVIOR = "com.salesforce.marketingcloud.sfmcsdk.SYSTEM_BEHAVIOR";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXTRA_BEHAVIOR = "behavior";
    private static final String EXTRA_DATA = "data";
    private static final int JOB_ID = 331122;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void enqueueSystemBehavior(Context context, BehaviorType behaviorType, Bundle bundle) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(behaviorType, "behaviorType");
            Bundle bundle2 = new Bundle();
            bundle2.putString(SFMCSdkJobIntentService.EXTRA_BEHAVIOR, behaviorType.getIntentFilter$sfmcsdk_release());
            bundle2.putBundle(SFMCSdkJobIntentService.EXTRA_DATA, bundle);
            C0720n.enqueueWork(context, (Class<?>) SFMCSdkJobIntentService.class, (int) SFMCSdkJobIntentService.JOB_ID, new Intent(SFMCSdkJobIntentService.ACTION_SYSTEM_BEHAVIOR).putExtras(bundle2));
        }
    }

    private final void handleSystemBehavior(Context context, BehaviorType behaviorType, Bundle bundle) {
        if (behaviorType != null) {
            BehaviorManagerImpl.Companion.notifyBehavior$sfmcsdk_release(context, behaviorType, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        Bundle bundleExtra;
        C41536l.m120489i(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            Context applicationContext = getApplicationContext();
            if (C41536l.m120484d(action, ACTION_SYSTEM_BEHAVIOR) && (bundleExtra = intent.getBundleExtra(EXTRA_DATA)) != null) {
                C41536l.m120488h(applicationContext, "context");
                handleSystemBehavior(applicationContext, BehaviorType.Companion.fromString(intent.getStringExtra(EXTRA_BEHAVIOR)), bundleExtra);
            }
        }
    }
}
