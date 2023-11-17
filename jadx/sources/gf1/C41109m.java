package gf1;

import he1.C41238w;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C41536l;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41610o;
import kotlinx.coroutines.internal.C41622v;
import kotlinx.coroutines.internal.UndeliveredElementException;
import ue1.C43075l;

/* renamed from: gf1.m */
public class C41109m extends C41085a {

    /* renamed from: g */
    private final ReentrantLock f97030g = new ReentrantLock();

    /* renamed from: h */
    private Object f97031h = C41091b.f97000a;

    public C41109m(C43075l lVar) {
        super(lVar);
    }

    /* renamed from: O */
    private final UndeliveredElementException m119173O(Object obj) {
        C43075l lVar;
        Object obj2 = this.f97031h;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == C41091b.f97000a || (lVar = this.f97007d) == null)) {
            undeliveredElementException = C41622v.m120770d(lVar, obj2, (UndeliveredElementException) null, 2, (Object) null);
        }
        this.f97031h = obj;
        return undeliveredElementException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo95495D(C41114r rVar) {
        ReentrantLock reentrantLock = this.f97030g;
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
        boolean z;
        ReentrantLock reentrantLock = this.f97030g;
        reentrantLock.lock();
        try {
            if (this.f97031h == C41091b.f97000a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo95499H(boolean z) {
        ReentrantLock reentrantLock = this.f97030g;
        reentrantLock.lock();
        try {
            UndeliveredElementException O = m119173O(C41091b.f97000a);
            C41238w wVar = C41238w.f97225a;
            reentrantLock.unlock();
            super.mo95499H(z);
            if (O != null) {
                throw O;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public Object mo95503L() {
        ReentrantLock reentrantLock = this.f97030g;
        reentrantLock.lock();
        try {
            Object obj = this.f97031h;
            C41584a0 a0Var = C41091b.f97000a;
            if (obj == a0Var) {
                Object h = mo95518h();
                if (h == null) {
                    h = C41091b.f97003d;
                }
                return h;
            }
            this.f97031h = a0Var;
            C41238w wVar = C41238w.f97225a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo95516f() {
        ReentrantLock reentrantLock = this.f97030g;
        reentrantLock.lock();
        try {
            return "(value=" + this.f97031h + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo95520o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo95521p() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo95522r(Object obj) {
        C41116t v;
        ReentrantLock reentrantLock = this.f97030g;
        reentrantLock.lock();
        try {
            C41108l h = mo95518h();
            if (h != null) {
                return h;
            }
            if (this.f97031h == C41091b.f97000a) {
                do {
                    v = mo95506v();
                    if (v != null) {
                        if (v instanceof C41108l) {
                            reentrantLock.unlock();
                            return v;
                        }
                        C41536l.m120486f(v);
                    }
                } while (v.mo95509d(obj, (C41610o.C41612b) null) == null);
                C41238w wVar = C41238w.f97225a;
                reentrantLock.unlock();
                v.mo95508c(obj);
                return v.mo95548a();
            }
            UndeliveredElementException O = m119173O(obj);
            if (O == null) {
                C41584a0 a0Var = C41091b.f97001b;
                reentrantLock.unlock();
                return a0Var;
            }
            throw O;
        } finally {
            reentrantLock.unlock();
        }
    }
}
