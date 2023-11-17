package yd1;

import ae1.C40293a;
import hd1.C41205b;
import java.util.concurrent.CountDownLatch;
import vd1.C43135g;

/* renamed from: yd1.d */
public abstract class C43359d {
    /* renamed from: a */
    public static void m124400a(CountDownLatch countDownLatch, C41205b bVar) {
        if (countDownLatch.getCount() != 0) {
            try {
                m124401b();
                countDownLatch.await();
            } catch (InterruptedException e) {
                bVar.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }

    /* renamed from: b */
    public static void m124401b() {
        if (!C40293a.m116713j()) {
            return;
        }
        if ((Thread.currentThread() instanceof C43135g) || C40293a.m116720q()) {
            throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
        }
    }
}
