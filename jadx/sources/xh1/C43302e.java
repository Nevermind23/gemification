package xh1;

import java.util.concurrent.CountDownLatch;
import org.webrtc.C42085h;

/* renamed from: xh1.e */
public final /* synthetic */ class C43302e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42085h f101061d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f101062e;

    /* renamed from: f */
    public final /* synthetic */ C42085h.C42089d f101063f;

    public /* synthetic */ C43302e(C42085h hVar, CountDownLatch countDownLatch, C42085h.C42089d dVar) {
        this.f101061d = hVar;
        this.f101062e = countDownLatch;
        this.f101063f = dVar;
    }

    public final void run() {
        this.f101061d.m122286z(this.f101062e, this.f101063f);
    }
}
