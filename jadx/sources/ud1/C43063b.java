package ud1;

import com.salesforce.marketingcloud.C11398b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import md1.C41739h;
import yd1.C43372m;

/* renamed from: ud1.b */
public final class C43063b implements C41739h {

    /* renamed from: l */
    static final int f100507l = Integer.getInteger("jctools.spsc.max.lookahead.step", C11398b.f33143v).intValue();

    /* renamed from: m */
    private static final Object f100508m = new Object();

    /* renamed from: d */
    final AtomicLong f100509d = new AtomicLong();

    /* renamed from: e */
    int f100510e;

    /* renamed from: f */
    long f100511f;

    /* renamed from: g */
    final int f100512g;

    /* renamed from: h */
    AtomicReferenceArray f100513h;

    /* renamed from: i */
    final int f100514i;

    /* renamed from: j */
    AtomicReferenceArray f100515j;

    /* renamed from: k */
    final AtomicLong f100516k = new AtomicLong();

    public C43063b(int i) {
        int a = C43372m.m124437a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a + 1);
        this.f100513h = atomicReferenceArray;
        this.f100512g = i2;
        m123604a(a);
        this.f100515j = atomicReferenceArray;
        this.f100514i = i2;
        this.f100511f = (long) (i2 - 1);
        m123618r(0);
    }

    /* renamed from: a */
    private void m123604a(int i) {
        this.f100510e = Math.min(i / 4, f100507l);
    }

    /* renamed from: b */
    private static int m123605b(int i) {
        return i;
    }

    /* renamed from: d */
    private static int m123606d(long j, int i) {
        return m123605b(((int) j) & i);
    }

    /* renamed from: g */
    private long m123607g() {
        return this.f100516k.get();
    }

    /* renamed from: h */
    private long m123608h() {
        return this.f100509d.get();
    }

    /* renamed from: i */
    private long m123609i() {
        return this.f100516k.get();
    }

    /* renamed from: j */
    private static Object m123610j(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: k */
    private AtomicReferenceArray m123611k(AtomicReferenceArray atomicReferenceArray, int i) {
        int b = m123605b(i);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) m123610j(atomicReferenceArray, b);
        m123616p(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: l */
    private long m123612l() {
        return this.f100509d.get();
    }

    /* renamed from: m */
    private Object m123613m(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f100515j = atomicReferenceArray;
        int d = m123606d(j, i);
        Object j2 = m123610j(atomicReferenceArray, d);
        if (j2 != null) {
            m123616p(atomicReferenceArray, d, (Object) null);
            m123615o(j + 1);
        }
        return j2;
    }

    /* renamed from: n */
    private void m123614n(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f100513h = atomicReferenceArray2;
        this.f100511f = (j2 + j) - 1;
        m123616p(atomicReferenceArray2, i, obj);
        m123617q(atomicReferenceArray, atomicReferenceArray2);
        m123616p(atomicReferenceArray, i, f100508m);
        m123618r(j + 1);
    }

    /* renamed from: o */
    private void m123615o(long j) {
        this.f100516k.lazySet(j);
    }

    /* renamed from: p */
    private static void m123616p(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: q */
    private void m123617q(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m123616p(atomicReferenceArray, m123605b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: r */
    private void m123618r(long j) {
        this.f100509d.lazySet(j);
    }

    /* renamed from: s */
    private boolean m123619s(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m123616p(atomicReferenceArray, i, obj);
        m123618r(j + 1);
        return true;
    }

    /* renamed from: c */
    public Object mo96258c() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f100515j;
        long g = m123607g();
        int i = this.f100514i;
        int d = m123606d(g, i);
        Object j = m123610j(atomicReferenceArray, d);
        if (j == f100508m) {
            z = true;
        } else {
            z = false;
        }
        if (j != null && !z) {
            m123616p(atomicReferenceArray, d, (Object) null);
            m123615o(g + 1);
            return j;
        } else if (z) {
            return m123613m(m123611k(atomicReferenceArray, i + 1), g, i);
        } else {
            return null;
        }
    }

    public void clear() {
        while (true) {
            if (mo96258c() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: f */
    public boolean mo96261f(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.f100513h;
            long h = m123608h();
            int i = this.f100512g;
            int d = m123606d(h, i);
            if (h < this.f100511f) {
                return m123619s(atomicReferenceArray, obj, h, d);
            }
            long j = ((long) this.f100510e) + h;
            if (m123610j(atomicReferenceArray, m123606d(j, i)) == null) {
                this.f100511f = j - 1;
                return m123619s(atomicReferenceArray, obj, h, d);
            } else if (m123610j(atomicReferenceArray, m123606d(1 + h, i)) == null) {
                return m123619s(atomicReferenceArray, obj, h, d);
            } else {
                m123614n(atomicReferenceArray, h, d, obj, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public boolean isEmpty() {
        return m123612l() == m123609i();
    }
}
