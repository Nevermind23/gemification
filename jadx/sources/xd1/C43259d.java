package xd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;
import p469io.reactivex.exceptions.ProtocolViolationException;
import uh1.C43108c;
import yd1.C43358c;

/* renamed from: xd1.d */
public enum C43259d implements C43108c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m124218a(AtomicReference atomicReference) {
        C43108c cVar;
        C43108c cVar2 = (C43108c) atomicReference.get();
        C43259d dVar = CANCELLED;
        if (cVar2 == dVar || (cVar = (C43108c) atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar.cancel();
        return true;
    }

    /* renamed from: b */
    public static void m124219b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        C43108c cVar = (C43108c) atomicReference.get();
        if (cVar != null) {
            cVar.mo94357l(j);
        } else if (m124223g(j)) {
            C43358c.m124395a(atomicLong, j);
            C43108c cVar2 = (C43108c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.mo94357l(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m124220c(AtomicReference atomicReference, AtomicLong atomicLong, C43108c cVar) {
        if (!m124222f(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.mo94357l(andSet);
        return true;
    }

    /* renamed from: e */
    public static void m124221e() {
        C40293a.m116722s(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: f */
    public static boolean m124222f(AtomicReference atomicReference, C43108c cVar) {
        C41692b.m120934e(cVar, "s is null");
        if (C1612n.m5659a(atomicReference, (Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m124221e();
        return false;
    }

    /* renamed from: g */
    public static boolean m124223g(long j) {
        if (j > 0) {
            return true;
        }
        C40293a.m116722s(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: h */
    public static boolean m124224h(C43108c cVar, C43108c cVar2) {
        if (cVar2 == null) {
            C40293a.m116722s(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            m124221e();
            return false;
        }
    }

    public void cancel() {
    }

    /* renamed from: l */
    public void mo94357l(long j) {
    }
}
