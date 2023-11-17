package p651wd;

import java.util.concurrent.LinkedBlockingQueue;
import p458id.C15600b;

/* renamed from: wd.i */
public class C18513i {

    /* renamed from: f */
    private static final C15600b f52004f = C15600b.m56349a(C18513i.class.getSimpleName());

    /* renamed from: a */
    private int f52005a;

    /* renamed from: b */
    private int f52006b;

    /* renamed from: c */
    private LinkedBlockingQueue f52007c;

    /* renamed from: d */
    private C18514a f52008d;

    /* renamed from: e */
    private final Object f52009e = new Object();

    /* renamed from: wd.i$a */
    public interface C18514a {
        Object create();
    }

    public C18513i(int i, C18514a aVar) {
        this.f52005a = i;
        this.f52007c = new LinkedBlockingQueue(i);
        this.f52008d = aVar;
    }

    /* renamed from: a */
    public final int mo46310a() {
        int i;
        synchronized (this.f52009e) {
            i = this.f52006b;
        }
        return i;
    }

    /* renamed from: b */
    public void mo46311b() {
        synchronized (this.f52009e) {
            this.f52007c.clear();
        }
    }

    /* renamed from: c */
    public final int mo46312c() {
        int a;
        synchronized (this.f52009e) {
            a = mo46310a() + mo46316g();
        }
        return a;
    }

    /* renamed from: d */
    public Object mo46313d() {
        synchronized (this.f52009e) {
            Object poll = this.f52007c.poll();
            if (poll != null) {
                this.f52006b++;
                f52004f.mo42879g("GET - Reusing recycled item.", this);
                return poll;
            } else if (mo46314e()) {
                f52004f.mo42879g("GET - Returning null. Too much items requested.", this);
                return null;
            } else {
                this.f52006b++;
                f52004f.mo42879g("GET - Creating a new item.", this);
                Object create = this.f52008d.create();
                return create;
            }
        }
    }

    /* renamed from: e */
    public boolean mo46314e() {
        boolean z;
        synchronized (this.f52009e) {
            if (mo46312c() >= this.f52005a) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public void mo46315f(Object obj) {
        synchronized (this.f52009e) {
            f52004f.mo42879g("RECYCLE - Recycling item.", this);
            int i = this.f52006b - 1;
            this.f52006b = i;
            if (i < 0) {
                throw new IllegalStateException("Trying to recycle an item which makes activeCount < 0. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. " + this);
            } else if (!this.f52007c.offer(obj)) {
                throw new IllegalStateException("Trying to recycle an item while the queue is full. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. " + this);
            }
        }
    }

    /* renamed from: g */
    public final int mo46316g() {
        int size;
        synchronized (this.f52009e) {
            size = this.f52007c.size();
        }
        return size;
    }

    public String toString() {
        return getClass().getSimpleName() + " - count:" + mo46312c() + ", active:" + mo46310a() + ", recycled:" + mo46316g();
    }
}
