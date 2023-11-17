package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C2073m;
import androidx.work.impl.C2006e;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2042r;
import androidx.work.impl.C2061w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p190o1.C7386m;
import p203p1.C7639e0;
import p203p1.C7662y;
import p216q1.C7817a;
import p216q1.C7819c;

/* renamed from: androidx.work.impl.background.systemalarm.g */
public class C1979g implements C2006e {

    /* renamed from: n */
    static final String f5997n = C2073m.m8073i("SystemAlarmDispatcher");

    /* renamed from: d */
    final Context f5998d;

    /* renamed from: e */
    final C7819c f5999e;

    /* renamed from: f */
    private final C7639e0 f6000f;

    /* renamed from: g */
    private final C2042r f6001g;

    /* renamed from: h */
    private final C2007e0 f6002h;

    /* renamed from: i */
    final C1974b f6003i;

    /* renamed from: j */
    final List f6004j;

    /* renamed from: k */
    Intent f6005k;

    /* renamed from: l */
    private C1982c f6006l;

    /* renamed from: m */
    private C2061w f6007m;

    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    class C1980a implements Runnable {
        C1980a() {
        }

        public void run() {
            C1983d dVar;
            Executor executor;
            synchronized (C1979g.this.f6004j) {
                C1979g gVar = C1979g.this;
                gVar.f6005k = (Intent) gVar.f6004j.get(0);
            }
            Intent intent = C1979g.this.f6005k;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1979g.this.f6005k.getIntExtra("KEY_START_ID", 0);
                C2073m e = C2073m.m8071e();
                String str = C1979g.f5997n;
                e.mo6959a(str, "Processing command " + C1979g.this.f6005k + ", " + intExtra);
                Context context = C1979g.this.f5998d;
                PowerManager.WakeLock b = C7662y.m29106b(context, action + " (" + intExtra + ")");
                try {
                    C2073m e2 = C2073m.m8071e();
                    e2.mo6959a(str, "Acquiring operation wake lock (" + action + ") " + b);
                    b.acquire();
                    C1979g gVar2 = C1979g.this;
                    gVar2.f6003i.mo6778o(gVar2.f6005k, intExtra, gVar2);
                    C2073m e3 = C2073m.m8071e();
                    e3.mo6959a(str, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    executor = C1979g.this.f5999e.mo22737a();
                    dVar = new C1983d(C1979g.this);
                } catch (Throwable th) {
                    C2073m e4 = C2073m.m8071e();
                    String str2 = C1979g.f5997n;
                    e4.mo6959a(str2, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    C1979g.this.f5999e.mo22737a().execute(new C1983d(C1979g.this));
                    throw th;
                }
                executor.execute(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    static class C1981b implements Runnable {

        /* renamed from: d */
        private final C1979g f6009d;

        /* renamed from: e */
        private final Intent f6010e;

        /* renamed from: f */
        private final int f6011f;

        C1981b(C1979g gVar, Intent intent, int i) {
            this.f6009d = gVar;
            this.f6010e = intent;
            this.f6011f = i;
        }

        public void run() {
            this.f6009d.mo6787a(this.f6010e, this.f6011f);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    interface C1982c {
        /* renamed from: b */
        void mo6775b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$d */
    static class C1983d implements Runnable {

        /* renamed from: d */
        private final C1979g f6012d;

        C1983d(C1979g gVar) {
            this.f6012d = gVar;
        }

        public void run() {
            this.f6012d.mo6788c();
        }
    }

    C1979g(Context context) {
        this(context, (C2042r) null, (C2007e0) null);
    }

    /* renamed from: b */
    private void m7805b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m7806i(String str) {
        m7805b();
        synchronized (this.f6004j) {
            for (Intent action : this.f6004j) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: k */
    private void m7807k() {
        m7805b();
        PowerManager.WakeLock b = C7662y.m29106b(this.f5998d, "ProcessCommand");
        try {
            b.acquire();
            this.f6002h.mo6829t().mo22739c(new C1980a());
        } finally {
            b.release();
        }
    }

    /* renamed from: a */
    public boolean mo6787a(Intent intent, int i) {
        C2073m e = C2073m.m8071e();
        String str = f5997n;
        e.mo6959a(str, "Adding command " + intent + " (" + i + ")");
        m7805b();
        String action = intent.getAction();
        boolean z = false;
        if (TextUtils.isEmpty(action)) {
            C2073m.m8071e().mo6966k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m7806i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f6004j) {
                if (!this.f6004j.isEmpty()) {
                    z = true;
                }
                this.f6004j.add(intent);
                if (!z) {
                    m7807k();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6788c() {
        C2073m e = C2073m.m8071e();
        String str = f5997n;
        e.mo6959a(str, "Checking if commands are complete.");
        m7805b();
        synchronized (this.f6004j) {
            if (this.f6005k != null) {
                C2073m e2 = C2073m.m8071e();
                e2.mo6959a(str, "Removing command " + this.f6005k);
                if (((Intent) this.f6004j.remove(0)).equals(this.f6005k)) {
                    this.f6005k = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C7817a b = this.f5999e.mo22738b();
            if (!this.f6003i.mo6777n() && this.f6004j.isEmpty() && !b.mo22360w()) {
                C2073m.m8071e().mo6959a(str, "No more commands & intents.");
                C1982c cVar = this.f6006l;
                if (cVar != null) {
                    cVar.mo6775b();
                }
            } else if (!this.f6004j.isEmpty()) {
                m7807k();
            }
        }
    }

    /* renamed from: d */
    public void mo6776d(C7386m mVar, boolean z) {
        this.f5999e.mo22737a().execute(new C1981b(this, C1974b.m7779c(this.f5998d, mVar, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2042r mo6789e() {
        return this.f6001g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7819c mo6790f() {
        return this.f5999e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2007e0 mo6791g() {
        return this.f6002h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C7639e0 mo6792h() {
        return this.f6000f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6793j() {
        C2073m.m8071e().mo6959a(f5997n, "Destroying SystemAlarmDispatcher");
        this.f6001g.mo6873n(this);
        this.f6006l = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6794l(C1982c cVar) {
        if (this.f6006l != null) {
            C2073m.m8071e().mo6961c(f5997n, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f6006l = cVar;
        }
    }

    C1979g(Context context, C2042r rVar, C2007e0 e0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f5998d = applicationContext;
        this.f6007m = new C2061w();
        this.f6003i = new C1974b(applicationContext, this.f6007m);
        e0Var = e0Var == null ? C2007e0.m7860n(context) : e0Var;
        this.f6002h = e0Var;
        this.f6000f = new C7639e0(e0Var.mo6823l().mo6701k());
        rVar = rVar == null ? e0Var.mo6825p() : rVar;
        this.f6001g = rVar;
        this.f5999e = e0Var.mo6829t();
        rVar.mo6869g(this);
        this.f6004j = new ArrayList();
        this.f6005k = null;
    }
}
