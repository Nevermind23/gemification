package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C0611b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.scheduling.o */
public final class C41646o {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97886b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f97887c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f97888d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f97889e;

    /* renamed from: a */
    private final AtomicReferenceArray f97890a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C41646o> cls = C41646o.class;
        f97886b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f97887c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f97888d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f97889e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C41639h m120833b(C41646o oVar, C41639h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return oVar.mo96451a(hVar, z);
    }

    /* renamed from: c */
    private final C41639h m120834c(C41639h hVar) {
        boolean z = true;
        if (hVar.f97875e.mo96448b() != 1) {
            z = false;
        }
        if (z) {
            f97889e.incrementAndGet(this);
        }
        if (mo96452e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & C11051p3.f31760d;
        while (this.f97890a.get(i) != null) {
            Thread.yield();
        }
        this.f97890a.lazySet(i, hVar);
        f97887c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m120835d(C41639h hVar) {
        if (hVar != null) {
            boolean z = true;
            if (hVar.f97875e.mo96448b() != 1) {
                z = false;
            }
            if (z) {
                f97889e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final C41639h m120836i() {
        C41639h hVar;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & C11051p3.f31760d;
            if (f97888d.compareAndSet(this, i, i + 1) && (hVar = (C41639h) this.f97890a.getAndSet(i2, (Object) null)) != null) {
                m120835d(hVar);
                return hVar;
            }
        }
    }

    /* renamed from: j */
    private final boolean m120837j(C41635d dVar) {
        C41639h i = m120836i();
        if (i == null) {
            return false;
        }
        dVar.mo96400a(i);
        return true;
    }

    /* renamed from: m */
    private final long m120838m(C41646o oVar, boolean z) {
        C41639h hVar;
        do {
            hVar = (C41639h) oVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f97875e.mo96448b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C41643l.f97882e.mo96445a() - hVar.f97874d;
            long j = C41643l.f97878a;
            if (a < j) {
                return j - a;
            }
        } while (!C0611b.m2366a(f97886b, oVar, hVar, (Object) null));
        m120833b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C41639h mo96451a(C41639h hVar, boolean z) {
        if (z) {
            return m120834c(hVar);
        }
        C41639h hVar2 = (C41639h) f97886b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m120834c(hVar2);
    }

    /* renamed from: e */
    public final int mo96452e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo96453f() {
        return this.lastScheduledTask != null ? mo96452e() + 1 : mo96452e();
    }

    /* renamed from: g */
    public final void mo96454g(C41635d dVar) {
        C41639h hVar = (C41639h) f97886b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo96400a(hVar);
        }
        do {
        } while (m120837j(dVar));
    }

    /* renamed from: h */
    public final C41639h mo96455h() {
        C41639h hVar = (C41639h) f97886b.getAndSet(this, (Object) null);
        return hVar == null ? m120836i() : hVar;
    }

    /* renamed from: k */
    public final long mo96456k(C41646o oVar) {
        int i = oVar.consumerIndex;
        int i2 = oVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = oVar.f97890a;
        while (true) {
            boolean z = true;
            if (i == i2) {
                break;
            }
            int i3 = i & C11051p3.f31760d;
            if (oVar.blockingTasksInBuffer == 0) {
                break;
            }
            C41639h hVar = (C41639h) atomicReferenceArray.get(i3);
            if (hVar != null) {
                if (hVar.f97875e.mo96448b() != 1) {
                    z = false;
                }
                if (z && C41645n.m120832a(atomicReferenceArray, i3, hVar, (Object) null)) {
                    f97889e.decrementAndGet(oVar);
                    m120833b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
            i++;
        }
        return m120838m(oVar, true);
    }

    /* renamed from: l */
    public final long mo96457l(C41646o oVar) {
        C41639h i = oVar.m120836i();
        if (i == null) {
            return m120838m(oVar, false);
        }
        m120833b(this, i, false, 2, (Object) null);
        return -1;
    }
}
