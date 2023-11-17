package p193o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2645k;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.Locale;
import p064e5.C6035a;
import p115i4.C6549g;
import p115i4.C6564m;
import p297w4.C8831r;
import p334z4.C9207a;

/* renamed from: o4.k */
abstract class C7455k {

    /* renamed from: a */
    private static final String f21741a = "o4.k";

    /* renamed from: b */
    private static final long[] f21742b = {300000, 900000, 1800000, C10749b8.C10751b.f30744c, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: a */
    private static String m28348a(Context context) {
        Class<C7455k> cls = C7455k.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, (String) null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String a = C7447g.m28310a(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            sharedPreferences.edit().putString(str, a).apply();
            return a;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static int m28349b(long j) {
        Class<C7455k> cls = C7455k.class;
        if (C9207a.m34024c(cls)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f21742b;
                if (i >= jArr.length || jArr[i] >= j) {
                    return i;
                }
                i++;
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    static void m28350c(String str, C7456l lVar, String str2, Context context) {
        String str3;
        Class<C7455k> cls = C7455k.class;
        if (!C9207a.m34024c(cls)) {
            if (lVar != null) {
                try {
                    str3 = lVar.toString();
                } catch (Throwable th) {
                    C9207a.m34023b(th, cls);
                    return;
                }
            } else {
                str3 = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str3);
            bundle.putString("fb_mobile_pckg_fp", m28348a(context));
            bundle.putString("fb_mobile_app_cert_hash", C6035a.m24160a(context));
            C6564m mVar = new C6564m(str, str2, (AccessToken) null);
            mVar.mo20548g("fb_mobile_activate_app", bundle);
            if (C6564m.m25884c() != C6549g.C6550a.EXPLICIT_ONLY) {
                mVar.mo20545a();
            }
        }
    }

    /* renamed from: d */
    private static void m28351d() {
        Class<C7455k> cls = C7455k.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8831r.m32866g(C2645k.APP_EVENTS, f21741a, "Clock skew detected");
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    static void m28352e(String str, C7454j jVar, String str2) {
        String str3;
        Class<C7455k> cls = C7455k.class;
        if (!C9207a.m34024c(cls) && jVar != null) {
            try {
                Long valueOf = Long.valueOf(jVar.mo21860b() - jVar.mo21863e().longValue());
                if (valueOf.longValue() < 0) {
                    valueOf = 0L;
                    m28351d();
                }
                Long valueOf2 = Long.valueOf(jVar.mo21864f());
                if (valueOf2.longValue() < 0) {
                    m28351d();
                    valueOf2 = 0L;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", jVar.mo21861c());
                bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m28349b(valueOf.longValue()))}));
                C7456l g = jVar.mo21865g();
                if (g != null) {
                    str3 = g.toString();
                } else {
                    str3 = "Unclassified";
                }
                bundle.putString("fb_mobile_launch_source", str3);
                bundle.putLong("_logTime", jVar.mo21863e().longValue() / 1000);
                new C6564m(str, str2, (AccessToken) null).mo20547f("fb_mobile_deactivate_app", ((double) valueOf2.longValue()) / 1000.0d, bundle);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
