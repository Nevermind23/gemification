package xh1;

import java.util.concurrent.CountDownLatch;

/* renamed from: xh1.d0 */
public final /* synthetic */ class C43301d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f101060d;

    public /* synthetic */ C43301d0(CountDownLatch countDownLatch) {
        this.f101060d = countDownLatch;
    }

    public final void run() {
        this.f101060d.countDown();
    }
}
