package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.C5270e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p134ja.C6763a;
import p212pa.C7784g;

/* renamed from: com.google.firebase.perf.config.x */
public class C5404x {

    /* renamed from: c */
    private static final C6763a f17208c = C6763a.m26371e();

    /* renamed from: d */
    private static C5404x f17209d;

    /* renamed from: a */
    private volatile SharedPreferences f17210a;

    /* renamed from: b */
    private final ExecutorService f17211b;

    public C5404x(ExecutorService executorService) {
        this.f17211b = executorService;
    }

    /* renamed from: d */
    private Context m21396d() {
        try {
            C5270e.m20805l();
            return C5270e.m20805l().mo17481j();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized C5404x m21397e() {
        C5404x xVar;
        synchronized (C5404x.class) {
            if (f17209d == null) {
                f17209d = new C5404x(Executors.newSingleThreadExecutor());
            }
            xVar = f17209d;
        }
        return xVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m21398h(Context context) {
        if (this.f17210a == null && context != null) {
            this.f17210a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    /* renamed from: b */
    public C7784g mo17756b(String str) {
        if (str == null) {
            f17208c.mo20804a("Key is null when getting boolean value on device cache.");
            return C7784g.m29491a();
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return C7784g.m29491a();
            }
        }
        if (!this.f17210a.contains(str)) {
            return C7784g.m29491a();
        }
        try {
            return C7784g.m29493e(Boolean.valueOf(this.f17210a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f17208c.mo20805b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C7784g.m29491a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return p212pa.C7784g.m29493e(java.lang.Double.valueOf(java.lang.Float.valueOf(r4.f17210a.getFloat(r5, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON)).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        f17208c.mo20805b("Key %s from sharedPreferences has type other than double: %s", r5, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        return p212pa.C7784g.m29491a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p212pa.C7784g mo17757c(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000e
            ja.a r5 = f17208c
            java.lang.String r0 = "Key is null when getting double value on device cache."
            r5.mo20804a(r0)
            pa.g r5 = p212pa.C7784g.m29491a()
            return r5
        L_0x000e:
            android.content.SharedPreferences r0 = r4.f17210a
            if (r0 != 0) goto L_0x0022
            android.content.Context r0 = r4.m21396d()
            r4.mo17760i(r0)
            android.content.SharedPreferences r0 = r4.f17210a
            if (r0 != 0) goto L_0x0022
            pa.g r5 = p212pa.C7784g.m29491a()
            return r5
        L_0x0022:
            android.content.SharedPreferences r0 = r4.f17210a
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x002f
            pa.g r5 = p212pa.C7784g.m29491a()
            return r5
        L_0x002f:
            android.content.SharedPreferences r0 = r4.f17210a     // Catch:{ ClassCastException -> 0x0044 }
            r1 = 0
            long r0 = r0.getLong(r5, r1)     // Catch:{ ClassCastException -> 0x0044 }
            double r0 = java.lang.Double.longBitsToDouble(r0)     // Catch:{ ClassCastException -> 0x0044 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x0044 }
            pa.g r5 = p212pa.C7784g.m29493e(r0)     // Catch:{ ClassCastException -> 0x0044 }
            return r5
        L_0x0044:
            android.content.SharedPreferences r0 = r4.f17210a     // Catch:{ ClassCastException -> 0x005c }
            r1 = 0
            float r0 = r0.getFloat(r5, r1)     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            double r0 = r0.doubleValue()     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            pa.g r5 = p212pa.C7784g.m29493e(r0)     // Catch:{ ClassCastException -> 0x005c }
            return r5
        L_0x005c:
            r0 = move-exception
            ja.a r1 = f17208c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.String r0 = r0.getMessage()
            r2[r5] = r0
            java.lang.String r5 = "Key %s from sharedPreferences has type other than double: %s"
            r1.mo20805b(r5, r2)
            pa.g r5 = p212pa.C7784g.m29491a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.C5404x.mo17757c(java.lang.String):pa.g");
    }

    /* renamed from: f */
    public C7784g mo17758f(String str) {
        if (str == null) {
            f17208c.mo20804a("Key is null when getting long value on device cache.");
            return C7784g.m29491a();
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return C7784g.m29491a();
            }
        }
        if (!this.f17210a.contains(str)) {
            return C7784g.m29491a();
        }
        try {
            return C7784g.m29493e(Long.valueOf(this.f17210a.getLong(str, 0)));
        } catch (ClassCastException e) {
            f17208c.mo20805b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C7784g.m29491a();
        }
    }

    /* renamed from: g */
    public C7784g mo17759g(String str) {
        if (str == null) {
            f17208c.mo20804a("Key is null when getting String value on device cache.");
            return C7784g.m29491a();
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return C7784g.m29491a();
            }
        }
        if (!this.f17210a.contains(str)) {
            return C7784g.m29491a();
        }
        try {
            return C7784g.m29493e(this.f17210a.getString(str, ""));
        } catch (ClassCastException e) {
            f17208c.mo20805b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return C7784g.m29491a();
        }
    }

    /* renamed from: i */
    public synchronized void mo17760i(Context context) {
        if (this.f17210a == null && context != null) {
            this.f17211b.execute(new C5403w(this, context));
        }
    }

    /* renamed from: j */
    public boolean mo17761j(String str, double d) {
        if (str == null) {
            f17208c.mo20804a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return false;
            }
        }
        this.f17210a.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    /* renamed from: k */
    public boolean mo17762k(String str, long j) {
        if (str == null) {
            f17208c.mo20804a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return false;
            }
        }
        this.f17210a.edit().putLong(str, j).apply();
        return true;
    }

    /* renamed from: l */
    public boolean mo17763l(String str, String str2) {
        if (str == null) {
            f17208c.mo20804a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f17210a.edit().remove(str).apply();
            return true;
        }
        this.f17210a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: m */
    public boolean mo17764m(String str, boolean z) {
        if (str == null) {
            f17208c.mo20804a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f17210a == null) {
            mo17760i(m21396d());
            if (this.f17210a == null) {
                return false;
            }
        }
        this.f17210a.edit().putBoolean(str, z).apply();
        return true;
    }
}
