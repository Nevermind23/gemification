package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.C1565c0;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import com.google.firebase.C5270e;
import com.google.firebase.C5298l;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p147ka.C6848f;
import p199oa.C7506k;
import p212pa.C7777a;
import p212pa.C7779c;
import p225qa.C7957d;
import p225qa.C7990m;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, C1616p {

    /* renamed from: B */
    private static final Timer f17214B = new C7777a().mo22535a();

    /* renamed from: C */
    private static final long f17215C = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: D */
    private static volatile AppStartTrace f17216D;

    /* renamed from: E */
    private static ExecutorService f17217E;

    /* renamed from: A */
    private boolean f17218A;

    /* renamed from: d */
    private boolean f17219d = false;

    /* renamed from: e */
    private final C7506k f17220e;

    /* renamed from: f */
    private final C7777a f17221f;

    /* renamed from: g */
    private final C5380a f17222g;

    /* renamed from: h */
    private final C7990m.C7992b f17223h;

    /* renamed from: i */
    private Context f17224i;

    /* renamed from: j */
    private WeakReference f17225j;

    /* renamed from: k */
    private WeakReference f17226k;

    /* renamed from: l */
    private boolean f17227l = false;

    /* renamed from: m */
    private final Timer f17228m;

    /* renamed from: n */
    private final Timer f17229n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Timer f17230o;

    /* renamed from: p */
    private Timer f17231p;

    /* renamed from: q */
    private Timer f17232q;

    /* renamed from: r */
    private Timer f17233r;

    /* renamed from: s */
    private Timer f17234s;

    /* renamed from: t */
    private Timer f17235t;

    /* renamed from: u */
    private Timer f17236u;

    /* renamed from: v */
    private Timer f17237v;

    /* renamed from: w */
    private PerfSession f17238w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f17239x;

    /* renamed from: y */
    private int f17240y;

    /* renamed from: z */
    private final C5408b f17241z;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    private final class C5408b implements ViewTreeObserver.OnDrawListener {
        private C5408b() {
        }

        public void onDraw() {
            AppStartTrace.m21416l(AppStartTrace.this);
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$c */
    public static class C5409c implements Runnable {

        /* renamed from: d */
        private final AppStartTrace f17243d;

        public C5409c(AppStartTrace appStartTrace) {
            this.f17243d = appStartTrace;
        }

        public void run() {
            if (this.f17243d.f17230o == null) {
                boolean unused = this.f17243d.f17239x = true;
            }
        }
    }

    AppStartTrace(C7506k kVar, C7777a aVar, C5380a aVar2, ExecutorService executorService) {
        Timer timer;
        Timer timer2 = null;
        this.f17230o = null;
        this.f17231p = null;
        this.f17232q = null;
        this.f17233r = null;
        this.f17234s = null;
        this.f17235t = null;
        this.f17236u = null;
        this.f17237v = null;
        this.f17239x = false;
        this.f17240y = 0;
        this.f17241z = new C5408b();
        this.f17218A = false;
        this.f17220e = kVar;
        this.f17221f = aVar;
        this.f17222g = aVar2;
        f17217E = executorService;
        this.f17223h = C7990m.m30351z0().mo23132J("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            timer = Timer.m21568g(Process.getStartElapsedRealtime());
        } else {
            timer = null;
        }
        this.f17228m = timer;
        C5298l lVar = (C5298l) C5270e.m20805l().mo17480i(C5298l.class);
        this.f17229n = lVar != null ? Timer.m21568g(lVar.mo17395b()) : timer2;
    }

    /* renamed from: l */
    static /* synthetic */ int m21416l(AppStartTrace appStartTrace) {
        int i = appStartTrace.f17240y;
        appStartTrace.f17240y = i + 1;
        return i;
    }

    /* renamed from: m */
    private Timer m21417m() {
        Timer timer = this.f17229n;
        if (timer != null) {
            return timer;
        }
        return f17214B;
    }

    /* renamed from: n */
    public static AppStartTrace m21418n() {
        return f17216D != null ? f17216D : m21419o(C7506k.m28498k(), new C7777a());
    }

    /* renamed from: o */
    static AppStartTrace m21419o(C7506k kVar, C7777a aVar) {
        if (f17216D == null) {
            synchronized (AppStartTrace.class) {
                if (f17216D == null) {
                    f17216D = new AppStartTrace(kVar, aVar, C5380a.m21272g(), new ThreadPoolExecutor(0, 1, f17215C + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f17216D;
    }

    /* renamed from: p */
    private Timer m21420p() {
        Timer timer = this.f17228m;
        if (timer != null) {
            return timer;
        }
        return m21417m();
    }

    /* renamed from: q */
    public static boolean m21421q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m21422r(C7990m.C7992b bVar) {
        this.f17220e.mo21946C((C7990m) bVar.mo18768o(), C7957d.FOREGROUND_BACKGROUND);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m21423s() {
        C7990m.C7992b I = C7990m.m30351z0().mo23132J(C7779c.APP_START_TRACE_NAME.toString()).mo23130H(m21417m().mo18043f()).mo23131I(m21417m().mo18042e(this.f17232q));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((C7990m) C7990m.m30351z0().mo23132J(C7779c.ON_CREATE_TRACE_NAME.toString()).mo23130H(m21417m().mo18043f()).mo23131I(m21417m().mo18042e(this.f17230o)).mo18768o());
        C7990m.C7992b z0 = C7990m.m30351z0();
        z0.mo23132J(C7779c.ON_START_TRACE_NAME.toString()).mo23130H(this.f17230o.mo18043f()).mo23131I(this.f17230o.mo18042e(this.f17231p));
        arrayList.add((C7990m) z0.mo18768o());
        C7990m.C7992b z02 = C7990m.m30351z0();
        z02.mo23132J(C7779c.ON_RESUME_TRACE_NAME.toString()).mo23130H(this.f17231p.mo18043f()).mo23131I(this.f17231p.mo18042e(this.f17232q));
        arrayList.add((C7990m) z02.mo18768o());
        I.mo23123A(arrayList).mo23124B(this.f17238w.mo17997a());
        this.f17220e.mo21946C((C7990m) I.mo18768o(), C7957d.FOREGROUND_BACKGROUND);
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: t */
    private void m21424t(C7990m.C7992b bVar) {
        if (this.f17235t != null && this.f17236u != null && this.f17237v != null) {
            f17217E.execute(new C6848f(this, bVar));
            mo17776y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m21425u() {
        String str;
        if (this.f17237v == null) {
            this.f17237v = this.f17221f.mo22535a();
            this.f17223h.mo23125C((C7990m) C7990m.m30351z0().mo23132J("_experiment_onDrawFoQ").mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(this.f17237v)).mo18768o());
            if (this.f17228m != null) {
                this.f17223h.mo23125C((C7990m) C7990m.m30351z0().mo23132J("_experiment_procStart_to_classLoad").mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(m21417m())).mo18768o());
            }
            C7990m.C7992b bVar = this.f17223h;
            if (this.f17218A) {
                str = "true";
            } else {
                str = "false";
            }
            bVar.mo23129G("systemDeterminedForeground", str);
            this.f17223h.mo23128F("onDrawCount", (long) this.f17240y);
            this.f17223h.mo23124B(this.f17238w.mo17997a());
            m21424t(this.f17223h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m21426v() {
        if (this.f17235t == null) {
            this.f17235t = this.f17221f.mo22535a();
            this.f17223h.mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(this.f17235t));
            m21424t(this.f17223h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m21427w() {
        if (this.f17236u == null) {
            this.f17236u = this.f17221f.mo22535a();
            this.f17223h.mo23125C((C7990m) C7990m.m30351z0().mo23132J("_experiment_preDrawFoQ").mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(this.f17236u)).mo18768o());
            m21424t(this.f17223h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f17239x     // Catch:{ all -> 0x0042 }
            if (r5 != 0) goto L_0x0040
            com.google.firebase.perf.util.Timer r5 = r3.f17230o     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x000a
            goto L_0x0040
        L_0x000a:
            boolean r5 = r3.f17218A     // Catch:{ all -> 0x0042 }
            r0 = 1
            if (r5 != 0) goto L_0x001a
            android.content.Context r5 = r3.f17224i     // Catch:{ all -> 0x0042 }
            boolean r5 = m21421q(r5)     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r5 = 0
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            r3.f17218A = r5     // Catch:{ all -> 0x0042 }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0042 }
            r5.<init>(r4)     // Catch:{ all -> 0x0042 }
            r3.f17225j = r5     // Catch:{ all -> 0x0042 }
            pa.a r4 = r3.f17221f     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r4 = r4.mo22535a()     // Catch:{ all -> 0x0042 }
            r3.f17230o = r4     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r4 = r3.m21420p()     // Catch:{ all -> 0x0042 }
            com.google.firebase.perf.util.Timer r5 = r3.f17230o     // Catch:{ all -> 0x0042 }
            long r4 = r4.mo18042e(r5)     // Catch:{ all -> 0x0042 }
            long r1 = f17215C     // Catch:{ all -> 0x0042 }
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x003e
            r3.f17227l = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.f17239x && !this.f17227l && this.f17222g.mo17723h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f17241z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f17239x     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009f
            boolean r0 = r5.f17227l     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x000b
            goto L_0x009f
        L_0x000b:
            com.google.firebase.perf.config.a r0 = r5.f17222g     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.mo17723h()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0038
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x00a1 }
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.AppStartTrace$b r3 = r5.f17241z     // Catch:{ all -> 0x00a1 }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x00a1 }
            ka.b r2 = new ka.b     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            p212pa.C7781e.m29485e(r1, r2)     // Catch:{ all -> 0x00a1 }
            ka.c r2 = new ka.c     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            ka.d r3 = new ka.d     // Catch:{ all -> 0x00a1 }
            r3.<init>(r5)     // Catch:{ all -> 0x00a1 }
            p212pa.C7785h.m29496a(r1, r2, r3)     // Catch:{ all -> 0x00a1 }
        L_0x0038:
            com.google.firebase.perf.util.Timer r1 = r5.f17232q     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            monitor-exit(r5)
            return
        L_0x003e:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00a1 }
            r1.<init>(r6)     // Catch:{ all -> 0x00a1 }
            r5.f17226k = r1     // Catch:{ all -> 0x00a1 }
            pa.a r1 = r5.f17221f     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r1 = r1.mo22535a()     // Catch:{ all -> 0x00a1 }
            r5.f17232q = r1     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.session.PerfSession r1 = r1.perfSession()     // Catch:{ all -> 0x00a1 }
            r5.f17238w = r1     // Catch:{ all -> 0x00a1 }
            ja.a r1 = p134ja.C6763a.m26371e()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r2.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00a1 }
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r6 = r5.m21417m()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.util.Timer r3 = r5.f17232q     // Catch:{ all -> 0x00a1 }
            long r3 = r6.mo18042e(r3)     // Catch:{ all -> 0x00a1 }
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00a1 }
            r1.mo20804a(r6)     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ExecutorService r6 = f17217E     // Catch:{ all -> 0x00a1 }
            ka.e r1 = new ka.e     // Catch:{ all -> 0x00a1 }
            r1.<init>(r5)     // Catch:{ all -> 0x00a1 }
            r6.execute(r1)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009d
            r5.mo17776y()     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            monitor-exit(r5)
            return
        L_0x009f:
            monitor-exit(r5)
            return
        L_0x00a1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f17239x     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.firebase.perf.util.Timer r1 = r0.f17231p     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            boolean r1 = r0.f17227l     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            pa.a r1 = r0.f17221f     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.Timer r1 = r1.mo22535a()     // Catch:{ all -> 0x001a }
            r0.f17231p = r1     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @C1646z(C1593j.C1594a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f17239x && !this.f17227l && this.f17234s == null) {
            this.f17234s = this.f17221f.mo22535a();
            this.f17223h.mo23125C((C7990m) C7990m.m30351z0().mo23132J("_experiment_firstBackgrounding").mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(this.f17234s)).mo18768o());
        }
    }

    @C1646z(C1593j.C1594a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f17239x && !this.f17227l && this.f17233r == null) {
            this.f17233r = this.f17221f.mo22535a();
            this.f17223h.mo23125C((C7990m) C7990m.m30351z0().mo23132J("_experiment_firstForegrounding").mo23130H(m21420p().mo18043f()).mo23131I(m21420p().mo18042e(this.f17233r)).mo18768o());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17775x(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17219d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            androidx.lifecycle.q r0 = androidx.lifecycle.C1565c0.m5569l()     // Catch:{ all -> 0x0037 }
            androidx.lifecycle.j r0 = r0.getLifecycle()     // Catch:{ all -> 0x0037 }
            r0.mo4906a(r2)     // Catch:{ all -> 0x0037 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0037 }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x0037 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.f17218A     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = m21421q(r3)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            r2.f17218A = r0     // Catch:{ all -> 0x0037 }
            r2.f17219d = r1     // Catch:{ all -> 0x0037 }
            r2.f17224i = r3     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.mo17775x(android.content.Context):void");
    }

    /* renamed from: y */
    public synchronized void mo17776y() {
        if (this.f17219d) {
            C1565c0.m5569l().getLifecycle().mo4909d(this);
            ((Application) this.f17224i).unregisterActivityLifecycleCallbacks(this);
            this.f17219d = false;
        }
    }
}
