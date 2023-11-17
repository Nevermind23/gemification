package p068e9;

import java.util.concurrent.CountDownLatch;
import p337z7.C9215a;
import p337z7.Task;

/* renamed from: e9.n0 */
public final /* synthetic */ class C6096n0 implements C9215a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f18954a;

    public /* synthetic */ C6096n0(CountDownLatch countDownLatch) {
        this.f18954a = countDownLatch;
    }

    /* renamed from: a */
    public final Object mo17447a(Task task) {
        return this.f18954a.countDown();
    }
}
