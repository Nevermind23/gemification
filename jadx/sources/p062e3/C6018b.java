package p062e3;

import android.support.p013v4.media.session.C0125b;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p127j3.C6690a;
import p127j3.C6693c;
import p127j3.C6695d;
import p127j3.C6696e;
import p217q2.C7851m;
import p243s2.C8140s;
import p332z2.C9198e;
import ue1.C43064a;

/* renamed from: e3.b */
public final class C6018b implements C6026c {

    /* renamed from: o */
    static final long f18786o;

    /* renamed from: p */
    static final long f18787p;

    /* renamed from: a */
    Map f18788a = new LinkedHashMap();

    /* renamed from: b */
    volatile C6695d f18789b = C6695d.DISCONNECTED;

    /* renamed from: c */
    final C6024f f18790c = new C6024f();

    /* renamed from: d */
    private final C7851m f18791d;

    /* renamed from: e */
    private final C6693c f18792e;

    /* renamed from: f */
    private final Executor f18793f;

    /* renamed from: g */
    private final long f18794g;

    /* renamed from: h */
    private final C43064a f18795h;

    /* renamed from: i */
    private final C9198e f18796i = new C9198e();

    /* renamed from: j */
    private final Runnable f18797j = new C6019a();

    /* renamed from: k */
    private final Runnable f18798k = new C6020b();

    /* renamed from: l */
    private final Runnable f18799l = new C6021c();

    /* renamed from: m */
    private final List f18800m = new CopyOnWriteArrayList();

    /* renamed from: n */
    private final boolean f18801n;

    /* renamed from: e3.b$a */
    class C6019a implements Runnable {
        C6019a() {
        }

        public void run() {
            C6018b.this.mo19512c();
        }
    }

    /* renamed from: e3.b$b */
    class C6020b implements Runnable {
        C6020b() {
        }

        public void run() {
            C6018b.this.mo19514e();
        }
    }

    /* renamed from: e3.b$c */
    class C6021c implements Runnable {
        C6021c() {
        }

        public void run() {
            C6018b.this.mo19513d();
        }
    }

    /* renamed from: e3.b$d */
    class C6022d implements Runnable {
        C6022d() {
        }

        public void run() {
            C6018b.this.mo19515f(new ApolloNetworkException("Subscription server is not responding"));
        }
    }

    /* renamed from: e3.b$e */
    class C6023e implements Runnable {
        C6023e() {
        }

        public void run() {
            C6018b.this.mo19511a(false);
        }
    }

    /* renamed from: e3.b$f */
    static final class C6024f {

        /* renamed from: a */
        final Map f18807a = new LinkedHashMap();

        /* renamed from: b */
        Timer f18808b;

        C6024f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19521a(int i) {
            Timer timer;
            synchronized (this) {
                TimerTask timerTask = (TimerTask) this.f18807a.remove(Integer.valueOf(i));
                if (timerTask != null) {
                    timerTask.cancel();
                }
                if (this.f18807a.isEmpty() && (timer = this.f18808b) != null) {
                    timer.cancel();
                    this.f18808b = null;
                }
            }
        }
    }

    /* renamed from: e3.b$g */
    private static final class C6025g implements C6696e.C6697a {

        /* renamed from: a */
        private final C6018b f18809a;

        /* renamed from: b */
        private final Executor f18810b;

        C6025g(C6018b bVar, Executor executor) {
            this.f18809a = bVar;
            this.f18810b = executor;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f18786o = timeUnit.toMillis(5);
        f18787p = timeUnit.toMillis(10);
    }

    public C6018b(C7851m mVar, C6696e.C6698b bVar, C6693c cVar, Executor executor, long j, C43064a aVar, boolean z) {
        C8140s.m30754b(mVar, "scalarTypeAdapters == null");
        C8140s.m30754b(bVar, "transportFactory == null");
        C8140s.m30754b(executor, "dispatcher == null");
        C8140s.m30754b(aVar, "responseNormalizer == null");
        this.f18791d = (C7851m) C8140s.m30754b(mVar, "scalarTypeAdapters == null");
        this.f18792e = (C6693c) C8140s.m30754b(cVar, "connectionParams == null");
        bVar.mo20682a(new C6025g(this, executor));
        this.f18793f = executor;
        this.f18794g = j;
        this.f18795h = aVar;
        this.f18801n = z;
    }

    /* renamed from: b */
    private void m24140b(C6695d dVar, C6695d dVar2) {
        if (dVar != dVar2) {
            Iterator it = this.f18800m.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection mo19511a(boolean z) {
        C6695d dVar;
        Collection values;
        synchronized (this) {
            dVar = this.f18789b;
            values = this.f18788a.values();
            if (z || this.f18788a.isEmpty()) {
                new C6690a.C6691a();
                throw null;
            }
        }
        m24140b(dVar, this.f18789b);
        return values;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19512c() {
        this.f18790c.mo19521a(1);
        this.f18793f.execute(new C6022d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19513d() {
        synchronized (this) {
            this.f18789b = C6695d.DISCONNECTED;
            new C6690a.C6691a();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo19514e() {
        this.f18790c.mo19521a(2);
        this.f18793f.execute(new C6023e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19515f(Throwable th) {
        Iterator it = mo19511a(true).iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        }
    }
}
