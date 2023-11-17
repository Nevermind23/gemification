package com.salesforce.marketingcloud.messages.push;

import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import org.json.JSONObject;

public abstract class PushMessageManager {

    /* renamed from: d */
    static final String f33876d = C11461g.m41875a("PushMessageManager");

    /* renamed from: e */
    public static final String f33877e = "com.salesforce.marketingcloud.messages.push.TOKEN_REFRESHED";

    /* renamed from: f */
    public static final String f33878f = "com.salesforce.marketingcloud.push.TOKEN_REFRESH_SUCCESSFUL";

    /* renamed from: g */
    public static final String f33879g = "com.salesforce.marketingcloud.push.TOKEN_SENDER_ID";

    /* renamed from: h */
    public static final String f33880h = "com.salesforce.marketingcloud.notifications.PUSH_ENABLED";

    /* renamed from: i */
    public static final String f33881i = "com.salesforce.marketingcloud.push.TOKEN";

    @MCKeep
    public interface PushTokenRefreshListener {
        void onTokenRefreshed(String str);
    }

    @MCKeep
    public interface SilentPushListener {
        void silentPushReceived(Map<String, String> map);
    }

    @MCKeep
    public static boolean isMarketingCloudPush(RemoteMessage remoteMessage) {
        return remoteMessage != null && isMarketingCloudPush((Map<String, String>) remoteMessage.mo17546v());
    }

    @MCKeep
    public abstract void disablePush();

    @MCKeep
    public abstract void enablePush();

    @MCKeep
    public abstract JSONObject getPushDebugInfo();

    @MCKeep
    public abstract String getPushToken();

    @MCKeep
    public abstract boolean handleMessage(RemoteMessage remoteMessage);

    @MCKeep
    public abstract boolean handleMessage(Map<String, String> map);

    @MCKeep
    public abstract boolean isPushEnabled();

    @MCKeep
    public abstract void registerSilentPushListener(SilentPushListener silentPushListener);

    @MCKeep
    public abstract void registerTokenRefreshListener(PushTokenRefreshListener pushTokenRefreshListener);

    @MCKeep
    public abstract void setPushToken(String str);

    @MCKeep
    public abstract void unregisterSilentPushListener(SilentPushListener silentPushListener);

    @MCKeep
    public abstract void unregisterTokenRefreshListener(PushTokenRefreshListener pushTokenRefreshListener);

    @MCKeep
    public static boolean isMarketingCloudPush(Map<String, String> map) {
        return map != null && "SFMC".equalsIgnoreCase(map.get(NotificationMessage.NOTIF_KEY_SID));
    }
}
