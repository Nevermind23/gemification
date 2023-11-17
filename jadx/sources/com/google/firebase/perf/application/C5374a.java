package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p134ja.C6763a;
import p147ka.C6849g;
import p199oa.C7506k;
import p212pa.C7777a;
import p212pa.C7778b;
import p212pa.C7779c;
import p212pa.C7784g;
import p212pa.C7788j;
import p225qa.C7957d;
import p225qa.C7990m;

/* renamed from: com.google.firebase.perf.application.a */
public class C5374a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u */
    private static final C6763a f17150u = C6763a.m26371e();

    /* renamed from: v */
    private static volatile C5374a f17151v;

    /* renamed from: d */
    private final WeakHashMap f17152d;

    /* renamed from: e */
    private final WeakHashMap f17153e;

    /* renamed from: f */
    private final WeakHashMap f17154f;

    /* renamed from: g */
    private final WeakHashMap f17155g;

    /* renamed from: h */
    private final Map f17156h;

    /* renamed from: i */
    private final Set f17157i;

    /* renamed from: j */
    private Set f17158j;

    /* renamed from: k */
    private final AtomicInteger f17159k;

    /* renamed from: l */
    private final C7506k f17160l;

    /* renamed from: m */
    private final C5380a f17161m;

    /* renamed from: n */
    private final C7777a f17162n;

    /* renamed from: o */
    private final boolean f17163o;

    /* renamed from: p */
    private Timer f17164p;

    /* renamed from: q */
    private Timer f17165q;

    /* renamed from: r */
    private C7957d f17166r;

    /* renamed from: s */
    private boolean f17167s;

    /* renamed from: t */
    private boolean f17168t;

    /* renamed from: com.google.firebase.perf.application.a$a */
    public interface C5375a {
        /* renamed from: a */
        void mo17689a();
    }

    /* renamed from: com.google.firebase.perf.application.a$b */
    public interface C5376b {
        void onUpdateAppState(C7957d dVar);
    }

    C5374a(C7506k kVar, C7777a aVar) {
        this(kVar, aVar, C5380a.m21272g(), m21233g());
    }

    /* renamed from: b */
    public static C5374a m21231b() {
        if (f17151v == null) {
            synchronized (C5374a.class) {
                if (f17151v == null) {
                    f17151v = new C5374a(C7506k.m28498k(), new C7777a());
                }
            }
        }
        return f17151v;
    }

    /* renamed from: c */
    public static String m21232c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    /* renamed from: g */
    private static boolean m21233g() {
        return C5379d.m21252a();
    }

    /* renamed from: l */
    private void m21234l() {
        synchronized (this.f17158j) {
            for (C5375a aVar : this.f17158j) {
                if (aVar != null) {
                    aVar.mo17689a();
                }
            }
        }
    }

    /* renamed from: m */
    private void m21235m(Activity activity) {
        Trace trace = (Trace) this.f17155g.get(activity);
        if (trace != null) {
            this.f17155g.remove(activity);
            C7784g e = ((C5379d) this.f17153e.get(activity)).mo17699e();
            if (!e.mo22547d()) {
                f17150u.mo20813k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            C7788j.m29498a(trace, (C6849g.C6850a) e.mo22546c());
            trace.stop();
        }
    }

    /* renamed from: n */
    private void m21236n(String str, Timer timer, Timer timer2) {
        if (this.f17161m.mo17718K()) {
            C7990m.C7992b B = C7990m.m30351z0().mo23132J(str).mo23130H(timer.mo18043f()).mo23131I(timer.mo18042e(timer2)).mo23124B(SessionManager.getInstance().perfSession().mo17997a());
            int andSet = this.f17159k.getAndSet(0);
            synchronized (this.f17156h) {
                B.mo23126D(this.f17156h);
                if (andSet != 0) {
                    B.mo23128F(C7778b.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                }
                this.f17156h.clear();
            }
            this.f17160l.mo21946C((C7990m) B.mo18768o(), C7957d.FOREGROUND_BACKGROUND);
        }
    }

    /* renamed from: o */
    private void m21237o(Activity activity) {
        if (mo17677h() && this.f17161m.mo17718K()) {
            C5379d dVar = new C5379d(activity);
            this.f17153e.put(activity, dVar);
            if (activity instanceof C1505h) {
                C5378c cVar = new C5378c(this.f17162n, this.f17160l, this, dVar);
                this.f17154f.put(activity, cVar);
                ((C1505h) activity).getSupportFragmentManager().mo4427o1(cVar, true);
            }
        }
    }

    /* renamed from: q */
    private void m21238q(C7957d dVar) {
        this.f17166r = dVar;
        synchronized (this.f17157i) {
            Iterator it = this.f17157i.iterator();
            while (it.hasNext()) {
                C5376b bVar = (C5376b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f17166r);
                } else {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public C7957d mo17673a() {
        return this.f17166r;
    }

    /* renamed from: d */
    public void mo17674d(String str, long j) {
        synchronized (this.f17156h) {
            Long l = (Long) this.f17156h.get(str);
            if (l == null) {
                this.f17156h.put(str, Long.valueOf(j));
            } else {
                this.f17156h.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    /* renamed from: e */
    public void mo17675e(int i) {
        this.f17159k.addAndGet(i);
    }

    /* renamed from: f */
    public boolean mo17676f() {
        return this.f17168t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo17677h() {
        return this.f17163o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17678i(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f17167s     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r1.f17167s = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.C5374a.mo17678i(android.content.Context):void");
    }

    /* renamed from: j */
    public void mo17679j(C5375a aVar) {
        synchronized (this.f17158j) {
            this.f17158j.add(aVar);
        }
    }

    /* renamed from: k */
    public void mo17680k(WeakReference weakReference) {
        synchronized (this.f17157i) {
            this.f17157i.add(weakReference);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m21237o(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f17153e.remove(activity);
        if (this.f17154f.containsKey(activity)) {
            ((C1505h) activity).getSupportFragmentManager().mo4383M1((FragmentManager.C1454k) this.f17154f.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.f17152d.isEmpty()) {
            this.f17164p = this.f17162n.mo22535a();
            this.f17152d.put(activity, Boolean.TRUE);
            if (this.f17168t) {
                m21238q(C7957d.FOREGROUND);
                m21234l();
                this.f17168t = false;
            } else {
                m21236n(C7779c.BACKGROUND_TRACE_NAME.toString(), this.f17165q, this.f17164p);
                m21238q(C7957d.FOREGROUND);
            }
        } else {
            this.f17152d.put(activity, Boolean.TRUE);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (mo17677h() && this.f17161m.mo17718K()) {
            if (!this.f17153e.containsKey(activity)) {
                m21237o(activity);
            }
            ((C5379d) this.f17153e.get(activity)).mo17697c();
            Trace trace = new Trace(m21232c(activity), this.f17160l, this.f17162n, this);
            trace.start();
            this.f17155g.put(activity, trace);
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (mo17677h()) {
            m21235m(activity);
        }
        if (this.f17152d.containsKey(activity)) {
            this.f17152d.remove(activity);
            if (this.f17152d.isEmpty()) {
                this.f17165q = this.f17162n.mo22535a();
                m21236n(C7779c.FOREGROUND_TRACE_NAME.toString(), this.f17164p, this.f17165q);
                m21238q(C7957d.BACKGROUND);
            }
        }
    }

    /* renamed from: p */
    public void mo17688p(WeakReference weakReference) {
        synchronized (this.f17157i) {
            this.f17157i.remove(weakReference);
        }
    }

    C5374a(C7506k kVar, C7777a aVar, C5380a aVar2, boolean z) {
        this.f17152d = new WeakHashMap();
        this.f17153e = new WeakHashMap();
        this.f17154f = new WeakHashMap();
        this.f17155g = new WeakHashMap();
        this.f17156h = new HashMap();
        this.f17157i = new HashSet();
        this.f17158j = new HashSet();
        this.f17159k = new AtomicInteger(0);
        this.f17166r = C7957d.BACKGROUND;
        this.f17167s = false;
        this.f17168t = true;
        this.f17160l = kVar;
        this.f17162n = aVar;
        this.f17161m = aVar2;
        this.f17163o = z;
    }
}
