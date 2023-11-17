package nd1;

import ed1.C40737d;
import ed1.C40746m;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.CountDownLatch;
import yd1.C43359d;

/* renamed from: nd1.g */
public final class C41780g extends CountDownLatch implements C40764z, C40737d, C40746m {

    /* renamed from: d */
    Object f98089d;

    /* renamed from: e */
    Throwable f98090e;

    /* renamed from: f */
    C41205b f98091f;

    /* renamed from: g */
    volatile boolean f98092g;

    public C41780g() {
        super(1);
    }

    /* renamed from: a */
    public void mo95096a(Object obj) {
        this.f98089d = obj;
        countDown();
    }

    /* renamed from: b */
    public Throwable mo96602b() {
        if (getCount() != 0) {
            try {
                C43359d.m124401b();
                await();
            } catch (InterruptedException e) {
                mo96603c();
                return e;
            }
        }
        return this.f98090e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo96603c() {
        this.f98092g = true;
        C41205b bVar = this.f98091f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f98090e = th;
        countDown();
    }

    public void onSubscribe(C41205b bVar) {
        this.f98091f = bVar;
        if (this.f98092g) {
            bVar.dispose();
        }
    }
}
