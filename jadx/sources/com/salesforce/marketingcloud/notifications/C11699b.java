package com.salesforce.marketingcloud.notifications;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.util.C11824l;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p130j6.C6731g;
import p130j6.C6732h;

/* renamed from: com.salesforce.marketingcloud.notifications.b */
class C11699b implements NotificationManager.NotificationBuilder {

    /* renamed from: a */
    private final NotificationManager.NotificationLaunchIntentProvider f33926a;

    /* renamed from: b */
    private final NotificationManager.NotificationBuilder f33927b;

    /* renamed from: c */
    private final NotificationManager.NotificationChannelIdProvider f33928c;

    /* renamed from: d */
    private final int f33929d;

    /* renamed from: com.salesforce.marketingcloud.notifications.b$a */
    static /* synthetic */ class C11700a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33930a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound[] r0 = com.salesforce.marketingcloud.notifications.NotificationMessage.Sound.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33930a = r0
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r1 = com.salesforce.marketingcloud.notifications.NotificationMessage.Sound.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33930a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r1 = com.salesforce.marketingcloud.notifications.NotificationMessage.Sound.DEFAULT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33930a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r1 = com.salesforce.marketingcloud.notifications.NotificationMessage.Sound.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11699b.C11700a.<clinit>():void");
        }
    }

    C11699b(int i, NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, NotificationManager.NotificationBuilder notificationBuilder, NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        this.f33926a = notificationLaunchIntentProvider;
        this.f33927b = notificationBuilder;
        this.f33928c = notificationChannelIdProvider;
        this.f33929d = i;
    }

    /* renamed from: a */
    private static Bitmap m42668a(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setDoInput(true);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (Exception e) {
            C11461g.m41885b(NotificationManager.f33902d, e, "Unable to download image %s", str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PendingIntent mo30955b(Context context, NotificationMessage notificationMessage) {
        try {
            NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider = this.f33926a;
            if (notificationLaunchIntentProvider != null) {
                return notificationLaunchIntentProvider.getNotificationPendingIntent(context, notificationMessage);
            }
        } catch (IllegalArgumentException e) {
            C11461g.m41885b(NotificationManager.f33902d, e, "Missing FLAG_IMMUTABLE or FLAG_MUTABLE flag in PendingIntent", new Object[0]);
        }
        int a = C11824l.m43279a(134217728);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        Intent a2 = NotificationManager.m42650a(launchIntentForPackage, notificationMessage);
        a2.addFlags(134217728);
        return PendingIntent.getActivity(context, notificationMessage.notificationId(), a2, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.core.app.C0750x.C0759e setupNotificationBuilder(android.content.Context r5, com.salesforce.marketingcloud.notifications.NotificationMessage r6) {
        /*
            r4 = this;
            com.salesforce.marketingcloud.notifications.NotificationManager$NotificationBuilder r0 = r4.f33927b
            if (r0 == 0) goto L_0x0014
            androidx.core.app.x$e r0 = r0.setupNotificationBuilder(r5, r6)     // Catch:{ Exception -> 0x0009 }
            goto L_0x0015
        L_0x0009:
            r0 = move-exception
            java.lang.String r1 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Custom notification builder threw an exception.  Using default notification builder."
            com.salesforce.marketingcloud.C11461g.m41885b(r1, r0, r3, r2)
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = r4.m42671a((android.content.Context) r5, (com.salesforce.marketingcloud.notifications.NotificationMessage) r6)
            int r1 = r4.f33929d
            androidx.core.app.x$e r0 = m42670a(r5, r6, r0, r1)
            android.app.PendingIntent r1 = r4.mo30955b(r5, r6)
            if (r1 == 0) goto L_0x002f
            r2 = 1
            android.app.PendingIntent r5 = com.salesforce.marketingcloud.notifications.NotificationManager.redirectIntentForAnalytics(r5, r1, r6, r2)
            r0.mo3217i(r5)
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11699b.setupNotificationBuilder(android.content.Context, com.salesforce.marketingcloud.notifications.NotificationMessage):androidx.core.app.x$e");
    }

    /* renamed from: a */
    private static Uri m42669a(Context context, String str, Uri uri) {
        int identifier = context.getResources().getIdentifier(m42673b(str), "raw", context.getPackageName());
        if (identifier <= 0) {
            return uri;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + C11110u2.f31950c + identifier);
    }

    /* renamed from: b */
    private static String m42673b(String str) {
        return (str == null || str.lastIndexOf(46) <= 0) ? str : str.substring(0, str.lastIndexOf(46));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.app.C0750x.C0759e m42670a(android.content.Context r5, com.salesforce.marketingcloud.notifications.NotificationMessage r6, java.lang.String r7, int r8) {
        /*
            androidx.core.app.x$e r0 = new androidx.core.app.x$e
            r0.<init>(r5, r7)
            android.content.pm.ApplicationInfo r7 = r5.getApplicationInfo()
            int r7 = r7.icon
            if (r7 <= 0) goto L_0x0018
            android.content.res.Resources r1 = r5.getResources()
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r1, r7)
            r0.mo3222o(r7)
        L_0x0018:
            r0.mo3229v(r8)
            java.lang.String r7 = r6.title()
            r0.mo3219k(r7)
            java.lang.String r7 = r6.mediaUrl()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 1
            r1 = 0
            if (r7 != 0) goto L_0x005e
            java.lang.String r7 = r6.mediaUrl()     // Catch:{ Exception -> 0x004e }
            android.graphics.Bitmap r7 = m42668a(r7)     // Catch:{ Exception -> 0x004e }
            if (r7 == 0) goto L_0x005e
            androidx.core.app.x$b r2 = new androidx.core.app.x$b     // Catch:{ Exception -> 0x004e }
            r2.<init>()     // Catch:{ Exception -> 0x004e }
            androidx.core.app.x$b r7 = r2.mo3204i(r7)     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = r6.alert()     // Catch:{ Exception -> 0x004e }
            androidx.core.app.x$b r7 = r7.mo3205j(r2)     // Catch:{ Exception -> 0x004e }
            r0.mo3231x(r7)     // Catch:{ Exception -> 0x004e }
            r7 = r8
            goto L_0x005f
        L_0x004e:
            r7 = move-exception
            java.lang.String r2 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = r6.mediaUrl()
            r3[r1] = r4
            java.lang.String r4 = "Unable to load notification image %s"
            com.salesforce.marketingcloud.C11461g.m41885b(r2, r7, r4, r3)
        L_0x005e:
            r7 = r1
        L_0x005f:
            if (r7 != 0) goto L_0x0070
            java.lang.String r2 = r6.mediaAltText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0070
            java.lang.String r2 = r6.mediaAltText()
            goto L_0x0074
        L_0x0070:
            java.lang.String r2 = r6.alert()
        L_0x0074:
            r0.mo3218j(r2)
            r0.mo3232y(r2)
            if (r7 != 0) goto L_0x0090
            androidx.core.app.x$c r7 = new androidx.core.app.x$c
            r7.<init>()
            androidx.core.app.x$c r7 = r7.mo3207h(r2)
            java.lang.String r2 = r6.title()
            androidx.core.app.x$c r7 = r7.mo3208i(r2)
            r0.mo3231x(r7)
        L_0x0090:
            int[] r7 = com.salesforce.marketingcloud.notifications.C11699b.C11700a.f33930a
            com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r2 = r6.sound()
            int r2 = r2.ordinal()
            r7 = r7[r2]
            if (r7 == r8) goto L_0x00b2
            r5 = 2
            if (r7 == r5) goto L_0x00af
            r5 = 3
            if (r7 == r5) goto L_0x00a5
            goto L_0x00bf
        L_0x00a5:
            java.lang.String r5 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = "No sound was set for notification."
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r5, (java.lang.String) r7, (java.lang.Object[]) r6)
            goto L_0x00bf
        L_0x00af:
            android.net.Uri r5 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            goto L_0x00bc
        L_0x00b2:
            java.lang.String r6 = r6.soundName()
            android.net.Uri r7 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            android.net.Uri r5 = m42669a(r5, r6, r7)
        L_0x00bc:
            r0.mo3230w(r5)
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11699b.m42670a(android.content.Context, com.salesforce.marketingcloud.notifications.NotificationMessage, java.lang.String, int):androidx.core.app.x$e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m42671a(android.content.Context r5, com.salesforce.marketingcloud.notifications.NotificationMessage r6) {
        /*
            r4 = this;
            com.salesforce.marketingcloud.notifications.NotificationManager$NotificationChannelIdProvider r0 = r4.f33928c
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.String r6 = r0.getNotificationChannelId(r5, r6)     // Catch:{ Exception -> 0x000a }
            goto L_0x0015
        L_0x000a:
            r6 = move-exception
            java.lang.String r0 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Exception thrown while app determined channel id for notification message."
            com.salesforce.marketingcloud.C11461g.m41885b(r0, r6, r3, r2)
        L_0x0014:
            r6 = 0
        L_0x0015:
            if (r6 != 0) goto L_0x001c
            m42672a((android.content.Context) r5, (boolean) r1)
            java.lang.String r6 = "com.salesforce.marketingcloud.DEFAULT_CHANNEL"
        L_0x001c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11699b.m42671a(android.content.Context, com.salesforce.marketingcloud.notifications.NotificationMessage):java.lang.String");
    }

    /* renamed from: a */
    static String m42672a(Context context, boolean z) {
        android.app.NotificationManager notificationManager;
        if (C11824l.m43295c() && (notificationManager = (android.app.NotificationManager) context.getSystemService("notification")) != null && (notificationManager.getNotificationChannel(NotificationManager.DEFAULT_CHANNEL_ID) == null || z)) {
            String string = context.getString(C11302R.string.mcsdk_default_notification_channel_name);
            C6732h.m26251a();
            NotificationChannel a = C6731g.m26250a(NotificationManager.DEFAULT_CHANNEL_ID, string, 3);
            a.enableLights(false);
            a.enableVibration(false);
            a.setShowBadge(true);
            a.setLockscreenVisibility(0);
            notificationManager.createNotificationChannel(a);
        }
        return NotificationManager.DEFAULT_CHANNEL_ID;
    }
}
