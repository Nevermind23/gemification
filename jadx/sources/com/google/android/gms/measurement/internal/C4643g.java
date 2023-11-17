package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p182n6.C7264i;
import p260t6.C8414p;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C4643g extends C4715m5 {

    /* renamed from: b */
    private Boolean f14440b;

    /* renamed from: c */
    private C4632f f14441c = C4621e.f14295a;

    /* renamed from: d */
    private Boolean f14442d;

    C4643g(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: I */
    public static final long m17722I() {
        return ((Long) C4636f3.f14370f.mo14346a((Object) null)).longValue();
    }

    /* renamed from: i */
    public static final long m17723i() {
        return ((Long) C4636f3.f14334F.mo14346a((Object) null)).longValue();
    }

    /* renamed from: j */
    private final String m17724j(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            C7264i.m27902k(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.f14613a.mo14551d().mo14675r().mo14616b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean mo14397A() {
        Boolean t = mo14414t("google_analytics_adid_collection_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo14398B(String str, C4625e3 e3Var) {
        if (str == null) {
            return ((Boolean) e3Var.mo14346a((Object) null)).booleanValue();
        }
        String e = this.f14441c.mo14345e(str, e3Var.mo14347b());
        if (TextUtils.isEmpty(e)) {
            return ((Boolean) e3Var.mo14346a((Object) null)).booleanValue();
        }
        return ((Boolean) e3Var.mo14346a(Boolean.valueOf("1".equals(e)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean mo14399C(String str) {
        return "1".equals(this.f14441c.mo14345e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean mo14400D() {
        Boolean t = mo14414t("google_analytics_automatic_screen_reporting_enabled");
        if (t == null || t.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo14401E() {
        this.f14613a.mo14549b();
        Boolean t = mo14414t("firebase_analytics_collection_deactivated");
        if (t == null || !t.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo14402F(String str) {
        return "1".equals(this.f14441c.mo14345e(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo14403G() {
        if (this.f14440b == null) {
            Boolean t = mo14414t("app_measurement_lite");
            this.f14440b = t;
            if (t == null) {
                this.f14440b = Boolean.FALSE;
            }
        }
        if (this.f14440b.booleanValue() || !this.f14613a.mo14873s()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo14404H() {
        if (this.f14442d == null) {
            synchronized (this) {
                if (this.f14442d == null) {
                    ApplicationInfo applicationInfo = this.f14613a.mo14550c().getApplicationInfo();
                    String a = C8414p.m31575a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f14442d = Boolean.valueOf(z);
                    }
                    if (this.f14442d == null) {
                        this.f14442d = Boolean.TRUE;
                        this.f14613a.mo14551d().mo14675r().mo14615a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f14442d.booleanValue();
    }

    /* renamed from: k */
    public final double mo14405k(String str, C4625e3 e3Var) {
        if (str == null) {
            return ((Double) e3Var.mo14346a((Object) null)).doubleValue();
        }
        String e = this.f14441c.mo14345e(str, e3Var.mo14347b());
        if (TextUtils.isEmpty(e)) {
            return ((Double) e3Var.mo14346a((Object) null)).doubleValue();
        }
        try {
            return ((Double) e3Var.mo14346a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e3Var.mo14346a((Object) null)).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo14406l(String str) {
        return mo14410p(str, C4636f3.f14342J, 500, 2000);
    }

    /* renamed from: m */
    public final int mo14407m() {
        if (this.f14613a.mo14856N().mo14816X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* renamed from: n */
    public final int mo14408n(String str) {
        return mo14410p(str, C4636f3.f14344K, 25, 100);
    }

    /* renamed from: o */
    public final int mo14409o(String str, C4625e3 e3Var) {
        if (str == null) {
            return ((Integer) e3Var.mo14346a((Object) null)).intValue();
        }
        String e = this.f14441c.mo14345e(str, e3Var.mo14347b());
        if (TextUtils.isEmpty(e)) {
            return ((Integer) e3Var.mo14346a((Object) null)).intValue();
        }
        try {
            return ((Integer) e3Var.mo14346a(Integer.valueOf(Integer.parseInt(e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e3Var.mo14346a((Object) null)).intValue();
        }
    }

    /* renamed from: p */
    public final int mo14410p(String str, C4625e3 e3Var, int i, int i2) {
        return Math.max(Math.min(mo14409o(str, e3Var), i2), i);
    }

    /* renamed from: q */
    public final long mo14411q() {
        this.f14613a.mo14549b();
        return 77000;
    }

    /* renamed from: r */
    public final long mo14412r(String str, C4625e3 e3Var) {
        if (str == null) {
            return ((Long) e3Var.mo14346a((Object) null)).longValue();
        }
        String e = this.f14441c.mo14345e(str, e3Var.mo14347b());
        if (TextUtils.isEmpty(e)) {
            return ((Long) e3Var.mo14346a((Object) null)).longValue();
        }
        try {
            return ((Long) e3Var.mo14346a(Long.valueOf(Long.parseLong(e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e3Var.mo14346a((Object) null)).longValue();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Bundle mo14413s() {
        try {
            if (this.f14613a.mo14550c().getPackageManager() == null) {
                this.f14613a.mo14551d().mo14675r().mo14615a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = C8708e.m32461a(this.f14613a.mo14550c()).mo24089c(this.f14613a.mo14550c().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            this.f14613a.mo14551d().mo14675r().mo14615a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean mo14414t(String str) {
        C7264i.m27898g(str);
        Bundle s = mo14413s();
        if (s == null) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s.getBoolean(str));
        }
    }

    /* renamed from: u */
    public final String mo14415u() {
        return m17724j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String mo14416v() {
        return m17724j("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final String mo14417w() {
        this.f14613a.mo14549b();
        return "FA";
    }

    /* renamed from: x */
    public final String mo14418x(String str, C4625e3 e3Var) {
        if (str == null) {
            return (String) e3Var.mo14346a((Object) null);
        }
        return (String) e3Var.mo14346a(this.f14441c.mo14345e(str, e3Var.mo14347b()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[SYNTHETIC, Splitter:B:8:0x002e] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo14419y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p182n6.C7264i.m27898g(r4)
            android.os.Bundle r0 = r3.mo14413s()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.t4 r4 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14675r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo14615a(r0)
        L_0x001b:
            r4 = r1
            goto L_0x002c
        L_0x001d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0024
            goto L_0x001b
        L_0x0024:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x002c:
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.measurement.internal.t4 r0 = r3.f14613a     // Catch:{ NotFoundException -> 0x0048 }
            android.content.Context r0 = r0.mo14550c()     // Catch:{ NotFoundException -> 0x0048 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0048 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0048 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0048 }
            if (r4 != 0) goto L_0x0043
            return r1
        L_0x0043:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0048 }
            return r4
        L_0x0048:
            r4 = move-exception
            com.google.android.gms.measurement.internal.t4 r0 = r3.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo14616b(r2, r4)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4643g.mo14419y(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo14420z(C4632f fVar) {
        this.f14441c = fVar;
    }
}
