package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.GraphRequest;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6564m;
import p297w4.C8765a;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p334z4.C9207a;

/* renamed from: com.facebook.r */
abstract class C2686r {

    /* renamed from: a */
    private static final String f8421a = "com.facebook.r";

    /* renamed from: b */
    private static AtomicBoolean f8422b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f8423c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C2688b f8424d = new C2688b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C2688b f8425e = new C2688b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    private static C2688b f8426f = new C2688b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    private static C2688b f8427g = new C2688b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static C2688b f8428h = new C2688b(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    private static SharedPreferences f8429i;

    /* renamed from: com.facebook.r$a */
    static class C2687a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ long f8430d;

        C2687a(long j) {
            this.f8430d = j;
        }

        public void run() {
            C8817m o;
            String str;
            if (!C9207a.m34024c(this)) {
                try {
                    if (C2686r.m10431a().mo8470a() && (o = C8819n.m32848o(C2626d.m10135f(), false)) != null && o.mo24239b()) {
                        C8765a h = C8765a.m32617h(C2626d.m10134e());
                        if (h == null || h.mo24172b() == null) {
                            str = null;
                        } else {
                            str = h.mo24172b();
                        }
                        if (str != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("advertiser_id", h.mo24172b());
                            bundle.putString("fields", "auto_event_setup_enabled");
                            GraphRequest J = GraphRequest.m10012J((AccessToken) null, C2626d.m10135f(), (GraphRequest.C2612e) null);
                            J.mo8182a0(true);
                            J.mo8181Z(bundle);
                            JSONObject h2 = J.mo8184g().mo8280h();
                            if (h2 != null) {
                                C2686r.m10432b().f8432b = Boolean.valueOf(h2.optBoolean("auto_event_setup_enabled", false));
                                C2686r.m10432b().f8434d = this.f8430d;
                                C2686r.m10433c(C2686r.m10432b());
                            }
                        }
                    }
                    C2686r.m10434d().set(false);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.r$b */
    private static class C2688b {

        /* renamed from: a */
        String f8431a;

        /* renamed from: b */
        Boolean f8432b;

        /* renamed from: c */
        boolean f8433c;

        /* renamed from: d */
        long f8434d;

        C2688b(boolean z, String str) {
            this.f8433c = z;
            this.f8431a = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8470a() {
            Boolean bool = this.f8432b;
            return bool == null ? this.f8433c : bool.booleanValue();
        }
    }

    /* renamed from: a */
    static /* synthetic */ C2688b m10431a() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f8426f;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ C2688b m10432b() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f8427g;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m10433c(C2688b bVar) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10452v(bVar);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ AtomicBoolean m10434d() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f8423c;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m10435e() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            m10441k();
            return f8426f.mo8470a();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m10436f() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            m10441k();
            return f8424d.mo8470a();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m10437g() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            m10441k();
            return f8425e.mo8470a();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m10438h() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            m10441k();
            return f8427g.mo8470a();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m10439i() {
        Class<C2686r> cls = C2686r.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            m10441k();
            return f8428h.mo8470a();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: j */
    private static void m10440j() {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10447q(f8427g);
                long currentTimeMillis = System.currentTimeMillis();
                C2688b bVar = f8427g;
                if (bVar.f8432b == null || currentTimeMillis - bVar.f8434d >= 604800000) {
                    bVar.f8432b = null;
                    bVar.f8434d = 0;
                    if (f8423c.compareAndSet(false, true)) {
                        C2626d.m10142m().execute(new C2687a(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: k */
    public static void m10441k() {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (C2626d.m10152w() && f8422b.compareAndSet(false, true)) {
                    f8429i = C2626d.m10134e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    m10442l(f8425e, f8426f, f8424d);
                    m10440j();
                    m10446p();
                    m10445o();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: l */
    private static void m10442l(C2688b... bVarArr) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            int i = 0;
            while (i < bVarArr.length) {
                try {
                    C2688b bVar = bVarArr[i];
                    if (bVar == f8427g) {
                        m10440j();
                    } else if (bVar.f8432b == null) {
                        m10447q(bVar);
                        if (bVar.f8432b == null) {
                            m10443m(bVar);
                        }
                    } else {
                        m10452v(bVar);
                    }
                    i++;
                } catch (Throwable th) {
                    C9207a.m34023b(th, cls);
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private static void m10443m(C2688b bVar) {
        Bundle bundle;
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10451u();
                Context e = C2626d.m10134e();
                ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(bVar.f8431a)) {
                    bVar.f8432b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.f8431a, bVar.f8433c));
                }
            } catch (PackageManager.NameNotFoundException e2) {
                C8769a0.m32648U(f8421a, e2);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: n */
    static void m10444n() {
        Bundle bundle;
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Context e = C2626d.m10134e();
                ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    C6564m mVar = new C6564m(e);
                    Bundle bundle2 = new Bundle();
                    if (!C8769a0.m32637J()) {
                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        Log.w(f8421a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    mVar.mo20548g("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: o */
    private static void m10445o() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (f8422b.get() && C2626d.m10152w()) {
                    Context e = C2626d.m10134e();
                    int i7 = 0;
                    if (f8424d.mo8470a()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i8 = (i << 0) | 0;
                    if (f8425e.mo8470a()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int i9 = i8 | (i2 << 1);
                    if (f8426f.mo8470a()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i12 = i9 | (i3 << 2);
                    if (f8428h.mo8470a()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i13 = i12 | (i4 << 3);
                    int i14 = f8429i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i14 != i13) {
                        f8429i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).commit();
                        try {
                            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                boolean[] zArr = {true, true, true, true};
                                int i15 = 0;
                                i5 = 0;
                                int i16 = 0;
                                while (i15 < 4) {
                                    try {
                                        if (applicationInfo.metaData.containsKey(strArr[i15])) {
                                            i6 = 1;
                                        } else {
                                            i6 = 0;
                                        }
                                        i16 |= i6 << i15;
                                        i5 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                        i15++;
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                }
                                i7 = i16;
                                C6564m mVar = new C6564m(e);
                                Bundle bundle = new Bundle();
                                bundle.putInt("usage", i7);
                                bundle.putInt("initial", i5);
                                bundle.putInt("previous", i14);
                                bundle.putInt("current", i13);
                                mVar.mo20546e(bundle);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        i5 = 0;
                        C6564m mVar2 = new C6564m(e);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("usage", i7);
                        bundle2.putInt("initial", i5);
                        bundle2.putInt("previous", i14);
                        bundle2.putInt("current", i13);
                        mVar2.mo20546e(bundle2);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: p */
    private static void m10446p() {
        Bundle bundle;
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                Context e = C2626d.m10134e();
                ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                        Log.w(f8421a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(f8421a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!m10435e()) {
                        Log.w(f8421a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: q */
    private static void m10447q(C2688b bVar) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10451u();
                String string = f8429i.getString(bVar.f8431a, "");
                if (!string.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(string);
                    bVar.f8432b = Boolean.valueOf(jSONObject.getBoolean(C11755a.C11756a.f34100b));
                    bVar.f8434d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException e) {
                C8769a0.m32648U(f8421a, e);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: r */
    public static void m10448r(boolean z) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f8426f.f8432b = Boolean.valueOf(z);
                f8426f.f8434d = System.currentTimeMillis();
                if (f8422b.get()) {
                    m10452v(f8426f);
                } else {
                    m10441k();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: s */
    public static void m10449s(boolean z) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f8424d.f8432b = Boolean.valueOf(z);
                f8424d.f8434d = System.currentTimeMillis();
                if (f8422b.get()) {
                    m10452v(f8424d);
                } else {
                    m10441k();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: t */
    public static void m10450t(boolean z) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                f8425e.f8432b = Boolean.valueOf(z);
                f8425e.f8434d = System.currentTimeMillis();
                if (f8422b.get()) {
                    m10452v(f8425e);
                } else {
                    m10441k();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: u */
    private static void m10451u() {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (!f8422b.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: v */
    private static void m10452v(C2688b bVar) {
        Class<C2686r> cls = C2686r.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10451u();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C11755a.C11756a.f34100b, bVar.f8432b);
                jSONObject.put("last_timestamp", bVar.f8434d);
                f8429i.edit().putString(bVar.f8431a, jSONObject.toString()).commit();
                m10445o();
            } catch (Exception e) {
                C8769a0.m32648U(f8421a, e);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
