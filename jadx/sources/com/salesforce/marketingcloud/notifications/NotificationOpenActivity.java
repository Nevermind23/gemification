package com.salesforce.marketingcloud.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1505h;
import com.salesforce.marketingcloud.C11461g;
import p189o0.C7357a;

public class NotificationOpenActivity extends C1505h {

    /* renamed from: a */
    private static final String f33905a = C11461g.m41875a("NotificationOpenActivity");

    /* renamed from: a */
    public static Intent m42658a(Context context, Bundle bundle) {
        return new Intent(context, NotificationOpenActivity.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle);
    }

    /* renamed from: b */
    private void m42660b(Context context, Bundle bundle) {
        C7357a.m28044b(context).mo21731d(new Intent(C11695a.f33906n).putExtras(bundle));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (r1.isHeld() != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r1.isHeld() != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            android.content.Intent r9 = r8.getIntent()
            if (r9 != 0) goto L_0x000d
            r8.m42659a()
            return
        L_0x000d:
            r9 = 1
            r0 = 0
            r1 = 0
            java.lang.String r2 = "power"
            java.lang.Object r2 = r8.getSystemService(r2)     // Catch:{ Exception -> 0x006f }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = f33905a     // Catch:{ Exception -> 0x006f }
            android.os.PowerManager$WakeLock r1 = r2.newWakeLock(r9, r3)     // Catch:{ Exception -> 0x006f }
            r1.setReferenceCounted(r0)     // Catch:{ Exception -> 0x006f }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x006f }
            r4 = 30
            long r4 = r2.toMillis(r4)     // Catch:{ Exception -> 0x006f }
            r1.acquire(r4)     // Catch:{ Exception -> 0x006f }
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 50
            boolean r2 = com.salesforce.marketingcloud.util.C11824l.m43288a(r4, r6)     // Catch:{ Exception -> 0x006f }
            if (r2 == 0) goto L_0x005c
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = com.salesforce.marketingcloud.MarketingCloudSdk.getInstance()     // Catch:{ Exception -> 0x006f }
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = "com.salesforce.marketingcloud.NOTIFICATION_CLICKED"
            android.content.Intent r3 = r8.getIntent()     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = r3.getAction()     // Catch:{ Exception -> 0x006f }
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x006f }
            if (r2 == 0) goto L_0x0063
            android.content.Context r2 = r8.getApplicationContext()     // Catch:{ Exception -> 0x006f }
            android.content.Intent r3 = r8.getIntent()     // Catch:{ Exception -> 0x006f }
            android.os.Bundle r3 = r3.getExtras()     // Catch:{ Exception -> 0x006f }
            r8.m42660b(r2, r3)     // Catch:{ Exception -> 0x006f }
            goto L_0x0063
        L_0x005c:
            java.lang.String r2 = "MarketingCloudSdk#init must be called in your application's onCreate"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x006f }
            com.salesforce.marketingcloud.C11461g.m41894e((java.lang.String) r3, (java.lang.String) r2, (java.lang.Object[]) r4)     // Catch:{ Exception -> 0x006f }
        L_0x0063:
            boolean r9 = r1.isHeld()
            if (r9 == 0) goto L_0x008c
        L_0x0069:
            r1.release()     // Catch:{ Exception -> 0x008c }
            goto L_0x008c
        L_0x006d:
            r9 = move-exception
            goto L_0x0090
        L_0x006f:
            r2 = move-exception
            java.lang.String r3 = f33905a     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Encountered exception while handling action: %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x006d }
            android.content.Intent r5 = r8.getIntent()     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r5.getAction()     // Catch:{ all -> 0x006d }
            r9[r0] = r5     // Catch:{ all -> 0x006d }
            com.salesforce.marketingcloud.C11461g.m41885b(r3, r2, r4, r9)     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x008c
            boolean r9 = r1.isHeld()
            if (r9 == 0) goto L_0x008c
            goto L_0x0069
        L_0x008c:
            r8.m42659a()
            return
        L_0x0090:
            if (r1 == 0) goto L_0x009b
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x009b
            r1.release()     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r8.m42659a()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.NotificationOpenActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m42659a() {
        finish();
    }
}
