package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.util.C11824l;

@SuppressLint({"UnknownNullness"})
public class MCFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: a */
    private static final String f33875a = C11461g.m41875a("MCFirebaseMessagingService");

    /* renamed from: a */
    private static MarketingCloudSdk m42628a() {
        if (C11824l.m43288a(1000, 50) && MarketingCloudSdk.getInstance() != null) {
            return MarketingCloudSdk.getInstance();
        }
        C11461g.m41894e(f33875a, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
        return null;
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        C11461g.m41891d(f33875a, "onMessageReceived()", new Object[0]);
        m42630a(remoteMessage);
    }

    public void onNewToken(String str) {
        m42629a((Context) this);
    }

    /* renamed from: a */
    static void m42629a(Context context) {
        MarketingCloudSdk a = m42628a();
        if (a == null) {
            C11461g.m41894e(f33875a, "Marketing Cloud SDK init failed.  Unable to update push token.", new Object[0]);
            return;
        }
        String senderId = a.getMarketingCloudConfig().senderId();
        if (senderId != null) {
            MCService.m41387b(context, senderId);
        } else {
            C11461g.m41880a(f33875a, "Received new token intent but senderId was not set.", new Object[0]);
        }
    }

    /* renamed from: a */
    static void m42630a(RemoteMessage remoteMessage) {
        if (remoteMessage == null) {
            C11461g.m41894e(f33875a, "RemoteMessage was null.", new Object[0]);
            return;
        }
        String str = (remoteMessage.mo17546v() == null || !remoteMessage.mo17546v().containsKey(NotificationMessage.NOTIF_KEY_ID)) ? "Unknown Message" : (String) remoteMessage.mo17546v().get(NotificationMessage.NOTIF_KEY_ID);
        String str2 = f33875a;
        C11461g.m41891d(str2, "onMessageReceived() for MessageID: '%s'", str);
        MarketingCloudSdk a = m42628a();
        if (a == null) {
            C11461g.m41894e(str2, "Marketing Cloud SDK init failed.  Push message ignored.", new Object[0]);
        } else {
            a.getPushMessageManager().handleMessage(remoteMessage);
        }
    }
}
