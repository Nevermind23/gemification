package androidx.work;

import android.content.Context;
import androidx.work.C2068l;
import androidx.work.impl.utils.futures.C2059c;
import p262t8.C8421a;

public abstract class Worker extends C2068l {
    C2059c mFuture;

    /* renamed from: androidx.work.Worker$a */
    class C1946a implements Runnable {
        C1946a() {
        }

        public void run() {
            try {
                Worker.this.mFuture.mo6896p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo6897q(th);
            }
        }
    }

    /* renamed from: androidx.work.Worker$b */
    class C1947b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C2059c f5864d;

        C1947b(C2059c cVar) {
            this.f5864d = cVar;
        }

        public void run() {
            try {
                this.f5864d.mo6896p(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                this.f5864d.mo6897q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract C2068l.C2069a doWork();

    public C1963h getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    public C8421a getForegroundInfoAsync() {
        C2059c t = C2059c.m8028t();
        getBackgroundExecutor().execute(new C1947b(t));
        return t;
    }

    public final C8421a startWork() {
        this.mFuture = C2059c.m8028t();
        getBackgroundExecutor().execute(new C1946a());
        return this.mFuture;
    }
}
