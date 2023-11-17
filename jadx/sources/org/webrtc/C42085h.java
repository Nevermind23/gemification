package org.webrtc;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.C42076d;
import org.webrtc.C42107q;
import xh1.C43302e;
import xh1.C43303e0;
import xh1.C43314h;
import xh1.C43315i;
import xh1.C43316j;
import xh1.C43318l;

/* renamed from: org.webrtc.h */
public abstract class C42085h implements VideoSink {

    /* renamed from: A */
    private long f98974A;

    /* renamed from: B */
    private final C43318l f98975B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Runnable f98976C;

    /* renamed from: D */
    private final C42088c f98977D;

    /* renamed from: d */
    protected final String f98978d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f98979e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f98980f;

    /* renamed from: g */
    private final ArrayList f98981g;

    /* renamed from: h */
    private final Object f98982h;

    /* renamed from: i */
    private long f98983i;

    /* renamed from: j */
    private long f98984j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C42076d f98985k;

    /* renamed from: l */
    private final C42114s f98986l;

    /* renamed from: m */
    private C42107q.C42109b f98987m;

    /* renamed from: n */
    private boolean f98988n;

    /* renamed from: o */
    private final Matrix f98989o;

    /* renamed from: p */
    private final Object f98990p;

    /* renamed from: q */
    private VideoFrame f98991q;

    /* renamed from: r */
    private final Object f98992r;

    /* renamed from: s */
    private float f98993s;

    /* renamed from: t */
    private boolean f98994t;

    /* renamed from: u */
    private final Object f98995u;

    /* renamed from: v */
    private int f98996v;

    /* renamed from: w */
    private int f98997w;

    /* renamed from: x */
    private int f98998x;

    /* renamed from: y */
    private long f98999y;

    /* renamed from: z */
    private long f99000z;

    /* renamed from: org.webrtc.h$a */
    class C42086a implements Runnable {
        C42086a() {
        }

        public void run() {
            C42085h.this.m122264B();
            synchronized (C42085h.this.f98979e) {
                if (C42085h.this.f98980f != null) {
                    C42085h.this.f98980f.removeCallbacks(C42085h.this.f98976C);
                    C42085h.this.f98980f.postDelayed(C42085h.this.f98976C, TimeUnit.SECONDS.toMillis(4));
                }
            }
        }
    }

    /* renamed from: org.webrtc.h$b */
    class C42087b implements Runnable {
        C42087b() {
        }

        public void run() {
            synchronized (C42085h.this.f98979e) {
                Handler unused = C42085h.this.f98980f = null;
            }
        }
    }

    /* renamed from: org.webrtc.h$c */
    private class C42088c implements Runnable {

        /* renamed from: d */
        private Object f99003d;

        private C42088c() {
        }

        /* renamed from: a */
        public synchronized void mo97609a(Object obj) {
            this.f99003d = obj;
        }

        public synchronized void run() {
            if (!(this.f99003d == null || C42085h.this.f98985k == null || C42085h.this.f98985k.mo97540e())) {
                Object obj = this.f99003d;
                if (obj instanceof Surface) {
                    C42085h.this.f98985k.mo97537b((Surface) this.f99003d);
                } else if (obj instanceof SurfaceTexture) {
                    C42085h.this.f98985k.mo97541f((SurfaceTexture) this.f99003d);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.f99003d);
                }
                C42085h.this.f98985k.mo97542g();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        /* synthetic */ C42088c(C42085h hVar, C42086a aVar) {
            this();
        }
    }

    /* renamed from: org.webrtc.h$d */
    public interface C42089d {
    }

    /* renamed from: org.webrtc.h$e */
    private static class C42090e {

        /* renamed from: a */
        public final C42089d f99005a;

        /* renamed from: b */
        public final float f99006b;

        /* renamed from: c */
        public final C42107q.C42109b f99007c;

        /* renamed from: d */
        public final boolean f99008d;

        public C42090e(C42089d dVar, float f, C42107q.C42109b bVar, boolean z) {
            this.f99005a = dVar;
            this.f99006b = f;
            this.f99007c = bVar;
            this.f99008d = z;
        }
    }

    /* renamed from: org.webrtc.h$f */
    private static class C42091f extends Handler {

        /* renamed from: a */
        private final Runnable f99009a;

        public C42091f(Looper looper, Runnable runnable) {
            super(looper);
            this.f99009a = runnable;
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.m122185d("EglRenderer", "Exception on EglRenderer thread", e);
                this.f99009a.run();
                throw e;
            }
        }
    }

    public C42085h(String str) {
        this(str, new C42114s());
    }

    /* renamed from: A */
    private void m122263A(String str) {
        Logging.m122183b("EglRenderer", this.f98978d + str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m122264B() {
        /*
            r11 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "#.0"
            r0.<init>(r1)
            long r1 = java.lang.System.nanoTime()
            java.lang.Object r3 = r11.f98995u
            monitor-enter(r3)
            long r4 = r11.f98999y     // Catch:{ all -> 0x00a9 }
            long r4 = r1 - r4
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a7
            long r6 = r11.f98984j     // Catch:{ all -> 0x00a9 }
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0029
            int r6 = r11.f98996v     // Catch:{ all -> 0x00a9 }
            if (r6 != 0) goto L_0x0029
            goto L_0x00a7
        L_0x0029:
            int r6 = r11.f98998x     // Catch:{ all -> 0x00a9 }
            long r6 = (long) r6     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a9 }
            r9 = 1
            long r8 = r8.toNanos(r9)     // Catch:{ all -> 0x00a9 }
            long r6 = r6 * r8
            float r6 = (float) r6     // Catch:{ all -> 0x00a9 }
            float r7 = (float) r4     // Catch:{ all -> 0x00a9 }
            float r6 = r6 / r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "Duration: "
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00a9 }
            long r4 = r8.toMillis(r4)     // Catch:{ all -> 0x00a9 }
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = " ms. Frames received: "
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            int r4 = r11.f98996v     // Catch:{ all -> 0x00a9 }
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = ". Dropped: "
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            int r4 = r11.f98997w     // Catch:{ all -> 0x00a9 }
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = ". Rendered: "
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            int r4 = r11.f98998x     // Catch:{ all -> 0x00a9 }
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = ". Render fps: "
            r7.append(r4)     // Catch:{ all -> 0x00a9 }
            double r4 = (double) r6     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r0.format(r4)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = ". Average render time: "
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            long r4 = r11.f99000z     // Catch:{ all -> 0x00a9 }
            int r0 = r11.f98998x     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r11.m122279o(r4, r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = ". Average swapBuffer time: "
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            long r4 = r11.f98974A     // Catch:{ all -> 0x00a9 }
            int r0 = r11.f98998x     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r11.m122279o(r4, r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "."
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r11.m122263A(r0)     // Catch:{ all -> 0x00a9 }
            r11.m122266G(r1)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a7:
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.C42085h.m122264B():void");
    }

    /* renamed from: C */
    private void m122265C(Runnable runnable) {
        synchronized (this.f98979e) {
            Handler handler = this.f98980f;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: G */
    private void m122266G(long j) {
        synchronized (this.f98995u) {
            this.f98999y = j;
            this.f98996v = 0;
            this.f98997w = 0;
            this.f98998x = 0;
            this.f99000z = 0;
            this.f98974A = 0;
        }
    }

    /* renamed from: o */
    private String m122279o(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j / ((long) i)) + " us";
    }

    /* renamed from: q */
    private void m122280q(Object obj) {
        this.f98977D.mo97609a(obj);
        m122265C(this.f98977D);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m122281u(C42107q.C42109b bVar, C42089d dVar, float f, boolean z) {
        if (bVar == null) {
            bVar = this.f98987m;
        }
        this.f98981g.add(new C42090e(dVar, f, bVar, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m122282v(C42076d.C42078b bVar, int[] iArr) {
        if (bVar == null) {
            m122263A("EglBase10.create context");
            this.f98985k = C42075c.m122230e(iArr);
            return;
        }
        m122263A("EglBase.create shared context");
        this.f98985k = C42075c.m122228c(bVar, iArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m122283w(CountDownLatch countDownLatch) {
        synchronized (C42076d.f98959a) {
            GLES20.glUseProgram(0);
        }
        C42107q.C42109b bVar = this.f98987m;
        if (bVar != null) {
            bVar.mo97612a();
            this.f98987m = null;
        }
        this.f98986l.mo97622a();
        this.f98975B.mo102010a();
        if (this.f98985k != null) {
            m122263A("eglBase detach and release.");
            this.f98985k.mo97539d();
            this.f98985k.mo97536a();
            this.f98985k = null;
        }
        this.f98981g.clear();
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m122284x(Looper looper) {
        m122263A("Quitting render thread.");
        looper.quit();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m122285y(Runnable runnable) {
        C42076d dVar = this.f98985k;
        if (dVar != null) {
            dVar.mo97539d();
            this.f98985k.mo97543h();
        }
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m122286z(CountDownLatch countDownLatch, C42089d dVar) {
        countDownLatch.countDown();
        Iterator it = this.f98981g.iterator();
        while (it.hasNext()) {
            if (((C42090e) it.next()).f99005a == dVar) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        xh1.C43303e0.m124332a(r0);
        r0 = r5.f98990p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r5.f98991q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r1.mo97585a();
        r5.f98991q = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        m122263A("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97595D() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.m122263A(r0)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r1 = r5.f98979e
            monitor-enter(r1)
            android.os.Handler r2 = r5.f98980f     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0019
            java.lang.String r0 = "Already released"
            r5.m122263A(r0)     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0019:
            java.lang.Runnable r3 = r5.f98976C     // Catch:{ all -> 0x0055 }
            r2.removeCallbacks(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.f98980f     // Catch:{ all -> 0x0055 }
            xh1.f r3 = new xh1.f     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0055 }
            r2.postAtFrontOfQueue(r3)     // Catch:{ all -> 0x0055 }
            android.os.Handler r2 = r5.f98980f     // Catch:{ all -> 0x0055 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ all -> 0x0055 }
            android.os.Handler r3 = r5.f98980f     // Catch:{ all -> 0x0055 }
            xh1.g r4 = new xh1.g     // Catch:{ all -> 0x0055 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0055 }
            r3.post(r4)     // Catch:{ all -> 0x0055 }
            r2 = 0
            r5.f98980f = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            xh1.C43303e0.m124332a(r0)
            java.lang.Object r0 = r5.f98990p
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r5.f98991q     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004b
            r1.mo97585a()     // Catch:{ all -> 0x0052 }
            r5.f98991q = r2     // Catch:{ all -> 0x0052 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Releasing done."
            r5.m122263A(r0)
            return
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.C42085h.mo97595D():void");
    }

    /* renamed from: E */
    public void mo97596E(Runnable runnable) {
        this.f98977D.mo97609a((Object) null);
        synchronized (this.f98979e) {
            Handler handler = this.f98980f;
            if (handler != null) {
                handler.removeCallbacks(this.f98977D);
                this.f98980f.postAtFrontOfQueue(new C43314h(this, runnable));
                return;
            }
            runnable.run();
        }
    }

    /* renamed from: F */
    public void mo97597F(C42089d dVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.f98979e) {
            if (this.f98980f != null) {
                if (Thread.currentThread() != this.f98980f.getLooper().getThread()) {
                    m122265C(new C43302e(this, countDownLatch, dVar));
                    C43303e0.m124332a(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    /* renamed from: H */
    public void mo97598H(float f) {
        m122263A("setFpsReduction: " + f);
        synchronized (this.f98982h) {
            long j = this.f98984j;
            if (f <= Utils.FLOAT_EPSILON) {
                this.f98984j = Long.MAX_VALUE;
            } else {
                this.f98984j = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            if (this.f98984j != j) {
                this.f98983i = System.nanoTime();
            }
        }
    }

    /* renamed from: I */
    public void mo97599I(float f) {
        m122263A("setLayoutAspectRatio: " + f);
        synchronized (this.f98992r) {
            this.f98993s = f;
        }
    }

    /* renamed from: J */
    public void mo97600J(boolean z) {
        m122263A("setMirrorHorizontally: " + z);
        synchronized (this.f98992r) {
            this.f98994t = z;
        }
    }

    /* renamed from: m */
    public void mo97601m(C42089d dVar, float f) {
        mo97602n(dVar, f, (C42107q.C42109b) null, false);
    }

    /* renamed from: n */
    public void mo97602n(C42089d dVar, float f, C42107q.C42109b bVar, boolean z) {
        m122265C(new C43316j(this, bVar, dVar, f, z));
    }

    /* renamed from: p */
    public void mo97603p(Surface surface) {
        m122280q(surface);
    }

    /* renamed from: r */
    public void mo97604r() {
        mo97598H(Float.POSITIVE_INFINITY);
    }

    /* renamed from: s */
    public void mo97605s(C42076d.C42078b bVar, int[] iArr, C42107q.C42109b bVar2) {
        mo97606t(bVar, iArr, bVar2, false);
    }

    /* renamed from: t */
    public void mo97606t(C42076d.C42078b bVar, int[] iArr, C42107q.C42109b bVar2, boolean z) {
        synchronized (this.f98979e) {
            if (this.f98980f == null) {
                m122263A("Initializing EglRenderer");
                this.f98987m = bVar2;
                this.f98988n = z;
                HandlerThread handlerThread = new HandlerThread(this.f98978d + "EglRenderer");
                handlerThread.start();
                C42091f fVar = new C42091f(handlerThread.getLooper(), new C42087b());
                this.f98980f = fVar;
                C43303e0.m124337f(fVar, new C43315i(this, bVar, iArr));
                this.f98980f.post(this.f98977D);
                m122266G(System.nanoTime());
                this.f98980f.postDelayed(this.f98976C, TimeUnit.SECONDS.toMillis(4));
            } else {
                throw new IllegalStateException(this.f98978d + "Already initialized");
            }
        }
    }

    public C42085h(String str, C42114s sVar) {
        this.f98979e = new Object();
        this.f98981g = new ArrayList();
        this.f98982h = new Object();
        this.f98989o = new Matrix();
        this.f98990p = new Object();
        this.f98992r = new Object();
        this.f98995u = new Object();
        this.f98975B = new C43318l(6408);
        this.f98976C = new C42086a();
        this.f98977D = new C42088c(this, (C42086a) null);
        this.f98978d = str;
        this.f98986l = sVar;
    }
}
