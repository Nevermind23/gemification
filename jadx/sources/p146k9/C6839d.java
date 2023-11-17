package p146k9;

import java.util.concurrent.CountDownLatch;

/* renamed from: k9.d */
public final /* synthetic */ class C6839d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C6840e f20484d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f20485e;

    public /* synthetic */ C6839d(C6840e eVar, CountDownLatch countDownLatch) {
        this.f20484d = eVar;
        this.f20485e = countDownLatch;
    }

    public final void run() {
        this.f20484d.m26583m(this.f20485e);
    }
}
