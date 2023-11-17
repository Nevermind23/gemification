package p126j2;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p113i2.C6524e;
import p165m2.C7071d;

/* renamed from: j2.a */
public class C6682a extends ThreadPoolExecutor {

    /* renamed from: j2.a$a */
    private static final class C6683a extends FutureTask implements Comparable {

        /* renamed from: d */
        private final C7071d f20211d;

        public C6683a(C7071d dVar) {
            super(dVar, (Object) null);
            this.f20211d = dVar;
        }

        /* renamed from: a */
        public int compareTo(C6683a aVar) {
            C6524e e = this.f20211d.mo21295e();
            C6524e e2 = aVar.f20211d.mo21295e();
            if (e == e2) {
                return this.f20211d.f21011e - aVar.f20211d.f21011e;
            }
            return e2.ordinal() - e.ordinal();
        }
    }

    C6682a(int i, ThreadFactory threadFactory) {
        super(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    public Future submit(Runnable runnable) {
        C6683a aVar = new C6683a((C7071d) runnable);
        execute(aVar);
        return aVar;
    }
}
