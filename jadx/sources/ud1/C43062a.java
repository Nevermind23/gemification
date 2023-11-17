package ud1;

import com.salesforce.marketingcloud.C11398b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import md1.C41739h;
import yd1.C43372m;

/* renamed from: ud1.a */
public final class C43062a extends AtomicReferenceArray implements C41739h {

    /* renamed from: i */
    private static final Integer f100501i = Integer.getInteger("jctools.spsc.max.lookahead.step", C11398b.f33143v);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: d */
    final int f100502d = (length() - 1);

    /* renamed from: e */
    final AtomicLong f100503e = new AtomicLong();

    /* renamed from: f */
    long f100504f;

    /* renamed from: g */
    final AtomicLong f100505g = new AtomicLong();

    /* renamed from: h */
    final int f100506h;

    public C43062a(int i) {
        super(C43372m.m124437a(i));
        this.f100506h = Math.min(i / 4, f100501i.intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo101644a(long j) {
        return ((int) j) & this.f100502d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo101645b(long j, int i) {
        return ((int) j) & i;
    }

    /* renamed from: c */
    public Object mo96258c() {
        long j = this.f100505g.get();
        int a = mo101644a(j);
        Object d = mo101646d(a);
        if (d == null) {
            return null;
        }
        mo101647g(j + 1);
        mo101648h(a, (Object) null);
        return d;
    }

    public void clear() {
        while (true) {
            if (mo96258c() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo101646d(int i) {
        return get(i);
    }

    /* renamed from: f */
    public boolean mo96261f(Object obj) {
        if (obj != null) {
            int i = this.f100502d;
            long j = this.f100503e.get();
            int b = mo101645b(j, i);
            if (j >= this.f100504f) {
                long j2 = ((long) this.f100506h) + j;
                if (mo101646d(mo101645b(j2, i)) == null) {
                    this.f100504f = j2;
                } else if (mo101646d(b) != null) {
                    return false;
                }
            }
            mo101648h(b, obj);
            mo101649i(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo101647g(long j) {
        this.f100505g.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo101648h(int i, Object obj) {
        lazySet(i, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo101649i(long j) {
        this.f100503e.lazySet(j);
    }

    public boolean isEmpty() {
        return this.f100503e.get() == this.f100505g.get();
    }
}
