package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.http.C11476b;
import com.salesforce.marketingcloud.http.C11481c;
import com.salesforce.marketingcloud.http.C11486d;
import com.salesforce.marketingcloud.messages.push.C11689a;
import p189o0.C7357a;
import p337z7.C9219c;
import p337z7.Task;

@SuppressLint({"UnknownNullness"})
public class MCService extends C11408c {

    /* renamed from: k */
    static final String f32839k = "com.salesforce.marketingcloud.HTTP_REQUEST";

    /* renamed from: l */
    static final String f32840l = "com.salesforce.marketingcloud.ALARM_WAKE";

    /* renamed from: m */
    static final String f32841m = "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR";

    /* renamed from: n */
    static final String f32842n = "com.salesforce.marketingcloud.TOKEN_REQUEST";

    /* renamed from: o */
    private static final String f32843o = "behavior";

    /* renamed from: p */
    private static final String f32844p = "data";

    /* renamed from: q */
    private static final String f32845q = "alarmName";

    /* renamed from: r */
    private static final String f32846r = "senderId";

    /* renamed from: s */
    private static final int f32847s = 3000;

    /* renamed from: com.salesforce.marketingcloud.MCService$a */
    class C11295a implements C9219c {

        /* renamed from: a */
        final /* synthetic */ String[] f32848a;

        /* renamed from: b */
        final /* synthetic */ Context f32849b;

        /* renamed from: c */
        final /* synthetic */ String f32850c;

        C11295a(String[] strArr, Context context, String str) {
            this.f32848a = strArr;
            this.f32849b = context;
            this.f32850c = str;
        }

        public void onComplete(Task task) {
            if (task.mo24873r()) {
                this.f32848a[0] = (String) task.mo24869n();
            }
            C11689a.m42633a(this.f32849b, !TextUtils.isEmpty(this.f32848a[0]), this.f32850c, this.f32848a[0]);
        }
    }

    /* renamed from: a */
    static void m41380a(Context context, C11402a aVar, Bundle bundle) {
        C11461g.m41891d(C11408c.f33189h, "enqueueSystemBehavior - %s", aVar);
        Bundle bundle2 = new Bundle();
        bundle2.putString(f32843o, aVar.f33174a);
        bundle2.putBundle(f32844p, bundle);
        m41383a(context, f32841m, bundle2);
    }

    /* renamed from: b */
    private static void m41385b(Context context, C11402a aVar, Bundle bundle) {
        if (aVar == null) {
            C11461g.m41891d(C11408c.f33189h, "Behavior was null", new Object[0]);
            return;
        }
        C11461g.m41891d(C11408c.f33189h, "handleSystemBehavior - %s", aVar);
        C11404c.m41719a(context, aVar, bundle);
    }

    /* renamed from: c */
    private static void m41388c(Context context, String str) {
        if (str == null) {
            C11461g.m41891d(C11408c.f33189h, "alarm name not provided", new Object[0]);
            return;
        }
        C11461g.m41891d(C11408c.f33189h, "handleAlarmWakeup - %s", str);
        C7357a.m28044b(context).mo21731d(new Intent(C11327b.f32945j).putExtra("com.salesforce.marketingcloud.WAKE_FOR_ALARM", str));
    }

    /* renamed from: d */
    static void m41389d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            C11461g.m41880a(C11408c.f33189h, "Unable to refresh system token.  SenderId was invalid", new Object[0]);
            return;
        }
        C11461g.m41891d(C11408c.f33189h, "handleTokenRequest", new Object[0]);
        try {
            FirebaseMessaging.m20930l().mo17533o().mo24858c(new C11295a(new String[]{null}, context, str));
        } catch (Exception e) {
            C11461g.m41885b(C11408c.f33189h, e, "Failed to retrieve InstanceId from Firebase.", new Object[0]);
        }
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    /* renamed from: a */
    public static void m41381a(Context context, C11476b bVar) {
        C11461g.m41891d(C11408c.f33189h, "handleHttpRequest - %s", bVar.mo30004r());
        m41383a(context, f32839k, bVar.mo30005s());
    }

    /* renamed from: b */
    static void m41386b(Context context, C11476b bVar) {
        if (bVar == null) {
            C11461g.m41891d(C11408c.f33189h, "request was null", new Object[0]);
            return;
        }
        C11461g.m41891d(C11408c.f33189h, "handleHttpRequest - %s", bVar.mo30004r());
        C7357a.m28044b(context).mo21731d(new Intent(C11481c.f33385j).putExtra(C11481c.f33387l, bVar.mo30005s()).putExtra(C11481c.f33386k, m41384a(context) ? bVar.mo29996j() : C11486d.m41978a("No connectivity", -1)));
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo29551c() {
        return super.mo29551c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ boolean mo29552d() {
        return super.mo29552d();
    }

    /* renamed from: a */
    public static void m41382a(Context context, String str) {
        C11461g.m41891d(C11408c.f33189h, "enqueueAlarmWake - %s", str);
        Bundle bundle = new Bundle();
        bundle.putString(f32845q, str);
        m41383a(context, f32840l, bundle);
    }

    /* renamed from: b */
    public static void m41387b(Context context, String str) {
        C11461g.m41891d(C11408c.f33189h, "enqueueTokenRequest", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString(f32846r, str);
        m41383a(context, f32842n, bundle);
    }

    /* renamed from: a */
    private static void m41383a(Context context, String str, Bundle bundle) {
        C11408c.m41725a(context, MCService.class, (int) f32847s, new Intent(str).putExtras(bundle));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo29550b(boolean z) {
        super.mo29550b(z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0.equals(f32840l) == false) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29549a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAction()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r1 = r6.getApplicationContext()
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 50
            boolean r2 = com.salesforce.marketingcloud.util.C11824l.m43288a(r2, r4)
            r3 = 0
            if (r2 == 0) goto L_0x008a
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = com.salesforce.marketingcloud.MarketingCloudSdk.getInstance()
            if (r2 == 0) goto L_0x008a
            int r2 = r0.hashCode()
            r4 = -1
            switch(r2) {
                case -1341919505: goto L_0x0047;
                case -525195028: goto L_0x003c;
                case 352488053: goto L_0x0031;
                case 848031877: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r3 = r4
            goto L_0x0050
        L_0x0026:
            java.lang.String r2 = "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r3 = 3
            goto L_0x0050
        L_0x0031:
            java.lang.String r2 = "com.salesforce.marketingcloud.HTTP_REQUEST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r3 = 2
            goto L_0x0050
        L_0x003c:
            java.lang.String r2 = "com.salesforce.marketingcloud.TOKEN_REQUEST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            r3 = 1
            goto L_0x0050
        L_0x0047:
            java.lang.String r2 = "com.salesforce.marketingcloud.ALARM_WAKE"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0050
            goto L_0x0024
        L_0x0050:
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0076;
                case 2: goto L_0x0068;
                case 3: goto L_0x0054;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0093
        L_0x0054:
            java.lang.String r0 = "behavior"
            java.lang.String r0 = r7.getStringExtra(r0)
            com.salesforce.marketingcloud.behaviors.a r0 = com.salesforce.marketingcloud.behaviors.C11402a.m41718a(r0)
            java.lang.String r2 = "data"
            android.os.Bundle r7 = r7.getBundleExtra(r2)
            m41385b(r1, r0, r7)
            goto L_0x0093
        L_0x0068:
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto L_0x0093
            com.salesforce.marketingcloud.http.b r7 = com.salesforce.marketingcloud.http.C11476b.m41933a((android.os.Bundle) r7)
            m41386b((android.content.Context) r1, (com.salesforce.marketingcloud.http.C11476b) r7)
            goto L_0x0093
        L_0x0076:
            java.lang.String r0 = "senderId"
            java.lang.String r7 = r7.getStringExtra(r0)
            m41389d(r1, r7)
            goto L_0x0093
        L_0x0080:
            java.lang.String r0 = "alarmName"
            java.lang.String r7 = r7.getStringExtra(r0)
            m41388c(r1, r7)
            goto L_0x0093
        L_0x008a:
            java.lang.String r7 = com.salesforce.marketingcloud.C11408c.f33189h
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "MarketingCloudSdk#init must be called in your application's onCreate"
            com.salesforce.marketingcloud.C11461g.m41894e((java.lang.String) r7, (java.lang.String) r1, (java.lang.Object[]) r0)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MCService.mo29549a(android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r1.getActiveNetworkInfo();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m41384a(android.content.Context r1) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            if (r1 == 0) goto L_0x0018
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.isConnectedOrConnecting()
            if (r1 == 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MCService.m41384a(android.content.Context):boolean");
    }
}
