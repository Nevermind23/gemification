package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.profileinstaller.C1694g;
import java.util.concurrent.Executor;
import p260t6.C8413o;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.l0 */
abstract class C5341l0 {
    /* renamed from: b */
    private static boolean m21121b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    static void m21122c(Context context) {
        if (!C5343m0.m21137b(context)) {
            m21124e(new C1694g(), context, m21125f(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m21123d(Context context, boolean z, C9227g gVar) {
        try {
            if (!m21121b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C5343m0.m21138c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            gVar.mo24887e((Object) null);
        } finally {
            gVar.mo24887e((Object) null);
        }
    }

    /* renamed from: e */
    static Task m21124e(Executor executor, Context context, boolean z) {
        if (!C8413o.m31572j()) {
            return C9231i.m34113g((Object) null);
        }
        C9227g gVar = new C9227g();
        executor.execute(new C5339k0(context, z, gVar));
        return gVar.mo24883a();
    }

    /* renamed from: f */
    private static boolean m21125f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
