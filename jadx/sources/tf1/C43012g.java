package tf1;

import he1.C41238w;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41863a;
import pf1.C42197d;
import sf1.C42558a;
import sf1.C42561d;
import sf1.C42562e;
import tf1.C43002e;
import xf1.C43286k;

/* renamed from: tf1.g */
public final class C43012g {

    /* renamed from: f */
    public static final C43013a f100425f = new C43013a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f100426a;

    /* renamed from: b */
    private final long f100427b;

    /* renamed from: c */
    private final C42561d f100428c;

    /* renamed from: d */
    private final C43014b f100429d = new C43014b(this, C41536l.m120497q(C42197d.f99272i, " ConnectionPool"));

    /* renamed from: e */
    private final ConcurrentLinkedQueue f100430e = new ConcurrentLinkedQueue();

    /* renamed from: tf1.g$a */
    public static final class C43013a {
        private C43013a() {
        }

        public /* synthetic */ C43013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tf1.g$b */
    public static final class C43014b extends C42558a {

        /* renamed from: e */
        final /* synthetic */ C43012g f100431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43014b(C43012g gVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f100431e = gVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            return this.f100431e.mo101589b(System.nanoTime());
        }
    }

    public C43012g(C42562e eVar, int i, long j, TimeUnit timeUnit) {
        boolean z;
        C41536l.m120489i(eVar, "taskRunner");
        C41536l.m120489i(timeUnit, "timeUnit");
        this.f100426a = i;
        this.f100427b = timeUnit.toNanos(j);
        this.f100428c = eVar.mo98014i();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    /* renamed from: d */
    private final int m123463d(C43006f fVar, long j) {
        if (!C42197d.f99271h || Thread.holdsLock(fVar)) {
            List o = fVar.mo101572o();
            int i = 0;
            while (i < o.size()) {
                Reference reference = (Reference) o.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    C43286k.f101052a.mo101988g().mo101961l("A connection to " + fVar.mo101562B().mo96800a().mo96668l() + " was leaked. Did you forget to close a response body?", ((C43002e.C43004b) reference).mo101560a());
                    o.remove(i);
                    fVar.mo101564E(true);
                    if (o.isEmpty()) {
                        fVar.mo101563D(j - this.f100427b);
                        return 0;
                    }
                }
            }
            return o.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    /* renamed from: a */
    public final boolean mo101588a(C41863a aVar, C43002e eVar, List list, boolean z) {
        C41536l.m120489i(aVar, "address");
        C41536l.m120489i(eVar, "call");
        Iterator it = this.f100430e.iterator();
        while (it.hasNext()) {
            C43006f fVar = (C43006f) it.next();
            C41536l.m120488h(fVar, "connection");
            synchronized (fVar) {
                if (z) {
                    if (!fVar.mo101581w()) {
                        C41238w wVar = C41238w.f97225a;
                    }
                }
                if (fVar.mo101579u(aVar, list)) {
                    eVar.mo101536c(fVar);
                    return true;
                }
                C41238w wVar2 = C41238w.f97225a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        pf1.C42197d.m122548n(r3.mo101565F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        if (r10.f100430e.isEmpty() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        r10.f100428c.mo97995a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        return 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo101589b(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue r0 = r10.f100430e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r0.next()
            tf1.f r6 = (tf1.C43006f) r6
            java.lang.String r7 = "connection"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)
            monitor-enter(r6)
            int r7 = r10.m123463d(r6, r11)     // Catch:{ all -> 0x003a }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.mo101573p()     // Catch:{ all -> 0x003a }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            r3 = r6
            r4 = r7
        L_0x0036:
            he1.w r7 = he1.C41238w.f97225a     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003a:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L_0x003d:
            long r6 = r10.f100427b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            int r0 = r10.f100426a
            if (r1 <= r0) goto L_0x0048
            goto L_0x0052
        L_0x0048:
            if (r1 <= 0) goto L_0x004c
            long r6 = r6 - r4
            return r6
        L_0x004c:
            if (r2 <= 0) goto L_0x004f
            return r6
        L_0x004f:
            r11 = -1
            return r11
        L_0x0052:
            kotlin.jvm.internal.C41536l.m120486f(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.mo101572o()     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x0066
            monitor-exit(r3)
            return r6
        L_0x0066:
            long r8 = r3.mo101573p()     // Catch:{ all -> 0x008f }
            long r8 = r8 + r4
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0071
            monitor-exit(r3)
            return r6
        L_0x0071:
            r3.mo101564E(r1)     // Catch:{ all -> 0x008f }
            java.util.concurrent.ConcurrentLinkedQueue r11 = r10.f100430e     // Catch:{ all -> 0x008f }
            r11.remove(r3)     // Catch:{ all -> 0x008f }
            monitor-exit(r3)
            java.net.Socket r11 = r3.mo101565F()
            pf1.C42197d.m122548n(r11)
            java.util.concurrent.ConcurrentLinkedQueue r11 = r10.f100430e
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x008e
            sf1.d r11 = r10.f100428c
            r11.mo97995a()
        L_0x008e:
            return r6
        L_0x008f:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43012g.mo101589b(long):long");
    }

    /* renamed from: c */
    public final boolean mo101590c(C43006f fVar) {
        C41536l.m120489i(fVar, "connection");
        if (C42197d.f99271h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        } else if (fVar.mo101574q() || this.f100426a == 0) {
            fVar.mo101564E(true);
            this.f100430e.remove(fVar);
            if (this.f100430e.isEmpty()) {
                this.f100428c.mo97995a();
            }
            return true;
        } else {
            C42561d.m123212j(this.f100428c, this.f100429d, 0, 2, (Object) null);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo101591e(C43006f fVar) {
        C41536l.m120489i(fVar, "connection");
        if (!C42197d.f99271h || Thread.holdsLock(fVar)) {
            this.f100430e.add(fVar);
            C42561d.m123212j(this.f100428c, this.f100429d, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }
}
