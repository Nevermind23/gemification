package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.ArrayMap;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.util.ApplicationUtils;
import com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt;
import he1.C41238w;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p189o0.C7357a;

public final class BehaviorManagerImpl implements BehaviorManager {
    public static final String BUNDLE_KEY_APP_NAME = "application_name";
    public static final String BUNDLE_KEY_CURRENT_VERSION = "current_version";
    public static final String BUNDLE_KEY_PREVIOUS_VERSION = "previous_version";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String KEY_PREFS_CAPTURED_APP_VERSION = "captured_app_version";
    private static final String TAG = "~$BehaviorManager";
    private BehaviorReceiver behaviorReceiver;
    private final ArrayMap<BehaviorType, Set<BehaviorListener>> behaviorTypeListeners = new ArrayMap<>();
    private Context context;
    private final ExecutorService executorService;
    private final Map<BehaviorType, Bundle> stickyBehaviors = new LinkedHashMap();

    private final class BehaviorReceiver extends BroadcastReceiver {
        final /* synthetic */ BehaviorManagerImpl this$0;

        public BehaviorReceiver(BehaviorManagerImpl behaviorManagerImpl) {
            C41536l.m120489i(behaviorManagerImpl, "this$0");
            this.this$0 = behaviorManagerImpl;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                BehaviorManagerImpl behaviorManagerImpl = this.this$0;
                String action = intent.getAction();
                if (action != null) {
                    BehaviorType fromString = BehaviorType.Companion.fromString(action);
                    if (fromString != null) {
                        SFMCSdkLogger.INSTANCE.mo31452d(BehaviorManagerImpl.TAG, new BehaviorManagerImpl$BehaviorReceiver$onReceive$1$1$1(fromString, intent));
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            extras = new Bundle();
                        }
                        behaviorManagerImpl.onBehavior(fromString, extras);
                        return;
                    }
                    SFMCSdkLogger.INSTANCE.mo31463w(BehaviorManagerImpl.TAG, BehaviorManagerImpl$BehaviorReceiver$onReceive$1$1$2.INSTANCE);
                }
            }
        }
    }

    public static final class Companion {

        public static final class BehaviorRunnable implements Runnable {
            private final Behavior behavior;
            /* access modifiers changed from: private */
            public final BehaviorType behaviorType;
            private final Set<BehaviorListener> listeners;

            public BehaviorRunnable(Set<? extends BehaviorListener> set, BehaviorType behaviorType2, Bundle bundle) {
                C41536l.m120489i(set, "listeners");
                C41536l.m120489i(behaviorType2, "behaviorType");
                C41536l.m120489i(bundle, "data");
                this.listeners = set;
                this.behaviorType = behaviorType2;
                this.behavior = behaviorType2.toBehavior$sfmcsdk_release(bundle);
            }

            public void run() {
                Behavior behavior2 = this.behavior;
                if (behavior2 != null) {
                    SFMCSdk.Companion.track(BehaviorTypeKt.toEvent(behavior2));
                    for (BehaviorListener behaviorListener : this.listeners) {
                        if (behaviorListener != null) {
                            try {
                                SFMCSdkLogger.INSTANCE.mo31452d(BehaviorManagerImpl.TAG, new BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$1(this, behaviorListener));
                                behaviorListener.onBehavior(behavior2);
                            } catch (Exception e) {
                                SFMCSdkLogger.INSTANCE.mo31453e(BehaviorManagerImpl.TAG, e, new BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$2(e));
                            }
                        }
                    }
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_PREFS_CAPTURED_APP_VERSION$sfmcsdk_release$annotations() {
        }

        public final void notifyBehavior$sfmcsdk_release(Context context, BehaviorType behaviorType, Bundle bundle) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(behaviorType, "behaviorType");
            C41536l.m120489i(bundle, "extras");
            Intent intent = new Intent(behaviorType.getIntentFilter$sfmcsdk_release());
            bundle.putString(BehaviorManagerImpl.BUNDLE_KEY_APP_NAME, ApplicationUtils.getApplicationName(context));
            bundle.putString(BehaviorManagerImpl.BUNDLE_KEY_CURRENT_VERSION, ApplicationUtils.getApplicationVersion(context));
            C41238w wVar = C41238w.f97225a;
            intent.putExtras(bundle);
            SFMCSdkLogger.INSTANCE.mo31452d(BehaviorManagerImpl.TAG, new BehaviorManagerImpl$Companion$notifyBehavior$1(behaviorType, bundle));
            C7357a.m28044b(context).mo21731d(intent);
        }
    }

    public BehaviorManagerImpl(ExecutorService executorService2) {
        C41536l.m120489i(executorService2, "executorService");
        this.executorService = executorService2;
    }

    /* access modifiers changed from: private */
    public final void onBehavior(BehaviorType behaviorType, Bundle bundle) {
        bundle.putLong("timestamp", System.currentTimeMillis());
        synchronized (this.behaviorTypeListeners) {
            Set set = getBehaviorTypeListeners$sfmcsdk_release().get(behaviorType);
            if (set != null) {
                if (!set.isEmpty()) {
                    try {
                        this.executorService.submit(new Companion.BehaviorRunnable(set, behaviorType, bundle));
                    } catch (Exception e) {
                        SFMCSdkLogger.INSTANCE.mo31453e(TAG, e, new BehaviorManagerImpl$onBehavior$1$1$1(behaviorType, bundle));
                    }
                }
                C41238w wVar = C41238w.f97225a;
            }
        }
        synchronized (this.stickyBehaviors) {
            List<BehaviorType> behaviorTypesToClear$sfmcsdk_release = behaviorType.getBehaviorTypesToClear$sfmcsdk_release();
            if (behaviorTypesToClear$sfmcsdk_release != null) {
                for (BehaviorType put : behaviorTypesToClear$sfmcsdk_release) {
                    this.stickyBehaviors.put(put, (Object) null);
                }
            }
            if (behaviorType.getSticky$sfmcsdk_release()) {
                this.stickyBehaviors.put(behaviorType, bundle);
            }
            C41238w wVar2 = C41238w.f97225a;
        }
    }

    public final ArrayMap<BehaviorType, Set<BehaviorListener>> getBehaviorTypeListeners$sfmcsdk_release() {
        return this.behaviorTypeListeners;
    }

    public final BehaviorManager initIfNecessary$sfmcsdk_release(Context context2) {
        C41536l.m120489i(context2, "context");
        if (this.context == null) {
            this.context = context2;
        }
        if (this.behaviorReceiver == null) {
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, BehaviorManagerImpl$initIfNecessary$1.INSTANCE);
            BehaviorReceiver behaviorReceiver2 = new BehaviorReceiver(this);
            this.behaviorReceiver = behaviorReceiver2;
            C7357a b = C7357a.m28044b(context2);
            IntentFilter intentFilter = new IntentFilter();
            for (BehaviorType intentFilter$sfmcsdk_release : BehaviorType.values()) {
                intentFilter.addAction(intentFilter$sfmcsdk_release.getIntentFilter$sfmcsdk_release());
            }
            C41238w wVar = C41238w.f97225a;
            b.mo21730c(behaviorReceiver2, intentFilter);
            SharedPreferences sharedPreferences = context2.getSharedPreferences(FileUtilsKt.getFilenamePrefixForSFMCSdk("default"), 0);
            String string = sharedPreferences.getString(KEY_PREFS_CAPTURED_APP_VERSION, (String) null);
            String applicationVersion = ApplicationUtils.getApplicationVersion(context2);
            if (!C41536l.m120484d(applicationVersion, string) && applicationVersion != null) {
                sharedPreferences.edit().putString(KEY_PREFS_CAPTURED_APP_VERSION, applicationVersion).apply();
                Companion companion = Companion;
                BehaviorType behaviorType = BehaviorType.APP_VERSION_CHANGED;
                Bundle bundle = new Bundle();
                bundle.putString(BUNDLE_KEY_PREVIOUS_VERSION, string);
                C41238w wVar2 = C41238w.f97225a;
                companion.notifyBehavior$sfmcsdk_release(context2, behaviorType, bundle);
            }
        }
        return this;
    }

    public void registerForBehaviors(EnumSet<BehaviorType> enumSet, BehaviorListener behaviorListener) {
        C41536l.m120489i(enumSet, "behaviorTypes");
        C41536l.m120489i(behaviorListener, "listener");
        synchronized (this.behaviorTypeListeners) {
            for (BehaviorType behaviorType : enumSet) {
                Set set = getBehaviorTypeListeners$sfmcsdk_release().get(behaviorType);
                if (set == null) {
                    set = new HashSet();
                    getBehaviorTypeListeners$sfmcsdk_release().put(behaviorType, set);
                }
                SFMCSdkLogger.INSTANCE.mo31452d(TAG, new BehaviorManagerImpl$registerForBehaviors$1$1$1(behaviorListener, behaviorType));
                set.add(behaviorListener);
            }
            C41238w wVar = C41238w.f97225a;
        }
        synchronized (this.stickyBehaviors) {
            for (BehaviorType behaviorType2 : enumSet) {
                if (behaviorType2.getSticky$sfmcsdk_release()) {
                    Bundle bundle = this.stickyBehaviors.get(behaviorType2);
                    if (bundle != null) {
                        ExecutorService executorService2 = this.executorService;
                        Set d = C41355w0.m119981d(behaviorListener);
                        C41536l.m120488h(behaviorType2, "behaviorType");
                        executorService2.submit(new Companion.BehaviorRunnable(d, behaviorType2, bundle));
                        SFMCSdkLogger.INSTANCE.mo31452d(TAG, new BehaviorManagerImpl$registerForBehaviors$2$1$1$1(bundle));
                    }
                }
            }
            C41238w wVar2 = C41238w.f97225a;
        }
    }

    public final void tearDown$sfmcsdk_release() {
        BehaviorReceiver behaviorReceiver2;
        Context context2 = this.context;
        if (context2 != null && (behaviorReceiver2 = this.behaviorReceiver) != null) {
            C7357a.m28044b(context2).mo21732e(behaviorReceiver2);
        }
    }

    public void unregisterForAllBehaviors(BehaviorListener behaviorListener) {
        C41536l.m120489i(behaviorListener, "listener");
        synchronized (this.behaviorTypeListeners) {
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, new BehaviorManagerImpl$unregisterForAllBehaviors$1$1(behaviorListener));
            Set<Map.Entry<BehaviorType, Set<BehaviorListener>>> entrySet = getBehaviorTypeListeners$sfmcsdk_release().entrySet();
            C41536l.m120488h(entrySet, "behaviorTypeListeners.entries");
            for (Map.Entry value : entrySet) {
                ((Set) value.getValue()).remove(behaviorListener);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }
}
