package p146k9;

import android.database.SQLException;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p027b9.C2184f;
import p068e9.C6052b0;
import p068e9.C6099p;
import p068e9.C6107s0;
import p142k5.C6812c;
import p142k5.C6813d;
import p142k5.C6815f;
import p159l9.C7018d;
import p168m5.C7123l;
import p337z7.C9227g;

/* renamed from: k9.e */
final class C6840e {

    /* renamed from: a */
    private final double f20486a;

    /* renamed from: b */
    private final double f20487b;

    /* renamed from: c */
    private final long f20488c;

    /* renamed from: d */
    private final long f20489d;

    /* renamed from: e */
    private final int f20490e;

    /* renamed from: f */
    private final BlockingQueue f20491f;

    /* renamed from: g */
    private final ThreadPoolExecutor f20492g;

    /* renamed from: h */
    private final C6815f f20493h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C6052b0 f20494i;

    /* renamed from: j */
    private int f20495j;

    /* renamed from: k */
    private long f20496k;

    /* renamed from: k9.e$b */
    private final class C6842b implements Runnable {

        /* renamed from: d */
        private final C6099p f20497d;

        /* renamed from: e */
        private final C9227g f20498e;

        public void run() {
            C6840e.this.m26586p(this.f20497d, this.f20498e);
            C6840e.this.f20494i.mo19543c();
            double e = C6840e.this.m26579g();
            C2184f f = C2184f.m8346f();
            f.mo7089b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e / 1000.0d)}) + " s for report: " + this.f20497d.mo19537d());
            C6840e.m26587q(e);
        }

        private C6842b(C6099p pVar, C9227g gVar) {
            this.f20497d = pVar;
            this.f20498e = gVar;
        }
    }

    C6840e(C6815f fVar, C7018d dVar, C6052b0 b0Var) {
        this(dVar.f20905f, dVar.f20906g, ((long) dVar.f20907h) * 1000, fVar, b0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public double m26579g() {
        return Math.min(3600000.0d, (60000.0d / this.f20486a) * Math.pow(this.f20487b, (double) m26580h()));
    }

    /* renamed from: h */
    private int m26580h() {
        int i;
        if (this.f20496k == 0) {
            this.f20496k = m26585o();
        }
        int o = (int) ((m26585o() - this.f20496k) / this.f20488c);
        if (m26582l()) {
            i = Math.min(100, this.f20495j + o);
        } else {
            i = Math.max(0, this.f20495j - o);
        }
        if (this.f20495j != i) {
            this.f20495j = i;
            this.f20496k = m26585o();
        }
        return i;
    }

    /* renamed from: k */
    private boolean m26581k() {
        return this.f20491f.size() < this.f20490e;
    }

    /* renamed from: l */
    private boolean m26582l() {
        return this.f20491f.size() == this.f20490e;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m26583m(CountDownLatch countDownLatch) {
        try {
            C7123l.m27469a(this.f20493h, C6813d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m26584n(C9227g gVar, boolean z, C6099p pVar, Exception exc) {
        if (exc != null) {
            gVar.mo24886d(exc);
            return;
        }
        if (z) {
            mo20895j();
        }
        gVar.mo24887e(pVar);
    }

    /* renamed from: o */
    private long m26585o() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m26586p(C6099p pVar, C9227g gVar) {
        boolean z;
        C2184f f = C2184f.m8346f();
        f.mo7089b("Sending report through Google DataTransport: " + pVar.mo19537d());
        if (SystemClock.elapsedRealtime() - this.f20489d < 2000) {
            z = true;
        } else {
            z = false;
        }
        this.f20493h.mo20887a(C6812c.m26543e(pVar.mo19535b()), new C6838c(this, gVar, z, pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m26587q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9227g mo20894i(C6099p pVar, boolean z) {
        synchronized (this.f20491f) {
            C9227g gVar = new C9227g();
            if (z) {
                this.f20494i.mo19542b();
                if (m26581k()) {
                    C2184f f = C2184f.m8346f();
                    f.mo7089b("Enqueueing report: " + pVar.mo19537d());
                    C2184f f2 = C2184f.m8346f();
                    f2.mo7089b("Queue size: " + this.f20491f.size());
                    this.f20492g.execute(new C6842b(pVar, gVar));
                    C2184f f3 = C2184f.m8346f();
                    f3.mo7089b("Closing task for report: " + pVar.mo19537d());
                    gVar.mo24887e(pVar);
                    return gVar;
                }
                m26580h();
                C2184f f4 = C2184f.m8346f();
                f4.mo7089b("Dropping report due to queue being full: " + pVar.mo19537d());
                this.f20494i.mo19541a();
                gVar.mo24887e(pVar);
                return gVar;
            }
            m26586p(pVar, gVar);
            return gVar;
        }
    }

    /* renamed from: j */
    public void mo20895j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new C6839d(this, countDownLatch)).start();
        C6107s0.m24420g(countDownLatch, 2, TimeUnit.SECONDS);
    }

    C6840e(double d, double d2, long j, C6815f fVar, C6052b0 b0Var) {
        this.f20486a = d;
        this.f20487b = d2;
        this.f20488c = j;
        this.f20493h = fVar;
        this.f20494i = b0Var;
        this.f20489d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f20490e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f20491f = arrayBlockingQueue;
        this.f20492g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f20495j = 0;
        this.f20496k = 0;
    }
}
