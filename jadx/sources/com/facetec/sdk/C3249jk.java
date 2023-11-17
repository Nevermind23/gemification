package com.facetec.sdk;

import com.facetec.sdk.C3325kw;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.jk */
public final class C3249jk {

    /* renamed from: a */
    static final Executor f10606a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3303ki.m13253b("OkHttp ConnectionPool", true));

    /* renamed from: h */
    static final /* synthetic */ boolean f10607h = true;

    /* renamed from: b */
    final Runnable f10608b;

    /* renamed from: c */
    final Deque<C3319ks> f10609c;

    /* renamed from: d */
    final C3316kp f10610d;

    /* renamed from: e */
    boolean f10611e;

    /* renamed from: g */
    private final long f10612g;

    /* renamed from: i */
    private final int f10613i;

    public C3249jk() {
        this(TimeUnit.MINUTES);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo9461b(C3319ks ksVar) {
        if (!f10607h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (ksVar.f10914j || this.f10613i == 0) {
            this.f10609c.remove(ksVar);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo9462d(long j) {
        int size;
        synchronized (this) {
            C3319ks ksVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C3319ks next : this.f10609c) {
                List<Reference<C3325kw>> list = next.f10918o;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        size = list.size();
                        break;
                    }
                    Reference reference = list.get(i3);
                    if (reference.get() != null) {
                        i3++;
                    } else {
                        StringBuilder sb = new StringBuilder("A connection to ");
                        sb.append(next.mo9663e().mo9632a().mo9431d());
                        sb.append(" was leaked. Did you forget to close a response body?");
                        C3422mg.m13612c().mo9800a(sb.toString(), ((C3325kw.C3326c) reference).f10948b);
                        list.remove(i3);
                        next.f10914j = true;
                        if (list.isEmpty()) {
                            next.f10915k = j - this.f10612g;
                            size = 0;
                            break;
                        }
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f10915k;
                    if (j3 > j2) {
                        ksVar = next;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f10612g;
            if (j2 < j4) {
                if (i <= this.f10613i) {
                    if (i > 0) {
                        long j5 = j4 - j2;
                        return j5;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f10611e = false;
                        return -1;
                    }
                }
            }
            this.f10609c.remove(ksVar);
            C3303ki.m13267d(ksVar.mo9655a());
            return 0;
        }
    }

    private C3249jk(TimeUnit timeUnit) {
        this.f10608b = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                L_0x0000:
                    com.facetec.sdk.jk r0 = com.facetec.sdk.C3249jk.this
                    long r1 = java.lang.System.nanoTime()
                    long r0 = r0.mo9462d(r1)
                    r2 = -1
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 != 0) goto L_0x0011
                    return
                L_0x0011:
                    r2 = 0
                    int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0000
                    r2 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r0 / r2
                    long r2 = r2 * r4
                    long r0 = r0 - r2
                    com.facetec.sdk.jk r2 = com.facetec.sdk.C3249jk.this
                    monitor-enter(r2)
                    com.facetec.sdk.jk r3 = com.facetec.sdk.C3249jk.this     // Catch:{ InterruptedException -> 0x002a }
                    int r0 = (int) r0     // Catch:{ InterruptedException -> 0x002a }
                    r3.wait(r4, r0)     // Catch:{ InterruptedException -> 0x002a }
                    goto L_0x002a
                L_0x0028:
                    r0 = move-exception
                    goto L_0x002c
                L_0x002a:
                    monitor-exit(r2)     // Catch:{ all -> 0x0028 }
                    goto L_0x0000
                L_0x002c:
                    monitor-exit(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3249jk.C32505.run():void");
            }
        };
        this.f10609c = new ArrayDeque();
        this.f10610d = new C3316kp();
        this.f10613i = 5;
        this.f10612g = timeUnit.toNanos(5);
    }
}
