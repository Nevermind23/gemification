package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.C4337oc;
import com.google.android.gms.internal.measurement.C4416t6;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8245b;
import p248s7.C8261o;
import p260t6.C8404f;
import p260t6.C8407i;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C4791t4 implements C4737o5 {

    /* renamed from: H */
    private static volatile C4791t4 f14873H;

    /* renamed from: A */
    private volatile Boolean f14874A;

    /* renamed from: B */
    protected Boolean f14875B;

    /* renamed from: C */
    protected Boolean f14876C;

    /* renamed from: D */
    private volatile boolean f14877D;

    /* renamed from: E */
    private int f14878E;

    /* renamed from: F */
    private final AtomicInteger f14879F = new AtomicInteger(0);

    /* renamed from: G */
    final long f14880G;

    /* renamed from: a */
    private final Context f14881a;

    /* renamed from: b */
    private final String f14882b;

    /* renamed from: c */
    private final String f14883c;

    /* renamed from: d */
    private final String f14884d;

    /* renamed from: e */
    private final boolean f14885e;

    /* renamed from: f */
    private final C4597c f14886f;

    /* renamed from: g */
    private final C4643g f14887g;

    /* renamed from: h */
    private final C4614d4 f14888h;

    /* renamed from: i */
    private final C4746p3 f14889i;

    /* renamed from: j */
    private final C4769r4 f14890j;

    /* renamed from: k */
    private final C4817v8 f14891k;

    /* renamed from: l */
    private final C4785s9 f14892l;

    /* renamed from: m */
    private final C4691k3 f14893m;

    /* renamed from: n */
    private final C8404f f14894n;

    /* renamed from: o */
    private final C4640f7 f14895o;

    /* renamed from: p */
    private final C4793t6 f14896p;

    /* renamed from: q */
    private final C4832x1 f14897q;

    /* renamed from: r */
    private final C4826w6 f14898r;

    /* renamed from: s */
    private final String f14899s;

    /* renamed from: t */
    private C4680j3 f14900t;

    /* renamed from: u */
    private C4641f8 f14901u;

    /* renamed from: v */
    private C4731o f14902v;

    /* renamed from: w */
    private C4658h3 f14903w;

    /* renamed from: x */
    private boolean f14904x = false;

    /* renamed from: y */
    private Boolean f14905y;

    /* renamed from: z */
    private long f14906z;

    C4791t4(C4770r5 r5Var) {
        long j;
        Bundle bundle;
        boolean z = false;
        C7264i.m27902k(r5Var);
        Context context = r5Var.f14822a;
        C4597c cVar = new C4597c(context);
        this.f14886f = cVar;
        C4613d3.f14257a = cVar;
        this.f14881a = context;
        this.f14882b = r5Var.f14823b;
        this.f14883c = r5Var.f14824c;
        this.f14884d = r5Var.f14825d;
        this.f14885e = r5Var.f14829h;
        this.f14874A = r5Var.f14826e;
        this.f14899s = r5Var.f14831j;
        this.f14877D = true;
        zzcl zzcl = r5Var.f14828g;
        if (!(zzcl == null || (bundle = zzcl.f13869j) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f14875B = (Boolean) obj;
            }
            Object obj2 = zzcl.f13869j.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f14876C = (Boolean) obj2;
            }
        }
        C4416t6.m16739d(context);
        C8404f d = C8407i.m31544d();
        this.f14894n = d;
        Long l = r5Var.f14830i;
        if (l != null) {
            j = l.longValue();
        } else {
            j = d.mo23594a();
        }
        this.f14880G = j;
        this.f14887g = new C4643g(this);
        C4614d4 d4Var = new C4614d4(this);
        d4Var.mo14641l();
        this.f14888h = d4Var;
        C4746p3 p3Var = new C4746p3(this);
        p3Var.mo14641l();
        this.f14889i = p3Var;
        C4785s9 s9Var = new C4785s9(this);
        s9Var.mo14641l();
        this.f14892l = s9Var;
        this.f14893m = new C4691k3(new C4759q5(r5Var, this));
        this.f14897q = new C4832x1(this);
        C4640f7 f7Var = new C4640f7(this);
        f7Var.mo14923j();
        this.f14895o = f7Var;
        C4793t6 t6Var = new C4793t6(this);
        t6Var.mo14923j();
        this.f14896p = t6Var;
        C4817v8 v8Var = new C4817v8(this);
        v8Var.mo14923j();
        this.f14891k = v8Var;
        C4826w6 w6Var = new C4826w6(this);
        w6Var.mo14641l();
        this.f14898r = w6Var;
        C4769r4 r4Var = new C4769r4(this);
        r4Var.mo14641l();
        this.f14890j = r4Var;
        zzcl zzcl2 = r5Var.f14828g;
        z = (zzcl2 == null || zzcl2.f13864e == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C4793t6 I = mo14851I();
            if (I.f14613a.f14881a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f14613a.f14881a.getApplicationContext();
                if (I.f14909c == null) {
                    I.f14909c = new C4782s6(I);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f14909c);
                    application.registerActivityLifecycleCallbacks(I.f14909c);
                    I.f14613a.mo14551d().mo14679v().mo14615a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo14551d().mo14680w().mo14615a("Application context is not an Application");
        }
        r4Var.mo14776z(new C4780s4(this, r5Var));
    }

    /* renamed from: H */
    public static C4791t4 m18288H(Context context, zzcl zzcl, Long l) {
        Bundle bundle;
        if (zzcl != null && (zzcl.f13867h == null || zzcl.f13868i == null)) {
            zzcl = new zzcl(zzcl.f13863d, zzcl.f13864e, zzcl.f13865f, zzcl.f13866g, (String) null, (String) null, zzcl.f13869j, (String) null);
        }
        C7264i.m27902k(context);
        C7264i.m27902k(context.getApplicationContext());
        if (f14873H == null) {
            synchronized (C4791t4.class) {
                if (f14873H == null) {
                    f14873H = new C4791t4(new C4770r5(context, zzcl, l));
                }
            }
        } else if (!(zzcl == null || (bundle = zzcl.f13869j) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C7264i.m27902k(f14873H);
            f14873H.f14874A = Boolean.valueOf(zzcl.f13869j.getBoolean("dataCollectionDefaultEnabled"));
        }
        C7264i.m27902k(f14873H);
        return f14873H;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m18289e(C4791t4 t4Var, C4770r5 r5Var) {
        t4Var.mo14552f().mo14554h();
        t4Var.f14887g.mo14417w();
        C4731o oVar = new C4731o(t4Var);
        oVar.mo14641l();
        t4Var.f14902v = oVar;
        C4658h3 h3Var = new C4658h3(t4Var, r5Var.f14827f);
        h3Var.mo14923j();
        t4Var.f14903w = h3Var;
        C4680j3 j3Var = new C4680j3(t4Var);
        j3Var.mo14923j();
        t4Var.f14900t = j3Var;
        C4641f8 f8Var = new C4641f8(t4Var);
        f8Var.mo14923j();
        t4Var.f14901u = f8Var;
        t4Var.f14892l.mo14642m();
        t4Var.f14888h.mo14642m();
        t4Var.f14903w.mo14924k();
        C4724n3 u = t4Var.mo14551d().mo14678u();
        t4Var.f14887g.mo14411q();
        u.mo14616b("App measurement initialized, version", 77000L);
        t4Var.mo14551d().mo14678u().mo14615a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = h3Var.mo14446s();
        if (TextUtils.isEmpty(t4Var.f14882b)) {
            if (t4Var.mo14856N().mo14813U(s)) {
                t4Var.mo14551d().mo14678u().mo14615a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                t4Var.mo14551d().mo14678u().mo14615a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        t4Var.mo14551d().mo14674q().mo14615a("Debug-level message logging enabled");
        if (t4Var.f14878E != t4Var.f14879F.get()) {
            t4Var.mo14551d().mo14675r().mo14617c("Not all components initialized", Integer.valueOf(t4Var.f14878E), Integer.valueOf(t4Var.f14879F.get()));
        }
        t4Var.f14904x = true;
    }

    /* renamed from: t */
    static final void m18290t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m18291u(C4715m5 m5Var) {
        if (m5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m18292v(C4801u3 u3Var) {
        if (u3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!u3Var.mo14925m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u3Var.getClass())));
        }
    }

    /* renamed from: w */
    private static final void m18293w(C4726n5 n5Var) {
        if (n5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!n5Var.mo14643n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(n5Var.getClass())));
        }
    }

    /* renamed from: A */
    public final C4731o mo14844A() {
        m18293w(this.f14902v);
        return this.f14902v;
    }

    /* renamed from: B */
    public final C4658h3 mo14845B() {
        m18292v(this.f14903w);
        return this.f14903w;
    }

    /* renamed from: C */
    public final C4680j3 mo14846C() {
        m18292v(this.f14900t);
        return this.f14900t;
    }

    /* renamed from: D */
    public final C4691k3 mo14847D() {
        return this.f14893m;
    }

    /* renamed from: E */
    public final C4746p3 mo14848E() {
        C4746p3 p3Var = this.f14889i;
        if (p3Var == null || !p3Var.mo14643n()) {
            return null;
        }
        return p3Var;
    }

    /* renamed from: F */
    public final C4614d4 mo14849F() {
        m18291u(this.f14888h);
        return this.f14888h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final C4769r4 mo14850G() {
        return this.f14890j;
    }

    /* renamed from: I */
    public final C4793t6 mo14851I() {
        m18292v(this.f14896p);
        return this.f14896p;
    }

    /* renamed from: J */
    public final C4826w6 mo14852J() {
        m18293w(this.f14898r);
        return this.f14898r;
    }

    /* renamed from: K */
    public final C4640f7 mo14853K() {
        m18292v(this.f14895o);
        return this.f14895o;
    }

    /* renamed from: L */
    public final C4641f8 mo14854L() {
        m18292v(this.f14901u);
        return this.f14901u;
    }

    /* renamed from: M */
    public final C4817v8 mo14855M() {
        m18292v(this.f14891k);
        return this.f14891k;
    }

    /* renamed from: N */
    public final C4785s9 mo14856N() {
        m18291u(this.f14892l);
        return this.f14892l;
    }

    /* renamed from: O */
    public final String mo14857O() {
        return this.f14882b;
    }

    /* renamed from: P */
    public final String mo14858P() {
        return this.f14883c;
    }

    /* renamed from: Q */
    public final String mo14859Q() {
        return this.f14884d;
    }

    /* renamed from: R */
    public final String mo14860R() {
        return this.f14899s;
    }

    /* renamed from: a */
    public final C8404f mo14548a() {
        return this.f14894n;
    }

    /* renamed from: b */
    public final C4597c mo14549b() {
        return this.f14886f;
    }

    /* renamed from: c */
    public final Context mo14550c() {
        return this.f14881a;
    }

    /* renamed from: d */
    public final C4746p3 mo14551d() {
        m18293w(this.f14889i);
        return this.f14889i;
    }

    /* renamed from: f */
    public final C4769r4 mo14552f() {
        m18293w(this.f14890j);
        return this.f14890j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14861g() {
        this.f14879F.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo14862h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo14551d().mo14680w().mo14617c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo14849F().f14275s.mo14962a(true);
            if (bArr == null || bArr.length == 0) {
                mo14551d().mo14674q().mo14615a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", Utils.DOUBLE_EPSILON);
                if (TextUtils.isEmpty(optString)) {
                    mo14551d().mo14674q().mo14615a("Deferred Deep Link is empty.");
                    return;
                }
                C4785s9 N = mo14856N();
                C4791t4 t4Var = N.f14613a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f14613a.f14881a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f14896p.mo14910u("auto", "_cmp", bundle);
                        C4785s9 N2 = mo14856N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f14613a.f14881a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f14613a.f14881a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f14613a.mo14551d().mo14675r().mo14616b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo14551d().mo14680w().mo14617c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo14551d().mo14675r().mo14616b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo14551d().mo14680w().mo14617c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14863i() {
        this.f14878E++;
    }

    /* renamed from: j */
    public final void mo14864j() {
        mo14552f().mo14554h();
        m18293w(mo14852J());
        String s = mo14845B().mo14446s();
        Pair p = mo14849F().mo14331p(s);
        if (!this.f14887g.mo14397A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo14551d().mo14674q().mo14615a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C4826w6 J = mo14852J();
        J.mo14640k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f14613a.f14881a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo14551d().mo14680w().mo14615a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        C4785s9 N = mo14856N();
        mo14845B().f14613a.f14887g.mo14411q();
        URL s2 = N.mo14830s(77000, s, (String) p.first, mo14849F().f14276t.mo14295a() - 1);
        if (s2 != null) {
            C4826w6 J2 = mo14852J();
            C8261o oVar = new C8261o(this);
            J2.mo14554h();
            J2.mo14640k();
            C7264i.m27902k(s2);
            C7264i.m27902k(oVar);
            J2.f14613a.mo14552f().mo14775y(new C4815v6(J2, s, s2, (byte[]) null, (Map) null, oVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo14865k(boolean z) {
        this.f14874A = Boolean.valueOf(z);
    }

    /* renamed from: l */
    public final void mo14866l(boolean z) {
        mo14552f().mo14554h();
        this.f14877D = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo14867m(zzcl zzcl) {
        C8245b bVar;
        mo14552f().mo14554h();
        C8245b q = mo14849F().mo14332q();
        C4614d4 F = mo14849F();
        C4791t4 t4Var = F.f14613a;
        F.mo14554h();
        int i = 100;
        int i2 = F.mo14330o().getInt("consent_source", 100);
        C4643g gVar = this.f14887g;
        C4791t4 t4Var2 = gVar.f14613a;
        Boolean t = gVar.mo14414t("google_analytics_default_allow_ad_storage");
        C4643g gVar2 = this.f14887g;
        C4791t4 t4Var3 = gVar2.f14613a;
        Boolean t2 = gVar2.mo14414t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo14849F().mo14338w(-10)) {
            bVar = new C8245b(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo14845B().mo14447t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo14851I().mo14884G(C8245b.f23454b, -10, this.f14880G);
            } else if (TextUtils.isEmpty(mo14845B().mo14447t()) && zzcl != null && zzcl.f13869j != null && mo14849F().mo14338w(30)) {
                bVar = C8245b.m31052a(zzcl.f13869j);
                if (!bVar.equals(C8245b.f23454b)) {
                    i = 30;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            mo14851I().mo14884G(bVar, i, this.f14880G);
            q = bVar;
        }
        mo14851I().mo14887J(q);
        if (mo14849F().f14261e.mo14295a() == 0) {
            mo14551d().mo14679v().mo14616b("Persisting first open", Long.valueOf(this.f14880G));
            mo14849F().f14261e.mo14296b(this.f14880G);
        }
        mo14851I().f14920n.mo14971c();
        if (mo14872r()) {
            if (!TextUtils.isEmpty(mo14845B().mo14447t()) || !TextUtils.isEmpty(mo14845B().mo14445r())) {
                C4785s9 N = mo14856N();
                String t3 = mo14845B().mo14447t();
                C4614d4 F2 = mo14849F();
                F2.mo14554h();
                String string = F2.mo14330o().getString("gmp_app_id", (String) null);
                String r = mo14845B().mo14445r();
                C4614d4 F3 = mo14849F();
                F3.mo14554h();
                if (N.mo14817d0(t3, string, r, F3.mo14330o().getString("admob_app_id", (String) null))) {
                    mo14551d().mo14678u().mo14615a("Rechecking which service to use due to a GMP App Id change");
                    C4614d4 F4 = mo14849F();
                    F4.mo14554h();
                    Boolean r2 = F4.mo14333r();
                    SharedPreferences.Editor edit = F4.mo14330o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo14334s(r2);
                    }
                    mo14846C().mo14477q();
                    this.f14901u.mo14378Q();
                    this.f14901u.mo14377P();
                    mo14849F().f14261e.mo14296b(this.f14880G);
                    mo14849F().f14263g.mo14320b((String) null);
                }
                C4614d4 F5 = mo14849F();
                String t4 = mo14845B().mo14447t();
                F5.mo14554h();
                SharedPreferences.Editor edit2 = F5.mo14330o().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                C4614d4 F6 = mo14849F();
                String r3 = mo14845B().mo14445r();
                F6.mo14554h();
                SharedPreferences.Editor edit3 = F6.mo14330o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo14849F().mo14332q().mo23435i(C8243a.ANALYTICS_STORAGE)) {
                mo14849F().f14263g.mo14320b((String) null);
            }
            mo14851I().mo14880C(mo14849F().f14263g.mo14319a());
            C4337oc.m16389c();
            if (this.f14887g.mo14398B((String) null, C4636f3.f14373g0)) {
                try {
                    mo14856N().f14613a.f14881a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo14849F().f14277u.mo14319a())) {
                        mo14551d().mo14680w().mo14615a("Remote config removed with active feature rollouts");
                        mo14849F().f14277u.mo14320b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo14845B().mo14447t()) || !TextUtils.isEmpty(mo14845B().mo14445r())) {
                boolean o = mo14869o();
                if (!mo14849F().mo14336u() && !this.f14887g.mo14401E()) {
                    mo14849F().mo14335t(!o);
                }
                if (o) {
                    mo14851I().mo14903f0();
                }
                mo14855M().f14976d.mo14930a();
                mo14854L().mo14380S(new AtomicReference());
                mo14854L().mo14392v(mo14849F().f14280x.mo14974a());
            }
        } else if (mo14869o()) {
            if (!mo14856N().mo14812T("android.permission.INTERNET")) {
                mo14551d().mo14675r().mo14615a("App is missing INTERNET permission");
            }
            if (!mo14856N().mo14812T("android.permission.ACCESS_NETWORK_STATE")) {
                mo14551d().mo14675r().mo14615a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C8708e.m32461a(this.f14881a).mo24092f() && !this.f14887g.mo14403G()) {
                if (!C4785s9.m18221a0(this.f14881a)) {
                    mo14551d().mo14675r().mo14615a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4785s9.m18222b0(this.f14881a, false)) {
                    mo14551d().mo14675r().mo14615a("AppMeasurementService not registered/enabled");
                }
            }
            mo14551d().mo14675r().mo14615a("Uploading is not possible. App measurement disabled");
        }
        mo14849F().f14270n.mo14962a(true);
    }

    /* renamed from: n */
    public final boolean mo14868n() {
        return this.f14874A != null && this.f14874A.booleanValue();
    }

    /* renamed from: o */
    public final boolean mo14869o() {
        return mo14874x() == 0;
    }

    /* renamed from: p */
    public final boolean mo14870p() {
        mo14552f().mo14554h();
        return this.f14877D;
    }

    /* renamed from: q */
    public final boolean mo14871q() {
        return TextUtils.isEmpty(this.f14882b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo14872r() {
        boolean z;
        if (this.f14904x) {
            mo14552f().mo14554h();
            Boolean bool = this.f14905y;
            if (bool == null || this.f14906z == 0 || (!bool.booleanValue() && Math.abs(this.f14894n.mo23596c() - this.f14906z) > 1000)) {
                this.f14906z = this.f14894n.mo23596c();
                boolean z2 = true;
                if (!mo14856N().mo14812T("android.permission.INTERNET") || !mo14856N().mo14812T("android.permission.ACCESS_NETWORK_STATE") || (!C8708e.m32461a(this.f14881a).mo24092f() && !this.f14887g.mo14403G() && (!C4785s9.m18221a0(this.f14881a) || !C4785s9.m18222b0(this.f14881a, false)))) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f14905y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo14856N().mo14805M(mo14845B().mo14447t(), mo14845B().mo14445r()) && TextUtils.isEmpty(mo14845B().mo14445r())) {
                        z2 = false;
                    }
                    this.f14905y = Boolean.valueOf(z2);
                }
            }
            return this.f14905y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: s */
    public final boolean mo14873s() {
        return this.f14885e;
    }

    /* renamed from: x */
    public final int mo14874x() {
        mo14552f().mo14554h();
        if (this.f14887g.mo14401E()) {
            return 1;
        }
        Boolean bool = this.f14876C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo14552f().mo14554h();
        if (!this.f14877D) {
            return 8;
        }
        Boolean r = mo14849F().mo14333r();
        if (r == null) {
            C4643g gVar = this.f14887g;
            C4597c cVar = gVar.f14613a.f14886f;
            Boolean t = gVar.mo14414t("firebase_analytics_collection_enabled");
            if (t == null) {
                Boolean bool2 = this.f14875B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.f14874A == null || this.f14874A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (r.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* renamed from: y */
    public final C4832x1 mo14875y() {
        C4832x1 x1Var = this.f14897q;
        if (x1Var != null) {
            return x1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C4643g mo14876z() {
        return this.f14887g;
    }
}
