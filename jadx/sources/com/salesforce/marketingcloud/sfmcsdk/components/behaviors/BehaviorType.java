package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.os.Bundle;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum BehaviorType {
    SCREEN_ENTRY(INTENT_FILTER_SCREEN_ENTRY, true, (String) null, 4, (List) null),
    APPLICATION_FOREGROUNDED(INTENT_FILTER_APPLICATION_FOREGROUNDED, true, (String) null, 4, (List) null),
    APPLICATION_BACKGROUNDED(INTENT_FILTER_APPLICATION_BACKGROUNDED, false, C41341q.m119910m(r9, r0), 2, (List) null),
    APP_VERSION_CHANGED(INTENT_FILTER_APP_VERSION_CHANGED, true, (String) null, 4, (List) null);
    
    public static final Companion Companion = null;
    public static final String INTENT_FILTER_APPLICATION_BACKGROUNDED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APPLICATION_BACKGROUNDED";
    public static final String INTENT_FILTER_APPLICATION_FOREGROUNDED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APPLICATION_FOREGROUNDED";
    public static final String INTENT_FILTER_APP_VERSION_CHANGED = "com.salesforce.marketingcloud.sfmcsdk.sdk.APP_VERSION_CHANGED";
    public static final String INTENT_FILTER_SCREEN_ENTRY = "com.salesforce.marketingcloud.sfmcsdk.sdk.SCREEN_ENTRY";
    private List<? extends BehaviorType> behaviorTypesToClear;
    private String intentFilter;
    private boolean sticky;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BehaviorType fromString(String str) {
            List j = C41341q.m119907j();
            if (str != null) {
                BehaviorType[] values = BehaviorType.values();
                ArrayList arrayList = new ArrayList();
                for (BehaviorType behaviorType : values) {
                    if (C41536l.m120484d(str, behaviorType.getIntentFilter$sfmcsdk_release())) {
                        arrayList.add(behaviorType);
                    }
                }
                j = arrayList;
            }
            if (!j.isEmpty()) {
                return (BehaviorType) j.get(0);
            }
            return null;
        }
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private BehaviorType(String str, boolean z, List<? extends BehaviorType> list) {
        this.intentFilter = str;
        this.sticky = z;
        this.behaviorTypesToClear = list;
    }

    public final List<BehaviorType> getBehaviorTypesToClear$sfmcsdk_release() {
        return this.behaviorTypesToClear;
    }

    public final String getIntentFilter$sfmcsdk_release() {
        return this.intentFilter;
    }

    public final boolean getSticky$sfmcsdk_release() {
        return this.sticky;
    }

    public final void setBehaviorTypesToClear$sfmcsdk_release(List<? extends BehaviorType> list) {
        this.behaviorTypesToClear = list;
    }

    public final void setIntentFilter$sfmcsdk_release(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.intentFilter = str;
    }

    public final void setSticky$sfmcsdk_release(boolean z) {
        this.sticky = z;
    }

    public final Behavior toBehavior$sfmcsdk_release(Bundle bundle) {
        String string;
        C41536l.m120489i(bundle, "data");
        long j = bundle.getLong("timestamp");
        String string2 = bundle.getString(BehaviorManagerImpl.BUNDLE_KEY_CURRENT_VERSION);
        String string3 = bundle.getString(BehaviorManagerImpl.BUNDLE_KEY_APP_NAME);
        String str = this.intentFilter;
        switch (str.hashCode()) {
            case -2046669238:
                if (!str.equals(INTENT_FILTER_APPLICATION_BACKGROUNDED)) {
                    return null;
                }
                return new Behavior.AppBackgrounded(j, string2, string3);
            case -1610764001:
                if (!str.equals(INTENT_FILTER_APPLICATION_FOREGROUNDED)) {
                    return null;
                }
                return new Behavior.AppForegrounded(j, string2, string3);
            case 100058561:
                if (!str.equals(INTENT_FILTER_APP_VERSION_CHANGED)) {
                    return null;
                }
                return new Behavior.AppVersionChanged(j, string2, string3, bundle.getString(BehaviorManagerImpl.BUNDLE_KEY_PREVIOUS_VERSION));
            case 518948109:
                if (str.equals(INTENT_FILTER_SCREEN_ENTRY) && (string = bundle.getString(Behavior.ScreenEntry.KEY_NAME)) != null) {
                    return new Behavior.ScreenEntry(string, j, string2, string3);
                }
                return null;
            default:
                return null;
        }
    }

    public String toString() {
        return this.intentFilter;
    }
}
