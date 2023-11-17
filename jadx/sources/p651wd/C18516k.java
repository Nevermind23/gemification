package p651wd;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p342j$.util.concurrent.ConcurrentHashMap;
import p458id.C15600b;

/* renamed from: wd.k */
public class C18516k {

    /* renamed from: e */
    private static final C15600b f52010e = C15600b.m56349a(C18516k.class.getSimpleName());

    /* renamed from: f */
    private static final ConcurrentHashMap f52011f = new ConcurrentHashMap(4);

    /* renamed from: g */
    private static C18516k f52012g;

    /* renamed from: a */
    private String f52013a;

    /* renamed from: b */
    private HandlerThread f52014b;

    /* renamed from: c */
    private Handler f52015c = new Handler(this.f52014b.getLooper());

    /* renamed from: d */
    private Executor f52016d = new C18518b();

    /* renamed from: wd.k$a */
    class C18517a extends HandlerThread {
        C18517a(String str) {
            super(str);
        }

        public String toString() {
            return super.toString() + "[" + getThreadId() + "]";
        }
    }

    /* renamed from: wd.k$b */
    class C18518b implements Executor {
        C18518b() {
        }

        public void execute(Runnable runnable) {
            C18516k.this.mo46324j(runnable);
        }
    }

    /* renamed from: wd.k$c */
    class C18519c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f52019d;

        C18519c(CountDownLatch countDownLatch) {
            this.f52019d = countDownLatch;
        }

        public void run() {
            this.f52019d.countDown();
        }
    }

    private C18516k(String str) {
        this.f52013a = str;
        C18517a aVar = new C18517a(str);
        this.f52014b = aVar;
        aVar.setDaemon(true);
        this.f52014b.start();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo46323i(new C18519c(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public static void m63023b(Runnable runnable) {
        m63024c().mo46323i(runnable);
    }

    /* renamed from: c */
    public static C18516k m63024c() {
        C18516k d = m63025d("FallbackCameraThread");
        f52012g = d;
        return d;
    }

    /* renamed from: d */
    public static C18516k m63025d(String str) {
        ConcurrentHashMap concurrentHashMap = f52011f;
        if (concurrentHashMap.containsKey(str)) {
            C18516k kVar = (C18516k) ((WeakReference) concurrentHashMap.get(str)).get();
            if (kVar == null) {
                f52010e.mo42880h("get:", "Thread reference died. Removing.", str);
                concurrentHashMap.remove(str);
            } else if (!kVar.mo46321g().isAlive() || kVar.mo46321g().isInterrupted()) {
                kVar.mo46318a();
                f52010e.mo42880h("get:", "Thread reference found, but not alive or interrupted.", "Removing.", str);
                concurrentHashMap.remove(str);
            } else {
                f52010e.mo42880h("get:", "Reusing cached worker handler.", str);
                return kVar;
            }
        }
        f52010e.mo42878c("get:", "Creating new handler.", str);
        C18516k kVar2 = new C18516k(str);
        concurrentHashMap.put(str, new WeakReference(kVar2));
        return kVar2;
    }

    /* renamed from: a */
    public void mo46318a() {
        HandlerThread g = mo46321g();
        if (g.isAlive()) {
            g.interrupt();
            g.quit();
        }
        f52011f.remove(this.f52013a);
    }

    /* renamed from: e */
    public Executor mo46319e() {
        return this.f52016d;
    }

    /* renamed from: f */
    public Handler mo46320f() {
        return this.f52015c;
    }

    /* renamed from: g */
    public HandlerThread mo46321g() {
        return this.f52014b;
    }

    /* renamed from: h */
    public void mo46322h(long j, Runnable runnable) {
        this.f52015c.postDelayed(runnable, j);
    }

    /* renamed from: i */
    public void mo46323i(Runnable runnable) {
        this.f52015c.post(runnable);
    }

    /* renamed from: j */
    public void mo46324j(Runnable runnable) {
        if (Thread.currentThread() == mo46321g()) {
            runnable.run();
        } else {
            mo46323i(runnable);
        }
    }
}
