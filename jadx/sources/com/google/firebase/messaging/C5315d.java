package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0750x;
import androidx.core.content.C0767a;
import java.util.concurrent.atomic.AtomicInteger;
import p130j6.C6731g;
import p130j6.C6732h;

/* renamed from: com.google.firebase.messaging.d */
public abstract class C5315d {

    /* renamed from: a */
    private static final AtomicInteger f17032a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.d$a */
    public static class C5316a {

        /* renamed from: a */
        public final C0750x.C0759e f17033a;

        /* renamed from: b */
        public final String f17034b;

        /* renamed from: c */
        public final int f17035c;

        C5316a(C0750x.C0759e eVar, String str, int i) {
            this.f17033a = eVar;
            this.f17034b = str;
            this.f17035c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m21008a(Context context, C5328g0 g0Var, String str, PackageManager packageManager) {
        Intent f = m21013f(str, g0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(g0Var.mo17599y());
        if (m21024q(g0Var)) {
            f.putExtra("gcm.n.analytics_data", g0Var.mo17598x());
        }
        return PendingIntent.getActivity(context, m21014g(), f, m21019l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m21009b(Context context, Context context2, C5328g0 g0Var) {
        if (!m21024q(g0Var)) {
            return null;
        }
        return m21010c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(g0Var.mo17598x()));
    }

    /* renamed from: c */
    private static PendingIntent m21010c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m21014g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m21019l(1073741824));
    }

    /* renamed from: d */
    public static C5316a m21011d(Context context, Context context2, C5328g0 g0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C0750x.C0759e eVar = new C0750x.C0759e(context2, str);
        String n = g0Var.mo17593n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.mo3219k(n);
        }
        String n2 = g0Var.mo17593n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.mo3218j(n2);
            eVar.mo3231x(new C0750x.C0756c().mo3207h(n2));
        }
        eVar.mo3229v(m21020m(packageManager, resources, packageName, g0Var.mo17595p("gcm.n.icon"), bundle));
        Uri n3 = m21021n(packageName, g0Var, resources);
        if (n3 != null) {
            eVar.mo3230w(n3);
        }
        eVar.mo3217i(m21008a(context, g0Var, packageName, packageManager));
        PendingIntent b = m21009b(context, context2, g0Var);
        if (b != null) {
            eVar.mo3221m(b);
        }
        Integer h = m21015h(context2, g0Var.mo17595p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.mo3216h(h.intValue());
        }
        eVar.mo3214f(!g0Var.mo17581a("gcm.n.sticky"));
        eVar.mo3224q(g0Var.mo17581a("gcm.n.local_only"));
        String p = g0Var.mo17595p("gcm.n.ticker");
        if (p != null) {
            eVar.mo3232y(p);
        }
        Integer m = g0Var.mo17592m();
        if (m != null) {
            eVar.mo3227t(m.intValue());
        }
        Integer r = g0Var.mo17597r();
        if (r != null) {
            eVar.mo3209A(r.intValue());
        }
        Integer l = g0Var.mo17591l();
        if (l != null) {
            eVar.mo3225r(l.intValue());
        }
        Long j = g0Var.mo17589j("gcm.n.event_time");
        if (j != null) {
            eVar.mo3228u(true);
            eVar.mo3210B(j.longValue());
        }
        long[] q = g0Var.mo17596q();
        if (q != null) {
            eVar.mo3233z(q);
        }
        int[] e = g0Var.mo17584e();
        if (e != null) {
            eVar.mo3223p(e[0], e[1], e[2]);
        }
        eVar.mo3220l(m21016i(g0Var));
        return new C5316a(eVar, m21022o(g0Var), 0);
    }

    /* renamed from: e */
    static C5316a m21012e(Context context, C5328g0 g0Var) {
        Bundle j = m21017j(context.getPackageManager(), context.getPackageName());
        return m21011d(context, context, g0Var, m21018k(context, g0Var.mo17590k(), j), j);
    }

    /* renamed from: f */
    private static Intent m21013f(String str, C5328g0 g0Var, PackageManager packageManager) {
        String p = g0Var.mo17595p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = g0Var.mo17585f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m21014g() {
        return f17032a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m21015h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(C0767a.m2893c(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* renamed from: i */
    private static int m21016i(C5328g0 g0Var) {
        boolean a = g0Var.mo17581a("gcm.n.default_sound");
        if (g0Var.mo17581a("gcm.n.default_vibrate_timings")) {
            a |= true;
        }
        return g0Var.mo17581a("gcm.n.default_light_settings") ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    private static Bundle m21017j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m21018k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                C6732h.m26251a();
                notificationManager.createNotificationChannel(C6731g.m26250a("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m21019l(int i) {
        return i | 67108864;
    }

    /* renamed from: m */
    private static int m21020m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m21023p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m21023p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m21023p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m21023p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m21021n(String str, C5328g0 g0Var, Resources resources) {
        String o = g0Var.mo17594o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    private static String m21022o(C5328g0 g0Var) {
        String p = g0Var.mo17595p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    private static boolean m21023p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C5312c.m21000a(resources.getDrawable(i, (Resources.Theme) null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m21024q(C5328g0 g0Var) {
        return g0Var.mo17581a("google.c.a.e");
    }
}
