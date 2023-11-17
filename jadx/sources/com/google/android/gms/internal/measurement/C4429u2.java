package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p182n6.C7264i;
import p235r7.C8067a;
import p248s7.C8259m;
import p248s7.C8269w;
import p260t6.C8404f;
import p260t6.C8407i;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
public final class C4429u2 {

    /* renamed from: j */
    private static volatile C4429u2 f13717j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f13718a;

    /* renamed from: b */
    protected final C8404f f13719b;

    /* renamed from: c */
    protected final ExecutorService f13720c;

    /* renamed from: d */
    private final C8067a f13721d;

    /* renamed from: e */
    private final List f13722e;

    /* renamed from: f */
    private int f13723f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f13724g;

    /* renamed from: h */
    private final String f13725h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C4173f1 f13726i;

    protected C4429u2(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str == null || !m16795m(str2, str3)) {
            this.f13718a = "FA";
        } else {
            this.f13718a = str;
        }
        this.f13719b = C8407i.m31544d();
        C4509z0.m17259a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4157e2(this));
        boolean z2 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13720c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13721d = new C8067a(this);
        this.f13722e = new ArrayList();
        try {
            if (C8269w.m31113c(context, "google_app_id", C8259m.m31089a(context)) != null && !mo13668i()) {
                this.f13725h = null;
                this.f13724g = true;
                Log.w(this.f13718a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m16795m(str2, str3)) {
            this.f13725h = "fa";
            if (str2 == null || str3 == null) {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 != null ? false : z2)) {
                    Log.w(this.f13718a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f13718a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        } else {
            this.f13725h = str2;
        }
        m16794l(new C4428u1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f13718a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C4412t2(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m16792j(Exception exc, boolean z, boolean z2) {
        this.f13724g |= z;
        if (z) {
            Log.w(this.f13718a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo13662a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f13718a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: k */
    private final void m16793k(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m16794l(new C4208h2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m16794l(C4242j2 j2Var) {
        this.f13720c.execute(j2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m16795m(String str, String str2) {
        return (str2 == null || str == null || mo13668i()) ? false : true;
    }

    /* renamed from: s */
    public static C4429u2 m16797s(Context context, String str, String str2, String str3, Bundle bundle) {
        C7264i.m27902k(context);
        if (f13717j == null) {
            synchronized (C4429u2.class) {
                if (f13717j == null) {
                    f13717j = new C4429u2(context, str, str2, str3, bundle);
                }
            }
        }
        return f13717j;
    }

    /* renamed from: D */
    public final void mo13657D(String str) {
        m16794l(new C4445v1(this, str));
    }

    /* renamed from: E */
    public final void mo13658E(String str, String str2, Bundle bundle) {
        m16794l(new C4360q1(this, str, str2, bundle));
    }

    /* renamed from: F */
    public final void mo13659F(String str) {
        m16794l(new C4462w1(this, str));
    }

    /* renamed from: G */
    public final void mo13660G(String str, Bundle bundle) {
        m16793k((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: H */
    public final void mo13661H(String str, String str2, Bundle bundle) {
        m16793k(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo13662a(int i, String str, Object obj, Object obj2, Object obj3) {
        m16794l(new C4140d2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f13726i == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f13726i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f13718a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        m16794l(new com.google.android.gms.internal.measurement.C4191g2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13663b(p248s7.C8267u r5) {
        /*
            r4 = this;
            p182n6.C7264i.m27902k(r5)
            java.util.List r0 = r4.f13722e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f13722e     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r4.f13722e     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f13718a     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.google.android.gms.internal.measurement.k2 r1 = new com.google.android.gms.internal.measurement.k2     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List r2 = r4.f13722e     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.measurement.f1 r5 = r4.f13726i
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.f1 r5 = r4.f13726i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f13718a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.google.android.gms.internal.measurement.g2 r5 = new com.google.android.gms.internal.measurement.g2
            r5.<init>(r4, r1)
            r4.m16794l(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4429u2.mo13663b(s7.u):void");
    }

    /* renamed from: c */
    public final void mo13664c(Bundle bundle) {
        m16794l(new C4343p1(this, bundle));
    }

    /* renamed from: d */
    public final void mo13665d(Activity activity, String str, String str2) {
        m16794l(new C4411t1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void mo13666e(String str) {
        m16794l(new C4394s1(this, str));
    }

    /* renamed from: f */
    public final void mo13667f(String str, String str2, Object obj, boolean z) {
        m16794l(new C4225i2(this, str, str2, obj, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo13668i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C4429u2.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public final int mo13669n(String str) {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4174f2(this, str, b1Var));
        Integer num = (Integer) C4105b1.m15525A2(b1Var.mo12893x(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public final long mo13670o() {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4510z1(this, b1Var));
        Long y = b1Var.mo12894y(500);
        if (y != null) {
            return y.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f13719b.mo23594a()).nextLong();
        int i = this.f13723f + 1;
        this.f13723f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: p */
    public final C8067a mo13671p() {
        return this.f13721d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C4173f1 mo13672r(Context context, boolean z) {
        try {
            return C4156e1.asInterface(DynamiteModule.m15258e(context, DynamiteModule.f12828e, ModuleDescriptor.MODULE_ID).mo12397d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m16792j(e, true, false);
            return null;
        }
    }

    /* renamed from: u */
    public final String mo13673u() {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4494y1(this, b1Var));
        return b1Var.mo12892T1(50);
    }

    /* renamed from: v */
    public final String mo13674v() {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4106b2(this, b1Var));
        return b1Var.mo12892T1(500);
    }

    /* renamed from: w */
    public final String mo13675w() {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4089a2(this, b1Var));
        return b1Var.mo12892T1(500);
    }

    /* renamed from: x */
    public final String mo13676x() {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4478x1(this, b1Var));
        return b1Var.mo12892T1(500);
    }

    /* renamed from: y */
    public final List mo13677y(String str, String str2) {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4377r1(this, str, str2, b1Var));
        List list = (List) C4105b1.m15525A2(b1Var.mo12893x(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: z */
    public final Map mo13678z(String str, String str2, boolean z) {
        C4105b1 b1Var = new C4105b1();
        m16794l(new C4123c2(this, str, str2, z, b1Var));
        Bundle x = b1Var.mo12893x(5000);
        if (x == null || x.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(x.size());
        for (String next : x.keySet()) {
            Object obj = x.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }
}
