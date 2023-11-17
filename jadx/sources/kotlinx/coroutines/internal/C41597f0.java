package kotlinx.coroutines.internal;

import ef1.C40825j2;
import kotlin.jvm.internal.C41536l;
import me1.C41752f;
import me1.C41758g;
import ue1.C43079p;

/* renamed from: kotlinx.coroutines.internal.f0 */
public final class C41597f0 implements C40825j2 {

    /* renamed from: d */
    private final Object f97792d;

    /* renamed from: e */
    private final ThreadLocal f97793e;

    /* renamed from: f */
    private final C41752f.C41757c f97794f;

    public C41597f0(Object obj, ThreadLocal threadLocal) {
        this.f97792d = obj;
        this.f97793e = threadLocal;
        this.f97794f = new C41599g0(threadLocal);
    }

    /* renamed from: R */
    public void mo95173R(C41752f fVar, Object obj) {
        this.f97793e.set(obj);
    }

    /* renamed from: U */
    public Object mo23734U(Object obj, C43079p pVar) {
        return C40825j2.C40826a.m118325a(this, obj, pVar);
    }

    /* renamed from: a0 */
    public Object mo95174a0(C41752f fVar) {
        Object obj = this.f97793e.get();
        this.f97793e.set(this.f97792d);
        return obj;
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        if (C41536l.m120484d(getKey(), cVar)) {
            return this;
        }
        return null;
    }

    public C41752f.C41757c getKey() {
        return this.f97794f;
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        return C41536l.m120484d(getKey(), cVar) ? C41758g.f98029d : this;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f97792d + ", threadLocal = " + this.f97793e + ')';
    }

    /* renamed from: u */
    public C41752f mo23741u(C41752f fVar) {
        return C40825j2.C40826a.m118326b(this, fVar);
    }
}
