package ef1;

import ef1.C40885z0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: ef1.m0 */
public final class C40836m0 extends C40885z0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    public static final C40836m0 f96547k;

    /* renamed from: l */
    private static final long f96548l;

    static {
        Long l;
        C40836m0 m0Var = new C40836m0();
        f96547k = m0Var;
        C40882y0.m118581o0(m0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f96548l = timeUnit.toNanos(l.longValue());
    }

    private C40836m0() {
    }

    /* renamed from: B1 */
    private final boolean m118338B1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: F1 */
    private final synchronized boolean m118339F1() {
        if (m118338B1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: G1 */
    private final void m118340G1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: t1 */
    private final synchronized void m118341t1() {
        if (m118338B1()) {
            debugStatus = 3;
            mo95283k1();
            notifyAll();
        }
    }

    /* renamed from: y1 */
    private final synchronized Thread m118342y1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: z1 */
    private final boolean m118343z1() {
        return debugStatus == 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public Thread mo95135G0() {
        Thread thread = _thread;
        return thread == null ? m118342y1() : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public void mo95136H0(long j, C40885z0.C40887b bVar) {
        m118340G1();
    }

    /* renamed from: W0 */
    public void mo95181W0(Runnable runnable) {
        if (m118343z1()) {
            m118340G1();
        }
        super.mo95181W0(runnable);
    }

    public void run() {
        C40834l2.f96545a.mo95180d(this);
        C40785c.m118257a();
        try {
            if (m118339F1()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long s0 = mo95275s0();
                    if (s0 == Long.MAX_VALUE) {
                        C40785c.m118257a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f96548l + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m118341t1();
                            C40785c.m118257a();
                            if (!mo95282f1()) {
                                mo95135G0();
                                return;
                            }
                            return;
                        }
                        s0 = C43429k.m124589h(s0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (s0 > 0) {
                        if (m118338B1()) {
                            _thread = null;
                            m118341t1();
                            C40785c.m118257a();
                            if (!mo95282f1()) {
                                mo95135G0();
                                return;
                            }
                            return;
                        }
                        C40785c.m118257a();
                        LockSupport.parkNanos(this, s0);
                    }
                }
            }
        } finally {
            _thread = null;
            m118341t1();
            C40785c.m118257a();
            if (!mo95282f1()) {
                mo95135G0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
