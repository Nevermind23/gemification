package com.salesforce.marketingcloud.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.C0750x;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.NotificationOpenedService;
import com.salesforce.marketingcloud.internal.C11508i;
import com.salesforce.marketingcloud.util.C11824l;

public abstract class NotificationManager {
    @MCKeep
    public static final String ACTION_NOTIFICATION_CLICKED = "com.salesforce.marketingcloud.NOTIFICATION_CLICKED";
    @MCKeep
    public static final String DEFAULT_CHANNEL_ID = "com.salesforce.marketingcloud.DEFAULT_CHANNEL";

    /* renamed from: d */
    static final String f33902d = C11461g.m41875a("NotificationManager");

    /* renamed from: e */
    private static final String f33903e = "com.salesforce.marketingcloud.notifications.EXTRA_MESSAGE";

    @MCKeep
    public interface NotificationBuilder {
        C0750x.C0759e setupNotificationBuilder(Context context, NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationChannelIdProvider {
        String getNotificationChannelId(Context context, NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationLaunchIntentProvider {
        PendingIntent getNotificationPendingIntent(Context context, NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationMessageDisplayedListener {
        void onNotificationMessageDisplayed(NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface ShouldShowNotificationListener {
        boolean shouldShowNotification(NotificationMessage notificationMessage);
    }

    /* renamed from: a */
    static Intent m42650a(Intent intent, NotificationMessage notificationMessage) {
        return intent.putExtra(f33903e, C11508i.m42062a(notificationMessage));
    }

    @MCKeep
    public static void cancelNotificationMessage(Context context, NotificationMessage notificationMessage) {
        if (notificationMessage.notificationId() >= 0) {
            ((android.app.NotificationManager) context.getSystemService("notification")).cancel("com.marketingcloud.salesforce.notifications.TAG", notificationMessage.notificationId());
        }
    }

    @MCKeep
    public static String createDefaultNotificationChannel(Context context) {
        return C11699b.m42672a(context, false);
    }

    @MCKeep
    public static NotificationMessage extractMessage(Intent intent) {
        try {
            return (NotificationMessage) C11508i.m42061a(intent.getByteArrayExtra(f33903e), NotificationMessage.CREATOR);
        } catch (Exception e) {
            C11461g.m41885b(f33902d, e, "Unable to retrieve NotificationMessage from Intent (%s).", intent);
            return null;
        }
    }

    @MCKeep
    public static C0750x.C0759e getDefaultNotificationBuilder(Context context, NotificationMessage notificationMessage, String str, int i) {
        return C11699b.m42670a(context, notificationMessage, str, i);
    }

    @MCKeep
    public static PendingIntent redirectIntentForAnalytics(Context context, PendingIntent pendingIntent, NotificationMessage notificationMessage, boolean z) {
        Bundle bundle = new Bundle(3);
        bundle.putByteArray(f33903e, C11508i.m42062a(notificationMessage));
        bundle.putParcelable("com.salesforce.marketingcloud.notifications.EXTRA_OPEN_INTENT", pendingIntent);
        bundle.putBoolean("com.salesforce.marketingcloud.notifications.EXTRA_AUTO_CANCEL", z);
        Uri fromParts = Uri.fromParts("mcsdk", "pushOpen", String.valueOf(System.currentTimeMillis()));
        int a = C11824l.m43279a(1073741824);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, NotificationOpenActivity.m42658a(context, bundle).setData(fromParts), a) : PendingIntent.getService(context, 0, NotificationOpenedService.m41411b(context, bundle).setData(fromParts), a);
    }

    @MCKeep
    public abstract boolean areNotificationsEnabled();

    @MCKeep
    public abstract void disableNotifications();

    @MCKeep
    public abstract void enableNotifications();

    @MCKeep
    public abstract void registerNotificationMessageDisplayedListener(NotificationMessageDisplayedListener notificationMessageDisplayedListener);

    @MCKeep
    public abstract void setShouldShowNotificationListener(ShouldShowNotificationListener shouldShowNotificationListener);

    @MCKeep
    public abstract void unregisterNotificationMessageDisplayedListener(NotificationMessageDisplayedListener notificationMessageDisplayedListener);

    @MCKeep
    public static String createDefaultNotificationChannel(Context context, boolean z) {
        return C11699b.m42672a(context, z);
    }
}
