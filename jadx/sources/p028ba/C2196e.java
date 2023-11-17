package p028ba;

import com.google.firebase.installations.C5291h;
import java.util.concurrent.TimeUnit;

/* renamed from: ba.e */
class C2196e {

    /* renamed from: d */
    private static final long f6403d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f6404e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C5291h f6405a = C5291h.m20893c();

    /* renamed from: b */
    private long f6406b;

    /* renamed from: c */
    private int f6407c;

    C2196e() {
    }

    /* renamed from: a */
    private synchronized long m8413a(int i) {
        if (!m8414c(i)) {
            return f6403d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f6407c) + ((double) this.f6405a.mo17514e()), (double) f6404e);
    }

    /* renamed from: c */
    private static boolean m8414c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m8415d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m8416e() {
        this.f6407c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo7125b() {
        boolean z;
        if (this.f6407c == 0 || this.f6405a.mo17512a() > this.f6406b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void mo7126f(int i) {
        if (m8415d(i)) {
            m8416e();
            return;
        }
        this.f6407c++;
        this.f6406b = this.f6405a.mo17512a() + m8413a(i);
    }
}
