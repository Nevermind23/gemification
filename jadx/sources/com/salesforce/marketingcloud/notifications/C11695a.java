package com.salesforce.marketingcloud.notifications;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.collection.ArraySet;
import androidx.core.app.C0676b1;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.analytics.C11364j;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p189o0.C7357a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.notifications.a */
public class C11695a extends NotificationManager implements C11419e {

    /* renamed from: n */
    public static final String f33906n = "com.salesforce.marketingcloud.notifications.OPENED";

    /* renamed from: o */
    public static final String f33907o = "com.salesforce.marketingcloud.notifications.MESSAGE";

    /* renamed from: p */
    static final String f33908p = "com.salesforce.marketingcloud.notifications.EXTRA_OPEN_INTENT";

    /* renamed from: q */
    static final String f33909q = "com.salesforce.marketingcloud.notifications.EXTRA_AUTO_CANCEL";

    /* renamed from: r */
    public static final int f33910r = -1;

    /* renamed from: s */
    static final String f33911s = "com.marketingcloud.salesforce.notifications.TAG";

    /* renamed from: t */
    static final String f33912t = "com.marketingcloud.salesforce.notifications.ENABLED";

    /* renamed from: u */
    static final String f33913u = "notification_id_key";

    /* renamed from: f */
    final C11699b f33914f;

    /* renamed from: g */
    final Context f33915g;

    /* renamed from: h */
    private final C11800j f33916h;

    /* renamed from: i */
    private final Set<NotificationManager.NotificationMessageDisplayedListener> f33917i;

    /* renamed from: j */
    private final C11364j f33918j;

    /* renamed from: k */
    private NotificationManager.ShouldShowNotificationListener f33919k;

    /* renamed from: l */
    private BroadcastReceiver f33920l;

    /* renamed from: m */
    private boolean f33921m = true;

    /* renamed from: com.salesforce.marketingcloud.notifications.a$a */
    class C11696a extends Thread {

        /* renamed from: a */
        final /* synthetic */ NotificationMessage f33922a;

        /* renamed from: b */
        final /* synthetic */ C11697b f33923b;

        C11696a(NotificationMessage notificationMessage, C11697b bVar) {
            this.f33922a = notificationMessage;
            this.f33923b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                com.salesforce.marketingcloud.notifications.a r0 = com.salesforce.marketingcloud.notifications.C11695a.this
                com.salesforce.marketingcloud.notifications.b r1 = r0.f33914f
                android.content.Context r0 = r0.f33915g
                com.salesforce.marketingcloud.notifications.NotificationMessage r2 = r4.f33922a
                androidx.core.app.x$e r0 = r1.setupNotificationBuilder(r0, r2)
                com.salesforce.marketingcloud.notifications.a r1 = com.salesforce.marketingcloud.notifications.C11695a.this     // Catch:{ Exception -> 0x0037 }
                android.content.Context r1 = r1.f33915g     // Catch:{ Exception -> 0x0037 }
                java.lang.String r2 = "notification"
                java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0037 }
                android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{ Exception -> 0x0037 }
                if (r1 == 0) goto L_0x0042
                java.lang.String r2 = "com.marketingcloud.salesforce.notifications.TAG"
                com.salesforce.marketingcloud.notifications.NotificationMessage r3 = r4.f33922a     // Catch:{ Exception -> 0x0037 }
                int r3 = r3.notificationId()     // Catch:{ Exception -> 0x0037 }
                android.app.Notification r0 = r0.mo3212b()     // Catch:{ Exception -> 0x0037 }
                r1.notify(r2, r3, r0)     // Catch:{ Exception -> 0x0037 }
                com.salesforce.marketingcloud.notifications.a r0 = com.salesforce.marketingcloud.notifications.C11695a.this     // Catch:{ Exception -> 0x0037 }
                com.salesforce.marketingcloud.notifications.NotificationMessage r1 = r4.f33922a     // Catch:{ Exception -> 0x0037 }
                r0.mo30951a((com.salesforce.marketingcloud.notifications.NotificationMessage) r1)     // Catch:{ Exception -> 0x0037 }
                com.salesforce.marketingcloud.notifications.NotificationMessage r0 = r4.f33922a     // Catch:{ Exception -> 0x0037 }
                int r0 = r0.notificationId()     // Catch:{ Exception -> 0x0037 }
                goto L_0x0043
            L_0x0037:
                r0 = move-exception
                java.lang.String r1 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "Unable to show notification due to an exception thrown by Android."
                com.salesforce.marketingcloud.C11461g.m41885b(r1, r0, r3, r2)
            L_0x0042:
                r0 = -1
            L_0x0043:
                com.salesforce.marketingcloud.notifications.a$b r1 = r4.f33923b
                if (r1 == 0) goto L_0x004a
                r1.mo30439a(r0)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11695a.C11696a.run():void");
        }
    }

    /* renamed from: com.salesforce.marketingcloud.notifications.a$b */
    public interface C11697b {
        /* renamed from: a */
        void mo30439a(int i);
    }

    /* renamed from: com.salesforce.marketingcloud.notifications.a$c */
    class C11698c extends BroadcastReceiver {
        C11698c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41880a(NotificationManager.f33902d, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41880a(NotificationManager.f33902d, "Received null action", new Object[0]);
            } else if (C11695a.f33906n.equals(action)) {
                C11695a.this.mo30950a(context, NotificationManager.extractMessage(intent), (PendingIntent) intent.getParcelableExtra(C11695a.f33908p), intent.getBooleanExtra(C11695a.f33909q, true));
            } else {
                C11461g.m41880a(NotificationManager.f33902d, "Received unknown action: %s", action);
            }
        }
    }

    C11695a(Context context, C11800j jVar, C11699b bVar, C11364j jVar2) {
        this.f33915g = context;
        this.f33916h = jVar;
        this.f33914f = bVar;
        this.f33918j = (C11364j) C11821j.m43272a(jVar2, "MessageAnalyticEventListener is null.");
        this.f33917i = new ArraySet();
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static C11695a m42661a(Context context, C11800j jVar, NotificationCustomizationOptions notificationCustomizationOptions, C11364j jVar2) {
        return new C11695a(context, jVar, new C11699b(notificationCustomizationOptions.smallIconResId, notificationCustomizationOptions.launchIntentProvider, notificationCustomizationOptions.notificationBuilder, notificationCustomizationOptions.channelIdProvider), jVar2);
    }

    public final synchronized boolean areNotificationsEnabled() {
        return this.f33921m;
    }

    public final String componentName() {
        return "NotificationManager";
    }

    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationsEnabled", areNotificationsEnabled());
            NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener = this.f33919k;
            if (shouldShowNotificationListener != null) {
                jSONObject.put("shouldShowNotificationListener", shouldShowNotificationListener.getClass().getName());
            }
        } catch (JSONException e) {
            C11461g.m41885b(NotificationManager.f33902d, e, "Unable to create component state for %s", componentName());
        }
        return jSONObject;
    }

    public void controlChannelInit(int i) {
    }

    public final synchronized void disableNotifications() {
        if (this.f33921m) {
            this.f33921m = false;
            m42662a();
        }
    }

    public final synchronized void enableNotifications() {
        if (!this.f33921m) {
            this.f33921m = true;
            m42662a();
        }
    }

    public final void init(InitializationStatus.C11293a aVar, int i) {
        this.f33921m = this.f33916h.mo31608f().getBoolean(f33912t, true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f33906n);
        this.f33920l = new C11698c();
        C7357a.m28044b(this.f33915g).mo21730c(this.f33920l, intentFilter);
    }

    public final void registerNotificationMessageDisplayedListener(NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        if (notificationMessageDisplayedListener != null) {
            synchronized (this.f33917i) {
                this.f33917i.add(notificationMessageDisplayedListener);
            }
        }
    }

    public void setShouldShowNotificationListener(NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener) {
        this.f33919k = shouldShowNotificationListener;
    }

    public final void tearDown(boolean z) {
        if (z) {
            m42663a(this.f33915g);
        }
        Context context = this.f33915g;
        if (context != null) {
            C7357a.m28044b(context).mo21732e(this.f33920l);
        }
    }

    public final void unregisterNotificationMessageDisplayedListener(NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        synchronized (this.f33917i) {
            this.f33917i.remove(notificationMessageDisplayedListener);
        }
    }

    /* renamed from: a */
    private void m42662a() {
        C11800j jVar = this.f33916h;
        if (jVar != null) {
            jVar.mo31608f().edit().putBoolean(f33912t, this.f33921m).apply();
        }
    }

    /* renamed from: a */
    private void m42663a(Context context) {
        if (this.f33916h != null) {
            C0676b1 c = C0676b1.m2677c(context);
            int i = this.f33916h.mo31608f().getInt(f33913u, -1);
            int i2 = 0;
            while (i >= 0 && i2 < 100) {
                c.mo3120b(f33911s, i);
                i--;
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30950a(Context context, NotificationMessage notificationMessage, PendingIntent pendingIntent, boolean z) {
        C11461g.m41880a(NotificationManager.f33902d, "Notification open Event Logged for id : (%s)", notificationMessage.mo30925id());
        this.f33918j.mo29787a(notificationMessage);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                C11461g.m41885b(NotificationManager.f33902d, e, "Failed to send notification's open action PendingIntent.", new Object[0]);
            }
        }
        if (z) {
            NotificationManager.cancelNotificationMessage(context, notificationMessage);
        }
        if (Build.VERSION.SDK_INT <= 30) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(f33907o, notificationMessage);
        C11404c.m41719a(context, C11402a.BEHAVIOR_SDK_NOTIFICATION_OPENED, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30951a(NotificationMessage notificationMessage) {
        synchronized (this.f33917i) {
            if (!this.f33917i.isEmpty()) {
                for (NotificationManager.NotificationMessageDisplayedListener next : this.f33917i) {
                    if (next != null) {
                        try {
                            next.onNotificationMessageDisplayed(notificationMessage);
                        } catch (Exception e) {
                            C11461g.m41885b(NotificationManager.f33902d, e, "%s threw an exception while processing notification message (%s)", next.getClass().getName(), notificationMessage.mo30925id());
                        }
                    }
                }
            }
        }
        try {
            this.f33918j.mo29784b(notificationMessage);
        } catch (Exception e2) {
            C11461g.m41885b(NotificationManager.f33902d, e2, "Failed to log analytics for message displayed.", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo30952a(com.salesforce.marketingcloud.notifications.NotificationMessage r10, com.salesforce.marketingcloud.notifications.C11695a.C11697b r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.areNotificationsEnabled()     // Catch:{ all -> 0x00dd }
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = r10.mo30925id()     // Catch:{ all -> 0x00dd }
            r2[r3] = r10     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = "Notifications are not enabled.  Message %s will not be displayed"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r10, (java.lang.Object[]) r2)     // Catch:{ all -> 0x00dd }
            if (r11 == 0) goto L_0x001e
            r11.mo30439a(r1)     // Catch:{ all -> 0x00dd }
        L_0x001e:
            monitor-exit(r9)
            return
        L_0x0020:
            java.lang.String r0 = r10.alert()     // Catch:{ all -> 0x00dd }
            int r0 = android.text.TextUtils.getTrimmedLength(r0)     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x003a
            java.lang.String r10 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "Notifications with no alert message are not shown."
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r10, (java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ all -> 0x00dd }
            if (r11 == 0) goto L_0x0038
            r11.mo30439a(r1)     // Catch:{ all -> 0x00dd }
        L_0x0038:
            monitor-exit(r9)
            return
        L_0x003a:
            int r0 = r10.notificationId()     // Catch:{ all -> 0x00dd }
            if (r0 < 0) goto L_0x0047
            if (r11 == 0) goto L_0x0045
            r11.mo30439a(r1)     // Catch:{ all -> 0x00dd }
        L_0x0045:
            monitor-exit(r9)
            return
        L_0x0047:
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r0 = r9.f33919k     // Catch:{ all -> 0x00dd }
            r4 = 2
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.shouldShowNotification(r10)     // Catch:{ Exception -> 0x0051 }
            goto L_0x006e
        L_0x0051:
            r0 = move-exception
            java.lang.String r5 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00dd }
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r7 = r9.f33919k     // Catch:{ all -> 0x00dd }
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00dd }
            r6[r3] = r7     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = r10.mo30925id()     // Catch:{ all -> 0x00dd }
            r6[r2] = r7     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = "%s threw an exception while processing shouldShowNotification() for messageId: %s"
            com.salesforce.marketingcloud.C11461g.m41885b(r5, r0, r7, r6)     // Catch:{ all -> 0x00dd }
            r0 = r2
        L_0x006e:
            com.salesforce.marketingcloud.analytics.j r5 = r9.f33918j     // Catch:{ Exception -> 0x0074 }
            r5.mo29782a(r10, r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0086
        L_0x0074:
            r5 = move-exception
            java.lang.String r6 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            java.lang.String r8 = r10.mo30925id()     // Catch:{ all -> 0x00dd }
            r7[r3] = r8     // Catch:{ all -> 0x00dd }
            java.lang.String r8 = "Failed to log Should Show Notification analytic for messageId: %s"
            com.salesforce.marketingcloud.C11461g.m41885b(r6, r5, r8, r7)     // Catch:{ all -> 0x00dd }
            goto L_0x0086
        L_0x0085:
            r0 = r2
        L_0x0086:
            if (r0 == 0) goto L_0x00bb
            com.salesforce.marketingcloud.storage.j r0 = r9.f33916h     // Catch:{ all -> 0x00dd }
            android.content.SharedPreferences r0 = r0.mo31608f()     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "notification_id_key"
            int r1 = r0.getInt(r1, r3)     // Catch:{ all -> 0x00dd }
            com.salesforce.marketingcloud.internal.C11506h.m42057a((com.salesforce.marketingcloud.notifications.NotificationMessage) r10, (int) r1)     // Catch:{ all -> 0x00dd }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "notification_id_key"
            int r4 = r10.notificationId()     // Catch:{ all -> 0x00dd }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r5) goto L_0x00ab
            int r3 = r10.notificationId()     // Catch:{ all -> 0x00dd }
            int r3 = r3 + r2
        L_0x00ab:
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r3)     // Catch:{ all -> 0x00dd }
            r0.apply()     // Catch:{ all -> 0x00dd }
            com.salesforce.marketingcloud.notifications.a$a r0 = new com.salesforce.marketingcloud.notifications.a$a     // Catch:{ all -> 0x00dd }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x00dd }
            r0.start()     // Catch:{ all -> 0x00dd }
            goto L_0x00db
        L_0x00bb:
            java.lang.String r0 = com.salesforce.marketingcloud.notifications.NotificationManager.f33902d     // Catch:{ all -> 0x00dd }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00dd }
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r5 = r9.f33919k     // Catch:{ all -> 0x00dd }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x00dd }
            r4[r3] = r5     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = r10.mo30925id()     // Catch:{ all -> 0x00dd }
            r4[r2] = r10     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = "%s responded false to shouldShowNotification() for messageId: %s"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r10, (java.lang.Object[]) r4)     // Catch:{ all -> 0x00dd }
            if (r11 == 0) goto L_0x00db
            r11.mo30439a(r1)     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r9)
            return
        L_0x00dd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.C11695a.mo30952a(com.salesforce.marketingcloud.notifications.NotificationMessage, com.salesforce.marketingcloud.notifications.a$b):void");
    }
}
