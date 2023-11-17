package p035c4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p050d4.C5824h;
import p050d4.C5825i;
import p063e4.C6032d;
import p089g4.C6224l;
import p166m3.C7079a;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: c4.f */
public class C2253f implements C2249c, C2255g {

    /* renamed from: n */
    private static final C2254a f7018n = new C2254a();

    /* renamed from: d */
    private final int f7019d;

    /* renamed from: e */
    private final int f7020e;

    /* renamed from: f */
    private final boolean f7021f;

    /* renamed from: g */
    private final C2254a f7022g;

    /* renamed from: h */
    private Object f7023h;

    /* renamed from: i */
    private C2250d f7024i;

    /* renamed from: j */
    private boolean f7025j;

    /* renamed from: k */
    private boolean f7026k;

    /* renamed from: l */
    private boolean f7027l;

    /* renamed from: m */
    private GlideException f7028m;

    /* renamed from: c4.f$a */
    static class C2254a {
        C2254a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7294a(Object obj) {
            obj.notifyAll();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7295b(Object obj, long j) {
            obj.wait(j);
        }
    }

    public C2253f(int i, int i2) {
        this(i, i2, true, f7018n);
    }

    /* renamed from: e */
    private synchronized Object m8660e(Long l) {
        if (this.f7021f && !isDone()) {
            C6224l.m24732a();
        }
        if (this.f7025j) {
            throw new CancellationException();
        } else if (this.f7027l) {
            throw new ExecutionException(this.f7028m);
        } else if (this.f7026k) {
            return this.f7023h;
        } else {
            if (l == null) {
                this.f7022g.mo7295b(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f7022g.mo7295b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f7027l) {
                throw new ExecutionException(this.f7028m);
            } else if (this.f7025j) {
                throw new CancellationException();
            } else if (this.f7026k) {
                return this.f7023h;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: a */
    public void mo7275a(C5824h hVar) {
        hVar.mo7299e(this.f7019d, this.f7020e);
    }

    /* renamed from: b */
    public synchronized void mo7276b(Object obj, C6032d dVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r3 = 0
            return r3
        L_0x000a:
            r0 = 1
            r2.f7025j = r0     // Catch:{ all -> 0x0021 }
            c4.f$a r1 = r2.f7022g     // Catch:{ all -> 0x0021 }
            r1.mo7294a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            c4.d r3 = r2.f7024i     // Catch:{ all -> 0x0021 }
            r2.f7024i = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035c4.C2253f.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public void mo7278d(C5824h hVar) {
    }

    /* renamed from: f */
    public void mo7279f() {
    }

    /* renamed from: g */
    public void mo7280g(Drawable drawable) {
    }

    public Object get() {
        try {
            return m8660e((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public synchronized C2250d mo7283h() {
        return this.f7024i;
    }

    /* renamed from: i */
    public void mo7284i(Drawable drawable) {
    }

    public synchronized boolean isCancelled() {
        return this.f7025j;
    }

    public synchronized boolean isDone() {
        boolean z;
        if (this.f7025j || this.f7026k || this.f7027l) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public synchronized void mo7287j(C2250d dVar) {
        this.f7024i = dVar;
    }

    /* renamed from: k */
    public synchronized void mo7288k(Drawable drawable) {
    }

    /* renamed from: o */
    public void mo7289o() {
    }

    public void onDestroy() {
    }

    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
        this.f7027l = true;
        this.f7028m = glideException;
        this.f7022g.mo7294a(this);
        return false;
    }

    public synchronized boolean onResourceReady(Object obj, Object obj2, C5825i iVar, C7079a aVar, boolean z) {
        this.f7026k = true;
        this.f7023h = obj;
        this.f7022g.mo7294a(this);
        return false;
    }

    public String toString() {
        C2250d dVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            dVar = null;
            if (this.f7025j) {
                str = "CANCELLED";
            } else if (this.f7027l) {
                str = "FAILURE";
            } else if (this.f7026k) {
                str = "SUCCESS";
            } else {
                str = ProductType.PRODUCT_STATUS_PENDING;
                dVar = this.f7024i;
            }
        }
        if (dVar != null) {
            return str2 + str + ", request=[" + dVar + "]]";
        }
        return str2 + str + "]";
    }

    C2253f(int i, int i2, boolean z, C2254a aVar) {
        this.f7019d = i;
        this.f7020e = i2;
        this.f7021f = z;
        this.f7022g = aVar;
    }

    public Object get(long j, TimeUnit timeUnit) {
        return m8660e(Long.valueOf(timeUnit.toMillis(j)));
    }
}
