package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p051d5.C5836f;
import p115i4.C6549g;
import p115i4.C6555i;
import p193o4.C7431a;
import p193o4.C7439c;
import p219q4.C7886a;
import p297w4.C8765a;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p297w4.C8808k;
import p297w4.C8829q;
import p297w4.C8845v;
import p310x4.C8959c;
import p334z4.C9207a;

/* renamed from: com.facebook.d */
public abstract class C2626d {

    /* renamed from: a */
    private static final String f8221a = "com.facebook.d";

    /* renamed from: b */
    private static final HashSet f8222b = new HashSet(Arrays.asList(new C2645k[]{C2645k.DEVELOPER_ERRORS}));

    /* renamed from: c */
    private static Executor f8223c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f8224d;

    /* renamed from: e */
    private static volatile String f8225e;

    /* renamed from: f */
    private static volatile String f8226f;

    /* renamed from: g */
    private static volatile Boolean f8227g;

    /* renamed from: h */
    private static volatile String f8228h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f8229i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f8230j = false;

    /* renamed from: k */
    private static boolean f8231k = false;

    /* renamed from: l */
    private static C8829q f8232l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f8233m;

    /* renamed from: n */
    private static int f8234n = 64206;

    /* renamed from: o */
    private static final Object f8235o = new Object();

    /* renamed from: p */
    private static String f8236p = C8845v.m32931a();

    /* renamed from: q */
    public static boolean f8237q = false;

    /* renamed from: r */
    public static boolean f8238r = false;

    /* renamed from: s */
    private static Boolean f8239s;

    /* renamed from: t */
    private static Boolean f8240t;

    /* renamed from: u */
    private static C2636j f8241u = new C2627a();

    /* renamed from: com.facebook.d$a */
    static class C2627a implements C2636j {
        C2627a() {
        }

        /* renamed from: a */
        public GraphRequest mo8242a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.C2612e eVar) {
            return GraphRequest.m10013K(accessToken, str, jSONObject, eVar);
        }
    }

    /* renamed from: com.facebook.d$b */
    static class C2628b implements Callable {
        C2628b() {
        }

        /* renamed from: a */
        public File call() {
            return C2626d.f8233m.getCacheDir();
        }
    }

    /* renamed from: com.facebook.d$c */
    static class C2629c implements C8808k.C8811c {
        C2629c() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C8959c.m33224a();
            }
        }
    }

    /* renamed from: com.facebook.d$d */
    static class C2630d implements C8808k.C8811c {
        C2630d() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C6555i.m25876a();
            }
        }
    }

    /* renamed from: com.facebook.d$e */
    static class C2631e implements C8808k.C8811c {
        C2631e() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C2626d.f8237q = true;
            }
        }
    }

    /* renamed from: com.facebook.d$f */
    static class C2632f implements C8808k.C8811c {
        C2632f() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C2626d.f8238r = true;
            }
        }
    }

    /* renamed from: com.facebook.d$g */
    static class C2633g implements C8808k.C8811c {
        C2633g() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C5836f.m23512a();
            }
        }
    }

    /* renamed from: com.facebook.d$h */
    static class C2634h implements Callable {

        /* renamed from: d */
        final /* synthetic */ Context f8242d;

        C2634h(C2637k kVar, Context context) {
            this.f8242d = context;
        }

        /* renamed from: a */
        public Void call() {
            C2619b.m10107h().mo8234i();
            C2681m.m10414b().mo8453c();
            if (AccessToken.m9967v() && Profile.m10087d() == null) {
                Profile.m10086b();
            }
            C6549g.m25848f(C2626d.f8233m, C2626d.f8224d);
            C2686r.m10444n();
            C6549g.m25849h(this.f8242d.getApplicationContext()).mo20529b();
            return null;
        }
    }

    /* renamed from: com.facebook.d$i */
    static class C2635i implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Context f8243d;

        /* renamed from: e */
        final /* synthetic */ String f8244e;

        C2635i(Context context, String str) {
            this.f8243d = context;
            this.f8244e = str;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C2626d.m10123A(this.f8243d, this.f8244e);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.d$j */
    public interface C2636j {
        /* renamed from: a */
        GraphRequest mo8242a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.C2612e eVar);
    }

    /* renamed from: com.facebook.d$k */
    public interface C2637k {
        /* renamed from: a */
        void mo8248a();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f8239s = bool;
        f8240t = bool;
    }

    /* renamed from: A */
    static void m10123A(Context context, String str) {
        Class<C2626d> cls = C2626d.class;
        if (!C9207a.m34024c(cls)) {
            if (context == null || str == null) {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            try {
                C8765a h = C8765a.m32617h(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0);
                GraphRequest a = f8241u.mo8242a((AccessToken) null, String.format("%s/activities", new Object[]{str}), C7439c.m28299a(C7439c.C7441b.MOBILE_INSTALL_EVENT, h, C6549g.m25845c(context), m10146q(context), context), (GraphRequest.C2612e) null);
                if (j == 0 && a.mo8184g().mo8279g() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e) {
                throw new FacebookException("An error occurred while publishing install.", e);
            } catch (Exception e2) {
                try {
                    C8769a0.m32648U("Facebook-publish", e2);
                } catch (Throwable th) {
                    C9207a.m34023b(th, cls);
                }
            }
        }
    }

    /* renamed from: B */
    public static void m10124B(Context context, String str) {
        Class<C2626d> cls = C2626d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                m10142m().execute(new C2635i(context.getApplicationContext(), str));
                if (C8808k.m32797g(C8808k.C8812d.OnDeviceEventProcessing) && C7886a.m29851b()) {
                    C7886a.m29853d(str, "com.facebook.sdk.attributionTracking");
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: C */
    public static synchronized void m10125C(Context context) {
        synchronized (C2626d.class) {
            m10126D(context, (C2637k) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m10126D(android.content.Context r3, com.facebook.C2626d.C2637k r4) {
        /*
            java.lang.Class<com.facebook.d> r0 = com.facebook.C2626d.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f8239s     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo8248a()     // Catch:{ all -> 0x00ba }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            p297w4.C8775b0.m32716i(r3, r1)     // Catch:{ all -> 0x00ba }
            r1 = 0
            p297w4.C8775b0.m32712e(r3, r1)     // Catch:{ all -> 0x00ba }
            p297w4.C8775b0.m32713f(r3, r1)     // Catch:{ all -> 0x00ba }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x00ba }
            f8233m = r1     // Catch:{ all -> 0x00ba }
            p115i4.C6549g.m25845c(r3)     // Catch:{ all -> 0x00ba }
            android.content.Context r1 = f8233m     // Catch:{ all -> 0x00ba }
            m10155z(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = f8224d     // Catch:{ all -> 0x00ba }
            boolean r1 = p297w4.C8769a0.m32644Q(r1)     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x00b2
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ba }
            f8239s = r1     // Catch:{ all -> 0x00ba }
            boolean r1 = m10137h()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0041
            m10132c()     // Catch:{ all -> 0x00ba }
        L_0x0041:
            android.content.Context r1 = f8233m     // Catch:{ all -> 0x00ba }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0056
            boolean r1 = com.facebook.C2686r.m10437g()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f8233m     // Catch:{ all -> 0x00ba }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = f8224d     // Catch:{ all -> 0x00ba }
            p193o4.C7431a.m28290x(r1, r2)     // Catch:{ all -> 0x00ba }
        L_0x0056:
            p297w4.C8819n.m32844k()     // Catch:{ all -> 0x00ba }
            p297w4.C8832s.m32900x()     // Catch:{ all -> 0x00ba }
            android.content.Context r1 = f8233m     // Catch:{ all -> 0x00ba }
            p297w4.C8774b.m32706b(r1)     // Catch:{ all -> 0x00ba }
            w4.q r1 = new w4.q     // Catch:{ all -> 0x00ba }
            com.facebook.d$b r2 = new com.facebook.d$b     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r1.<init>(r2)     // Catch:{ all -> 0x00ba }
            f8232l = r1     // Catch:{ all -> 0x00ba }
            w4.k$d r1 = p297w4.C8808k.C8812d.Instrument     // Catch:{ all -> 0x00ba }
            com.facebook.d$c r2 = new com.facebook.d$c     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            p297w4.C8808k.m32791a(r1, r2)     // Catch:{ all -> 0x00ba }
            w4.k$d r1 = p297w4.C8808k.C8812d.AppEvents     // Catch:{ all -> 0x00ba }
            com.facebook.d$d r2 = new com.facebook.d$d     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            p297w4.C8808k.m32791a(r1, r2)     // Catch:{ all -> 0x00ba }
            w4.k$d r1 = p297w4.C8808k.C8812d.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x00ba }
            com.facebook.d$e r2 = new com.facebook.d$e     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            p297w4.C8808k.m32791a(r1, r2)     // Catch:{ all -> 0x00ba }
            w4.k$d r1 = p297w4.C8808k.C8812d.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x00ba }
            com.facebook.d$f r2 = new com.facebook.d$f     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            p297w4.C8808k.m32791a(r1, r2)     // Catch:{ all -> 0x00ba }
            w4.k$d r1 = p297w4.C8808k.C8812d.Monitoring     // Catch:{ all -> 0x00ba }
            com.facebook.d$g r2 = new com.facebook.d$g     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            p297w4.C8808k.m32791a(r1, r2)     // Catch:{ all -> 0x00ba }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x00ba }
            com.facebook.d$h r2 = new com.facebook.d$h     // Catch:{ all -> 0x00ba }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00ba }
            r1.<init>(r2)     // Catch:{ all -> 0x00ba }
            java.util.concurrent.Executor r3 = m10142m()     // Catch:{ all -> 0x00ba }
            r3.execute(r1)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)
            return
        L_0x00b2:
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x00ba }
            throw r3     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2626d.m10126D(android.content.Context, com.facebook.d$k):void");
    }

    /* renamed from: E */
    public static void m10127E(boolean z) {
        C2686r.m10448r(z);
    }

    /* renamed from: F */
    public static void m10128F(boolean z) {
        C2686r.m10449s(z);
        if (z) {
            m10132c();
        }
    }

    /* renamed from: G */
    public static void m10129G(boolean z) {
        C2686r.m10450t(z);
        if (z) {
            C7431a.m28290x((Application) f8233m, f8224d);
        }
    }

    /* renamed from: c */
    public static void m10132c() {
        f8240t = Boolean.TRUE;
    }

    /* renamed from: d */
    public static boolean m10133d() {
        return C2686r.m10435e();
    }

    /* renamed from: e */
    public static Context m10134e() {
        C8775b0.m32718k();
        return f8233m;
    }

    /* renamed from: f */
    public static String m10135f() {
        C8775b0.m32718k();
        return f8224d;
    }

    /* renamed from: g */
    public static String m10136g() {
        C8775b0.m32718k();
        return f8225e;
    }

    /* renamed from: h */
    public static boolean m10137h() {
        return C2686r.m10436f();
    }

    /* renamed from: i */
    public static boolean m10138i() {
        return C2686r.m10437g();
    }

    /* renamed from: j */
    public static int m10139j() {
        C8775b0.m32718k();
        return f8234n;
    }

    /* renamed from: k */
    public static String m10140k() {
        C8775b0.m32718k();
        return f8226f;
    }

    /* renamed from: l */
    public static boolean m10141l() {
        return C2686r.m10438h();
    }

    /* renamed from: m */
    public static Executor m10142m() {
        synchronized (f8235o) {
            if (f8223c == null) {
                f8223c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f8223c;
    }

    /* renamed from: n */
    public static String m10143n() {
        return f8228h;
    }

    /* renamed from: o */
    public static String m10144o() {
        C8769a0.m32649V(f8221a, String.format("getGraphApiVersion: %s", new Object[]{f8236p}));
        return f8236p;
    }

    /* renamed from: p */
    public static String m10145p() {
        String str;
        AccessToken h = AccessToken.m9965h();
        if (h != null) {
            str = h.mo8130m();
        } else {
            str = null;
        }
        if (str == null) {
            return f8228h;
        }
        if (str.equals("gaming")) {
            return f8228h.replace("facebook.com", "fb.gg");
        }
        return f8228h;
    }

    /* renamed from: q */
    public static boolean m10146q(Context context) {
        C8775b0.m32718k();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: r */
    public static boolean m10147r() {
        return C2686r.m10439i();
    }

    /* renamed from: s */
    public static long m10148s() {
        C8775b0.m32718k();
        return f8229i.get();
    }

    /* renamed from: t */
    public static String m10149t() {
        return "9.0.0";
    }

    /* renamed from: u */
    public static boolean m10150u() {
        return f8230j;
    }

    /* renamed from: v */
    public static synchronized boolean m10151v() {
        boolean booleanValue;
        synchronized (C2626d.class) {
            booleanValue = f8240t.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: w */
    public static synchronized boolean m10152w() {
        boolean booleanValue;
        synchronized (C2626d.class) {
            booleanValue = f8239s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: x */
    public static boolean m10153x() {
        return f8231k;
    }

    /* renamed from: y */
    public static boolean m10154y(C2645k kVar) {
        boolean z;
        HashSet hashSet = f8222b;
        synchronized (hashSet) {
            if (!m10150u() || !hashSet.contains(kVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: z */
    static void m10155z(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (f8224d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                f8224d = str.substring(2);
                            } else {
                                f8224d = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f8225e == null) {
                        f8225e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f8226f == null) {
                        f8226f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f8234n == 64206) {
                        f8234n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f8227g == null) {
                        f8227g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }
}
