package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.C5242b;
import com.google.firebase.C5270e;
import com.google.firebase.messaging.C5358t0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p142k5.C6816g;
import p182n6.C7264i;
import p273u6.C8638b;
import p289v9.C8714a;
import p289v9.C8715b;
import p289v9.C8717d;
import p315x9.C8980a;
import p327y9.C9142b;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;
import p339z9.C9270e;

public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f16941n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static C5358t0 f16942o;

    /* renamed from: p */
    static C6816g f16943p;

    /* renamed from: q */
    static ScheduledExecutorService f16944q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5270e f16945a;

    /* renamed from: b */
    private final C9270e f16946b;

    /* renamed from: c */
    private final Context f16947c;

    /* renamed from: d */
    private final C5306a0 f16948d;

    /* renamed from: e */
    private final C5349p0 f16949e;

    /* renamed from: f */
    private final C5299a f16950f;

    /* renamed from: g */
    private final Executor f16951g;

    /* renamed from: h */
    private final Executor f16952h;

    /* renamed from: i */
    private final Executor f16953i;

    /* renamed from: j */
    private final Task f16954j;

    /* renamed from: k */
    private final C5325f0 f16955k;

    /* renamed from: l */
    private boolean f16956l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f16957m;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    private class C5299a {

        /* renamed from: a */
        private final C8717d f16958a;

        /* renamed from: b */
        private boolean f16959b;

        /* renamed from: c */
        private C8715b f16960c;

        /* renamed from: d */
        private Boolean f16961d;

        C5299a(C8717d dVar) {
            this.f16958a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m20952d(C8714a aVar) {
            if (mo17538c()) {
                FirebaseMessaging.this.m20921C();
            }
        }

        /* renamed from: e */
        private Boolean m20953e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j = FirebaseMessaging.this.f16945a.mo17481j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo17537b() {
            if (!this.f16959b) {
                Boolean e = m20953e();
                this.f16961d = e;
                if (e == null) {
                    C5367x xVar = new C5367x(this);
                    this.f16960c = xVar;
                    this.f16958a.mo24097a(C5242b.class, xVar);
                }
                this.f16959b = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo17538c() {
            boolean z;
            mo17537b();
            Boolean bool = this.f16961d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f16945a.mo17485t();
            }
            return z;
        }
    }

    FirebaseMessaging(C5270e eVar, C8980a aVar, C9142b bVar, C9142b bVar2, C9270e eVar2, C6816g gVar, C8717d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, gVar, dVar, new C5325f0(eVar.mo17481j()));
    }

    /* renamed from: B */
    private synchronized void m20920B() {
        if (!this.f16956l) {
            mo17528D(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m20921C() {
        if (mo17529E(mo17534p())) {
            m20920B();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C5270e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.mo17480i(FirebaseMessaging.class);
            C7264i.m27903l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: l */
    public static synchronized FirebaseMessaging m20930l() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C5270e.m20805l());
        }
        return instance;
    }

    /* renamed from: m */
    private static synchronized C5358t0 m20931m(Context context) {
        C5358t0 t0Var;
        synchronized (FirebaseMessaging.class) {
            if (f16942o == null) {
                f16942o = new C5358t0(context);
            }
            t0Var = f16942o;
        }
        return t0Var;
    }

    /* renamed from: n */
    private String m20932n() {
        if ("[DEFAULT]".equals(this.f16945a.mo17482m())) {
            return "";
        }
        return this.f16945a.mo17484o();
    }

    /* renamed from: q */
    public static C6816g m20933q() {
        return f16943p;
    }

    /* renamed from: r */
    private void m20934r(String str) {
        if ("[DEFAULT]".equals(this.f16945a.mo17482m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f16945a.mo17482m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C5342m(this.f16947c).mo17613i(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Task m20935u(String str, C5358t0.C5359a aVar) {
        return this.f16948d.mo17556e().mo24874s(this.f16953i, new C5365w(this, str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Task m20936v(String str, C5358t0.C5359a aVar, String str2) {
        m20931m(this.f16947c).mo17643f(m20932n(), str, str2, this.f16955k.mo17575a());
        if (aVar == null || !str2.equals(aVar.f17100a)) {
            m20934r(str2);
        }
        return C9231i.m34113g(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m20937w(C9227g gVar) {
        try {
            gVar.mo24885c(mo17530i());
        } catch (Exception e) {
            gVar.mo24884b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m20938x() {
        if (mo17535s()) {
            m20921C();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m20939y(C5370y0 y0Var) {
        if (mo17535s()) {
            y0Var.mo17667o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m20940z() {
        C5341l0.m21122c(this.f16947c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void mo17527A(boolean z) {
        this.f16956l = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized void mo17528D(long j) {
        mo17531j(new C5361u0(this, Math.min(Math.max(30, 2 * j), f16941n)), j);
        this.f16956l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo17529E(C5358t0.C5359a aVar) {
        return aVar == null || aVar.mo17644b(this.f16955k.mo17575a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo17530i() {
        C5358t0.C5359a p = mo17534p();
        if (!mo17529E(p)) {
            return p.f17100a;
        }
        String c = C5325f0.m21063c(this.f16945a);
        try {
            return (String) C9231i.m34107a(this.f16949e.mo17627b(c, new C5363v(this, c, p)));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo17531j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f16944q == null) {
                f16944q = new ScheduledThreadPoolExecutor(1, new C8638b("TAG"));
            }
            f16944q.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Context mo17532k() {
        return this.f16947c;
    }

    /* renamed from: o */
    public Task mo17533o() {
        C9227g gVar = new C9227g();
        this.f16951g.execute(new C5360u(this, gVar));
        return gVar.mo24883a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C5358t0.C5359a mo17534p() {
        return m20931m(this.f16947c).mo17641d(m20932n(), C5325f0.m21063c(this.f16945a));
    }

    /* renamed from: s */
    public boolean mo17535s() {
        return this.f16950f.mo17538c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo17536t() {
        return this.f16955k.mo17579g();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.C5270e r12, p315x9.C8980a r13, p327y9.C9142b r14, p327y9.C9142b r15, p339z9.C9270e r16, p142k5.C6816g r17, p289v9.C8717d r18, com.google.firebase.messaging.C5325f0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.a0 r7 = new com.google.firebase.messaging.a0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.C5344n.m21144f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.C5344n.m21141c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.C5344n.m21140b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.e, x9.a, y9.b, y9.b, z9.e, k5.g, v9.d, com.google.firebase.messaging.f0):void");
    }

    FirebaseMessaging(C5270e eVar, C8980a aVar, C9270e eVar2, C6816g gVar, C8717d dVar, C5325f0 f0Var, C5306a0 a0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f16956l = false;
        f16943p = gVar;
        this.f16945a = eVar;
        this.f16946b = eVar2;
        this.f16950f = new C5299a(dVar);
        Context j = eVar.mo17481j();
        this.f16947c = j;
        C5348p pVar = new C5348p();
        this.f16957m = pVar;
        this.f16955k = f0Var;
        this.f16952h = executor;
        this.f16948d = a0Var;
        this.f16949e = new C5349p0(executor);
        this.f16951g = executor2;
        this.f16953i = executor3;
        Context j2 = eVar.mo17481j();
        if (j2 instanceof Application) {
            ((Application) j2).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.mo24382a(new C5351q(this));
        }
        executor2.execute(new C5353r(this));
        Task e = C5370y0.m21204e(this, f0Var, a0Var, j, C5344n.m21145g());
        this.f16954j = e;
        e.mo24863h(executor2, new C5355s(this));
        executor2.execute(new C5357t(this));
    }
}
