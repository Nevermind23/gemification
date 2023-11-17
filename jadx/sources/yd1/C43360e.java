package yd1;

import java.util.concurrent.CountDownLatch;
import jd1.C41394a;
import jd1.C41399f;

/* renamed from: yd1.e */
public final class C43360e extends CountDownLatch implements C41399f, C41394a {

    /* renamed from: d */
    public Throwable f101200d;

    public C43360e() {
        super(1);
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        this.f101200d = th;
        countDown();
    }

    public void run() {
        countDown();
    }
}
