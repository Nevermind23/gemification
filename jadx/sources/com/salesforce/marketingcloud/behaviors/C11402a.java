package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.behaviors.a */
public enum C11402a {
    BEHAVIOR_DEVICE_SHUTDOWN("android.intent.action.ACTION_SHUTDOWN"),
    BEHAVIOR_DEVICE_BOOT_COMPLETE("android.intent.action.BOOT_COMPLETED"),
    BEHAVIOR_DEVICE_TIME_ZONE_CHANGED("android.intent.action.TIMEZONE_CHANGED"),
    BEHAVIOR_APP_PACKAGE_REPLACED("android.intent.action.MY_PACKAGE_REPLACED"),
    BEHAVIOR_APP_FOREGROUNDED("com.salesforce.marketingcloud.APP_FOREGROUNDED", (int) true),
    BEHAVIOR_APP_BACKGROUNDED("com.salesforce.marketingcloud.APP_BACKGROUNDED", (int) r6),
    BEHAVIOR_SDK_REGISTRATION_SEND("com.salesforce.marketingcloud.REGISTRATION_SEND"),
    BEHAVIOR_SDK_PUSH_RECEIVED("com.salesforce.marketingcloud.PUSH_RECEIVED"),
    BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED("com.salesforce.marketingcloud.FENCE_MESSAGING_TOGGLED"),
    BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED("com.salesforce.marketingcloud.PROXIMITY_MESSAGING_TOGGLED"),
    BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED("com.salesforce.marketingcloud.PUSH_MESSAGING_TOGGLED"),
    BEHAVIOR_SDK_NOTIFICATION_OPENED("com.salesforce.marketingcloud.NOTIFICATION_OPENED"),
    BEHAVIOR_SDK_TOKEN_REFRESHED("com.salesforce.marketingcloud.TOKEN_REFRESHED");
    
    @SuppressLint({"NoHardKeywords"})

    /* renamed from: a */
    public final String f33174a;

    /* renamed from: b */
    public final boolean f33175b;

    /* renamed from: c */
    public final C11402a f33176c;

    private C11402a(String str) {
        this(r2, r3, str, false);
    }

    /* renamed from: a */
    public static C11402a m41718a(String str) {
        if (str == null) {
            return null;
        }
        for (C11402a aVar : values()) {
            if (str.equals(aVar.f33174a)) {
                return aVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f33174a;
    }

    private C11402a(String str, C11402a aVar) {
        this.f33174a = str;
        this.f33175b = false;
        this.f33176c = aVar;
    }

    private C11402a(String str, boolean z) {
        this.f33174a = str;
        this.f33175b = z;
        this.f33176c = null;
    }
}
