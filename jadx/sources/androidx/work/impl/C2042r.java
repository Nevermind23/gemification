package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0767a;
import androidx.work.C1950b;
import androidx.work.C1963h;
import androidx.work.C2073m;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.C2016a;
import androidx.work.impl.foreground.C2017b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p190o1.C7386m;
import p190o1.C7399v;
import p203p1.C7662y;
import p216q1.C7819c;
import p262t8.C8421a;

/* renamed from: androidx.work.impl.r */
public class C2042r implements C2006e, C2016a {

    /* renamed from: p */
    private static final String f6141p = C2073m.m8073i("Processor");

    /* renamed from: d */
    private PowerManager.WakeLock f6142d;

    /* renamed from: e */
    private Context f6143e;

    /* renamed from: f */
    private C1950b f6144f;

    /* renamed from: g */
    private C7819c f6145g;

    /* renamed from: h */
    private WorkDatabase f6146h;

    /* renamed from: i */
    private Map f6147i = new HashMap();

    /* renamed from: j */
    private Map f6148j = new HashMap();

    /* renamed from: k */
    private Map f6149k;

    /* renamed from: l */
    private List f6150l;

    /* renamed from: m */
    private Set f6151m;

    /* renamed from: n */
    private final List f6152n;

    /* renamed from: o */
    private final Object f6153o;

    /* renamed from: androidx.work.impl.r$a */
    private static class C2043a implements Runnable {

        /* renamed from: d */
        private C2006e f6154d;

        /* renamed from: e */
        private final C7386m f6155e;

        /* renamed from: f */
        private C8421a f6156f;

        C2043a(C2006e eVar, C7386m mVar, C8421a aVar) {
            this.f6154d = eVar;
            this.f6155e = mVar;
            this.f6156f = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.f6156f.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f6154d.mo6776d(this.f6155e, z);
        }
    }

    public C2042r(Context context, C1950b bVar, C7819c cVar, WorkDatabase workDatabase, List list) {
        this.f6143e = context;
        this.f6144f = bVar;
        this.f6145g = cVar;
        this.f6146h = workDatabase;
        this.f6150l = list;
        this.f6151m = new HashSet();
        this.f6152n = new ArrayList();
        this.f6142d = null;
        this.f6153o = new Object();
        this.f6149k = new HashMap();
    }

    /* renamed from: i */
    private static boolean m7957i(String str, C2032k0 k0Var) {
        if (k0Var != null) {
            k0Var.mo6857g();
            C2073m e = C2073m.m8071e();
            String str2 = f6141p;
            e.mo6959a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        C2073m e2 = C2073m.m8071e();
        String str3 = f6141p;
        e2.mo6959a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ C7399v m7959m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f6146h.mo6752O().mo21738b(str));
        return this.f6146h.mo6751N().mo21808i(str);
    }

    /* renamed from: o */
    private void m7960o(C7386m mVar, boolean z) {
        this.f6145g.mo22737a().execute(new C2041q(this, mVar, z));
    }

    /* renamed from: s */
    private void m7961s() {
        synchronized (this.f6153o) {
            if (!(!this.f6147i.isEmpty())) {
                try {
                    this.f6143e.startService(C2017b.m7900g(this.f6143e));
                } catch (Throwable th) {
                    C2073m.m8071e().mo6962d(f6141p, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f6142d;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f6142d = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6842a(String str) {
        synchronized (this.f6153o) {
            this.f6147i.remove(str);
            m7961s();
        }
    }

    /* renamed from: b */
    public boolean mo6843b(String str) {
        boolean containsKey;
        synchronized (this.f6153o) {
            containsKey = this.f6147i.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: c */
    public void mo6844c(String str, C1963h hVar) {
        synchronized (this.f6153o) {
            C2073m e = C2073m.m8071e();
            String str2 = f6141p;
            e.mo6963f(str2, "Moving WorkSpec (" + str + ") to the foreground");
            C2032k0 k0Var = (C2032k0) this.f6148j.remove(str);
            if (k0Var != null) {
                if (this.f6142d == null) {
                    PowerManager.WakeLock b = C7662y.m29106b(this.f6143e, "ProcessorForegroundLck");
                    this.f6142d = b;
                    b.acquire();
                }
                this.f6147i.put(str, k0Var);
                C0767a.m2904n(this.f6143e, C2017b.m7899e(this.f6143e, k0Var.mo6855d(), hVar));
            }
        }
    }

    /* renamed from: d */
    public void m7958l(C7386m mVar, boolean z) {
        synchronized (this.f6153o) {
            C2032k0 k0Var = (C2032k0) this.f6148j.get(mVar.mo21770b());
            if (k0Var != null && mVar.equals(k0Var.mo6855d())) {
                this.f6148j.remove(mVar.mo21770b());
            }
            C2073m e = C2073m.m8071e();
            String str = f6141p;
            e.mo6959a(str, getClass().getSimpleName() + " " + mVar.mo21770b() + " executed; reschedule = " + z);
            for (C2006e d : this.f6152n) {
                d.mo6776d(mVar, z);
            }
        }
    }

    /* renamed from: g */
    public void mo6869g(C2006e eVar) {
        synchronized (this.f6153o) {
            this.f6152n.add(eVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.work.impl.k0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p190o1.C7399v mo6870h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6153o
            monitor-enter(r0)
            java.util.Map r1 = r2.f6147i     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0021 }
            androidx.work.impl.k0 r1 = (androidx.work.impl.C2032k0) r1     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0016
            java.util.Map r1 = r2.f6148j     // Catch:{ all -> 0x0021 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0021 }
            r1 = r3
            androidx.work.impl.k0 r1 = (androidx.work.impl.C2032k0) r1     // Catch:{ all -> 0x0021 }
        L_0x0016:
            if (r1 == 0) goto L_0x001e
            o1.v r3 = r1.mo6856e()     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            r3 = 0
            return r3
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C2042r.mo6870h(java.lang.String):o1.v");
    }

    /* renamed from: j */
    public boolean mo6871j(String str) {
        boolean contains;
        synchronized (this.f6153o) {
            contains = this.f6151m.contains(str);
        }
        return contains;
    }

    /* renamed from: k */
    public boolean mo6872k(String str) {
        boolean z;
        synchronized (this.f6153o) {
            if (!this.f6148j.containsKey(str)) {
                if (!this.f6147i.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    public void mo6873n(C2006e eVar) {
        synchronized (this.f6153o) {
            this.f6152n.remove(eVar);
        }
    }

    /* renamed from: p */
    public boolean mo6874p(C2060v vVar) {
        return mo6875q(vVar, (WorkerParameters.C1948a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        return false;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6875q(androidx.work.impl.C2060v r13, androidx.work.WorkerParameters.C1948a r14) {
        /*
            r12 = this;
            o1.m r0 = r13.mo6911a()
            java.lang.String r1 = r0.mo21770b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f6146h
            androidx.work.impl.p r3 = new androidx.work.impl.p
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.mo23802D(r3)
            r8 = r2
            o1.v r8 = (p190o1.C7399v) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            androidx.work.m r13 = androidx.work.C2073m.m8071e()
            java.lang.String r14 = f6141p
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.mo6966k(r14, r1)
            r12.m7960o(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f6153o
            monitor-enter(r10)
            boolean r3 = r12.mo6872k(r1)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x008d
            java.util.Map r14 = r12.f6149k     // Catch:{ all -> 0x0112 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0112 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0112 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0112 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0112 }
            androidx.work.impl.v r1 = (androidx.work.impl.C2060v) r1     // Catch:{ all -> 0x0112 }
            o1.m r1 = r1.mo6911a()     // Catch:{ all -> 0x0112 }
            int r1 = r1.mo21769a()     // Catch:{ all -> 0x0112 }
            int r3 = r0.mo21769a()     // Catch:{ all -> 0x0112 }
            if (r1 != r3) goto L_0x0088
            r14.add(r13)     // Catch:{ all -> 0x0112 }
            androidx.work.m r13 = androidx.work.C2073m.m8071e()     // Catch:{ all -> 0x0112 }
            java.lang.String r14 = f6141p     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r1.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0112 }
            r1.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0112 }
            r13.mo6959a(r14, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x008b
        L_0x0088:
            r12.m7960o(r0, r2)     // Catch:{ all -> 0x0112 }
        L_0x008b:
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            return r2
        L_0x008d:
            int r3 = r8.mo21788f()     // Catch:{ all -> 0x0112 }
            int r4 = r0.mo21769a()     // Catch:{ all -> 0x0112 }
            if (r3 == r4) goto L_0x009c
            r12.m7960o(r0, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            return r2
        L_0x009c:
            androidx.work.impl.k0$c r11 = new androidx.work.impl.k0$c     // Catch:{ all -> 0x0112 }
            android.content.Context r3 = r12.f6143e     // Catch:{ all -> 0x0112 }
            androidx.work.b r4 = r12.f6144f     // Catch:{ all -> 0x0112 }
            q1.c r5 = r12.f6145g     // Catch:{ all -> 0x0112 }
            androidx.work.impl.WorkDatabase r7 = r12.f6146h     // Catch:{ all -> 0x0112 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0112 }
            java.util.List r2 = r12.f6150l     // Catch:{ all -> 0x0112 }
            androidx.work.impl.k0$c r2 = r11.mo6865d(r2)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.k0$c r14 = r2.mo6864c(r14)     // Catch:{ all -> 0x0112 }
            androidx.work.impl.k0 r14 = r14.mo6863b()     // Catch:{ all -> 0x0112 }
            t8.a r2 = r14.mo6854c()     // Catch:{ all -> 0x0112 }
            androidx.work.impl.r$a r3 = new androidx.work.impl.r$a     // Catch:{ all -> 0x0112 }
            o1.m r4 = r13.mo6911a()     // Catch:{ all -> 0x0112 }
            r3.<init>(r12, r4, r2)     // Catch:{ all -> 0x0112 }
            q1.c r4 = r12.f6145g     // Catch:{ all -> 0x0112 }
            java.util.concurrent.Executor r4 = r4.mo22737a()     // Catch:{ all -> 0x0112 }
            r2.mo2810c(r3, r4)     // Catch:{ all -> 0x0112 }
            java.util.Map r2 = r12.f6148j     // Catch:{ all -> 0x0112 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0112 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0112 }
            r2.<init>()     // Catch:{ all -> 0x0112 }
            r2.add(r13)     // Catch:{ all -> 0x0112 }
            java.util.Map r13 = r12.f6149k     // Catch:{ all -> 0x0112 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0112 }
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            q1.c r13 = r12.f6145g
            q1.a r13 = r13.mo22738b()
            r13.execute(r14)
            androidx.work.m r13 = androidx.work.C2073m.m8071e()
            java.lang.String r14 = f6141p
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.mo6959a(r14, r0)
            r13 = 1
            return r13
        L_0x0112:
            r13 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0112 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C2042r.mo6875q(androidx.work.impl.v, androidx.work.WorkerParameters$a):boolean");
    }

    /* renamed from: r */
    public boolean mo6876r(String str) {
        C2032k0 k0Var;
        boolean z;
        synchronized (this.f6153o) {
            C2073m e = C2073m.m8071e();
            String str2 = f6141p;
            e.mo6959a(str2, "Processor cancelling " + str);
            this.f6151m.add(str);
            k0Var = (C2032k0) this.f6147i.remove(str);
            if (k0Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (k0Var == null) {
                k0Var = (C2032k0) this.f6148j.remove(str);
            }
            if (k0Var != null) {
                this.f6149k.remove(str);
            }
        }
        boolean i = m7957i(str, k0Var);
        if (z) {
            m7961s();
        }
        return i;
    }

    /* renamed from: t */
    public boolean mo6877t(C2060v vVar) {
        C2032k0 k0Var;
        String b = vVar.mo6911a().mo21770b();
        synchronized (this.f6153o) {
            C2073m e = C2073m.m8071e();
            String str = f6141p;
            e.mo6959a(str, "Processor stopping foreground work " + b);
            k0Var = (C2032k0) this.f6147i.remove(b);
            if (k0Var != null) {
                this.f6149k.remove(b);
            }
        }
        return m7957i(b, k0Var);
    }

    /* renamed from: u */
    public boolean mo6878u(C2060v vVar) {
        String b = vVar.mo6911a().mo21770b();
        synchronized (this.f6153o) {
            C2032k0 k0Var = (C2032k0) this.f6148j.remove(b);
            if (k0Var == null) {
                C2073m e = C2073m.m8071e();
                String str = f6141p;
                e.mo6959a(str, "WorkerWrapper could not be found for " + b);
                return false;
            }
            Set set = (Set) this.f6149k.get(b);
            if (set != null) {
                if (set.contains(vVar)) {
                    C2073m e2 = C2073m.m8071e();
                    String str2 = f6141p;
                    e2.mo6959a(str2, "Processor stopping background work " + b);
                    this.f6149k.remove(b);
                    return m7957i(b, k0Var);
                }
            }
            return false;
        }
    }
}
