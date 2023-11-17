package p335z5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: z5.c */
final class C9211c extends Thread {

    /* renamed from: d */
    private final WeakReference f25638d;

    /* renamed from: e */
    private final long f25639e;

    /* renamed from: f */
    final CountDownLatch f25640f = new CountDownLatch(1);

    /* renamed from: g */
    boolean f25641g = false;

    public C9211c(C9208a aVar, long j) {
        this.f25638d = new WeakReference(aVar);
        this.f25639e = j;
        start();
    }

    /* renamed from: a */
    private final void m34035a() {
        C9208a aVar = (C9208a) this.f25638d.get();
        if (aVar != null) {
            aVar.mo24843c();
            this.f25641g = true;
        }
    }

    public final void run() {
        try {
            if (!this.f25640f.await(this.f25639e, TimeUnit.MILLISECONDS)) {
                m34035a();
            }
        } catch (InterruptedException unused) {
            m34035a();
        }
    }
}
