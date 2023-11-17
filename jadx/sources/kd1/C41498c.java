package kd1;

import ae1.C40293a;
import androidx.lifecycle.C1612n;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;
import p469io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: kd1.c */
public enum C41498c implements C41205b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m120371a(AtomicReference atomicReference) {
        C41205b bVar;
        C41205b bVar2 = (C41205b) atomicReference.get();
        C41498c cVar = DISPOSED;
        if (bVar2 == cVar || (bVar = (C41205b) atomicReference.getAndSet(cVar)) == cVar) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.dispose();
        return true;
    }

    /* renamed from: b */
    public static boolean m120372b(C41205b bVar) {
        return bVar == DISPOSED;
    }

    /* renamed from: c */
    public static boolean m120373c(AtomicReference atomicReference, C41205b bVar) {
        C41205b bVar2;
        do {
            bVar2 = (C41205b) atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!C1612n.m5659a(atomicReference, bVar2, bVar));
        return true;
    }

    /* renamed from: e */
    public static void m120374e() {
        C40293a.m116722s(new ProtocolViolationException("Disposable already set!"));
    }

    /* renamed from: f */
    public static boolean m120375f(AtomicReference atomicReference, C41205b bVar) {
        C41205b bVar2;
        do {
            bVar2 = (C41205b) atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!C1612n.m5659a(atomicReference, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    /* renamed from: g */
    public static boolean m120376g(AtomicReference atomicReference, C41205b bVar) {
        C41692b.m120934e(bVar, "d is null");
        if (C1612n.m5659a(atomicReference, (Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m120374e();
        return false;
    }

    /* renamed from: h */
    public static boolean m120377h(AtomicReference atomicReference, C41205b bVar) {
        if (C1612n.m5659a(atomicReference, (Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    /* renamed from: l */
    public static boolean m120378l(C41205b bVar, C41205b bVar2) {
        if (bVar2 == null) {
            C40293a.m116722s(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            m120374e();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
