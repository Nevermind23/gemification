package of1;

import he1.C41238w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import pf1.C42197d;
import tf1.C43002e;

/* renamed from: of1.p */
public final class C41913p {

    /* renamed from: a */
    private int f98523a = 64;

    /* renamed from: b */
    private int f98524b = 5;

    /* renamed from: c */
    private Runnable f98525c;

    /* renamed from: d */
    private ExecutorService f98526d;

    /* renamed from: e */
    private final ArrayDeque f98527e = new ArrayDeque();

    /* renamed from: f */
    private final ArrayDeque f98528f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f98529g = new ArrayDeque();

    /* renamed from: d */
    private final C43002e.C43003a m121536d(String str) {
        Iterator it = this.f98528f.iterator();
        while (it.hasNext()) {
            C43002e.C43003a aVar = (C43002e.C43003a) it.next();
            if (C41536l.m120484d(aVar.mo101557d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f98527e.iterator();
        while (it2.hasNext()) {
            C43002e.C43003a aVar2 = (C43002e.C43003a) it2.next();
            if (C41536l.m120484d(aVar2.mo101557d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    private final void m121537e(Deque deque, Object obj) {
        Runnable h;
        synchronized (this) {
            if (deque.remove(obj)) {
                h = mo96876h();
                C41238w wVar = C41238w.f97225a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m121538k() && h != null) {
            h.run();
        }
    }

    /* renamed from: k */
    private final boolean m121538k() {
        int i;
        boolean z;
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator it = this.f98527e.iterator();
                C41536l.m120488h(it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C43002e.C43003a aVar = (C43002e.C43003a) it.next();
                    if (this.f98528f.size() >= mo96877i()) {
                        break;
                    } else if (aVar.mo101556c().get() < mo96878j()) {
                        it.remove();
                        aVar.mo101556c().incrementAndGet();
                        C41536l.m120488h(aVar, "asyncCall");
                        arrayList.add(aVar);
                        this.f98528f.add(aVar);
                    }
                }
                if (mo96879l() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C41238w wVar = C41238w.f97225a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C43002e.C43003a) arrayList.get(i)).mo101554a(mo96873c());
            }
            return z;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: a */
    public final void mo96871a(C43002e.C43003a aVar) {
        C43002e.C43003a d;
        C41536l.m120489i(aVar, "call");
        synchronized (this) {
            this.f98527e.add(aVar);
            if (!aVar.mo101555b().mo101544n() && (d = m121536d(aVar.mo101557d())) != null) {
                aVar.mo101558e(d);
            }
            C41238w wVar = C41238w.f97225a;
        }
        m121538k();
    }

    /* renamed from: b */
    public final synchronized void mo96872b(C43002e eVar) {
        C41536l.m120489i(eVar, "call");
        this.f98529g.add(eVar);
    }

    /* renamed from: c */
    public final synchronized ExecutorService mo96873c() {
        ExecutorService executorService;
        if (this.f98526d == null) {
            this.f98526d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C42197d.m122519M(C41536l.m120497q(C42197d.f99272i, " Dispatcher"), false));
        }
        executorService = this.f98526d;
        C41536l.m120486f(executorService);
        return executorService;
    }

    /* renamed from: f */
    public final void mo96874f(C43002e.C43003a aVar) {
        C41536l.m120489i(aVar, "call");
        aVar.mo101556c().decrementAndGet();
        m121537e(this.f98528f, aVar);
    }

    /* renamed from: g */
    public final void mo96875g(C43002e eVar) {
        C41536l.m120489i(eVar, "call");
        m121537e(this.f98529g, eVar);
    }

    /* renamed from: h */
    public final synchronized Runnable mo96876h() {
        return this.f98525c;
    }

    /* renamed from: i */
    public final synchronized int mo96877i() {
        return this.f98523a;
    }

    /* renamed from: j */
    public final synchronized int mo96878j() {
        return this.f98524b;
    }

    /* renamed from: l */
    public final synchronized int mo96879l() {
        return this.f98528f.size() + this.f98529g.size();
    }

    /* renamed from: m */
    public final void mo96880m(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f98523a = i;
                C41238w wVar = C41238w.f97225a;
            }
            m121538k();
            return;
        }
        throw new IllegalArgumentException(C41536l.m120497q("max < 1: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: n */
    public final void mo96881n(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.f98524b = i;
                C41238w wVar = C41238w.f97225a;
            }
            m121538k();
            return;
        }
        throw new IllegalArgumentException(C41536l.m120497q("max < 1: ", Integer.valueOf(i)).toString());
    }
}
