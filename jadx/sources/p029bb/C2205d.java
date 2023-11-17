package p029bb;

import androidx.collection.LruCache;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p012ab.C0098b;

/* renamed from: bb.d */
public class C2205d extends C2200a {

    /* renamed from: b */
    private final C2201b f6421b;

    /* renamed from: c */
    private final LruCache f6422c = new LruCache(5);

    /* renamed from: d */
    private final ReadWriteLock f6423d = new ReentrantReadWriteLock();

    /* renamed from: e */
    private final Executor f6424e = Executors.newCachedThreadPool();

    /* renamed from: bb.d$a */
    private class C2206a implements Runnable {

        /* renamed from: d */
        private final int f6425d;

        public C2206a(int i) {
            this.f6425d = i;
        }

        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            Set unused2 = C2205d.this.m8446i(this.f6425d);
        }
    }

    public C2205d(C2201b bVar) {
        this.f6421b = bVar;
    }

    /* renamed from: h */
    private void m8445h() {
        this.f6422c.evictAll();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public Set m8446i(int i) {
        this.f6423d.readLock().lock();
        Set set = (Set) this.f6422c.get(Integer.valueOf(i));
        this.f6423d.readLock().unlock();
        if (set == null) {
            this.f6423d.writeLock().lock();
            set = (Set) this.f6422c.get(Integer.valueOf(i));
            if (set == null) {
                set = this.f6421b.mo7131e((float) i);
                this.f6422c.put(Integer.valueOf(i), set);
            }
            this.f6423d.writeLock().unlock();
        }
        return set;
    }

    /* renamed from: b */
    public boolean mo7129b(C0098b bVar) {
        boolean b = this.f6421b.mo7129b(bVar);
        if (b) {
            m8445h();
        }
        return b;
    }

    /* renamed from: d */
    public boolean mo7130d(C0098b bVar) {
        boolean d = this.f6421b.mo7130d(bVar);
        if (d) {
            m8445h();
        }
        return d;
    }

    /* renamed from: e */
    public Set mo7131e(float f) {
        int i = (int) f;
        Set i2 = m8446i(i);
        int i3 = i + 1;
        if (this.f6422c.get(Integer.valueOf(i3)) == null) {
            this.f6424e.execute(new C2206a(i3));
        }
        int i4 = i - 1;
        if (this.f6422c.get(Integer.valueOf(i4)) == null) {
            this.f6424e.execute(new C2206a(i4));
        }
        return i2;
    }

    /* renamed from: f */
    public int mo7132f() {
        return this.f6421b.mo7132f();
    }
}
