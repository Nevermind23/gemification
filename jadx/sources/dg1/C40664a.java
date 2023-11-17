package dg1;

import he1.C41238w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dg1.a */
public class C40664a extends C40669a0 {

    /* renamed from: i */
    public static final C40665a f96298i = new C40665a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final long f96299j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final long f96300k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static C40664a f96301l;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f96302f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C40664a f96303g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f96304h;

    /* renamed from: dg1.a$a */
    public static final class C40665a {
        private C40665a() {
        }

        public /* synthetic */ C40665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m117556d(C40664a aVar) {
            synchronized (C40664a.class) {
                if (!aVar.f96302f) {
                    return false;
                }
                aVar.f96302f = false;
                for (C40664a i = C40664a.f96301l; i != null; i = i.f96303g) {
                    if (i.f96303g == aVar) {
                        i.f96303g = aVar.f96303g;
                        aVar.f96303g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m117557e(C40664a aVar, long j, boolean z) {
            synchronized (C40664a.class) {
                if (!aVar.f96302f) {
                    aVar.f96302f = true;
                    if (C40664a.f96301l == null) {
                        C40664a.f96301l = new C40664a();
                        new C40666b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i != 0 && z) {
                        aVar.f96304h = Math.min(j, aVar.mo94684c() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        aVar.f96304h = j + nanoTime;
                    } else if (z) {
                        aVar.f96304h = aVar.mo94684c();
                    } else {
                        throw new AssertionError();
                    }
                    long o = aVar.m117546w(nanoTime);
                    C40664a i2 = C40664a.f96301l;
                    C41536l.m120486f(i2);
                    while (true) {
                        if (i2.f96303g == null) {
                            break;
                        }
                        C40664a m = i2.f96303g;
                        C41536l.m120486f(m);
                        if (o < m.m117546w(nanoTime)) {
                            break;
                        }
                        i2 = i2.f96303g;
                        C41536l.m120486f(i2);
                    }
                    aVar.f96303g = i2.f96303g;
                    i2.f96303g = aVar;
                    if (i2 == C40664a.f96301l) {
                        C40664a.class.notify();
                    }
                    C41238w wVar = C41238w.f97225a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }

        /* renamed from: c */
        public final C40664a mo94671c() {
            C40664a i = C40664a.f96301l;
            C41536l.m120486f(i);
            C40664a m = i.f96303g;
            Class<C40664a> cls = C40664a.class;
            if (m == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C40664a.f96299j);
                C40664a i2 = C40664a.f96301l;
                C41536l.m120486f(i2);
                if (i2.f96303g != null || System.nanoTime() - nanoTime < C40664a.f96300k) {
                    return null;
                }
                return C40664a.f96301l;
            }
            long o = m.m117546w(System.nanoTime());
            if (o > 0) {
                long j = o / 1000000;
                cls.wait(j, (int) (o - (1000000 * j)));
                return null;
            }
            C40664a i3 = C40664a.f96301l;
            C41536l.m120486f(i3);
            i3.f96303g = m.f96303g;
            m.f96303g = null;
            return m;
        }
    }

    /* renamed from: dg1.a$b */
    private static final class C40666b extends Thread {
        public C40666b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 != null) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
            r1.mo94670z();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<dg1.a> r0 = dg1.C40664a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                dg1.a$a r1 = dg1.C40664a.f96298i     // Catch:{ all -> 0x001f }
                dg1.a r1 = r1.mo94671c()     // Catch:{ all -> 0x001f }
                dg1.a r2 = dg1.C40664a.f96301l     // Catch:{ all -> 0x001f }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                dg1.C40664a.f96301l = r1     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 != 0) goto L_0x001b
                goto L_0x0000
            L_0x001b:
                r1.mo94670z()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: dg1.C40664a.C40666b.run():void");
        }
    }

    /* renamed from: dg1.a$c */
    public static final class C40667c implements C40705x {

        /* renamed from: d */
        final /* synthetic */ C40664a f96305d;

        /* renamed from: e */
        final /* synthetic */ C40705x f96306e;

        C40667c(C40664a aVar, C40705x xVar) {
            this.f96305d = aVar;
            this.f96306e = xVar;
        }

        /* renamed from: a */
        public C40664a mo94673C() {
            return this.f96305d;
        }

        public void close() {
            C40664a aVar = this.f96305d;
            C40705x xVar = this.f96306e;
            aVar.mo94665t();
            try {
                xVar.close();
                C41238w wVar = C41238w.f97225a;
                if (aVar.mo94666u()) {
                    throw aVar.mo94664n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo94666u()) {
                    e = aVar.mo94664n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo94666u();
            }
        }

        public void flush() {
            C40664a aVar = this.f96305d;
            C40705x xVar = this.f96306e;
            aVar.mo94665t();
            try {
                xVar.flush();
                C41238w wVar = C41238w.f97225a;
                if (aVar.mo94666u()) {
                    throw aVar.mo94664n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo94666u()) {
                    e = aVar.mo94664n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo94666u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f96306e + ')';
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "source");
            C40683e0.m117729b(bVar.mo94709M0(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C40701u uVar = bVar.f96314d;
                    C41536l.m120486f(uVar);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (uVar.f96373c - uVar.f96372b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            uVar = uVar.f96376f;
                            C41536l.m120486f(uVar);
                        }
                    }
                    C40664a aVar = this.f96305d;
                    C40705x xVar = this.f96306e;
                    aVar.mo94665t();
                    try {
                        xVar.mo21301x1(bVar, j2);
                        C41238w wVar = C41238w.f97225a;
                        if (!aVar.mo94666u()) {
                            j -= j2;
                        } else {
                            throw aVar.mo94664n((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (aVar.mo94666u()) {
                            e = aVar.mo94664n(e);
                        }
                        throw e;
                    } finally {
                        boolean u = aVar.mo94666u();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: dg1.a$d */
    public static final class C40668d implements C40707z {

        /* renamed from: d */
        final /* synthetic */ C40664a f96307d;

        /* renamed from: e */
        final /* synthetic */ C40707z f96308e;

        C40668d(C40664a aVar, C40707z zVar) {
            this.f96307d = aVar;
            this.f96308e = zVar;
        }

        /* renamed from: a */
        public C40664a mo94678C() {
            return this.f96307d;
        }

        public void close() {
            C40664a aVar = this.f96307d;
            C40707z zVar = this.f96308e;
            aVar.mo94665t();
            try {
                zVar.close();
                C41238w wVar = C41238w.f97225a;
                if (aVar.mo94666u()) {
                    throw aVar.mo94664n((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (aVar.mo94666u()) {
                    e = aVar.mo94664n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo94666u();
            }
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "sink");
            C40664a aVar = this.f96307d;
            C40707z zVar = this.f96308e;
            aVar.mo94665t();
            try {
                long g = zVar.mo21305g(bVar, j);
                if (!aVar.mo94666u()) {
                    return g;
                }
                throw aVar.mo94664n((IOException) null);
            } catch (IOException e) {
                e = e;
                if (aVar.mo94666u()) {
                    e = aVar.mo94664n(e);
                }
                throw e;
            } finally {
                boolean u = aVar.mo94666u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f96308e + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f96299j = millis;
        f96300k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final long m117546w(long j) {
        return this.f96304h - j;
    }

    /* renamed from: n */
    public final IOException mo94664n(IOException iOException) {
        return mo94667v(iOException);
    }

    /* renamed from: t */
    public final void mo94665t() {
        long h = mo94689h();
        boolean e = mo94686e();
        if (h != 0 || e) {
            f96298i.m117557e(this, h, e);
        }
    }

    /* renamed from: u */
    public final boolean mo94666u() {
        return f96298i.m117556d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public IOException mo94667v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: x */
    public final C40705x mo94668x(C40705x xVar) {
        C41536l.m120489i(xVar, "sink");
        return new C40667c(this, xVar);
    }

    /* renamed from: y */
    public final C40707z mo94669y(C40707z zVar) {
        C41536l.m120489i(zVar, "source");
        return new C40668d(this, zVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo94670z() {
    }
}
