package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1950b;
import androidx.work.C1961f;
import androidx.work.C1962g;
import androidx.work.C2073m;
import androidx.work.C2079p;
import androidx.work.C2086r;
import androidx.work.C2090t;
import androidx.work.C2094x;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C1998l;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p138k1.C6773b;
import p177n1.C7215o;
import p190o1.C7386m;
import p203p1.C7629c;
import p203p1.C7655s;
import p203p1.C7659v;
import p203p1.C7660w;
import p216q1.C7819c;
import p216q1.C7820d;

/* renamed from: androidx.work.impl.e0 */
public class C2007e0 extends C2094x {

    /* renamed from: k */
    private static final String f6029k = C2073m.m8073i("WorkManagerImpl");

    /* renamed from: l */
    private static C2007e0 f6030l = null;

    /* renamed from: m */
    private static C2007e0 f6031m = null;

    /* renamed from: n */
    private static final Object f6032n = new Object();

    /* renamed from: a */
    private Context f6033a;

    /* renamed from: b */
    private C1950b f6034b;

    /* renamed from: c */
    private WorkDatabase f6035c;

    /* renamed from: d */
    private C7819c f6036d;

    /* renamed from: e */
    private List f6037e;

    /* renamed from: f */
    private C2042r f6038f;

    /* renamed from: g */
    private C7655s f6039g;

    /* renamed from: h */
    private boolean f6040h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f6041i;

    /* renamed from: j */
    private final C7215o f6042j;

    /* renamed from: androidx.work.impl.e0$a */
    static class C2008a {
        /* renamed from: a */
        static boolean m7884a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public C2007e0(Context context, C1950b bVar, C7819c cVar) {
        this(context, bVar, cVar, context.getResources().getBoolean(C2090t.f6237a));
    }

    /* renamed from: h */
    public static void m7858h(Context context, C1950b bVar) {
        synchronized (f6032n) {
            C2007e0 e0Var = f6030l;
            if (e0Var != null) {
                if (f6031m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (e0Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (f6031m == null) {
                    f6031m = new C2007e0(applicationContext, bVar, new C7820d(bVar.mo6703m()));
                }
                f6030l = f6031m;
            }
        }
    }

    /* renamed from: m */
    public static C2007e0 m7859m() {
        synchronized (f6032n) {
            C2007e0 e0Var = f6030l;
            if (e0Var != null) {
                return e0Var;
            }
            C2007e0 e0Var2 = f6031m;
            return e0Var2;
        }
    }

    /* renamed from: n */
    public static C2007e0 m7860n(Context context) {
        C2007e0 m;
        synchronized (f6032n) {
            m = m7859m();
            if (m == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1950b.C1953c) {
                    m7858h(applicationContext, ((C1950b.C1953c) applicationContext).mo6708f());
                    m = m7860n(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return m;
    }

    /* renamed from: u */
    private void m7861u(Context context, C1950b bVar, C7819c cVar, WorkDatabase workDatabase, List list, C2042r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6033a = applicationContext;
        this.f6034b = bVar;
        this.f6036d = cVar;
        this.f6035c = workDatabase;
        this.f6037e = list;
        this.f6038f = rVar;
        this.f6039g = new C7655s(workDatabase);
        this.f6040h = false;
        if (Build.VERSION.SDK_INT < 24 || !C2008a.m7884a(applicationContext)) {
            this.f6036d.mo22739c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: A */
    public void mo6813A(C7386m mVar) {
        this.f6036d.mo22739c(new C7660w(this, new C2060v(mVar), true));
    }

    /* renamed from: B */
    public void mo6814B(C2060v vVar) {
        this.f6036d.mo22739c(new C7660w(this, vVar, false));
    }

    /* renamed from: a */
    public C2079p mo6815a(String str) {
        C7629c d = C7629c.m29052d(str, this);
        this.f6036d.mo22739c(d);
        return d.mo22337e();
    }

    /* renamed from: b */
    public C2079p mo6816b(String str) {
        C7629c c = C7629c.m29051c(str, this, true);
        this.f6036d.mo22739c(c);
        return c.mo22337e();
    }

    /* renamed from: c */
    public C2079p mo6817c(UUID uuid) {
        C7629c b = C7629c.m29050b(uuid, this);
        this.f6036d.mo22739c(b);
        return b.mo22337e();
    }

    /* renamed from: e */
    public C2079p mo6818e(List list) {
        if (!list.isEmpty()) {
            return new C2062x(this, list).mo6918a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: f */
    public C2079p mo6819f(String str, C1961f fVar, C2086r rVar) {
        if (fVar == C1961f.UPDATE) {
            return C2026i0.m7920c(this, str, rVar);
        }
        return mo6821j(str, fVar, rVar).mo6918a();
    }

    /* renamed from: i */
    public List mo6820i(Context context, C1950b bVar, C7215o oVar) {
        return Arrays.asList(new C2045t[]{C2046u.m7980a(context, this), new C6773b(context, bVar, oVar, this)});
    }

    /* renamed from: j */
    public C2062x mo6821j(String str, C1961f fVar, C2086r rVar) {
        C1962g gVar;
        if (fVar == C1961f.KEEP) {
            gVar = C1962g.KEEP;
        } else {
            gVar = C1962g.REPLACE;
        }
        return new C2062x(this, str, gVar, Collections.singletonList(rVar));
    }

    /* renamed from: k */
    public Context mo6822k() {
        return this.f6033a;
    }

    /* renamed from: l */
    public C1950b mo6823l() {
        return this.f6034b;
    }

    /* renamed from: o */
    public C7655s mo6824o() {
        return this.f6039g;
    }

    /* renamed from: p */
    public C2042r mo6825p() {
        return this.f6038f;
    }

    /* renamed from: q */
    public List mo6826q() {
        return this.f6037e;
    }

    /* renamed from: r */
    public C7215o mo6827r() {
        return this.f6042j;
    }

    /* renamed from: s */
    public WorkDatabase mo6828s() {
        return this.f6035c;
    }

    /* renamed from: t */
    public C7819c mo6829t() {
        return this.f6036d;
    }

    /* renamed from: v */
    public void mo6830v() {
        synchronized (f6032n) {
            this.f6040h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f6041i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f6041i = null;
            }
        }
    }

    /* renamed from: w */
    public void mo6831w() {
        C1998l.m7837b(mo6822k());
        mo6828s().mo6751N().mo21813n();
        C2046u.m7981b(mo6823l(), mo6828s(), mo6826q());
    }

    /* renamed from: x */
    public void mo6832x(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f6032n) {
            BroadcastReceiver.PendingResult pendingResult2 = this.f6041i;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.f6041i = pendingResult;
            if (this.f6040h) {
                pendingResult.finish();
                this.f6041i = null;
            }
        }
    }

    /* renamed from: y */
    public void mo6833y(C2060v vVar) {
        mo6834z(vVar, (WorkerParameters.C1948a) null);
    }

    /* renamed from: z */
    public void mo6834z(C2060v vVar, WorkerParameters.C1948a aVar) {
        this.f6036d.mo22739c(new C7659v(this, vVar, aVar));
    }

    public C2007e0(Context context, C1950b bVar, C7819c cVar, boolean z) {
        this(context, bVar, cVar, WorkDatabase.m7718H(context.getApplicationContext(), cVar.mo22738b(), z));
    }

    public C2007e0(Context context, C1950b bVar, C7819c cVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C2073m.m8072h(new C2073m.C2074a(bVar.mo6700j()));
        C7215o oVar = new C7215o(applicationContext, cVar);
        this.f6042j = oVar;
        Context context2 = context;
        C1950b bVar2 = bVar;
        C7819c cVar2 = cVar;
        WorkDatabase workDatabase2 = workDatabase;
        List i = mo6820i(applicationContext, bVar, oVar);
        m7861u(context2, bVar2, cVar2, workDatabase2, i, new C2042r(context2, bVar2, cVar2, workDatabase2, i));
    }
}
