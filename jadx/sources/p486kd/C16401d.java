package p486kd;

import android.content.Context;
import android.graphics.PointF;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.otaliastudios.cameraview.C11278a;
import com.otaliastudios.cameraview.C11280b;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.video.C11291d;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p337z7.C9219c;
import p337z7.C9223e;
import p337z7.C9225f;
import p337z7.C9231i;
import p337z7.Task;
import p346ae.C9809d;
import p360be.C10241a;
import p374ce.C10396b;
import p374ce.C10397c;
import p458id.C15600b;
import p458id.C15603c;
import p472jd.C15744a;
import p472jd.C15745b;
import p472jd.C15749f;
import p472jd.C15750g;
import p472jd.C15752i;
import p472jd.C15753j;
import p472jd.C15754k;
import p472jd.C15756m;
import p472jd.C15757n;
import p570qd.C17486a;
import p570qd.C17489c;
import p598sd.C17749a;
import p598sd.C17757b;
import p598sd.C17758c;
import p625ud.C18110b;
import p638vd.C18298a;
import p651wd.C18516k;
import p679yd.C18879b;
import p693zd.C19009a;

/* renamed from: kd.d */
public abstract class C16401d implements C10241a.C10244c, C9809d.C9810a, C11291d.C11292a {

    /* renamed from: h */
    protected static final C15600b f46370h = C15600b.m56349a(C16401d.class.getSimpleName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C18516k f46371d;

    /* renamed from: e */
    Handler f46372e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16413l f46373f;

    /* renamed from: g */
    private final C17758c f46374g = new C17758c(new C16404c());

    /* renamed from: kd.d$a */
    class C16402a implements Callable {
        C16402a() {
        }

        /* renamed from: a */
        public Task call() {
            return C16401d.this.mo43350o0();
        }
    }

    /* renamed from: kd.d$b */
    class C16403b implements Callable {
        C16403b() {
        }

        /* renamed from: a */
        public Task call() {
            return C16401d.this.mo43356r0();
        }
    }

    /* renamed from: kd.d$c */
    class C16404c implements C17749a.C17755e {
        C16404c() {
        }

        /* renamed from: a */
        public C18516k mo43521a(String str) {
            return C16401d.this.f46371d;
        }

        /* renamed from: b */
        public void mo43522b(String str, Exception exc) {
            C16401d.this.m58399k0(exc, false);
        }
    }

    /* renamed from: kd.d$d */
    class C16405d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ Throwable f46378d;

        C16405d(Throwable th) {
            this.f46378d = th;
        }

        public void run() {
            Throwable th = this.f46378d;
            if (th instanceof CameraException) {
                CameraException cameraException = (CameraException) th;
                if (cameraException.mo29315b()) {
                    C16401d.f46370h.mo42877b("EXCEPTION:", "Got CameraException. Since it is unrecoverable, executing destroy(false).");
                    C16401d.this.mo43514u(false);
                }
                C16401d.f46370h.mo42877b("EXCEPTION:", "Got CameraException. Dispatching to callback.");
                C16401d.this.f46373f.mo29448m(cameraException);
                return;
            }
            C15600b bVar = C16401d.f46370h;
            bVar.mo42877b("EXCEPTION:", "Unexpected error! Executing destroy(true).");
            C16401d.this.mo43514u(true);
            bVar.mo42877b("EXCEPTION:", "Unexpected error! Throwing.");
            Throwable th2 = this.f46378d;
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw new RuntimeException(this.f46378d);
        }
    }

    /* renamed from: kd.d$e */
    class C16406e implements C9219c {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f46380a;

        C16406e(CountDownLatch countDownLatch) {
            this.f46380a = countDownLatch;
        }

        public void onComplete(Task task) {
            this.f46380a.countDown();
        }
    }

    /* renamed from: kd.d$f */
    class C16407f implements C9225f {
        C16407f() {
        }

        /* renamed from: b */
        public Task mo17657a(C15603c cVar) {
            if (cVar != null) {
                C16401d.this.f46373f.mo29436c(cVar);
                return C9231i.m34113g((Object) null);
            }
            throw new RuntimeException("Null options!");
        }
    }

    /* renamed from: kd.d$g */
    class C16408g implements Callable {
        C16408g() {
        }

        /* renamed from: a */
        public Task call() {
            C16401d dVar = C16401d.this;
            if (dVar.mo43357t(dVar.mo43430E())) {
                return C16401d.this.mo43349n0();
            }
            C16401d.f46370h.mo42877b("onStartEngine:", "No camera available for facing", C16401d.this.mo43430E());
            throw new CameraException(6);
        }
    }

    /* renamed from: kd.d$h */
    class C16409h implements C9223e {
        C16409h() {
        }

        /* renamed from: b */
        public void mo17635a(Void voidR) {
            C16401d.this.f46373f.mo29438e();
        }
    }

    /* renamed from: kd.d$i */
    class C16410i implements Callable {
        C16410i() {
        }

        /* renamed from: a */
        public Task call() {
            return C16401d.this.mo43355q0();
        }
    }

    /* renamed from: kd.d$j */
    class C16411j implements Callable {
        C16411j() {
        }

        /* renamed from: a */
        public Task call() {
            if (C16401d.this.mo43460T() == null || !C16401d.this.mo43460T().mo26811n()) {
                return C9231i.m34111e();
            }
            return C16401d.this.mo43348m0();
        }
    }

    /* renamed from: kd.d$k */
    class C16412k implements Callable {
        C16412k() {
        }

        /* renamed from: a */
        public Task call() {
            return C16401d.this.mo43353p0();
        }
    }

    /* renamed from: kd.d$l */
    public interface C16413l {
        /* renamed from: a */
        void mo29434a(C11280b.C11281a aVar);

        /* renamed from: b */
        Context mo29435b();

        /* renamed from: c */
        void mo29436c(C15603c cVar);

        /* renamed from: d */
        void mo29437d();

        /* renamed from: e */
        void mo29438e();

        /* renamed from: f */
        void mo29439f(C18298a aVar, PointF pointF);

        /* renamed from: g */
        void mo29440g();

        /* renamed from: h */
        void mo29443h(C11278a.C11279a aVar);

        /* renamed from: i */
        void mo29444i(boolean z);

        /* renamed from: j */
        void mo29445j(C18110b bVar);

        /* renamed from: k */
        void mo29446k(C18298a aVar, boolean z, PointF pointF);

        /* renamed from: l */
        void mo29447l(float f, float[] fArr, PointF[] pointFArr);

        /* renamed from: m */
        void mo29448m(CameraException cameraException);

        /* renamed from: o */
        void mo29450o();

        /* renamed from: q */
        void mo29452q(float f, PointF[] pointFArr);
    }

    /* renamed from: kd.d$m */
    private class C16414m implements Thread.UncaughtExceptionHandler {
        private C16414m() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C16401d.this.m58399k0(th, true);
        }

        /* synthetic */ C16414m(C16401d dVar, C16404c cVar) {
            this();
        }
    }

    /* renamed from: kd.d$n */
    private static class C16415n implements Thread.UncaughtExceptionHandler {
        private C16415n() {
        }

        /* synthetic */ C16415n(C16404c cVar) {
            this();
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C16401d.f46370h.mo42880h("EXCEPTION:", "In the NoOpExceptionHandler, probably while destroying.", "Thread:", thread, "Error:", th);
        }
    }

    protected C16401d(C16413l lVar) {
        this.f46373f = lVar;
        this.f46372e = new Handler(Looper.getMainLooper());
        m58406s0(false);
    }

    /* renamed from: g1 */
    private Task m58396g1() {
        return this.f46374g.mo45345v(C17757b.ENGINE, C17757b.BIND, true, new C16411j());
    }

    /* renamed from: h1 */
    private Task m58397h1() {
        return this.f46374g.mo45345v(C17757b.OFF, C17757b.ENGINE, true, new C16408g()).mo24875t(new C16407f());
    }

    /* renamed from: i1 */
    private Task m58398i1() {
        return this.f46374g.mo45345v(C17757b.BIND, C17757b.PREVIEW, true, new C16402a());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m58399k0(Throwable th, boolean z) {
        if (z) {
            f46370h.mo42877b("EXCEPTION:", "Handler thread is gone. Replacing.");
            m58406s0(false);
        }
        f46370h.mo42877b("EXCEPTION:", "Scheduling on the crash handler...");
        this.f46372e.post(new C16405d(th));
    }

    /* renamed from: k1 */
    private Task m58400k1(boolean z) {
        return this.f46374g.mo45345v(C17757b.BIND, C17757b.ENGINE, !z, new C16412k());
    }

    /* renamed from: l1 */
    private Task m58401l1(boolean z) {
        return this.f46374g.mo45345v(C17757b.ENGINE, C17757b.OFF, !z, new C16410i()).mo24864i(new C16409h());
    }

    /* renamed from: m1 */
    private Task m58402m1(boolean z) {
        return this.f46374g.mo45345v(C17757b.PREVIEW, C17757b.BIND, !z, new C16403b());
    }

    /* renamed from: s0 */
    private void m58406s0(boolean z) {
        C18516k kVar = this.f46371d;
        if (kVar != null) {
            kVar.mo46318a();
        }
        C18516k d = C18516k.m63025d("CameraViewEngine");
        this.f46371d = d;
        d.mo46321g().setUncaughtExceptionHandler(new C16414m(this, (C16404c) null));
        if (z) {
            this.f46374g.mo45331h();
        }
    }

    /* renamed from: v */
    private void m58407v(boolean z, int i) {
        C15600b bVar = f46370h;
        bVar.mo42878c("DESTROY:", "state:", mo43508Z(), "thread:", Thread.currentThread(), "depth:", Integer.valueOf(i), "unrecoverably:", Boolean.valueOf(z));
        if (z) {
            this.f46371d.mo46321g().setUncaughtExceptionHandler(new C16415n((C16404c) null));
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo43511j1(true).mo24857b(this.f46371d.mo46319e(), new C16406e(countDownLatch));
        try {
            if (!countDownLatch.await(6, TimeUnit.SECONDS)) {
                bVar.mo42877b("DESTROY: Could not destroy synchronously after 6 seconds.", "Current thread:", Thread.currentThread(), "Handler thread:", this.f46371d.mo46321g());
                int i2 = i + 1;
                if (i2 < 2) {
                    m58406s0(true);
                    bVar.mo42877b("DESTROY: Trying again on thread:", this.f46371d.mo46321g());
                    m58407v(z, i2);
                    return;
                }
                bVar.mo42880h("DESTROY: Giving up because DESTROY_RETRIES was reached.");
            }
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: A */
    public abstract long mo43423A();

    /* renamed from: A0 */
    public abstract void mo43327A0(float f, float[] fArr, PointF[] pointFArr, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C16413l mo43506B() {
        return this.f46373f;
    }

    /* renamed from: B0 */
    public abstract void mo43424B0(C15749f fVar);

    /* renamed from: C */
    public abstract C15603c mo43426C();

    /* renamed from: C0 */
    public abstract void mo43328C0(C15750g gVar);

    /* renamed from: D */
    public abstract float mo43428D();

    /* renamed from: D0 */
    public abstract void mo43329D0(int i);

    /* renamed from: E */
    public abstract C15749f mo43430E();

    /* renamed from: E0 */
    public abstract void mo43431E0(int i);

    /* renamed from: F */
    public abstract C15750g mo43433F();

    /* renamed from: F0 */
    public abstract void mo43434F0(int i);

    /* renamed from: G */
    public abstract int mo43436G();

    /* renamed from: G0 */
    public abstract void mo43437G0(int i);

    /* renamed from: H */
    public abstract int mo43438H();

    /* renamed from: H0 */
    public abstract void mo43331H0(boolean z);

    /* renamed from: I */
    public abstract int mo43440I();

    /* renamed from: I0 */
    public abstract void mo43332I0(C15752i iVar);

    /* renamed from: J */
    public abstract int mo43441J();

    /* renamed from: J0 */
    public abstract void mo43334J0(Location location);

    /* renamed from: K */
    public abstract C15752i mo43442K();

    /* renamed from: K0 */
    public abstract void mo43443K0(C15753j jVar);

    /* renamed from: L */
    public abstract Location mo43445L();

    /* renamed from: L0 */
    public abstract void mo43446L0(C19009a aVar);

    /* renamed from: M */
    public abstract C15753j mo43447M();

    /* renamed from: M0 */
    public abstract void mo43336M0(C15754k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final C17758c mo43507N() {
        return this.f46374g;
    }

    /* renamed from: N0 */
    public abstract void mo43449N0(boolean z);

    /* renamed from: O */
    public abstract C15754k mo43451O();

    /* renamed from: O0 */
    public abstract void mo43452O0(C10397c cVar);

    /* renamed from: P */
    public abstract boolean mo43453P();

    /* renamed from: P0 */
    public abstract void mo43454P0(boolean z);

    /* renamed from: Q */
    public abstract C10396b mo43456Q(C17489c cVar);

    /* renamed from: Q0 */
    public abstract void mo43338Q0(boolean z);

    /* renamed from: R */
    public abstract C10397c mo43457R();

    /* renamed from: R0 */
    public abstract void mo43458R0(C10241a aVar);

    /* renamed from: S */
    public abstract boolean mo43459S();

    /* renamed from: S0 */
    public abstract void mo43341S0(float f);

    /* renamed from: T */
    public abstract C10241a mo43460T();

    /* renamed from: T0 */
    public abstract void mo43461T0(boolean z);

    /* renamed from: U */
    public abstract float mo43462U();

    /* renamed from: U0 */
    public abstract void mo43463U0(C10397c cVar);

    /* renamed from: V */
    public abstract boolean mo43465V();

    /* renamed from: V0 */
    public abstract void mo43466V0(int i);

    /* renamed from: W */
    public abstract C10396b mo43467W(C17489c cVar);

    /* renamed from: W0 */
    public abstract void mo43468W0(int i);

    /* renamed from: X */
    public abstract int mo43469X();

    /* renamed from: X0 */
    public abstract void mo43470X0(int i);

    /* renamed from: Y */
    public abstract int mo43471Y();

    /* renamed from: Y0 */
    public abstract void mo43472Y0(C15756m mVar);

    /* renamed from: Z */
    public final C17757b mo43508Z() {
        return this.f46374g.mo45342s();
    }

    /* renamed from: Z0 */
    public abstract void mo43473Z0(int i);

    /* renamed from: a0 */
    public final C17757b mo43509a0() {
        return this.f46374g.mo45343t();
    }

    /* renamed from: a1 */
    public abstract void mo43474a1(long j);

    /* renamed from: b0 */
    public abstract C10396b mo43475b0(C17489c cVar);

    /* renamed from: b1 */
    public abstract void mo43476b1(C10397c cVar);

    /* renamed from: c0 */
    public abstract int mo43477c0();

    /* renamed from: c1 */
    public abstract void mo43345c1(C15757n nVar);

    /* renamed from: d0 */
    public abstract C15756m mo43478d0();

    /* renamed from: d1 */
    public abstract void mo43346d1(float f, PointF[] pointFArr, boolean z);

    /* renamed from: e0 */
    public abstract int mo43479e0();

    /* renamed from: e1 */
    public Task mo43510e1() {
        f46370h.mo42878c("START:", "scheduled. State:", mo43508Z());
        Task h1 = m58397h1();
        m58396g1();
        m58398i1();
        return h1;
    }

    /* renamed from: f */
    public final void mo26824f() {
        f46370h.mo42878c("onSurfaceAvailable:", "Size is", mo43460T().mo26809l());
        m58396g1();
        m58398i1();
    }

    /* renamed from: f0 */
    public abstract long mo43480f0();

    /* renamed from: f1 */
    public abstract void mo43347f1(C18298a aVar, C18879b bVar, PointF pointF);

    /* renamed from: g0 */
    public abstract C10396b mo43481g0(C17489c cVar);

    /* renamed from: h0 */
    public abstract C10397c mo43482h0();

    /* renamed from: i0 */
    public abstract C15757n mo43483i0();

    /* renamed from: j */
    public final void mo26825j() {
        f46370h.mo42878c("onSurfaceDestroyed");
        m58402m1(false);
        m58400k1(false);
    }

    /* renamed from: j0 */
    public abstract float mo43484j0();

    /* renamed from: j1 */
    public Task mo43511j1(boolean z) {
        f46370h.mo42878c("STOP:", "scheduled. State:", mo43508Z());
        m58402m1(z);
        m58400k1(z);
        return m58401l1(z);
    }

    /* renamed from: l0 */
    public final boolean mo43512l0() {
        return this.f46374g.mo45344u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public abstract Task mo43348m0();

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public abstract Task mo43349n0();

    /* renamed from: n1 */
    public abstract void mo43485n1();

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public abstract Task mo43350o0();

    /* renamed from: o1 */
    public abstract void mo43486o1(C11278a.C11279a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public abstract Task mo43353p0();

    /* renamed from: p1 */
    public abstract void mo43487p1(C11278a.C11279a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public abstract Task mo43355q0();

    /* renamed from: q1 */
    public abstract void mo43488q1(C11280b.C11281a aVar, File file, FileDescriptor fileDescriptor);

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public abstract Task mo43356r0();

    /* renamed from: r1 */
    public abstract void mo43489r1(C11280b.C11281a aVar, File file);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo43357t(C15749f fVar);

    /* renamed from: t0 */
    public void mo43513t0() {
        f46370h.mo42878c("RESTART:", "scheduled. State:", mo43508Z());
        mo43511j1(false);
        mo43510e1();
    }

    /* renamed from: u */
    public void mo43514u(boolean z) {
        m58407v(z, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public Task mo43515u0() {
        f46370h.mo42878c("RESTART BIND:", "scheduled. State:", mo43508Z());
        m58402m1(false);
        m58400k1(false);
        m58396g1();
        return m58398i1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public Task mo43516v0() {
        f46370h.mo42878c("RESTART PREVIEW:", "scheduled. State:", mo43508Z());
        m58402m1(false);
        return m58398i1();
    }

    /* renamed from: w */
    public abstract C17486a mo43490w();

    /* renamed from: w0 */
    public abstract void mo43491w0(C15744a aVar);

    /* renamed from: x */
    public abstract C15744a mo43492x();

    /* renamed from: x0 */
    public abstract void mo43493x0(int i);

    /* renamed from: y */
    public abstract int mo43494y();

    /* renamed from: y0 */
    public abstract void mo43495y0(C15745b bVar);

    /* renamed from: z */
    public abstract C15745b mo43496z();

    /* renamed from: z0 */
    public abstract void mo43497z0(long j);
}
