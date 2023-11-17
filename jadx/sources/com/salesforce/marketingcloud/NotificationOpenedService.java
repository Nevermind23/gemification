package com.salesforce.marketingcloud;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import com.salesforce.marketingcloud.notifications.C11695a;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.concurrent.TimeUnit;
import p189o0.C7357a;

public class NotificationOpenedService extends IntentService {

    /* renamed from: a */
    private static final String f32890a = C11461g.m41875a("NotificationOpenedService");

    public NotificationOpenedService() {
        super(f32890a);
    }

    /* renamed from: a */
    private static void m41410a(Context context, Bundle bundle) {
        C7357a.m28044b(context).mo21731d(new Intent(C11695a.f33906n).putExtras(bundle));
    }

    /* renamed from: b */
    public static Intent m41411b(Context context, Bundle bundle) {
        return new Intent(context, NotificationOpenedService.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null && intent.getAction() != null) {
            PowerManager.WakeLock wakeLock = null;
            try {
                String str = f32890a;
                wakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, str);
                wakeLock.setReferenceCounted(false);
                wakeLock.acquire(TimeUnit.SECONDS.toMillis(30));
                if (!C11824l.m43288a(500, 50) || MarketingCloudSdk.getInstance() == null) {
                    C11461g.m41894e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                } else if (NotificationManager.ACTION_NOTIFICATION_CLICKED.equals(intent.getAction())) {
                    m41410a(getApplicationContext(), intent.getExtras());
                }
                if (!wakeLock.isHeld()) {
                    return;
                }
            } catch (Exception e) {
                C11461g.m41885b(f32890a, e, "Encountered exception while handling action: %s", intent.getAction());
                if (wakeLock == null || !wakeLock.isHeld()) {
                    return;
                }
            } catch (Throwable th) {
                if (wakeLock != null && wakeLock.isHeld()) {
                    try {
                        wakeLock.release();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            try {
                wakeLock.release();
            } catch (Exception unused2) {
            }
        }
    }
}
