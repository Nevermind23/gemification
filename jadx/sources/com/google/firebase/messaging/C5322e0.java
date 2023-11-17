package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C5270e;
import com.google.firebase.installations.C5283c;
import java.util.concurrent.ExecutionException;
import p069ea.C6118a;
import p069ea.C6123b;
import p142k5.C6811b;
import p142k5.C6812c;
import p142k5.C6816g;
import p301w8.C8878a;
import p337z7.C9231i;

/* renamed from: com.google.firebase.messaging.e0 */
public abstract class C5322e0 {
    /* renamed from: A */
    public static boolean m21030A(Intent intent) {
        if (intent == null || m21049r(intent)) {
            return false;
        }
        return m21031B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m21031B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m21032a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C5270e.m20805l();
            Context j = C5270e.m20805l().mo17481j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C6118a m21033b(C6118a.C6120b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C6118a.C6119a h = C6118a.m24461p().mo19677m(m21047p(extras)).mo19669e(bVar).mo19670f(m21037f(extras)).mo19673i(m21044m()).mo19675k(C6118a.C6122d.ANDROID).mo19672h(m21042k(extras));
        String h2 = m21039h(extras);
        if (h2 != null) {
            h.mo19671g(h2);
        }
        String o = m21046o(extras);
        if (o != null) {
            h.mo19676l(o);
        }
        String c = m21034c(extras);
        if (c != null) {
            h.mo19667c(c);
        }
        String i = m21040i(extras);
        if (i != null) {
            h.mo19666b(i);
        }
        String e = m21036e(extras);
        if (e != null) {
            h.mo19668d(e);
        }
        long n = m21045n(extras);
        if (n > 0) {
            h.mo19674j(n);
        }
        return h.mo19665a();
    }

    /* renamed from: c */
    static String m21034c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m21035d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m21036e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m21037f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C9231i.m34107a(C5283c.m20866r(C5270e.m20805l()).mo17504a());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    static String m21038g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m21039h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    static String m21040i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m21041j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C6118a.C6121c m21042k(Bundle bundle) {
        if (bundle == null || !C5328g0.m21073t(bundle)) {
            return C6118a.C6121c.DATA_MESSAGE;
        }
        return C6118a.C6121c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    static String m21043l(Bundle bundle) {
        return (bundle == null || !C5328g0.m21073t(bundle)) ? "data" : "display";
    }

    /* renamed from: m */
    static String m21044m() {
        return C5270e.m20805l().mo17481j().getPackageName();
    }

    /* renamed from: n */
    static long m21045n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C5270e l = C5270e.m20805l();
        String d = l.mo17483n().mo17518d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = l.mo17483n().mo17517c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                return 0;
            }
        }
    }

    /* renamed from: o */
    static String m21046o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m21047p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: q */
    static String m21048q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m21049r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m21050s(Intent intent) {
        m21055x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m21051t(Intent intent) {
        m21055x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m21052u(Bundle bundle) {
        m21056y(bundle);
        m21055x("_no", bundle);
    }

    /* renamed from: v */
    public static void m21053v(Intent intent) {
        if (m21030A(intent)) {
            m21055x("_nr", intent.getExtras());
        }
        if (m21057z(intent)) {
            m21054w(C6118a.C6120b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m20933q());
        }
    }

    /* renamed from: w */
    private static void m21054w(C6118a.C6120b bVar, Intent intent, C6816g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C6118a b = m21033b(bVar, intent);
        if (b != null) {
            try {
                gVar.mo20889a("FCM_CLIENT_EVENT_LOGGING", C6123b.class, C6811b.m26540b("proto"), new C5317d0()).mo20888b(C6812c.m26542d(C6123b.m24493b().mo19682b(b).mo19681a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }

    /* renamed from: x */
    static void m21055x(String str, Bundle bundle) {
        try {
            C5270e.m20805l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m21035d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m21036e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m21040i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m21038g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m21046o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m21041j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = m21048q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = m21043l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            C8878a aVar = (C8878a) C5270e.m20805l().mo17480i(C8878a.class);
            if (aVar != null) {
                aVar.mo24301a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m21056y(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                C8878a aVar = (C8878a) C5270e.m20805l().mo17480i(C8878a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.mo24302b("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    aVar.mo24301a("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }

    /* renamed from: z */
    public static boolean m21057z(Intent intent) {
        if (intent == null || m21049r(intent)) {
            return false;
        }
        return m21032a();
    }
}
