package p337z7;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: z7.l */
final class C9235l implements C9236m {

    /* renamed from: a */
    private final CountDownLatch f25664a = new CountDownLatch(1);

    /* synthetic */ C9235l(C9234k kVar) {
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        this.f25664a.countDown();
    }

    /* renamed from: b */
    public final void mo18086b() {
        this.f25664a.countDown();
    }

    /* renamed from: c */
    public final void mo24895c() {
        this.f25664a.await();
    }

    /* renamed from: d */
    public final boolean mo24896d(long j, TimeUnit timeUnit) {
        return this.f25664a.await(j, timeUnit);
    }

    public final void onFailure(Exception exc) {
        this.f25664a.countDown();
    }
}
