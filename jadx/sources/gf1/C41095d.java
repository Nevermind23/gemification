package gf1;

import he1.C41238w;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41610o;
import kotlinx.coroutines.internal.C41622v;
import kotlinx.coroutines.internal.UndeliveredElementException;
import ue1.C43075l;

/* renamed from: gf1.d */
public class C41095d extends C41085a {

    /* renamed from: g */
    private final int f97011g;

    /* renamed from: h */
    private final C41097e f97012h;

    /* renamed from: i */
    private final ReentrantLock f97013i;

    /* renamed from: j */
    private Object[] f97014j;

    /* renamed from: k */
    private int f97015k;
    private volatile /* synthetic */ int size;

    /* renamed from: gf1.d$a */
    public /* synthetic */ class C41096a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97016a;

        static {
            int[] iArr = new int[C41097e.values().length];
            iArr[C41097e.SUSPEND.ordinal()] = 1;
            iArr[C41097e.DROP_LATEST.ordinal()] = 2;
            iArr[C41097e.DROP_OLDEST.ordinal()] = 3;
            f97016a = iArr;
        }
    }

    public C41095d(int i, C41097e eVar, C43075l lVar) {
        super(lVar);
        this.f97011g = i;
        this.f97012h = eVar;
        if (i < 1 ? false : true) {
            this.f97013i = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C41331l.m119768l(objArr, C41091b.f97000a, 0, 0, 6, (Object) null);
            this.f97014j = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: O */
    private final void m119125O(int i, Object obj) {
        if (i < this.f97011g) {
            m119126P(i);
            Object[] objArr = this.f97014j;
            objArr[(this.f97015k + i) % objArr.length] = obj;
            return;
        }
        Object[] objArr2 = this.f97014j;
        int i2 = this.f97015k;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = obj;
        this.f97015k = (i2 + 1) % objArr2.length;
    }

    /* renamed from: P */
    private final void m119126P(int i) {
        Object[] objArr = this.f97014j;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f97011g);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f97014j;
                objArr2[i2] = objArr3[(this.f97015k + i2) % objArr3.length];
            }
            C41331l.m119767k(objArr2, C41091b.f97000a, i, min);
            this.f97014j = objArr2;
            this.f97015k = 0;
        }
    }

    /* renamed from: Q */
    private final C41584a0 m119127Q(int i) {
        if (i < this.f97011g) {
            this.size = i + 1;
            return null;
        }
        int i2 = C41096a.f97016a[this.f97012h.ordinal()];
        if (i2 == 1) {
            return C41091b.f97002c;
        }
        if (i2 == 2) {
            return C41091b.f97001b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo95495D(C41114r rVar) {
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        try {
            return super.mo95495D(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo95496E() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo95497F() {
        return this.size == 0;
    }

    /* renamed from: G */
    public boolean mo95498G() {
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        try {
            return super.mo95498G();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo95499H(boolean z) {
        C43075l lVar = this.f97007d;
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f97014j[this.f97015k];
                if (!(lVar == null || obj == C41091b.f97000a)) {
                    undeliveredElementException = C41622v.m120769c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f97014j;
                int i3 = this.f97015k;
                objArr[i3] = C41091b.f97000a;
                this.f97015k = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C41238w wVar = C41238w.f97225a;
            reentrantLock.unlock();
            super.mo95499H(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public Object mo95503L() {
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object h = mo95518h();
                if (h == null) {
                    h = C41091b.f97003d;
                }
                return h;
            }
            Object[] objArr = this.f97014j;
            int i2 = this.f97015k;
            Object obj = objArr[i2];
            C41118v vVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C41091b.f97003d;
            boolean z = false;
            if (i == this.f97011g) {
                C41118v vVar2 = null;
                while (true) {
                    C41118v w = mo95526w();
                    if (w == null) {
                        vVar = vVar2;
                        break;
                    }
                    C41536l.m120486f(w);
                    if (w.mo95528A((C41610o.C41612b) null) != null) {
                        obj2 = w.mo95530y();
                        z = true;
                        vVar = w;
                        break;
                    }
                    w.mo95551B();
                    vVar2 = w;
                }
            }
            if (obj2 != C41091b.f97003d && !(obj2 instanceof C41108l)) {
                this.size = i;
                Object[] objArr2 = this.f97014j;
                objArr2[(this.f97015k + i) % objArr2.length] = obj2;
            }
            this.f97015k = (this.f97015k + 1) % this.f97014j.length;
            C41238w wVar = C41238w.f97225a;
            reentrantLock.unlock();
            if (z) {
                C41536l.m120486f(vVar);
                vVar.mo95529x();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo95515e(C41118v vVar) {
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        try {
            return super.mo95515e(vVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo95516f() {
        return "(buffer:capacity=" + this.f97011g + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo95520o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo95521p() {
        return this.size == this.f97011g && this.f97012h == C41097e.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo95522r(Object obj) {
        C41116t v;
        ReentrantLock reentrantLock = this.f97013i;
        reentrantLock.lock();
        int i = this.size;
        C41108l h = mo95518h();
        if (h != null) {
            reentrantLock.unlock();
            return h;
        }
        C41584a0 Q = m119127Q(i);
        if (Q != null) {
            reentrantLock.unlock();
            return Q;
        }
        if (i == 0) {
            do {
                try {
                    v = mo95506v();
                    if (v != null) {
                        if (v instanceof C41108l) {
                            this.size = i;
                            reentrantLock.unlock();
                            return v;
                        }
                        C41536l.m120486f(v);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (v.mo95509d(obj, (C41610o.C41612b) null) == null);
            this.size = i;
            C41238w wVar = C41238w.f97225a;
            reentrantLock.unlock();
            v.mo95508c(obj);
            return v.mo95548a();
        }
        m119125O(i, obj);
        C41584a0 a0Var = C41091b.f97001b;
        reentrantLock.unlock();
        return a0Var;
    }
}
