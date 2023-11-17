package xh1;

import java.util.concurrent.CountDownLatch;
import org.webrtc.C42085h;

/* renamed from: xh1.f */
public final /* synthetic */ class C43311f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42085h f101073d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f101074e;

    public /* synthetic */ C43311f(C42085h hVar, CountDownLatch countDownLatch) {
        this.f101073d = hVar;
        this.f101074e = countDownLatch;
    }

    public final void run() {
        this.f101073d.m122283w(this.f101074e);
    }
}
