package sf1;

import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.jvm.internal.C41536l;
import pf1.C42197d;

/* renamed from: sf1.d */
public final class C42561d {

    /* renamed from: a */
    private final C42562e f100162a;

    /* renamed from: b */
    private final String f100163b;

    /* renamed from: c */
    private boolean f100164c;

    /* renamed from: d */
    private C42558a f100165d;

    /* renamed from: e */
    private final List f100166e = new ArrayList();

    /* renamed from: f */
    private boolean f100167f;

    public C42561d(C42562e eVar, String str) {
        C41536l.m120489i(eVar, "taskRunner");
        C41536l.m120489i(str, "name");
        this.f100162a = eVar;
        this.f100163b = str;
    }

    /* renamed from: j */
    public static /* synthetic */ void m123212j(C42561d dVar, C42558a aVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dVar.mo98003i(aVar, j);
    }

    /* renamed from: a */
    public final void mo97995a() {
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            synchronized (this.f100162a) {
                if (mo97996b()) {
                    mo98002h().mo98013h(this);
                }
                C41238w wVar = C41238w.f97225a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: b */
    public final boolean mo97996b() {
        C42558a aVar = this.f100165d;
        if (aVar != null) {
            C41536l.m120486f(aVar);
            if (aVar.mo97988a()) {
                this.f100167f = true;
            }
        }
        int size = this.f100166e.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((C42558a) this.f100166e.get(size)).mo97988a()) {
                    C42558a aVar2 = (C42558a) this.f100166e.get(size);
                    if (C42562e.f100168h.mo98019a().isLoggable(Level.FINE)) {
                        C42559b.m123210c(aVar2, this, "canceled");
                    }
                    this.f100166e.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final C42558a mo97997c() {
        return this.f100165d;
    }

    /* renamed from: d */
    public final boolean mo97998d() {
        return this.f100167f;
    }

    /* renamed from: e */
    public final List mo97999e() {
        return this.f100166e;
    }

    /* renamed from: f */
    public final String mo98000f() {
        return this.f100163b;
    }

    /* renamed from: g */
    public final boolean mo98001g() {
        return this.f100164c;
    }

    /* renamed from: h */
    public final C42562e mo98002h() {
        return this.f100162a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98003i(sf1.C42558a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            sf1.e r0 = r2.f100162a
            monitor-enter(r0)
            boolean r1 = r2.mo98001g()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0042
            boolean r4 = r3.mo97988a()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0029
            sf1.e$b r4 = sf1.C42562e.f100168h     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.mo98019a()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            sf1.C42559b.m123210c(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            sf1.e$b r4 = sf1.C42562e.f100168h     // Catch:{ all -> 0x0054 }
            java.util.logging.Logger r4 = r4.mo98019a()     // Catch:{ all -> 0x0054 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0054 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            sf1.C42559b.m123210c(r3, r2, r4)     // Catch:{ all -> 0x0054 }
        L_0x003c:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0042:
            r1 = 0
            boolean r3 = r2.mo98004k(r3, r4, r1)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0050
            sf1.e r3 = r2.mo98002h()     // Catch:{ all -> 0x0054 }
            r3.mo98013h(r2)     // Catch:{ all -> 0x0054 }
        L_0x0050:
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            return
        L_0x0054:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.C42561d.mo98003i(sf1.a, long):void");
    }

    /* renamed from: k */
    public final boolean mo98004k(C42558a aVar, long j, boolean z) {
        boolean z2;
        String str;
        C41536l.m120489i(aVar, "task");
        aVar.mo97992e(this);
        long b = this.f100162a.mo98012g().mo98015b();
        long j2 = b + j;
        int indexOf = this.f100166e.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.mo97990c() <= j2) {
                if (C42562e.f100168h.mo98019a().isLoggable(Level.FINE)) {
                    C42559b.m123210c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f100166e.remove(indexOf);
        }
        aVar.mo97993g(j2);
        if (C42562e.f100168h.mo98019a().isLoggable(Level.FINE)) {
            if (z) {
                str = C41536l.m120497q("run again after ", C42559b.m123209b(j2 - b));
            } else {
                str = C41536l.m120497q("scheduled after ", C42559b.m123209b(j2 - b));
            }
            C42559b.m123210c(aVar, this, str);
        }
        Iterator it = this.f100166e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C42558a) it.next()).mo97990c() - b > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f100166e.size();
        }
        this.f100166e.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void mo98005l(C42558a aVar) {
        this.f100165d = aVar;
    }

    /* renamed from: m */
    public final void mo98006m(boolean z) {
        this.f100167f = z;
    }

    /* renamed from: n */
    public final void mo98007n(boolean z) {
        this.f100164c = z;
    }

    /* renamed from: o */
    public final void mo98008o() {
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            synchronized (this.f100162a) {
                mo98007n(true);
                if (mo97996b()) {
                    mo98002h().mo98013h(this);
                }
                C41238w wVar = C41238w.f97225a;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f100163b;
    }
}
