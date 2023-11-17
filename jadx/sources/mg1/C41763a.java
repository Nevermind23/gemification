package mg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ug1.C43105d;
import vh1.C43168a;
import vh1.C43169b;

/* renamed from: mg1.a */
public abstract class C41763a extends C41766c {

    /* renamed from: e */
    private final C43168a f98044e = C43169b.m123832i(C41763a.class);

    /* renamed from: f */
    private boolean f98045f;

    /* renamed from: g */
    private boolean f98046g;

    /* renamed from: h */
    private ScheduledExecutorService f98047h;

    /* renamed from: i */
    private ScheduledFuture f98048i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f98049j = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: k */
    private boolean f98050k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f98051l = new Object();

    /* renamed from: mg1.a$a */
    class C41764a implements Runnable {

        /* renamed from: d */
        private ArrayList f98052d = new ArrayList();

        C41764a() {
        }

        public void run() {
            long nanoTime;
            this.f98052d.clear();
            try {
                this.f98052d.addAll(C41763a.this.mo96549u());
                synchronized (C41763a.this.f98051l) {
                    nanoTime = (long) (((double) System.nanoTime()) - (((double) C41763a.this.f98049j) * 1.5d));
                }
                Iterator it = this.f98052d.iterator();
                while (it.hasNext()) {
                    C41763a.this.m121060t((C41765b) it.next(), nanoTime);
                }
            } catch (Exception unused) {
            }
            this.f98052d.clear();
        }
    }

    /* renamed from: s */
    private void m121059s() {
        ScheduledExecutorService scheduledExecutorService = this.f98047h;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f98047h = null;
        }
        ScheduledFuture scheduledFuture = this.f98048i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f98048i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m121060t(C41765b bVar, long j) {
        if (bVar instanceof C41767d) {
            C41767d dVar = (C41767d) bVar;
            if (dVar.mo96574q() < j) {
                this.f98044e.mo97517f("Closing connection due to no pong received: {}", dVar);
                dVar.mo96568e(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (dVar.mo96580v()) {
                dVar.mo96582z();
            } else {
                this.f98044e.mo97517f("Trying to ping a non open connection: {}", dVar);
            }
        }
    }

    /* renamed from: x */
    private void m121061x() {
        m121059s();
        this.f98047h = Executors.newSingleThreadScheduledExecutor(new C43105d("connectionLostChecker"));
        C41764a aVar = new C41764a();
        ScheduledExecutorService scheduledExecutorService = this.f98047h;
        long j = this.f98049j;
        this.f98048i = scheduledExecutorService.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo96547A() {
        synchronized (this.f98051l) {
            if (this.f98049j <= 0) {
                this.f98044e.mo97518g("Connection lost timer deactivated");
                return;
            }
            this.f98044e.mo97518g("Connection lost timer started");
            this.f98050k = true;
            m121061x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo96548B() {
        synchronized (this.f98051l) {
            if (!(this.f98047h == null && this.f98048i == null)) {
                this.f98050k = false;
                this.f98044e.mo97518g("Connection lost timer stopped");
                m121059s();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract Collection mo96549u();

    /* renamed from: v */
    public boolean mo96550v() {
        return this.f98046g;
    }

    /* renamed from: w */
    public boolean mo96551w() {
        return this.f98045f;
    }

    /* renamed from: y */
    public void mo96552y(boolean z) {
        this.f98046g = z;
    }

    /* renamed from: z */
    public void mo96553z(boolean z) {
        this.f98045f = z;
    }
}
