package p585re;

import com.threatmetrix.TrustDefender.C11907h;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: re.i */
public class C17592i {

    /* renamed from: j */
    private static final String f49276j = C11907h.m43615j(C17592i.class);

    /* renamed from: a */
    private final ReentrantReadWriteLock f49277a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private volatile boolean f49278b = false;

    /* renamed from: c */
    private volatile boolean f49279c = false;

    /* renamed from: d */
    private volatile boolean f49280d = false;

    /* renamed from: e */
    private volatile boolean f49281e = false;

    /* renamed from: f */
    private volatile boolean f49282f = false;

    /* renamed from: g */
    private volatile boolean f49283g = false;

    /* renamed from: h */
    private CountDownLatch f49284h = null;

    /* renamed from: i */
    private CountDownLatch f49285i = null;

    /* renamed from: g */
    private CountDownLatch m61176g(boolean z) {
        this.f49277a.readLock().lock();
        try {
            if (this.f49282f && this.f49285i != null && (!z || this.f49283g)) {
                return this.f49285i;
            }
            this.f49277a.readLock().unlock();
            return null;
        } finally {
            this.f49277a.readLock().unlock();
        }
    }

    /* renamed from: a */
    public void mo45144a() {
        this.f49277a.writeLock().lock();
        try {
            this.f49279c = false;
        } finally {
            this.f49277a.writeLock().unlock();
        }
    }

    /* renamed from: b */
    public boolean mo45145b(boolean z, Long l) {
        CountDownLatch g = m61176g(z);
        if (g == null) {
            return true;
        }
        C11907h.m43607b(f49276j, "waitForScan: Waiting for scan to complete");
        if (l != null) {
            return g.await(l.longValue(), TimeUnit.MILLISECONDS);
        }
        try {
            g.await();
            return true;
        } catch (InterruptedException unused) {
            C11907h.m43607b(f49276j, "waitForScan was interrupted");
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo45146c() {
        this.f49277a.readLock().lock();
        try {
            CountDownLatch countDownLatch = this.f49284h;
            return this.f49278b && countDownLatch != null && countDownLatch.getCount() == 0;
        } finally {
            this.f49277a.readLock().unlock();
        }
    }

    /* renamed from: d */
    public boolean mo45147d() {
        this.f49277a.writeLock().lock();
        try {
            if (!this.f49278b) {
                this.f49278b = true;
                this.f49284h = new CountDownLatch(1);
                return true;
            }
            this.f49277a.writeLock().unlock();
            return false;
        } finally {
            this.f49277a.writeLock().unlock();
        }
    }

    /* renamed from: e */
    public boolean mo45148e() {
        this.f49277a.readLock().lock();
        try {
            return this.f49278b;
        } finally {
            this.f49277a.readLock().unlock();
        }
    }

    /* renamed from: f */
    public boolean mo45149f(boolean z) {
        this.f49277a.writeLock().lock();
        try {
            if (!this.f49282f) {
                if (this.f49281e) {
                    C11907h.m43607b(f49276j, "startScanning: aborted, marked as cancelled");
                    this.f49281e = false;
                } else {
                    this.f49282f = true;
                    this.f49285i = new CountDownLatch(1);
                    this.f49283g = z;
                    this.f49277a.writeLock().unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f49277a.writeLock().unlock();
        }
    }

    /* renamed from: h */
    public void mo45150h(boolean z) {
        this.f49277a.readLock().lock();
        try {
            this.f49278b = z;
            CountDownLatch countDownLatch = this.f49284h;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } finally {
            this.f49277a.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public boolean mo45151i(int i) {
        CountDownLatch countDownLatch;
        boolean z;
        this.f49277a.readLock().lock();
        try {
            boolean z2 = false;
            if (!this.f49278b || (countDownLatch = this.f49284h) == null) {
                C11907h.m43607b(f49276j, "init not in progress, nothing to wait for");
                this.f49277a.readLock().unlock();
                return false;
            }
            this.f49277a.readLock().unlock();
            String str = f49276j;
            C11907h.m43607b(str, "Waiting for init to complete");
            try {
                z = countDownLatch.await((long) i, TimeUnit.MILLISECONDS);
                if (!z) {
                    try {
                        C11907h.m43609d(str, "Timed out waiting for init to complete");
                    } catch (InterruptedException e) {
                        e = e;
                    }
                }
            } catch (InterruptedException e2) {
                e = e2;
                z = false;
                C11907h.m43619n(f49276j, "Waiting for init to complete interrupted", e);
                this.f49277a.readLock().lock();
                z2 = true;
                return z2;
            }
            this.f49277a.readLock().lock();
            try {
                if (this.f49278b && z) {
                    z2 = true;
                }
                return z2;
            } finally {
                this.f49277a.readLock().unlock();
            }
        } catch (Throwable th) {
            this.f49277a.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public boolean mo45152j() {
        this.f49277a.readLock().lock();
        try {
            return this.f49280d;
        } finally {
            this.f49277a.readLock().unlock();
        }
    }

    /* renamed from: k */
    public boolean mo45153k() {
        this.f49277a.writeLock().lock();
        try {
            if (!this.f49279c) {
                this.f49279c = true;
                this.f49280d = false;
                return true;
            }
            this.f49277a.writeLock().unlock();
            return false;
        } finally {
            this.f49277a.writeLock().unlock();
        }
    }

    /* renamed from: l */
    public void mo45154l() {
        CountDownLatch countDownLatch;
        this.f49277a.readLock().lock();
        try {
            if (this.f49282f) {
                this.f49282f = false;
                this.f49281e = false;
                this.f49283g = false;
                countDownLatch = this.f49285i;
            } else {
                countDownLatch = null;
            }
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } finally {
            this.f49277a.readLock().unlock();
        }
    }
}
