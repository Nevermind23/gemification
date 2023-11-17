package p193o4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2626d;
import com.facebook.C2645k;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p115i4.C6549g;
import p128j4.C6699a;
import p141k4.C6790b;
import p245s4.C8225d;
import p297w4.C8769a0;
import p297w4.C8808k;
import p297w4.C8817m;
import p297w4.C8819n;
import p297w4.C8831r;
import p334z4.C9207a;

/* renamed from: o4.a */
public abstract class C7431a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21691a = "o4.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f21692b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f21693c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f21694d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f21695e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C7454j f21696f;

    /* renamed from: g */
    private static AtomicBoolean f21697g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f21698h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f21699i;

    /* renamed from: j */
    private static int f21700j = 0;

    /* renamed from: k */
    private static WeakReference f21701k;

    /* renamed from: o4.a$a */
    static class C7432a implements C8808k.C8811c {
        C7432a() {
        }

        /* renamed from: a */
        public void mo8159a(boolean z) {
            if (z) {
                C6790b.m26486h();
            } else {
                C6790b.m26485g();
            }
        }
    }

    /* renamed from: o4.a$b */
    static class C7433b implements Application.ActivityLifecycleCallbacks {
        C7433b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityCreated");
            C7438b.m28292a();
            C7431a.m28286t(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityDestroyed");
            C7431a.m28287u(activity);
        }

        public void onActivityPaused(Activity activity) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityPaused");
            C7438b.m28292a();
            C7431a.m28288v(activity);
        }

        public void onActivityResumed(Activity activity) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityResumed");
            C7438b.m28292a();
            C7431a.m28289w(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C7431a.m28269c();
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C8831r.m32866g(C2645k.APP_EVENTS, C7431a.f21691a, "onActivityStopped");
            C6549g.m25850i();
            C7431a.m28270d();
        }
    }

    /* renamed from: o4.a$c */
    static class C7434c implements Runnable {
        C7434c() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (C7431a.f21696f == null) {
                        C7454j unused = C7431a.f21696f = C7454j.m28338h();
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: o4.a$d */
    static class C7435d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ long f21702d;

        /* renamed from: e */
        final /* synthetic */ String f21703e;

        /* renamed from: f */
        final /* synthetic */ Context f21704f;

        C7435d(long j, String str, Context context) {
            this.f21702d = j;
            this.f21703e = str;
            this.f21704f = context;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (C7431a.f21696f == null) {
                        C7454j unused = C7431a.f21696f = new C7454j(Long.valueOf(this.f21702d), (Long) null);
                        C7455k.m28350c(this.f21703e, (C7456l) null, C7431a.f21698h, this.f21704f);
                    } else if (C7431a.f21696f.mo21863e() != null) {
                        long longValue = this.f21702d - C7431a.f21696f.mo21863e().longValue();
                        if (longValue > ((long) (C7431a.m28284r() * 1000))) {
                            C7455k.m28352e(this.f21703e, C7431a.f21696f, C7431a.f21698h);
                            C7455k.m28350c(this.f21703e, (C7456l) null, C7431a.f21698h, this.f21704f);
                            C7454j unused2 = C7431a.f21696f = new C7454j(Long.valueOf(this.f21702d), (Long) null);
                        } else if (longValue > 1000) {
                            C7431a.f21696f.mo21866i();
                        }
                    }
                    C7431a.f21696f.mo21867j(Long.valueOf(this.f21702d));
                    C7431a.f21696f.mo21868k();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: o4.a$e */
    static class C7436e implements Runnable {

        /* renamed from: d */
        final /* synthetic */ long f21705d;

        /* renamed from: e */
        final /* synthetic */ String f21706e;

        /* renamed from: o4.a$e$a */
        class C7437a implements Runnable {
            C7437a() {
            }

            public void run() {
                if (!C9207a.m34024c(this)) {
                    try {
                        if (C7431a.f21696f == null) {
                            C7454j unused = C7431a.f21696f = new C7454j(Long.valueOf(C7436e.this.f21705d), (Long) null);
                        }
                        if (C7431a.f21695e.get() <= 0) {
                            C7455k.m28352e(C7436e.this.f21706e, C7431a.f21696f, C7431a.f21698h);
                            C7454j.m28337a();
                            C7454j unused2 = C7431a.f21696f = null;
                        }
                        synchronized (C7431a.f21694d) {
                            ScheduledFuture unused3 = C7431a.f21693c = null;
                        }
                    } catch (Throwable th) {
                        C9207a.m34023b(th, this);
                    }
                }
            }
        }

        C7436e(long j, String str) {
            this.f21705d = j;
            this.f21706e = str;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    if (C7431a.f21696f == null) {
                        C7454j unused = C7431a.f21696f = new C7454j(Long.valueOf(this.f21705d), (Long) null);
                    }
                    C7431a.f21696f.mo21867j(Long.valueOf(this.f21705d));
                    if (C7431a.f21695e.get() <= 0) {
                        C7437a aVar = new C7437a();
                        synchronized (C7431a.f21694d) {
                            ScheduledFuture unused2 = C7431a.f21693c = C7431a.f21692b.schedule(aVar, (long) C7431a.m28284r(), TimeUnit.SECONDS);
                        }
                    }
                    long e = C7431a.f21699i;
                    long j = 0;
                    if (e > 0) {
                        j = (this.f21705d - e) / 1000;
                    }
                    C7442d.m28304e(this.f21706e, j);
                    C7431a.f21696f.mo21868k();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m28269c() {
        int i = f21700j;
        f21700j = i + 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m28270d() {
        int i = f21700j;
        f21700j = i - 1;
        return i;
    }

    /* renamed from: o */
    private static void m28281o() {
        synchronized (f21694d) {
            if (f21693c != null) {
                f21693c.cancel(false);
            }
            f21693c = null;
        }
    }

    /* renamed from: p */
    public static Activity m28282p() {
        WeakReference weakReference = f21701k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: q */
    public static UUID m28283q() {
        if (f21696f != null) {
            return f21696f.mo21862d();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static int m28284r() {
        C8817m j = C8819n.m32843j(C2626d.m10135f());
        if (j == null) {
            return C7444e.m28306a();
        }
        return j.mo24247j();
    }

    /* renamed from: s */
    public static boolean m28285s() {
        return f21700j == 0;
    }

    /* renamed from: t */
    public static void m28286t(Activity activity) {
        f21692b.execute(new C7434c());
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static void m28287u(Activity activity) {
        C6790b.m26490l(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static void m28288v(Activity activity) {
        if (f21695e.decrementAndGet() < 0) {
            f21695e.set(0);
            Log.w(f21691a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m28281o();
        long currentTimeMillis = System.currentTimeMillis();
        String q = C8769a0.m32686q(activity);
        C6790b.m26491m(activity);
        f21692b.execute(new C7436e(currentTimeMillis, q));
    }

    /* renamed from: w */
    public static void m28289w(Activity activity) {
        f21701k = new WeakReference(activity);
        f21695e.incrementAndGet();
        m28281o();
        long currentTimeMillis = System.currentTimeMillis();
        f21699i = currentTimeMillis;
        String q = C8769a0.m32686q(activity);
        C6790b.m26492n(activity);
        C6699a.m26134d(activity);
        C8225d.m31010h(activity);
        f21692b.execute(new C7435d(currentTimeMillis, q, activity.getApplicationContext()));
    }

    /* renamed from: x */
    public static void m28290x(Application application, String str) {
        if (f21697g.compareAndSet(false, true)) {
            C8808k.m32791a(C8808k.C8812d.CodelessEvents, new C7432a());
            f21698h = str;
            application.registerActivityLifecycleCallbacks(new C7433b());
        }
    }
}
