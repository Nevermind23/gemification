package p115i4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2626d;
import com.facebook.C2645k;
import com.facebook.FacebookException;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p115i4.C6549g;
import p193o4.C7431a;
import p219q4.C7886a;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p297w4.C8808k;
import p297w4.C8813l;
import p297w4.C8819n;
import p297w4.C8825o;
import p297w4.C8831r;
import p334z4.C9207a;

/* renamed from: i4.h */
class C6551h {

    /* renamed from: c */
    private static final String f20000c = "i4.h";

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f20001d;

    /* renamed from: e */
    private static C6549g.C6550a f20002e = C6549g.C6550a.AUTO;

    /* renamed from: f */
    private static final Object f20003f = new Object();

    /* renamed from: g */
    private static String f20004g;

    /* renamed from: h */
    private static boolean f20005h;

    /* renamed from: i */
    private static String f20006i;

    /* renamed from: a */
    private final String f20007a;

    /* renamed from: b */
    private final C6530a f20008b;

    /* renamed from: i4.h$a */
    static class C6552a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Context f20009d;

        /* renamed from: e */
        final /* synthetic */ C6551h f20010e;

        C6552a(Context context, C6551h hVar) {
            this.f20009d = context;
            this.f20010e = hVar;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.f20009d.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                        sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                        this.f20010e.mo20536p("fb_sdk_initialize", (Double) null, bundle);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: i4.h$b */
    static class C6553b implements C8825o.C8827b {
        C6553b() {
        }

        /* renamed from: a */
        public void mo20541a(String str) {
            C6551h.m25865v(str);
        }
    }

    /* renamed from: i4.h$c */
    static class C6554c implements Runnable {
        C6554c() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    HashSet<String> hashSet = new HashSet<>();
                    for (C6530a b : C6540e.m25835m()) {
                        hashSet.add(b.mo20509b());
                    }
                    for (String o : hashSet) {
                        C8819n.m32848o(o, true);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    C6551h(Context context, String str, AccessToken accessToken) {
        this(C8769a0.m32686q(context), str, accessToken);
    }

    /* renamed from: a */
    static void m25853a(Application application, String str) {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (C2626d.m10152w()) {
                    C6533b.m25807d();
                    C6569p.m25913g();
                    if (str == null) {
                        str = C2626d.m10135f();
                    }
                    C2626d.m10124B(application, str);
                    C7431a.m28290x(application, str);
                    return;
                }
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static void m25854b() {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (m25857f() != C6549g.C6550a.EXPLICIT_ONLY) {
                    C6540e.m25833k(C6561j.EAGER_FLUSHING_EVENT);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: d */
    static Executor m25855d() {
        Class<C6551h> cls = C6551h.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if (f20001d == null) {
                m25861j();
            }
            return f20001d;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static String m25856e(Context context) {
        if (C9207a.m34024c(C6551h.class)) {
            return null;
        }
        try {
            if (f20004g == null) {
                synchronized (f20003f) {
                    if (f20004g == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                        f20004g = string;
                        if (string == null) {
                            f20004g = "XZ" + UUID.randomUUID().toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f20004g).apply();
                        }
                    }
                }
            }
            return f20004g;
        } catch (Throwable th) {
            C9207a.m34023b(th, C6551h.class);
            return null;
        }
    }

    /* renamed from: f */
    static C6549g.C6550a m25857f() {
        C6549g.C6550a aVar;
        if (C9207a.m34024c(C6551h.class)) {
            return null;
        }
        try {
            synchronized (f20003f) {
                aVar = f20002e;
            }
            return aVar;
        } catch (Throwable th) {
            C9207a.m34023b(th, C6551h.class);
            return null;
        }
    }

    /* renamed from: g */
    static String m25858g() {
        Class<C6551h> cls = C6551h.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C8825o.m32854d(new C6553b());
            return C2626d.m10134e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", (String) null);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    static String m25859h() {
        String str;
        if (C9207a.m34024c(C6551h.class)) {
            return null;
        }
        try {
            synchronized (f20003f) {
                str = f20006i;
            }
            return str;
        } catch (Throwable th) {
            C9207a.m34023b(th, C6551h.class);
            return null;
        }
    }

    /* renamed from: i */
    static void m25860i(Context context, String str) {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (C2626d.m10138i()) {
                    f20001d.execute(new C6552a(context, new C6551h(context, str, (AccessToken) null)));
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: j */
    private static void m25861j() {
        if (!C9207a.m34024c(C6551h.class)) {
            try {
                synchronized (f20003f) {
                    if (f20001d == null) {
                        f20001d = new ScheduledThreadPoolExecutor(1);
                        f20001d.scheduleAtFixedRate(new C6554c(), 0, 86400, TimeUnit.SECONDS);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, C6551h.class);
            }
        }
    }

    /* renamed from: k */
    private static void m25862k(C6535c cVar, C6530a aVar) {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C6540e.m25830h(aVar, cVar);
                if (C8808k.m32797g(C8808k.C8812d.OnDevicePostInstallEventProcessing) && C7886a.m29851b()) {
                    C7886a.m29852c(aVar.mo20509b(), cVar);
                }
                if (!cVar.mo20513b() && !f20005h) {
                    if (cVar.mo20515e().equals("fb_mobile_activate_app")) {
                        f20005h = true;
                    } else {
                        C8831r.m32866g(C2645k.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: t */
    private static void m25863t(String str) {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C8831r.m32866g(C2645k.DEVELOPER_ERRORS, "AppEvents", str);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: u */
    static void m25864u() {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                C6540e.m25837o();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: v */
    static void m25865v(String str) {
        Class<C6551h> cls = C6551h.class;
        if (!C9207a.m34024c(cls)) {
            try {
                SharedPreferences sharedPreferences = C2626d.m10134e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (str != null) {
                    sharedPreferences.edit().putString("install_referrer", str).apply();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20531c() {
        if (!C9207a.m34024c(this)) {
            try {
                C6540e.m25833k(C6561j.EXPLICIT);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo20532l(String str, double d, Bundle bundle) {
        if (!C9207a.m34024c(this)) {
            try {
                mo20534n(str, Double.valueOf(d), bundle, false, C7431a.m28283q());
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo20533m(String str, Bundle bundle) {
        if (!C9207a.m34024c(this)) {
            try {
                mo20534n(str, (Double) null, bundle, false, C7431a.m28283q());
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo20534n(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (!C9207a.m34024c(this) && str != null) {
            try {
                if (!str.isEmpty()) {
                    if (C8813l.m32808f("app_events_killswitch", C2626d.m10135f(), false)) {
                        C8831r.m32867h(C2645k.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    m25862k(new C6535c(this.f20007a, str, d, bundle, z, C7431a.m28285s(), uuid), this.f20008b);
                }
            } catch (JSONException e) {
                C8831r.m32867h(C2645k.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C8831r.m32867h(C2645k.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo20535o(String str, String str2) {
        if (!C9207a.m34024c(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                mo20533m(str, bundle);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo20536p(String str, Double d, Bundle bundle) {
        if (!C9207a.m34024c(this)) {
            try {
                mo20534n(str, d, bundle, true, C7431a.m28283q());
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo20537q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C9207a.m34024c(this)) {
            if (bigDecimal == null || currency == null) {
                C8769a0.m32649V(f20000c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            mo20534n(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C7431a.m28283q());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo20538r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!C9207a.m34024c(this)) {
            if (bigDecimal == null) {
                try {
                    m25863t("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            } else if (currency == null) {
                m25863t("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                mo20534n("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C7431a.m28283q());
                m25854b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo20539s(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C9207a.m34024c(this)) {
            try {
                mo20538r(bigDecimal, currency, bundle, true);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    C6551h(String str, String str2, AccessToken accessToken) {
        C8775b0.m32718k();
        this.f20007a = str;
        accessToken = accessToken == null ? AccessToken.m9965h() : accessToken;
        if (accessToken == null || accessToken.mo8137w() || (str2 != null && !str2.equals(accessToken.mo8124g()))) {
            this.f20008b = new C6530a((String) null, str2 == null ? C8769a0.m32698z(C2626d.m10134e()) : str2);
        } else {
            this.f20008b = new C6530a(accessToken);
        }
        m25861j();
    }
}
