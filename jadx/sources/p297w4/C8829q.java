package p297w4;

import com.facebook.C2626d;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: w4.q */
public class C8829q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Object f24789a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f24790b = new CountDownLatch(1);

    /* renamed from: w4.q$a */
    class C8830a implements Callable {

        /* renamed from: d */
        final /* synthetic */ Callable f24791d;

        C8830a(Callable callable) {
            this.f24791d = callable;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public Void call() {
            try {
                Object unused = C8829q.this.f24789a = this.f24791d.call();
                C8829q.this.f24790b.countDown();
                return null;
            } catch (Throwable th) {
                C8829q.this.f24790b.countDown();
                throw th;
            }
        }
    }

    public C8829q(Callable callable) {
        C2626d.m10142m().execute(new FutureTask(new C8830a(callable)));
    }
}
