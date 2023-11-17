package nd1;

import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.CountDownLatch;
import yd1.C43359d;
import yd1.C43364i;

/* renamed from: nd1.e */
public abstract class C41778e extends CountDownLatch implements C40756v, C41205b {

    /* renamed from: d */
    Object f98085d;

    /* renamed from: e */
    Throwable f98086e;

    /* renamed from: f */
    C41205b f98087f;

    /* renamed from: g */
    volatile boolean f98088g;

    public C41778e() {
        super(1);
    }

    /* renamed from: a */
    public final Object mo96601a() {
        if (getCount() != 0) {
            try {
                C43359d.m124401b();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw C43364i.m124412e(e);
            }
        }
        Throwable th = this.f98086e;
        if (th == null) {
            return this.f98085d;
        }
        throw C43364i.m124412e(th);
    }

    public final void dispose() {
        this.f98088g = true;
        C41205b bVar = this.f98087f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.f98088g;
    }

    public final void onComplete() {
        countDown();
    }

    public final void onSubscribe(C41205b bVar) {
        this.f98087f = bVar;
        if (this.f98088g) {
            bVar.dispose();
        }
    }
}
